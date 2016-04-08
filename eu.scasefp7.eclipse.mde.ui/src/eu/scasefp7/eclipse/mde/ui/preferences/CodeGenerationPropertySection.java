package eu.scasefp7.eclipse.mde.ui.preferences;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AdvancedPropertySection;

/**
 * Provides project code generation properties to properties view. 
 * 
 * @author Leonora Gaspar
 * @author Marin Orlic
 */
public class CodeGenerationPropertySection extends AdvancedPropertySection {
   
    @Override
    public void setInput(IWorkbenchPart part, ISelection selection) {
        
        if (selection instanceof IStructuredSelection) {
            @SuppressWarnings("unchecked")
            List<Object> list = ((StructuredSelection)selection).toList();
            IProject project = getProjectOfSelectionList(list);
                        
            if(project != null) {
                ISelection newSelection = new StructuredSelection(new CodeGenerationPropertySource(project));
                super.setInput(part, newSelection); 
            } else {
                super.setInput(part, selection);
            }
        }
    }
    
    /********************* COPIED FROM S-CASE CORE REMOVE WHEN DEPS ARE ADDED ****************************/
    /**
     * Returns the project that the selected resource(s) belong to.
     * 
     * @param selectionList the selected resource(s).
     * @return the project that the selected resource(s) belong to.
     */
    public static IProject getProjectOfSelectionList(List<Object> selectionList) {
        IProject project = null;
        for (Object object : selectionList) {
            IProject theproject = getProjectOfSelectionElement(object);
            if (theproject != null) {
                if (project == null) {
                    project = theproject;
                } else {
                    if (!project.equals(theproject)) {
                        return null;
                    }
                }
            }
        }
        return project;
    }

    /**
     * Returns the project that the selected resource belongs to.
     * 
     * @param element the selected resource.
     * @return the project that the selected resources belong to.
     */
    public static IProject getProjectOfSelectionElement(Object element) {
        IProject project = null;
        IResource resource = (IResource) Platform.getAdapterManager().getAdapter(element, IResource.class);
        if (resource != null) {
            project = resource.getProject();
        } else {
            project = (IProject) Platform.getAdapterManager().getAdapter(element, IProject.class);
        }
        return project;
    }
}