package eu.fp7.scase.searchWizard;

import java.util.concurrent.ExecutionException;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;

import eu.fp7.scase.launcher.cimgenerator.Activator;
import SearchLayerCIM.AnnAlgoResource;
import SearchLayerCIM.AnnCRUDResource;
import SearchLayerCIM.AnnProperty;
import SearchLayerCIM.SearchLayerCIMFactory;
import SearchLayerCIM.SearchResource;
import SearchLayerCIM.SearchableProperty;
import SearchLayerCIM.SearchableResource;
import ServiceCIM.Property;
import ServiceCIM.RESTfulServiceCIM;
import ServiceCIM.Resource;


public class SearchCIMWizardPage extends WizardPage{
	
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private SearchLayerCIM.AnnotationModel oSearchLayerCIM;
	private SearchLayerCIMFactory oSearchLayerCIMFactory;
	private Composite oWizardPageGrid;
	private Composite oParentComposite;
	private boolean[] oSelectedResourcesArray;
	private boolean [][][] oSelectedSearchablePropertiesArray;
	private boolean bReloadExistingModels;
	private int iMaxSearchResourcesAllowed;
	
	private Label oSearchResourcePromptLabel;
	private Label oSelectedSearchResourceLabel;
	private List oSearchResourcePromptList;
	private List oSelectedSearchResourceList;
	private Button oAddSearchResourceButton;
	private Button oRemoveSearchResourceButton;
	private Composite oSearchResourceGrid;
	private Composite oSearchResourceAddRemoveButtonsGrid;
	private Composite oSearchResourcePromptGrid;
	private Composite oSelectedSearchResourceGrid;
	
	//Searchable properties selection SWTs
	private Label oAddSearchablePropertiesLabel;
	private Label oSearchableResourcesLabel;
	private Label oSearchablePropertiesLabel;
	private Label oSelectedPropertiesLabel;
	private List oSearchableResourcesPromptList;
	private List oSearchablePropertiesPromptList;
	private List oSelectedPropertiesList;
	private Button oAddSearchablePropertyButton;
	private Button oRemoveSearchablePropertyButton;
	private Composite oSearchablePropertiesGrid;
	private Composite oSearchableResourceGrid;
	private Composite oSearchablePropertyGrid;
	private Composite oSearchablePropertiesAddRemoveButtonGrid;
	private Composite oSelectedPropertiesGrid;

	
	public SearchCIMWizardPage(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, SearchLayerCIM.AnnotationModel oSearchLayerCIM, AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM, int iMaxSearchResourcesAllowed, boolean bReloadExistingModels) {
		  super("External Service Editor");
		  this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		  this.oSearchLayerCIM = oSearchLayerCIM;
		  this.oSearchLayerCIMFactory = SearchLayerCIMFactory.eINSTANCE;
		  this.oSelectedResourcesArray = new boolean[getNumberOfAlgoResources()];
		  this.oSelectedSearchablePropertiesArray = new boolean[getNumberOfAlgoResources()][getNumberOfCRUDResources()][];
		  this.bReloadExistingModels = bReloadExistingModels;
		  this.iMaxSearchResourcesAllowed = iMaxSearchResourcesAllowed;
		  for(int n = 0; n < this.getNumberOfAlgoResources(); n++)
			  for(int i = 0; i < this.getNumberOfCRUDResources(); i++)
				  this.oSelectedSearchablePropertiesArray[n][i] = new boolean[getCRUDResourceByIndex(i).getHasProperty().size()];
	}


	@Override
	public void createControl(Composite parent) {
		  this.oParentComposite = parent;
		  this.oWizardPageGrid = new Composite(oParentComposite, SWT.NONE);
		  this.oWizardPageGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
		  this.oWizardPageGrid.setLayout(new GridLayout(1, false));
		  
		  initializeWizardSWTs();
		  
		  if(this.bReloadExistingModels == true){
			  reloadSearchCIMModel();
			  if(this.atLeastOneSearchResourceExists()){
				  this.oSelectedSearchResourceList.setSelection(0);
				  populateSelectedProperties();
			  }
			  updateWidgetStatus();
		  }
		  
		  this.setControl(this.oWizardPageGrid);
		  setPageComplete(isPageCompleted());
	}
	
	private void reloadSearchCIMModel() {
		//populate the available resources list with any algorithmic resources that still exist after CIM editor
		reloadResourcesLists();
		
		//reload any parts of the previous Search CIM Model
		reloadValidSearchCIMModel();
	}


