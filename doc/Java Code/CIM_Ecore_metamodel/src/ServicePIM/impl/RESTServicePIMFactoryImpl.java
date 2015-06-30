/**
 */
package ServicePIM.impl;

import ServicePIM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RESTServicePIMFactoryImpl extends EFactoryImpl implements RESTServicePIMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RESTServicePIMFactory init() {
		try {
			RESTServicePIMFactory theRESTServicePIMFactory = (RESTServicePIMFactory)EPackage.Registry.INSTANCE.getEFactory(RESTServicePIMPackage.eNS_URI);
			if (theRESTServicePIMFactory != null) {
				return theRESTServicePIMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RESTServicePIMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTServicePIMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL: return createAlgoResourceModel();
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER: return createAlgoResourceController();
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER: return createResourceModelManager();
			case RESTServicePIMPackage.RESOURCE_MODEL: return createResourceModel();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER: return createResourceControllerManager();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER: return createResourceController();
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY: return createPIMComponentProperty();
			case RESTServicePIMPackage.REPRESENTATION_PARSE_FUNCTION: return createRepresentationParseFunction();
			case RESTServicePIMPackage.REPRESENTATION_MARSHALLING_FUNCTION: return createRepresentationMarshallingFunction();
			case RESTServicePIMPackage.RESOURCE_INPUT_REPRESENTATION: return createResourceInputRepresentation();
			case RESTServicePIMPackage.RESOURCE_OUTPUT_REPRESENTATION: return createResourceOutputRepresentation();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY: return createResourceControllerCRUDActivity();
			case RESTServicePIMPackage.SETTER_FUNCTION: return createSetterFunction();
			case RESTServicePIMPackage.GETTER_FUNCTION: return createGetterFunction();
			case RESTServicePIMPackage.FUNCTION_PARAMETER: return createFunctionParameter();
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER: return createCRUDActivityHandler();
			case RESTServicePIMPackage.CREATE_HYPERMEDIA_PIM_FUNCTION: return createCreateHypermediaPIMFunction();
			case RESTServicePIMPackage.DATABASE_CONTROLLER: return createDatabaseController();
			case RESTServicePIMPackage.RDBMS_ACTIVITY: return createRDBMSActivity();
			case RESTServicePIMPackage.RDBMS_TABLE: return createRDBMSTable();
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN: return createRDBMSTableColumn();
			case RESTServicePIMPackage.HYPERMEDIA_LINK: return createHypermediaLink();
			case RESTServicePIMPackage.PIM_COMPONENT_FUNCTION: return createPIMComponentFunction();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM: return createRESTfulServicePIM();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RESTServicePIMPackage.MEDIA_TYPE:
				return createMediaTypeFromString(eDataType, initialValue);
			case RESTServicePIMPackage.CRUD_VERB:
				return createCRUDVerbFromString(eDataType, initialValue);
			case RESTServicePIMPackage.RDBMS_VERB:
				return createRDBMSVerbFromString(eDataType, initialValue);
			case RESTServicePIMPackage.LINK_TYPE:
				return createLinkTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RESTServicePIMPackage.MEDIA_TYPE:
				return convertMediaTypeToString(eDataType, instanceValue);
			case RESTServicePIMPackage.CRUD_VERB:
				return convertCRUDVerbToString(eDataType, instanceValue);
			case RESTServicePIMPackage.RDBMS_VERB:
				return convertRDBMSVerbToString(eDataType, instanceValue);
			case RESTServicePIMPackage.LINK_TYPE:
				return convertLinkTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgoResourceModel createAlgoResourceModel() {
		AlgoResourceModelImpl algoResourceModel = new AlgoResourceModelImpl();
		return algoResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgoResourceController createAlgoResourceController() {
		AlgoResourceControllerImpl algoResourceController = new AlgoResourceControllerImpl();
		return algoResourceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModelManager createResourceModelManager() {
		ResourceModelManagerImpl resourceModelManager = new ResourceModelManagerImpl();
		return resourceModelManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModel createResourceModel() {
		ResourceModelImpl resourceModel = new ResourceModelImpl();
		return resourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceControllerManager createResourceControllerManager() {
		ResourceControllerManagerImpl resourceControllerManager = new ResourceControllerManagerImpl();
		return resourceControllerManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceController createResourceController() {
		ResourceControllerImpl resourceController = new ResourceControllerImpl();
		return resourceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMComponentProperty createPIMComponentProperty() {
		PIMComponentPropertyImpl pimComponentProperty = new PIMComponentPropertyImpl();
		return pimComponentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationParseFunction createRepresentationParseFunction() {
		RepresentationParseFunctionImpl representationParseFunction = new RepresentationParseFunctionImpl();
		return representationParseFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationMarshallingFunction createRepresentationMarshallingFunction() {
		RepresentationMarshallingFunctionImpl representationMarshallingFunction = new RepresentationMarshallingFunctionImpl();
		return representationMarshallingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInputRepresentation createResourceInputRepresentation() {
		ResourceInputRepresentationImpl resourceInputRepresentation = new ResourceInputRepresentationImpl();
		return resourceInputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceOutputRepresentation createResourceOutputRepresentation() {
		ResourceOutputRepresentationImpl resourceOutputRepresentation = new ResourceOutputRepresentationImpl();
		return resourceOutputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceControllerCRUDActivity createResourceControllerCRUDActivity() {
		ResourceControllerCRUDActivityImpl resourceControllerCRUDActivity = new ResourceControllerCRUDActivityImpl();
		return resourceControllerCRUDActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetterFunction createSetterFunction() {
		SetterFunctionImpl setterFunction = new SetterFunctionImpl();
		return setterFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetterFunction createGetterFunction() {
		GetterFunctionImpl getterFunction = new GetterFunctionImpl();
		return getterFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameter createFunctionParameter() {
		FunctionParameterImpl functionParameter = new FunctionParameterImpl();
		return functionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDActivityHandler createCRUDActivityHandler() {
		CRUDActivityHandlerImpl crudActivityHandler = new CRUDActivityHandlerImpl();
		return crudActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateHypermediaPIMFunction createCreateHypermediaPIMFunction() {
		CreateHypermediaPIMFunctionImpl createHypermediaPIMFunction = new CreateHypermediaPIMFunctionImpl();
		return createHypermediaPIMFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseController createDatabaseController() {
		DatabaseControllerImpl databaseController = new DatabaseControllerImpl();
		return databaseController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMSActivity createRDBMSActivity() {
		RDBMSActivityImpl rdbmsActivity = new RDBMSActivityImpl();
		return rdbmsActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMSTable createRDBMSTable() {
		RDBMSTableImpl rdbmsTable = new RDBMSTableImpl();
		return rdbmsTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMSTableColumn createRDBMSTableColumn() {
		RDBMSTableColumnImpl rdbmsTableColumn = new RDBMSTableColumnImpl();
		return rdbmsTableColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypermediaLink createHypermediaLink() {
		HypermediaLinkImpl hypermediaLink = new HypermediaLinkImpl();
		return hypermediaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMComponentFunction createPIMComponentFunction() {
		PIMComponentFunctionImpl pimComponentFunction = new PIMComponentFunctionImpl();
		return pimComponentFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTfulServicePIM createRESTfulServicePIM() {
		RESTfulServicePIMImpl resTfulServicePIM = new RESTfulServicePIMImpl();
		return resTfulServicePIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType createMediaTypeFromString(EDataType eDataType, String initialValue) {
		MediaType result = MediaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDVerb createCRUDVerbFromString(EDataType eDataType, String initialValue) {
		CRUDVerb result = CRUDVerb.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCRUDVerbToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMSVerb createRDBMSVerbFromString(EDataType eDataType, String initialValue) {
		RDBMSVerb result = RDBMSVerb.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRDBMSVerbToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkTypeFromString(EDataType eDataType, String initialValue) {
		LinkType result = LinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTServicePIMPackage getRESTServicePIMPackage() {
		return (RESTServicePIMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RESTServicePIMPackage getPackage() {
		return RESTServicePIMPackage.eINSTANCE;
	}

} //RESTServicePIMFactoryImpl
