package eu.fp7.scase.authenticationWizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

import AuthenticationLayerCIM.AnnProperty;
import AuthenticationLayerCIM.AnnResource;
import AuthenticationLayerCIM.AuthenticationModel;
import AuthenticationLayerCIM.AuthenticationToken;
import AuthenticationLayerCIM.Password;
import ServiceCIM.RESTfulServiceCIM;
import AuthenticationLayerCIM.AuthenticationLayerCIMFactory;


public class AuthenticationModelWizardPage extends WizardPage {

	private String strOutputFolder;
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM;
	private AuthenticationLayerCIMFactory oAuthenticationLayerCIMFactory;
	private Composite oWizardPageGrid;
	private Composite oParentComposite;
	private String strSelectedAuthenticationModelName;
	private String strSelectedUsernameTokenName;
	private String strSelectedPasswordTokenName;
	
	//Authentication Model selection SWTs
	private Label oAuthenticationModelPromtLabel;
	private List oAuthenticationModelResourceList;
	private Group oAuthenticationModelGroup;
	private Composite oAuthenticationModelGrid;
	
	//username token SWTs
	private Label oUsernameTokenPromtLabel;
	private List oUsernameTokenPromtList;
	private Group oUsernameTokenPromtGroup;
	private Composite oUsernameTokenGrid;
	
	//password token SWTs
	private Label oPasswordTokenPromtLabel;
	private List oPasswordTokenPromtList;
	private Group oPasswordTokenGroup;
	private Composite oPasswordTokenGrid;

	  public AuthenticationModelWizardPage(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM) {
		  super("Select Authentication Model");
		  this.strOutputFolder = strOutputFolder;
		  this.oAuthenticationLayerCIMFactory = AuthenticationLayerCIMFactory.eINSTANCE;
		  this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		  this.oAuthenticationCIM = oAuthenticationCIM;
	  }

	  @Override
	  public void createControl(Composite parent) {
		  this.oParentComposite = parent;
		  this.oWizardPageGrid = new Composite(oParentComposite, SWT.NONE);
		  
		  initializeWizardPagesGrids(parent);
		  initializeWizardPageWidgets(parent);
		  
		  this.setControl(this.oWizardPageGrid);
		  this.setPageComplete(false);
	  }
	  
	  private void initializeWizardPagesGrids(Composite oParentComposite) {
		  
		  //initialize authentication model selection composite container
		  this.oAuthenticationModelGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
		  this.oAuthenticationModelGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
		  this.oAuthenticationModelGrid.setLayout(new GridLayout(1, false));
			
		  //initialize username token composite container
		  this.oUsernameTokenGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
		  this.oUsernameTokenGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
		  this.oUsernameTokenGrid.setLayout(new GridLayout(1, false));
			
		  //initialize password token composite container
		  this.oPasswordTokenGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
		  this.oPasswordTokenGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
		  this.oPasswordTokenGrid.setLayout(new GridLayout(1, false));
		  
		  this.oWizardPageGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
		  this.oWizardPageGrid.setLayout(new GridLayout(1, false));
	  }
	  
	  private void initializeWizardPageWidgets(Composite oParentComposite) {

		  //initialize the authentication model selection widgets
		  initializeAuthenticationModelWidgets();
			
		  //initialize Username token SWTs
		  initializeUsernameTokenWidgets();
			
		  //initialize Password token SWTs
		  initializePasswordTokenWidgets();
		  
		  this.oParentComposite.layout();
		  
		  this.setPageComplete(false);
	  }
	  