	private void reloadResourcesLists() {

		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true){
				//check if this algorithmic resource was a search resource in the loaded Search CIM Model
				if(!isAlreadySearchResource(this.getAlgoResourceIndexByName(this.oRESTfulServiceCIM.getHasResources().get(n).getName()))){//if it is not
					//it is an available resource, so it has to be added to that list
					this.oSearchResourcePromptList.add(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
					this.oSelectedResourcesArray[this.getAlgoResourceIndexByName(this.oRESTfulServiceCIM.getHasResources().get(n).getName())] = false;
				}
				else{
					this.oSelectedSearchResourceList.add(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
					this.oSelectedResourcesArray[this.getAlgoResourceIndexByName(this.oRESTfulServiceCIM.getHasResources().get(n).getName())] = true;
				}
			}
		}
	}


	private boolean isAlreadySearchResource(int iAlgoResourceIndex) {
		for(int n = 0; n < this.oSearchLayerCIM.getHasAnnotation().size(); n++){
			if(this.oSearchLayerCIM.getHasAnnotation().get(n) instanceof SearchResource){
				//check if the reference to CORE model is still valid
				Resource oCoreResource = ((SearchResource)this.oSearchLayerCIM.getHasAnnotation().get(n)).getAlgoResourceIsSearchResource().getAnnotatesAlgoResource();
				if(oCoreResource.getName() == null){
					return false;
				}
				else if(((SearchResource)this.oSearchLayerCIM.getHasAnnotation().get(n)).getAlgoResourceIsSearchResource().getAnnotatesAlgoResource().getName().equalsIgnoreCase(this.getAlgoResourceByIndex(iAlgoResourceIndex).getName())){
					return true;
				}
			}
		}
		return false;
	}


	private void reloadValidSearchCIMModel() {
		for(int n = 0; n < this.getNumberOfAlgoResources(); n++){
			if(this.isAlreadySearchResource(n)){//if this algorithmic resource was marked as search resource in loaded model
				//load its Search CIM model Searchable Resources and properties
				SearchResource oSearchResource = getExistingSearchResourceByName(this.getAlgoResourceByIndex(n).getName());
				addValidSearchResourceSearchableProperties(oSearchResource);
			}
		}
	}

	private void addValidSearchResourceSearchableProperties(SearchResource oSearchResource) {
		for(int n = 0; n < oSearchResource.getSearchesResource().size(); n++){
			//if this CRUDResource still exists in Core CIM
			if(this.getCRUDResourceIndexByName(oSearchResource.getSearchesResource().get(n).getResourceIsSearchable().getAnnotatesResource().getName()) != -1){
				//check if the searchable properties still exist in Core CIM model
				for(int i = 0; i < oSearchResource.getSearchesResource().get(n).getHasSearchableProperty().size(); i++){
					if(propertyStillExists(this.getCRUDResourceIndexByName(oSearchResource.getSearchesResource().get(n).getResourceIsSearchable().getAnnotatesResource().getName()), oSearchResource.getSearchesResource().get(n).getHasSearchableProperty().get(i).getPropertyIsSearchable().getAnnotatesProperty().getName())){
						//load its details to the Search CIM model
						loadSearchablePropertyToSearchCIMModel(oSearchResource.getAlgoResourceIsSearchResource().getAnnotatesAlgoResource().getName(), this.getCRUDResourceIndexByName(oSearchResource.getSearchesResource().get(n).getResourceIsSearchable().getAnnotatesResource().getName()), oSearchResource.getSearchesResource().get(n).getHasSearchableProperty().get(i).getPropertyIsSearchable().getAnnotatesProperty().getName());
					}
				}
			}
		}
		
	}


