package eu.fp7.scase.authenticationWizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;

import AuthenticationLayerCIM.AnnCRUDActivity;
import AuthenticationLayerCIM.AuthenticationLayerCIMFactory;
import AuthenticationLayerCIM.AuthenticationOnlyMode;
import AuthenticationLayerCIM.BothMode;
import ServiceCIM.CRUDActivity;
import ServiceCIM.CRUDVerb;
import ServiceCIM.RESTfulServiceCIM;
import ServiceCIM.Resource;

public class CRUDActivityAuthenticationWizardPage extends WizardPage {

	private RESTfulServiceCIM oRESTfulServiceCIM;
	private AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM;
	private AuthenticationLayerCIMFactory oAuthenticationLayerCIMFactory;
	private Composite oWizardPageGrid;
	private Composite oParentComposite;
	private AuthenticationLayerCIM.AuthenticationMode[][] oAuthenticationModes;
	
	//Resource selection SWTs
	private Label oResourcePromtLabel;
	private List oResourcePromtList;
	private Group oResourcePromtGroup;
	private Composite oResourcePromtGrid;
	
	//CRUDActivity authentication mode selection SWTs
	private Label oCRUDActivityAuthModeLabel;
	private Composite oCRUDActivityAuthModeGrid;
	
	private Label oCreateActivityAuthModeLabel;
	private Button oCreateActivityAuthenticatedButton;
	private Button oCreateActivityAllButton;
	private Composite oCreateActivityGrid;
	
	private Label oReadActivityAuthModeLabel;
	private Button oReadActivityAuthenticatedButton;
	private Button oReadActivityAllButton;
	private Composite oReadActivityGrid;
	
	private Label oUpdateActivityAuthModeLabel;
	private Button oUpdateActivityAuthenticatedButton;
	private Button oUpdateActivityAllButton;
	private Composite oUpdateActivityGrid;
	
	private Label oDeleteActivityAuthModeLabel;
	private Button oDeleteActivityAuthenticatedButton;
	private Button oDeleteActivityAllButton;
	private Composite oDeleteActivityGrid;
	
	//Apply defaults to all SWTs
	private Button oApplyDefaultButton;
	private Composite oApplyDefaultGrid;
	private List oApplyDefaultAuthenticationModeList;
	private Label oApplayDefaultLabel;

	public CRUDActivityAuthenticationWizardPage(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM) {
		  super("Select Authentication Model");
		  this.oAuthenticationLayerCIMFactory = AuthenticationLayerCIMFactory.eINSTANCE;
		  this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		  this.oAuthenticationCIM = oAuthenticationCIM;
		  this.oAuthenticationModes = new AuthenticationLayerCIM.AuthenticationMode[this.oRESTfulServiceCIM.getHasResources().size()][8];
	}

	@Override
	public void createControl(Composite parent) {
		  this.oParentComposite = parent;
		  this.oWizardPageGrid = new Composite(oParentComposite, SWT.NONE);
		  this.oWizardPageGrid.setLayout(new GridLayout(1, false));
		  this.oWizardPageGrid.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		  this.oWizardPageGrid.pack();
		  
		  initializeWizardPagesGrids(parent);
		  initializeWizardPageWidgets(parent);
		  
		  this.setControl(this.oWizardPageGrid);
		  this.setPageComplete(false);
	}
	
