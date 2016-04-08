package eu.scasefp7.eclipse.mde.ui.preferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.ResourcePropertySource;

import eu.scasefp7.eclipse.mde.ui.Activator;
import eu.scasefp7.eclipse.mde.ui.handlers.Utils;

class CodeGenerationPropertySource extends ResourcePropertySource {
    
    private IProject project = null;
    private Map<String, String> prefs = null;

    /**
     * Constructs the property source.
     * 
     * @param project to show the properties for.
     */
    public CodeGenerationPropertySource(IProject project) {
        super(project);
        this.project = project;
    }

    @Override
    public IPropertyDescriptor[] getPropertyDescriptors() {
        ArrayList<IPropertyDescriptor>  arrayList = new ArrayList<IPropertyDescriptor>();
        try {
    		if(this.project.isAccessible() && this.project.hasNature("eu.scasefp7.eclipse.core.scaseNature")) {
    		    prefs = Utils.getCoreMDEPreferences(this.project);
    		     	        
    			PropertyDescriptor pd1 =  new PropertyDescriptor(PreferenceConstants.C_SERVICE_NAME, "Web service name");
            	PropertyDescriptor pd2 =  new PropertyDescriptor(PreferenceConstants.C_INPUT_FILE, "YAML file name");
            	pd1.setCategory("Web service");
            	pd2.setCategory("Web service");
                
                PropertyDescriptor pd3 =  new PropertyDescriptor(PreferenceConstants.C_FACET_BASIC_AUTHENTICATION, "Basic authentication");
                PropertyDescriptor pd4 =  new PropertyDescriptor(PreferenceConstants.C_FACET_ABAC_AUTHORIZATION, "ABAC authorization");
                PropertyDescriptor pd5 =  new PropertyDescriptor(PreferenceConstants.C_FACET_SEARCH, "Database search");
                PropertyDescriptor pd6 =  new PropertyDescriptor(PreferenceConstants.C_FACET_EXT_COMPOSITIONS, "External compositions");
                pd3.setCategory("Features");
                pd4.setCategory("Features");
                pd5.setCategory("Features");
                pd6.setCategory("Features");

            	PropertyDescriptor pd7 =  new PropertyDescriptor(PreferenceConstants.C_DATABASE_TYPE, "Database type");
            	PropertyDescriptor pd8 =  new PropertyDescriptor(PreferenceConstants.C_DATABASE_ADDRESS, "Database server address");
            	PropertyDescriptor pd9 =  new PropertyDescriptor(PreferenceConstants.C_DATABASE_PORT, "Database server port");
            	PropertyDescriptor pd10 =  new PropertyDescriptor(PreferenceConstants.C_DATABASE_USER, "Database user name");
            	PropertyDescriptor pd11 =  new PropertyDescriptor(PreferenceConstants.C_DATABASE_PASSWORD, "Database password");
            	pd7.setCategory("Database");
                pd8.setCategory("Database");
                pd9.setCategory("Database");
                pd10.setCategory("Database");
                pd11.setCategory("Database");
                
            	PropertyDescriptor pd12 =  new PropertyDescriptor(PreferenceConstants.C_AUTO_IMPORT_GENERATED_CODE, "Import generated project to workspace");
            	PropertyDescriptor pd13 =  new PropertyDescriptor(PreferenceConstants.C_OUTPUT_PATH, "Output path");
            	pd12.setCategory("Output");
                pd13.setCategory("Output");

          		IPropertyDescriptor[] array = {pd1,pd2,pd3,pd4,pd5,pd6,pd7,pd8,pd9,pd10,pd11,pd12,pd13};
                arrayList.addAll(Arrays.asList(array));
    		}
    	} catch (CoreException e) {
    		Activator.log("Unable to create property descriptors.", e);
    	}

        return arrayList.toArray(new IPropertyDescriptor[0]);
    }

    @Override
    public Object getPropertyValue(Object id) {
    	if(this.project.isAccessible() && this.prefs != null) {
    		return this.prefs.get((String) id);
    	}
    	return super.getPropertyValue(id);	
    }
}