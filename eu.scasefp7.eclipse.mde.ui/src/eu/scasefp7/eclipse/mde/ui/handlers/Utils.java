package eu.scasefp7.eclipse.mde.ui.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import eu.scasefp7.eclipse.core.builder.ProjectUtils;
import eu.scasefp7.eclipse.mde.ui.Activator;
import eu.scasefp7.eclipse.mde.ui.preferences.PreferenceConstants;

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
        IContainer container = ProjectUtils.getProjectModelsFolder(project);

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
        String dbMigration = (store.getBoolean(PreferenceConstants.P_DATABASE_MIGRATION) ? "yes" : "no");

        // Figure out service name
        Boolean useProjectName = (store.getBoolean(PreferenceConstants.P_SERVICE_NAME_USE_PROJECT_NAME));
        if (useProjectName) {
            wsName = project.getName() + "Service";
        }

        // Figure out output folder
        Boolean useProjectOutputFolder = (store.getBoolean(PreferenceConstants.P_USE_PROJECT_OUTPUT_FOLDER));
        if (useProjectOutputFolder) {
            IContainer folder = ProjectUtils.getProjectOutputFolder(project);
            if (folder != null) {
                outputFolder = folder.getLocation().toPortableString();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Project \"").append(project.getName()).append("\" output path not found, using default \"");
                sb.append(outputFolder).append("\".");
                Activator.log(sb.toString(), new Exception());
            }
        }

        codegenPreferences.put(PreferenceConstants.C_INPUT_FILE, yamlFilePath);
        codegenPreferences.put(PreferenceConstants.C_SERVICE_NAME, wsName);
        codegenPreferences.put(PreferenceConstants.C_OUTPUT_PATH, outputFolder);
        codegenPreferences.put(PreferenceConstants.C_DATABASE_ADDRESS, dbAddress);
        codegenPreferences.put(PreferenceConstants.C_DATABASE_PORT, dbPort);
        codegenPreferences.put(PreferenceConstants.C_DATABASE_USER, dbUsername);
        codegenPreferences.put(PreferenceConstants.C_DATABASE_PASSWORD, dbPassword);
        codegenPreferences.put(PreferenceConstants.C_DATABASE_TYPE, dbType);
        codegenPreferences.put(PreferenceConstants.C_FACET_BASIC_AUTHENTICATION, authentication);
        codegenPreferences.put(PreferenceConstants.C_FACET_ABAC_AUTHORIZATION, authorization);
        codegenPreferences.put(PreferenceConstants.C_FACET_SEARCH, searching);
        codegenPreferences.put(PreferenceConstants.C_FACET_EXT_COMPOSITIONS, extComposition);
        codegenPreferences.put(PreferenceConstants.C_AUTO_IMPORT_GENERATED_CODE, importMaven);
        codegenPreferences.put(PreferenceConstants.C_DATABASE_MIGRATION, dbMigration);

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