	private void initializeWizardPagesGrids(Composite oParentComposite) {
		  
		  //Resource selection composite initializaton
		  this.oResourcePromtGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
		  this.oResourcePromtGrid.setLayout(new GridLayout(1, false));
		  this.oResourcePromtGrid.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			
		  //CRUDActivity authentication mode composite initialization
		  this.oCRUDActivityAuthModeGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
		  this.oCRUDActivityAuthModeGrid.setLayout(new GridLayout(1, false));
		  this.oCRUDActivityAuthModeGrid.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		  this.oCRUDActivityAuthModeLabel = new Label(this.oCRUDActivityAuthModeGrid, SWT.NULL);
			
		  //Create activity authentication mode composite initialization
		  this.oCreateActivityGrid = new Composite(this.oCRUDActivityAuthModeGrid, SWT.NONE);
		  this.oCreateActivityGrid.setLayout(new GridLayout(3, false));
		  this.oCreateActivityGrid.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			
		  //Read activity authentication mode composite initialization
		  this.oReadActivityGrid = new Composite(this.oCRUDActivityAuthModeGrid, SWT.NONE);
		  this.oReadActivityGrid.setLayout(new GridLayout(3, false));
		  this.oReadActivityGrid.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			
		  //Update activity authentication mode composite initialization
		  this.oUpdateActivityGrid = new Composite(this.oCRUDActivityAuthModeGrid, SWT.NONE);
		  this.oUpdateActivityGrid.setLayout(new GridLayout(3, false));
		  this.oUpdateActivityGrid.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			
		  //Delete activity authentication mode composite initialization
		  this.oDeleteActivityGrid = new Composite(this.oCRUDActivityAuthModeGrid, SWT.NONE);
		  this.oDeleteActivityGrid.setLayout(new GridLayout(3, false));
		  this.oDeleteActivityGrid.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			
		  //Apply defaults to all composite initialization
		  this.oApplyDefaultGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
		  this.oApplyDefaultGrid.setLayout(new GridLayout(2, false));
		  this.oApplyDefaultGrid.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		  
	}
	
	private void initializeWizardPageWidgets(Composite oParentComposite) {

		//initialize the resource selection widgets
		initializeResourcePromtWidgets();
		
		//initialize CRUD Activity authentication mode widgets
		initializeCRUDActivityAuthModeWidgets();

		//initialize defaults applicaiton widgets
		initializeApplyDefaultWidgets();
		  		  
		this.setPageComplete(false);
	}
	
	private void initializeResourcePromtWidgets(){
		  
		//initialize Authentication Model SWTs
		this.oResourcePromtGroup = new Group(this.oResourcePromtGrid, SWT.NONE);
		this.oResourcePromtGroup.setLayout(new GridLayout(1, false));
		this.oResourcePromtGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		this.oResourcePromtGroup.setText("Web Service Resources: ");
		this.oResourcePromtLabel = new Label(this.oResourcePromtGroup, SWT.NULL);
		this.oResourcePromtLabel.setText("Pick any resource from the list below to apply change the default authentication mode: ");
		this.oResourcePromtLabel.setLocation(20, 10);
		this.oResourcePromtLabel.pack();
		this.oResourcePromtList = new List(this.oResourcePromtGroup, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL);
		this.oResourcePromtList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		populateResourcePromtList();
		this.oResourcePromtList.setLocation(20, 35);
		addResourcePromtlListListener();
		this.oResourcePromtGroup.pack();
	}
	
