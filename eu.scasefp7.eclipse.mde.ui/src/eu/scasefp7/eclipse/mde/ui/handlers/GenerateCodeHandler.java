/**
 * Copyright 2015 S-CASE Consortium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.scasefp7.eclipse.mde.ui.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.Parameterization;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.ui.progress.WorkbenchJob;
import org.eclipse.ui.services.IServiceLocator;

import eu.scasefp7.eclipse.mde.ui.Activator;
import eu.scasefp7.eclipse.mde.ui.preferences.PreferenceConstants;

/**
 * @author emaorli
 *
 */
public class GenerateCodeHandler extends AbstractHandler {

    // Command IDs
    // Ontology
    private static final String CMD_STATIC = "eu.scasefp7.eclipse.core.commands.compileStaticRequirements"; //$NON-NLS-1$
    private static final String CMD_DYNAMIC = "eu.scasefp7.eclipse.core.commands.compileDynamicRequirements"; //$NON-NLS-1$
    private static final String CMD_LINK = "eu.scasefp7.eclipse.core.commands.linkOntologies"; //$NON-NLS-1$
    private static final String CMD_YAML = "eu.scasefp7.eclipse.core.commands.exportToYaml"; //$NON-NLS-1$
    
    // MDE
    private static final String CMD_CIMGEN = "eu.scasefp7.eclipse.mde.cimgen.commands.CIMGeneratorCommand"; //$NON-NLS-1$
    private static final String CMD_M2M = "eu.scasefp7.eclipse.mde.m2m.commands.ExecuteModelToModelTransformations"; //$NON-NLS-1$
    private static final String CMD_ANN = "AnnotationStackPopulator.commands.PopulateAnnotationStack"; //$NON-NLS-1$
    private static final String CMD_M2T = "eu.scasefp7.eclipse.mde.m2t.commands.executeModelToTextTransformation"; //$NON-NLS-1$
    
    // Maven import
    private static final String CMD_IMPORT = "eu.scasefp7.eclipse.mde.ui.commands.importMavenProject"; //$NON-NLS-1$
    
    private static final String CMD_PAR_RELOAD = "eu.scasefp7.eclipse.mde.ui.generateCode.reload"; //$NON-NLS-1$
    
    private static final String CANCEL_EX_CLASSNAME = "CanceledExecutionException"; //$NON-NLS-1$
    
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

        // Get the currently selected project
        IResource resource = extractSelection(HandlerUtil.getCurrentSelection(event));
        if(resource == null) {
            return null;
        }
        
        IProject project = resource.getProject();
        if(project == null) {
            return null;
        }
        
        // Get the preferences
        Map<String, String> mdePreferences = getCoreMDEPreferences(project, event.getParameters());

        // Roll the commands
        IServiceLocator serviceLocator = PlatformUI.getWorkbench();
        ICommandService commandService = (ICommandService) serviceLocator.getService(ICommandService.class);
        IHandlerService handlerService = (IHandlerService) serviceLocator.getService(IHandlerService.class);

