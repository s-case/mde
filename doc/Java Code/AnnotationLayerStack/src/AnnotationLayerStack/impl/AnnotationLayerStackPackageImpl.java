/**
 */
package AnnotationLayerStack.impl;

import AnnotationLayerStack.AnnotationLayerStackFactory;
import AnnotationLayerStack.AnnotationLayerStackPackage;
import AnnotationLayerStack.AnnotationStack;

import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;

import SearchLayerPSM.SearchLayerPSMPackage;

import SearchLayerPSM.impl.SearchLayerPSMPackageImpl;

import ServicePSM.RESTfulServicePSMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationLayerStackPackageImpl extends EPackageImpl implements AnnotationLayerStackPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationStackEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see AnnotationLayerStack.AnnotationLayerStackPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnnotationLayerStackPackageImpl() {
		super(eNS_URI, AnnotationLayerStackFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AnnotationLayerStackPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnnotationLayerStackPackage init() {
		if (isInited) return (AnnotationLayerStackPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationLayerStackPackage.eNS_URI);

		// Obtain or create and register package
		AnnotationLayerStackPackageImpl theAnnotationLayerStackPackage = (AnnotationLayerStackPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnnotationLayerStackPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnnotationLayerStackPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AuthenticationLayerPSMPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SearchLayerPSMPackageImpl theSearchLayerPSMPackage = (SearchLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI) instanceof SearchLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI) : SearchLayerPSMPackage.eINSTANCE);

		// Create package meta-data objects
		theAnnotationLayerStackPackage.createPackageContents();
		theSearchLayerPSMPackage.createPackageContents();

		// Initialize created meta-data
		theAnnotationLayerStackPackage.initializePackageContents();
		theSearchLayerPSMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnnotationLayerStackPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnnotationLayerStackPackage.eNS_URI, theAnnotationLayerStackPackage);
		return theAnnotationLayerStackPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationStack() {
		return annotationStackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationStack_HasAuthenticationLayer() {
		return (EReference)annotationStackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationStack_BHasAuthenticationAnnotation() {
		return (EAttribute)annotationStackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationStack_HasCorePSM() {
		return (EReference)annotationStackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationStack_HasSearchLayer() {
		return (EReference)annotationStackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationStack_BHasSearchLayer() {
		return (EAttribute)annotationStackEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationLayerStackFactory getAnnotationLayerStackFactory() {
		return (AnnotationLayerStackFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		annotationStackEClass = createEClass(ANNOTATION_STACK);
		createEReference(annotationStackEClass, ANNOTATION_STACK__HAS_AUTHENTICATION_LAYER);
		createEAttribute(annotationStackEClass, ANNOTATION_STACK__BHAS_AUTHENTICATION_ANNOTATION);
		createEReference(annotationStackEClass, ANNOTATION_STACK__HAS_CORE_PSM);
		createEReference(annotationStackEClass, ANNOTATION_STACK__HAS_SEARCH_LAYER);
		createEAttribute(annotationStackEClass, ANNOTATION_STACK__BHAS_SEARCH_LAYER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AuthenticationLayerPSMPackage theAuthenticationLayerPSMPackage = (AuthenticationLayerPSMPackage)EPackage.Registry.INSTANCE.getEPackage(AuthenticationLayerPSMPackage.eNS_URI);
		RESTfulServicePSMPackage theRESTfulServicePSMPackage = (RESTfulServicePSMPackage)EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI);
		SearchLayerPSMPackage theSearchLayerPSMPackage = (SearchLayerPSMPackage)EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(annotationStackEClass, AnnotationStack.class, "AnnotationStack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationStack_HasAuthenticationLayer(), theAuthenticationLayerPSMPackage.getAnnotationModel(), null, "hasAuthenticationLayer", null, 0, 1, AnnotationStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationStack_BHasAuthenticationAnnotation(), ecorePackage.getEBoolean(), "bHasAuthenticationAnnotation", null, 1, 1, AnnotationStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationStack_HasCorePSM(), theRESTfulServicePSMPackage.getRESTfulServicePSM(), null, "hasCorePSM", null, 1, 1, AnnotationStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationStack_HasSearchLayer(), theSearchLayerPSMPackage.getAnnotationModel(), null, "hasSearchLayer", null, 1, 1, AnnotationStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationStack_BHasSearchLayer(), ecorePackage.getEBoolean(), "bHasSearchLayer", null, 1, 1, AnnotationStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AnnotationLayerStackPackageImpl
