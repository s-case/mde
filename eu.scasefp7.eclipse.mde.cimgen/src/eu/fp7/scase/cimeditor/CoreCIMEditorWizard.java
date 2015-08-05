package eu.fp7.scase.cimeditor;

import org.eclipse.jface.wizard.Wizard;

import ServiceCIM.RESTfulServiceCIM;

public class CoreCIMEditorWizard extends Wizard{
	
	private String strOutputFolder;
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private CoreCIMEditorWizardPage oCoreCIMEditorWizardPage;

	public CoreCIMEditorWizard(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM){
		super();
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.strOutputFolder = strOutputFolder;
		this.setWindowTitle(this.oRESTfulServiceCIM.getName() + " CIM Editor");
	}
	
	@Override
	public void addPages(){
		this.oCoreCIMEditorWizardPage = new CoreCIMEditorWizardPage(oRESTfulServiceCIM);
		this.addPage(this.oCoreCIMEditorWizardPage);
	}
	
	@Override
	public boolean performFinish() {
		if(this.oCoreCIMEditorWizardPage.isPageComplete()){
			return true;
		}
		return false;
	}
	
	public RESTfulServiceCIM updateCIM(){
		
		return this.oRESTfulServiceCIM;
	}
}