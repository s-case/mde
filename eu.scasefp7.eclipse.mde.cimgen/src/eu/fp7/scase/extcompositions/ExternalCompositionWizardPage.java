package eu.fp7.scase.extcompositions;

import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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
import org.eclipse.swt.widgets.Shell;

import ExternalServiceLayerCIM.AnnAlgoResource;
import ExternalServiceLayerCIM.AnnCRUDResource;
import ExternalServiceLayerCIM.AutoPersistentOutput;
import ExternalServiceLayerCIM.ExistentCRUDPersistentOutput;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMFactory;
import ExternalServiceLayerCIM.InputDataModel;
import ExternalServiceLayerCIM.ModelProperty;
import ExternalServiceLayerCIM.NonPersistentOutput;
import ExternalServiceLayerCIM.QueryParam;
import ExternalServiceLayerCIM.RESTClientResource;
import ExternalServiceLayerCIM.Representation;
import ExternalServiceLayerCIM.TargetRESTService;
import ServiceCIM.RESTfulServiceCIM;
import ServiceCIM.Resource;

import org.eclipse.swt.widgets.Text;


public class ExternalCompositionWizardPage extends WizardPage{
	
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM;
	private Composite oWizardPageGrid;
	private Composite oParentComposite;
	private ExternalServiceLayerCIMFactory oExternalServiceLayerCIMFactory;
	
	
	//widgets
	private Composite oAlgoResourceGrid;
	private GridData gd_oAlgoResourceGrid;
	private GridData gd_lblRestclientResources;
	private List listAvailableResources;
	private GridData gd_listAvailableResources;
	private Composite composite;
	private GridData gd_composite;
	private Button buttonAddRESTClientResource;
	private GridData gd_buttonAddRESTClientResource;
	private Button buttonRemoveRESTClientResource;
	private List listRESTClientResources;
	private GridData gd_listRESTClientResources;
	private Composite oExternalServiceCombo;
	private GridData gd_oExternalServiceCombo;
	private List listCRUDVerb;
	private List listQueryParameters;
	private Button buttonRenameQueryParameter;
	private Button buttonCreateQueryParameter;
	private Button buttonDeleteQueryParameter;
	private Button buttonInputJSON;
	private Button buttonInputXML;
	private List listInputProperties;
	private Button buttonInputPropertyMultiplicity;
	private Button buttonCreateInputProperty;
	private Button buttonDeleteInputProperty;
	private Button buttonRenameInputProperty;
	private List listInputPropertyType;
	private Button buttonHasInputDataModel;
	private Button buttonHasOutputDataModel;
	private Button buttonOutputJSON;
	private Button buttonOutputXML;
	private List listOutputProperties;
	private Button buttonOutputPropertyMultiplicity;
	private Button buttonCreateOutputProperty;
	private Button buttonDeleteOutputProperty;
	private Button buttonRenameOutputProperty;
	private List listOutputPropertyType;
	private Button buttonPersistOutput;
	private List listPersistenceType;
	private List listExistentCRUDResources;
	private Text textTargetServiceURL;
	
	//temporary External Composition modeling attributes
	private boolean[] oRESTClientResourcesArray;
	private RESTClientResource[] oRESTClientModelingArray;
	
	public ExternalCompositionWizardPage(RESTfulServiceCIM oRESTfulServiceCIM,  ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM){
		super(oRESTfulServiceCIM.getName() + "External Service Editor");
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oExternalServiceLayerCIM = oExternalServiceLayerCIM;
		this.oExternalServiceLayerCIMFactory = ExternalServiceLayerCIMFactory.eINSTANCE;
		this.oRESTClientResourcesArray = new boolean[getNumberOfAvailableAlgoResources()];
		this.oRESTClientModelingArray = new RESTClientResource[getNumberOfAvailableAlgoResources()];
	}


	@Override
	public void createControl(Composite parent) {
		this.oParentComposite = parent;
		this.oWizardPageGrid = new Composite(parent, SWT.NONE);
		this.oWizardPageGrid.setLayout(new GridLayout(1, false));
		

		this.setControl(this.oWizardPageGrid);
		
		oAlgoResourceGrid = new Composite(oWizardPageGrid, SWT.NONE);
		oAlgoResourceGrid.setLayout(new GridLayout(3, false));
		gd_oAlgoResourceGrid = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_oAlgoResourceGrid.heightHint = 118;
		gd_oAlgoResourceGrid.widthHint = 578;
		oAlgoResourceGrid.setLayoutData(gd_oAlgoResourceGrid);
		
		Label lblAvailableResources = new Label(oAlgoResourceGrid, SWT.NONE);
		lblAvailableResources.setText("Available Resources:");
		new Label(oAlgoResourceGrid, SWT.NONE);
		
		Label lblRestclientResources = new Label(oAlgoResourceGrid, SWT.NONE);
		gd_lblRestclientResources = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblRestclientResources.widthHint = 251;
		lblRestclientResources.setLayoutData(gd_lblRestclientResources);
		lblRestclientResources.setText("RESTClient Resources:");
		
		listAvailableResources = new List(oAlgoResourceGrid, SWT.BORDER | SWT.V_SCROLL);
		gd_listAvailableResources = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_listAvailableResources.heightHint = 88;
		gd_listAvailableResources.widthHint = 206;
		listAvailableResources.setLayoutData(gd_listAvailableResources);
		addAvailableResourcesListListener();
		
		composite = new Composite(oAlgoResourceGrid, SWT.NONE);
		composite.setLayout(new GridLayout(3, false));
		gd_composite = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_composite.heightHint = 70;
		gd_composite.widthHint = 98;
		composite.setLayoutData(gd_composite);
		
		buttonAddRESTClientResource = new Button(composite, SWT.NONE);
		gd_buttonAddRESTClientResource = new GridData(SWT.CENTER, SWT.CENTER, false, false, 3, 1);
		gd_buttonAddRESTClientResource.widthHint = 87;
		buttonAddRESTClientResource.setLayoutData(gd_buttonAddRESTClientResource);
		buttonAddRESTClientResource.setText("Add");
		addAddRESTClientResourceButtonListener();
		
		buttonRemoveRESTClientResource = new Button(composite, SWT.CENTER);
		GridData gd_buttonRemoveRESTClientResource = new GridData(SWT.CENTER, SWT.CENTER, false, false, 3, 1);
		gd_buttonRemoveRESTClientResource.widthHint = 85;
		buttonRemoveRESTClientResource.setLayoutData(gd_buttonRemoveRESTClientResource);
		buttonRemoveRESTClientResource.setText("Remove");
		addRemoveRESTClientResourceButtonListener();
		
		listRESTClientResources = new List(oAlgoResourceGrid, SWT.BORDER | SWT.V_SCROLL);
		gd_listRESTClientResources = new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1);
		gd_listRESTClientResources.heightHint = 89;
		gd_listRESTClientResources.widthHint = 238;
		listRESTClientResources.setLayoutData(gd_listRESTClientResources);
		addRESTClientResourceListListener();
		
