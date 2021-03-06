/**
 */
package ServicePSM.util;

import ServicePSM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ServicePSM.RESTfulServicePSMPackage
 * @generated
 */
public class RESTfulServicePSMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RESTfulServicePSMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTfulServicePSMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RESTfulServicePSMPackage.eINSTANCE;
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
	protected RESTfulServicePSMSwitch<Adapter> modelSwitch =
		new RESTfulServicePSMSwitch<Adapter>() {
			@Override
			public Adapter caseHibernateActivity(HibernateActivity object) {
				return createHibernateActivityAdapter();
			}
			@Override
			public Adapter caseHibernateAnnotation(HibernateAnnotation object) {
				return createHibernateAnnotationAdapter();
			}
			@Override
			public Adapter caseHibernateController(HibernateController object) {
				return createHibernateControllerAdapter();
			}
			@Override
			public Adapter caseHTTPActivity(HTTPActivity object) {
				return createHTTPActivityAdapter();
			}
			@Override
			public Adapter caseHTTPActivityFunctionParameter(HTTPActivityFunctionParameter object) {
				return createHTTPActivityFunctionParameterAdapter();
			}
			@Override
			public Adapter caseHTTPActivityHandler(HTTPActivityHandler object) {
				return createHTTPActivityHandlerAdapter();
			}
			@Override
			public Adapter caseJavaAlgoResourceController(JavaAlgoResourceController object) {
				return createJavaAlgoResourceControllerAdapter();
			}
			@Override
			public Adapter caseJavaAlgoResourceModel(JavaAlgoResourceModel object) {
				return createJavaAlgoResourceModelAdapter();
			}
			@Override
			public Adapter caseJavaFunction(JavaFunction object) {
				return createJavaFunctionAdapter();
			}
			@Override
			public Adapter caseJavaGetterFunction(JavaGetterFunction object) {
				return createJavaGetterFunctionAdapter();
			}
			@Override
			public Adapter caseJavaHypermediaFunction(JavaHypermediaFunction object) {
				return createJavaHypermediaFunctionAdapter();
			}
			@Override
			public Adapter caseJavaResourceController(JavaResourceController object) {
				return createJavaResourceControllerAdapter();
			}
			@Override
			public Adapter caseJavaResourceControllerManager(JavaResourceControllerManager object) {
				return createJavaResourceControllerManagerAdapter();
			}
			@Override
			public Adapter caseJavaResourceModel(JavaResourceModel object) {
				return createJavaResourceModelAdapter();
			}
			@Override
			public Adapter caseJavaResourceModelManager(JavaResourceModelManager object) {
				return createJavaResourceModelManagerAdapter();
			}
			@Override
			public Adapter casePSMComponentProperty(PSMComponentProperty object) {
				return createPSMComponentPropertyAdapter();
			}
			@Override
			public Adapter caseJavaSetterFunction(JavaSetterFunction object) {
				return createJavaSetterFunctionAdapter();
			}
			@Override
			public Adapter caseJAXBAnnotation(JAXBAnnotation object) {
				return createJAXBAnnotationAdapter();
			}
			@Override
			public Adapter caseJAXRSAnnotation(JAXRSAnnotation object) {
				return createJAXRSAnnotationAdapter();
			}
			@Override
			public Adapter casePSMHypermediaLink(PSMHypermediaLink object) {
				return createPSMHypermediaLinkAdapter();
			}
			@Override
			public Adapter caseRESTfulServicePSM(RESTfulServicePSM object) {
				return createRESTfulServicePSMAdapter();
			}
			@Override
			public Adapter caseFunctionParameter(FunctionParameter object) {
				return createFunctionParameterAdapter();
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
	 * Creates a new adapter for an object of class '{@link ServicePSM.HibernateActivity <em>Hibernate Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.HibernateActivity
	 * @generated
	 */
	public Adapter createHibernateActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.HibernateAnnotation <em>Hibernate Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.HibernateAnnotation
	 * @generated
	 */
	public Adapter createHibernateAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.HibernateController <em>Hibernate Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.HibernateController
	 * @generated
	 */
	public Adapter createHibernateControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.HTTPActivity <em>HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.HTTPActivity
	 * @generated
	 */
	public Adapter createHTTPActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.HTTPActivityFunctionParameter <em>HTTP Activity Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.HTTPActivityFunctionParameter
	 * @generated
	 */
	public Adapter createHTTPActivityFunctionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.HTTPActivityHandler <em>HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.HTTPActivityHandler
	 * @generated
	 */
	public Adapter createHTTPActivityHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.JavaAlgoResourceController <em>Java Algo Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.JavaAlgoResourceController
	 * @generated
	 */
	public Adapter createJavaAlgoResourceControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.JavaAlgoResourceModel <em>Java Algo Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.JavaAlgoResourceModel
	 * @generated
	 */
	public Adapter createJavaAlgoResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.JavaFunction <em>Java Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.JavaFunction
	 * @generated
	 */
	public Adapter createJavaFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.JavaGetterFunction <em>Java Getter Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.JavaGetterFunction
	 * @generated
	 */
	public Adapter createJavaGetterFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.JavaHypermediaFunction <em>Java Hypermedia Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.JavaHypermediaFunction
	 * @generated
	 */
	public Adapter createJavaHypermediaFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.JavaResourceController <em>Java Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.JavaResourceController
	 * @generated
	 */
	public Adapter createJavaResourceControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.JavaResourceControllerManager <em>Java Resource Controller Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.JavaResourceControllerManager
	 * @generated
	 */
	public Adapter createJavaResourceControllerManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.JavaResourceModel <em>Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.JavaResourceModel
	 * @generated
	 */
	public Adapter createJavaResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.JavaResourceModelManager <em>Java Resource Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.JavaResourceModelManager
	 * @generated
	 */
	public Adapter createJavaResourceModelManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.PSMComponentProperty <em>PSM Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.PSMComponentProperty
	 * @generated
	 */
	public Adapter createPSMComponentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.JavaSetterFunction <em>Java Setter Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.JavaSetterFunction
	 * @generated
	 */
	public Adapter createJavaSetterFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.JAXBAnnotation <em>JAXB Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.JAXBAnnotation
	 * @generated
	 */
	public Adapter createJAXBAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.JAXRSAnnotation <em>JAXRS Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.JAXRSAnnotation
	 * @generated
	 */
	public Adapter createJAXRSAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.PSMHypermediaLink <em>PSM Hypermedia Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.PSMHypermediaLink
	 * @generated
	 */
	public Adapter createPSMHypermediaLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.RESTfulServicePSM <em>RES Tful Service PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.RESTfulServicePSM
	 * @generated
	 */
	public Adapter createRESTfulServicePSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePSM.FunctionParameter <em>Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePSM.FunctionParameter
	 * @generated
	 */
	public Adapter createFunctionParameterAdapter() {
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

} //RESTfulServicePSMAdapterFactory