	  private void initializeAuthenticationModelWidgets(){
		  
		  //initialize Authentication Model SWTs
		  this.oAuthenticationModelGroup = new Group(this.oAuthenticationModelGrid, SWT.NONE);
		  this.oAuthenticationModelGroup.setText("Authentication Model: ");
		  this.oAuthenticationModelPromtLabel = new Label(this.oAuthenticationModelGroup, SWT.NULL);
		  this.oAuthenticationModelPromtLabel.setText("Choose your web service Authentication Model from the available resources below: ");
		  this.oAuthenticationModelPromtLabel.setLocation(20, 10);
		  this.oAuthenticationModelPromtLabel.pack();
		  this.oAuthenticationModelResourceList = new List(this.oAuthenticationModelGroup, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL);
		  populateAuthenticationModelResourceList();
		  this.oAuthenticationModelResourceList.setLocation(20, 35);
		  this.oAuthenticationModelResourceList.setSize(this.oAuthenticationModelPromtLabel.getSize().x - 10, 50);
		  addAuthenticationModelListListener();
		  this.oAuthenticationModelGroup.pack();
	  }
	  
	  private void initializeUsernameTokenWidgets(){
		  
		  //initialize Authentication Model SWTs
		  this.oUsernameTokenPromtGroup = new Group(this.oUsernameTokenGrid, SWT.NONE);
		  this.oUsernameTokenPromtGroup.setText("Username Token: ");
		  this.oUsernameTokenPromtLabel = new Label(this.oUsernameTokenPromtGroup, SWT.NULL);
		  this.oUsernameTokenPromtLabel.setText("Choose the property that will be the username authentication token: ");
		  this.oUsernameTokenPromtLabel.setLocation(20, 10);
		  this.oUsernameTokenPromtLabel.pack();
		  this.oUsernameTokenPromtList = new List(this.oUsernameTokenPromtGroup, SWT.SINGLE | SWT.V_SCROLL | SWT.BORDER_SOLID);
		  this.oUsernameTokenPromtList.setEnabled(false);
		  this.oUsernameTokenPromtList.setLocation(20, 35);
		  this.oUsernameTokenPromtList.add("First you need to select an authentication model!");
		  this.oUsernameTokenPromtList.setSize(this.oUsernameTokenPromtLabel.getSize().x - 10, 50);
		  addUsernameTokenListListener();
		  this.oUsernameTokenPromtGroup.pack();
	  }
	  
	  private void initializePasswordTokenWidgets(){
		  
		  //initialize Authentication Model SWTs
		  this.oPasswordTokenGroup = new Group(this.oPasswordTokenGrid, SWT.NONE);
		  this.oPasswordTokenGroup.setText("Password Token: ");
		  this.oPasswordTokenPromtLabel = new Label(this.oPasswordTokenGroup, SWT.NULL);
		  this.oPasswordTokenPromtLabel.setText("Choose the property that will be the password authentication token: ");
		  this.oPasswordTokenPromtLabel.setLocation(20, 10);
		  this.oPasswordTokenPromtLabel.pack();
		  this.oPasswordTokenPromtList = new List(this.oPasswordTokenGroup, SWT.SINGLE | SWT.V_SCROLL | SWT.BORDER_SOLID);
		  this.oPasswordTokenPromtList.setEnabled(false);
		  this.oPasswordTokenPromtList.setLocation(20, 35);
		  this.oPasswordTokenPromtList.add("First you need to select a username token!");
		  this.oPasswordTokenPromtList.setSize(this.oPasswordTokenPromtLabel.getSize().x - 10, 50);
		  addPasswordTokenListListener();
		  this.oPasswordTokenGroup.pack();
	  }
	  
