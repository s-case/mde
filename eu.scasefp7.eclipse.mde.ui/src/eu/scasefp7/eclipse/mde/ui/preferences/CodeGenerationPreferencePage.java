package eu.scasefp7.eclipse.mde.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import eu.scasefp7.eclipse.mde.ui.Activator;

/**
 * Sets the preferences for the MDE code generation. Overlay scoped preference store is used to allow global (workspace) preferences, 
 * or project-level preference (properties).
 * 
 * @author Marin Orlic
 */
public class CodeGenerationPreferencePage extends FieldEditorOverlayPage implements IWorkbenchPreferencePage {

	private static final String PAGE_ID = "eu.scasefp7.eclipse.mde.ui.preferencePages.CodeGenerationPreferencePage";

    /**
     * Constructs the page, sets the preference store.
     */
    public CodeGenerationPreferencePage() {
		super(GRID);
        setPreferenceStore(Activator.getDefault().getPreferenceStore());
    }
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
	    final StringFieldEditor serviceName = new StringFieldEditor(PreferenceConstants.P_SERVICE_NAME, "Web service &name:", getFieldEditorParent());
	    BooleanFieldEditor useProjectName = new BooleanFieldEditor(PreferenceConstants.P_SERVICE_NAME_USE_PROJECT_NAME, "Use project name+'Api' &for service name", getFieldEditorParent());
	    
		addField(useProjectName);
	    addField(serviceName);
		// addField(new StringFieldEditor(PreferenceConstants.P_INPUT_FILE, "&YAML file name:", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_USE_PROJECT_OUTPUT_FOLDER, "Use project's ou&tput folder", getFieldEditorParent()));
		addField(new DirectoryFieldEditor(PreferenceConstants.P_OUTPUT_PATH, "&Output path:", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_AUTO_IMPORT_GENERATED_CODE, "Import &generated project to workspace:", getFieldEditorParent()));
            
		
		addField(new ComboFieldEditor(PreferenceConstants.P_DATABASE_TYPE, "Database type:", new String[][]{{"PostgreSQL server","PostgreSQL"},{"MySQL server","MySQL"}}, getFieldEditorParent()));//$NON-NLS-2$ //$NON-NLS-4$
		addField(new StringFieldEditor(PreferenceConstants.P_DATABASE_ADDRESS, "&Database server address:", getFieldEditorParent()));
        addField(new IntegerFieldEditor(PreferenceConstants.P_DATABASE_PORT, "Database server &port:", getFieldEditorParent(), 5));
        addField(new StringFieldEditor(PreferenceConstants.P_DATABASE_USER, "Database &user name:", getFieldEditorParent()));
        addField(new StringFieldEditor(PreferenceConstants.P_DATABASE_PASSWORD, "Database pass&word:", getFieldEditorParent()));
        
		addField(new BooleanFieldEditor(PreferenceConstants.P_FACET_BASIC_AUTHENTICATION, "Add &Basic authentication", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_FACET_ABAC_AUTHORIZATION, "Add &ABAC authentication", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_FACET_SEARCH, "Add database &searching", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_FACET_EXT_COMPOSITIONS, "Add &External compositions", getFieldEditorParent()));
		
		/* This does not work since there can be only one property change listener and we get overriden by the FieldParent */
		/*
		useProjectName.setPropertyChangeListener(new IPropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                Object val = event.getNewValue();
                
                if(val instanceof Boolean) {
                    serviceName.setEnabled(!((Boolean) val), getFieldEditorParent());
                    serviceName.getTextControl(getFieldEditorParent()).setEnabled(!((Boolean) val));
                }
            }
        });
        */
	}

	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
        setDescription("MDE Code generation preferences");
	}

	/**
	 * Returns the page ID for the overlay preference/properties to work.  
	 */
    @Override
    protected String getPageId() {
        return PAGE_ID;
    }
}