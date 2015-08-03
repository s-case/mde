package eu.fp7.scase.launcher.cimgenerator.handlers;

import java.util.ArrayList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;

import AuthenticationLayerCIM.AuthenticationLayerCIMFactory;
import SearchLayerCIM.SearchLayerCIMFactory;
import ServiceCIM.RESTfulServiceCIM;
import eu.fp7.scase.authenticationWizard.AuthenticationCIMWizard;
import eu.fp7.scase.cimGenerator.ACIMProducer;
import eu.fp7.scase.cimGenerator.CoreCIMProducer;
import eu.fp7.scase.cimGenerator.EcoreXMIExtractor;
import eu.fp7.scase.inputParser.YamlInputParser;
import eu.fp7.scase.inputParser.YamlResource;
import eu.fp7.scase.searchWizard.SearchCIMWizard;

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
		//parse the input yaml file
		oYamlInputParser = new YamlInputParser(event.getParameter("YamlFilePath"));
		ArrayList<YamlResource> listOfYamlResources = oYamlInputParser.parseYamlInputFile();
		
		//initiate CIM generator to create the envisioned system's CIM
		oACIMProducer = new CoreCIMProducer(listOfYamlResources, event.getParameter("WebServiceName"), event.getParameter("MDEOutputFolder"), event.getParameter("DatabaseIP"), event.getParameter("DatabasePort"), event.getParameter("DatabaseUsername"), event.getParameter("DatabasePassword"));
		oRESTfulServiceCIM = oACIMProducer.produceCIM();
		EcoreXMIExtractor oEcoreXMIExtractor = new EcoreXMIExtractor(event.getParameter("MDEOutputFolder"), event.getParameter("WebServiceName"));
		oEcoreXMIExtractor.exportEcoreXMI(oRESTfulServiceCIM);
		
		//if the authentication flag is true
		if(event.getParameter("Authentication").equalsIgnoreCase("yes")){
			//initialize an authenticaiton layer CIM object in case it is needed
			this.oAuthenticationLayerCIMFactory = AuthenticationLayerCIMFactory.eINSTANCE;
			this.oAuthenticationLayerCIM = this.oAuthenticationLayerCIMFactory.createAnnotationModel();
			this.oAuthenticationLayerCIM.setName(oRESTfulServiceCIM.getName() + "AuthenticationModel");
			
			//setup the authentication CIM wizard
			AuthenticationCIMWizard oAuthenticationCIMWizard = new AuthenticationCIMWizard(event.getParameter("MDEOutputFolder"), oRESTfulServiceCIM, oAuthenticationLayerCIM);
			WizardDialog oAuthenticationWizardDialog = new WizardDialog(null, oAuthenticationCIMWizard);
			if(oAuthenticationWizardDialog.open() == Window.OK){
				oAuthenticationCIMWizard.createAuthenticationCIM();
			}
			else{
				//TODO think of CANCEL handling
			}
		}
		
		//if the searching flag is true
		if(event.getParameter("DatabaseSearching").equalsIgnoreCase("yes") && existsAlgoResource()){
			//initialize a search layer CIM object in case it is needed
			this.oSearchLayerCIMFactory = SearchLayerCIMFactory.eINSTANCE;
			this.oSearchLayerCIM = this.oSearchLayerCIMFactory.createAnnotationModel();
			this.oSearchLayerCIM.setName(this.oRESTfulServiceCIM.getName() + "SearchLayer");
			
			//setup the search CIM wizard
			SearchCIMWizard oSearchCIMWizard = new SearchCIMWizard(event.getParameter("MDEOutputFolder"), oRESTfulServiceCIM, oSearchLayerCIM, (event.getParameter("Authentication").equalsIgnoreCase("yes") ? oAuthenticationLayerCIM : null));
			WizardDialog oSearchWizardDialog = new WizardDialog(null, oSearchCIMWizard);
			
			if(oSearchWizardDialog.open() == Window.OK){
				oSearchCIMWizard.createSearchLayerCIM();
			}
			else{
				//TODO think of CANCEL handling
			}
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
}
