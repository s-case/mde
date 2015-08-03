/**
 */
package ServicePSM.impl;

import ServicePSM.*;

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
public class ServicePSMFactoryImpl extends EFactoryImpl implements ServicePSMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServicePSMFactory init() {
		try {
			ServicePSMFactory theServicePSMFactory = (ServicePSMFactory)EPackage.Registry.INSTANCE.getEFactory(ServicePSMPackage.eNS_URI);
			if (theServicePSMFactory != null) {
				return theServicePSMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServicePSMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePSMFactoryImpl() {
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
			case ServicePSMPackage.HIBERNATE_ACTIVITY: return createHibernateActivity();
			case ServicePSMPackage.HIBERNATE_ANNOTATION: return createHibernateAnnotation();
			case ServicePSMPackage.HIBERNATE_CONTROLLER: return createHibernateController();
			case ServicePSMPackage.HTTP_ACTIVITY: return createHTTPActivity();
			case ServicePSMPackage.HTTP_ACTIVITY_FUNCTION_PARAMETER: return createHTTPActivityFunctionParameter();
			case ServicePSMPackage.HTTP_ACTIVITY_HANDLER: return createHTTPActivityHandler();
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER: return createJavaAlgoResourceController();
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL: return createJavaAlgoResourceModel();
			case ServicePSMPackage.JAVA_FUNCTION: return createJavaFunction();
			case ServicePSMPackage.JAVA_GETTER_FUNCTION: return createJavaGetterFunction();
			case ServicePSMPackage.JAVA_HYPERMEDIA_FUNCTION: return createJavaHypermediaFunction();
			case ServicePSMPackage.JAVA_RESOURCE_CONTROLLER: return createJavaResourceController();
			case ServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER: return createJavaResourceControllerManager();
			case ServicePSMPackage.JAVA_RESOURCE_MODEL: return createJavaResourceModel();
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER: return createJavaResourceModelManager();
			case ServicePSMPackage.PSM_COMPONENT_PROPERTY: return createPSMComponentProperty();
			case ServicePSMPackage.JAVA_SETTER_FUNCTION: return createJavaSetterFunction();
			case ServicePSMPackage.JAXB_ANNOTATION: return createJAXBAnnotation();
			case ServicePSMPackage.JAXRS_ANNOTATION: return createJAXRSAnnotation();
			case ServicePSMPackage.PSM_HYPERMEDIA_LINK: return createPSMHypermediaLink();
			case ServicePSMPackage.RES_TFUL_SERVICE_PSM: return createRESTfulServicePSM();
			case ServicePSMPackage.FUNCTION_PARAMETER: return createFunctionParameter();
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
			case ServicePSMPackage.HTTP_VERB:
				return createHTTPVerbFromString(eDataType, initialValue);
			case ServicePSMPackage.MEDIA_TYPE:
				return createMediaTypeFromString(eDataType, initialValue);
			case ServicePSMPackage.LINK_TYPE:
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
			case ServicePSMPackage.HTTP_VERB:
				return convertHTTPVerbToString(eDataType, instanceValue);
			case ServicePSMPackage.MEDIA_TYPE:
				return convertMediaTypeToString(eDataType, instanceValue);
			case ServicePSMPackage.LINK_TYPE:
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
	public HibernateActivity createHibernateActivity() {
		HibernateActivityImpl hibernateActivity = new HibernateActivityImpl();
		return hibernateActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibernateAnnotation createHibernateAnnotation() {
		HibernateAnnotationImpl hibernateAnnotation = new HibernateAnnotationImpl();
		return hibernateAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibernateController createHibernateController() {
		HibernateControllerImpl hibernateController = new HibernateControllerImpl();
		return hibernateController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActivity createHTTPActivity() {
		HTTPActivityImpl httpActivity = new HTTPActivityImpl();
		return httpActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActivityFunctionParameter createHTTPActivityFunctionParameter() {
		HTTPActivityFunctionParameterImpl httpActivityFunctionParameter = new HTTPActivityFunctionParameterImpl();
		return httpActivityFunctionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActivityHandler createHTTPActivityHandler() {
		HTTPActivityHandlerImpl httpActivityHandler = new HTTPActivityHandlerImpl();
		return httpActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceController createJavaAlgoResourceController() {
		JavaAlgoResourceControllerImpl javaAlgoResourceController = new JavaAlgoResourceControllerImpl();
		return javaAlgoResourceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceModel createJavaAlgoResourceModel() {
		JavaAlgoResourceModelImpl javaAlgoResourceModel = new JavaAlgoResourceModelImpl();
		return javaAlgoResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFunction createJavaFunction() {
		JavaFunctionImpl javaFunction = new JavaFunctionImpl();
		return javaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaGetterFunction createJavaGetterFunction() {
		JavaGetterFunctionImpl javaGetterFunction = new JavaGetterFunctionImpl();
		return javaGetterFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaHypermediaFunction createJavaHypermediaFunction() {
		JavaHypermediaFunctionImpl javaHypermediaFunction = new JavaHypermediaFunctionImpl();
		return javaHypermediaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceController createJavaResourceController() {
		JavaResourceControllerImpl javaResourceController = new JavaResourceControllerImpl();
		return javaResourceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceControllerManager createJavaResourceControllerManager() {
		JavaResourceControllerManagerImpl javaResourceControllerManager = new JavaResourceControllerManagerImpl();
		return javaResourceControllerManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModel createJavaResourceModel() {
		JavaResourceModelImpl javaResourceModel = new JavaResourceModelImpl();
		return javaResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModelManager createJavaResourceModelManager() {
		JavaResourceModelManagerImpl javaResourceModelManager = new JavaResourceModelManagerImpl();
		return javaResourceModelManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty createPSMComponentProperty() {
		PSMComponentPropertyImpl psmComponentProperty = new PSMComponentPropertyImpl();
		return psmComponentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSetterFunction createJavaSetterFunction() {
		JavaSetterFunctionImpl javaSetterFunction = new JavaSetterFunctionImpl();
		return javaSetterFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAXBAnnotation createJAXBAnnotation() {
		JAXBAnnotationImpl jaxbAnnotation = new JAXBAnnotationImpl();
		return jaxbAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAXRSAnnotation createJAXRSAnnotation() {
		JAXRSAnnotationImpl jaxrsAnnotation = new JAXRSAnnotationImpl();
		return jaxrsAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMHypermediaLink createPSMHypermediaLink() {
		PSMHypermediaLinkImpl psmHypermediaLink = new PSMHypermediaLinkImpl();
		return psmHypermediaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTfulServicePSM createRESTfulServicePSM() {
		RESTfulServicePSMImpl resTfulServicePSM = new RESTfulServicePSMImpl();
		return resTfulServicePSM;
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
	public HTTPVerb createHTTPVerbFromString(EDataType eDataType, String initialValue) {
		HTTPVerb result = HTTPVerb.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public ServicePSMPackage getServicePSMPackage() {
		return (ServicePSMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServicePSMPackage getPackage() {
		return ServicePSMPackage.eINSTANCE;
	}

} //ServicePSMFactoryImpl
