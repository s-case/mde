package eu.fp7.scase.mdepluginwrapper.views;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.services.IServiceLocator;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.ui.*;
import org.eclipse.swt.SWT;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class MDETopLevelUI extends ScrolledComposite {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "mdepluginwrapper.views.MDETopLevelUI";
	private Composite oMDEUIGrid;
	
	//input yaml file SWTs
	private Label oYamlFileLabel;
	private Text  oYamlFileText;
	private Composite oYamlFileGrid;
	private Button oBrowseYamlFileButton;
	
	//envisioned web service's SWTs
	private Label oWSNameLabel;
	private Text  oWSNameText;
	private Composite oWSNameGrid;
	
	//MDE output SWTs
	private Label oMDEOutputLabel;
	private Text  oMDEOutputText;
	private Composite oMDEOutputGrid;
	private Button oBrowseMDEOutputButton;
	
	//Envisioned web service's database SWTs
	private Label oDatabaseIPLabel;
	private Text  oDatabaseIPText;
	private Composite oDatabaseIPGrid;
	private Label oDatabasePortLabel;
	private Text  oDatabasePortText;
	private Composite oDatabasePortGrid;
	private Label oDatabaseUsernameLabel;
	private Text  oDatabaseUsernameText;
	private Composite oDatabaseUsernameGrid;
	private Label oDatabasePasswordLabel;
	private Text  oDatabasePasswordText;
	private Composite oDatabasePasswordGrid;
	
	//2D MDE SWTs
	private Composite oExtraFunctionalityGrid;
	private Button oAuthenticationCheckBoxButton;
	private Button oAuthorizationCheckBoxButton;
	private Button oDatabaseSearchingCheckBoxButton;
	private Button oExternalCompositionCheckBoxButton;
	
	//One button 2D-MDE SWTs
	private Composite oMDEGrid;
	private Button oGenerateCodeButton;
	
	/**
	 * The constructor.
	 */
	public MDETopLevelUI(Composite parent, int style) {
		super(parent, style);
		initializeMDEUIGrids();
		initializeAllUIWidgets();
		initializeUILayout();
		
		//TODO remove the following lines in production code
//		this.oYamlFileText.setText("/Users/IMG/Desktop/Dropbox/S-CASE-Int/Work/WP2/Task_2.2-2.3/MDE_Plugin/MDEInput/webMarks.yml");
//		this.oWSNameText.setText("WebMarks");
//		this.oMDEOutputText.setText("/Users/IMG/Desktop/Dropbox/S-CASE-Int/Work/WP2/Task_2.2-2.3/MDEModelToModelTransformations/MDEArtefacts");
//		this.oDatabaseIPText.setText("localhost");
//		this.oDatabasePortText.setText("3127");
//		this.oDatabaseUsernameText.setText("postgres");
//		this.oDatabasePasswordText.setText("fp7s-case");
//		this.oDatabaseSearchingCheckBoxButton.setSelection(true);
	}

	private void initializeUILayout() {
		this.oMDEUIGrid.setSize(this.oMDEUIGrid.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		this.oMDEUIGrid.layout();
	}

	private void initializeAllUIWidgets() {

		//initialize yaml file SWTs
		oYamlFileLabel = new Label(this.oYamlFileGrid, SWT.NULL);
		oYamlFileLabel.setText("Input YAML file path: ");
		oYamlFileText = new Text(this.oYamlFileGrid, SWT.SINGLE | SWT.BORDER);
		oYamlFileText.setText("");
		oBrowseYamlFileButton = new Button(this.oYamlFileGrid, SWT.NONE);
		oBrowseYamlFileButton.setText("Browse");
		addBrowseYamlFileButtonListener();
		
		//initialize envisioned web service's SWTs
		oWSNameLabel = new Label(this.oWSNameGrid, SWT.NULL);
		oWSNameLabel.setText("Web Service Name: ");
		oWSNameText = new Text(this.oWSNameGrid, SWT.SINGLE | SWT.BORDER);
		oWSNameText.setText("");
		
		//initialize MDE output SWTs
		oMDEOutputLabel = new Label(this.oMDEOutputGrid, SWT.NULL);
		oMDEOutputLabel.setText("MDE output folder: ");
		oMDEOutputText = new Text(this.oMDEOutputGrid, SWT.SINGLE | SWT.BORDER);
		oMDEOutputText.setText("");
		oBrowseMDEOutputButton = new Button(this.oMDEOutputGrid, SWT.NONE);
		oBrowseMDEOutputButton.setText("Browse");
		addBrowseMDEOutputButtonListener();
		
		//initialize Envisioned web service's database SWTs
		oDatabaseIPLabel = new Label(this.oDatabaseIPGrid, SWT.NULL);
		oDatabaseIPLabel.setText("Database IP: ");
		oDatabaseIPText = new Text(this.oDatabaseIPGrid, SWT.SINGLE | SWT.BORDER);
		oDatabaseIPText.setText("");
		oDatabasePortLabel = new Label(this.oDatabasePortGrid, SWT.NULL);
		oDatabasePortLabel.setText("Database Port: ");
		oDatabasePortText = new Text(this.oDatabasePortGrid, SWT.SINGLE | SWT.BORDER);
		oDatabasePortText.setText("");
		oDatabaseUsernameLabel = new Label(this.oDatabaseUsernameGrid, SWT.NULL);
		oDatabaseUsernameLabel.setText("Database Username: ");
		oDatabaseUsernameText = new Text(this.oDatabaseUsernameGrid, SWT.SINGLE | SWT.BORDER);
		oDatabaseUsernameText.setText("");
		oDatabasePasswordLabel = new Label(this.oDatabasePasswordGrid, SWT.NULL);
		oDatabasePasswordLabel.setText("Database Password: ");
		oDatabasePasswordText = new Text(this.oDatabasePasswordGrid, SWT.SINGLE | SWT.BORDER);
		oDatabasePasswordText.setText("");

				
		//initialize 2D MDE SWTs
		oAuthenticationCheckBoxButton = new Button(this.oExtraFunctionalityGrid, SWT.CHECK);
		oAuthenticationCheckBoxButton.setText("Add Basic Authentication");
		oAuthorizationCheckBoxButton = new Button(this.oExtraFunctionalityGrid, SWT.CHECK);
		oAuthorizationCheckBoxButton.setText("Add ABAC Authorization");
		oDatabaseSearchingCheckBoxButton = new Button(this.oExtraFunctionalityGrid, SWT.CHECK);
		oDatabaseSearchingCheckBoxButton.setText("Add Database Searching");
		oExternalCompositionCheckBoxButton = new Button(this.oExtraFunctionalityGrid, SWT.CHECK);
		oExternalCompositionCheckBoxButton.setText("Add External Compositions");
		
		//initialize One button 2D-MDE SWTs
		oGenerateCodeButton = new Button(this.oMDEGrid, SWT.NONE);
		oGenerateCodeButton.setText("Generate Code");
		addGenerateCodeButtonListener();
		
	}

	private void addGenerateCodeButtonListener() {
		this.oGenerateCodeButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				if(validateInputPreferences()){
					//get Core MDE preferences from the UI
					Map<String, String> MDEPreferences = new HashMap<String, String>();
					MDEPreferences = getCoreMDEPreferences(MDEPreferences);

					//generate the Core CIM and its extensions plugin
					createCIMModels(MDEPreferences);
					
					//execute all the Model-To-Model transformations plugin
					executeModelToModelTransformations(MDEPreferences);
					
					//create annotation stack
					createAnnotationStack(MDEPreferences);
					
					//execute the code generation plugin
					executeModelToTextTransformation(MDEPreferences);
				}
			}
		});
	}
	
	private void createCIMModels(Map<String, String> mapMDEPreferences){
		IServiceLocator serviceLocator = PlatformUI.getWorkbench();
		ICommandService commandService = (ICommandService) serviceLocator.getService(ICommandService.class);
		try {
			Command command = commandService.getCommand("CIMGenerator.commands.CIMGeneratorCommand");
			command.executeWithChecks(new ExecutionEvent(command, mapMDEPreferences, null, null));
		} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
			e.printStackTrace();
		}
	}
	
	private void executeModelToModelTransformations(Map<String, String> mapMDEPreferences){
		IServiceLocator serviceLocator = PlatformUI.getWorkbench();
		ICommandService commandService = (ICommandService) serviceLocator.getService(ICommandService.class);
		try {
			Command command = commandService.getCommand("MDEModelToModelTransformations.commands.ExecuteModelToModelTransformations");
			command.executeWithChecks(new ExecutionEvent(command, mapMDEPreferences, null, null));
		} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
			e.printStackTrace();
		}
	}
	
	private void createAnnotationStack(Map<String, String> mapMDEPreferences){
		IServiceLocator serviceLocator = PlatformUI.getWorkbench();
		ICommandService commandService = (ICommandService) serviceLocator.getService(ICommandService.class);
		try {
			Command command = commandService.getCommand("AnnotationStackPopulator.commands.PopulateAnnotationStack");
			command.executeWithChecks(new ExecutionEvent(command, mapMDEPreferences, null, null));
		} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
			e.printStackTrace();
		}
	}
	
	private void executeModelToTextTransformation(Map<String, String> mapMDEPreferences){
		IServiceLocator serviceLocator = PlatformUI.getWorkbench();
		ICommandService commandService = (ICommandService) serviceLocator.getService(ICommandService.class);
		try {
			Command command = commandService.getCommand("MDEModelToTextPlugin.commands.executeModelToTextTransformation");
			command.executeWithChecks(new ExecutionEvent(command, mapMDEPreferences, null, null));
		} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
			e.printStackTrace();
		}
	}
	
	private Map<String, String> getCoreMDEPreferences(Map<String, String> mapMDEPreferences){
		
		mapMDEPreferences.put("YamlFilePath", oYamlFileText.getText());
		mapMDEPreferences.put("WebServiceName", oWSNameText.getText());
		mapMDEPreferences.put("MDEOutputFolder", oMDEOutputText.getText());
		mapMDEPreferences.put("DatabaseIP", oDatabaseIPText.getText());
		mapMDEPreferences.put("DatabasePort", oDatabasePortText.getText());
		mapMDEPreferences.put("DatabaseUsername", oDatabaseUsernameText.getText());
		mapMDEPreferences.put("DatabasePassword", oDatabasePasswordText.getText());
		mapMDEPreferences.put("Authentication", (oAuthenticationCheckBoxButton.getSelection() ? "yes" : "no"));
		mapMDEPreferences.put("Authorization", (oAuthorizationCheckBoxButton.getSelection() ? "yes" : "no"));
		mapMDEPreferences.put("DatabaseSearching", (oDatabaseSearchingCheckBoxButton.getSelection() ? "yes" : "no"));
		mapMDEPreferences.put("ExternalComposition", (oExternalCompositionCheckBoxButton.getSelection() ? "yes" : "no"));
		
		return mapMDEPreferences;
	}
	
	private boolean validateInputPreferences(){
		if( oYamlFileText.getText().isEmpty()         ||
			oWSNameText.getText().isEmpty()           ||
			oMDEOutputText.getText().isEmpty()        ||
			oDatabaseIPText.getText().isEmpty()       ||
			oDatabasePortText.getText().isEmpty()     ||
			oDatabaseUsernameText.getText().isEmpty() ||
			oDatabasePasswordText.getText().isEmpty()){
			return false;
		}
		return true;
	}

	private void addBrowseMDEOutputButtonListener() {
		this.oBrowseMDEOutputButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				DirectoryDialog oDirectoryDialog = new DirectoryDialog(new Shell(), SWT.OPEN);
				oMDEOutputText.setText(oDirectoryDialog.open());
			}
		});
	}

	private void addBrowseYamlFileButtonListener() {
		this.oBrowseYamlFileButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				FileDialog oFileDialog = new FileDialog(new Shell(), SWT.OPEN);
				oYamlFileText.setText(oFileDialog.open());
			}
		});
	}

	private void initializeMDEUIGrids() {
		oMDEUIGrid = new Composite(this, SWT.NONE);

		//input yaml file SWTs
		oYamlFileGrid = new Composite(this.oMDEUIGrid, SWT.NONE);
		oYamlFileGrid.setLayoutData(new GridData());
		oYamlFileGrid.setLayout(new GridLayout(3, false));
		
		//envisioned web service's SWTs
		oWSNameGrid = new Composite(this.oMDEUIGrid, SWT.NONE);
		oWSNameGrid.setLayoutData(new GridData());
		oWSNameGrid.setLayout(new GridLayout(2, false));
		
		//MDE output SWTs
		oMDEOutputGrid = new Composite(this.oMDEUIGrid, SWT.NONE);
		oMDEOutputGrid.setLayoutData(new GridData());
		oMDEOutputGrid.setLayout(new GridLayout(3, false));

		
		//Envisioned web service's database SWTs
		oDatabaseIPGrid = new Composite(this.oMDEUIGrid, SWT.NONE);
		oDatabaseIPGrid.setLayoutData(new GridData());
		oDatabaseIPGrid.setLayout(new GridLayout(2, false));

		oDatabasePortGrid = new Composite(this.oMDEUIGrid, SWT.NONE);
		oDatabasePortGrid.setLayoutData(new GridData());
		oDatabasePortGrid.setLayout(new GridLayout(2, false));

		oDatabaseUsernameGrid = new Composite(this.oMDEUIGrid, SWT.NONE);
		oDatabaseUsernameGrid.setLayoutData(new GridData());
		oDatabaseUsernameGrid.setLayout(new GridLayout(2, false));

		oDatabasePasswordGrid = new Composite(this.oMDEUIGrid, SWT.NONE);
		oDatabasePasswordGrid.setLayoutData(new GridData());
		oDatabasePasswordGrid.setLayout(new GridLayout(2, false));	
		
		oExtraFunctionalityGrid = new Composite(this.oMDEUIGrid, SWT.None);
		oExtraFunctionalityGrid.setLayoutData(new GridData());
		oExtraFunctionalityGrid.setLayout(new GridLayout(1, false));
		
		oMDEGrid = new Composite(this.oMDEUIGrid, SWT.NONE);
		oMDEGrid.setLayoutData(new GridData());
		oMDEGrid.setLayout(new GridLayout(1, false));
		
		setLayoutData(new GridData(GridData.FILL_BOTH));
		setContent(oMDEUIGrid);
		oMDEUIGrid.setLayoutData(new GridData());
		oMDEUIGrid.setLayout(new GridLayout(1, false));
	}
	
	public static void main(String[] args) {
		Shell shell = new Shell();
		shell.setLayout(new FillLayout());
		shell.setSize(850, 500);
		final Display display = shell.getDisplay();
		final MDETopLevelUI widget = new MDETopLevelUI(shell, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		widget.setSize(850, 500);
		shell.open();
		while (!shell.isDisposed())
			if (!display.readAndDispatch())
				display.sleep();
	}
}