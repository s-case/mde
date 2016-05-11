package eu.scasefp7.eclipse.mde.ui.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.maven.model.Model;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.IProjectConfigurationManager;
import org.eclipse.m2e.core.project.MavenProjectInfo;
import org.eclipse.m2e.core.project.ProjectImportConfiguration;

import eu.scasefp7.eclipse.mde.ui.Activator;


/**
 * Import generated maven project into Eclipse workspace using M2E.
 * 
 * @author Leonora Gaspar
 * @author Marin Orlic
 */
public class ImportMavenProjectHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {	
	    // Find the pom.xml file
	    String mdeFolder = event.getParameter("MDEOutputFolder"); //$NON-NLS-1$
        String serviceName = event.getParameter("WebServiceName"); //$NON-NLS-1$

        if(mdeFolder == null || serviceName == null) {
            throw new ExecutionException("Unable to find generated project.");
        }
        
        String mdeOutput = mdeFolder + "/MDEGeneratedCode/"; //$NON-NLS-1$
	    String pomFilename = mdeOutput + serviceName + "/pom.xml"; //$NON-NLS-1$
	    
	    WorkspaceJob job = new WorkspaceJob("Importing generated code for " + serviceName) {
            @Override
            public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
                monitor.beginTask(this.getName(), 1);
                
                if(monitor.isCanceled()) {
                    return Status.CANCEL_STATUS;
                }
                        
                try {
                    File pomFile = new File(pomFilename);
                    if(!pomFile.exists()) {
                        return new Status(Status.ERROR, Activator.PLUGIN_ID, "Unable to find Maven project.");
                    }
                                        
                    Model model  = new Model(); 
                    ProjectImportConfiguration config    = new ProjectImportConfiguration();
                    Collection<MavenProjectInfo> infos   = new ArrayList<MavenProjectInfo>();
                    IProjectConfigurationManager manager = MavenPlugin.getProjectConfigurationManager();
                    
                    String version = "1.0-SNAPSHOT"; //$NON-NLS-1$ // Defined in M2T
                    String groupId = "scase-auto-generated"; //$NON-NLS-1$ // Defined in M2T
                    String artifactId  = serviceName;
                    String projectName = serviceName;
                    
                    model.setGroupId(groupId);
                    model.setArtifactId(artifactId);
                    model.setVersion(version);
                    model.setPomFile(pomFile);
                    
                    MavenProjectInfo info = new MavenProjectInfo(projectName, pomFile, model, null);
                    infos.add(info);
                    manager.importProjects(infos, config , monitor);
                } catch (CoreException e) {
                    Activator.log("Import maven project command failed.", e);
                    return new Status(Status.ERROR, Activator.PLUGIN_ID, "Failed to import Maven project.", e);
                } finally {
                    monitor.done();
                }
                return Status.OK_STATUS;
            }  
	    };           
	    
	    job.schedule();
	    return null;
	}

}