		oExternalServiceCombo = new Composite(oWizardPageGrid, SWT.NONE);
		gd_oExternalServiceCombo = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_oExternalServiceCombo.widthHint = 576;
		gd_oExternalServiceCombo.heightHint = 482;
		oExternalServiceCombo.setLayoutData(gd_oExternalServiceCombo);
		
		Label lblExternalCompositionSetup = new Label(oExternalServiceCombo, SWT.NONE);
		lblExternalCompositionSetup.setBounds(10, 10, 257, 14);
		lblExternalCompositionSetup.setText("External Composition Setup:");
		
		Label lblUrl = new Label(oExternalServiceCombo, SWT.NONE);
		lblUrl.setBounds(10, 32, 60, 14);
		lblUrl.setText("URL:");
		
		textTargetServiceURL = new Text(oExternalServiceCombo, SWT.BORDER);
		textTargetServiceURL.setBounds(50, 29, 495, 19);
		addTargetServiceURLListener();
		
		Label lblCrudVerb = new Label(oExternalServiceCombo, SWT.NONE);
		lblCrudVerb.setBounds(10, 54, 68, 14);
		lblCrudVerb.setText("CRUD Verb:");
		
		listCRUDVerb = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listCRUDVerb.setItems(new String[] {"CREATE", "READ", "UPDATE", "DELETE"});
		listCRUDVerb.setBounds(10, 74, 143, 66);
		addCRUDVerbListener();
		
		Label lblQueryParameters = new Label(oExternalServiceCombo, SWT.NONE);
		lblQueryParameters.setBounds(194, 54, 103, 14);
		lblQueryParameters.setText("Query Parameters:");
		
		listQueryParameters = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listQueryParameters.setBounds(194, 74, 184, 66);
		addQueryParameterListListener();
		
		buttonRenameQueryParameter = new Button(oExternalServiceCombo, SWT.NONE);
		buttonRenameQueryParameter.setBounds(384, 118, 95, 28);
		buttonRenameQueryParameter.setText("Rename");
		addRenameQueryParameterButtonListener();
		
		buttonCreateQueryParameter = new Button(oExternalServiceCombo, SWT.NONE);
		buttonCreateQueryParameter.setBounds(384, 74, 95, 28);
		buttonCreateQueryParameter.setText("Create");
		addCreateQueryParameterButtonListener();
		
		buttonDeleteQueryParameter = new Button(oExternalServiceCombo, SWT.NONE);
		buttonDeleteQueryParameter.setBounds(384, 96, 95, 28);
		buttonDeleteQueryParameter.setText("Delete");
		addDeleteQueryParameterButtonListener();
		
		Group groupInputRepresentation = new Group(oExternalServiceCombo, SWT.NONE);
		groupInputRepresentation.setText("Input Representation:");
		groupInputRepresentation.setBounds(20, 178, 205, 86);
		
		buttonInputJSON = new Button(groupInputRepresentation, SWT.RADIO);
		buttonInputJSON.setBounds(10, 10, 171, 18);
		buttonInputJSON.setText("Application/JSON");
		addInputJSONButtonListener();
		
		buttonInputXML = new Button(groupInputRepresentation, SWT.RADIO);
		buttonInputXML.setBounds(10, 34, 131, 18);
		buttonInputXML.setText("Application/XML");
		addInputXMLButtonListener();
		
		Label lblInputProperties = new Label(oExternalServiceCombo, SWT.NONE);
		lblInputProperties.setBounds(247, 178, 160, 14);
		lblInputProperties.setText("Input Properties");
		
		listInputProperties = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listInputProperties.setBounds(247, 198, 131, 45);
		addInputPropertiesListListener();
		
		buttonInputPropertyMultiplicity = new Button(oExternalServiceCombo, SWT.CHECK);
		buttonInputPropertyMultiplicity.setBounds(247, 249, 95, 18);
		buttonInputPropertyMultiplicity.setText("Unique");
		addInputPropertyMultiplicityButtonListener();
		
		buttonCreateInputProperty = new Button(oExternalServiceCombo, SWT.NONE);
		buttonCreateInputProperty.setBounds(384, 196, 95, 28);
		buttonCreateInputProperty.setText("Create");
		addCreateInputPropertyButtonListener();
		
		buttonDeleteInputProperty = new Button(oExternalServiceCombo, SWT.NONE);
		buttonDeleteInputProperty.setBounds(384, 216, 95, 28);
		buttonDeleteInputProperty.setText("Delete");
		addDeleteInputPropertyButtonListener();
		
		buttonRenameInputProperty = new Button(oExternalServiceCombo, SWT.NONE);
		buttonRenameInputProperty.setBounds(384, 236, 95, 28);
		buttonRenameInputProperty.setText("Rename");
		addRenameInputPropertyButtonListener();
		
		Label lblType = new Label(oExternalServiceCombo, SWT.NONE);
		lblType.setBounds(485, 178, 60, 14);
		lblType.setText("Type:");
		
		listInputPropertyType = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listInputPropertyType.setItems(new String[] {"String", "Boolean", "Integer", "Float", "Double", "Complex"});
		listInputPropertyType.setBounds(485, 198, 78, 66);
		addInputPropertyTypeListListener();
		
		buttonHasInputDataModel = new Button(oExternalServiceCombo, SWT.CHECK);
		buttonHasInputDataModel.setBounds(10, 158, 143, 18);
		buttonHasInputDataModel.setText("Input Data Model");
		addInputDataModelButtonListener();
		
		buttonHasOutputDataModel = new Button(oExternalServiceCombo, SWT.CHECK);
		buttonHasOutputDataModel.setBounds(10, 288, 160, 18);
		buttonHasOutputDataModel.setText("Output Data Model");
		addOutputDataModelButtonListener();
		
		Group groupOutputRepresentation = new Group(oExternalServiceCombo, SWT.NONE);
		groupOutputRepresentation.setText("Output Representation:");
		groupOutputRepresentation.setBounds(20, 312, 205, 86);
		
		buttonOutputJSON = new Button(groupOutputRepresentation, SWT.RADIO);
		buttonOutputJSON.setText("Application/JSON");
		buttonOutputJSON.setBounds(10, 10, 171, 18);
		addOutputJSONButtonListener();
		
		buttonOutputXML = new Button(groupOutputRepresentation, SWT.RADIO);
		buttonOutputXML.setText("Application/XML");
		buttonOutputXML.setBounds(10, 34, 131, 18);
		addOutputXMLButtonListener();
		
		Label lblOutputProperties = new Label(oExternalServiceCombo, SWT.NONE);
		lblOutputProperties.setText("Output Properties");
		lblOutputProperties.setBounds(247, 308, 160, 14);
		
