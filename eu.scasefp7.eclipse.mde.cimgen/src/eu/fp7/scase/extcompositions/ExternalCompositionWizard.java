package eu.fp7.scase.extcompositions;

import org.eclipse.jface.wizard.Wizard;

import eu.fp7.scase.cimGenerator.EcoreXMIExternalServiceLayerExtractor;
import ServiceCIM.RESTfulServiceCIM;

public class ExternalCompositionWizard extends Wizard{
	
	private String strOutputFolder;
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM;
	private ExternalCompositionWizardPage oExternalCompositionWizardPage;

	public ExternalCompositionWizard(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM){
		super();
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oExternalServiceLayerCIM = oExternalServiceLayerCIM;
		this.strOutputFolder = strOutputFolder;
		this.setWindowTitle("External Service Composition Editor");
	}
	
	@Override
	public void addPages(){
		this.oExternalCompositionWizardPage = new ExternalCompositionWizardPage(oRESTfulServiceCIM, this.oExternalServiceLayerCIM);
		this.addPage(this.oExternalCompositionWizardPage);
	}
	
	@Override
	public boolean performFinish() {
		if(this.oExternalCompositionWizardPage.isPageComplete()){
			return true;
		}
		return false;
	}
	
	public void createExternalServiceLayerCIM(){
		this.oExternalCompositionWizardPage.createExternalServiceLayerCIM();
		
		//export the search CIM
		exportExternalServiceLayerCIM();
	}

	private void exportExternalServiceLayerCIM() {
		EcoreXMIExternalServiceLayerExtractor oEcoreXMIExternalServiceLayerExtractor= new EcoreXMIExternalServiceLayerExtractor(this.strOutputFolder, this.oRESTfulServiceCIM.getName());
		oEcoreXMIExternalServiceLayerExtractor.exportEcoreXMI(this.oExternalServiceLayerCIM);
	}
}