	private void loadSearchablePropertyToSearchCIMModel(String strSearchResourceName, int CRUDResourceIndex, String strOldPropertyName) {
		for(int n = 0; n < this.getCRUDResourceByIndex(CRUDResourceIndex).getHasProperty().size(); n++){
			if(this.getCRUDResourceByIndex(CRUDResourceIndex).getHasProperty().get(n).getName().equalsIgnoreCase(strOldPropertyName)){
				this.oSelectedSearchablePropertiesArray[this.getAlgoResourceIndexByName(strSearchResourceName)][CRUDResourceIndex][n] = true;
				return;
			}
		}
		
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to load searchable property " + strOldPropertyName, e);
		}
	}


	private boolean propertyStillExists(int CRUDResourceIndex, String strOldPropertyName) {
		for(int n = 0; n < this.getCRUDResourceByIndex(CRUDResourceIndex).getHasProperty().size(); n++){
			if(this.getCRUDResourceByIndex(CRUDResourceIndex).getHasProperty().get(n).getName().equalsIgnoreCase(strOldPropertyName)){
				return true;
			}
		}
		
		return false;
	}


	private SearchResource getExistingSearchResourceByName(String strSearchResourceName) {
		for(int n = 0; n < this.oSearchLayerCIM.getHasAnnotation().size(); n++){
			if(this.oSearchLayerCIM.getHasAnnotation().get(n) instanceof SearchResource){
				if(((SearchResource)this.oSearchLayerCIM.getHasAnnotation().get(n)).getAlgoResourceIsSearchResource().getAnnotatesAlgoResource().getName().equalsIgnoreCase(strSearchResourceName)){
					return (SearchResource)this.oSearchLayerCIM.getHasAnnotation().get(n);
				}
			}
		}
		
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find search resource by name " + strSearchResourceName, e);
			return null;
		}
	}


	private void initializeWizardSWTs(){
		//initialize the two main part grids
		initializeWizardPagesGrids(this.oParentComposite);
		initializeSearchResourceGridSWTs();
		initializeSearchablePropertiesGridSWTs();
		
		updateWidgetStatus();
		
		this.oParentComposite.layout();
	}
	
	private void initializeWizardPagesGrids(Composite parent){
		this.oSearchableResourcesLabel = new Label(this.oWizardPageGrid, SWT.NULL);
		this.oSearchableResourcesLabel.setText("Add any of the available resources to the search resource list: ");
		this.oSearchableResourcesLabel.pack();
		
		//Resource selection composite initializaton
		this.oSearchResourceGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
//		this.oSearchResourceGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
		this.oSearchResourceGrid.setLayout(new GridLayout(3, false));
		
		
		
		this.oAddSearchablePropertiesLabel = new Label(this.oWizardPageGrid, SWT.NULL);
		this.oAddSearchablePropertiesLabel.setText("Add all the properties that must be searchable by the selected search resource");
		this.oAddSearchablePropertiesLabel.pack();
			
		this.oSearchablePropertiesGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
//		this.oSearchablePropertiesGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
		this.oSearchablePropertiesGrid.setLayout(new GridLayout(4, false));
	}
	
	private void initializeSearchResourceGridSWTs(){
		initializeAvailableAlgoResourcesSWTs();
		initializeSearchResourceAddRemoveButtons();
		initializeSelectedSearchResourceSWTs();
	}
	
	private void initializeSearchablePropertiesGridSWTs(){
		initializeSearchableResourceSWTs();
		initializeSearchablePropertiesSWTs();
		initializeSearchablePropertiesAddRemoveButtonSWTs();
		initializeSelectedPropertiesSWTs();
	}
	
	private void initializeAvailableAlgoResourcesSWTs(){
		this.oSearchResourcePromptGrid = new Composite(this.oSearchResourceGrid, SWT.NONE);
//		this.oSearchResourcePromptGrid.setLayout(new GridLayout(1,false));
		this.oSearchResourcePromptGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		
		this.oSearchResourcePromptLabel = new Label(this.oSearchResourcePromptGrid, SWT.NULL);
		this.oSearchResourcePromptLabel.setText("Available Resources: ");
		this.oSearchResourcePromptLabel.setLocation(20, 10);
		this.oSearchResourcePromptLabel.pack();
		
		this.oSearchResourcePromptList = new List(this.oSearchResourcePromptGrid, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL);
		this.oSearchResourcePromptList.setSize(this.oSearchResourcePromptLabel.getSize().x - 10, 100);
		this.oSearchResourcePromptList.setLocation(20, 25);
		if(this.bReloadExistingModels == false){
			populateSearchResourcePromptList();
		}
		addSearchResourcePromptListListener();
	}
	
	private void initializeSearchResourceAddRemoveButtons(){
		this.oSearchResourceAddRemoveButtonsGrid = new Composite(this.oSearchResourceGrid, SWT.NONE);
//		this.oSearchResourceAddRemoveButtonsGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
		this.oSearchResourceAddRemoveButtonsGrid.setLayout(new GridLayout(1, false));		
		
		this.oAddSearchResourceButton = new Button(this.oSearchResourceAddRemoveButtonsGrid, SWT.NONE);
		this.oAddSearchResourceButton.setText("Add");
		addAddSearchResourceButtonListener();
		
		this.oRemoveSearchResourceButton = new Button(this.oSearchResourceAddRemoveButtonsGrid, SWT.NONE);
		this.oRemoveSearchResourceButton.setText("Remove");
		addRemoveSearchResourceButtonListener();
	}
	
	private void initializeSelectedSearchResourceSWTs(){
		this.oSelectedSearchResourceGrid = new Composite(this.oSearchResourceGrid, SWT.NONE);
		this.oSelectedSearchResourceGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
//		this.oSelectedSearchResourceGrid.setLayout(new GridLayout(1, false));
		
		this.oSelectedSearchResourceLabel = new Label(this.oSelectedSearchResourceGrid, SWT.NULL);
		this.oSelectedSearchResourceLabel.setText("Selected Search Resources: ");
		this.oSelectedSearchResourceLabel.setLocation(30, 10);
		this.oSelectedSearchResourceLabel.pack();
		
		this.oSelectedSearchResourceList = new List(this.oSelectedSearchResourceGrid, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL);
		this.oSelectedSearchResourceList.setSize(this.oSelectedSearchResourceLabel.getSize().x, 100);
		this.oSelectedSearchResourceList.setLocation(30, 25);
		addSelectedSeaerchResourceListListener();
	}
	
	private void initializeSearchableResourceSWTs(){
		this.oSearchableResourceGrid = new Composite(this.oSearchablePropertiesGrid, SWT.NULL);
		this.oSearchableResourceGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
//		this.oSearchableResourceGrid.setLayout(new GridLayout(1, false));
		
		this.oSearchableResourcesLabel = new Label(this.oSearchableResourceGrid, SWT.NULL);
		this.oSearchableResourcesLabel.setText("Select a Resorce: ");
		this.oSearchableResourcesLabel.setLocation(20,10);
		this.oSearchableResourcesLabel.pack();
		
		this.oSearchableResourcesPromptList = new List(this.oSearchableResourceGrid, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL);
		this.oSearchableResourcesPromptList.setLocation(20, 25);
		this.oSearchableResourcesPromptList.setSize(this.oSearchableResourcesLabel.getSize().x - 10, 100);
		populateSearchableResourcesPromptList();
		addSearchableResourcePromptListListener();
	}
	
	private void initializeSearchablePropertiesSWTs(){
		this.oSearchablePropertyGrid = new Composite(this.oSearchablePropertiesGrid, SWT.NULL);
		this.oSearchablePropertyGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
//		this.oSearchablePropertyGrid.setLayout(new GridLayout(1, false));
		
		this.oSearchablePropertiesLabel = new Label(this.oSearchablePropertyGrid, SWT.NULL);
		this.oSearchablePropertiesLabel.setText("Select a Property: ");
		this.oSearchablePropertiesLabel.setLocation(0, 10);
		this.oSearchablePropertiesLabel.pack();
		
		this.oSearchablePropertiesPromptList = new List(this.oSearchablePropertyGrid, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL);
		this.oSearchablePropertiesPromptList.setLocation(0, 25);
		this.oSearchablePropertiesPromptList.setSize(this.oSearchablePropertiesLabel.getSize().x - 10, 100);
		addSearchablePropertiesPromptListListener();
	}
	
	private void initializeSearchablePropertiesAddRemoveButtonSWTs(){
		this.oSearchablePropertiesAddRemoveButtonGrid = new Composite(this.oSearchablePropertiesGrid, SWT.NONE);
//		this.oSearchablePropertiesAddRemoveButtonGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
		this.oSearchablePropertiesAddRemoveButtonGrid.setLayout(new GridLayout(1, false));
		
		this.oAddSearchablePropertyButton = new Button(this.oSearchablePropertiesAddRemoveButtonGrid, SWT.NONE);
		this.oAddSearchablePropertyButton.setText("Add");
		addAddSearchablePropertyButtonListener();
		
		this.oRemoveSearchablePropertyButton = new Button(this.oSearchablePropertiesAddRemoveButtonGrid, SWT.NONE);
		this.oRemoveSearchablePropertyButton.setText("Remove");
		addRemoveSearchablePropertyButtonListener();
	}
	
	private void initializeSelectedPropertiesSWTs(){
		this.oSelectedPropertiesGrid = new Composite(this.oSearchablePropertiesGrid, SWT.NONE);
		this.oSelectedPropertiesGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
//		this.oSelectedPropertiesGrid.setLayout(new GridLayout(1, false));
		
		this.oSelectedPropertiesLabel = new Label(this.oSelectedPropertiesGrid, SWT.NONE);
		this.oSelectedPropertiesLabel.setText("Selected Properties:");
		this.oSelectedPropertiesLabel.setLocation(0, 10);
		this.oSelectedPropertiesLabel.pack();
		
		this.oSelectedPropertiesList = new List(this.oSelectedPropertiesGrid, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL | SWT.H_SCROLL);
		this.oSelectedPropertiesList.setLocation(0, 25);
		this.oSelectedPropertiesList.setSize(this.oSelectedPropertiesLabel.getSize().x - 10, 100);
		addSelectedPropertiesListListener();
	}
	
	private void populateSearchResourcePromptList(){
		this.oSearchResourcePromptList.removeAll();
		for(int n = 0 ; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if((this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true) &&
					(!isAlreadySelectedResource(this.oRESTfulServiceCIM.getHasResources().get(n).getName()))){
				this.oSearchResourcePromptList.add(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
			}
		}
	}
	
	private void populateSearchableResourcesPromptList(){
		for(int n = 0 ; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
				this.oSearchableResourcesPromptList.add(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
			}
		}
	}
	
	private void populateSearchablePropertiesPromptList(){
		this.oSearchablePropertiesPromptList.removeAll();
		for(int n = 0 ; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(this.oSearchableResourcesPromptList.getSelection()[0])){
				for(int i = 0 ; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
					this.oSearchablePropertiesPromptList.add(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName());
				}
			}
		}
	}
	
	private void populateSelectedProperties(){
		this.oSelectedPropertiesList.removeAll();
		for(int n = 0; n < getNumberOfCRUDResources(); n++){
			for(int i = 0; i < getCRUDResourceByIndex(n).getHasProperty().size(); i++){
				if(this.oSelectedSearchablePropertiesArray[getAlgoResourceIndexByName(this.oSelectedSearchResourceList.getSelection()[0])][n][i] == true){
					this.oSelectedPropertiesList.add(getCRUDResourceByIndex(n).getName() + ":" + getPropertyByIndex(n, i).getName());
				}
			}
		}
	}
	
	private boolean isAlreadySelectedResource(String strResourceName){
		if(oSelectedResourcesArray[getAlgoResourceIndexByName(strResourceName)] == true){
			return true;
		}
		return false;
	}
	
	private void addSearchResourcePromptListListener(){
		this.oSearchResourcePromptList.addSelectionListener(new SelectionListener(){

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
	
	public void addSelectedSeaerchResourceListListener(){
		
		this.oSelectedSearchResourceList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				populateSelectedProperties();
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				populateSelectedProperties();
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}
			
		});
	}
	
	private void addAddSearchResourceButtonListener(){
		
		this.oAddSearchResourceButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				oSelectedResourcesArray[getAlgoResourceIndexByName(oSearchResourcePromptList.getSelection()[0])] = true;
				oSelectedSearchResourceList.add(oSearchResourcePromptList.getSelection()[0]);
				populateSearchResourcePromptList();
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}
	
	private void addRemoveSearchResourceButtonListener(){
		this.oRemoveSearchResourceButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				oSelectedResourcesArray[getAlgoResourceIndexByName(oSelectedSearchResourceList.getSelection()[0])] = false;
				oSelectedSearchResourceList.remove(oSelectedSearchResourceList.getSelectionIndex());
				populateSearchResourcePromptList();
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}
	
	private void addSearchableResourcePromptListListener(){
		this.oSearchableResourcesPromptList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				populateSearchablePropertiesPromptList();
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				populateSearchablePropertiesPromptList();
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}
			
		});
	}
	
	private void addSearchablePropertiesPromptListListener(){
		this.oSearchablePropertiesPromptList.addSelectionListener(new SelectionListener(){

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
	
	private void addSelectedPropertiesListListener(){
		this.oSelectedPropertiesList.addSelectionListener(new SelectionListener(){

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
	
	private void addAddSearchablePropertyButtonListener(){
		this.oAddSearchablePropertyButton.addListener(SWT.Selection, new Listener(){
			@Override
			public void handleEvent(Event event) {
				oSelectedSearchablePropertiesArray[getAlgoResourceIndexByName(oSelectedSearchResourceList.getSelection()[0])]
						[getCRUDResourceIndexByName(oSearchableResourcesPromptList.getSelection()[0])]
								[getPropertyIndexByName(oSearchableResourcesPromptList.getSelection()[0], oSearchablePropertiesPromptList.getSelection()[0])] = true;
				populateSelectedProperties();
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}
	
	private void addRemoveSearchablePropertyButtonListener(){
		this.oRemoveSearchablePropertyButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				oSelectedSearchablePropertiesArray[getAlgoResourceIndexByName(oSelectedSearchResourceList.getSelection()[0])]
						[getElementIndexByResourcePropertyComboName(oSelectedPropertiesList.getSelection()[0], true)]
								[getElementIndexByResourcePropertyComboName(oSelectedPropertiesList.getSelection()[0], false)] = false;
				populateSelectedProperties();
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}
	
	private int getNumberOfAlgoResources(){
		int i = 0;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true){
				i++;
			}
		}
		
		return i;
	}
	
	private int getNumberOfCRUDResources(){
		int i = 0;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
				i++;
			}
		}
		
		return i;
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

		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find algorithic resource " + strAlgoResourceName + " by index.", e);
			return -1;
		}
	}
	
	private int getCRUDResourceIndexByName(String strCRUDResourceName){
		int i = -1;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
				i++;
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(strCRUDResourceName)){
					return i;
				}
			}
		}

		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find CRUD Resource index by name " + strCRUDResourceName, e);
			return -1;
		}
	}
	
	
	private Resource getCRUDResourceByIndex(int iCRUDResourceIndex){
		int i = -1;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
				i++;
				if(i == iCRUDResourceIndex){
					return this.oRESTfulServiceCIM.getHasResources().get(n);
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find CRUDResource by index " + iCRUDResourceIndex, e);
			return null;
		}
	}
	
	private Resource getAlgoResourceByIndex(int iAlgoResourceIndex){
		int i = -1;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true){
				i++;
				if(i == iAlgoResourceIndex){
					return this.oRESTfulServiceCIM.getHasResources().get(n);
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find Algorithmic Resource by index " + iAlgoResourceIndex, e);
			return null;
		}
	}
	
	private int getPropertyIndexByName(String strCRUDResourceName, String strPropertyName){
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(strCRUDResourceName)){
					for(int j = 0; j < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); j++){
						if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(j).getName().equalsIgnoreCase(strPropertyName)){
							return j;
						}
					}
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find property index by name " + strCRUDResourceName, e);
			return -1;
		}	
	}
	
	private Property getPropertyByIndex(int iCRUDResourceIndex, int iPropertyIndex){
		int i = -1;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
				i++;
				if(i == iCRUDResourceIndex){
					return this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(iPropertyIndex);
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find property by index " + iCRUDResourceIndex, e);
			return null;
		}
	}
	
	private int getElementIndexByResourcePropertyComboName(String strResourcePropertyComboName, boolean bGetCRUDResourceIndex){
		int i = -1;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
				i++;
				for(int j = 0; j < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); j++){
					if((this.oRESTfulServiceCIM.getHasResources().get(n).getName() + ":" + this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(j).getName()).equalsIgnoreCase(strResourcePropertyComboName)){
						if(bGetCRUDResourceIndex == true){
							return i;
						}
						else{
							return j;
						}
					}
					
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find element index by name " + strResourcePropertyComboName, e);
			return -1;
		}
	}
	
	private void updateWidgetStatus(){
		updateSearchResourceWidgetsStatus();
		updateSearchablePropertiesWidgetsStatus();
	//	setWidgetSizes();
	//	updateLayouts();
	}
	
	private void updateSearchResourceWidgetsStatus(){
		updateSearchResourcePromptListStatus();
		updateSearchResourceAddRemoveButtonStatus();
		updateSelectedResourcePromptListStatus();
	}
	
	private void updateSearchResourcePromptListStatus(){
		if(this.oSearchResourcePromptList.getItemCount() > 0){
			this.oSearchResourcePromptList.setEnabled(true);
		}
		else{
			this.oSearchResourcePromptList.setEnabled(false);
		}
	}
	
	private void updateSearchResourceAddRemoveButtonStatus(){
		if(this.oSearchResourcePromptList.getSelectionIndex() != -1){
			this.oAddSearchResourceButton.setEnabled(true);
		}
		else{
			this.oAddSearchResourceButton.setEnabled(false);
		}
		
		if(this.oSelectedSearchResourceList.getSelectionIndex() != -1){
			this.oRemoveSearchResourceButton.setEnabled(true);
		}
		else{
			this.oRemoveSearchResourceButton.setEnabled(false);
		}
	}
	
	private void updateSelectedResourcePromptListStatus(){
		if(this.oSelectedSearchResourceList.getItemCount() > 0){
			this.oSelectedSearchResourceList.setEnabled(true);
		}
		else{
			this.oSelectedSearchResourceList.setEnabled(false);
		}
	}
	
	private void updateSearchablePropertiesWidgetsStatus(){
		updateSearchableResourcePromptListStatus();
		updateSearchablePropertyPromptListStatus();
		updateSearchablePropertiesAddRemoveButtonsStatus();
		updateSelectedPropertiesStatus();
	}
	
	private void updateSearchableResourcePromptListStatus(){
		if(this.oSelectedSearchResourceList.getSelectionIndex() != -1 && this.oSelectedSearchResourceList.getItemCount() > 0){
			this.oSearchableResourcesPromptList.setEnabled(true);
		}
		else{
			this.oSearchableResourcesPromptList.setEnabled(false);
		}
	}
	
	private void updateSearchablePropertyPromptListStatus(){
		if(this.oSearchableResourcesPromptList.getEnabled() && this.oSearchableResourcesPromptList.getSelectionIndex() != -1){
			this.oSearchablePropertiesPromptList.setEnabled(true);
		}
		else{
			this.oSearchablePropertiesPromptList.setEnabled(false);
		}
	}
	
	private void updateSearchablePropertiesAddRemoveButtonsStatus(){
		if(this.oSearchablePropertiesPromptList.getEnabled() && this.oSearchablePropertiesPromptList.getSelectionIndex() != -1){
			this.oAddSearchablePropertyButton.setEnabled(true);
		}
		else{
			this.oAddSearchablePropertyButton.setEnabled(false);
		}
		
		if(this.oSelectedPropertiesList.getItemCount() > 0 && this.oSelectedPropertiesList.getSelectionIndex() != -1){
			this.oRemoveSearchablePropertyButton.setEnabled(true);
		}
		else{
			this.oRemoveSearchablePropertyButton.setEnabled(false);
		}
	}
	
	private void updateSelectedPropertiesStatus(){
		if(this.oSelectedPropertiesList.getItemCount() > 0 && this.oSelectedSearchResourceList.getSelectionIndex() != -1 && this.oSelectedSearchResourceList.getItemCount() > 0){
			this.oSelectedPropertiesList.setEnabled(true);
		}
		else{
			this.oSelectedPropertiesList.setEnabled(false);
		}
	}
	
	private boolean atLeastOneSearchResourceExists(){
		for(int n = 0; n < this.getNumberOfAlgoResources(); n++){
			if(this.oSelectedResourcesArray[n] != false){
				return true;
			}
		}
		
		return false;
	}
	
	private boolean hasAtLeastOneSearchablePropertyAssigned(int iAlgoResourceIndex){
		for(int n = 0; n < this.getNumberOfCRUDResources(); n++){
			for(int i = 0; i < this.getCRUDResourceByIndex(n).getHasProperty().size(); i++){
				if(this.oSelectedSearchablePropertiesArray[iAlgoResourceIndex][n][i] != false){
					return true;
				}
			}
		}
		
		return false;
	}
	
	private boolean isPageCompleted(){
		
		//this page is complete if and only if there exists at least one search resource
		if(this.atLeastOneSearchResourceExists() == true){
			for(int n = 0; n < this.getNumberOfAlgoResources(); n++){
				if(this.oSelectedResourcesArray[n] != false){ // AND if every search resource is assigned at least one property to search.
					if(this.hasAtLeastOneSearchablePropertyAssigned(n) == false){
						setErrorMessage("Every search resource must search at least one property.");
						return false;
					}
				}
			}
			
			//and if no more than the maximum number of search resources is defined
			int iNumberOfSearchResourcesDefined = 0;
			for(int n = 0; n < this.getNumberOfAlgoResources(); n++){
				if(this.oSelectedResourcesArray[n] != false){
					iNumberOfSearchResourcesDefined++;
				}
			}
			if(this.iMaxSearchResourcesAllowed < iNumberOfSearchResourcesDefined){
				setErrorMessage("Based on the desired algorithmic functionality preferences of this project, the maximum number of the definable Search resources is " +
						this.iMaxSearchResourcesAllowed + ". There are already " + iNumberOfSearchResourcesDefined + " Search resources defined.");
				return false;
			}
		}
		else{
			setErrorMessage("At least one Search resource must be defined.");
			return false;
		}
		
		setErrorMessage(null);
		return true;
	}
	
	public SearchLayerCIM.AnnotationModel createSearchLayerCIM(){
		
		//delete any possible existing annotations from loaded models
		this.oSearchLayerCIM.getHasAnnotation().clear();
		this.oSearchLayerCIM.getHasAnnotatedElement().clear();
		
		//search for search resources
		for(int n = 0; n < this.getNumberOfAlgoResources(); n++){
			if(this.oSelectedResourcesArray[n] == true){
				//populate the search resource with searchable properties
				populateSearchResource(this.getAlgoResourceByIndex(n).getName());
			}
		}
		
		return this.oSearchLayerCIM;
	}
	
	private void populateSearchResource(String strSearchResourceName){
		
		//create a new annotated search algorithmic resource
		AnnAlgoResource oAnnAlgoResource = this.oSearchLayerCIMFactory.createAnnAlgoResource();
		
		//associate it with the resource it annotates
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(this.oRESTfulServiceCIM.getHasResources().get(i).getName().equalsIgnoreCase(strSearchResourceName)){
				oAnnAlgoResource.setAnnotatesAlgoResource(this.oRESTfulServiceCIM.getHasResources().get(i));
			}
		}
		//related it with searchable properties
		selectSearchablePropertiesByResource(oAnnAlgoResource);
	}
	
	private void selectSearchablePropertiesByResource(AnnAlgoResource oAnnAlgoResource){
		
		SearchResource oSearchResource = this.oSearchLayerCIMFactory.createSearchResource();
		oSearchResource.setAlgoResourceIsSearchResource(oAnnAlgoResource);
		
		for(int i = 0 ; i < this.getNumberOfCRUDResources(); i++){
			if(isSearchableResourceBySearchResource(i, oSearchResource)){
				AnnCRUDResource oAnnCRUDResource = this.oSearchLayerCIMFactory.createAnnCRUDResource();
				oAnnCRUDResource.setAnnotatesResource(this.getCRUDResourceByIndex(i));
				this.oSearchLayerCIM.getHasAnnotatedElement().add(oAnnCRUDResource);
				SearchableResource oSearchableResource = this.oSearchLayerCIMFactory.createSearchableResource();
				oSearchableResource.setResourceIsSearchable(oAnnCRUDResource);
				oSearchResource.getSearchesResource().add(oSearchableResource);

				for(int n = 0; n < this.getCRUDResourceByIndex(i).getHasProperty().size(); n++){
					if(this.oSelectedSearchablePropertiesArray[this.getAlgoResourceIndexByName(oAnnAlgoResource.getAnnotatesAlgoResource().getName())][i][n] == true){
						AnnProperty oAnnProperty = this.oSearchLayerCIMFactory.createAnnProperty();
						oAnnProperty.setAnnotatesProperty(this.getCRUDResourceByIndex(i).getHasProperty().get(n));
						SearchableProperty oSearchableProperty = this.oSearchLayerCIMFactory.createSearchableProperty();
						oSearchableProperty.setPropertyIsSearchable(oAnnProperty);
										
						this.oSearchLayerCIM.getHasAnnotatedElement().add(oAnnProperty);
						this.oSearchLayerCIM.getHasAnnotation().add(oSearchableProperty);
						oSearchableResource.getHasSearchableProperty().add(oSearchableProperty);	
					}	
				}
			}

		}

		this.oSearchLayerCIM.getHasAnnotatedElement().add(oAnnAlgoResource);
		this.oSearchLayerCIM.getHasAnnotation().add(oSearchResource);
	}
	
	private boolean isSearchableResourceBySearchResource(int iCRUDResourceIndex, SearchResource oSearchResource){
		for(int n = 0; n < this.getCRUDResourceByIndex(iCRUDResourceIndex).getHasProperty().size(); n++){
			if(this.oSelectedSearchablePropertiesArray[this.getAlgoResourceIndexByName(oSearchResource.getAlgoResourceIsSearchResource().getAnnotatesAlgoResource().getName())]
					[iCRUDResourceIndex][n] == true){
				return true;
			}
		}
		
		return false;
	}
}