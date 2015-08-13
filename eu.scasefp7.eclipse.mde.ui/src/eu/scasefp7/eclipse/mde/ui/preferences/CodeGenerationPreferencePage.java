package eu.scasefp7.eclipse.mde.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import eu.scasefp7.eclipse.mde.ui.Activator;

/**
 * 
 */

public class CodeGenerationPreferencePage extends FieldEditorOverlayPage implements IWorkbenchPreferencePage {

	private static final String PAGE_ID = "eu.scasefp7.eclipse.mde.ui.preferencePages.CodeGenerationPreferencePage";

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
		addField(new StringFieldEditor(PreferenceConstants.P_SERVICE_NAME, "Web service &name:", getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.P_INPUT_FILE, "&YAML file name:", getFieldEditorParent()));
		addField(new DirectoryFieldEditor(PreferenceConstants.P_OUTPUT_PATH, "&Output path:", getFieldEditorParent()));

		addField(new StringFieldEditor(PreferenceConstants.P_DATABASE_ADDRESS, "&Database server address:", getFieldEditorParent()));
        addField(new IntegerFieldEditor(PreferenceConstants.P_DATABASE_PORT, "Database server &port:", getFieldEditorParent(), 5));
        addField(new StringFieldEditor(PreferenceConstants.P_DATABASE_USER, "Database &user name:", getFieldEditorParent()));
        addField(new StringFieldEditor(PreferenceConstants.P_DATABASE_PASSWORD, "Database pass&word:", getFieldEditorParent()));
        
		addField(new BooleanFieldEditor(PreferenceConstants.P_FACET_BASIC_AUTHENTICATION, "Add &Basic authentication", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_FACET_ABAC_AUTHORIZATION, "Add &ABAC authentication", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_FACET_SEARCH, "Add database &searching", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_FACET_EXT_COMPOSITIONS, "Add &External compositions", getFieldEditorParent()));
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