/**
 */
package ServicePIM.util;

import ServicePIM.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ServicePIM.RESTServicePIMPackage
 * @generated
 */
public class RESTServicePIMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RESTServicePIMValidator INSTANCE = new RESTServicePIMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ServicePIM";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTServicePIMValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RESTServicePIMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL:
				return validateAlgoResourceModel((AlgoResourceModel)value, diagnostics, context);
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER:
				return validateAlgoResourceController((AlgoResourceController)value, diagnostics, context);
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER:
				return validateResourceModelManager((ResourceModelManager)value, diagnostics, context);
			case RESTServicePIMPackage.RESOURCE_MODEL:
				return validateResourceModel((ResourceModel)value, diagnostics, context);
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER:
				return validateResourceControllerManager((ResourceControllerManager)value, diagnostics, context);
			case RESTServicePIMPackage.RESOURCE_CONTROLLER:
				return validateResourceController((ResourceController)value, diagnostics, context);
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY:
				return validatePIMComponentProperty((PIMComponentProperty)value, diagnostics, context);
			case RESTServicePIMPackage.REPRESENTATION_PARSE_FUNCTION:
				return validateRepresentationParseFunction((RepresentationParseFunction)value, diagnostics, context);
			case RESTServicePIMPackage.REPRESENTATION_MARSHALLING_FUNCTION:
				return validateRepresentationMarshallingFunction((RepresentationMarshallingFunction)value, diagnostics, context);
			case RESTServicePIMPackage.RESOURCE_INPUT_REPRESENTATION:
				return validateResourceInputRepresentation((ResourceInputRepresentation)value, diagnostics, context);
			case RESTServicePIMPackage.RESOURCE_OUTPUT_REPRESENTATION:
				return validateResourceOutputRepresentation((ResourceOutputRepresentation)value, diagnostics, context);
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY:
				return validateResourceControllerCRUDActivity((ResourceControllerCRUDActivity)value, diagnostics, context);
			case RESTServicePIMPackage.SETTER_FUNCTION:
				return validateSetterFunction((SetterFunction)value, diagnostics, context);
			case RESTServicePIMPackage.GETTER_FUNCTION:
				return validateGetterFunction((GetterFunction)value, diagnostics, context);
			case RESTServicePIMPackage.FUNCTION_PARAMETER:
				return validateFunctionParameter((FunctionParameter)value, diagnostics, context);
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER:
				return validateCRUDActivityHandler((CRUDActivityHandler)value, diagnostics, context);
			case RESTServicePIMPackage.CREATE_HYPERMEDIA_PIM_FUNCTION:
				return validateCreateHypermediaPIMFunction((CreateHypermediaPIMFunction)value, diagnostics, context);
			case RESTServicePIMPackage.DATABASE_CONTROLLER:
				return validateDatabaseController((DatabaseController)value, diagnostics, context);
			case RESTServicePIMPackage.RDBMS_ACTIVITY:
				return validateRDBMSActivity((RDBMSActivity)value, diagnostics, context);
			case RESTServicePIMPackage.RDBMS_TABLE:
				return validateRDBMSTable((RDBMSTable)value, diagnostics, context);
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN:
				return validateRDBMSTableColumn((RDBMSTableColumn)value, diagnostics, context);
			case RESTServicePIMPackage.HYPERMEDIA_LINK:
				return validateHypermediaLink((HypermediaLink)value, diagnostics, context);
			case RESTServicePIMPackage.PIM_COMPONENT_FUNCTION:
				return validatePIMComponentFunction((PIMComponentFunction)value, diagnostics, context);
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM:
				return validateRESTfulServicePIM((RESTfulServicePIM)value, diagnostics, context);
			case RESTServicePIMPackage.MEDIA_TYPE:
				return validateMediaType((MediaType)value, diagnostics, context);
			case RESTServicePIMPackage.CRUD_VERB:
				return validateCRUDVerb((CRUDVerb)value, diagnostics, context);
			case RESTServicePIMPackage.RDBMS_VERB:
				return validateRDBMSVerb((RDBMSVerb)value, diagnostics, context);
			case RESTServicePIMPackage.LINK_TYPE:
				return validateLinkType((LinkType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgoResourceModel(AlgoResourceModel algoResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(algoResourceModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(algoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(algoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(algoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(algoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(algoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(algoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(algoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(algoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlgoResourceModel_existantSettersForAllProperties(algoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlgoResourceModel_existantGettersForAllProperties(algoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlgoResourceModel_uniqueLinklistProperty(algoResourceModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the existantSettersForAllProperties constraint of '<em>Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALGO_RESOURCE_MODEL__EXISTANT_SETTERS_FOR_ALL_PROPERTIES__EEXPRESSION = "self.algoModelHasProperty->forAll(rAlgoModelProperty | self.algoModelHasSetter->one(setsProperty.name = rAlgoModelProperty.name))";

	/**
	 * Validates the existantSettersForAllProperties constraint of '<em>Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgoResourceModel_existantSettersForAllProperties(AlgoResourceModel algoResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.ALGO_RESOURCE_MODEL,
				 algoResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "existantSettersForAllProperties",
				 ALGO_RESOURCE_MODEL__EXISTANT_SETTERS_FOR_ALL_PROPERTIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the existantGettersForAllProperties constraint of '<em>Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALGO_RESOURCE_MODEL__EXISTANT_GETTERS_FOR_ALL_PROPERTIES__EEXPRESSION = "self.algoModelHasProperty->forAll(rAlgoModelProperty | self.algoModelHasGetter->one(getsProperty.name = rAlgoModelProperty.name))";

	/**
	 * Validates the existantGettersForAllProperties constraint of '<em>Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgoResourceModel_existantGettersForAllProperties(AlgoResourceModel algoResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.ALGO_RESOURCE_MODEL,
				 algoResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "existantGettersForAllProperties",
				 ALGO_RESOURCE_MODEL__EXISTANT_GETTERS_FOR_ALL_PROPERTIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueLinklistProperty constraint of '<em>Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALGO_RESOURCE_MODEL__UNIQUE_LINKLIST_PROPERTY__EEXPRESSION = "self.algoModelHasProperty->one(name = 'linklist')";

	/**
	 * Validates the uniqueLinklistProperty constraint of '<em>Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgoResourceModel_uniqueLinklistProperty(AlgoResourceModel algoResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.ALGO_RESOURCE_MODEL,
				 algoResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueLinklistProperty",
				 ALGO_RESOURCE_MODEL__UNIQUE_LINKLIST_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgoResourceController(AlgoResourceController algoResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(algoResourceController, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(algoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(algoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(algoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(algoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(algoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(algoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(algoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(algoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlgoResourceController_algoControllerNotAllowedCRUDVerbs(algoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlgoResourceController_algoControllerHasUniqueCRUDActivity(algoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlgoResourceController_algoControllerActivityAddsHypermediaLinkToSelf(algoResourceController, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the algoControllerNotAllowedCRUDVerbs constraint of '<em>Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_NOT_ALLOWED_CRUD_VERBS__EEXPRESSION = "self.algoControllerHasCRUDActivity->select(CRUDActivity| CRUDActivity.crudVerb =2 or CRUDActivity.crudVerb = 3)->isEmpty()";

	/**
	 * Validates the algoControllerNotAllowedCRUDVerbs constraint of '<em>Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgoResourceController_algoControllerNotAllowedCRUDVerbs(AlgoResourceController algoResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.ALGO_RESOURCE_CONTROLLER,
				 algoResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerNotAllowedCRUDVerbs",
				 ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_NOT_ALLOWED_CRUD_VERBS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algoControllerHasUniqueCRUDActivity constraint of '<em>Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_UNIQUE_CRUD_ACTIVITY__EEXPRESSION = "self.algoControllerHasCRUDActivity->size() = 1";

	/**
	 * Validates the algoControllerHasUniqueCRUDActivity constraint of '<em>Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgoResourceController_algoControllerHasUniqueCRUDActivity(AlgoResourceController algoResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.ALGO_RESOURCE_CONTROLLER,
				 algoResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerHasUniqueCRUDActivity",
				 ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_UNIQUE_CRUD_ACTIVITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algoControllerActivityAddsHypermediaLinkToSelf constraint of '<em>Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_ACTIVITY_ADDS_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Sibling' and hasTargetAlgoController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Sibling' and hasTargetAlgoController = self)\n" +
		"\t\t\t\timplies\t\t\n" +
		"\t\t\t\tself.algoControllerHasCRUDActivity->exists(crudVerb = 0)\t\t\n" +
		"\t\t\t)\n" +
		"\t\t)\n" +
		"\t\tor\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Sibling' and hasTargetAlgoController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Sibling' and hasTargetAlgoController = self)\n" +
		"\t\t\t\timplies\t\t\n" +
		"\t\t\t\tself.algoControllerHasCRUDActivity->exists(crudVerb = 1)\t\t\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the algoControllerActivityAddsHypermediaLinkToSelf constraint of '<em>Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgoResourceController_algoControllerActivityAddsHypermediaLinkToSelf(AlgoResourceController algoResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.ALGO_RESOURCE_CONTROLLER,
				 algoResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerActivityAddsHypermediaLinkToSelf",
				 ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_ACTIVITY_ADDS_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceModelManager(ResourceModelManager resourceModelManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceModelManager, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceModelManager_existantSettersForAllProperties(resourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceModelManager_existantGettersForAllProperties(resourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceModelManager_uniqueLinklistProperty(resourceModelManager, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the existantSettersForAllProperties constraint of '<em>Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_MODEL_MANAGER__EXISTANT_SETTERS_FOR_ALL_PROPERTIES__EEXPRESSION = "self.hasRMManagerProperty->forAll(rMManagerProperty | self.rMManagerHasSetter->one(setsProperty.name = rMManagerProperty.name))";

	/**
	 * Validates the existantSettersForAllProperties constraint of '<em>Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceModelManager_existantSettersForAllProperties(ResourceModelManager resourceModelManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_MODEL_MANAGER,
				 resourceModelManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "existantSettersForAllProperties",
				 RESOURCE_MODEL_MANAGER__EXISTANT_SETTERS_FOR_ALL_PROPERTIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the existantGettersForAllProperties constraint of '<em>Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_MODEL_MANAGER__EXISTANT_GETTERS_FOR_ALL_PROPERTIES__EEXPRESSION = "self.hasRMManagerProperty->forAll(rMManagerProperty | self.rMManagerHasGetter->one(getsProperty.name = rMManagerProperty.name))";

	/**
	 * Validates the existantGettersForAllProperties constraint of '<em>Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceModelManager_existantGettersForAllProperties(ResourceModelManager resourceModelManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_MODEL_MANAGER,
				 resourceModelManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "existantGettersForAllProperties",
				 RESOURCE_MODEL_MANAGER__EXISTANT_GETTERS_FOR_ALL_PROPERTIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueLinklistProperty constraint of '<em>Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_MODEL_MANAGER__UNIQUE_LINKLIST_PROPERTY__EEXPRESSION = "self.hasRMManagerProperty->one(name = 'linklist')";

	/**
	 * Validates the uniqueLinklistProperty constraint of '<em>Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceModelManager_uniqueLinklistProperty(ResourceModelManager resourceModelManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_MODEL_MANAGER,
				 resourceModelManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueLinklistProperty",
				 RESOURCE_MODEL_MANAGER__UNIQUE_LINKLIST_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceModel(ResourceModel resourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceModel_uniqueNamingProperty(resourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceModel_uniquePrimaryIdentifier(resourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceModel_existantSettersForAllProperties(resourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceModel_existantGettersForAllProperties(resourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceModel_uniqueLinklistProperty(resourceModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueNamingProperty constraint of '<em>Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_MODEL__UNIQUE_NAMING_PROPERTY__EEXPRESSION = "self.rModelHasProperty->one(isNamingProperty = true)";

	/**
	 * Validates the uniqueNamingProperty constraint of '<em>Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceModel_uniqueNamingProperty(ResourceModel resourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_MODEL,
				 resourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueNamingProperty",
				 RESOURCE_MODEL__UNIQUE_NAMING_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniquePrimaryIdentifier constraint of '<em>Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_MODEL__UNIQUE_PRIMARY_IDENTIFIER__EEXPRESSION = "self.rModelHasProperty->one(isPrimaryIdentifier = true)";

	/**
	 * Validates the uniquePrimaryIdentifier constraint of '<em>Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceModel_uniquePrimaryIdentifier(ResourceModel resourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_MODEL,
				 resourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniquePrimaryIdentifier",
				 RESOURCE_MODEL__UNIQUE_PRIMARY_IDENTIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the existantSettersForAllProperties constraint of '<em>Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_MODEL__EXISTANT_SETTERS_FOR_ALL_PROPERTIES__EEXPRESSION = "self.rModelHasProperty->forAll(rModelProperty | self.rModelHasSetter->one(setsProperty.name = rModelProperty.name))";

	/**
	 * Validates the existantSettersForAllProperties constraint of '<em>Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceModel_existantSettersForAllProperties(ResourceModel resourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_MODEL,
				 resourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "existantSettersForAllProperties",
				 RESOURCE_MODEL__EXISTANT_SETTERS_FOR_ALL_PROPERTIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the existantGettersForAllProperties constraint of '<em>Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_MODEL__EXISTANT_GETTERS_FOR_ALL_PROPERTIES__EEXPRESSION = "self.rModelHasProperty->forAll(rModelProperty | self.rModelHasGetter->one(getsProperty.name = rModelProperty.name))";

	/**
	 * Validates the existantGettersForAllProperties constraint of '<em>Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceModel_existantGettersForAllProperties(ResourceModel resourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_MODEL,
				 resourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "existantGettersForAllProperties",
				 RESOURCE_MODEL__EXISTANT_GETTERS_FOR_ALL_PROPERTIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueLinklistProperty constraint of '<em>Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_MODEL__UNIQUE_LINKLIST_PROPERTY__EEXPRESSION = "self.rModelHasProperty->one(name = 'linklist')";

	/**
	 * Validates the uniqueLinklistProperty constraint of '<em>Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceModel_uniqueLinklistProperty(ResourceModel resourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_MODEL,
				 resourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueLinklistProperty",
				 RESOURCE_MODEL__UNIQUE_LINKLIST_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceControllerManager(ResourceControllerManager resourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceControllerManager, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceControllerManager_rCManagerHasUniqueCREATEActivity(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceControllerManager_rCManagerHasUniqueREADActivity(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceControllerManager_rCManagerNotAllowedCRUDActivityVerbs(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceControllerManager_rCManagerCreateActivityAddsCreateHypermediaLinkToSelf(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceControllerManager_rCManagerReadActivityAddsCreateHypermediaLinkToSelf(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceControllerManager_rCManagerCreateActivityAddsReadHypermediaLinkToSelf(resourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceControllerManager_rCManagerReadActivityAddsReadHypermediaLinkToSelf(resourceControllerManager, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the rCManagerHasUniqueCREATEActivity constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_HAS_UNIQUE_CREATE_ACTIVITY__EEXPRESSION = "self.rCManagerHasCRUDActivity->one(crudVerb = 0)";

	/**
	 * Validates the rCManagerHasUniqueCREATEActivity constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceControllerManager_rCManagerHasUniqueCREATEActivity(ResourceControllerManager resourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER_MANAGER,
				 resourceControllerManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerHasUniqueCREATEActivity",
				 RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_HAS_UNIQUE_CREATE_ACTIVITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerHasUniqueREADActivity constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_HAS_UNIQUE_READ_ACTIVITY__EEXPRESSION = "self.rCManagerHasCRUDActivity->one(crudVerb = 1)";

	/**
	 * Validates the rCManagerHasUniqueREADActivity constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceControllerManager_rCManagerHasUniqueREADActivity(ResourceControllerManager resourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER_MANAGER,
				 resourceControllerManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerHasUniqueREADActivity",
				 RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_HAS_UNIQUE_READ_ACTIVITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerNotAllowedCRUDActivityVerbs constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_NOT_ALLOWED_CRUD_ACTIVITY_VERBS__EEXPRESSION = "self.rCManagerHasCRUDActivity->select(crudVerb = 2 or crudVerb = 3)->isEmpty()";

	/**
	 * Validates the rCManagerNotAllowedCRUDActivityVerbs constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceControllerManager_rCManagerNotAllowedCRUDActivityVerbs(ResourceControllerManager resourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER_MANAGER,
				 resourceControllerManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerNotAllowedCRUDActivityVerbs",
				 RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_NOT_ALLOWED_CRUD_ACTIVITY_VERBS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerCreateActivityAddsCreateHypermediaLinkToSelf constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_CREATE_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "self.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and hasTargetRCManager = self and linkType = 'Sibling')";

	/**
	 * Validates the rCManagerCreateActivityAddsCreateHypermediaLinkToSelf constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceControllerManager_rCManagerCreateActivityAddsCreateHypermediaLinkToSelf(ResourceControllerManager resourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER_MANAGER,
				 resourceControllerManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerCreateActivityAddsCreateHypermediaLinkToSelf",
				 RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_CREATE_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerReadActivityAddsCreateHypermediaLinkToSelf constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_READ_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "self.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and hasTargetRCManager = self and linkType = 'Sibling')";

	/**
	 * Validates the rCManagerReadActivityAddsCreateHypermediaLinkToSelf constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceControllerManager_rCManagerReadActivityAddsCreateHypermediaLinkToSelf(ResourceControllerManager resourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER_MANAGER,
				 resourceControllerManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerReadActivityAddsCreateHypermediaLinkToSelf",
				 RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_READ_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerCreateActivityAddsReadHypermediaLinkToSelf constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_CREATE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "self.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and hasTargetRCManager = self and linkType = 'Sibling')";

	/**
	 * Validates the rCManagerCreateActivityAddsReadHypermediaLinkToSelf constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceControllerManager_rCManagerCreateActivityAddsReadHypermediaLinkToSelf(ResourceControllerManager resourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER_MANAGER,
				 resourceControllerManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerCreateActivityAddsReadHypermediaLinkToSelf",
				 RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_CREATE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerReadActivityAddsReadHypermediaLinkToSelf constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_READ_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "self.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and hasTargetRCManager = self and linkType = 'Sibling')";

	/**
	 * Validates the rCManagerReadActivityAddsReadHypermediaLinkToSelf constraint of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceControllerManager_rCManagerReadActivityAddsReadHypermediaLinkToSelf(ResourceControllerManager resourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER_MANAGER,
				 resourceControllerManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerReadActivityAddsReadHypermediaLinkToSelf",
				 RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_READ_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceController(ResourceController resourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceController, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceController_rControllerHasUniqueCRUDActivities(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceController_rControllerNotAllowedCRUDActivitiyVerbs(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceController_rControllerReadActivityAddsReadHypermediaLinkToSelf(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceController_rControllerUpdateActivityAddsUpdateHypermediaLinkToSelf(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceController_rControllerReadActivityAddsUpdateHypermediaLinkToSelf(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceController_rControllerReadActivityAddsDeleteHypermediaLinkToSelf(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceController_rControllerUpdateActivityAddsReadHypermediaLinkToSelf(resourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceController_rControllerUpdateActivityAddsDeleteHypermediaLinkToSelf(resourceController, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the rControllerHasUniqueCRUDActivities constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER__RCONTROLLER_HAS_UNIQUE_CRUD_ACTIVITIES__EEXPRESSION = "self.rControllerHasCRUDActivity->isUnique(crudVerb)";

	/**
	 * Validates the rControllerHasUniqueCRUDActivities constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceController_rControllerHasUniqueCRUDActivities(ResourceController resourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER,
				 resourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerHasUniqueCRUDActivities",
				 RESOURCE_CONTROLLER__RCONTROLLER_HAS_UNIQUE_CRUD_ACTIVITIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerNotAllowedCRUDActivitiyVerbs constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER__RCONTROLLER_NOT_ALLOWED_CRUD_ACTIVITIY_VERBS__EEXPRESSION = "self.rControllerHasCRUDActivity->select(crudVerb = 0)->isEmpty()";

	/**
	 * Validates the rControllerNotAllowedCRUDActivitiyVerbs constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceController_rControllerNotAllowedCRUDActivitiyVerbs(ResourceController resourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER,
				 resourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerNotAllowedCRUDActivitiyVerbs",
				 RESOURCE_CONTROLLER__RCONTROLLER_NOT_ALLOWED_CRUD_ACTIVITIY_VERBS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerReadActivityAddsReadHypermediaLinkToSelf constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER__RCONTROLLER_READ_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity.hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Sibling' and hasTargetRController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity.hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Sibling' and hasTargetRController = self)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the rControllerReadActivityAddsReadHypermediaLinkToSelf constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceController_rControllerReadActivityAddsReadHypermediaLinkToSelf(ResourceController resourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER,
				 resourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerReadActivityAddsReadHypermediaLinkToSelf",
				 RESOURCE_CONTROLLER__RCONTROLLER_READ_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerUpdateActivityAddsUpdateHypermediaLinkToSelf constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER__RCONTROLLER_UPDATE_ACTIVITY_ADDS_UPDATE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity.hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Sibling' and hasTargetRController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity.hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Sibling' and hasTargetRController = self)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the rControllerUpdateActivityAddsUpdateHypermediaLinkToSelf constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceController_rControllerUpdateActivityAddsUpdateHypermediaLinkToSelf(ResourceController resourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER,
				 resourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerUpdateActivityAddsUpdateHypermediaLinkToSelf",
				 RESOURCE_CONTROLLER__RCONTROLLER_UPDATE_ACTIVITY_ADDS_UPDATE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerReadActivityAddsUpdateHypermediaLinkToSelf constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER__RCONTROLLER_READ_ACTIVITY_ADDS_UPDATE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 2) and self.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Sibling' and hasTargetRController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Sibling' and hasTargetRController = self)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 2) and self.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the rControllerReadActivityAddsUpdateHypermediaLinkToSelf constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceController_rControllerReadActivityAddsUpdateHypermediaLinkToSelf(ResourceController resourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER,
				 resourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerReadActivityAddsUpdateHypermediaLinkToSelf",
				 RESOURCE_CONTROLLER__RCONTROLLER_READ_ACTIVITY_ADDS_UPDATE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerReadActivityAddsDeleteHypermediaLinkToSelf constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER__RCONTROLLER_READ_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 3) and self.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Sibling' and hasTargetRController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Sibling' and hasTargetRController = self)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 3) and self.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the rControllerReadActivityAddsDeleteHypermediaLinkToSelf constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceController_rControllerReadActivityAddsDeleteHypermediaLinkToSelf(ResourceController resourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER,
				 resourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerReadActivityAddsDeleteHypermediaLinkToSelf",
				 RESOURCE_CONTROLLER__RCONTROLLER_READ_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerUpdateActivityAddsReadHypermediaLinkToSelf constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER__RCONTROLLER_UPDATE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 1) and self.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Sibling' and hasTargetRController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Sibling' and hasTargetRController = self)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 1) and self.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the rControllerUpdateActivityAddsReadHypermediaLinkToSelf constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceController_rControllerUpdateActivityAddsReadHypermediaLinkToSelf(ResourceController resourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER,
				 resourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerUpdateActivityAddsReadHypermediaLinkToSelf",
				 RESOURCE_CONTROLLER__RCONTROLLER_UPDATE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerUpdateActivityAddsDeleteHypermediaLinkToSelf constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CONTROLLER__RCONTROLLER_UPDATE_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 3) and self.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Sibling' and hasTargetRController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Sibling' and hasTargetRController = self)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 3) and self.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the rControllerUpdateActivityAddsDeleteHypermediaLinkToSelf constraint of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceController_rControllerUpdateActivityAddsDeleteHypermediaLinkToSelf(ResourceController resourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER,
				 resourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerUpdateActivityAddsDeleteHypermediaLinkToSelf",
				 RESOURCE_CONTROLLER__RCONTROLLER_UPDATE_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePIMComponentProperty(PIMComponentProperty pimComponentProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pimComponentProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pimComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pimComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pimComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pimComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pimComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pimComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pimComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pimComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validatePIMComponentProperty_primaryIdentifierMapsToPrimaryKey(pimComponentProperty, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the primaryIdentifierMapsToPrimaryKey constraint of '<em>PIM Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PIM_COMPONENT_PROPERTY__PRIMARY_IDENTIFIER_MAPS_TO_PRIMARY_KEY__EEXPRESSION = "(self.isPrimaryIdentifier = true) implies (self.isMappedToRDBMSColumn.isPrimaryKey = true)";

	/**
	 * Validates the primaryIdentifierMapsToPrimaryKey constraint of '<em>PIM Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePIMComponentProperty_primaryIdentifierMapsToPrimaryKey(PIMComponentProperty pimComponentProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.PIM_COMPONENT_PROPERTY,
				 pimComponentProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "primaryIdentifierMapsToPrimaryKey",
				 PIM_COMPONENT_PROPERTY__PRIMARY_IDENTIFIER_MAPS_TO_PRIMARY_KEY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentationParseFunction(RepresentationParseFunction representationParseFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(representationParseFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentationMarshallingFunction(RepresentationMarshallingFunction representationMarshallingFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(representationMarshallingFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceInputRepresentation(ResourceInputRepresentation resourceInputRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceInputRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceOutputRepresentation(ResourceOutputRepresentation resourceOutputRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceOutputRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceControllerCRUDActivity(ResourceControllerCRUDActivity resourceControllerCRUDActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceControllerCRUDActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetterFunction(SetterFunction setterFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setterFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetterFunction(GetterFunction getterFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getterFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionParameter(FunctionParameter functionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCRUDActivityHandler(CRUDActivityHandler crudActivityHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crudActivityHandler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateHypermediaPIMFunction(CreateHypermediaPIMFunction createHypermediaPIMFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createHypermediaPIMFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseController(DatabaseController databaseController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databaseController, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDBMSActivity(RDBMSActivity rdbmsActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rdbmsActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDBMSTable(RDBMSTable rdbmsTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rdbmsTable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rdbmsTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rdbmsTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rdbmsTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rdbmsTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rdbmsTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rdbmsTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rdbmsTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rdbmsTable, diagnostics, context);
		if (result || diagnostics != null) result &= validateRDBMSTable_uniquePrimaryKey(rdbmsTable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniquePrimaryKey constraint of '<em>RDBMS Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RDBMS_TABLE__UNIQUE_PRIMARY_KEY__EEXPRESSION = "self.hasRDBMSColumns->one(isPrimaryKey = true)";

	/**
	 * Validates the uniquePrimaryKey constraint of '<em>RDBMS Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDBMSTable_uniquePrimaryKey(RDBMSTable rdbmsTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RDBMS_TABLE,
				 rdbmsTable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniquePrimaryKey",
				 RDBMS_TABLE__UNIQUE_PRIMARY_KEY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDBMSTableColumn(RDBMSTableColumn rdbmsTableColumn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rdbmsTableColumn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHypermediaLink(HypermediaLink hypermediaLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hypermediaLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePIMComponentFunction(PIMComponentFunction pimComponentFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pimComponentFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resTfulServicePIM, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_controllersHaveUniqueURIs(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_uniqueResourceModels(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_uniqueResourceModelManagers(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_uniqueResourceAlgoModels(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_uniqueResourceControllers(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_uniqueResourceControllerManagers(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_uniqueResourceAlgoControllers(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_uniquePIMComponentNames(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_uniqueRModelRDBMSTableMapping(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_validDatabaseReferentialIntegrity(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_correctlyMatchingRControllerCRUDActivitiesWithRDBMSActivities(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_correctlyMatchingRCManagerCRUDActivitiesWithRDBMSActivities(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rCManagerCreateActivityAddsReadHypermediaLinkToRRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rCManagerCreateActivityAddsUpdateHypermediaLinkToRRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rCManagerCreateActivityAddsDeleteHypermediaLinkToRRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rCManagerReadActivityAddsReadHypermediaLinkToRRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rCManagerReadActivityAddsUpdateHypermediaLinkToRRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rCManagerReadActivityAddsDeleteHypermediaLinkToRRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rCManagerCreateActivityAddsReadHypermediaLinkToParentRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rCManagerCreateActivityAddsUpdateHypermediaLinkToParentRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rCManagerCreateActivityAddsDeleteHypermediaLinkToParentRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rCManagerReadActivityAddsReadHypermediaLinkToParentRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rCManagerReadActivityAddsUpdateHypermediaLinkToParentRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rCManagerReadActivityAddsDeleteHypermediaLinkToParentRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rControllerReadActivityAddsCreateHypermediaLinkToRCManager(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rControllerReadActivityAddsReadHypermediaLinkToRCManager(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rControllerUpdateActivityAddsCreateHypermediaLinkToRCManager(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rControllerUpdateActivityAddsReadHypermediaLinkToRCManager(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rControllerReadActivityAddsCreateHypermediaLinkToParentRCManager(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rControllerReadActivityAddsReadHypermediaLinkToParentRCManager(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rControllerUpdateActivityAddsCreateHypermediaLinkToParentRCManager(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rControllerUpdateActivityAddsReadHypermediaLinkToParentRCManager(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rControllerDeleteActivityAddsCreateHypermediaLinkToParentRCManager(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rControllerDeleteActivityAddsReadHypermediaLinkToParentRCManager(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_algoControllerActivityAddsHypermediaLinkToRAlgoController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_algoControllerAddsHypermediaLinkToParentAlgoController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rControllerReadAddsHypermediaLinkToRAlgoController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_rControllerUpdateAddsHypermediaLinkToRAlgoController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_algoControllerAddsReadHypermediaLinkToParentRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_algoControllerAddsUpdateHypermediaLinkToParentRController(resTfulServicePIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServicePIM_algoControllerAddsDeleteHypermediaLinkToParentRController(resTfulServicePIM, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the controllersHaveUniqueURIs constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__CONTROLLERS_HAVE_UNIQUE_UR_IS__EEXPRESSION = "self->isUnique(Bag{self.hasResourceController.controllerURI, self.hasResourceControllerManager.controllerURI, self.hasAlgoResourceController.controllerURI})";

	/**
	 * Validates the controllersHaveUniqueURIs constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_controllersHaveUniqueURIs(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "controllersHaveUniqueURIs",
				 RES_TFUL_SERVICE_PIM__CONTROLLERS_HAVE_UNIQUE_UR_IS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueResourceModels constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__UNIQUE_RESOURCE_MODELS__EEXPRESSION = "self.hasResourceModel->isUnique(name)";

	/**
	 * Validates the uniqueResourceModels constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_uniqueResourceModels(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueResourceModels",
				 RES_TFUL_SERVICE_PIM__UNIQUE_RESOURCE_MODELS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueResourceModelManagers constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__UNIQUE_RESOURCE_MODEL_MANAGERS__EEXPRESSION = "self.hasResourceModelManager->isUnique(name)";

	/**
	 * Validates the uniqueResourceModelManagers constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_uniqueResourceModelManagers(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueResourceModelManagers",
				 RES_TFUL_SERVICE_PIM__UNIQUE_RESOURCE_MODEL_MANAGERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueResourceAlgoModels constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__UNIQUE_RESOURCE_ALGO_MODELS__EEXPRESSION = "self.hasAlgoResourceModel->isUnique(name)";

	/**
	 * Validates the uniqueResourceAlgoModels constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_uniqueResourceAlgoModels(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueResourceAlgoModels",
				 RES_TFUL_SERVICE_PIM__UNIQUE_RESOURCE_ALGO_MODELS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueResourceControllers constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__UNIQUE_RESOURCE_CONTROLLERS__EEXPRESSION = "self.hasResourceController->isUnique(name)";

	/**
	 * Validates the uniqueResourceControllers constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_uniqueResourceControllers(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueResourceControllers",
				 RES_TFUL_SERVICE_PIM__UNIQUE_RESOURCE_CONTROLLERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueResourceControllerManagers constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__UNIQUE_RESOURCE_CONTROLLER_MANAGERS__EEXPRESSION = "self.hasResourceControllerManager->isUnique(name)";

	/**
	 * Validates the uniqueResourceControllerManagers constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_uniqueResourceControllerManagers(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueResourceControllerManagers",
				 RES_TFUL_SERVICE_PIM__UNIQUE_RESOURCE_CONTROLLER_MANAGERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueResourceAlgoControllers constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__UNIQUE_RESOURCE_ALGO_CONTROLLERS__EEXPRESSION = "self.hasAlgoResourceController->isUnique(name)";

	/**
	 * Validates the uniqueResourceAlgoControllers constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_uniqueResourceAlgoControllers(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueResourceAlgoControllers",
				 RES_TFUL_SERVICE_PIM__UNIQUE_RESOURCE_ALGO_CONTROLLERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniquePIMComponentNames constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__UNIQUE_PIM_COMPONENT_NAMES__EEXPRESSION = "self->isUnique(Bag{self.hasResourceModel.name, self.hasResourceController.name, self.hasResourceModelManager.name, self.hasResourceControllerManager, self.hasAlgoResourceModel.name, self.hasAlgoResourceController.name})";

	/**
	 * Validates the uniquePIMComponentNames constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_uniquePIMComponentNames(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniquePIMComponentNames",
				 RES_TFUL_SERVICE_PIM__UNIQUE_PIM_COMPONENT_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueRModelRDBMSTableMapping constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__UNIQUE_RMODEL_RDBMS_TABLE_MAPPING__EEXPRESSION = "self.hasResourceModel->forAll(rModel1, rModel2 | rModel1.name <> rModel2.name implies rModel1.isMappedToRDBMSTable.name <> rModel2.isMappedToRDBMSTable.name)";

	/**
	 * Validates the uniqueRModelRDBMSTableMapping constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_uniqueRModelRDBMSTableMapping(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueRModelRDBMSTableMapping",
				 RES_TFUL_SERVICE_PIM__UNIQUE_RMODEL_RDBMS_TABLE_MAPPING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validDatabaseReferentialIntegrity constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__VALID_DATABASE_REFERENTIAL_INTEGRITY__EEXPRESSION = "self.hasResourceModel->forAll(rModel1, rModel2 | (rModel1.hasRelatedModelManager.hasRelatedModel = rModel2) implies (self.hasRDBMSTable->forAll(rdbmsTableA, rdbmsTableB | (rModel1.isMappedToRDBMSTable = rdbmsTableA and rModel2.isMappedToRDBMSTable = rdbmsTableB) implies (rModel1.rModelHasProperty->forAll(rModelPropertyA | (rModelPropertyA.isPrimaryIdentifier = true) implies (rdbmsTableB.hasRDBMSColumns->one(isForeignKey = true and name = rModelPropertyA.name and referencesRDBMSTable = rdbmsTableA)))))))";

	/**
	 * Validates the validDatabaseReferentialIntegrity constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_validDatabaseReferentialIntegrity(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validDatabaseReferentialIntegrity",
				 RES_TFUL_SERVICE_PIM__VALID_DATABASE_REFERENTIAL_INTEGRITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the correctlyMatchingRControllerCRUDActivitiesWithRDBMSActivities constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__CORRECTLY_MATCHING_RCONTROLLER_CRUD_ACTIVITIES_WITH_RDBMS_ACTIVITIES__EEXPRESSION = "self.hasResourceController.rControllerHasCRUDActivity->forAll(rControllerCRUDActivityA | self.hasDatabaseController.hasRDBMSActivity->forAll(rdbmsActivityA | (rControllerCRUDActivityA.isMappedToRDBMSActivity = rdbmsActivityA) implies (self.hasResourceController->one(rControllerHasCRUDActivity = rControllerCRUDActivityA and hasAssociatedRModel.isMappedToRDBMSTable = rControllerCRUDActivityA.isMappedToRDBMSActivity.altersRDBMSTable))))";

	/**
	 * Validates the correctlyMatchingRControllerCRUDActivitiesWithRDBMSActivities constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_correctlyMatchingRControllerCRUDActivitiesWithRDBMSActivities(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correctlyMatchingRControllerCRUDActivitiesWithRDBMSActivities",
				 RES_TFUL_SERVICE_PIM__CORRECTLY_MATCHING_RCONTROLLER_CRUD_ACTIVITIES_WITH_RDBMS_ACTIVITIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the correctlyMatchingRCManagerCRUDActivitiesWithRDBMSActivities constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__CORRECTLY_MATCHING_RC_MANAGER_CRUD_ACTIVITIES_WITH_RDBMS_ACTIVITIES__EEXPRESSION = "self.hasResourceControllerManager.rCManagerHasCRUDActivity->forAll(rCManagerCRUDActivityA | self.hasDatabaseController.hasRDBMSActivity->forAll(rdbmsActivityA | (rCManagerCRUDActivityA.isMappedToRDBMSActivity = rdbmsActivityA) implies (self.hasResourceControllerManager->one(rCManagerHasCRUDActivity = rCManagerCRUDActivityA and hasAssociatedRMManager.hasRelatedModel.isMappedToRDBMSTable = rCManagerCRUDActivityA.isMappedToRDBMSActivity.altersRDBMSTable))))";

	/**
	 * Validates the correctlyMatchingRCManagerCRUDActivitiesWithRDBMSActivities constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_correctlyMatchingRCManagerCRUDActivitiesWithRDBMSActivities(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correctlyMatchingRCManagerCRUDActivitiesWithRDBMSActivities",
				 RES_TFUL_SERVICE_PIM__CORRECTLY_MATCHING_RC_MANAGER_CRUD_ACTIVITIES_WITH_RDBMS_ACTIVITIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerCreateActivityAddsReadHypermediaLinkToRRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RC_MANAGER_CREATE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceControllerManager->forAll(rCManagerA | \n" +
		"\t\tself.hasResourceController->forAll( rControllerA | \n" +
		"\t\t\t(\n" +
		"\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\timplies \n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and  hasTargetRController = rControllerA)\n" +
		"\t\t\t)\n" +
		"\t\t    and \n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and  hasTargetRController = rControllerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerCreateActivityAddsReadHypermediaLinkToRRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rCManagerCreateActivityAddsReadHypermediaLinkToRRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerCreateActivityAddsReadHypermediaLinkToRRController",
				 RES_TFUL_SERVICE_PIM__RC_MANAGER_CREATE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerCreateActivityAddsUpdateHypermediaLinkToRRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RC_MANAGER_CREATE_ACTIVITY_ADDS_UPDATE_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceControllerManager->forAll(rCManagerA | \n" +
		"\t\tself.hasResourceController->forAll( rControllerA | \n" +
		"\t\t\t(\n" +
		"\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t\timplies \n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Child' and  hasTargetRController = rControllerA)\n" +
		"\t\t\t)\n" +
		"\t\t    and \n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Child' and  hasTargetRController = rControllerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerCreateActivityAddsUpdateHypermediaLinkToRRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rCManagerCreateActivityAddsUpdateHypermediaLinkToRRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerCreateActivityAddsUpdateHypermediaLinkToRRController",
				 RES_TFUL_SERVICE_PIM__RC_MANAGER_CREATE_ACTIVITY_ADDS_UPDATE_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerCreateActivityAddsDeleteHypermediaLinkToRRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RC_MANAGER_CREATE_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceControllerManager->forAll(rCManagerA | \n" +
		"\t\tself.hasResourceController->forAll( rControllerA | \n" +
		"\t\t\t(\n" +
		"\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n" +
		"\t\t\t\timplies \n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Child' and  hasTargetRController = rControllerA)\n" +
		"\t\t\t)\n" +
		"\t\t    and \n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Child' and  hasTargetRController = rControllerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerCreateActivityAddsDeleteHypermediaLinkToRRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rCManagerCreateActivityAddsDeleteHypermediaLinkToRRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerCreateActivityAddsDeleteHypermediaLinkToRRController",
				 RES_TFUL_SERVICE_PIM__RC_MANAGER_CREATE_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerReadActivityAddsReadHypermediaLinkToRRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RC_MANAGER_READ_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceControllerManager->forAll(rCManagerA | \n" +
		"\t\tself.hasResourceController->forAll( rControllerA | \n" +
		"\t\t\t(\n" +
		"\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\timplies  \n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and  hasTargetRController = rControllerA)\n" +
		"\t\t\t)\n" +
		"\t\t    and \n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and  hasTargetRController = rControllerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerReadActivityAddsReadHypermediaLinkToRRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rCManagerReadActivityAddsReadHypermediaLinkToRRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerReadActivityAddsReadHypermediaLinkToRRController",
				 RES_TFUL_SERVICE_PIM__RC_MANAGER_READ_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerReadActivityAddsUpdateHypermediaLinkToRRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RC_MANAGER_READ_ACTIVITY_ADDS_UPDATE_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceControllerManager->forAll(rCManagerA | \n" +
		"\t\tself.hasResourceController->forAll( rControllerA | \n" +
		"\t\t\t(\n" +
		"\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t\timplies \n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Child' and  hasTargetRController = rControllerA)\n" +
		"\t\t\t)\n" +
		"\t\t    and \n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Child' and  hasTargetRController = rControllerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerReadActivityAddsUpdateHypermediaLinkToRRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rCManagerReadActivityAddsUpdateHypermediaLinkToRRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerReadActivityAddsUpdateHypermediaLinkToRRController",
				 RES_TFUL_SERVICE_PIM__RC_MANAGER_READ_ACTIVITY_ADDS_UPDATE_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerReadActivityAddsDeleteHypermediaLinkToRRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RC_MANAGER_READ_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceControllerManager->forAll(rCManagerA | \n" +
		"\t\tself.hasResourceController->forAll( rControllerA | \n" +
		"\t\t\t(\n" +
		"\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n" +
		"\t\t\t\timplies \n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Child' and  hasTargetRController = rControllerA)\n" +
		"\t\t\t)\n" +
		"\t\t    and \n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Child' and  hasTargetRController = rControllerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerReadActivityAddsDeleteHypermediaLinkToRRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rCManagerReadActivityAddsDeleteHypermediaLinkToRRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerReadActivityAddsDeleteHypermediaLinkToRRController",
				 RES_TFUL_SERVICE_PIM__RC_MANAGER_READ_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerCreateActivityAddsReadHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RC_MANAGER_CREATE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceControllerManager->forAll(rCManagerA |\n" +
		"\t\tself.hasResourceController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerCreateActivityAddsReadHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rCManagerCreateActivityAddsReadHypermediaLinkToParentRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerCreateActivityAddsReadHypermediaLinkToParentRController",
				 RES_TFUL_SERVICE_PIM__RC_MANAGER_CREATE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerCreateActivityAddsUpdateHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RC_MANAGER_CREATE_ACTIVITY_ADDS_UPDATE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceControllerManager->forAll(rCManagerA |\n" +
		"\t\tself.hasResourceController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerCreateActivityAddsUpdateHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rCManagerCreateActivityAddsUpdateHypermediaLinkToParentRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerCreateActivityAddsUpdateHypermediaLinkToParentRController",
				 RES_TFUL_SERVICE_PIM__RC_MANAGER_CREATE_ACTIVITY_ADDS_UPDATE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerCreateActivityAddsDeleteHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RC_MANAGER_CREATE_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceControllerManager->forAll(rCManagerA |\n" +
		"\t\tself.hasResourceController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerCreateActivityAddsDeleteHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rCManagerCreateActivityAddsDeleteHypermediaLinkToParentRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerCreateActivityAddsDeleteHypermediaLinkToParentRController",
				 RES_TFUL_SERVICE_PIM__RC_MANAGER_CREATE_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerReadActivityAddsReadHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RC_MANAGER_READ_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceControllerManager->forAll(rCManagerA |\n" +
		"\t\tself.hasResourceController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerReadActivityAddsReadHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rCManagerReadActivityAddsReadHypermediaLinkToParentRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerReadActivityAddsReadHypermediaLinkToParentRController",
				 RES_TFUL_SERVICE_PIM__RC_MANAGER_READ_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerReadActivityAddsUpdateHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RC_MANAGER_READ_ACTIVITY_ADDS_UPDATE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceControllerManager->forAll(rCManagerA |\n" +
		"\t\tself.hasResourceController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerReadActivityAddsUpdateHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rCManagerReadActivityAddsUpdateHypermediaLinkToParentRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerReadActivityAddsUpdateHypermediaLinkToParentRController",
				 RES_TFUL_SERVICE_PIM__RC_MANAGER_READ_ACTIVITY_ADDS_UPDATE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerReadActivityAddsDeleteHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RC_MANAGER_READ_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceControllerManager->forAll(rCManagerA |\n" +
		"\t\tself.hasResourceController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerReadActivityAddsDeleteHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rCManagerReadActivityAddsDeleteHypermediaLinkToParentRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerReadActivityAddsDeleteHypermediaLinkToParentRController",
				 RES_TFUL_SERVICE_PIM__RC_MANAGER_READ_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerReadActivityAddsCreateHypermediaLinkToRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RCONTROLLER_READ_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceController->forAll( rControllerA |\n" +
		"\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Child' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Child' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerReadActivityAddsCreateHypermediaLinkToRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rControllerReadActivityAddsCreateHypermediaLinkToRCManager(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerReadActivityAddsCreateHypermediaLinkToRCManager",
				 RES_TFUL_SERVICE_PIM__RCONTROLLER_READ_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerReadActivityAddsReadHypermediaLinkToRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RCONTROLLER_READ_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceController->forAll( rControllerA |\n" +
		"\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerReadActivityAddsReadHypermediaLinkToRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rControllerReadActivityAddsReadHypermediaLinkToRCManager(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerReadActivityAddsReadHypermediaLinkToRCManager",
				 RES_TFUL_SERVICE_PIM__RCONTROLLER_READ_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerUpdateActivityAddsCreateHypermediaLinkToRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RCONTROLLER_UPDATE_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceController->forAll( rControllerA |\n" +
		"\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Child' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Child' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerUpdateActivityAddsCreateHypermediaLinkToRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rControllerUpdateActivityAddsCreateHypermediaLinkToRCManager(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerUpdateActivityAddsCreateHypermediaLinkToRCManager",
				 RES_TFUL_SERVICE_PIM__RCONTROLLER_UPDATE_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerUpdateActivityAddsReadHypermediaLinkToRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RCONTROLLER_UPDATE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceController->forAll( rControllerA |\n" +
		"\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerUpdateActivityAddsReadHypermediaLinkToRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rControllerUpdateActivityAddsReadHypermediaLinkToRCManager(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerUpdateActivityAddsReadHypermediaLinkToRCManager",
				 RES_TFUL_SERVICE_PIM__RCONTROLLER_UPDATE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerReadActivityAddsCreateHypermediaLinkToParentRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RCONTROLLER_READ_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceController->forAll( rControllerA |\n" +
		"\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Parent' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Parent' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\t\t\t\t\t\t\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerReadActivityAddsCreateHypermediaLinkToParentRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rControllerReadActivityAddsCreateHypermediaLinkToParentRCManager(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerReadActivityAddsCreateHypermediaLinkToParentRCManager",
				 RES_TFUL_SERVICE_PIM__RCONTROLLER_READ_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerReadActivityAddsReadHypermediaLinkToParentRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RCONTROLLER_READ_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceController->forAll( rControllerA |\n" +
		"\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\t\t\t\t\t\t\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerReadActivityAddsReadHypermediaLinkToParentRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rControllerReadActivityAddsReadHypermediaLinkToParentRCManager(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerReadActivityAddsReadHypermediaLinkToParentRCManager",
				 RES_TFUL_SERVICE_PIM__RCONTROLLER_READ_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerUpdateActivityAddsCreateHypermediaLinkToParentRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RCONTROLLER_UPDATE_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceController->forAll( rControllerA |\n" +
		"\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Parent' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Parent' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\t\t\t\t\t\t\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerUpdateActivityAddsCreateHypermediaLinkToParentRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rControllerUpdateActivityAddsCreateHypermediaLinkToParentRCManager(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerUpdateActivityAddsCreateHypermediaLinkToParentRCManager",
				 RES_TFUL_SERVICE_PIM__RCONTROLLER_UPDATE_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerUpdateActivityAddsReadHypermediaLinkToParentRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RCONTROLLER_UPDATE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceController->forAll( rControllerA |\n" +
		"\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\t\t\t\t\t\t\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerUpdateActivityAddsReadHypermediaLinkToParentRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rControllerUpdateActivityAddsReadHypermediaLinkToParentRCManager(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerUpdateActivityAddsReadHypermediaLinkToParentRCManager",
				 RES_TFUL_SERVICE_PIM__RCONTROLLER_UPDATE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerDeleteActivityAddsCreateHypermediaLinkToParentRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RCONTROLLER_DELETE_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceController->forAll( rControllerA |\n" +
		"\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 3).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Parent' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 3).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Parent' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\t\t\t\t\t\t\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerDeleteActivityAddsCreateHypermediaLinkToParentRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rControllerDeleteActivityAddsCreateHypermediaLinkToParentRCManager(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerDeleteActivityAddsCreateHypermediaLinkToParentRCManager",
				 RES_TFUL_SERVICE_PIM__RCONTROLLER_DELETE_ACTIVITY_ADDS_CREATE_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerDeleteActivityAddsReadHypermediaLinkToParentRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RCONTROLLER_DELETE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasResourceController->forAll( rControllerA |\n" +
		"\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 3).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 3).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRCManager = rCManagerA)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\t\t\t\t\t\t\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerDeleteActivityAddsReadHypermediaLinkToParentRCManager constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rControllerDeleteActivityAddsReadHypermediaLinkToParentRCManager(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerDeleteActivityAddsReadHypermediaLinkToParentRCManager",
				 RES_TFUL_SERVICE_PIM__RCONTROLLER_DELETE_ACTIVITY_ADDS_READ_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algoControllerActivityAddsHypermediaLinkToRAlgoController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__ALGO_CONTROLLER_ACTIVITY_ADDS_HYPERMEDIA_LINK_TO_RALGO_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasAlgoResourceController->forAll(algoControllerA, algoControllerB |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Child' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Child' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Child' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Child' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the algoControllerActivityAddsHypermediaLinkToRAlgoController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_algoControllerActivityAddsHypermediaLinkToRAlgoController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerActivityAddsHypermediaLinkToRAlgoController",
				 RES_TFUL_SERVICE_PIM__ALGO_CONTROLLER_ACTIVITY_ADDS_HYPERMEDIA_LINK_TO_RALGO_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algoControllerAddsHypermediaLinkToParentAlgoController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__ALGO_CONTROLLER_ADDS_HYPERMEDIA_LINK_TO_PARENT_ALGO_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasAlgoResourceController->forAll(algoControllerA, algoControllerB |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Parent' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Parent' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Parent' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Parent' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the algoControllerAddsHypermediaLinkToParentAlgoController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_algoControllerAddsHypermediaLinkToParentAlgoController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerAddsHypermediaLinkToParentAlgoController",
				 RES_TFUL_SERVICE_PIM__ALGO_CONTROLLER_ADDS_HYPERMEDIA_LINK_TO_PARENT_ALGO_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerReadAddsHypermediaLinkToRAlgoController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RCONTROLLER_READ_ADDS_HYPERMEDIA_LINK_TO_RALGO_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasAlgoResourceController->forAll(algoControllerA |\n" +
		"\t\tself.hasResourceController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Child' and hasTargetAlgoController = algoControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Child' and hasTargetAlgoController = algoControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and hasTargetAlgoController = algoControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and hasTargetAlgoController = algoControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\n" +
		"\t\t))";

	/**
	 * Validates the rControllerReadAddsHypermediaLinkToRAlgoController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rControllerReadAddsHypermediaLinkToRAlgoController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerReadAddsHypermediaLinkToRAlgoController",
				 RES_TFUL_SERVICE_PIM__RCONTROLLER_READ_ADDS_HYPERMEDIA_LINK_TO_RALGO_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerUpdateAddsHypermediaLinkToRAlgoController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__RCONTROLLER_UPDATE_ADDS_HYPERMEDIA_LINK_TO_RALGO_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasAlgoResourceController->forAll(algoControllerA |\n" +
		"\t\tself.hasResourceController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Child' and hasTargetAlgoController = algoControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = 'Child' and hasTargetAlgoController = algoControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and hasTargetAlgoController = algoControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Child' and hasTargetAlgoController = algoControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\n" +
		"\t\t))";

	/**
	 * Validates the rControllerUpdateAddsHypermediaLinkToRAlgoController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_rControllerUpdateAddsHypermediaLinkToRAlgoController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerUpdateAddsHypermediaLinkToRAlgoController",
				 RES_TFUL_SERVICE_PIM__RCONTROLLER_UPDATE_ADDS_HYPERMEDIA_LINK_TO_RALGO_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algoControllerAddsReadHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__ALGO_CONTROLLER_ADDS_READ_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasAlgoResourceController->forAll(algoControllerA |\n" +
		"\t\tself.hasResourceController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the algoControllerAddsReadHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_algoControllerAddsReadHypermediaLinkToParentRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerAddsReadHypermediaLinkToParentRController",
				 RES_TFUL_SERVICE_PIM__ALGO_CONTROLLER_ADDS_READ_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algoControllerAddsUpdateHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__ALGO_CONTROLLER_ADDS_UPDATE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasAlgoResourceController->forAll(algoControllerA |\n" +
		"\t\tself.hasResourceController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the algoControllerAddsUpdateHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_algoControllerAddsUpdateHypermediaLinkToParentRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerAddsUpdateHypermediaLinkToParentRController",
				 RES_TFUL_SERVICE_PIM__ALGO_CONTROLLER_ADDS_UPDATE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algoControllerAddsDeleteHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_PIM__ALGO_CONTROLLER_ADDS_DELETE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasAlgoResourceController->forAll(algoControllerA |\n" +
		"\t\tself.hasResourceController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = 'Parent' and hasTargetRController = rControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the algoControllerAddsDeleteHypermediaLinkToParentRController constraint of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServicePIM_algoControllerAddsDeleteHypermediaLinkToParentRController(RESTfulServicePIM resTfulServicePIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM,
				 resTfulServicePIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerAddsDeleteHypermediaLinkToParentRController",
				 RES_TFUL_SERVICE_PIM__ALGO_CONTROLLER_ADDS_DELETE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaType(MediaType mediaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCRUDVerb(CRUDVerb crudVerb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRDBMSVerb(RDBMSVerb rdbmsVerb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType(LinkType linkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RESTServicePIMValidator
