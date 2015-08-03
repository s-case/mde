package eu.fp7.scase.searchWizard;

import org.eclipse.jface.wizard.Wizard;

import eu.fp7.scase.cimGenerator.EcoreXMISearchLayerExtractor;
import ServiceCIM.RESTfulServiceCIM;

public class SearchCIMWizard extends Wizard{

	private String strOutputFolder;
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM;
	private SearchLayerCIM.AnnotationModel oSearchLayerCIM;
	private SearchCIMWizardPage oSearchCIMWizardPage;
	
	public SearchCIMWizard(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, SearchLayerCIM.AnnotationModel oSearchLayerCIM, AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM){
		super();
		this.setWindowTitle("Search DB Wizard");
		this.strOutputFolder = strOutputFolder;
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oAuthenticationCIM = oAuthenticationCIM;
		this.oSearchLayerCIM = oSearchLayerCIM;
	}
	
	@Override
	public void addPages() {
		this.oSearchCIMWizardPage = new SearchCIMWizardPage(strOutputFolder, oRESTfulServiceCIM, oSearchLayerCIM, oAuthenticationCIM);
		this.addPage(oSearchCIMWizardPage);
	}
	
	@Override
	public boolean performFinish() {
		if(this.oSearchCIMWizardPage.isPageComplete()){
			return true;
		}
		return false;
	}
	
	public void createSearchLayerCIM(){
		this.oSearchCIMWizardPage.createSearchLayerCIM();
		
		//export the search CIM
		exportSearchLayerCIM();
	}
	
	private void exportSearchLayerCIM(){
		EcoreXMISearchLayerExtractor oEcoreXMISearchLayerExtractor = new EcoreXMISearchLayerExtractor(this.strOutputFolder, this.oRESTfulServiceCIM.getName());
		oEcoreXMISearchLayerExtractor.exportEcoreXMI(this.oSearchLayerCIM);
	}
	
}