		listOutputProperties = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listOutputProperties.setBounds(247, 329, 131, 45);
		addOutputPropertiesListListener();
		
		buttonOutputPropertyMultiplicity = new Button(oExternalServiceCombo, SWT.CHECK);
		buttonOutputPropertyMultiplicity.setText("Unique");
		buttonOutputPropertyMultiplicity.setBounds(247, 380, 95, 18);
		addOutputPropertyMultiplicityButtonListener();
		
		buttonCreateOutputProperty = new Button(oExternalServiceCombo, SWT.NONE);
		buttonCreateOutputProperty.setText("Create");
		buttonCreateOutputProperty.setBounds(384, 323, 95, 28);
		addCreateOutputPropertyButtonListener();
		
		buttonDeleteOutputProperty = new Button(oExternalServiceCombo, SWT.NONE);
		buttonDeleteOutputProperty.setText("Delete");
		buttonDeleteOutputProperty.setBounds(384, 346, 95, 28);
		addDeleteOutputPropertyButtonListener();
		
		buttonRenameOutputProperty = new Button(oExternalServiceCombo, SWT.NONE);
		buttonRenameOutputProperty.setText("Rename");
		buttonRenameOutputProperty.setBounds(384, 370, 95, 28);
		addRenameOutputPropertyButtonListener();
		
		Label lbOutputType = new Label(oExternalServiceCombo, SWT.NONE);
		lbOutputType.setText("Type:");
		lbOutputType.setBounds(485, 312, 60, 14);
		
		listOutputPropertyType = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listOutputPropertyType.setItems(new String[] {"String", "Boolean", "Integer", "Float", "Double", "Complex"});
		listOutputPropertyType.setBounds(485, 332, 78, 66);
		addOutputPropertyTypeListListener();
		
		buttonPersistOutput = new Button(oExternalServiceCombo, SWT.CHECK);
		buttonPersistOutput.setBounds(10, 413, 215, 18);
		buttonPersistOutput.setText("Persist Output to local database");
		persistOutputDataModelButtonListener();
		
		Label labelType = new Label(oExternalServiceCombo, SWT.NONE);
		labelType.setBounds(231, 416, 60, 14);
		labelType.setText("Type:");
		
		listPersistenceType = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listPersistenceType.setItems(new String[] {"Auto", "Existent"});
		listPersistenceType.setBounds(282, 419, 78, 39);
		addPersistenceTypeListListener();
		
		Label lblResource = new Label(oExternalServiceCombo, SWT.NONE);
		lblResource.setBounds(375, 416, 60, 14);
		lblResource.setText("Resource:");
		
