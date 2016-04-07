package eu.scasefp7.eclipse.mde.ui.preferences;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.ResourcePropertySource;
import org.eclipse.ui.views.properties.tabbed.AdvancedPropertySection;

import eu.scasefp7.eclipse.mde.ui.Activator;

public class CodeGenerationPropertySection extends AdvancedPropertySection {
	IProject project;
	
    @Override
    public void setInput(IWorkbenchPart part, ISelection selection) {
        if (selection instanceof StructuredSelection) {
            Object firstElement = ((StructuredSelection)selection).getFirstElement();
 
            if (firstElement instanceof IResource && ! (firstElement instanceof IWorkspaceRoot)) {
            	project = ((IResource)firstElement).getProject();
            	final IProject theProject = project;
                ISelection selection2 = new StructuredSelection(new ResourcePropertySource(theProject) {

                    @Override
                    public IPropertyDescriptor[] getPropertyDescriptors() {
                        ArrayList<IPropertyDescriptor>  arrayList = new ArrayList<IPropertyDescriptor>();
                        try {
							if(project.hasNature("eu.scasefp7.eclipse.core.scaseNature")) {
								PropertyDescriptor pd1 =  new PropertyDescriptor("svcname", "Web service name");
		                    	PropertyDescriptor pd2 =  new PropertyDescriptor("yamlfile", "YAML file name");
		                    	PropertyDescriptor pd3 =  new PropertyDescriptor("dbtype", "Database type");
		                    	PropertyDescriptor pd4 =  new PropertyDescriptor("dbaddress", "Database server address");
		                    	PropertyDescriptor pd5 =  new PropertyDescriptor("dbport", "Database server port");
		                    	PropertyDescriptor pd6 =  new PropertyDescriptor("dbuname", "Database user name");
		                    	PropertyDescriptor pd7 =  new PropertyDescriptor("dbpswd", "Database password");
		                    	PropertyDescriptor pd8 =  new PropertyDescriptor("basicauth", "Basic authentication");
		                    	PropertyDescriptor pd9 =  new PropertyDescriptor("abacauth", "ABAC authentication");
		                    	PropertyDescriptor pd10 =  new PropertyDescriptor("dbsearch", "Database search");
		                    	PropertyDescriptor pd11 =  new PropertyDescriptor("extcomp", "External compositions");
		                    	PropertyDescriptor pd12 =  new PropertyDescriptor("svcnamefromproj", "Use project name + 'Api' for service name");
		                    	PropertyDescriptor pd13 =  new PropertyDescriptor("useprojoutput", "Use project's output folder");
		                    	PropertyDescriptor pd14 =  new PropertyDescriptor("autoimport", "Import generated project to workspace");
		                    	PropertyDescriptor pd15 =  new PropertyDescriptor("outpath", "Output path");
			              		
			              		pd1.setCategory("Web service");
			              		pd2.setCategory("Web service");
			              		pd3.setCategory("Database");
			              		pd4.setCategory("Database");
			              		pd5.setCategory("Database");
			              		pd6.setCategory("Database");
			              		pd7.setCategory("Database");
			              		pd8.setCategory("Database");
			              		pd9.setCategory("Database");
			              		pd10.setCategory("Database");
			              		pd11.setCategory("Database");
			              		pd12.setCategory("Database");
			              		pd13.setCategory("Output");
			              		pd14.setCategory("Output");
			              		pd15.setCategory("Output");

			              		IPropertyDescriptor[] array = {pd1,pd2,pd3,pd4,pd5,pd6,pd7,pd8,pd9,pd10,pd11,pd12,pd13,pd14,pd15};
		                        arrayList.addAll(Arrays.asList(array));
							}
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

                    	
                        return arrayList.toArray(new IPropertyDescriptor[0]);
                    }

                    @Override
                    public Object getPropertyValue(Object id) {
                    	if(project.isAccessible()) {
                    		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        				    
                    		if (id.equals("outpath")) 
                    			return store.getString(PreferenceConstants.P_OUTPUT_PATH);
                    		
            				if (id.equals("svcname")) 
          				      	return store.getString(PreferenceConstants.P_SERVICE_NAME);
          				    
            				if (id.equals("yamlfile")) 
            				    return store.getString(PreferenceConstants.P_INPUT_FILE);
          				    
            				if (id.equals("dbtype")) 
          				      	return store.getString(PreferenceConstants.P_DATABASE_TYPE);
            				
            				if (id.equals("dbaddress")) 
          				      	return store.getString(PreferenceConstants.P_DATABASE_ADDRESS);
            				
            				if (id.equals("dbport")) 
          				      	return store.getString(PreferenceConstants.P_DATABASE_PORT);
            				
            				if (id.equals("dbuname")) 
          				      	return store.getString(PreferenceConstants.P_DATABASE_USER);
            				
            				if (id.equals("dbpswd")) 
          				      	return store.getString(PreferenceConstants.P_DATABASE_PASSWORD);
            				
            				if (id.equals("basicauth")) 
            					return store.getBoolean(PreferenceConstants.P_FACET_BASIC_AUTHENTICATION) ? "yes" : "no";
              				
              				if (id.equals("abacauth")) 
              					return store.getBoolean(PreferenceConstants.P_FACET_ABAC_AUTHORIZATION) ? "yes" : "no";
              				
              				if (id.equals("dbsearch"))   
              					return store.getBoolean(PreferenceConstants.P_FACET_SEARCH) ? "yes" : "no";
              				
              				if (id.equals("extcomp")) 
            				    return store.getBoolean(PreferenceConstants.P_FACET_EXT_COMPOSITIONS) ? "yes" : "no";
              				
              				if (id.equals("svcnamefromproj")) 
              					return store.getBoolean(PreferenceConstants.P_SERVICE_NAME_USE_PROJECT_NAME) ? "yes" : "no";
              				
              				if (id.equals("useprojoutput"))   
              					return store.getBoolean(PreferenceConstants.P_USE_PROJECT_OUTPUT_FOLDER) ? "yes" : "no";
              				
              				if (id.equals("autoimport")) 
            				    return store.getBoolean(PreferenceConstants.P_AUTO_IMPORT_GENERATED_CODE) ? "yes" : "no";
                    	}
						return super.getPropertyValue(id);	
                    }

                });
                super.setInput(part, selection2); 
            } else {
                super.setInput(part, selection);
            }
        }
    }

}