        try {
            Command commandCIM = commandService.getCommand(CMD_CIMGEN);
            Command commandM2M = commandService.getCommand(CMD_M2M);
            Command commandANN = commandService.getCommand(CMD_ANN);
            Command commandM2T = commandService.getCommand(CMD_M2T);
            
            Command commandImport = commandService.getCommand(CMD_IMPORT);

            ArrayList<Parameterization> params = new ArrayList<Parameterization>();
            for(Map.Entry<String, String> entry : mdePreferences.entrySet()) {
                IParameter p = commandCIM.getParameter(entry.getKey());
                if(p != null) {
                    Parameterization param = new Parameterization(p, entry.getValue());
                    params.add(param);
                } else {
                    System.out.println("Cannot find parameter: " + entry.getKey() + " of command " + commandCIM);
                }
            }
             
            ArrayList<Parameterization> paramsImport = new ArrayList<Parameterization>();
            for(Map.Entry<String, String> entry : mdePreferences.entrySet()) {
                IParameter p = commandImport.getParameter(entry.getKey());
                if(p != null) {
                    Parameterization param = new Parameterization(p, entry.getValue());
                    paramsImport.add(param);
                } else {
                    System.out.println("Cannot find parameter: " + entry.getKey() + " of command " + commandImport);
                }
            }
            
            // MDE commands
            ParameterizedCommand parametrizedCommandCIM = new ParameterizedCommand(commandCIM, params.toArray(new Parameterization[params.size()]));
            ParameterizedCommand parametrizedCommandM2M = new ParameterizedCommand(commandM2M, params.toArray(new Parameterization[params.size()]));
            ParameterizedCommand parametrizedCommandANN = new ParameterizedCommand(commandANN, params.toArray(new Parameterization[params.size()]));
            ParameterizedCommand parametrizedCommandM2T = new ParameterizedCommand(commandM2T, params.toArray(new Parameterization[params.size()]));

            ParameterizedCommand parametrizedCommandImport = new ParameterizedCommand(commandImport, paramsImport.toArray(new Parameterization[paramsImport.size()]));
            
            WorkspaceJob job = new WorkspaceJob("Generating code for " + mdePreferences.get("WebServiceName")) { //TODO
                @Override
                public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
                    monitor.beginTask(this.getName(), 9);
                    IProgressMonitor pm = Job.getJobManager().createProgressGroup();
                    
                    // Setup ontology compile job
                    Job jOnto = new WorkbenchJob("Generating ontology") {
                        @Override
                        public IStatus runInUIThread(IProgressMonitor monitor) {
                            monitor.beginTask("Preparing the ontology", 4);
                            
                            if(monitor.isCanceled()) {
                                return Status.CANCEL_STATUS;
                            }
                            
                            try {
                                handlerService.executeCommand(CMD_STATIC, null);
                                handlerService.executeCommand(CMD_DYNAMIC, null);
                                handlerService.executeCommand(CMD_LINK, null);
                                handlerService.executeCommand(CMD_YAML, null);
                            } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
                                if(e.getCause().getClass().getName().endsWith(CANCEL_EX_CLASSNAME)) {
                                    return Status.CANCEL_STATUS;
                                } else {
                                    Activator.log("Failed to compile to ontology and create YAML.", e);
                                    return new Status(Status.ERROR, Activator.PLUGIN_ID, "Failed to prepare the specification.", e);
                                }
                            } finally {
                                monitor.done();
                            }
                            return Status.OK_STATUS;
                        }  
                    };           
                    
                    // Setup CIM job
                    Job jCim = new WorkbenchJob("Generating CIM") {
                        @Override
                        public IStatus runInUIThread(IProgressMonitor monitor) {
                            monitor.beginTask("Preparing the specification", 1);
                            
                            if(monitor.isCanceled()) {
                                return Status.CANCEL_STATUS;
                            }
                            
                            try {
                                handlerService.executeCommand(parametrizedCommandCIM, null);
                            } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
                                if(e.getCause().getClass().getName().endsWith(CANCEL_EX_CLASSNAME)) {
                                    return Status.CANCEL_STATUS;
                                } else {
                                    Activator.log("Failed to execute CIM generator.", e);
                                    return new Status(Status.ERROR, Activator.PLUGIN_ID, "Failed to prepare the specification.", e);
                                }
                            } finally {
                                monitor.done();
                            }
                            return Status.OK_STATUS;
                        }  
                    };                        
                                            
