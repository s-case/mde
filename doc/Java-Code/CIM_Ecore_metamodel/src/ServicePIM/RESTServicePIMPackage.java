/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ServicePIM.RESTServicePIMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RESTServicePIMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ServicePIM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "PIM/metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Eu.fp7.scase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RESTServicePIMPackage eINSTANCE = ServicePIM.impl.RESTServicePIMPackageImpl.init();

	/**
	 * The meta object id for the '{@link ServicePIM.impl.AlgoResourceModelImpl <em>Algo Resource Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.AlgoResourceModelImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getAlgoResourceModel()
	 * @generated
	 */
	int ALGO_RESOURCE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_MODEL__PARENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Algo Model Has Input Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_INPUT_REPRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>Algo Model Has Output Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_OUTPUT_REPRESENTATION = 3;

	/**
	 * The feature id for the '<em><b>Algo Model Has Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Algo Model Has Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_SETTER = 5;

	/**
	 * The feature id for the '<em><b>Algo Model Has Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_GETTER = 6;

	/**
	 * The feature id for the '<em><b>Has Related Algo Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Is Related Algo Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Algo Model Has Parse Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PARSE_FUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Algo Model Has Marshalling Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_MARSHALLING_FUNCTION = 10;

	/**
	 * The number of structural features of the '<em>Algo Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_MODEL_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Algo Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.AlgoResourceControllerImpl <em>Algo Resource Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.AlgoResourceControllerImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getAlgoResourceController()
	 * @generated
	 */
	int ALGO_RESOURCE_CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_CONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_CONTROLLER__PARENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Controller URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI = 2;

	/**
	 * The feature id for the '<em><b>Has Associated Algo Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Algo Controller Has CRUD Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_CRUD_ACTIVITY = 4;

	/**
	 * The number of structural features of the '<em>Algo Resource Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_CONTROLLER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Algo Resource Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_RESOURCE_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.ResourceModelManagerImpl <em>Resource Model Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.ResourceModelManagerImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceModelManager()
	 * @generated
	 */
	int RESOURCE_MODEL_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_MANAGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_MANAGER__PARENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Has Related Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_MANAGER__HAS_RELATED_MODEL = 2;

	/**
	 * The feature id for the '<em><b>RM Manager Has Input Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_INPUT_REPRESENTATION = 3;

	/**
	 * The feature id for the '<em><b>RM Manager Has Output Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_OUTPUT_REPRESENTATION = 4;

	/**
	 * The feature id for the '<em><b>Has RM Manager Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_MANAGER__HAS_RM_MANAGER_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>RM Manager Has Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_SETTER = 6;

	/**
	 * The feature id for the '<em><b>RM Manager Has Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_GETTER = 7;

	/**
	 * The feature id for the '<em><b>RM Manager Has Parse Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_PARSE_FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>RM Manager Has Marshalling Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_MARSHALLING_FUNCTION = 9;

	/**
	 * The number of structural features of the '<em>Resource Model Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_MANAGER_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Resource Model Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.ResourceModelImpl <em>Resource Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.ResourceModelImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceModel()
	 * @generated
	 */
	int RESOURCE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__PARENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>RModel Has IRepresentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__RMODEL_HAS_IREPRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>RModel Has Output Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__RMODEL_HAS_OUTPUT_REPRESENTATION = 3;

	/**
	 * The feature id for the '<em><b>RModel Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__RMODEL_HAS_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Has Related Model Manager</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__HAS_RELATED_MODEL_MANAGER = 5;

	/**
	 * The feature id for the '<em><b>Has Related Algo Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL = 6;

	/**
	 * The feature id for the '<em><b>RModel Has Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__RMODEL_HAS_SETTER = 7;

	/**
	 * The feature id for the '<em><b>RModel Has Getter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__RMODEL_HAS_GETTER = 8;

	/**
	 * The feature id for the '<em><b>Is Mapped To RDBMS Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__IS_MAPPED_TO_RDBMS_TABLE = 9;

	/**
	 * The feature id for the '<em><b>RModel Has Parse Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__RMODEL_HAS_PARSE_FUNCTION = 10;

	/**
	 * The feature id for the '<em><b>RModel Marshalling Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL__RMODEL_MARSHALLING_FUNCTION = 11;

	/**
	 * The number of structural features of the '<em>Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.ResourceControllerManagerImpl <em>Resource Controller Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.ResourceControllerManagerImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceControllerManager()
	 * @generated
	 */
	int RESOURCE_CONTROLLER_MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_MANAGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Controller URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI = 1;

	/**
	 * The feature id for the '<em><b>Has Associated RM Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>RC Manager Has CRUD Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_HAS_CRUD_ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_MANAGER__PARENT_NAME = 4;

	/**
	 * The number of structural features of the '<em>Resource Controller Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_MANAGER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Resource Controller Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.ResourceControllerImpl <em>Resource Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.ResourceControllerImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceController()
	 * @generated
	 */
	int RESOURCE_CONTROLLER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Controller URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER__CONTROLLER_URI = 1;

	/**
	 * The feature id for the '<em><b>Has Associated RModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER__HAS_ASSOCIATED_RMODEL = 2;

	/**
	 * The feature id for the '<em><b>RController Has CRUD Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER__RCONTROLLER_HAS_CRUD_ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER__PARENT_NAME = 4;

	/**
	 * The number of structural features of the '<em>Resource Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Resource Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.PIMComponentPropertyImpl <em>PIM Component Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.PIMComponentPropertyImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getPIMComponentProperty()
	 * @generated
	 */
	int PIM_COMPONENT_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_COMPONENT_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_COMPONENT_PROPERTY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_COMPONENT_PROPERTY__IS_UNIQUE = 2;

	/**
	 * The feature id for the '<em><b>Is Naming Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_COMPONENT_PROPERTY__IS_NAMING_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Is Primary Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_COMPONENT_PROPERTY__IS_PRIMARY_IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Is Mapped To RDBMS Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_COMPONENT_PROPERTY__IS_MAPPED_TO_RDBMS_COLUMN = 5;

	/**
	 * The number of structural features of the '<em>PIM Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_COMPONENT_PROPERTY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>PIM Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_COMPONENT_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.RepresentationParseFunctionImpl <em>Representation Parse Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.RepresentationParseFunctionImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRepresentationParseFunction()
	 * @generated
	 */
	int REPRESENTATION_PARSE_FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Parses Input Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_PARSE_FUNCTION__PARSES_INPUT_REPRESENTATION = 0;

	/**
	 * The number of structural features of the '<em>Representation Parse Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_PARSE_FUNCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Representation Parse Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_PARSE_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.RepresentationMarshallingFunctionImpl <em>Representation Marshalling Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.RepresentationMarshallingFunctionImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRepresentationMarshallingFunction()
	 * @generated
	 */
	int REPRESENTATION_MARSHALLING_FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Marshals Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_MARSHALLING_FUNCTION__MARSHALS_REPRESENTATION = 0;

	/**
	 * The number of structural features of the '<em>Representation Marshalling Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_MARSHALLING_FUNCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Representation Marshalling Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_MARSHALLING_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.ResourceInputRepresentationImpl <em>Resource Input Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.ResourceInputRepresentationImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceInputRepresentation()
	 * @generated
	 */
	int RESOURCE_INPUT_REPRESENTATION = 9;

	/**
	 * The feature id for the '<em><b>Input Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INPUT_REPRESENTATION__INPUT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Resource Input Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INPUT_REPRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource Input Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INPUT_REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.ResourceOutputRepresentationImpl <em>Resource Output Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.ResourceOutputRepresentationImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceOutputRepresentation()
	 * @generated
	 */
	int RESOURCE_OUTPUT_REPRESENTATION = 10;

	/**
	 * The feature id for the '<em><b>Output Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OUTPUT_REPRESENTATION__OUTPUT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Resource Output Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OUTPUT_REPRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource Output Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OUTPUT_REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.ResourceControllerCRUDActivityImpl <em>Resource Controller CRUD Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.ResourceControllerCRUDActivityImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceControllerCRUDActivity()
	 * @generated
	 */
	int RESOURCE_CONTROLLER_CRUD_ACTIVITY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_CRUD_ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Activity URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_CRUD_ACTIVITY__ACTIVITY_URI = 1;

	/**
	 * The feature id for the '<em><b>Crud Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_CRUD_ACTIVITY__CRUD_VERB = 2;

	/**
	 * The feature id for the '<em><b>Has CRUD Activity Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_CRUD_ACTIVITY__HAS_CRUD_ACTIVITY_HANDLER = 3;

	/**
	 * The feature id for the '<em><b>Is Mapped To RDBMS Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_CRUD_ACTIVITY__IS_MAPPED_TO_RDBMS_ACTIVITY = 4;

	/**
	 * The number of structural features of the '<em>Resource Controller CRUD Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_CRUD_ACTIVITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Resource Controller CRUD Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTROLLER_CRUD_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.PIMComponentFunctionImpl <em>PIM Component Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.PIMComponentFunctionImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getPIMComponentFunction()
	 * @generated
	 */
	int PIM_COMPONENT_FUNCTION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_COMPONENT_FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Function Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_COMPONENT_FUNCTION__HAS_FUNCTION_PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>PIM Component Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_COMPONENT_FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PIM Component Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_COMPONENT_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.SetterFunctionImpl <em>Setter Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.SetterFunctionImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getSetterFunction()
	 * @generated
	 */
	int SETTER_FUNCTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_FUNCTION__NAME = PIM_COMPONENT_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Has Function Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_FUNCTION__HAS_FUNCTION_PARAMETER = PIM_COMPONENT_FUNCTION__HAS_FUNCTION_PARAMETER;

	/**
	 * The feature id for the '<em><b>Sets Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_FUNCTION__SETS_PROPERTY = PIM_COMPONENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Setter Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_FUNCTION_FEATURE_COUNT = PIM_COMPONENT_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Setter Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_FUNCTION_OPERATION_COUNT = PIM_COMPONENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.GetterFunctionImpl <em>Getter Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.GetterFunctionImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getGetterFunction()
	 * @generated
	 */
	int GETTER_FUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER_FUNCTION__NAME = PIM_COMPONENT_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Has Function Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER_FUNCTION__HAS_FUNCTION_PARAMETER = PIM_COMPONENT_FUNCTION__HAS_FUNCTION_PARAMETER;

	/**
	 * The feature id for the '<em><b>Gets Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER_FUNCTION__GETS_PROPERTY = PIM_COMPONENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Getter Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER_FUNCTION_FEATURE_COUNT = PIM_COMPONENT_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Getter Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER_FUNCTION_OPERATION_COUNT = PIM_COMPONENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.FunctionParameterImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getFunctionParameter()
	 * @generated
	 */
	int FUNCTION_PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__IS_UNIQUE = 2;

	/**
	 * The feature id for the '<em><b>BIs Return Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__BIS_RETURN_PARAMETER = 3;

	/**
	 * The number of structural features of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.CRUDActivityHandlerImpl <em>CRUD Activity Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.CRUDActivityHandlerImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getCRUDActivityHandler()
	 * @generated
	 */
	int CRUD_ACTIVITY_HANDLER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY_HANDLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Crud Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY_HANDLER__CRUD_VERB = 1;

	/**
	 * The feature id for the '<em><b>Has Hypermedia Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Uses DB Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY_HANDLER__USES_DB_CONTROLLER = 3;

	/**
	 * The number of structural features of the '<em>CRUD Activity Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY_HANDLER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>CRUD Activity Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.CreateHypermediaPIMFunctionImpl <em>Create Hypermedia PIM Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.CreateHypermediaPIMFunctionImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getCreateHypermediaPIMFunction()
	 * @generated
	 */
	int CREATE_HYPERMEDIA_PIM_FUNCTION = 16;

	/**
	 * The feature id for the '<em><b>Has Hypermedia Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_HYPERMEDIA_PIM_FUNCTION__HAS_HYPERMEDIA_LINK = 0;

	/**
	 * The number of structural features of the '<em>Create Hypermedia PIM Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_HYPERMEDIA_PIM_FUNCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Create Hypermedia PIM Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_HYPERMEDIA_PIM_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.DatabaseControllerImpl <em>Database Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.DatabaseControllerImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getDatabaseController()
	 * @generated
	 */
	int DATABASE_CONTROLLER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has RDBMS Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTROLLER__HAS_RDBMS_ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Database Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTROLLER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Database Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.RDBMSActivityImpl <em>RDBMS Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.RDBMSActivityImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRDBMSActivity()
	 * @generated
	 */
	int RDBMS_ACTIVITY = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rdbms Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_ACTIVITY__RDBMS_VERB = 1;

	/**
	 * The feature id for the '<em><b>Alters RDBMS Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_ACTIVITY__ALTERS_RDBMS_TABLE = 2;

	/**
	 * The number of structural features of the '<em>RDBMS Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_ACTIVITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>RDBMS Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.RDBMSTableImpl <em>RDBMS Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.RDBMSTableImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRDBMSTable()
	 * @generated
	 */
	int RDBMS_TABLE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has RDBMS Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE__HAS_RDBMS_COLUMNS = 1;

	/**
	 * The number of structural features of the '<em>RDBMS Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RDBMS Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.RDBMSTableColumnImpl <em>RDBMS Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.RDBMSTableColumnImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRDBMSTableColumn()
	 * @generated
	 */
	int RDBMS_TABLE_COLUMN = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE_COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE_COLUMN__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE_COLUMN__IS_FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE_COLUMN__IS_PRIMARY_KEY = 3;

	/**
	 * The feature id for the '<em><b>References RDBMS Table</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE_COLUMN__REFERENCES_RDBMS_TABLE = 4;

	/**
	 * The number of structural features of the '<em>RDBMS Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE_COLUMN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>RDBMS Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_TABLE_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.HypermediaLinkImpl <em>Hypermedia Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.HypermediaLinkImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getHypermediaLink()
	 * @generated
	 */
	int HYPERMEDIA_LINK = 21;

	/**
	 * The feature id for the '<em><b>Link CRUD Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERMEDIA_LINK__LINK_CRUD_VERB = 0;

	/**
	 * The feature id for the '<em><b>Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERMEDIA_LINK__LINK_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Has Target Algo Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERMEDIA_LINK__HAS_TARGET_ALGO_CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Has Target RC Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Has Target RController</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERMEDIA_LINK__HAS_TARGET_RCONTROLLER = 4;

	/**
	 * The number of structural features of the '<em>Hypermedia Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERMEDIA_LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Hypermedia Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERMEDIA_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.RESTfulServicePIMImpl <em>RES Tful Service PIM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.RESTfulServicePIMImpl
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRESTfulServicePIM()
	 * @generated
	 */
	int RES_TFUL_SERVICE_PIM = 23;

	/**
	 * The feature id for the '<em><b>Has Resource Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Has Resource Model Manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Has Resource Controller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Has Resource Controller Manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Has Algo Resource Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Has Algo Resource Controller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_CONTROLLER = 5;

	/**
	 * The feature id for the '<em><b>Has RDBMS Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__HAS_RDBMS_TABLE = 6;

	/**
	 * The feature id for the '<em><b>Has Database Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__HAS_DATABASE_CONTROLLER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__NAME = 8;

	/**
	 * The number of structural features of the '<em>RES Tful Service PIM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>RES Tful Service PIM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.MediaType <em>Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.MediaType
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 24;

	/**
	 * The meta object id for the '{@link ServicePIM.CRUDVerb <em>CRUD Verb</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.CRUDVerb
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getCRUDVerb()
	 * @generated
	 */
	int CRUD_VERB = 25;

	/**
	 * The meta object id for the '{@link ServicePIM.RDBMSVerb <em>RDBMS Verb</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.RDBMSVerb
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRDBMSVerb()
	 * @generated
	 */
	int RDBMS_VERB = 26;

	/**
	 * The meta object id for the '{@link ServicePIM.LinkType <em>Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.LinkType
	 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 27;


	/**
	 * Returns the meta object for class '{@link ServicePIM.AlgoResourceModel <em>Algo Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algo Resource Model</em>'.
	 * @see ServicePIM.AlgoResourceModel
	 * @generated
	 */
	EClass getAlgoResourceModel();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.AlgoResourceModel#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see ServicePIM.AlgoResourceModel#getParentName()
	 * @see #getAlgoResourceModel()
	 * @generated
	 */
	EAttribute getAlgoResourceModel_ParentName();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.AlgoResourceModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.AlgoResourceModel#getName()
	 * @see #getAlgoResourceModel()
	 * @generated
	 */
	EAttribute getAlgoResourceModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.AlgoResourceModel#getAlgoModelHasInputRepresentation <em>Algo Model Has Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algo Model Has Input Representation</em>'.
	 * @see ServicePIM.AlgoResourceModel#getAlgoModelHasInputRepresentation()
	 * @see #getAlgoResourceModel()
	 * @generated
	 */
	EReference getAlgoResourceModel_AlgoModelHasInputRepresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.AlgoResourceModel#getAlgoModelHasOutputRepresentation <em>Algo Model Has Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algo Model Has Output Representation</em>'.
	 * @see ServicePIM.AlgoResourceModel#getAlgoModelHasOutputRepresentation()
	 * @see #getAlgoResourceModel()
	 * @generated
	 */
	EReference getAlgoResourceModel_AlgoModelHasOutputRepresentation();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.AlgoResourceModel#getAlgoModelHasProperty <em>Algo Model Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algo Model Has Property</em>'.
	 * @see ServicePIM.AlgoResourceModel#getAlgoModelHasProperty()
	 * @see #getAlgoResourceModel()
	 * @generated
	 */
	EReference getAlgoResourceModel_AlgoModelHasProperty();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.AlgoResourceModel#getAlgoModelHasSetter <em>Algo Model Has Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algo Model Has Setter</em>'.
	 * @see ServicePIM.AlgoResourceModel#getAlgoModelHasSetter()
	 * @see #getAlgoResourceModel()
	 * @generated
	 */
	EReference getAlgoResourceModel_AlgoModelHasSetter();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.AlgoResourceModel#getAlgoModelHasGetter <em>Algo Model Has Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algo Model Has Getter</em>'.
	 * @see ServicePIM.AlgoResourceModel#getAlgoModelHasGetter()
	 * @see #getAlgoResourceModel()
	 * @generated
	 */
	EReference getAlgoResourceModel_AlgoModelHasGetter();

	/**
	 * Returns the meta object for the reference list '{@link ServicePIM.AlgoResourceModel#getHasRelatedAlgoModel <em>Has Related Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Related Algo Model</em>'.
	 * @see ServicePIM.AlgoResourceModel#getHasRelatedAlgoModel()
	 * @see #getAlgoResourceModel()
	 * @generated
	 */
	EReference getAlgoResourceModel_HasRelatedAlgoModel();

	/**
	 * Returns the meta object for the reference list '{@link ServicePIM.AlgoResourceModel#getIsRelatedAlgoModel <em>Is Related Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Related Algo Model</em>'.
	 * @see ServicePIM.AlgoResourceModel#getIsRelatedAlgoModel()
	 * @see #getAlgoResourceModel()
	 * @generated
	 */
	EReference getAlgoResourceModel_IsRelatedAlgoModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.AlgoResourceModel#getAlgoModelHasParseFunction <em>Algo Model Has Parse Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algo Model Has Parse Function</em>'.
	 * @see ServicePIM.AlgoResourceModel#getAlgoModelHasParseFunction()
	 * @see #getAlgoResourceModel()
	 * @generated
	 */
	EReference getAlgoResourceModel_AlgoModelHasParseFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.AlgoResourceModel#getAlgoModelHasMarshallingFunction <em>Algo Model Has Marshalling Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algo Model Has Marshalling Function</em>'.
	 * @see ServicePIM.AlgoResourceModel#getAlgoModelHasMarshallingFunction()
	 * @see #getAlgoResourceModel()
	 * @generated
	 */
	EReference getAlgoResourceModel_AlgoModelHasMarshallingFunction();

	/**
	 * Returns the meta object for class '{@link ServicePIM.AlgoResourceController <em>Algo Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algo Resource Controller</em>'.
	 * @see ServicePIM.AlgoResourceController
	 * @generated
	 */
	EClass getAlgoResourceController();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.AlgoResourceController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.AlgoResourceController#getName()
	 * @see #getAlgoResourceController()
	 * @generated
	 */
	EAttribute getAlgoResourceController_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.AlgoResourceController#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see ServicePIM.AlgoResourceController#getParentName()
	 * @see #getAlgoResourceController()
	 * @generated
	 */
	EAttribute getAlgoResourceController_ParentName();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.AlgoResourceController#getControllerURI <em>Controller URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller URI</em>'.
	 * @see ServicePIM.AlgoResourceController#getControllerURI()
	 * @see #getAlgoResourceController()
	 * @generated
	 */
	EAttribute getAlgoResourceController_ControllerURI();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.AlgoResourceController#getHasAssociatedAlgoModel <em>Has Associated Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Associated Algo Model</em>'.
	 * @see ServicePIM.AlgoResourceController#getHasAssociatedAlgoModel()
	 * @see #getAlgoResourceController()
	 * @generated
	 */
	EReference getAlgoResourceController_HasAssociatedAlgoModel();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.AlgoResourceController#getAlgoControllerHasCRUDActivity <em>Algo Controller Has CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algo Controller Has CRUD Activity</em>'.
	 * @see ServicePIM.AlgoResourceController#getAlgoControllerHasCRUDActivity()
	 * @see #getAlgoResourceController()
	 * @generated
	 */
	EReference getAlgoResourceController_AlgoControllerHasCRUDActivity();

	/**
	 * Returns the meta object for class '{@link ServicePIM.ResourceModelManager <em>Resource Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Model Manager</em>'.
	 * @see ServicePIM.ResourceModelManager
	 * @generated
	 */
	EClass getResourceModelManager();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceModelManager#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.ResourceModelManager#getName()
	 * @see #getResourceModelManager()
	 * @generated
	 */
	EAttribute getResourceModelManager_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceModelManager#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see ServicePIM.ResourceModelManager#getParentName()
	 * @see #getResourceModelManager()
	 * @generated
	 */
	EAttribute getResourceModelManager_ParentName();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.ResourceModelManager#getHasRelatedModel <em>Has Related Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Related Model</em>'.
	 * @see ServicePIM.ResourceModelManager#getHasRelatedModel()
	 * @see #getResourceModelManager()
	 * @generated
	 */
	EReference getResourceModelManager_HasRelatedModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.ResourceModelManager#getRMManagerHasInputRepresentation <em>RM Manager Has Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RM Manager Has Input Representation</em>'.
	 * @see ServicePIM.ResourceModelManager#getRMManagerHasInputRepresentation()
	 * @see #getResourceModelManager()
	 * @generated
	 */
	EReference getResourceModelManager_RMManagerHasInputRepresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.ResourceModelManager#getRMManagerHasOutputRepresentation <em>RM Manager Has Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RM Manager Has Output Representation</em>'.
	 * @see ServicePIM.ResourceModelManager#getRMManagerHasOutputRepresentation()
	 * @see #getResourceModelManager()
	 * @generated
	 */
	EReference getResourceModelManager_RMManagerHasOutputRepresentation();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.ResourceModelManager#getHasRMManagerProperty <em>Has RM Manager Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has RM Manager Property</em>'.
	 * @see ServicePIM.ResourceModelManager#getHasRMManagerProperty()
	 * @see #getResourceModelManager()
	 * @generated
	 */
	EReference getResourceModelManager_HasRMManagerProperty();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.ResourceModelManager#getRMManagerHasSetter <em>RM Manager Has Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RM Manager Has Setter</em>'.
	 * @see ServicePIM.ResourceModelManager#getRMManagerHasSetter()
	 * @see #getResourceModelManager()
	 * @generated
	 */
	EReference getResourceModelManager_RMManagerHasSetter();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.ResourceModelManager#getRMManagerHasGetter <em>RM Manager Has Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RM Manager Has Getter</em>'.
	 * @see ServicePIM.ResourceModelManager#getRMManagerHasGetter()
	 * @see #getResourceModelManager()
	 * @generated
	 */
	EReference getResourceModelManager_RMManagerHasGetter();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.ResourceModelManager#getRMManagerHasParseFunction <em>RM Manager Has Parse Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RM Manager Has Parse Function</em>'.
	 * @see ServicePIM.ResourceModelManager#getRMManagerHasParseFunction()
	 * @see #getResourceModelManager()
	 * @generated
	 */
	EReference getResourceModelManager_RMManagerHasParseFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.ResourceModelManager#getRMManagerHasMarshallingFunction <em>RM Manager Has Marshalling Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RM Manager Has Marshalling Function</em>'.
	 * @see ServicePIM.ResourceModelManager#getRMManagerHasMarshallingFunction()
	 * @see #getResourceModelManager()
	 * @generated
	 */
	EReference getResourceModelManager_RMManagerHasMarshallingFunction();

	/**
	 * Returns the meta object for class '{@link ServicePIM.ResourceModel <em>Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Model</em>'.
	 * @see ServicePIM.ResourceModel
	 * @generated
	 */
	EClass getResourceModel();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.ResourceModel#getName()
	 * @see #getResourceModel()
	 * @generated
	 */
	EAttribute getResourceModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceModel#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see ServicePIM.ResourceModel#getParentName()
	 * @see #getResourceModel()
	 * @generated
	 */
	EAttribute getResourceModel_ParentName();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.ResourceModel#getRModelHasIRepresentation <em>RModel Has IRepresentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RModel Has IRepresentation</em>'.
	 * @see ServicePIM.ResourceModel#getRModelHasIRepresentation()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_RModelHasIRepresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.ResourceModel#getRModelHasOutputRepresentation <em>RModel Has Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RModel Has Output Representation</em>'.
	 * @see ServicePIM.ResourceModel#getRModelHasOutputRepresentation()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_RModelHasOutputRepresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.ResourceModel#getRModelHasProperty <em>RModel Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RModel Has Property</em>'.
	 * @see ServicePIM.ResourceModel#getRModelHasProperty()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_RModelHasProperty();

	/**
	 * Returns the meta object for the reference list '{@link ServicePIM.ResourceModel#getHasRelatedModelManager <em>Has Related Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Related Model Manager</em>'.
	 * @see ServicePIM.ResourceModel#getHasRelatedModelManager()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_HasRelatedModelManager();

	/**
	 * Returns the meta object for the reference list '{@link ServicePIM.ResourceModel#getHasRelatedAlgoModel <em>Has Related Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Related Algo Model</em>'.
	 * @see ServicePIM.ResourceModel#getHasRelatedAlgoModel()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_HasRelatedAlgoModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.ResourceModel#getRModelHasSetter <em>RModel Has Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RModel Has Setter</em>'.
	 * @see ServicePIM.ResourceModel#getRModelHasSetter()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_RModelHasSetter();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.ResourceModel#getRModelHasGetter <em>RModel Has Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RModel Has Getter</em>'.
	 * @see ServicePIM.ResourceModel#getRModelHasGetter()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_RModelHasGetter();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.ResourceModel#getIsMappedToRDBMSTable <em>Is Mapped To RDBMS Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Mapped To RDBMS Table</em>'.
	 * @see ServicePIM.ResourceModel#getIsMappedToRDBMSTable()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_IsMappedToRDBMSTable();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.ResourceModel#getRModelHasParseFunction <em>RModel Has Parse Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RModel Has Parse Function</em>'.
	 * @see ServicePIM.ResourceModel#getRModelHasParseFunction()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_RModelHasParseFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.ResourceModel#getRModelMarshallingFunction <em>RModel Marshalling Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RModel Marshalling Function</em>'.
	 * @see ServicePIM.ResourceModel#getRModelMarshallingFunction()
	 * @see #getResourceModel()
	 * @generated
	 */
	EReference getResourceModel_RModelMarshallingFunction();

	/**
	 * Returns the meta object for class '{@link ServicePIM.ResourceControllerManager <em>Resource Controller Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Controller Manager</em>'.
	 * @see ServicePIM.ResourceControllerManager
	 * @generated
	 */
	EClass getResourceControllerManager();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceControllerManager#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.ResourceControllerManager#getName()
	 * @see #getResourceControllerManager()
	 * @generated
	 */
	EAttribute getResourceControllerManager_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceControllerManager#getControllerURI <em>Controller URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller URI</em>'.
	 * @see ServicePIM.ResourceControllerManager#getControllerURI()
	 * @see #getResourceControllerManager()
	 * @generated
	 */
	EAttribute getResourceControllerManager_ControllerURI();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.ResourceControllerManager#getHasAssociatedRMManager <em>Has Associated RM Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Associated RM Manager</em>'.
	 * @see ServicePIM.ResourceControllerManager#getHasAssociatedRMManager()
	 * @see #getResourceControllerManager()
	 * @generated
	 */
	EReference getResourceControllerManager_HasAssociatedRMManager();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.ResourceControllerManager#getRCManagerHasCRUDActivity <em>RC Manager Has CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RC Manager Has CRUD Activity</em>'.
	 * @see ServicePIM.ResourceControllerManager#getRCManagerHasCRUDActivity()
	 * @see #getResourceControllerManager()
	 * @generated
	 */
	EReference getResourceControllerManager_RCManagerHasCRUDActivity();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceControllerManager#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see ServicePIM.ResourceControllerManager#getParentName()
	 * @see #getResourceControllerManager()
	 * @generated
	 */
	EAttribute getResourceControllerManager_ParentName();

	/**
	 * Returns the meta object for class '{@link ServicePIM.ResourceController <em>Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Controller</em>'.
	 * @see ServicePIM.ResourceController
	 * @generated
	 */
	EClass getResourceController();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.ResourceController#getName()
	 * @see #getResourceController()
	 * @generated
	 */
	EAttribute getResourceController_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceController#getControllerURI <em>Controller URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller URI</em>'.
	 * @see ServicePIM.ResourceController#getControllerURI()
	 * @see #getResourceController()
	 * @generated
	 */
	EAttribute getResourceController_ControllerURI();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.ResourceController#getHasAssociatedRModel <em>Has Associated RModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Associated RModel</em>'.
	 * @see ServicePIM.ResourceController#getHasAssociatedRModel()
	 * @see #getResourceController()
	 * @generated
	 */
	EReference getResourceController_HasAssociatedRModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.ResourceController#getRControllerHasCRUDActivity <em>RController Has CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RController Has CRUD Activity</em>'.
	 * @see ServicePIM.ResourceController#getRControllerHasCRUDActivity()
	 * @see #getResourceController()
	 * @generated
	 */
	EReference getResourceController_RControllerHasCRUDActivity();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceController#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see ServicePIM.ResourceController#getParentName()
	 * @see #getResourceController()
	 * @generated
	 */
	EAttribute getResourceController_ParentName();

	/**
	 * Returns the meta object for class '{@link ServicePIM.PIMComponentProperty <em>PIM Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIM Component Property</em>'.
	 * @see ServicePIM.PIMComponentProperty
	 * @generated
	 */
	EClass getPIMComponentProperty();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.PIMComponentProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.PIMComponentProperty#getName()
	 * @see #getPIMComponentProperty()
	 * @generated
	 */
	EAttribute getPIMComponentProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.PIMComponentProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ServicePIM.PIMComponentProperty#getType()
	 * @see #getPIMComponentProperty()
	 * @generated
	 */
	EAttribute getPIMComponentProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.PIMComponentProperty#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see ServicePIM.PIMComponentProperty#isIsUnique()
	 * @see #getPIMComponentProperty()
	 * @generated
	 */
	EAttribute getPIMComponentProperty_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.PIMComponentProperty#isIsNamingProperty <em>Is Naming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Naming Property</em>'.
	 * @see ServicePIM.PIMComponentProperty#isIsNamingProperty()
	 * @see #getPIMComponentProperty()
	 * @generated
	 */
	EAttribute getPIMComponentProperty_IsNamingProperty();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.PIMComponentProperty#isIsPrimaryIdentifier <em>Is Primary Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary Identifier</em>'.
	 * @see ServicePIM.PIMComponentProperty#isIsPrimaryIdentifier()
	 * @see #getPIMComponentProperty()
	 * @generated
	 */
	EAttribute getPIMComponentProperty_IsPrimaryIdentifier();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.PIMComponentProperty#getIsMappedToRDBMSColumn <em>Is Mapped To RDBMS Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Mapped To RDBMS Column</em>'.
	 * @see ServicePIM.PIMComponentProperty#getIsMappedToRDBMSColumn()
	 * @see #getPIMComponentProperty()
	 * @generated
	 */
	EReference getPIMComponentProperty_IsMappedToRDBMSColumn();

	/**
	 * Returns the meta object for class '{@link ServicePIM.RepresentationParseFunction <em>Representation Parse Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Parse Function</em>'.
	 * @see ServicePIM.RepresentationParseFunction
	 * @generated
	 */
	EClass getRepresentationParseFunction();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.RepresentationParseFunction#getParsesInputRepresentation <em>Parses Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parses Input Representation</em>'.
	 * @see ServicePIM.RepresentationParseFunction#getParsesInputRepresentation()
	 * @see #getRepresentationParseFunction()
	 * @generated
	 */
	EReference getRepresentationParseFunction_ParsesInputRepresentation();

	/**
	 * Returns the meta object for class '{@link ServicePIM.RepresentationMarshallingFunction <em>Representation Marshalling Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Marshalling Function</em>'.
	 * @see ServicePIM.RepresentationMarshallingFunction
	 * @generated
	 */
	EClass getRepresentationMarshallingFunction();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.RepresentationMarshallingFunction#getMarshalsRepresentation <em>Marshals Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marshals Representation</em>'.
	 * @see ServicePIM.RepresentationMarshallingFunction#getMarshalsRepresentation()
	 * @see #getRepresentationMarshallingFunction()
	 * @generated
	 */
	EReference getRepresentationMarshallingFunction_MarshalsRepresentation();

	/**
	 * Returns the meta object for class '{@link ServicePIM.ResourceInputRepresentation <em>Resource Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Input Representation</em>'.
	 * @see ServicePIM.ResourceInputRepresentation
	 * @generated
	 */
	EClass getResourceInputRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceInputRepresentation#getInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Type</em>'.
	 * @see ServicePIM.ResourceInputRepresentation#getInputType()
	 * @see #getResourceInputRepresentation()
	 * @generated
	 */
	EAttribute getResourceInputRepresentation_InputType();

	/**
	 * Returns the meta object for class '{@link ServicePIM.ResourceOutputRepresentation <em>Resource Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Output Representation</em>'.
	 * @see ServicePIM.ResourceOutputRepresentation
	 * @generated
	 */
	EClass getResourceOutputRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceOutputRepresentation#getOutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Type</em>'.
	 * @see ServicePIM.ResourceOutputRepresentation#getOutputType()
	 * @see #getResourceOutputRepresentation()
	 * @generated
	 */
	EAttribute getResourceOutputRepresentation_OutputType();

	/**
	 * Returns the meta object for class '{@link ServicePIM.ResourceControllerCRUDActivity <em>Resource Controller CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Controller CRUD Activity</em>'.
	 * @see ServicePIM.ResourceControllerCRUDActivity
	 * @generated
	 */
	EClass getResourceControllerCRUDActivity();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceControllerCRUDActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.ResourceControllerCRUDActivity#getName()
	 * @see #getResourceControllerCRUDActivity()
	 * @generated
	 */
	EAttribute getResourceControllerCRUDActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceControllerCRUDActivity#getActivityURI <em>Activity URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity URI</em>'.
	 * @see ServicePIM.ResourceControllerCRUDActivity#getActivityURI()
	 * @see #getResourceControllerCRUDActivity()
	 * @generated
	 */
	EAttribute getResourceControllerCRUDActivity_ActivityURI();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.ResourceControllerCRUDActivity#getCrudVerb <em>Crud Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crud Verb</em>'.
	 * @see ServicePIM.ResourceControllerCRUDActivity#getCrudVerb()
	 * @see #getResourceControllerCRUDActivity()
	 * @generated
	 */
	EAttribute getResourceControllerCRUDActivity_CrudVerb();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.ResourceControllerCRUDActivity#getHasCRUDActivityHandler <em>Has CRUD Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has CRUD Activity Handler</em>'.
	 * @see ServicePIM.ResourceControllerCRUDActivity#getHasCRUDActivityHandler()
	 * @see #getResourceControllerCRUDActivity()
	 * @generated
	 */
	EReference getResourceControllerCRUDActivity_HasCRUDActivityHandler();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.ResourceControllerCRUDActivity#getIsMappedToRDBMSActivity <em>Is Mapped To RDBMS Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Mapped To RDBMS Activity</em>'.
	 * @see ServicePIM.ResourceControllerCRUDActivity#getIsMappedToRDBMSActivity()
	 * @see #getResourceControllerCRUDActivity()
	 * @generated
	 */
	EReference getResourceControllerCRUDActivity_IsMappedToRDBMSActivity();

	/**
	 * Returns the meta object for class '{@link ServicePIM.SetterFunction <em>Setter Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setter Function</em>'.
	 * @see ServicePIM.SetterFunction
	 * @generated
	 */
	EClass getSetterFunction();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.SetterFunction#getSetsProperty <em>Sets Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sets Property</em>'.
	 * @see ServicePIM.SetterFunction#getSetsProperty()
	 * @see #getSetterFunction()
	 * @generated
	 */
	EReference getSetterFunction_SetsProperty();

	/**
	 * Returns the meta object for class '{@link ServicePIM.GetterFunction <em>Getter Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Getter Function</em>'.
	 * @see ServicePIM.GetterFunction
	 * @generated
	 */
	EClass getGetterFunction();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.GetterFunction#getGetsProperty <em>Gets Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gets Property</em>'.
	 * @see ServicePIM.GetterFunction#getGetsProperty()
	 * @see #getGetterFunction()
	 * @generated
	 */
	EReference getGetterFunction_GetsProperty();

	/**
	 * Returns the meta object for class '{@link ServicePIM.FunctionParameter <em>Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Parameter</em>'.
	 * @see ServicePIM.FunctionParameter
	 * @generated
	 */
	EClass getFunctionParameter();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.FunctionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.FunctionParameter#getName()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.FunctionParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ServicePIM.FunctionParameter#getType()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.FunctionParameter#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see ServicePIM.FunctionParameter#isIsUnique()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.FunctionParameter#isBIsReturnParameter <em>BIs Return Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Return Parameter</em>'.
	 * @see ServicePIM.FunctionParameter#isBIsReturnParameter()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_BIsReturnParameter();

	/**
	 * Returns the meta object for class '{@link ServicePIM.CRUDActivityHandler <em>CRUD Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRUD Activity Handler</em>'.
	 * @see ServicePIM.CRUDActivityHandler
	 * @generated
	 */
	EClass getCRUDActivityHandler();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.CRUDActivityHandler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.CRUDActivityHandler#getName()
	 * @see #getCRUDActivityHandler()
	 * @generated
	 */
	EAttribute getCRUDActivityHandler_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.CRUDActivityHandler#getCrudVerb <em>Crud Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crud Verb</em>'.
	 * @see ServicePIM.CRUDActivityHandler#getCrudVerb()
	 * @see #getCRUDActivityHandler()
	 * @generated
	 */
	EAttribute getCRUDActivityHandler_CrudVerb();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.CRUDActivityHandler#getHasHypermediaFunction <em>Has Hypermedia Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Hypermedia Function</em>'.
	 * @see ServicePIM.CRUDActivityHandler#getHasHypermediaFunction()
	 * @see #getCRUDActivityHandler()
	 * @generated
	 */
	EReference getCRUDActivityHandler_HasHypermediaFunction();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.CRUDActivityHandler#getUsesDBController <em>Uses DB Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses DB Controller</em>'.
	 * @see ServicePIM.CRUDActivityHandler#getUsesDBController()
	 * @see #getCRUDActivityHandler()
	 * @generated
	 */
	EReference getCRUDActivityHandler_UsesDBController();

	/**
	 * Returns the meta object for class '{@link ServicePIM.CreateHypermediaPIMFunction <em>Create Hypermedia PIM Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Hypermedia PIM Function</em>'.
	 * @see ServicePIM.CreateHypermediaPIMFunction
	 * @generated
	 */
	EClass getCreateHypermediaPIMFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.CreateHypermediaPIMFunction#getHasHypermediaLink <em>Has Hypermedia Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Hypermedia Link</em>'.
	 * @see ServicePIM.CreateHypermediaPIMFunction#getHasHypermediaLink()
	 * @see #getCreateHypermediaPIMFunction()
	 * @generated
	 */
	EReference getCreateHypermediaPIMFunction_HasHypermediaLink();

	/**
	 * Returns the meta object for class '{@link ServicePIM.DatabaseController <em>Database Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Controller</em>'.
	 * @see ServicePIM.DatabaseController
	 * @generated
	 */
	EClass getDatabaseController();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.DatabaseController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.DatabaseController#getName()
	 * @see #getDatabaseController()
	 * @generated
	 */
	EAttribute getDatabaseController_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.DatabaseController#getHasRDBMSActivity <em>Has RDBMS Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has RDBMS Activity</em>'.
	 * @see ServicePIM.DatabaseController#getHasRDBMSActivity()
	 * @see #getDatabaseController()
	 * @generated
	 */
	EReference getDatabaseController_HasRDBMSActivity();

	/**
	 * Returns the meta object for class '{@link ServicePIM.RDBMSActivity <em>RDBMS Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDBMS Activity</em>'.
	 * @see ServicePIM.RDBMSActivity
	 * @generated
	 */
	EClass getRDBMSActivity();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RDBMSActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.RDBMSActivity#getName()
	 * @see #getRDBMSActivity()
	 * @generated
	 */
	EAttribute getRDBMSActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RDBMSActivity#getRdbmsVerb <em>Rdbms Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rdbms Verb</em>'.
	 * @see ServicePIM.RDBMSActivity#getRdbmsVerb()
	 * @see #getRDBMSActivity()
	 * @generated
	 */
	EAttribute getRDBMSActivity_RdbmsVerb();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.RDBMSActivity#getAltersRDBMSTable <em>Alters RDBMS Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alters RDBMS Table</em>'.
	 * @see ServicePIM.RDBMSActivity#getAltersRDBMSTable()
	 * @see #getRDBMSActivity()
	 * @generated
	 */
	EReference getRDBMSActivity_AltersRDBMSTable();

	/**
	 * Returns the meta object for class '{@link ServicePIM.RDBMSTable <em>RDBMS Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDBMS Table</em>'.
	 * @see ServicePIM.RDBMSTable
	 * @generated
	 */
	EClass getRDBMSTable();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RDBMSTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.RDBMSTable#getName()
	 * @see #getRDBMSTable()
	 * @generated
	 */
	EAttribute getRDBMSTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.RDBMSTable#getHasRDBMSColumns <em>Has RDBMS Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has RDBMS Columns</em>'.
	 * @see ServicePIM.RDBMSTable#getHasRDBMSColumns()
	 * @see #getRDBMSTable()
	 * @generated
	 */
	EReference getRDBMSTable_HasRDBMSColumns();

	/**
	 * Returns the meta object for class '{@link ServicePIM.RDBMSTableColumn <em>RDBMS Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDBMS Table Column</em>'.
	 * @see ServicePIM.RDBMSTableColumn
	 * @generated
	 */
	EClass getRDBMSTableColumn();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RDBMSTableColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.RDBMSTableColumn#getName()
	 * @see #getRDBMSTableColumn()
	 * @generated
	 */
	EAttribute getRDBMSTableColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RDBMSTableColumn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ServicePIM.RDBMSTableColumn#getType()
	 * @see #getRDBMSTableColumn()
	 * @generated
	 */
	EAttribute getRDBMSTableColumn_Type();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RDBMSTableColumn#isIsForeignKey <em>Is Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Foreign Key</em>'.
	 * @see ServicePIM.RDBMSTableColumn#isIsForeignKey()
	 * @see #getRDBMSTableColumn()
	 * @generated
	 */
	EAttribute getRDBMSTableColumn_IsForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RDBMSTableColumn#isIsPrimaryKey <em>Is Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary Key</em>'.
	 * @see ServicePIM.RDBMSTableColumn#isIsPrimaryKey()
	 * @see #getRDBMSTableColumn()
	 * @generated
	 */
	EAttribute getRDBMSTableColumn_IsPrimaryKey();

	/**
	 * Returns the meta object for the reference list '{@link ServicePIM.RDBMSTableColumn#getReferencesRDBMSTable <em>References RDBMS Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References RDBMS Table</em>'.
	 * @see ServicePIM.RDBMSTableColumn#getReferencesRDBMSTable()
	 * @see #getRDBMSTableColumn()
	 * @generated
	 */
	EReference getRDBMSTableColumn_ReferencesRDBMSTable();

	/**
	 * Returns the meta object for class '{@link ServicePIM.HypermediaLink <em>Hypermedia Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypermedia Link</em>'.
	 * @see ServicePIM.HypermediaLink
	 * @generated
	 */
	EClass getHypermediaLink();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.HypermediaLink#getLinkCRUDVerb <em>Link CRUD Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link CRUD Verb</em>'.
	 * @see ServicePIM.HypermediaLink#getLinkCRUDVerb()
	 * @see #getHypermediaLink()
	 * @generated
	 */
	EAttribute getHypermediaLink_LinkCRUDVerb();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.HypermediaLink#getLinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Type</em>'.
	 * @see ServicePIM.HypermediaLink#getLinkType()
	 * @see #getHypermediaLink()
	 * @generated
	 */
	EAttribute getHypermediaLink_LinkType();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.HypermediaLink#getHasTargetAlgoController <em>Has Target Algo Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Target Algo Controller</em>'.
	 * @see ServicePIM.HypermediaLink#getHasTargetAlgoController()
	 * @see #getHypermediaLink()
	 * @generated
	 */
	EReference getHypermediaLink_HasTargetAlgoController();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.HypermediaLink#getHasTargetRCManager <em>Has Target RC Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Target RC Manager</em>'.
	 * @see ServicePIM.HypermediaLink#getHasTargetRCManager()
	 * @see #getHypermediaLink()
	 * @generated
	 */
	EReference getHypermediaLink_HasTargetRCManager();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.HypermediaLink#getHasTargetRController <em>Has Target RController</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Target RController</em>'.
	 * @see ServicePIM.HypermediaLink#getHasTargetRController()
	 * @see #getHypermediaLink()
	 * @generated
	 */
	EReference getHypermediaLink_HasTargetRController();

	/**
	 * Returns the meta object for class '{@link ServicePIM.PIMComponentFunction <em>PIM Component Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIM Component Function</em>'.
	 * @see ServicePIM.PIMComponentFunction
	 * @generated
	 */
	EClass getPIMComponentFunction();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.PIMComponentFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.PIMComponentFunction#getName()
	 * @see #getPIMComponentFunction()
	 * @generated
	 */
	EAttribute getPIMComponentFunction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.PIMComponentFunction#getHasFunctionParameter <em>Has Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Function Parameter</em>'.
	 * @see ServicePIM.PIMComponentFunction#getHasFunctionParameter()
	 * @see #getPIMComponentFunction()
	 * @generated
	 */
	EReference getPIMComponentFunction_HasFunctionParameter();

	/**
	 * Returns the meta object for class '{@link ServicePIM.RESTfulServicePIM <em>RES Tful Service PIM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RES Tful Service PIM</em>'.
	 * @see ServicePIM.RESTfulServicePIM
	 * @generated
	 */
	EClass getRESTfulServicePIM();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.RESTfulServicePIM#getHasResourceModel <em>Has Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resource Model</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getHasResourceModel()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EReference getRESTfulServicePIM_HasResourceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.RESTfulServicePIM#getHasResourceModelManager <em>Has Resource Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resource Model Manager</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getHasResourceModelManager()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EReference getRESTfulServicePIM_HasResourceModelManager();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.RESTfulServicePIM#getHasResourceController <em>Has Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resource Controller</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getHasResourceController()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EReference getRESTfulServicePIM_HasResourceController();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.RESTfulServicePIM#getHasResourceControllerManager <em>Has Resource Controller Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resource Controller Manager</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getHasResourceControllerManager()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EReference getRESTfulServicePIM_HasResourceControllerManager();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.RESTfulServicePIM#getHasAlgoResourceModel <em>Has Algo Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Algo Resource Model</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getHasAlgoResourceModel()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EReference getRESTfulServicePIM_HasAlgoResourceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.RESTfulServicePIM#getHasAlgoResourceController <em>Has Algo Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Algo Resource Controller</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getHasAlgoResourceController()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EReference getRESTfulServicePIM_HasAlgoResourceController();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.RESTfulServicePIM#getHasRDBMSTable <em>Has RDBMS Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has RDBMS Table</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getHasRDBMSTable()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EReference getRESTfulServicePIM_HasRDBMSTable();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.RESTfulServicePIM#getHasDatabaseController <em>Has Database Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Database Controller</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getHasDatabaseController()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EReference getRESTfulServicePIM_HasDatabaseController();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RESTfulServicePIM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getName()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EAttribute getRESTfulServicePIM_Name();

	/**
	 * Returns the meta object for enum '{@link ServicePIM.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type</em>'.
	 * @see ServicePIM.MediaType
	 * @generated
	 */
	EEnum getMediaType();

	/**
	 * Returns the meta object for enum '{@link ServicePIM.CRUDVerb <em>CRUD Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CRUD Verb</em>'.
	 * @see ServicePIM.CRUDVerb
	 * @generated
	 */
	EEnum getCRUDVerb();

	/**
	 * Returns the meta object for enum '{@link ServicePIM.RDBMSVerb <em>RDBMS Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RDBMS Verb</em>'.
	 * @see ServicePIM.RDBMSVerb
	 * @generated
	 */
	EEnum getRDBMSVerb();

	/**
	 * Returns the meta object for enum '{@link ServicePIM.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Type</em>'.
	 * @see ServicePIM.LinkType
	 * @generated
	 */
	EEnum getLinkType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RESTServicePIMFactory getRESTServicePIMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ServicePIM.impl.AlgoResourceModelImpl <em>Algo Resource Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.AlgoResourceModelImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getAlgoResourceModel()
		 * @generated
		 */
		EClass ALGO_RESOURCE_MODEL = eINSTANCE.getAlgoResourceModel();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO_RESOURCE_MODEL__PARENT_NAME = eINSTANCE.getAlgoResourceModel_ParentName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO_RESOURCE_MODEL__NAME = eINSTANCE.getAlgoResourceModel_Name();

		/**
		 * The meta object literal for the '<em><b>Algo Model Has Input Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_INPUT_REPRESENTATION = eINSTANCE.getAlgoResourceModel_AlgoModelHasInputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Algo Model Has Output Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_OUTPUT_REPRESENTATION = eINSTANCE.getAlgoResourceModel_AlgoModelHasOutputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Algo Model Has Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PROPERTY = eINSTANCE.getAlgoResourceModel_AlgoModelHasProperty();

		/**
		 * The meta object literal for the '<em><b>Algo Model Has Setter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_SETTER = eINSTANCE.getAlgoResourceModel_AlgoModelHasSetter();

		/**
		 * The meta object literal for the '<em><b>Algo Model Has Getter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_GETTER = eINSTANCE.getAlgoResourceModel_AlgoModelHasGetter();

		/**
		 * The meta object literal for the '<em><b>Has Related Algo Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL = eINSTANCE.getAlgoResourceModel_HasRelatedAlgoModel();

		/**
		 * The meta object literal for the '<em><b>Is Related Algo Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL = eINSTANCE.getAlgoResourceModel_IsRelatedAlgoModel();

		/**
		 * The meta object literal for the '<em><b>Algo Model Has Parse Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PARSE_FUNCTION = eINSTANCE.getAlgoResourceModel_AlgoModelHasParseFunction();

		/**
		 * The meta object literal for the '<em><b>Algo Model Has Marshalling Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_MARSHALLING_FUNCTION = eINSTANCE.getAlgoResourceModel_AlgoModelHasMarshallingFunction();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.AlgoResourceControllerImpl <em>Algo Resource Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.AlgoResourceControllerImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getAlgoResourceController()
		 * @generated
		 */
		EClass ALGO_RESOURCE_CONTROLLER = eINSTANCE.getAlgoResourceController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO_RESOURCE_CONTROLLER__NAME = eINSTANCE.getAlgoResourceController_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO_RESOURCE_CONTROLLER__PARENT_NAME = eINSTANCE.getAlgoResourceController_ParentName();

		/**
		 * The meta object literal for the '<em><b>Controller URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI = eINSTANCE.getAlgoResourceController_ControllerURI();

		/**
		 * The meta object literal for the '<em><b>Has Associated Algo Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL = eINSTANCE.getAlgoResourceController_HasAssociatedAlgoModel();

		/**
		 * The meta object literal for the '<em><b>Algo Controller Has CRUD Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_CRUD_ACTIVITY = eINSTANCE.getAlgoResourceController_AlgoControllerHasCRUDActivity();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.ResourceModelManagerImpl <em>Resource Model Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.ResourceModelManagerImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceModelManager()
		 * @generated
		 */
		EClass RESOURCE_MODEL_MANAGER = eINSTANCE.getResourceModelManager();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_MODEL_MANAGER__NAME = eINSTANCE.getResourceModelManager_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_MODEL_MANAGER__PARENT_NAME = eINSTANCE.getResourceModelManager_ParentName();

		/**
		 * The meta object literal for the '<em><b>Has Related Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL_MANAGER__HAS_RELATED_MODEL = eINSTANCE.getResourceModelManager_HasRelatedModel();

		/**
		 * The meta object literal for the '<em><b>RM Manager Has Input Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_INPUT_REPRESENTATION = eINSTANCE.getResourceModelManager_RMManagerHasInputRepresentation();

		/**
		 * The meta object literal for the '<em><b>RM Manager Has Output Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_OUTPUT_REPRESENTATION = eINSTANCE.getResourceModelManager_RMManagerHasOutputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Has RM Manager Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL_MANAGER__HAS_RM_MANAGER_PROPERTY = eINSTANCE.getResourceModelManager_HasRMManagerProperty();

		/**
		 * The meta object literal for the '<em><b>RM Manager Has Setter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_SETTER = eINSTANCE.getResourceModelManager_RMManagerHasSetter();

		/**
		 * The meta object literal for the '<em><b>RM Manager Has Getter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_GETTER = eINSTANCE.getResourceModelManager_RMManagerHasGetter();

		/**
		 * The meta object literal for the '<em><b>RM Manager Has Parse Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_PARSE_FUNCTION = eINSTANCE.getResourceModelManager_RMManagerHasParseFunction();

		/**
		 * The meta object literal for the '<em><b>RM Manager Has Marshalling Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_MARSHALLING_FUNCTION = eINSTANCE.getResourceModelManager_RMManagerHasMarshallingFunction();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.ResourceModelImpl <em>Resource Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.ResourceModelImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceModel()
		 * @generated
		 */
		EClass RESOURCE_MODEL = eINSTANCE.getResourceModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_MODEL__NAME = eINSTANCE.getResourceModel_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_MODEL__PARENT_NAME = eINSTANCE.getResourceModel_ParentName();

		/**
		 * The meta object literal for the '<em><b>RModel Has IRepresentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__RMODEL_HAS_IREPRESENTATION = eINSTANCE.getResourceModel_RModelHasIRepresentation();

		/**
		 * The meta object literal for the '<em><b>RModel Has Output Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__RMODEL_HAS_OUTPUT_REPRESENTATION = eINSTANCE.getResourceModel_RModelHasOutputRepresentation();

		/**
		 * The meta object literal for the '<em><b>RModel Has Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__RMODEL_HAS_PROPERTY = eINSTANCE.getResourceModel_RModelHasProperty();

		/**
		 * The meta object literal for the '<em><b>Has Related Model Manager</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__HAS_RELATED_MODEL_MANAGER = eINSTANCE.getResourceModel_HasRelatedModelManager();

		/**
		 * The meta object literal for the '<em><b>Has Related Algo Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL = eINSTANCE.getResourceModel_HasRelatedAlgoModel();

		/**
		 * The meta object literal for the '<em><b>RModel Has Setter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__RMODEL_HAS_SETTER = eINSTANCE.getResourceModel_RModelHasSetter();

		/**
		 * The meta object literal for the '<em><b>RModel Has Getter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__RMODEL_HAS_GETTER = eINSTANCE.getResourceModel_RModelHasGetter();

		/**
		 * The meta object literal for the '<em><b>Is Mapped To RDBMS Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__IS_MAPPED_TO_RDBMS_TABLE = eINSTANCE.getResourceModel_IsMappedToRDBMSTable();

		/**
		 * The meta object literal for the '<em><b>RModel Has Parse Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__RMODEL_HAS_PARSE_FUNCTION = eINSTANCE.getResourceModel_RModelHasParseFunction();

		/**
		 * The meta object literal for the '<em><b>RModel Marshalling Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_MODEL__RMODEL_MARSHALLING_FUNCTION = eINSTANCE.getResourceModel_RModelMarshallingFunction();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.ResourceControllerManagerImpl <em>Resource Controller Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.ResourceControllerManagerImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceControllerManager()
		 * @generated
		 */
		EClass RESOURCE_CONTROLLER_MANAGER = eINSTANCE.getResourceControllerManager();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTROLLER_MANAGER__NAME = eINSTANCE.getResourceControllerManager_Name();

		/**
		 * The meta object literal for the '<em><b>Controller URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI = eINSTANCE.getResourceControllerManager_ControllerURI();

		/**
		 * The meta object literal for the '<em><b>Has Associated RM Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER = eINSTANCE.getResourceControllerManager_HasAssociatedRMManager();

		/**
		 * The meta object literal for the '<em><b>RC Manager Has CRUD Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_HAS_CRUD_ACTIVITY = eINSTANCE.getResourceControllerManager_RCManagerHasCRUDActivity();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTROLLER_MANAGER__PARENT_NAME = eINSTANCE.getResourceControllerManager_ParentName();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.ResourceControllerImpl <em>Resource Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.ResourceControllerImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceController()
		 * @generated
		 */
		EClass RESOURCE_CONTROLLER = eINSTANCE.getResourceController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTROLLER__NAME = eINSTANCE.getResourceController_Name();

		/**
		 * The meta object literal for the '<em><b>Controller URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTROLLER__CONTROLLER_URI = eINSTANCE.getResourceController_ControllerURI();

		/**
		 * The meta object literal for the '<em><b>Has Associated RModel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTROLLER__HAS_ASSOCIATED_RMODEL = eINSTANCE.getResourceController_HasAssociatedRModel();

		/**
		 * The meta object literal for the '<em><b>RController Has CRUD Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTROLLER__RCONTROLLER_HAS_CRUD_ACTIVITY = eINSTANCE.getResourceController_RControllerHasCRUDActivity();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTROLLER__PARENT_NAME = eINSTANCE.getResourceController_ParentName();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.PIMComponentPropertyImpl <em>PIM Component Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.PIMComponentPropertyImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getPIMComponentProperty()
		 * @generated
		 */
		EClass PIM_COMPONENT_PROPERTY = eINSTANCE.getPIMComponentProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIM_COMPONENT_PROPERTY__NAME = eINSTANCE.getPIMComponentProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIM_COMPONENT_PROPERTY__TYPE = eINSTANCE.getPIMComponentProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIM_COMPONENT_PROPERTY__IS_UNIQUE = eINSTANCE.getPIMComponentProperty_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Is Naming Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIM_COMPONENT_PROPERTY__IS_NAMING_PROPERTY = eINSTANCE.getPIMComponentProperty_IsNamingProperty();

		/**
		 * The meta object literal for the '<em><b>Is Primary Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIM_COMPONENT_PROPERTY__IS_PRIMARY_IDENTIFIER = eINSTANCE.getPIMComponentProperty_IsPrimaryIdentifier();

		/**
		 * The meta object literal for the '<em><b>Is Mapped To RDBMS Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIM_COMPONENT_PROPERTY__IS_MAPPED_TO_RDBMS_COLUMN = eINSTANCE.getPIMComponentProperty_IsMappedToRDBMSColumn();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.RepresentationParseFunctionImpl <em>Representation Parse Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.RepresentationParseFunctionImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRepresentationParseFunction()
		 * @generated
		 */
		EClass REPRESENTATION_PARSE_FUNCTION = eINSTANCE.getRepresentationParseFunction();

		/**
		 * The meta object literal for the '<em><b>Parses Input Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_PARSE_FUNCTION__PARSES_INPUT_REPRESENTATION = eINSTANCE.getRepresentationParseFunction_ParsesInputRepresentation();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.RepresentationMarshallingFunctionImpl <em>Representation Marshalling Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.RepresentationMarshallingFunctionImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRepresentationMarshallingFunction()
		 * @generated
		 */
		EClass REPRESENTATION_MARSHALLING_FUNCTION = eINSTANCE.getRepresentationMarshallingFunction();

		/**
		 * The meta object literal for the '<em><b>Marshals Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_MARSHALLING_FUNCTION__MARSHALS_REPRESENTATION = eINSTANCE.getRepresentationMarshallingFunction_MarshalsRepresentation();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.ResourceInputRepresentationImpl <em>Resource Input Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.ResourceInputRepresentationImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceInputRepresentation()
		 * @generated
		 */
		EClass RESOURCE_INPUT_REPRESENTATION = eINSTANCE.getResourceInputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INPUT_REPRESENTATION__INPUT_TYPE = eINSTANCE.getResourceInputRepresentation_InputType();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.ResourceOutputRepresentationImpl <em>Resource Output Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.ResourceOutputRepresentationImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceOutputRepresentation()
		 * @generated
		 */
		EClass RESOURCE_OUTPUT_REPRESENTATION = eINSTANCE.getResourceOutputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Output Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_OUTPUT_REPRESENTATION__OUTPUT_TYPE = eINSTANCE.getResourceOutputRepresentation_OutputType();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.ResourceControllerCRUDActivityImpl <em>Resource Controller CRUD Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.ResourceControllerCRUDActivityImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getResourceControllerCRUDActivity()
		 * @generated
		 */
		EClass RESOURCE_CONTROLLER_CRUD_ACTIVITY = eINSTANCE.getResourceControllerCRUDActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTROLLER_CRUD_ACTIVITY__NAME = eINSTANCE.getResourceControllerCRUDActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Activity URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTROLLER_CRUD_ACTIVITY__ACTIVITY_URI = eINSTANCE.getResourceControllerCRUDActivity_ActivityURI();

		/**
		 * The meta object literal for the '<em><b>Crud Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONTROLLER_CRUD_ACTIVITY__CRUD_VERB = eINSTANCE.getResourceControllerCRUDActivity_CrudVerb();

		/**
		 * The meta object literal for the '<em><b>Has CRUD Activity Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTROLLER_CRUD_ACTIVITY__HAS_CRUD_ACTIVITY_HANDLER = eINSTANCE.getResourceControllerCRUDActivity_HasCRUDActivityHandler();

		/**
		 * The meta object literal for the '<em><b>Is Mapped To RDBMS Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTROLLER_CRUD_ACTIVITY__IS_MAPPED_TO_RDBMS_ACTIVITY = eINSTANCE.getResourceControllerCRUDActivity_IsMappedToRDBMSActivity();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.SetterFunctionImpl <em>Setter Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.SetterFunctionImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getSetterFunction()
		 * @generated
		 */
		EClass SETTER_FUNCTION = eINSTANCE.getSetterFunction();

		/**
		 * The meta object literal for the '<em><b>Sets Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTER_FUNCTION__SETS_PROPERTY = eINSTANCE.getSetterFunction_SetsProperty();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.GetterFunctionImpl <em>Getter Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.GetterFunctionImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getGetterFunction()
		 * @generated
		 */
		EClass GETTER_FUNCTION = eINSTANCE.getGetterFunction();

		/**
		 * The meta object literal for the '<em><b>Gets Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GETTER_FUNCTION__GETS_PROPERTY = eINSTANCE.getGetterFunction_GetsProperty();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.FunctionParameterImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getFunctionParameter()
		 * @generated
		 */
		EClass FUNCTION_PARAMETER = eINSTANCE.getFunctionParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__NAME = eINSTANCE.getFunctionParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__TYPE = eINSTANCE.getFunctionParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__IS_UNIQUE = eINSTANCE.getFunctionParameter_IsUnique();

		/**
		 * The meta object literal for the '<em><b>BIs Return Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__BIS_RETURN_PARAMETER = eINSTANCE.getFunctionParameter_BIsReturnParameter();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.CRUDActivityHandlerImpl <em>CRUD Activity Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.CRUDActivityHandlerImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getCRUDActivityHandler()
		 * @generated
		 */
		EClass CRUD_ACTIVITY_HANDLER = eINSTANCE.getCRUDActivityHandler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRUD_ACTIVITY_HANDLER__NAME = eINSTANCE.getCRUDActivityHandler_Name();

		/**
		 * The meta object literal for the '<em><b>Crud Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRUD_ACTIVITY_HANDLER__CRUD_VERB = eINSTANCE.getCRUDActivityHandler_CrudVerb();

		/**
		 * The meta object literal for the '<em><b>Has Hypermedia Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRUD_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION = eINSTANCE.getCRUDActivityHandler_HasHypermediaFunction();

		/**
		 * The meta object literal for the '<em><b>Uses DB Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRUD_ACTIVITY_HANDLER__USES_DB_CONTROLLER = eINSTANCE.getCRUDActivityHandler_UsesDBController();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.CreateHypermediaPIMFunctionImpl <em>Create Hypermedia PIM Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.CreateHypermediaPIMFunctionImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getCreateHypermediaPIMFunction()
		 * @generated
		 */
		EClass CREATE_HYPERMEDIA_PIM_FUNCTION = eINSTANCE.getCreateHypermediaPIMFunction();

		/**
		 * The meta object literal for the '<em><b>Has Hypermedia Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_HYPERMEDIA_PIM_FUNCTION__HAS_HYPERMEDIA_LINK = eINSTANCE.getCreateHypermediaPIMFunction_HasHypermediaLink();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.DatabaseControllerImpl <em>Database Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.DatabaseControllerImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getDatabaseController()
		 * @generated
		 */
		EClass DATABASE_CONTROLLER = eINSTANCE.getDatabaseController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_CONTROLLER__NAME = eINSTANCE.getDatabaseController_Name();

		/**
		 * The meta object literal for the '<em><b>Has RDBMS Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONTROLLER__HAS_RDBMS_ACTIVITY = eINSTANCE.getDatabaseController_HasRDBMSActivity();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.RDBMSActivityImpl <em>RDBMS Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.RDBMSActivityImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRDBMSActivity()
		 * @generated
		 */
		EClass RDBMS_ACTIVITY = eINSTANCE.getRDBMSActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDBMS_ACTIVITY__NAME = eINSTANCE.getRDBMSActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Rdbms Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDBMS_ACTIVITY__RDBMS_VERB = eINSTANCE.getRDBMSActivity_RdbmsVerb();

		/**
		 * The meta object literal for the '<em><b>Alters RDBMS Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_ACTIVITY__ALTERS_RDBMS_TABLE = eINSTANCE.getRDBMSActivity_AltersRDBMSTable();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.RDBMSTableImpl <em>RDBMS Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.RDBMSTableImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRDBMSTable()
		 * @generated
		 */
		EClass RDBMS_TABLE = eINSTANCE.getRDBMSTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDBMS_TABLE__NAME = eINSTANCE.getRDBMSTable_Name();

		/**
		 * The meta object literal for the '<em><b>Has RDBMS Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_TABLE__HAS_RDBMS_COLUMNS = eINSTANCE.getRDBMSTable_HasRDBMSColumns();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.RDBMSTableColumnImpl <em>RDBMS Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.RDBMSTableColumnImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRDBMSTableColumn()
		 * @generated
		 */
		EClass RDBMS_TABLE_COLUMN = eINSTANCE.getRDBMSTableColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDBMS_TABLE_COLUMN__NAME = eINSTANCE.getRDBMSTableColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDBMS_TABLE_COLUMN__TYPE = eINSTANCE.getRDBMSTableColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Is Foreign Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDBMS_TABLE_COLUMN__IS_FOREIGN_KEY = eINSTANCE.getRDBMSTableColumn_IsForeignKey();

		/**
		 * The meta object literal for the '<em><b>Is Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDBMS_TABLE_COLUMN__IS_PRIMARY_KEY = eINSTANCE.getRDBMSTableColumn_IsPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>References RDBMS Table</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS_TABLE_COLUMN__REFERENCES_RDBMS_TABLE = eINSTANCE.getRDBMSTableColumn_ReferencesRDBMSTable();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.HypermediaLinkImpl <em>Hypermedia Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.HypermediaLinkImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getHypermediaLink()
		 * @generated
		 */
		EClass HYPERMEDIA_LINK = eINSTANCE.getHypermediaLink();

		/**
		 * The meta object literal for the '<em><b>Link CRUD Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERMEDIA_LINK__LINK_CRUD_VERB = eINSTANCE.getHypermediaLink_LinkCRUDVerb();

		/**
		 * The meta object literal for the '<em><b>Link Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERMEDIA_LINK__LINK_TYPE = eINSTANCE.getHypermediaLink_LinkType();

		/**
		 * The meta object literal for the '<em><b>Has Target Algo Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERMEDIA_LINK__HAS_TARGET_ALGO_CONTROLLER = eINSTANCE.getHypermediaLink_HasTargetAlgoController();

		/**
		 * The meta object literal for the '<em><b>Has Target RC Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER = eINSTANCE.getHypermediaLink_HasTargetRCManager();

		/**
		 * The meta object literal for the '<em><b>Has Target RController</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERMEDIA_LINK__HAS_TARGET_RCONTROLLER = eINSTANCE.getHypermediaLink_HasTargetRController();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.PIMComponentFunctionImpl <em>PIM Component Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.PIMComponentFunctionImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getPIMComponentFunction()
		 * @generated
		 */
		EClass PIM_COMPONENT_FUNCTION = eINSTANCE.getPIMComponentFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIM_COMPONENT_FUNCTION__NAME = eINSTANCE.getPIMComponentFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Has Function Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIM_COMPONENT_FUNCTION__HAS_FUNCTION_PARAMETER = eINSTANCE.getPIMComponentFunction_HasFunctionParameter();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.RESTfulServicePIMImpl <em>RES Tful Service PIM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.RESTfulServicePIMImpl
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRESTfulServicePIM()
		 * @generated
		 */
		EClass RES_TFUL_SERVICE_PIM = eINSTANCE.getRESTfulServicePIM();

		/**
		 * The meta object literal for the '<em><b>Has Resource Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL = eINSTANCE.getRESTfulServicePIM_HasResourceModel();

		/**
		 * The meta object literal for the '<em><b>Has Resource Model Manager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL_MANAGER = eINSTANCE.getRESTfulServicePIM_HasResourceModelManager();

		/**
		 * The meta object literal for the '<em><b>Has Resource Controller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER = eINSTANCE.getRESTfulServicePIM_HasResourceController();

		/**
		 * The meta object literal for the '<em><b>Has Resource Controller Manager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER_MANAGER = eINSTANCE.getRESTfulServicePIM_HasResourceControllerManager();

		/**
		 * The meta object literal for the '<em><b>Has Algo Resource Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_MODEL = eINSTANCE.getRESTfulServicePIM_HasAlgoResourceModel();

		/**
		 * The meta object literal for the '<em><b>Has Algo Resource Controller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_CONTROLLER = eINSTANCE.getRESTfulServicePIM_HasAlgoResourceController();

		/**
		 * The meta object literal for the '<em><b>Has RDBMS Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__HAS_RDBMS_TABLE = eINSTANCE.getRESTfulServicePIM_HasRDBMSTable();

		/**
		 * The meta object literal for the '<em><b>Has Database Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__HAS_DATABASE_CONTROLLER = eINSTANCE.getRESTfulServicePIM_HasDatabaseController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PIM__NAME = eINSTANCE.getRESTfulServicePIM_Name();

		/**
		 * The meta object literal for the '{@link ServicePIM.MediaType <em>Media Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.MediaType
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getMediaType()
		 * @generated
		 */
		EEnum MEDIA_TYPE = eINSTANCE.getMediaType();

		/**
		 * The meta object literal for the '{@link ServicePIM.CRUDVerb <em>CRUD Verb</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.CRUDVerb
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getCRUDVerb()
		 * @generated
		 */
		EEnum CRUD_VERB = eINSTANCE.getCRUDVerb();

		/**
		 * The meta object literal for the '{@link ServicePIM.RDBMSVerb <em>RDBMS Verb</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.RDBMSVerb
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getRDBMSVerb()
		 * @generated
		 */
		EEnum RDBMS_VERB = eINSTANCE.getRDBMSVerb();

		/**
		 * The meta object literal for the '{@link ServicePIM.LinkType <em>Link Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.LinkType
		 * @see ServicePIM.impl.RESTServicePIMPackageImpl#getLinkType()
		 * @generated
		 */
		EEnum LINK_TYPE = eINSTANCE.getLinkType();

	}

} //RESTServicePIMPackage
