/**
 */
package ServicePIM.util;

import ServicePIM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ServicePIM.RESTServicePIMPackage
 * @generated
 */
public class RESTServicePIMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RESTServicePIMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTServicePIMSwitch() {
		if (modelPackage == null) {
			modelPackage = RESTServicePIMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL: {
				AlgoResourceModel algoResourceModel = (AlgoResourceModel)theEObject;
				T result = caseAlgoResourceModel(algoResourceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER: {
				AlgoResourceController algoResourceController = (AlgoResourceController)theEObject;
				T result = caseAlgoResourceController(algoResourceController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER: {
				ResourceModelManager resourceModelManager = (ResourceModelManager)theEObject;
				T result = caseResourceModelManager(resourceModelManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.RESOURCE_MODEL: {
				ResourceModel resourceModel = (ResourceModel)theEObject;
				T result = caseResourceModel(resourceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER: {
				ResourceControllerManager resourceControllerManager = (ResourceControllerManager)theEObject;
				T result = caseResourceControllerManager(resourceControllerManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.RESOURCE_CONTROLLER: {
				ResourceController resourceController = (ResourceController)theEObject;
				T result = caseResourceController(resourceController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY: {
				PIMComponentProperty pimComponentProperty = (PIMComponentProperty)theEObject;
				T result = casePIMComponentProperty(pimComponentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.REPRESENTATION_PARSE_FUNCTION: {
				RepresentationParseFunction representationParseFunction = (RepresentationParseFunction)theEObject;
				T result = caseRepresentationParseFunction(representationParseFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.REPRESENTATION_MARSHALLING_FUNCTION: {
				RepresentationMarshallingFunction representationMarshallingFunction = (RepresentationMarshallingFunction)theEObject;
				T result = caseRepresentationMarshallingFunction(representationMarshallingFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.RESOURCE_INPUT_REPRESENTATION: {
				ResourceInputRepresentation resourceInputRepresentation = (ResourceInputRepresentation)theEObject;
				T result = caseResourceInputRepresentation(resourceInputRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.RESOURCE_OUTPUT_REPRESENTATION: {
				ResourceOutputRepresentation resourceOutputRepresentation = (ResourceOutputRepresentation)theEObject;
				T result = caseResourceOutputRepresentation(resourceOutputRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY: {
				ResourceControllerCRUDActivity resourceControllerCRUDActivity = (ResourceControllerCRUDActivity)theEObject;
				T result = caseResourceControllerCRUDActivity(resourceControllerCRUDActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.SETTER_FUNCTION: {
				SetterFunction setterFunction = (SetterFunction)theEObject;
				T result = caseSetterFunction(setterFunction);
				if (result == null) result = casePIMComponentFunction(setterFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.GETTER_FUNCTION: {
				GetterFunction getterFunction = (GetterFunction)theEObject;
				T result = caseGetterFunction(getterFunction);
				if (result == null) result = casePIMComponentFunction(getterFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.FUNCTION_PARAMETER: {
				FunctionParameter functionParameter = (FunctionParameter)theEObject;
				T result = caseFunctionParameter(functionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER: {
				CRUDActivityHandler crudActivityHandler = (CRUDActivityHandler)theEObject;
				T result = caseCRUDActivityHandler(crudActivityHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.CREATE_HYPERMEDIA_PIM_FUNCTION: {
				CreateHypermediaPIMFunction createHypermediaPIMFunction = (CreateHypermediaPIMFunction)theEObject;
				T result = caseCreateHypermediaPIMFunction(createHypermediaPIMFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.DATABASE_CONTROLLER: {
				DatabaseController databaseController = (DatabaseController)theEObject;
				T result = caseDatabaseController(databaseController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.RDBMS_ACTIVITY: {
				RDBMSActivity rdbmsActivity = (RDBMSActivity)theEObject;
				T result = caseRDBMSActivity(rdbmsActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.RDBMS_TABLE: {
				RDBMSTable rdbmsTable = (RDBMSTable)theEObject;
				T result = caseRDBMSTable(rdbmsTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN: {
				RDBMSTableColumn rdbmsTableColumn = (RDBMSTableColumn)theEObject;
				T result = caseRDBMSTableColumn(rdbmsTableColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.HYPERMEDIA_LINK: {
				HypermediaLink hypermediaLink = (HypermediaLink)theEObject;
				T result = caseHypermediaLink(hypermediaLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.PIM_COMPONENT_FUNCTION: {
				PIMComponentFunction pimComponentFunction = (PIMComponentFunction)theEObject;
				T result = casePIMComponentFunction(pimComponentFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM: {
				RESTfulServicePIM resTfulServicePIM = (RESTfulServicePIM)theEObject;
				T result = caseRESTfulServicePIM(resTfulServicePIM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algo Resource Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgoResourceModel(AlgoResourceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algo Resource Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgoResourceController(AlgoResourceController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Model Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceModelManager(ResourceModelManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceModel(ResourceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Controller Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceControllerManager(ResourceControllerManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceController(ResourceController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PIM Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PIM Component Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePIMComponentProperty(PIMComponentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation Parse Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation Parse Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentationParseFunction(RepresentationParseFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation Marshalling Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation Marshalling Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentationMarshallingFunction(RepresentationMarshallingFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Input Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Input Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceInputRepresentation(ResourceInputRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Output Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Output Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceOutputRepresentation(ResourceOutputRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Controller CRUD Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Controller CRUD Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceControllerCRUDActivity(ResourceControllerCRUDActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setter Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setter Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetterFunction(SetterFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Getter Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Getter Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetterFunction(GetterFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionParameter(FunctionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CRUD Activity Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CRUD Activity Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCRUDActivityHandler(CRUDActivityHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Hypermedia PIM Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Hypermedia PIM Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateHypermediaPIMFunction(CreateHypermediaPIMFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseController(DatabaseController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDBMS Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDBMS Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDBMSActivity(RDBMSActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDBMS Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDBMS Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDBMSTable(RDBMSTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDBMS Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDBMS Table Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDBMSTableColumn(RDBMSTableColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hypermedia Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypermedia Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHypermediaLink(HypermediaLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PIM Component Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PIM Component Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePIMComponentFunction(PIMComponentFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RES Tful Service PIM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRESTfulServicePIM(RESTfulServicePIM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RESTServicePIMSwitch
