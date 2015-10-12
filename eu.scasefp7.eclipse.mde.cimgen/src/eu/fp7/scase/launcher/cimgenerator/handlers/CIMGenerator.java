package eu.fp7.scase.launcher.cimgenerator.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;

import java.util.ArrayList;

import AuthenticationLayerCIM.AuthenticationLayerCIMFactory;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMFactory;
import SearchLayerCIM.SearchLayerCIMFactory;
import ServiceCIM.RESTfulServiceCIM;
import eu.fp7.scase.inputParser.YamlInputParser;
import eu.fp7.scase.inputParser.YamlResource;
import eu.fp7.scase.searchWizard.SearchCIMWizard;
import eu.fp7.scase.authenticationWizard.AuthenticationCIMWizard;
import eu.fp7.scase.cimGenerator.ACIMProducer;
import eu.fp7.scase.cimGenerator.CoreCIMProducer;
import eu.fp7.scase.cimGenerator.EcoreXMIExtractor;
import eu.fp7.scase.cimeditor.CoreCIMEditorWizard;
import eu.fp7.scase.extcompositions.ExternalCompositionWizard;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class CIMGenerator extends AbstractHandler {
	
	private YamlInputParser oYamlInputParser;
	private ACIMProducer oACIMProducer;
	private AuthenticationLayerCIM.AnnotationModel oAuthenticationLayerCIM;
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private AuthenticationLayerCIMFactory oAuthenticationLayerCIMFactory;
	private SearchLayerCIMFactory oSearchLayerCIMFactory;
	private SearchLayerCIM.AnnotationModel oSearchLayerCIM;
	private ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM;
	private ExternalServiceLayerCIMFactory oExternalServiceLayerCIMFactory;
	private ArrayList<YamlResource> listOfYamlResources;
	private ExecutionEvent oEvent;

	
	/**
	 * The constructor.
	 */
	public CIMGenerator() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		this.oEvent = event;
		
		//parse the input yaml file
		oYamlInputParser = new YamlInputParser(event.getParameter("YamlFilePath"));
		this.listOfYamlResources = oYamlInputParser.parseYamlInputFile();
		
		//initiate CIM generator to create the envisioned system's Core REST CIM
		createCoreRestCIM();

		
		//if the authentication flag is true
		if(event.getParameter("Authentication").equalsIgnoreCase("yes")){
			//initialize an authenticaiton layer CIM object in case it is needed
			createBasicAuthenticationCIM();
		}
		
		//if the searching flag is true
		if(event.getParameter("DatabaseSearching").equalsIgnoreCase("yes") && existsAlgoResource()){
			//initialize a search layer CIM object in case it is needed
			createDatabaseSearchingCIM();
		}
		
		//if the external Service flag is true
		if(event.getParameter("ExternalComposition").equalsIgnoreCase("yes") && existsAlgoResource()){ // TODO CHECK if the algo resource is not marked as search
			createExternalServiceLayerCIM();
		}
		
		return null;
	}
	
	private boolean existsAlgoResource(){
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic()){
				return true;
			}
		}
		
		return false;
	}
	
	private boolean createCoreRestCIM(){
		
		oACIMProducer = new CoreCIMProducer(listOfYamlResources, this.oEvent.getParameter("WebServiceName"), this.oEvent.getParameter("MDEOutputFolder"), this.oEvent.getParameter("DatabaseIP"), this.oEvent.getParameter("DatabasePort"), this.oEvent.getParameter("DatabaseUsername"), this.oEvent.getParameter("DatabasePassword"));
		oRESTfulServiceCIM = oACIMProducer.produceCIM();
		CoreCIMEditorWizard oCoreCIMEditorWizard = new CoreCIMEditorWizard(this.oEvent.getParameter("MDEOutputFolder"), oRESTfulServiceCIM);
		WizardDialog oCoreCIMEditorWizardDialog = new WizardDialog(null, oCoreCIMEditorWizard);
		if(oCoreCIMEditorWizardDialog.open() == Window.OK){
			oRESTfulServiceCIM = oCoreCIMEditorWizard.updateCIM();
		}
		else{
			return false;
		}
		//extract Core REST CIM to xmi.
		EcoreXMIExtractor oEcoreXMIExtractor = new EcoreXMIExtractor(this.oEvent.getParameter("MDEOutputFolder"), this.oEvent.getParameter("WebServiceName"));
		oEcoreXMIExtractor.exportEcoreXMI(oRESTfulServiceCIM);
		
		return true;
	}
	
	private boolean createBasicAuthenticationCIM(){
		
		this.oAuthenticationLayerCIMFactory = AuthenticationLayerCIMFactory.eINSTANCE;
		this.oAuthenticationLayerCIM = this.oAuthenticationLayerCIMFactory.createAnnotationModel();
		this.oAuthenticationLayerCIM.setName(oRESTfulServiceCIM.getName() + "AuthenticationModel");
		
		//setup the authentication CIM wizard
		AuthenticationCIMWizard oAuthenticationCIMWizard = new AuthenticationCIMWizard(this.oEvent.getParameter("MDEOutputFolder"), oRESTfulServiceCIM, oAuthenticationLayerCIM);
		WizardDialog oAuthenticationWizardDialog = new WizardDialog(null, oAuthenticationCIMWizard);
		if(oAuthenticationWizardDialog.open() == Window.OK){
			oAuthenticationCIMWizard.createAuthenticationCIM();
		}
		else{
			return false;
		}
		
		return true;
	}
	
	private boolean createDatabaseSearchingCIM(){
		
		this.oSearchLayerCIMFactory = SearchLayerCIMFactory.eINSTANCE;
		this.oSearchLayerCIM = this.oSearchLayerCIMFactory.createAnnotationModel();
		this.oSearchLayerCIM.setName(this.oRESTfulServiceCIM.getName() + "SearchLayer");
		
		//setup the search CIM wizard
		SearchCIMWizard oSearchCIMWizard = new SearchCIMWizard(this.oEvent.getParameter("MDEOutputFolder"), oRESTfulServiceCIM, oSearchLayerCIM, (this.oEvent.getParameter("Authentication").equalsIgnoreCase("yes") ? oAuthenticationLayerCIM : null));
		WizardDialog oSearchWizardDialog = new WizardDialog(null, oSearchCIMWizard);
		
		if(oSearchWizardDialog.open() == Window.OK){
			oSearchCIMWizard.createSearchLayerCIM();
		}
		else{
			return false;
		}
		
		return true;
	}
	
	private boolean createExternalServiceLayerCIM(){
		
		//TODO once the composition input from CERTH is available add here external service layer CIM instantiation
		this.oExternalServiceLayerCIMFactory = ExternalServiceLayerCIMFactory.eINSTANCE;
		this.oExternalServiceLayerCIM = this.oExternalServiceLayerCIMFactory.createAnnotationModel();
		this.oExternalServiceLayerCIM.setName(this.oRESTfulServiceCIM.getName() + "ExternalServiceLayer");

		//setup the external service CIM wizard
		ExternalCompositionWizard oExternalCompositionWizard = new ExternalCompositionWizard(this.oEvent.getParameter("MDEOutputFolder"), this.oRESTfulServiceCIM, this.oExternalServiceLayerCIM);
		WizardDialog oExternalCompositionWizardDialog = new WizardDialog(null, oExternalCompositionWizard);
		
		if(oExternalCompositionWizardDialog.open() == Window.OK){
			oExternalCompositionWizard.createExternalServiceLayerCIM();
		}
		else{
			return false;
		}

		return true;
	}
}
