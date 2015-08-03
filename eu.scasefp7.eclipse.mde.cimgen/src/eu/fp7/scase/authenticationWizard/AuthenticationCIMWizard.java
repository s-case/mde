package eu.fp7.scase.authenticationWizard;

import org.eclipse.jface.wizard.Wizard;

import eu.fp7.scase.cimGenerator.EcoreXMIAuthenticationExtractor;
import ServiceCIM.RESTfulServiceCIM;

public class AuthenticationCIMWizard extends Wizard {

	private AuthenticationModelWizardPage oAuthenticationModelWizardPage;
	private CRUDActivityAuthenticationWizardPage oCRUDActivityAuthenticationWizardPage;
	private AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM;
	private String strOutputFolder;
	private RESTfulServiceCIM oRESTfulServiceCIM;

	public AuthenticationCIMWizard(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM) {
		super();
		this.setWindowTitle("Authentication Wizard");
		this.strOutputFolder = strOutputFolder;
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oAuthenticationCIM = oAuthenticationCIM;
	}



	@Override
	public void addPages() {
		this.oAuthenticationModelWizardPage = new AuthenticationModelWizardPage(strOutputFolder, oRESTfulServiceCIM, oAuthenticationCIM);
		this.oCRUDActivityAuthenticationWizardPage = new CRUDActivityAuthenticationWizardPage(strOutputFolder, oRESTfulServiceCIM, oAuthenticationCIM);
		this.addPage(oAuthenticationModelWizardPage);
		this.addPage(oCRUDActivityAuthenticationWizardPage);
	}

	@Override
	public boolean performFinish() {
		if(this.oAuthenticationModelWizardPage.isPageComplete() && this.oCRUDActivityAuthenticationWizardPage.isPageComplete()){
			return true;
		}
		return false;
	}
	
	public void createAuthenticationCIM(){
		this.oAuthenticationModelWizardPage.createAuthenticationCIM();
		this.oCRUDActivityAuthenticationWizardPage.createAuthenticationCIM();
		
		//export the produced authentication CIM
		exportAuthenticationModel();
	}
	
	private void exportAuthenticationModel(){
		EcoreXMIAuthenticationExtractor oEcoreXMIAuthenticationExtractor = new EcoreXMIAuthenticationExtractor(this.strOutputFolder, this.oRESTfulServiceCIM.getName());
		oEcoreXMIAuthenticationExtractor.exportEcoreXMI(oAuthenticationCIM);
	}
}