                    // Setup M2M job
                    Job jM2M = new WorkspaceJob("Generating models") {                            
                        @Override
                        public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
                            monitor.beginTask("Preparing the models", 1);
                    
                            if(monitor.isCanceled()) {
                                return Status.CANCEL_STATUS;
                            }
                            
                            try {
                                handlerService.executeCommand(parametrizedCommandM2M, null);
                            } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
                                Activator.log("Failed to execute M2M transformation.", e);
                                return new Status(Status.ERROR, Activator.PLUGIN_ID, "Failed to generate models.", e);
                            } finally {
                                monitor.done();
                            }
                            return Status.OK_STATUS;
                        }  
                    };
                    
                    // Setup annotations job
                    Job jAnn = new WorkspaceJob("Generating annotations") {                            
                        @Override
                        public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
                            monitor.beginTask("Preparing the annotations", 1);
                            
                            if(monitor.isCanceled()) {
                                return Status.CANCEL_STATUS;
                            }
                            
                            try {
                                handlerService.executeCommand(parametrizedCommandANN, null);
                            } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
                                Activator.log("Failed to execute annotator.", e);
                                return new Status(Status.ERROR, Activator.PLUGIN_ID, "Failed to generate annotations.", e);
                            } finally {
                                monitor.done();
                            }
                            return Status.OK_STATUS;
                        }  
                    };
                                            
                    // Setup annotations job
                    Job jM2T = new WorkspaceJob("Generating code") {                            
                        @Override
                        public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
                            monitor.beginTask("Preparing code generation", 1);
                            
                            if(monitor.isCanceled()) {
                                return Status.CANCEL_STATUS;
                            }
                            
                            try {
                                handlerService.executeCommand(parametrizedCommandM2T, null);
                            } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
                                Activator.log("Failed to execute M2T generator.", e);
                                return new Status(Status.ERROR, Activator.PLUGIN_ID, "Failed to generate code.", e);
                            } finally {
                                monitor.done();
                            }
                            return Status.OK_STATUS;
                        }  
                    };

                    try {   
                        pm.beginTask("Generating code for " + mdePreferences.get("WebServiceName"), 503);
                        pm.worked(1);
                        
                        jOnto.setRule(project);
                        jOnto.setProgressGroup(pm, 100);
                        jOnto.schedule();
                        
                        jOnto.join();
                        monitor.worked(1);
                        
                        // Need to have ontology before continuing
                        if(jOnto.getResult().isOK()) {
                            jCim.setRule(project);
                            jCim.setProgressGroup(pm, 100);
                            jCim.schedule();                        
    
                            jCim.join();
                            monitor.worked(1);
                            
                            // Check if CIM wizard is cancelled
                            if(jCim.getResult().isOK()) {
                                jM2M.setRule(project);
                                jM2M.setProgressGroup(pm, 100);
                                jM2M.schedule();                        
        
                                jAnn.setRule(project);
                                jAnn.setProgressGroup(pm, 100);
                                jAnn.schedule();                        
        
                                jM2T.setRule(project);
                                jM2T.setProgressGroup(pm, 100);
                                jM2T.schedule();                        
        
                               
                                jM2M.join();
                                monitor.worked(1);
                                jAnn.join();
                                monitor.worked(1);
                                jM2T.join();
                                monitor.worked(1);
                            } else {
                                jM2M.cancel();
                                jAnn.cancel();
                                jM2T.cancel();
                            }
                        
                            IStatus result = jM2T.getResult();
                            String shouldRun = mdePreferences.get("ImportGeneratedProject");
                            
                            if(result != null 
                                    && result.isOK() 
                                    && shouldRun != null 
                                    && shouldRun.equals("yes")) {
                                monitor.beginTask("Importing generated project", 1);
                                try {
                                    handlerService.executeCommand(parametrizedCommandImport, null);
                                } catch (ExecutionException | NotDefinedException | NotEnabledException
                                        | NotHandledException e) {
                                    Activator.log("Failed to import generated Maven project.", e);
                                    return new Status(Status.ERROR, Activator.PLUGIN_ID, "Failed to import generated project.", e);
                                } finally {
                                    monitor.worked(1);
                                }
                            }
                        }
                        
                        pm.worked(1);
                    } catch(InterruptedException e) {
                        return Status.CANCEL_STATUS;
                    } finally {
                        pm.done();
                    }
                    
                    monitor.done();
                    return Status.OK_STATUS;                        
                }
            };

            job.schedule();

        } catch (NotDefinedException e) {
            Activator.log("Failed to find commands needed to generate code.", e);
        }
        
        return null;
    }
    
    /**
     * Get the resource from the current selection.
     * @param selection
     * @return selected IResource
     */
    private IResource extractSelection(ISelection sel) {
        if (sel instanceof IStructuredSelection) {
            IStructuredSelection ss = (IStructuredSelection) sel;
            Object element = ss.getFirstElement();
            if (element instanceof IResource) {
               return (IResource) element;
            }
            if (element instanceof IAdaptable) {  
                IAdaptable adaptable = (IAdaptable)element;
                IResource adapter = (IResource) adaptable.getAdapter(IResource.class);
        
                return adapter;
            }
        }
        return null;
    }
    
    private IPreferenceStore getPreferenceStore(IProject project) {
        // Get a preference store with the search path project, instance
        ProjectScope ps = new ProjectScope(project);
        ScopedPreferenceStore scoped = new ScopedPreferenceStore(ps, Activator.PLUGIN_ID);
        scoped.setSearchContexts(new IScopeContext[] { ps, InstanceScope.INSTANCE });
        
        return scoped;
    }
    
    private Map<String, String> getCoreMDEPreferences(IProject project, Map commandParams) {

        IPreferenceStore store = getPreferenceStore(project);
        Map<String, String> mapMDEPreferences = new HashMap<String, String>();

        // Get preferences
        String yamlFilePath = project.getFile(store.getString(PreferenceConstants.P_INPUT_FILE)).getLocation().toString();
        String wsName = store.getString(PreferenceConstants.P_SERVICE_NAME);
        String outputFolder = store.getString(PreferenceConstants.P_OUTPUT_PATH);
        String dbAddress = store.getString(PreferenceConstants.P_DATABASE_ADDRESS);
        String dbPort = store.getString(PreferenceConstants.P_DATABASE_PORT);
        String dbUsername = store.getString(PreferenceConstants.P_DATABASE_USER);
        String dbPassword = store.getString(PreferenceConstants.P_DATABASE_PASSWORD);
        String dbType = store.getString(PreferenceConstants.P_DATABASE_TYPE);
        String authentication = (store.getBoolean(PreferenceConstants.P_FACET_BASIC_AUTHENTICATION) ? "yes" : "no");
        String authorization = (store.getBoolean(PreferenceConstants.P_FACET_ABAC_AUTHORIZATION) ? "yes" : "no");
        String searching = (store.getBoolean(PreferenceConstants.P_FACET_SEARCH) ? "yes" : "no");
        String extComposition = (store.getBoolean(PreferenceConstants.P_FACET_EXT_COMPOSITIONS) ? "yes" : "no");
        String reloadModels = (commandParams.get(GenerateCodeHandler.CMD_PAR_RELOAD) == null) ? "no" 
                : ((String) commandParams.get(GenerateCodeHandler.CMD_PAR_RELOAD)).equalsIgnoreCase("yes") ? "yes" : "no";
        String importMaven = (store.getBoolean(PreferenceConstants.P_AUTO_IMPORT_GENERATED_CODE) ? "yes" : "no");
        
        mapMDEPreferences.put("YamlFilePath", yamlFilePath); 
        mapMDEPreferences.put("WebServiceName", wsName);
        mapMDEPreferences.put("MDEOutputFolder", outputFolder);
        mapMDEPreferences.put("DatabaseIP", dbAddress);
        mapMDEPreferences.put("DatabasePort", dbPort);
        mapMDEPreferences.put("DatabaseUsername", dbUsername);
        mapMDEPreferences.put("DatabasePassword", dbPassword);
        mapMDEPreferences.put("DatabaseType", dbType);
        mapMDEPreferences.put("Authentication", authentication);
        mapMDEPreferences.put("Authorization", authorization);
        mapMDEPreferences.put("DatabaseSearching", searching);
        mapMDEPreferences.put("ExternalComposition", extComposition);
        mapMDEPreferences.put("ReloadExistingModels", reloadModels);
        mapMDEPreferences.put("ImportGeneratedProject", importMaven);
        
        return mapMDEPreferences;
    }
    
}
