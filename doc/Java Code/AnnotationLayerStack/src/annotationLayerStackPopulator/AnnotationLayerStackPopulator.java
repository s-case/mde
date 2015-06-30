package annotationLayerStackPopulator;

import AuthenticationLayerPSM.AnnotationModel;
import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;
import AnnotationLayerStack.AnnotationStack;
import AnnotationLayerStack.AnnotationLayerStackFactory;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import SearchLayerPSM.SearchLayerPSMPackage;
import ServicePSM.RESTfulServicePSM;
import ServicePSM.RESTfulServicePSMPackage;

public class AnnotationLayerStackPopulator{
	
	private static RESTfulServicePSM oRESTfulServicePSM;
	private static AuthenticationLayerPSM.AnnotationModel oAuthenticationLayerPSM;
	private static SearchLayerPSM.AnnotationModel oSearchLayerPSM;
	private static AnnotationStack oAnnotationStack;
	
	public static void main(String[] args)
	{	
		System.out.println("S-CASE MDE engine annotation layer stack populator started.");
		
		//check input arguments sanity
		if(args.length < 2)
		{
			System.out.println("Usage: java -cp target/RESTfulMDEEngine-1.0-SNAPSHOT.jar main.java.scase.mdeEngine.MDEEngineStarter COREPIM_file_path use_authentication? authentication_PSM_path use_searching? searchLayer_PSM_path");
			return;
		}
		
		//create new Annotation Layer Stack
		AnnotationLayerStackFactory oAuthenticationLayerCIMFactory = AnnotationLayerStackFactory.eINSTANCE;
		oAnnotationStack = oAuthenticationLayerCIMFactory.createAnnotationStack();
		
		//load the core PSM of the RESTful service to be produced

		oRESTfulServicePSM = loadCorePSM(args[0]);
		oAnnotationStack.setHasCorePSM(oRESTfulServicePSM);

		//if there is an authentication layer to load, load it
		
		if(args[1].equalsIgnoreCase("yes")){
			oAuthenticationLayerPSM = loadAuthenticationPSM(args[2]);
			oAnnotationStack.setBHasAuthenticationAnnotation(true);
			oAnnotationStack.setHasAuthenticationLayer(oAuthenticationLayerPSM);
		}
		
		if(args[3].equalsIgnoreCase("yes")){
			oSearchLayerPSM = loadSearchLayerPSM(args[4]);
			oAnnotationStack.setBHasSearchLayer(true);
			oAnnotationStack.setHasSearchLayer(oSearchLayerPSM);
		}
		
		//export annotation layer stack
		exportAnnotationLayerStack();
	}
	
	static private RESTfulServicePSM loadCorePSM(String strPathToCOREPSM){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		RESTfulServicePSMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strPathToCOREPSM).getAbsolutePath());
		System.out.println(oURI.devicePath());

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
	
	static private AuthenticationLayerPSM.AnnotationModel loadAuthenticationPSM(String strAuthenticationPSMPath){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		AuthenticationLayerPSMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strAuthenticationPSMPath).getAbsolutePath());
		System.out.println(oURI.devicePath());

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
	
	static private SearchLayerPSM.AnnotationModel loadSearchLayerPSM(String strSearchLayerPath){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		SearchLayerPSMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strSearchLayerPath).getAbsolutePath());
		System.out.println(oURI.devicePath());

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
	
	private static void exportAnnotationLayerStack(){
		
		ResourceSet oResourceSet;
		URI oURI;
		org.eclipse.emf.ecore.resource.Resource oEcoreResource;
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createURI(new File("AnnotationLayerStack.xmi").getAbsolutePath());
		System.out.println(oURI.devicePath());

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
}