	  private void populateAuthenticationModelResourceList(){
		  for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			  if(this.oRESTfulServiceCIM.getHasResources().get(i).isIsAlgorithmic() == false){
				  this.oAuthenticationModelResourceList.add(this.oRESTfulServiceCIM.getHasResources().get(i).getName());
			  }
		  }
	  }
	  
	  private void addAuthenticationModelListListener() {

		  this.oAuthenticationModelResourceList.addSelectionListener(new SelectionListener(){
			  
			  @Override
			  public void widgetSelected(SelectionEvent e) {
				  strSelectedAuthenticationModelName = oAuthenticationModelResourceList.getSelection()[0];
				  strSelectedUsernameTokenName = "";
				  strSelectedPasswordTokenName = "";
				  populateUsernameTokenList(oAuthenticationModelResourceList.getSelection());
				  oPasswordTokenPromtList.removeAll();
				  oPasswordTokenPromtList.add("First you need to select a username token!");
//				  oPasswordTokenPromtList.setSize(oPasswordTokenPromtList.computeSize(oPasswordTokenPromtLabel.getSize().x - 10, 100));
				  setPageComplete(false);
			  }

			  @Override
			  public void widgetDefaultSelected(SelectionEvent e) {
				  strSelectedAuthenticationModelName = oAuthenticationModelResourceList.getSelection()[0];
				  strSelectedUsernameTokenName = "";
				  strSelectedPasswordTokenName = "";
				  populateUsernameTokenList(oAuthenticationModelResourceList.getSelection());
				  oPasswordTokenPromtList.removeAll();
				  oPasswordTokenPromtList.add("First you need to select a username token!");
//				  oPasswordTokenPromtList.setSize(oPasswordTokenPromtList.computeSize(oPasswordTokenPromtLabel.getSize().x - 10, 100));
				  setPageComplete(false);
			  }});
	  }
	  
	  private void addUsernameTokenListListener() {
			
		  this.oUsernameTokenPromtList.addSelectionListener(new SelectionListener(){

			  @Override
			  public void widgetSelected(SelectionEvent e) {
				  strSelectedUsernameTokenName = oUsernameTokenPromtList.getSelection()[0];
				  strSelectedPasswordTokenName = "";
				  populatePasswordTokenList(oUsernameTokenPromtList.getSelection());
				  setPageComplete(false);
			  }

			  @Override
			  public void widgetDefaultSelected(SelectionEvent e) {
				  populatePasswordTokenList(oUsernameTokenPromtList.getSelection());
				  strSelectedUsernameTokenName = oUsernameTokenPromtList.getSelection()[0];
				  strSelectedPasswordTokenName = "";
				  setPageComplete(false);
			  }});
	  }
	  
	  private void addPasswordTokenListListener() {
			
		  this.oPasswordTokenPromtList.addSelectionListener(new SelectionListener(){

			  @Override
			  public void widgetSelected(SelectionEvent e) {
				  strSelectedPasswordTokenName = oPasswordTokenPromtList.getSelection()[0];
				  setPageComplete(true);
			  }

			  @Override
			  public void widgetDefaultSelected(SelectionEvent e) {
				  strSelectedPasswordTokenName = oPasswordTokenPromtList.getSelection()[0];
				  setPageComplete(true);
			  }});
	  }
	  
	  private void populateUsernameTokenList(String[] strAuthenticationModelName){
		  this.oUsernameTokenPromtList.removeAll();
		  for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(strAuthenticationModelName[0])){
					for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
						this.oUsernameTokenPromtList.add(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName());
					}
					this.oUsernameTokenPromtList.setEnabled(true);
					this.oPasswordTokenPromtList.setEnabled(false);
				}
		  }
	  }
	  
	  private void addAuthenticationModelToCIM(String strAuthenticationModelName){
			AnnResource oAnnResource = this.oAuthenticationLayerCIMFactory.createAnnResource();
			oAnnResource.setAnnotatesResource(getCoreResourceByName(strAuthenticationModelName));
			AuthenticationModel oAuthenticationModel = this.oAuthenticationLayerCIMFactory.createAuthenticationModel();
			oAuthenticationModel.setResourceAuthenticationModel(oAnnResource);
			this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnResource);
			this.oAuthenticationCIM.getHasAnnotation().add(oAuthenticationModel);
	  }
	  
	  private void populatePasswordTokenList(String[] strUsernameTokenName){
		  this.oPasswordTokenPromtList.removeAll();
		  for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(this.oAuthenticationModelResourceList.getSelection()[0])){
					for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
						if(!this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName().equalsIgnoreCase(strUsernameTokenName[0])){
							this.oPasswordTokenPromtList.add(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName());
						}
					}
					this.oPasswordTokenPromtList.setEnabled(true);
				}
		  }
	  }
	  
	  private ServiceCIM.Resource getCoreResourceByName(String strCoreResourceName){
		  for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			  if(this.oRESTfulServiceCIM.getHasResources().get(i).getName().equalsIgnoreCase(strCoreResourceName)){
				  System.out.println("Found core resource!");
				  return this.oRESTfulServiceCIM.getHasResources().get(i);
			  }
		  }
		  return null; //throw exceptions instead in production code
	  }
	  
	  private AuthenticationModel getAuthenticationModelResource(){
		  for(int i = 0; i < this.oAuthenticationCIM.getHasAnnotation().size(); i++){
			  if(this.oAuthenticationCIM.getHasAnnotation().get(i) instanceof AuthenticationModel){
				  return (AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(i);
			  }
		  }
		  return null;//throw exception in production code
	  }
	  
	  private void addUsernameTokenToCIM(String strUsernameTokenName){
		  
		  for(int i = 0; i < getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().size(); i++){
			  if(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).getName().equalsIgnoreCase(strUsernameTokenName)){
				  AnnProperty oAnnProperty = this.oAuthenticationLayerCIMFactory.createAnnProperty();
				  oAnnProperty.setAnnotatesProperty(getCorePropertyByName(strUsernameTokenName));;
			      AuthenticationToken oAuthenticationToken = this.oAuthenticationLayerCIMFactory.createAuthenticationToken();
			      oAuthenticationToken.setName(strUsernameTokenName);
				  oAuthenticationToken.setType(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).getType());
				  oAuthenticationToken.setBIsUnique(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).isIsUnique());
				  oAuthenticationToken.setPropertyAuthenticationToken(oAnnProperty);
				  this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnProperty);
				  this.oAuthenticationCIM.getHasAnnotation().add(oAuthenticationToken);
				  getAuthenticationModelResource().getHasAuthenticationToken().add(oAuthenticationToken);
			  }
		  }
	  }
	  
	  private void addPasswordTokenToCIM(String strPasswordTokenName){
		  
		  for(int i = 0; i < getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().size(); i++){
			  if(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).getName().equalsIgnoreCase(strPasswordTokenName)){
				  AnnProperty oAnnProperty = this.oAuthenticationLayerCIMFactory.createAnnProperty();
				  oAnnProperty.setAnnotatesProperty(getCorePropertyByName(strPasswordTokenName));;
				  Password oPassword = this.oAuthenticationLayerCIMFactory.createPassword();
				  oPassword.setName(strPasswordTokenName);
				  oPassword.setType(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).getType());
				  oPassword.setBIsUnique(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).isIsUnique());
				  oPassword.setPropertyAuthenticationToken(oAnnProperty);
				  this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnProperty);
				  this.oAuthenticationCIM.getHasAnnotation().add(oPassword);
				  getAuthenticationModelResource().getHasAuthenticationToken().add(oPassword);
			  }
		  }
	  }
	  
	  private ServiceCIM.Property getCorePropertyByName(String strPropertyName){
		  for(int i = 0; i < this.getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().size(); i++){
			  if( strPropertyName.equalsIgnoreCase(this.getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).getName())){
				  return this.getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i);
			  }
		  }
			
		  return null; //throw exception in production code
	  }
	  
	  public void createAuthenticationCIM(){
		  addAuthenticationModelToCIM(this.strSelectedAuthenticationModelName);
		  addUsernameTokenToCIM(this.strSelectedUsernameTokenName);
		  addPasswordTokenToCIM(this.strSelectedPasswordTokenName);
	  }
}
	 