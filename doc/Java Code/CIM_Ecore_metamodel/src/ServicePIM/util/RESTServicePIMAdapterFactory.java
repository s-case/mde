/**
 */
package ServicePIM.util;

import ServicePIM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ServicePIM.RESTServicePIMPackage
 * @generated
 */
public class RESTServicePIMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RESTServicePIMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTServicePIMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RESTServicePIMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RESTServicePIMSwitch<Adapter> modelSwitch =
		new RESTServicePIMSwitch<Adapter>() {
			@Override
			public Adapter caseAlgoResourceModel(AlgoResourceModel object) {
				return createAlgoResourceModelAdapter();
			}
			@Override
			public Adapter caseAlgoResourceController(AlgoResourceController object) {
				return createAlgoResourceControllerAdapter();
			}
			@Override
			public Adapter caseResourceModelManager(ResourceModelManager object) {
				return createResourceModelManagerAdapter();
			}
			@Override
			public Adapter caseResourceModel(ResourceModel object) {
				return createResourceModelAdapter();
			}
			@Override
			public Adapter caseResourceControllerManager(ResourceControllerManager object) {
				return createResourceControllerManagerAdapter();
			}
			@Override
			public Adapter caseResourceController(ResourceController object) {
				return createResourceControllerAdapter();
			}
			@Override
			public Adapter casePIMComponentProperty(PIMComponentProperty object) {
				return createPIMComponentPropertyAdapter();
			}
			@Override
			public Adapter caseRepresentationParseFunction(RepresentationParseFunction object) {
				return createRepresentationParseFunctionAdapter();
			}
			@Override
			public Adapter caseRepresentationMarshallingFunction(RepresentationMarshallingFunction object) {
				return createRepresentationMarshallingFunctionAdapter();
			}
			@Override
			public Adapter caseResourceInputRepresentation(ResourceInputRepresentation object) {
				return createResourceInputRepresentationAdapter();
			}
			@Override
			public Adapter caseResourceOutputRepresentation(ResourceOutputRepresentation object) {
				return createResourceOutputRepresentationAdapter();
			}
			@Override
			public Adapter caseResourceControllerCRUDActivity(ResourceControllerCRUDActivity object) {
				return createResourceControllerCRUDActivityAdapter();
			}
			@Override
			public Adapter caseSetterFunction(SetterFunction object) {
				return createSetterFunctionAdapter();
			}
			@Override
			public Adapter caseGetterFunction(GetterFunction object) {
				return createGetterFunctionAdapter();
			}
			@Override
			public Adapter caseFunctionParameter(FunctionParameter object) {
				return createFunctionParameterAdapter();
			}
			@Override
			public Adapter caseCRUDActivityHandler(CRUDActivityHandler object) {
				return createCRUDActivityHandlerAdapter();
			}
			@Override
			public Adapter caseCreateHypermediaPIMFunction(CreateHypermediaPIMFunction object) {
				return createCreateHypermediaPIMFunctionAdapter();
			}
			@Override
			public Adapter caseDatabaseController(DatabaseController object) {
				return createDatabaseControllerAdapter();
			}
			@Override
			public Adapter caseRDBMSActivity(RDBMSActivity object) {
				return createRDBMSActivityAdapter();
			}
			@Override
			public Adapter caseRDBMSTable(RDBMSTable object) {
				return createRDBMSTableAdapter();
			}
			@Override
			public Adapter caseRDBMSTableColumn(RDBMSTableColumn object) {
				return createRDBMSTableColumnAdapter();
			}
			@Override
			public Adapter caseHypermediaLink(HypermediaLink object) {
				return createHypermediaLinkAdapter();
			}
			@Override
			public Adapter casePIMComponentFunction(PIMComponentFunction object) {
				return createPIMComponentFunctionAdapter();
			}
			@Override
			public Adapter caseRESTfulServicePIM(RESTfulServicePIM object) {
				return createRESTfulServicePIMAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.AlgoResourceModel <em>Algo Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.AlgoResourceModel
	 * @generated
	 */
	public Adapter createAlgoResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.AlgoResourceController <em>Algo Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.AlgoResourceController
	 * @generated
	 */
	public Adapter createAlgoResourceControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.ResourceModelManager <em>Resource Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.ResourceModelManager
	 * @generated
	 */
	public Adapter createResourceModelManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.ResourceModel <em>Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.ResourceModel
	 * @generated
	 */
	public Adapter createResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.ResourceControllerManager <em>Resource Controller Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.ResourceControllerManager
	 * @generated
	 */
	public Adapter createResourceControllerManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.ResourceController <em>Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.ResourceController
	 * @generated
	 */
	public Adapter createResourceControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.PIMComponentProperty <em>PIM Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.PIMComponentProperty
	 * @generated
	 */
	public Adapter createPIMComponentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.RepresentationParseFunction <em>Representation Parse Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.RepresentationParseFunction
	 * @generated
	 */
	public Adapter createRepresentationParseFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.RepresentationMarshallingFunction <em>Representation Marshalling Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.RepresentationMarshallingFunction
	 * @generated
	 */
	public Adapter createRepresentationMarshallingFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.ResourceInputRepresentation <em>Resource Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.ResourceInputRepresentation
	 * @generated
	 */
	public Adapter createResourceInputRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.ResourceOutputRepresentation <em>Resource Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.ResourceOutputRepresentation
	 * @generated
	 */
	public Adapter createResourceOutputRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.ResourceControllerCRUDActivity <em>Resource Controller CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.ResourceControllerCRUDActivity
	 * @generated
	 */
	public Adapter createResourceControllerCRUDActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.SetterFunction <em>Setter Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.SetterFunction
	 * @generated
	 */
	public Adapter createSetterFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.GetterFunction <em>Getter Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.GetterFunction
	 * @generated
	 */
	public Adapter createGetterFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.FunctionParameter <em>Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.FunctionParameter
	 * @generated
	 */
	public Adapter createFunctionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.CRUDActivityHandler <em>CRUD Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.CRUDActivityHandler
	 * @generated
	 */
	public Adapter createCRUDActivityHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.CreateHypermediaPIMFunction <em>Create Hypermedia PIM Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.CreateHypermediaPIMFunction
	 * @generated
	 */
	public Adapter createCreateHypermediaPIMFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.DatabaseController <em>Database Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.DatabaseController
	 * @generated
	 */
	public Adapter createDatabaseControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.RDBMSActivity <em>RDBMS Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.RDBMSActivity
	 * @generated
	 */
	public Adapter createRDBMSActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.RDBMSTable <em>RDBMS Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.RDBMSTable
	 * @generated
	 */
	public Adapter createRDBMSTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.RDBMSTableColumn <em>RDBMS Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.RDBMSTableColumn
	 * @generated
	 */
	public Adapter createRDBMSTableColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.HypermediaLink <em>Hypermedia Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.HypermediaLink
	 * @generated
	 */
	public Adapter createHypermediaLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.PIMComponentFunction <em>PIM Component Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.PIMComponentFunction
	 * @generated
	 */
	public Adapter createPIMComponentFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.RESTfulServicePIM <em>RES Tful Service PIM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.RESTfulServicePIM
	 * @generated
	 */
	public Adapter createRESTfulServicePIMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RESTServicePIMAdapterFactory