	private void initializeCRUDActivityAuthModeWidgets(){
		  
		//initialize CRUD Activity authentication mode SWTs

		this.oCRUDActivityAuthModeLabel.setText("Select the Authentication Mode for each of the following selected resource's CRUD activities: ");
		this.oCRUDActivityAuthModeLabel.setLocation(20, 10);
		this.oCRUDActivityAuthModeLabel.pack();
		
		this.oCreateActivityAuthModeLabel = new Label(this.oCreateActivityGrid, SWT.NULL);
		this.oCreateActivityAuthModeLabel.setText("Create Activity:  ");
		this.oCreateActivityAuthModeLabel.pack();
		
		this.oCreateActivityAllButton = new Button(this.oCreateActivityGrid, SWT.RADIO);
		this.oCreateActivityAllButton.setText("All");
		this.oCreateActivityAllButton.setEnabled(false);
		
		this.oCreateActivityAuthenticatedButton = new Button(this.oCreateActivityGrid, SWT.RADIO);
		this.oCreateActivityAuthenticatedButton.setText("Authenticated");
		this.oCreateActivityAuthenticatedButton.setEnabled(false);
		
		this.oReadActivityAuthModeLabel = new Label(this.oReadActivityGrid, SWT.NULL);
		this.oReadActivityAuthModeLabel.setText("Read Activity:    ");
		this.oReadActivityAuthModeLabel.pack();
		
		this.oReadActivityAllButton = new Button(this.oReadActivityGrid, SWT.RADIO);
		this.oReadActivityAllButton.setText("All");
		this.oReadActivityAllButton.setEnabled(false);
		
		this.oReadActivityAuthenticatedButton = new Button(this.oReadActivityGrid, SWT.RADIO);
		this.oReadActivityAuthenticatedButton.setText("Authenticated");
		this.oReadActivityAuthenticatedButton.setEnabled(false);
		
		this.oUpdateActivityAuthModeLabel = new Label(this.oUpdateActivityGrid, SWT.NULL);
		this.oUpdateActivityAuthModeLabel.setText("Update Activity: ");
		this.oUpdateActivityAuthModeLabel.pack();
		
		this.oUpdateActivityAllButton = new Button(this.oUpdateActivityGrid, SWT.RADIO);
		this.oUpdateActivityAllButton.setText("All");
		this.oUpdateActivityAllButton.setEnabled(false);
		
		this.oUpdateActivityAuthenticatedButton = new Button(this.oUpdateActivityGrid, SWT.RADIO);
		this.oUpdateActivityAuthenticatedButton.setText("Authenticated");
		this.oUpdateActivityAuthenticatedButton.setEnabled(false);
		
		this.oDeleteActivityAuthModeLabel = new Label(this.oDeleteActivityGrid, SWT.NULL);
		this.oDeleteActivityAuthModeLabel.setText("Delete Activity:  ");
		this.oDeleteActivityAuthModeLabel.pack();
		
		this.oDeleteActivityAllButton = new Button(this.oDeleteActivityGrid, SWT.RADIO);
		this.oDeleteActivityAllButton.setText("All");
		this.oDeleteActivityAllButton.setEnabled(false);
		
		this.oDeleteActivityAuthenticatedButton = new Button(this.oDeleteActivityGrid, SWT.RADIO);
		this.oDeleteActivityAuthenticatedButton.setText("Authenticated");
		this.oDeleteActivityAuthenticatedButton.setEnabled(false);
		
		//add CRUD activities check box listeners
		addCRUDActivityCheckBoxListeners();
	}
	
	private void initializeApplyDefaultWidgets(){
		  
		//initialize Authentication Model SWTs

		this.oApplayDefaultLabel = new Label(this.oApplyDefaultGrid, SWT.NULL);
		this.oApplayDefaultLabel.setText("Choose one authentication mode to apply to all CRUD activities: ");
		this.oApplayDefaultLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
		
		this.oApplyDefaultAuthenticationModeList = new List(this.oApplyDefaultGrid, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL);
		this.oApplyDefaultAuthenticationModeList.add("All");
		this.oApplyDefaultAuthenticationModeList.add("Authenticated");
		this.oApplyDefaultAuthenticationModeList.setSelection(0);
		this.oApplyDefaultAuthenticationModeList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		
		this.oApplyDefaultButton = new Button(this.oApplyDefaultGrid, SWT.NONE);
		this.oApplyDefaultButton.setText("Apply to all");
		this.oApplyDefaultButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		addApplyDefaultButtonListener();		
	}
	
