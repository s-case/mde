package eu.fp7.scase.extcompositions;

import org.eclipse.jface.wizard.Wizard;

import eu.fp7.scase.cimGenerator.EcoreXMIExternalServiceLayerExtractor;
import ServiceCIM.RESTfulServiceCIM;

public class ExternalCompositionWizard extends Wizard{
	
	private String strOutputFolder;
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM;
	private ExternalCompositionWizardPage oExternalCompositionWizardPage;
	private boolean bReloadExistingModels;

	public ExternalCompositionWizard(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM, boolean bReloadExistingModels){
		super();
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oExternalServiceLayerCIM = oExternalServiceLayerCIM;
		this.strOutputFolder = strOutputFolder;
		this.setWindowTitle("External Service Composition Editor");
		this.bReloadExistingModels = bReloadExistingModels;
	}
	
	@Override
	public void addPages(){
		this.oExternalCompositionWizardPage = new ExternalCompositionWizardPage(oRESTfulServiceCIM, this.oExternalServiceLayerCIM, bReloadExistingModels);
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
		EcoreXMIExternalServiceLayerExtractor oEcoreXMIExternalServiceLayerExtractor= new EcoreXMIExternalServiceLayerExtractor(this.strOutputFolder + "/CIMModels/" + this.oRESTfulServiceCIM.getName() + "ExternalServiceLayerCIM.xmi", this.oRESTfulServiceCIM.getName());
		oEcoreXMIExternalServiceLayerExtractor.exportEcoreXMI(this.oExternalServiceLayerCIM);
	}
	
	public void exportExternalServiceLayerCIMBackUp(){
		EcoreXMIExternalServiceLayerExtractor oEcoreXMIExternalServiceLayerExtractor= new EcoreXMIExternalServiceLayerExtractor(this.strOutputFolder + "/CIMModels/BackUp/" + this.oRESTfulServiceCIM.getName() + "ExternalServiceLayerCIMBackUp.xmi", this.oRESTfulServiceCIM.getName());
		oEcoreXMIExternalServiceLayerExtractor.exportEcoreXMI(this.oExternalServiceLayerCIM);
	}
}