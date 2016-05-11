package eu.scasefp7.eclipse.mde.ui.preferences;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import eu.scasefp7.eclipse.mde.ui.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		store.setDefault(PreferenceConstants.P_USE_PROJECT_PREFS, false);
		
		// Generate to workspace root by default
		store.setDefault(PreferenceConstants.P_OUTPUT_PATH, ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
		        //.append("MDE_output").toString()); //$NON-NLS-1$ 
		store.setDefault(PreferenceConstants.P_USE_PROJECT_OUTPUT_FOLDER, "true"); //$NON-NLS-1$
		// store.setDefault(PreferenceConstants.P_INPUT_FILE, "models/service.yml"); //$NON-NLS-1$
		store.setDefault(PreferenceConstants.P_SERVICE_NAME_USE_PROJECT_NAME, true); //$NON-NLS-1$
		store.setDefault(PreferenceConstants.P_AUTO_IMPORT_GENERATED_CODE, "true"); //$NON-NLS-1$
		store.setDefault(PreferenceConstants.P_SERVICE_NAME, "SampleService"); //$NON-NLS-1$
		
		store.setDefault(PreferenceConstants.P_DATABASE_ADDRESS, "localhost"); //$NON-NLS-1$
	    store.setDefault(PreferenceConstants.P_DATABASE_PORT, 5432); //$NON-NLS-1$
	    store.setDefault(PreferenceConstants.P_DATABASE_USER, "postgres"); //$NON-NLS-1$
	    store.setDefault(PreferenceConstants.P_DATABASE_PASSWORD, "fp7s-case"); //$NON-NLS-1$
	    store.setDefault(PreferenceConstants.P_DATABASE_TYPE, "PostgreSQL"); //$NON-NLS-1$
        
	    store.setDefault(PreferenceConstants.P_FACET_BASIC_AUTHENTICATION, false); //$NON-NLS-1$
	    store.setDefault(PreferenceConstants.P_FACET_ABAC_AUTHORIZATION, false); //$NON-NLS-1$
	    store.setDefault(PreferenceConstants.P_FACET_SEARCH, false); //$NON-NLS-1$
	    store.setDefault(PreferenceConstants.P_FACET_EXT_COMPOSITIONS, false); //$NON-NLS-1$
	}

}