	private void addApplyDefaultButtonListener(){
		this.oApplyDefaultButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				applyAuthenticationModeToAllActivities(oApplyDefaultAuthenticationModeList.getSelection()[0]);
				oResourcePromtList.setSelection(0);
				activateResourceCRUDActivities(oResourcePromtList.getSelection()[0]);
				setSelectedCRUDActivitiesMode(oResourcePromtList.getSelection()[0]);
				setPageComplete(isPageCompleted());
			}});
	}
	
	private void populateResourcePromtList(){
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			this.oResourcePromtList.add(this.oRESTfulServiceCIM.getHasResources().get(i).getName());
		}
	}
	
	private void addResourcePromtlListListener() {
			
		this.oResourcePromtList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				activateResourceCRUDActivities(oResourcePromtList.getSelection()[0]);
				setSelectedCRUDActivitiesMode(oResourcePromtList.getSelection()[0]);
			  	setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				activateResourceCRUDActivities(oResourcePromtList.getSelection()[0]);
				setSelectedCRUDActivitiesMode(oResourcePromtList.getSelection()[0]);
			  	setPageComplete(isPageCompleted());
			}});
	}
	
	private void activateResourceCRUDActivities(String strSelectedResourceName){
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(this.oRESTfulServiceCIM.getHasResources().get(i).getName().equalsIgnoreCase(strSelectedResourceName)){
				disableAllActivitiesWidgets();
				if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(i), CRUDVerb.CREATE)){
					this.oCreateActivityAllButton.setEnabled(true);
					this.oCreateActivityAuthenticatedButton.setEnabled(true);
				}
				
				if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(i), CRUDVerb.READ)){
					this.oReadActivityAllButton.setEnabled(true);
					this.oReadActivityAuthenticatedButton.setEnabled(true);
				}
				
				if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(i), CRUDVerb.UPDATE)){
					this.oUpdateActivityAllButton.setEnabled(true);
					this.oUpdateActivityAuthenticatedButton.setEnabled(true);
				}
				
				if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(i), CRUDVerb.DELETE)){
					this.oDeleteActivityAllButton.setEnabled(true);
					this.oDeleteActivityAuthenticatedButton.setEnabled(true);
				}
			}
		}
	}
	
	private void setSelectedCRUDActivitiesMode(String strSelectedResourceName){
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(this.oRESTfulServiceCIM.getHasResources().get(i).getName().equalsIgnoreCase(strSelectedResourceName)){
				this.oCreateActivityAllButton.setSelection((this.oAuthenticationModes[i][0] != null ? true : false)) ;
				this.oCreateActivityAuthenticatedButton.setSelection((this.oAuthenticationModes[i][1] != null ? true : false)) ;
				this.oReadActivityAllButton.setSelection((this.oAuthenticationModes[i][2] != null ? true : false)) ;
				this.oReadActivityAuthenticatedButton.setSelection((this.oAuthenticationModes[i][3] != null ? true : false)) ;
				this.oUpdateActivityAllButton.setSelection((this.oAuthenticationModes[i][4] != null ? true : false)) ;
				this.oUpdateActivityAuthenticatedButton.setSelection((this.oAuthenticationModes[i][5] != null ? true : false)) ;
				this.oDeleteActivityAllButton.setSelection((this.oAuthenticationModes[i][6] != null ? true : false)) ;
				this.oDeleteActivityAuthenticatedButton.setSelection((this.oAuthenticationModes[i][7] != null ? true : false)) ;
			}
		}
	}
	
	private void disableAllActivitiesWidgets(){
		this.oCreateActivityAllButton.setEnabled(false);
		this.oCreateActivityAuthenticatedButton.setEnabled(false);
		this.oReadActivityAllButton.setEnabled(false);
		this.oReadActivityAuthenticatedButton.setEnabled(false);
		this.oUpdateActivityAllButton.setEnabled(false);
		this.oUpdateActivityAuthenticatedButton.setEnabled(false);
		this.oDeleteActivityAllButton.setEnabled(false);
		this.oDeleteActivityAuthenticatedButton.setEnabled(false);
	}
	
	private boolean hasActivityType(Resource oResource, CRUDVerb oCRUDVerb){
		
		for(int n = 0; n < oResource.getHasCRUDActivity().size(); n++){
			if(oResource.getHasCRUDActivity().get(n).getCRUDVerb() == oCRUDVerb){
				return true;
			}
		}
		
		return false;
	}
	
	private void addCRUDActivityCheckBoxListeners(){
		addCreateActivityAllButtonListener();
		addCreateActivityAuthenticatedButtonListener();
		addReadActivityAllButtonListener();
		addReadActivityAuthenticatedButtonListener();
		addUpdateActivityAllButtonListener();
		addUpdateActivityAuthenticatedButtonListener();
		addDeleteActivityAllButtonListener();
		addDeleteActivityAuthenticatedButtonListener();
	}
	
	private void addCreateActivityAllButtonListener(){
		this.oCreateActivityAllButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				oAuthenticationModes[oResourcePromtList.getSelectionIndex()][0] = (oCreateActivityAllButton.getSelection() == true ? oAuthenticationLayerCIMFactory.createBothMode() : null);
				setPageComplete(isPageCompleted());
			}
		});
	}
	
	private void addCreateActivityAuthenticatedButtonListener(){
		this.oCreateActivityAuthenticatedButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				oAuthenticationModes[oResourcePromtList.getSelectionIndex()][1] = (oCreateActivityAuthenticatedButton.getSelection() == true ? oAuthenticationLayerCIMFactory.createAuthenticationOnlyMode() : null);
				setPageComplete(isPageCompleted());
			}
		});
	}
	
	private void addReadActivityAllButtonListener(){
		this.oReadActivityAllButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				oAuthenticationModes[oResourcePromtList.getSelectionIndex()][2] = (oReadActivityAllButton.getSelection() == true ? oAuthenticationLayerCIMFactory.createBothMode() : null);
				setPageComplete(isPageCompleted());
			}
		});
	}
	
	private void addReadActivityAuthenticatedButtonListener(){
		this.oReadActivityAuthenticatedButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				oAuthenticationModes[oResourcePromtList.getSelectionIndex()][3] = (oReadActivityAuthenticatedButton.getSelection() == true ? oAuthenticationLayerCIMFactory.createAuthenticationOnlyMode() : null);
				setPageComplete(isPageCompleted());
			}
		});
	}
	
	private void addUpdateActivityAllButtonListener(){
		this.oUpdateActivityAllButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				oAuthenticationModes[oResourcePromtList.getSelectionIndex()][4] = (oUpdateActivityAllButton.getSelection() == true ? oAuthenticationLayerCIMFactory.createBothMode() : null);
				setPageComplete(isPageCompleted());
			}
		});
	}
	
	private void addUpdateActivityAuthenticatedButtonListener(){
		this.oUpdateActivityAuthenticatedButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				oAuthenticationModes[oResourcePromtList.getSelectionIndex()][5] = (oUpdateActivityAuthenticatedButton.getSelection() == true ? oAuthenticationLayerCIMFactory.createAuthenticationOnlyMode() : null);
				setPageComplete(isPageCompleted());
			}
		});
	}
	
	private void addDeleteActivityAllButtonListener(){
		this.oDeleteActivityAllButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				oAuthenticationModes[oResourcePromtList.getSelectionIndex()][6] = (oDeleteActivityAllButton.getSelection() == true ? oAuthenticationLayerCIMFactory.createBothMode() : null);
				setPageComplete(isPageCompleted());
			}
		});
	}
	
	private void addDeleteActivityAuthenticatedButtonListener(){
		this.oDeleteActivityAuthenticatedButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				oAuthenticationModes[oResourcePromtList.getSelectionIndex()][7] = (oDeleteActivityAuthenticatedButton.getSelection() == true ? oAuthenticationLayerCIMFactory.createAuthenticationOnlyMode() : null);
				setPageComplete(isPageCompleted());
			}
		});
	}
	
	private boolean isPageCompleted(){
		
		//this page is completed if and only if every CRUD activity is assigned an authentication mode;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.CREATE)){
				if(this.oAuthenticationModes[n][0] == null && this.oAuthenticationModes[n][1] == null){
					return false;
				}
			}
			
			if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.READ)){
				if(this.oAuthenticationModes[n][2] == null && this.oAuthenticationModes[n][3] == null){
					return false;
				}
			}
			
			if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.UPDATE)){
				if(this.oAuthenticationModes[n][4] == null && this.oAuthenticationModes[n][5] == null){
					return false;
				}
			}
			
			if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.DELETE)){
				if(this.oAuthenticationModes[n][6] == null && this.oAuthenticationModes[n][7] == null){
					return false;
				}
			}
		}
		
		return true;
	}
	
	private void applyAuthenticationModeToAllActivities(String oSelectedAuthenticationModeName){
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(oSelectedAuthenticationModeName.equalsIgnoreCase("All")){
				if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.CREATE)){
					this.oAuthenticationModes[n][0] = oAuthenticationLayerCIMFactory.createBothMode();
					this.oAuthenticationModes[n][1] = null;
				}
				
				if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.READ)){
					this.oAuthenticationModes[n][2] = oAuthenticationLayerCIMFactory.createBothMode();
					this.oAuthenticationModes[n][3] = null;
				}
				
				if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.UPDATE)){
					this.oAuthenticationModes[n][4] = oAuthenticationLayerCIMFactory.createBothMode();
					this.oAuthenticationModes[n][5] = null;
				}
				
				if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.DELETE)){
					this.oAuthenticationModes[n][6] = oAuthenticationLayerCIMFactory.createBothMode();
					this.oAuthenticationModes[n][7] = null;
				}
			}
			else{ //set everything to authenticated only mode
				if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.CREATE)){
					this.oAuthenticationModes[n][0] = null;
					this.oAuthenticationModes[n][1] = oAuthenticationLayerCIMFactory.createAuthenticationOnlyMode();
				}
				
				if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.READ)){
					this.oAuthenticationModes[n][2] = null;
					this.oAuthenticationModes[n][3] = oAuthenticationLayerCIMFactory.createAuthenticationOnlyMode();
				}
				
				if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.UPDATE)){
					this.oAuthenticationModes[n][4] = null;
					this.oAuthenticationModes[n][5] = oAuthenticationLayerCIMFactory.createAuthenticationOnlyMode();
				}
				
				if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.DELETE)){
					this.oAuthenticationModes[n][6] = null;
					this.oAuthenticationModes[n][7] = oAuthenticationLayerCIMFactory.createAuthenticationOnlyMode();
				}
			}
		}
	}
	
	public void createAuthenticationCIM(){
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.CREATE)){
				addCreateActivityAuthenticationMode(this.oRESTfulServiceCIM.getHasResources().get(n), n);
			}
			
			if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.READ)){
				addReadActivityAuthenticationMode(this.oRESTfulServiceCIM.getHasResources().get(n), n);
			}
			
			if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.UPDATE)){
				addUpdateActivityAuthenticationMode(this.oRESTfulServiceCIM.getHasResources().get(n), n);
			}
			
			if(hasActivityType(this.oRESTfulServiceCIM.getHasResources().get(n), CRUDVerb.DELETE)){
				addDeleteActivityAuthenticationMode(this.oRESTfulServiceCIM.getHasResources().get(n), n);
			}
		}
	}
	
	private void addCreateActivityAuthenticationMode(Resource oCIMResource, int iResourceIndex){
		if(this.oAuthenticationModes[iResourceIndex][1] != null){ //if user selected Only_Authenticated mode
			AuthenticationOnlyMode oAuthenticationOnlyMode = this.oAuthenticationLayerCIMFactory.createAuthenticationOnlyMode();
			AnnCRUDActivity oAnnCRUDActivity = this.oAuthenticationLayerCIMFactory.createAnnCRUDActivity();
			oAuthenticationOnlyMode.setCRUDActivityAuthenticationMode(oAnnCRUDActivity);
			oAnnCRUDActivity.setName(getResourceActivityByType(oCIMResource, CRUDVerb.CREATE).getCRUDVerb().toString());
			oAnnCRUDActivity.setAnnotatesCRUDActivity(getResourceActivityByType(oCIMResource, CRUDVerb.CREATE));
			oAnnCRUDActivity.setBelongsToResource(oCIMResource);
			this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnCRUDActivity);
			this.oAuthenticationCIM.getHasAnnotation().add(oAuthenticationOnlyMode);
		}
		else{ //if user selected All mode
			BothMode oBothMode = this.oAuthenticationLayerCIMFactory.createBothMode();
			AnnCRUDActivity oAnnCRUDActivity = this.oAuthenticationLayerCIMFactory.createAnnCRUDActivity();
			oBothMode.setCRUDActivityAuthenticationMode(oAnnCRUDActivity);
			oAnnCRUDActivity.setName(getResourceActivityByType(oCIMResource, CRUDVerb.CREATE).getCRUDVerb().toString());
			oAnnCRUDActivity.setAnnotatesCRUDActivity(getResourceActivityByType(oCIMResource, CRUDVerb.CREATE));
			oAnnCRUDActivity.setBelongsToResource(oCIMResource);
			this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnCRUDActivity);
			this.oAuthenticationCIM.getHasAnnotation().add(oBothMode);
		}
	}
	
	private void addReadActivityAuthenticationMode(Resource oCIMResource, int iResourceIndex){
		if(this.oAuthenticationModes[iResourceIndex][3] != null){ //if user selected Only_Authenticated mode
			AuthenticationOnlyMode oAuthenticationOnlyMode = this.oAuthenticationLayerCIMFactory.createAuthenticationOnlyMode();
			AnnCRUDActivity oAnnCRUDActivity = this.oAuthenticationLayerCIMFactory.createAnnCRUDActivity();
			oAuthenticationOnlyMode.setCRUDActivityAuthenticationMode(oAnnCRUDActivity);
			oAnnCRUDActivity.setName(getResourceActivityByType(oCIMResource, CRUDVerb.READ).getCRUDVerb().toString());
			oAnnCRUDActivity.setAnnotatesCRUDActivity(getResourceActivityByType(oCIMResource, CRUDVerb.READ));
			oAnnCRUDActivity.setBelongsToResource(oCIMResource);
			this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnCRUDActivity);
			this.oAuthenticationCIM.getHasAnnotation().add(oAuthenticationOnlyMode);
		}
		else{ //if user selected All mode
			BothMode oBothMode = this.oAuthenticationLayerCIMFactory.createBothMode();
			AnnCRUDActivity oAnnCRUDActivity = this.oAuthenticationLayerCIMFactory.createAnnCRUDActivity();
			oBothMode.setCRUDActivityAuthenticationMode(oAnnCRUDActivity);
			oAnnCRUDActivity.setName(getResourceActivityByType(oCIMResource, CRUDVerb.READ).getCRUDVerb().toString());
			oAnnCRUDActivity.setAnnotatesCRUDActivity(getResourceActivityByType(oCIMResource, CRUDVerb.READ));
			oAnnCRUDActivity.setBelongsToResource(oCIMResource);
			this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnCRUDActivity);
			this.oAuthenticationCIM.getHasAnnotation().add(oBothMode);
		}
	}
	
	private void addUpdateActivityAuthenticationMode(Resource oCIMResource, int iResourceIndex){
		if(this.oAuthenticationModes[iResourceIndex][5] != null){ //if user selected Only_Authenticated mode
			AuthenticationOnlyMode oAuthenticationOnlyMode = this.oAuthenticationLayerCIMFactory.createAuthenticationOnlyMode();
			AnnCRUDActivity oAnnCRUDActivity = this.oAuthenticationLayerCIMFactory.createAnnCRUDActivity();
			oAuthenticationOnlyMode.setCRUDActivityAuthenticationMode(oAnnCRUDActivity);
			oAnnCRUDActivity.setName(getResourceActivityByType(oCIMResource, CRUDVerb.UPDATE).getCRUDVerb().toString());
			oAnnCRUDActivity.setAnnotatesCRUDActivity(getResourceActivityByType(oCIMResource, CRUDVerb.UPDATE));
			oAnnCRUDActivity.setBelongsToResource(oCIMResource);
			this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnCRUDActivity);
			this.oAuthenticationCIM.getHasAnnotation().add(oAuthenticationOnlyMode);
		}
		else{ //if user selected All mode
			BothMode oBothMode = this.oAuthenticationLayerCIMFactory.createBothMode();
			AnnCRUDActivity oAnnCRUDActivity = this.oAuthenticationLayerCIMFactory.createAnnCRUDActivity();
			oBothMode.setCRUDActivityAuthenticationMode(oAnnCRUDActivity);
			oAnnCRUDActivity.setName(getResourceActivityByType(oCIMResource, CRUDVerb.UPDATE).getCRUDVerb().toString());
			oAnnCRUDActivity.setAnnotatesCRUDActivity(getResourceActivityByType(oCIMResource, CRUDVerb.UPDATE));
			oAnnCRUDActivity.setBelongsToResource(oCIMResource);
			this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnCRUDActivity);
			this.oAuthenticationCIM.getHasAnnotation().add(oBothMode);
		}
	}
	
	private void addDeleteActivityAuthenticationMode(Resource oCIMResource, int iResourceIndex){
		if(this.oAuthenticationModes[iResourceIndex][7] != null){ //if user selected Only_Authenticated mode
			AuthenticationOnlyMode oAuthenticationOnlyMode = this.oAuthenticationLayerCIMFactory.createAuthenticationOnlyMode();
			AnnCRUDActivity oAnnCRUDActivity = this.oAuthenticationLayerCIMFactory.createAnnCRUDActivity();
			oAuthenticationOnlyMode.setCRUDActivityAuthenticationMode(oAnnCRUDActivity);
			oAnnCRUDActivity.setName(getResourceActivityByType(oCIMResource, CRUDVerb.DELETE).getCRUDVerb().toString());
			oAnnCRUDActivity.setAnnotatesCRUDActivity(getResourceActivityByType(oCIMResource, CRUDVerb.DELETE));
			oAnnCRUDActivity.setBelongsToResource(oCIMResource);
			this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnCRUDActivity);
			this.oAuthenticationCIM.getHasAnnotation().add(oAuthenticationOnlyMode);
		}
		else{ //if user selected All mode
			BothMode oBothMode = this.oAuthenticationLayerCIMFactory.createBothMode();
			AnnCRUDActivity oAnnCRUDActivity = this.oAuthenticationLayerCIMFactory.createAnnCRUDActivity();
			oBothMode.setCRUDActivityAuthenticationMode(oAnnCRUDActivity);
			oAnnCRUDActivity.setName(getResourceActivityByType(oCIMResource, CRUDVerb.DELETE).getCRUDVerb().toString());
			oAnnCRUDActivity.setAnnotatesCRUDActivity(getResourceActivityByType(oCIMResource, CRUDVerb.DELETE));
			oAnnCRUDActivity.setBelongsToResource(oCIMResource);
			this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnCRUDActivity);
			this.oAuthenticationCIM.getHasAnnotation().add(oBothMode);
		}
	}
	
	private CRUDActivity getResourceActivityByType(Resource oCIMResource, CRUDVerb oCRUDVerb){
		for(int n = 0; n < oCIMResource.getHasCRUDActivity().size(); n++){
			if(oCIMResource.getHasCRUDActivity().get(n).getCRUDVerb() == oCRUDVerb){
				return oCIMResource.getHasCRUDActivity().get(n);
			}
		}
		
		return null;//add exception for production code
	}
}
	 