		listExistentCRUDResources = new List(oExternalServiceCombo, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		listExistentCRUDResources.setBounds(441, 416, 122, 56);
		addExistentCRUDResourceListListener();
		
		Label labelSeperatorInputModel = new Label(oExternalServiceCombo, SWT.SEPARATOR | SWT.HORIZONTAL);
		labelSeperatorInputModel.setBounds(7, 273, 556, 2);
		
		Label labelSeperatorOutputModel = new Label(oExternalServiceCombo, SWT.SEPARATOR | SWT.HORIZONTAL);
		labelSeperatorOutputModel.setBounds(10, 150, 556, 2);
		
		initializeWizardSWTs();
		  
		this.setControl(this.oWizardPageGrid);
		setPageComplete(isPageCompleted());
	}
	
	
	private void addExistentCRUDResourceListListener() {
		this.listExistentCRUDResources.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				//create new annotated element for the Non persistent CRUD Resource
				AnnCRUDResource oAnnCRUDResource = oExternalServiceLayerCIMFactory.createAnnCRUDResource();
				oAnnCRUDResource.setAnnotatesCRUDResource(oRESTfulServiceCIM.getHasResources().get(getCRUDResourceIndexByName(listExistentCRUDResources.getSelection()[0])));
				((ExistentCRUDPersistentOutput) oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel()).setIsExistentCRUDPersistentOutput(oAnnCRUDResource);
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//create new annotated element for the Non persistent CRUD Resource
				AnnCRUDResource oAnnCRUDResource = oExternalServiceLayerCIMFactory.createAnnCRUDResource();
				oAnnCRUDResource.setAnnotatesCRUDResource(oRESTfulServiceCIM.getHasResources().get(getCRUDResourceIndexByName(listExistentCRUDResources.getSelection()[0])));
				((ExistentCRUDPersistentOutput) oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel()).setIsExistentCRUDPersistentOutput(oAnnCRUDResource);
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private int getCRUDResourceIndexByName(String strCRUDResourceName) {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(strCRUDResourceName)){
					return n;
				}
			}
		}

		return -1; //throw exception in production code
	}


	private void addPersistenceTypeListListener() {
		this.listPersistenceType.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				//change the persistence type of the selected RESTClientResource
				listExistentCRUDResources.removeAll();
				if(listPersistenceType.getSelection()[0].equalsIgnoreCase("Auto")){//then this output model will be automatically persisted
					convertOutputToAutoPersistent(listRESTClientResources.getSelection()[0]);
				}
				else{//else it will be persisted through an existing CRUD Resource Model
					convertOutputToExistentCRUDPersistent(listRESTClientResources.getSelection()[0]);
					//populate the list of Existing CRUDResources
					for(int n = 0; n < oRESTfulServiceCIM.getHasResources().size(); n++){
						if(oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
							listExistentCRUDResources.add(oRESTfulServiceCIM.getHasResources().get(n).getName());
						}
					}
				}
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//change the persistence type of the selected RESTClientResource
				listExistentCRUDResources.removeAll();
				if(listPersistenceType.getSelection()[0].equalsIgnoreCase("Auto")){//then this output model will be automatically persisted
					convertOutputToAutoPersistent(listRESTClientResources.getSelection()[0]);
				}
				else{//else it will be persisted through an existing CRUD Resource Model
					convertOutputToExistentCRUDPersistent(listRESTClientResources.getSelection()[0]);
					//populate the list of Existing CRUDResources
					for(int n = 0; n < oRESTfulServiceCIM.getHasResources().size(); n++){
						if(oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
							listExistentCRUDResources.add(oRESTfulServiceCIM.getHasResources().get(n).getName());
						}
					}
				}
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addOutputPropertyTypeListListener() {
		this.listOutputPropertyType.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				//change the type of the selected property
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).setType(listOutputPropertyType.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//change the type of the selected property
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).setType(listOutputPropertyType.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addRenameOutputPropertyButtonListener() {
		this.buttonRenameOutputProperty.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//rename an existing Output Model Property 
				Shell oShell = new Shell();
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "output model property");
				if(oSimpleDialogBox.open() == Window.OK){
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().
					getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0]))
					.setName(oSimpleDialogBox.getArtefactName());;
					listOutputProperties.removeAll();
					populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addDeleteOutputPropertyButtonListener() {
		this.buttonDeleteOutputProperty.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//delete an existing Output Model Property 
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().remove(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0]));
				listOutputProperties.removeAll();
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addCreateOutputPropertyButtonListener() {
		this.buttonCreateOutputProperty.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//create a new Output Model Property 
				Shell oShell = new Shell();
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "output model property");
				if(oSimpleDialogBox.open() == Window.OK){
					ModelProperty oOutputProperty = oExternalServiceLayerCIMFactory.createModelProperty();
					oOutputProperty.setName(oSimpleDialogBox.getArtefactName());
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().add(oOutputProperty);
					listOutputProperties.add(oOutputProperty.getName());
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addOutputPropertyMultiplicityButtonListener() {
		this.buttonOutputPropertyMultiplicity.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			if(buttonOutputPropertyMultiplicity.getSelection() == true){//if the developer checked the multiplicity button
				//change the selected properties multiplicity to array
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).setIsUnique(true);
			}
			else{//otherwirse, the developer deselected it and it takes a single value
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).setIsUnique(false);
			}
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addOutputPropertiesListListener() {
		this.listOutputProperties.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				//update the multiplicity SWT of the selected property
				if(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).isIsUnique() == true){
					buttonOutputPropertyMultiplicity.setSelection(true);
				}
				else{
					buttonOutputPropertyMultiplicity.setSelection(false);
				}
				
				//update the datatype multiplicity SWT of the selected property
				if(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).getType() != null){
					listOutputPropertyType.setSelection(listOutputPropertyType.indexOf(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).getType()));
				}
				else{
					listOutputPropertyType.deselectAll();
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addOutputXMLButtonListener() {
		this.buttonOutputXML.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation().setName("APPLICATION_XML");
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addOutputJSONButtonListener() {
		this.buttonOutputJSON.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation().setName("APPLICATION_JSON");
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addInputPropertyTypeListListener() {
		this.listInputPropertyType.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				//change the type of the selected property
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).setType(listInputPropertyType.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//change the type of the selected property
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).setType(listInputPropertyType.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addInputPropertiesListListener() {
		this.listInputProperties.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				//update the multiplicity SWT of the selected property
				if(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).isIsUnique() == true){
					buttonInputPropertyMultiplicity.setSelection(true);
				}
				else{
					buttonInputPropertyMultiplicity.setSelection(false);
				}
				
				//update the datatype multiplicity SWT of the selected property
				if(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).getType() != null){
					listInputPropertyType.setSelection(listInputPropertyType.indexOf(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).getType()));
				}
				else{
					listInputPropertyType.deselectAll();
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addRenameInputPropertyButtonListener() {
		this.buttonRenameInputProperty.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//rename an existing Input Model Property 
				Shell oShell = new Shell();
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "input model property");
				if(oSimpleDialogBox.open() == Window.OK){
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().
					getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0]))
					.setName(oSimpleDialogBox.getArtefactName());;
					listInputProperties.removeAll();
					populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private int getInputPropertyIndexByName(String strAlgoResourceName, String strInputPropertyName) {
		for(int n = 0; n < this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputProperties().size(); n++){
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getName().equalsIgnoreCase(strInputPropertyName)){
				return n;
			}
		}
		
		return -1;//throw exception in production code
	}
	
	private int getOutputPropertyIndexByName(String strAlgoResourceName, String strOutputPropertyName){
		for(int n = 0; n < this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); n++){
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getName().equalsIgnoreCase(strOutputPropertyName)){
				return n;
			}
		}
		
		return -1;//throw exception in production code
	}
	
	private void addDeleteInputPropertyButtonListener() {
		this.buttonDeleteInputProperty.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//delete an existing Input Model Property 
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().remove(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0]));
				listInputProperties.removeAll();
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addCreateInputPropertyButtonListener() {
		this.buttonCreateInputProperty.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//create a new Input Model Property 
				Shell oShell = new Shell();
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "input model property");
				if(oSimpleDialogBox.open() == Window.OK){
					ModelProperty oInputProperty = oExternalServiceLayerCIMFactory.createModelProperty();
					oInputProperty.setName(oSimpleDialogBox.getArtefactName());
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().add(oInputProperty);
					listInputProperties.add(oInputProperty.getName());
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addInputPropertyMultiplicityButtonListener() {
		this.buttonInputPropertyMultiplicity.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			if(buttonInputPropertyMultiplicity.getSelection() == true){//if the developer checked the multiplicity button
				//change the selected properties multiplicity to array
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).setIsUnique(true);
			}
			else{//otherwirse, the developer deselected it and it takes a single value
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).setIsUnique(false);
			}
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addInputXMLButtonListener() {
		this.buttonInputXML.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputRepresentation().setName("APPLICATION_XML");
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addInputJSONButtonListener() {
		this.buttonInputJSON.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputRepresentation().setName("APPLICATION_JSON");
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addQueryParameterListListener() {
		this.listQueryParameters.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addDeleteQueryParameterButtonListener() {
		this.buttonDeleteQueryParameter.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			//delete an existing Query Parameter
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService()
					.getHasQueryParam().remove(findQueryParmIndexByName(listRESTClientResources.getSelection()[0],listQueryParameters.getSelection()[0]));
			listQueryParameters.removeAll();
			populateTargetServiceSWTs(listRESTClientResources.getSelection()[0]);
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addCreateQueryParameterButtonListener() {
		this.buttonCreateQueryParameter.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			//create a new Query Parameter
			Shell oShell = new Shell();
			SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "query parameter");
			if(oSimpleDialogBox.open() == Window.OK){
				QueryParam oQueryParam = oExternalServiceLayerCIMFactory.createQueryParam();
				oQueryParam.setName(oSimpleDialogBox.getArtefactName());
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().add(oQueryParam);
				listQueryParameters.add(oQueryParam.getName());
			}
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addRenameQueryParameterButtonListener() {
		this.buttonRenameQueryParameter.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			//rename an existing Query Parameter
			Shell oShell = new Shell();
			SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "query parameter");
			if(oSimpleDialogBox.open() == Window.OK){
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService()
					.getHasQueryParam().get(findQueryParmIndexByName(listRESTClientResources.getSelection()[0],listQueryParameters.getSelection()[0]))
					.setName(oSimpleDialogBox.getArtefactName());
				listQueryParameters.removeAll();
				
			}
			populateTargetServiceSWTs(listRESTClientResources.getSelection()[0]);
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}

	private int findQueryParmIndexByName(String strAlgoResourceName, String strQueryParameterName) {
		for(int n = 0; n < this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasQueryParam().size(); n++){
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasQueryParam().get(n).getName().equalsIgnoreCase(strQueryParameterName)){
				return n;
			}
		}
		
		return -1; //throw exception in production code
	}

	private void addCRUDVerbListener() {
		this.listCRUDVerb.addSelectionListener(new SelectionListener(){

		@Override
		public void widgetSelected(SelectionEvent e) {
			//update the CRUDVerb of the target service of the selected RESTClient Resource
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setCRUDVerb(listCRUDVerb.getSelection()[0]);
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			//update the CRUDVerb of the target service of the selected RESTClient Resource
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setCRUDVerb(listCRUDVerb.getSelection()[0]);
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addTargetServiceURLListener() {
		
		this.textTargetServiceURL.addModifyListener(new ModifyListener(){
			
			public void modifyText(ModifyEvent event) {
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setTargetURL(textTargetServiceURL.getText());
				updateWidgetStatus();
				setPageComplete(isPageCompleted());	
			}});
	}

	private void persistOutputDataModelButtonListener() {
		this.buttonPersistOutput.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				if(buttonPersistOutput.getSelection() == true){
					convertOutputToAutoPersistent(listRESTClientResources.getSelection()[0]);
				}
				else{
					convertOutputToNonPersistent(listRESTClientResources.getSelection()[0]);
				}
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void convertOutputToAutoPersistent(String strAlgoResourceName) {
		int iRESTClientIndex = this.getAlgoResourceIndexByName(strAlgoResourceName);
		AutoPersistentOutput oAutoPersistentOutput = this.oExternalServiceLayerCIMFactory.createAutoPersistentOutput();
		oAutoPersistentOutput.setHasOutputRepresentation(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation());
		oAutoPersistentOutput.getHasOutputProperties().addAll(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties());
		this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().setHasOutputDataModel(oAutoPersistentOutput);
	}
	
	private void convertOutputToNonPersistent(String strAlgoResourceName) {
		int iRESTClientIndex = this.getAlgoResourceIndexByName(strAlgoResourceName);
		NonPersistentOutput oNonPersistentOutput = this.oExternalServiceLayerCIMFactory.createNonPersistentOutput();
		oNonPersistentOutput.setHasOutputRepresentation(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation());
		oNonPersistentOutput.getHasOutputProperties().addAll(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties());
		this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().setHasOutputDataModel(oNonPersistentOutput);
	}
	
	private void convertOutputToExistentCRUDPersistent(String strAlgoResourceName) {
		int iRESTClientIndex = this.getAlgoResourceIndexByName(strAlgoResourceName);
		ExistentCRUDPersistentOutput oExistentCRUDPersistentOutput = this.oExternalServiceLayerCIMFactory.createExistentCRUDPersistentOutput();
		oExistentCRUDPersistentOutput.setHasOutputRepresentation(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation());
		oExistentCRUDPersistentOutput.getHasOutputProperties().addAll(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties());
		this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().setHasOutputDataModel(oExistentCRUDPersistentOutput);
	}
	
	private void addOutputDataModelButtonListener() {
		this.buttonHasOutputDataModel.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				if(buttonHasOutputDataModel.getSelection() == true){ //if it checked, create an Output Data Model
					NonPersistentOutput oNonPersistentOutput = oExternalServiceLayerCIMFactory.createNonPersistentOutput();
					Representation oRepresentation = oExternalServiceLayerCIMFactory.createRepresentation();
					oRepresentation.setName("");
					oNonPersistentOutput.setHasOutputRepresentation(oRepresentation);
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setHasOutputDataModel(oNonPersistentOutput);
				}
				else{//else the developer deselected it, so delete it
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setHasOutputDataModel(null);
				}
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addInputDataModelButtonListener() {
		this.buttonHasInputDataModel.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				if(buttonHasInputDataModel.getSelection() == true){ //if it checked, create an Input Data Model
					InputDataModel oInputDataModel = oExternalServiceLayerCIMFactory.createInputDataModel();
					Representation oRepresentation = oExternalServiceLayerCIMFactory.createRepresentation();
					oRepresentation.setName("");
					oInputDataModel.setHasInputRepresentation(oRepresentation);
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setHasInputDataModel(oInputDataModel);
				}
				else{//else the developer deselected it, so delete it
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setHasInputDataModel(null);
				}
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addRemoveRESTClientResourceButtonListener() {
		this.buttonRemoveRESTClientResource.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				oRESTClientResourcesArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])] = false;
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])] = null;
				listAvailableResources.add(listRESTClientResources.getSelection()[0]);
				populateRESTClientResourcesList();
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	protected void populateRESTClientResourcesList() {
		this.listRESTClientResources.removeAll();
		for(int n = 0 ; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if((this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true) &&
					(isRESTClientResource(this.oRESTfulServiceCIM.getHasResources().get(n).getName()))){
				this.listRESTClientResources.add(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
			}
		}
	}


	private void addRESTClientResourceListListener() {
		this.listRESTClientResources.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void populateAllRESTClientSWTs(String strAlgoResourceName) {
		populateTargetServiceSWTs(strAlgoResourceName);
		populateInputModelSWTs(strAlgoResourceName);
		populateOutputModelSWTs(strAlgoResourceName);
		
	}

	private void populateOutputModelSWTs(String strAlgoResourceName) {
		if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel() != null){
			this.buttonHasOutputDataModel.setSelection(true);
			
			//populate the output representation
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation() != null){
				if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation().getName().equalsIgnoreCase("application/JSON")){
					this.buttonOutputJSON.setSelection(true);
				}
				else if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation().getName().equalsIgnoreCase("application/XML")){
					this.buttonOutputXML.setSelection(true);
				}
				else{
					this.buttonOutputJSON.setSelection(false);
					this.buttonOutputXML.setSelection(false);
				}
			}
			else{
				this.buttonOutputJSON.setSelection(false);
				this.buttonOutputXML.setSelection(false);
			}
			
			//populate the output model parameters list
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size() > 0){
				this.listOutputProperties.removeAll();
				this.listOutputPropertyType.deselectAll();
				for(int n = 0; n < this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); n++){
					this.listOutputProperties.add(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getName());
				}
			}
			else{
				this.listOutputProperties.removeAll();
				this.listOutputPropertyType.deselectAll();
			}
		}
		else{
			this.buttonHasOutputDataModel.setSelection(false);
			this.buttonOutputJSON.setSelection(false);
			this.buttonOutputXML.setSelection(false);
			this.buttonOutputPropertyMultiplicity.setSelection(false);
			this.listOutputProperties.removeAll();
			this.listOutputPropertyType.deselectAll();
			this.buttonPersistOutput.setEnabled(false);
			this.listPersistenceType.deselectAll();
			this.listPersistenceType.setEnabled(false);
			this.listExistentCRUDResources.removeAll();
		}
		populatePersistenceSWTs(strAlgoResourceName);
	}


	private void populatePersistenceSWTs(String strAlgoResourceName) {
		if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel() instanceof AutoPersistentOutput||
		   this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput){
			this.buttonPersistOutput.setSelection(true);
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput){
				this.listPersistenceType.setSelection(1); //existing CRUD
				//populate existing CRUD Resources list
				this.listExistentCRUDResources.removeAll();
				for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
					if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
						this.listExistentCRUDResources.add(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
					}
				}
				ExistentCRUDPersistentOutput oExistentCRUDPersistentOutput = (ExistentCRUDPersistentOutput)this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel();
				if(oExistentCRUDPersistentOutput.getIsExistentCRUDPersistentOutput() != null){
					this.listExistentCRUDResources.setSelection(this.listExistentCRUDResources.indexOf(oExistentCRUDPersistentOutput.getIsExistentCRUDPersistentOutput().getAnnotatesCRUDResource().getName()));
				}
			}
			else{
				this.listPersistenceType.setSelection(0); //auto
				this.listExistentCRUDResources.removeAll();
			}
		}
		else{
			this.buttonPersistOutput.setEnabled(false);
			this.buttonPersistOutput.setSelection(false);
			this.listPersistenceType.deselectAll();
			this.listPersistenceType.setEnabled(false);
			this.listExistentCRUDResources.removeAll();
			this.listExistentCRUDResources.setEnabled(false);
		}
		
	}


	private void populateInputModelSWTs(String strAlgoResourceName) {
		if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel() != null){
			this.buttonHasInputDataModel.setSelection(true);
			
			//populate the input representation
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputRepresentation() != null){
				if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputRepresentation().getName().equalsIgnoreCase("application/JSON")){
					this.buttonInputJSON.setSelection(true);
				}
				else if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputRepresentation().getName().equalsIgnoreCase("application/XML")){
					this.buttonInputXML.setSelection(true);
				}
				else{
					this.buttonInputJSON.setSelection(false);
					this.buttonInputXML.setSelection(false);
				}
			}
			else{
				this.buttonInputJSON.setSelection(false);
				this.buttonInputXML.setSelection(false);
			}
			
			//populate the input model parameters list
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputProperties().size() > 0){
				this.listInputProperties.removeAll();
				this.listInputPropertyType.deselectAll();
				for(int n = 0; n < this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputProperties().size(); n++){
					this.listInputProperties.add(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getName());
				}
			}
			else{
				this.listInputProperties.removeAll();
				this.listInputPropertyType.deselectAll();
			}
		}
		else{
			this.buttonHasInputDataModel.setSelection(false);
			this.buttonInputJSON.setSelection(false);
			this.buttonInputXML.setSelection(false);
			this.buttonInputPropertyMultiplicity.setSelection(false);
			this.listInputProperties.removeAll();
			this.listInputPropertyType.deselectAll();
		}
	}


	private void populateTargetServiceSWTs(String strAlgoResourceName) {
		if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService() != null){
			TargetRESTService oTargetRESTService = this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService();
			
			//set up the target service URL
			this.textTargetServiceURL.setText(oTargetRESTService.getTargetURL());
			//set up the CRUD Verb to be used
			if(oTargetRESTService.getCRUDVerb() != null){
				this.listCRUDVerb.setSelection(this.listCRUDVerb.indexOf(oTargetRESTService.getCRUDVerb().toUpperCase()));
			}
			else{
				this.listCRUDVerb.deselectAll();
			}
			
			//set up the query parameters list
			this.listQueryParameters.removeAll();
			if(oTargetRESTService.getHasQueryParam() != null){
				for(int n = 0; n < oTargetRESTService.getHasQueryParam().size(); n++){
					this.listQueryParameters.add(oTargetRESTService.getHasQueryParam().get(n).getName());
				}
			}
		}
		else{
			this.textTargetServiceURL.setText("");
			this.listCRUDVerb.deselectAll();
			this.listQueryParameters.removeAll();
		}
	}


	private void addAddRESTClientResourceButtonListener() {
		this.buttonAddRESTClientResource.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				oRESTClientResourcesArray[getAlgoResourceIndexByName(listAvailableResources.getSelection()[0])] = true;
				listRESTClientResources.add(listAvailableResources.getSelection()[0]);
				populateRESTClientResource(listAvailableResources.getSelection()[0]);
				populateAvailableResourcesList();
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}
	


	private void populateRESTClientResource(String strCoreResourceName) {
		//create an AnnAlgoResource
		AnnAlgoResource oAnnAlgoResource = this.oExternalServiceLayerCIMFactory.createAnnAlgoResource();
		
		//associate it with the core CIM algo Resource
		oAnnAlgoResource.setAnnotatesAlgoResource(findCoreCIMResourceReference(strCoreResourceName));
		
		//create the RESTClientResource
		RESTClientResource oRESTClientResource = this.oExternalServiceLayerCIMFactory.createRESTClientResource();
		
		//associate it with the AnnAlgoResource
		oRESTClientResource.setIsRESTClientResource(oAnnAlgoResource);
		
		//create the Target REST Service annotation
		TargetRESTService oTargetRESTService = oExternalServiceLayerCIMFactory.createTargetRESTService();
		oTargetRESTService.setTargetURL("");
		
		this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strCoreResourceName)] = oRESTClientResource;
		this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strCoreResourceName)].setTargetsService(oTargetRESTService);

	}
	
	private Resource findCoreCIMResourceReference(String strCoreResourceName) {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(strCoreResourceName)){
				return this.oRESTfulServiceCIM.getHasResources().get(n);
			}
		}
		
		return null;//throw exception in production code instead
	}


	private void populateAvailableResourcesList(){
		this.listAvailableResources.removeAll();
		for(int n = 0 ; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if((this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true) &&
					(!isRESTClientResource(this.oRESTfulServiceCIM.getHasResources().get(n).getName()))){
				this.listAvailableResources.add(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
			}
		}
	}

	private boolean isRESTClientResource(String strResourceName) {
		if(this.oRESTClientResourcesArray[getAlgoResourceIndexByName(strResourceName)] == true){
			return true;
		}
		return false;
	}


	private void addAvailableResourcesListListener() {
		this.listAvailableResources.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void initializeWizardSWTs() {
		//initialize the values of all the SWT widgets
		initializeResourcesGridSWTs();
		initializeTargetServiceSWTs();
		
		updateWidgetStatus();
		
		this.oParentComposite.layout();
	}

	private void initializeTargetServiceSWTs() {
		initializeOutputModelSWTs();
		initializeInputModelSWTs();
	}

	private void initializeOutputModelSWTs() {
		// TODO Auto-generated method stub
		
	}

	private void initializeInputModelSWTs() {
		// TODO Auto-generated method stub
		
	}

	private void initializeResourcesGridSWTs() {
		//initialize available resources list
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(this.oRESTfulServiceCIM.getHasResources().get(i).isIsAlgorithmic() == true){
				this.listAvailableResources.add(this.oRESTfulServiceCIM.getHasResources().get(i).getName());
			}
		}
		
	}

	private void updateWidgetStatus() {
		updateResourcesSWTStatus();
		updateTargetServiceSWTStatus();
	}
	
	private void updateResourcesSWTStatus() {
		updateAddRemoveClientResourceButtonStatus();
		udpateClientResourceListStatus();
		
	}

	private void udpateClientResourceListStatus() {
		if(this.listRESTClientResources.getItemCount() > 0){
			this.listRESTClientResources.setEnabled(true);
		}
		else{
			this.listRESTClientResources.setEnabled(false);
		}
		
	}

	private void updateAddRemoveClientResourceButtonStatus() {
		//update the status of the add REST client button
		if(this.listAvailableResources.getSelectionIndex() != -1){
			this.buttonAddRESTClientResource.setEnabled(true);
		}
		else{
			this.buttonAddRESTClientResource.setEnabled(false);
		}
		
		//update the status of the remove REST client button
		if(this.listRESTClientResources.getSelectionIndex() != -1){
			this.buttonRemoveRESTClientResource.setEnabled(true);
		}
		else{
			this.buttonRemoveRESTClientResource.setEnabled(false);
		}
	}

	private void updateTargetServiceSWTStatus() {
		updateGeneralTargetServiceSWTs();
		updateInputDataSWTs();
		updateOutputDataSWTs();
	}

	private void updateGeneralTargetServiceSWTs() {
		if(this.listRESTClientResources.getSelectionIndex() != -1){
			this.textTargetServiceURL.setEnabled(true);
			this.listCRUDVerb.setEnabled(true);
			this.listQueryParameters.setEnabled(true);
			this.buttonCreateQueryParameter.setEnabled(true);
			if(this.listQueryParameters.getSelectionIndex() != -1){
				this.buttonDeleteQueryParameter.setEnabled(true);
				this.buttonRenameQueryParameter.setEnabled(true);	
			}
			else{
				this.buttonDeleteQueryParameter.setEnabled(false);
				this.buttonRenameQueryParameter.setEnabled(false);
			}
		}
		else{
			this.textTargetServiceURL.setEnabled(false);
			this.listCRUDVerb.setEnabled(false);
			this.listQueryParameters.setEnabled(false);
			this.buttonCreateQueryParameter.setEnabled(false);
			this.buttonDeleteQueryParameter.setEnabled(false);
			this.buttonRenameQueryParameter.setEnabled(false);
		}
	}


	private void updateOutputDataSWTs() {
		if(this.listRESTClientResources.getSelectionIndex() != -1){//if a RESTClientResource is selected
			this.buttonHasOutputDataModel.setEnabled(true);
			if(this.buttonHasOutputDataModel.getSelection() == true){ //if the user checked the Output Data Model checkbox
				this.buttonOutputJSON.setEnabled(true);
				this.buttonOutputXML.setEnabled(true);
				this.listOutputProperties.setEnabled(true);
				this.buttonCreateOutputProperty.setEnabled(true);
				this.buttonPersistOutput.setEnabled(true);
				if(this.listOutputProperties.getSelectionIndex() != -1){ //if the user has an output property selected
					this.buttonOutputPropertyMultiplicity.setEnabled(true);
					this.buttonDeleteOutputProperty.setEnabled(true);
					this.buttonRenameOutputProperty.setEnabled(true);
					this.listOutputPropertyType.setEnabled(true);
				}
				else{
					disableOutputPropertySWTs();
				}
				if(this.buttonPersistOutput.getSelection() == true){//if the user checked the persist output checkbox
					this.listPersistenceType.setEnabled(true);
					if(this.listPersistenceType.getSelectionIndex() != -1){
						if(this.listPersistenceType.getSelection()[0].equalsIgnoreCase("Existent")){//if the user checked the Existent type of persistence
							this.listExistentCRUDResources.setEnabled(true);
						}
						else{
							this.listExistentCRUDResources.setEnabled(false);
						}
					}
				}
				else{
					disablePersistOutputSWTs();
				}
			}
			else{
				disableAllOutputDataSWTs();
			}
		}
		else{
			this.buttonHasOutputDataModel.setEnabled(false);
			this.buttonOutputJSON.setEnabled(false);
			this.buttonOutputXML.setEnabled(false);
			this.listOutputProperties.setEnabled(false);
			this.buttonCreateOutputProperty.setEnabled(false);
			this.buttonOutputPropertyMultiplicity.setEnabled(false);
			this.buttonDeleteOutputProperty.setEnabled(false);
			this.buttonRenameOutputProperty.setEnabled(false);
			this.listOutputPropertyType.setEnabled(false);
			this.buttonPersistOutput.setEnabled(false);
			this.listPersistenceType.setEnabled(false);
			this.listExistentCRUDResources.setEnabled(false);
		}
	}
	
	private void disableOutputPropertySWTs() {
		this.buttonOutputPropertyMultiplicity.setEnabled(false);
		this.buttonDeleteOutputProperty.setEnabled(false);
		this.buttonRenameOutputProperty.setEnabled(false);
		this.listOutputPropertyType.setEnabled(false);
	}


	private void disableAllOutputDataSWTs() {
		this.buttonOutputJSON.setEnabled(false);
		this.buttonOutputXML.setEnabled(false);
		this.listOutputProperties.setEnabled(false);
		this.buttonCreateOutputProperty.setEnabled(false);
		this.buttonOutputPropertyMultiplicity.setEnabled(false);
		this.buttonDeleteOutputProperty.setEnabled(false);
		this.buttonRenameOutputProperty.setEnabled(false);
		this.listOutputPropertyType.setEnabled(false);
		this.buttonPersistOutput.setEnabled(false);
		this.listPersistenceType.setEnabled(false);
		this.listExistentCRUDResources.setEnabled(false);
	}


	private void disablePersistOutputSWTs(){
		this.listPersistenceType.setEnabled(false);
		this.listExistentCRUDResources.setEnabled(false);
	}

	private void updateInputDataSWTs() {
		if(this.listRESTClientResources.getSelectionIndex() != -1){//if a RESTClientResource is selected
			this.buttonHasInputDataModel.setEnabled(true);
			if(this.buttonHasInputDataModel.getSelection() == true){ //if the user checked the Input Data Model checkbox
				this.buttonInputJSON.setEnabled(true);
				this.buttonInputXML.setEnabled(true);
				this.listInputProperties.setEnabled(true);
				this.buttonCreateInputProperty.setEnabled(true);
				if(this.listInputProperties.getSelectionIndex() != -1){ //if the user has an input property selected
					this.buttonInputPropertyMultiplicity.setEnabled(true);
					this.buttonDeleteInputProperty.setEnabled(true);
					this.buttonRenameInputProperty.setEnabled(true);
					this.listInputPropertyType.setEnabled(true);
				}
				else{
					this.buttonInputPropertyMultiplicity.setEnabled(false);
					this.buttonDeleteInputProperty.setEnabled(false);
					this.buttonRenameInputProperty.setEnabled(false);
					this.listInputPropertyType.setEnabled(false);
				}
			}
			else{
				this.buttonInputJSON.setEnabled(false);
				this.buttonInputXML.setEnabled(false);
				this.listInputProperties.setEnabled(false);
				this.buttonCreateInputProperty.setEnabled(false);
				this.buttonInputPropertyMultiplicity.setEnabled(false);
				this.buttonDeleteInputProperty.setEnabled(false);
				this.buttonRenameInputProperty.setEnabled(false);
				this.listInputPropertyType.setEnabled(false);
			}
		}
		else{
			this.buttonHasInputDataModel.setEnabled(false);
			this.buttonInputJSON.setEnabled(false);
			this.buttonInputXML.setEnabled(false);
			this.listInputProperties.setEnabled(false);
			this.buttonCreateInputProperty.setEnabled(false);
			this.buttonInputPropertyMultiplicity.setEnabled(false);
			this.buttonDeleteInputProperty.setEnabled(false);
			this.buttonRenameInputProperty.setEnabled(false);
			this.listInputPropertyType.setEnabled(false);
		}
	}
	
	private int getNumberOfAvailableAlgoResources() {
		int i = 0;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true){
				if(!isSearchResource(this.oRESTfulServiceCIM.getHasResources().get(n))){
					i++;
				}
			}
		}
		
		return i;
	}

	private boolean isSearchResource(Resource oAlgoResource) {
		// TODO add check whether an algorithmic resource is a search resource
		
		return false;
	}
	
	private int getAlgoResourceIndexByName(String strAlgoResourceName){
		int i = -1;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true){
				i++;
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(strAlgoResourceName)){
					return i;
				}
			}
		}

		return -1; //throw exception in production code
	}


	public void createExternalServiceLayerCIM(){
		for(int n = 0; n < this.oRESTClientResourcesArray.length; n++){
			if(this.oRESTClientResourcesArray[n] == true){
				//add the RESTClientResource Annotation
				this.oExternalServiceLayerCIM.getHasAnnotation().add(this.oRESTClientModelingArray[n]);
				
				//add the AnnAlgoResource Annotation that is referenced by the RESTClient Resource
				this.oExternalServiceLayerCIM.getHasAnnotatedElement().add(this.oRESTClientModelingArray[n].getIsRESTClientResource());
				
				//if it persists its output using an existing CRUD resource, add the AnnCRUDResource annotation
				if(this.oRESTClientModelingArray[n].getTargetsService().getHasOutputDataModel() != null){
					if(this.oRESTClientModelingArray[n].getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput){
						this.oExternalServiceLayerCIM.getHasAnnotatedElement().add(((ExistentCRUDPersistentOutput)this.oRESTClientModelingArray[n].getTargetsService().getHasOutputDataModel()).getIsExistentCRUDPersistentOutput());
					}
				}
			}
		}

	}
	
	private boolean isPageCompleted(){
		if(this.isValidExternalCompositionCIMModel()){
			return true;
		}
		
		return false;
	}
	
	private boolean isValidExternalCompositionCIMModel(){
		
		//validate each RESTClientResource
		for(int n = 0; n < this.oRESTClientResourcesArray.length; n++){
			if(this.oRESTClientResourcesArray[n] == true)//if it is a RESTClientResource
			{
				if(!RESTClientHasTargetURL(n)){
					return false;
				}
				
				if(!RESTClientHasCRUDVerb(n)){
					return false;
				}
				
				if(this.oRESTClientModelingArray[n].getTargetsService().getHasInputDataModel() != null){
					if(!RESTClientHasValidInputModel(n)){
						return false;
					}
				}
				
				if(this.oRESTClientModelingArray[n].getTargetsService().getHasOutputDataModel() != null){
					if(!RESTClientHasValidOutputModel(n)){
						return false;
					}
				}
			}
		}
		
		setErrorMessage(null);
		return true;
	}


	private boolean RESTClientHasValidOutputModel(int iRESTClientIndex) {
		//check if the service has output model
		if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel() != null){
			//if it has an output model, check whether it has an output representation
			if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation().getName() == null ||
			   this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation().getName().isEmpty()){
				setErrorMessage("All RESTClient Resources that have an output data model, must have a JSON or XML representation. RESTClient Resource " +
			       this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
				return false;
			}
			
			//check if it has at least one output property
			if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size() <= 0){
				setErrorMessage("All RESTClient Resources that have an output data model, must have at least one output property. RESTClient Resource " +
					       this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
				return false;
			}
			else{
				//check if each property has a Type
				for(int n = 0; n < this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); n++){
					if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getType() == null){
						setErrorMessage("Every output data property must have a type. Output data property " +
							       this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getName() + " of RESTClient Resource " +  
								this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
						return false;
					}
				}
			}
		}
		
		return RESTClientHasValidPersistenceModel(iRESTClientIndex);
	}

	
	private boolean RESTClientHasValidPersistenceModel(int iRESTClientIndex) {

		if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput){
			//if the persistence type uses an existent CRUT resource, one such must be selected
			if(((ExistentCRUDPersistentOutput)this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel()).getIsExistentCRUDPersistentOutput() == null){
				setErrorMessage("All RESTClient Resources that persist their output using an existing resoruce, must have one such resource selected. RESTClient Resource " +
					       this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
				return false;
			}
		}
		
		return true;
	}

	
	private boolean RESTClientHasValidInputModel(int iRESTClientIndex) {
		//check if the service has input model
		if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel() != null){
			//if it has an input model, check whether it has an input representation
			if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputRepresentation().getName() == null ||
			   this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputRepresentation().getName().isEmpty()){
				setErrorMessage("All RESTClient Resources that have an input data model, must have a JSON or XML representation. RESTClient Resource " +
			       this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
				return false;
			}
			
			//check if it has at least one input property
			if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputProperties().size() <= 0){
				setErrorMessage("All RESTClient Resources that have an input data model, must have at least one input property. RESTClient Resource " +
					       this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
				return false;
			}
			else{
				//check if each property has a Type
				for(int n = 0; n < this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputProperties().size(); n++){
					if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getType() == null){
						setErrorMessage("Every input data property must have a type. Input data property " +
							       this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getName() + " of RESTClient Resource " +  
								this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
						return false;
					}
				}
			}
		}
		
		return true;
	}


	private boolean RESTClientHasCRUDVerb(int iRESTClientIndex) {
		if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getCRUDVerb() == null ||
				   this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getCRUDVerb().isEmpty()){
					setErrorMessage("All RESTClient Resources must have a target service CRUD Verb. RESTClient Resource " + this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have a target CRUD Verb.");
					return false;
				}
		return true;
	}


	private boolean RESTClientHasTargetURL(int iRESTClientIndex) {
		if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getTargetURL() == null ||
		   this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getTargetURL().isEmpty()){
			setErrorMessage("All RESTClient Resources must have a target service URL. RESTClient Resource " + this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have a target URL.");
			return false;
		}
		
		return true;
	}
}