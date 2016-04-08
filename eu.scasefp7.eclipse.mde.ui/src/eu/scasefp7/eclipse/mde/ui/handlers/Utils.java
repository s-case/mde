package eu.scasefp7.eclipse.mde.ui.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import eu.scasefp7.eclipse.mde.ui.Activator;
import eu.scasefp7.eclipse.mde.ui.preferences.PreferenceConstants;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;

/**
 * Utility class for code generation.
 * 
 * @author Marin Orlic
 */
public class Utils 
{
    /**
     * Fills in the code generation preferences from project properties. 
     * 
     * @param project to load the preferences for.
     * @return the preference map, keys are based on command parameter names.
     */
    public static Map<String, String> getCoreMDEPreferences(IProject project) {

        IPreferenceStore store = getPreferenceStore(project);
        Map<String, String> codegenPreferences = new HashMap<String, String>();

        // Get preferences
        String modelsFolderLocation = null;
        try {
            modelsFolderLocation = project.getPersistentProperty(new QualifiedName("",
                    "eu.scasefp7.eclipse.core.ui.modelsFolder"));
        } catch (CoreException e) {
            Activator.log("Error retrieving project property (models folder location)", e);
        }
        IContainer container = project;
        if (modelsFolderLocation != null) {
            IResource models = project.findMember(new Path(modelsFolderLocation)); 
            if (models != null && models.exists())
                container = (IContainer) project.findMember(new Path(modelsFolderLocation));
        }
        IFile file = container.getFile(new Path("service.yml"));
        String yamlFilePath = file.getLocation().toPortableString();
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
        String importMaven = (store.getBoolean(PreferenceConstants.P_AUTO_IMPORT_GENERATED_CODE) ? "yes" : "no");

        // Figure out service name
        Boolean useProjectName = (store.getBoolean(PreferenceConstants.P_SERVICE_NAME_USE_PROJECT_NAME));
        if (useProjectName) {
            wsName = project.getName() + "Api";
        }

        // Figure out output folder
        Boolean useProjectOutputFolder = (store.getBoolean(PreferenceConstants.P_USE_PROJECT_OUTPUT_FOLDER));
        if (useProjectOutputFolder) {
            String out = null;
            try {
                out = project.getPersistentProperty(new QualifiedName("", "eu.scasefp7.eclipse.core.ui.outputFolder"));
            } catch (CoreException e) {
                Activator.log("Unable to get project property.", e);
            } finally {
                if (out != null) {
                    IResource res = project.findMember(out); // Search in project first
                    if (res == null) {
                        res = project.getWorkspace().getRoot().findMember(out); // If not found in project, look in
                                                                                // workspace
                    }
                    if (res != null) {
                        outputFolder = res.getLocation().toPortableString();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Project output path \"");
                        sb.append(out);
                        sb.append("\" not found, using default \"");
                        sb.append(outputFolder);
                        sb.append(".");
                        Activator.log(sb.toString(), new Exception());
                    }
                }
            }
        }

        codegenPreferences.put("YamlFilePath", yamlFilePath);
        codegenPreferences.put("WebServiceName", wsName);
        codegenPreferences.put("MDEOutputFolder", outputFolder);
        codegenPreferences.put("DatabaseIP", dbAddress);
        codegenPreferences.put("DatabasePort", dbPort);
        codegenPreferences.put("DatabaseUsername", dbUsername);
        codegenPreferences.put("DatabasePassword", dbPassword);
        codegenPreferences.put("DatabaseType", dbType);
        codegenPreferences.put("Authentication", authentication);
        codegenPreferences.put("Authorization", authorization);
        codegenPreferences.put("DatabaseSearching", searching);
        codegenPreferences.put("ExternalComposition", extComposition);
        codegenPreferences.put("ImportGeneratedProject", importMaven);

        return codegenPreferences;
    }

    private static IPreferenceStore getPreferenceStore(IProject project) {
        // Get a preference store with the search path project, instance
        ProjectScope ps = new ProjectScope(project);
        ScopedPreferenceStore scoped = new ScopedPreferenceStore(ps, Activator.PLUGIN_ID);
        scoped.setSearchContexts(new IScopeContext[] { ps, InstanceScope.INSTANCE });

        return scoped;
    }

}
