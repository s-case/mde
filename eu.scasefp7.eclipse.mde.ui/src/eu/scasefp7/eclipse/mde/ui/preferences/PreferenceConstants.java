package eu.scasefp7.eclipse.mde.ui.preferences;

/**
 * Constant definitions for plug-in preferences
 */
public final class PreferenceConstants {

    /** Used to store constants, cannot be instantiated. */
    private PreferenceConstants() {};
    
    /** Use project preferences and override workspace preferences. */
    public static final String P_USE_PROJECT_PREFS = "useProjectPreferences"; //$NON-NLS-1$
    
    /** Use the output folder configured in the project for generating code. */
    public static final String P_USE_PROJECT_OUTPUT_FOLDER = "useProjectOutputFolder"; //$NON-NLS-1$
    
    /** Output path for the generated code. */
	public static final String P_OUTPUT_PATH = "outputPath"; //$NON-NLS-1$
	
	/** Use project name for the name of the generated web service. */
    public static final String P_SERVICE_NAME_USE_PROJECT_NAME = "serviceNameFromProjectName"; //$NON-NLS-1$
    
    /** The name of the generated web service (overriden by P_SERVICE_NAME_USE_PROJECT_NAME).
     * @see PreferenceConstants#P_SERVICE_NAME_USE_PROJECT_NAME
     */
    public static final String P_SERVICE_NAME = "serviceName"; //$NON-NLS-1$
    
    /** Automatically import the generated web service Maven project to workspace. */
    public static final String P_AUTO_IMPORT_GENERATED_CODE = "importGeneratedMavenProject"; //$NON-NLS-1$
    
    /** MDE input file name (YAML resource description). */
    public static final String P_INPUT_FILE = "inputFile"; //$NON-NLS-1$

    /** Host name of the database server. */
	public static final String P_DATABASE_ADDRESS = "databaseAddress"; //$NON-NLS-1$
	
	/** Port of the database server. */
    public static final String P_DATABASE_PORT = "databasePort"; //$NON-NLS-1$
    
    /** User name to use when connecting to the database. */
    public static final String P_DATABASE_USER = "databaseUser"; //$NON-NLS-1$
    
    /** Password to use when connecting to the database. */
    public static final String P_DATABASE_PASSWORD = "databasePassword"; //$NON-NLS-1$
    
    /** Database server type (PostgreSQL, MySQL) */
    public static final String P_DATABASE_TYPE = "databaseType"; //$NON-NLS-1$
    
    /** Enable MDE facet Basic authentication. */
	public static final String P_FACET_BASIC_AUTHENTICATION = "facetBasicAuthentication"; //$NON-NLS-1$

    /** Enable MDE facet ABAC authorization. */
	public static final String P_FACET_ABAC_AUTHORIZATION = "facetABACAuthorization"; //$NON-NLS-1$
	
    /** Enable MDE facet Database search. */
    public static final String P_FACET_SEARCH = "facetSearching"; //$NON-NLS-1$
    
    /** Enable MDE facet External compositions. */
    public static final String P_FACET_EXT_COMPOSITIONS = "facetExternalCompositions"; //$NON-NLS-1$
 }
