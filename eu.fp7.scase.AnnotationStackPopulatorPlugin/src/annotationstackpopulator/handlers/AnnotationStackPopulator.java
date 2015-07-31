package annotationstackpopulator.handlers;

import AnnotationLayerStack.AnnotationStack;
import AnnotationLayerStack.AnnotationLayerStackFactory;
import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import SearchLayerPSM.SearchLayerPSMPackage;
import ServicePSM.RESTfulServicePSM;
import ServicePSM.ServicePSMPackage;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class AnnotationStackPopulator extends AbstractHandler {
	
	private RESTfulServicePSM oRESTfulServicePSM;
	private AuthenticationLayerPSM.AnnotationModel oAuthenticationLayerPSM;
	private SearchLayerPSM.AnnotationModel oSearchLayerPSM;
	private AnnotationStack oAnnotationStack;
	private String strOutputFolder;
	private String strProjectName;
	private static MessageConsole myConsole = findConsole("SCASE-UI");
	private static MessageConsoleStream out = myConsole.newMessageStream();
	
	/**
	 * The constructor.
	 */
	public AnnotationStackPopulator() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		this.strOutputFolder = event.getParameter("MDEOutputFolder");
		this.strProjectName  = event.getParameter("WebServiceName");
		
		
		//create new Annotation Layer Stack
		AnnotationLayerStackFactory oAnnotationLayerStackFactory = AnnotationLayerStackFactory.eINSTANCE;
		oAnnotationStack = oAnnotationLayerStackFactory.createAnnotationStack();
		
		//load the core PSM of the RESTful service to be produced

		oRESTfulServicePSM = loadCorePSM(event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "PSM.xmi");
		oAnnotationStack.setHasCorePSM(oRESTfulServicePSM);

		//if there is an authentication layer to load, load it
		
		if(event.getParameter("Authentication").equalsIgnoreCase("yes")){
			oAuthenticationLayerPSM = loadAuthenticationPSM(event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "AuthenticationPSM.xmi");
			oAnnotationStack.setBHasAuthenticationAnnotation(true);
			oAnnotationStack.setHasAuthenticationLayer(oAuthenticationLayerPSM);
		}
		else{
			oAnnotationStack.setBHasAuthenticationAnnotation(false);
		}
		
		if(event.getParameter("DatabaseSearching").equalsIgnoreCase("yes")){
			oSearchLayerPSM = loadSearchLayerPSM(event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "SearchLayerPSM.xmi");
			oAnnotationStack.setBHasSearchLayer(true);
			oAnnotationStack.setHasSearchLayer(oSearchLayerPSM);
		}
		else{
			oAnnotationStack.setBHasSearchLayer(false);
		}
		
		//export annotation layer stack
		exportAnnotationLayerStack();
		return null;
	}
	
	private RESTfulServicePSM loadCorePSM(String strPathToCOREPSM){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		ServicePSMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strPathToCOREPSM).getAbsolutePath());
		out.println(oURI.devicePath());

	    // Get the resource
	    Resource resource = oResourceSet.getResource(oURI, true);
	    
	    try {
			resource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    RESTfulServicePSM oRESTfulServicePSM = (RESTfulServicePSM) resource.getContents().get(0);
	    return oRESTfulServicePSM;

	}

	private AuthenticationLayerPSM.AnnotationModel loadAuthenticationPSM(String strAuthenticationPSMPath){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		AuthenticationLayerPSMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strAuthenticationPSMPath).getAbsolutePath());
		out.println(oURI.devicePath());

	    // Get the resource
	    Resource resource = oResourceSet.getResource(oURI, true);
	    
	    try {
			resource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    AuthenticationLayerPSM.AnnotationModel oAnnotationModel = (AuthenticationLayerPSM.AnnotationModel) resource.getContents().get(0);
	    return oAnnotationModel;
	}

	private SearchLayerPSM.AnnotationModel loadSearchLayerPSM(String strSearchLayerPath){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		SearchLayerPSMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strSearchLayerPath).getAbsolutePath());
		out.println(oURI.devicePath());

	    // Get the resource
	    Resource resource = oResourceSet.getResource(oURI, true);
	    
	    try {
			resource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    SearchLayerPSM.AnnotationModel oAnnotationModel = (SearchLayerPSM.AnnotationModel) resource.getContents().get(0);
	    return oAnnotationModel;
	}

	private void exportAnnotationLayerStack(){
		
		ResourceSet oResourceSet;
		URI oURI;
		org.eclipse.emf.ecore.resource.Resource oEcoreResource;
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(this.strOutputFolder + "/AnnotationStack/" + this.strProjectName + "AnnotationStack.xmi").toString());
		out.println(oURI.devicePath());

		// Create a resource for this file.
		oEcoreResource = oResourceSet.createResource(oURI);
		
		oEcoreResource.getContents().add(oAnnotationStack);
		
		//save to disk
		try {
			oEcoreResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++){
		    if (name.equals(existing[i].getName())){
		    	return (MessageConsole) existing[i];
		    }
		}
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}
}