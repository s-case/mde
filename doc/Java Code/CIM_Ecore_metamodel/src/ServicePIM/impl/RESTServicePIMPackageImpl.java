/**
 */
package ServicePIM.impl;

import ServicePIM.AlgoResourceController;
import ServicePIM.AlgoResourceModel;
import ServicePIM.CRUDActivityHandler;
import ServicePIM.CRUDVerb;
import ServicePIM.CreateHypermediaPIMFunction;
import ServicePIM.DatabaseController;
import ServicePIM.FunctionParameter;
import ServicePIM.GetterFunction;
import ServicePIM.HypermediaLink;
import ServicePIM.LinkType;
import ServicePIM.MediaType;
import ServicePIM.PIMComponentFunction;
import ServicePIM.PIMComponentProperty;
import ServicePIM.RDBMSActivity;
import ServicePIM.RDBMSTable;
import ServicePIM.RDBMSTableColumn;
import ServicePIM.RDBMSVerb;
import ServicePIM.RESTServicePIMFactory;
import ServicePIM.RESTServicePIMPackage;
import ServicePIM.RESTfulServicePIM;
import ServicePIM.RepresentationMarshallingFunction;
import ServicePIM.RepresentationParseFunction;
import ServicePIM.ResourceController;
import ServicePIM.ResourceControllerCRUDActivity;
import ServicePIM.ResourceControllerManager;
import ServicePIM.ResourceInputRepresentation;
import ServicePIM.ResourceModel;
import ServicePIM.ResourceModelManager;
import ServicePIM.ResourceOutputRepresentation;
import ServicePIM.SetterFunction;

import ServicePIM.util.RESTServicePIMValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RESTServicePIMPackageImpl extends EPackageImpl implements RESTServicePIMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algoResourceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algoResourceControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceModelManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceControllerManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pimComponentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationParseFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationMarshallingFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceInputRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceOutputRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceControllerCRUDActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setterFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getterFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crudActivityHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createHypermediaPIMFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbmsActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbmsTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbmsTableColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hypermediaLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pimComponentFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resTfulServicePIMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum crudVerbEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rdbmsVerbEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkTypeEEnum = null;

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
	 * @see ServicePIM.RESTServicePIMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RESTServicePIMPackageImpl() {
		super(eNS_URI, RESTServicePIMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RESTServicePIMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RESTServicePIMPackage init() {
		if (isInited) return (RESTServicePIMPackage)EPackage.Registry.INSTANCE.getEPackage(RESTServicePIMPackage.eNS_URI);

		// Obtain or create and register package
		RESTServicePIMPackageImpl theRESTServicePIMPackage = (RESTServicePIMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RESTServicePIMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RESTServicePIMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRESTServicePIMPackage.createPackageContents();

		// Initialize created meta-data
		theRESTServicePIMPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRESTServicePIMPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RESTServicePIMValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRESTServicePIMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RESTServicePIMPackage.eNS_URI, theRESTServicePIMPackage);
		return theRESTServicePIMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgoResourceModel() {
		return algoResourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgoResourceModel_ParentName() {
		return (EAttribute)algoResourceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgoResourceModel_Name() {
		return (EAttribute)algoResourceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoResourceModel_AlgoModelHasInputRepresentation() {
		return (EReference)algoResourceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoResourceModel_AlgoModelHasOutputRepresentation() {
		return (EReference)algoResourceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoResourceModel_AlgoModelHasProperty() {
		return (EReference)algoResourceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoResourceModel_AlgoModelHasSetter() {
		return (EReference)algoResourceModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoResourceModel_AlgoModelHasGetter() {
		return (EReference)algoResourceModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoResourceModel_HasRelatedAlgoModel() {
		return (EReference)algoResourceModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoResourceModel_IsRelatedAlgoModel() {
		return (EReference)algoResourceModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoResourceModel_AlgoModelHasParseFunction() {
		return (EReference)algoResourceModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoResourceModel_AlgoModelHasMarshallingFunction() {
		return (EReference)algoResourceModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgoResourceController() {
		return algoResourceControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgoResourceController_Name() {
		return (EAttribute)algoResourceControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgoResourceController_ParentName() {
		return (EAttribute)algoResourceControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgoResourceController_ControllerURI() {
		return (EAttribute)algoResourceControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoResourceController_HasAssociatedAlgoModel() {
		return (EReference)algoResourceControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgoResourceController_AlgoControllerHasCRUDActivity() {
		return (EReference)algoResourceControllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceModelManager() {
		return resourceModelManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceModelManager_Name() {
		return (EAttribute)resourceModelManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceModelManager_ParentName() {
		return (EAttribute)resourceModelManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModelManager_HasRelatedModel() {
		return (EReference)resourceModelManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModelManager_RMManagerHasInputRepresentation() {
		return (EReference)resourceModelManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModelManager_RMManagerHasOutputRepresentation() {
		return (EReference)resourceModelManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModelManager_HasRMManagerProperty() {
		return (EReference)resourceModelManagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModelManager_RMManagerHasSetter() {
		return (EReference)resourceModelManagerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModelManager_RMManagerHasGetter() {
		return (EReference)resourceModelManagerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModelManager_RMManagerHasParseFunction() {
		return (EReference)resourceModelManagerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModelManager_RMManagerHasMarshallingFunction() {
		return (EReference)resourceModelManagerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceModel() {
		return resourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceModel_Name() {
		return (EAttribute)resourceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceModel_ParentName() {
		return (EAttribute)resourceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_RModelHasIRepresentation() {
		return (EReference)resourceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_RModelHasOutputRepresentation() {
		return (EReference)resourceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_RModelHasProperty() {
		return (EReference)resourceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_HasRelatedModelManager() {
		return (EReference)resourceModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_HasRelatedAlgoModel() {
		return (EReference)resourceModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_RModelHasSetter() {
		return (EReference)resourceModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_RModelHasGetter() {
		return (EReference)resourceModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_IsMappedToRDBMSTable() {
		return (EReference)resourceModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_RModelHasParseFunction() {
		return (EReference)resourceModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceModel_RModelMarshallingFunction() {
		return (EReference)resourceModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceControllerManager() {
		return resourceControllerManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceControllerManager_Name() {
		return (EAttribute)resourceControllerManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceControllerManager_ControllerURI() {
		return (EAttribute)resourceControllerManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceControllerManager_HasAssociatedRMManager() {
		return (EReference)resourceControllerManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceControllerManager_RCManagerHasCRUDActivity() {
		return (EReference)resourceControllerManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceControllerManager_ParentName() {
		return (EAttribute)resourceControllerManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceController() {
		return resourceControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceController_Name() {
		return (EAttribute)resourceControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceController_ControllerURI() {
		return (EAttribute)resourceControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceController_HasAssociatedRModel() {
		return (EReference)resourceControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceController_RControllerHasCRUDActivity() {
		return (EReference)resourceControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceController_ParentName() {
		return (EAttribute)resourceControllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPIMComponentProperty() {
		return pimComponentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPIMComponentProperty_Name() {
		return (EAttribute)pimComponentPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPIMComponentProperty_Type() {
		return (EAttribute)pimComponentPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPIMComponentProperty_IsUnique() {
		return (EAttribute)pimComponentPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPIMComponentProperty_IsNamingProperty() {
		return (EAttribute)pimComponentPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPIMComponentProperty_IsPrimaryIdentifier() {
		return (EAttribute)pimComponentPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPIMComponentProperty_IsMappedToRDBMSColumn() {
		return (EReference)pimComponentPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentationParseFunction() {
		return representationParseFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationParseFunction_ParsesInputRepresentation() {
		return (EReference)representationParseFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentationMarshallingFunction() {
		return representationMarshallingFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationMarshallingFunction_MarshalsRepresentation() {
		return (EReference)representationMarshallingFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceInputRepresentation() {
		return resourceInputRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceInputRepresentation_InputType() {
		return (EAttribute)resourceInputRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceOutputRepresentation() {
		return resourceOutputRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceOutputRepresentation_OutputType() {
		return (EAttribute)resourceOutputRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceControllerCRUDActivity() {
		return resourceControllerCRUDActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceControllerCRUDActivity_Name() {
		return (EAttribute)resourceControllerCRUDActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceControllerCRUDActivity_ActivityURI() {
		return (EAttribute)resourceControllerCRUDActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceControllerCRUDActivity_CrudVerb() {
		return (EAttribute)resourceControllerCRUDActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceControllerCRUDActivity_HasCRUDActivityHandler() {
		return (EReference)resourceControllerCRUDActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceControllerCRUDActivity_IsMappedToRDBMSActivity() {
		return (EReference)resourceControllerCRUDActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetterFunction() {
		return setterFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetterFunction_SetsProperty() {
		return (EReference)setterFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetterFunction() {
		return getterFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetterFunction_GetsProperty() {
		return (EReference)getterFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionParameter() {
		return functionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameter_Name() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameter_Type() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameter_IsUnique() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameter_BIsReturnParameter() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRUDActivityHandler() {
		return crudActivityHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRUDActivityHandler_Name() {
		return (EAttribute)crudActivityHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRUDActivityHandler_CrudVerb() {
		return (EAttribute)crudActivityHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRUDActivityHandler_HasHypermediaFunction() {
		return (EReference)crudActivityHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRUDActivityHandler_UsesDBController() {
		return (EReference)crudActivityHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateHypermediaPIMFunction() {
		return createHypermediaPIMFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateHypermediaPIMFunction_HasHypermediaLink() {
		return (EReference)createHypermediaPIMFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseController() {
		return databaseControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseController_Name() {
		return (EAttribute)databaseControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseController_HasRDBMSActivity() {
		return (EReference)databaseControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBMSActivity() {
		return rdbmsActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBMSActivity_Name() {
		return (EAttribute)rdbmsActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBMSActivity_RdbmsVerb() {
		return (EAttribute)rdbmsActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBMSActivity_AltersRDBMSTable() {
		return (EReference)rdbmsActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBMSTable() {
		return rdbmsTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBMSTable_Name() {
		return (EAttribute)rdbmsTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBMSTable_HasRDBMSColumns() {
		return (EReference)rdbmsTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBMSTableColumn() {
		return rdbmsTableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBMSTableColumn_Name() {
		return (EAttribute)rdbmsTableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBMSTableColumn_Type() {
		return (EAttribute)rdbmsTableColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBMSTableColumn_IsForeignKey() {
		return (EAttribute)rdbmsTableColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDBMSTableColumn_IsPrimaryKey() {
		return (EAttribute)rdbmsTableColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBMSTableColumn_ReferencesRDBMSTable() {
		return (EReference)rdbmsTableColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHypermediaLink() {
		return hypermediaLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypermediaLink_LinkCRUDVerb() {
		return (EAttribute)hypermediaLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypermediaLink_LinkType() {
		return (EAttribute)hypermediaLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHypermediaLink_HasTargetAlgoController() {
		return (EReference)hypermediaLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHypermediaLink_HasTargetRCManager() {
		return (EReference)hypermediaLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHypermediaLink_HasTargetRController() {
		return (EReference)hypermediaLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPIMComponentFunction() {
		return pimComponentFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPIMComponentFunction_Name() {
		return (EAttribute)pimComponentFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPIMComponentFunction_HasFunctionParameter() {
		return (EReference)pimComponentFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRESTfulServicePIM() {
		return resTfulServicePIMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePIM_HasResourceModel() {
		return (EReference)resTfulServicePIMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePIM_HasResourceModelManager() {
		return (EReference)resTfulServicePIMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePIM_HasResourceController() {
		return (EReference)resTfulServicePIMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePIM_HasResourceControllerManager() {
		return (EReference)resTfulServicePIMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePIM_HasAlgoResourceModel() {
		return (EReference)resTfulServicePIMEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePIM_HasAlgoResourceController() {
		return (EReference)resTfulServicePIMEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePIM_HasRDBMSTable() {
		return (EReference)resTfulServicePIMEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServicePIM_HasDatabaseController() {
		return (EReference)resTfulServicePIMEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServicePIM_Name() {
		return (EAttribute)resTfulServicePIMEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMediaType() {
		return mediaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCRUDVerb() {
		return crudVerbEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRDBMSVerb() {
		return rdbmsVerbEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkType() {
		return linkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTServicePIMFactory getRESTServicePIMFactory() {
		return (RESTServicePIMFactory)getEFactoryInstance();
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
		algoResourceModelEClass = createEClass(ALGO_RESOURCE_MODEL);
		createEAttribute(algoResourceModelEClass, ALGO_RESOURCE_MODEL__PARENT_NAME);
		createEAttribute(algoResourceModelEClass, ALGO_RESOURCE_MODEL__NAME);
		createEReference(algoResourceModelEClass, ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_INPUT_REPRESENTATION);
		createEReference(algoResourceModelEClass, ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_OUTPUT_REPRESENTATION);
		createEReference(algoResourceModelEClass, ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PROPERTY);
		createEReference(algoResourceModelEClass, ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_SETTER);
		createEReference(algoResourceModelEClass, ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_GETTER);
		createEReference(algoResourceModelEClass, ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL);
		createEReference(algoResourceModelEClass, ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL);
		createEReference(algoResourceModelEClass, ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PARSE_FUNCTION);
		createEReference(algoResourceModelEClass, ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_MARSHALLING_FUNCTION);

		algoResourceControllerEClass = createEClass(ALGO_RESOURCE_CONTROLLER);
		createEAttribute(algoResourceControllerEClass, ALGO_RESOURCE_CONTROLLER__NAME);
		createEAttribute(algoResourceControllerEClass, ALGO_RESOURCE_CONTROLLER__PARENT_NAME);
		createEAttribute(algoResourceControllerEClass, ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI);
		createEReference(algoResourceControllerEClass, ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL);
		createEReference(algoResourceControllerEClass, ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_CRUD_ACTIVITY);

		resourceModelManagerEClass = createEClass(RESOURCE_MODEL_MANAGER);
		createEAttribute(resourceModelManagerEClass, RESOURCE_MODEL_MANAGER__NAME);
		createEAttribute(resourceModelManagerEClass, RESOURCE_MODEL_MANAGER__PARENT_NAME);
		createEReference(resourceModelManagerEClass, RESOURCE_MODEL_MANAGER__HAS_RELATED_MODEL);
		createEReference(resourceModelManagerEClass, RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_INPUT_REPRESENTATION);
		createEReference(resourceModelManagerEClass, RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_OUTPUT_REPRESENTATION);
		createEReference(resourceModelManagerEClass, RESOURCE_MODEL_MANAGER__HAS_RM_MANAGER_PROPERTY);
		createEReference(resourceModelManagerEClass, RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_SETTER);
		createEReference(resourceModelManagerEClass, RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_GETTER);
		createEReference(resourceModelManagerEClass, RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_PARSE_FUNCTION);
		createEReference(resourceModelManagerEClass, RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_MARSHALLING_FUNCTION);

		resourceModelEClass = createEClass(RESOURCE_MODEL);
		createEAttribute(resourceModelEClass, RESOURCE_MODEL__NAME);
		createEAttribute(resourceModelEClass, RESOURCE_MODEL__PARENT_NAME);
		createEReference(resourceModelEClass, RESOURCE_MODEL__RMODEL_HAS_IREPRESENTATION);
		createEReference(resourceModelEClass, RESOURCE_MODEL__RMODEL_HAS_OUTPUT_REPRESENTATION);
		createEReference(resourceModelEClass, RESOURCE_MODEL__RMODEL_HAS_PROPERTY);
		createEReference(resourceModelEClass, RESOURCE_MODEL__HAS_RELATED_MODEL_MANAGER);
		createEReference(resourceModelEClass, RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL);
		createEReference(resourceModelEClass, RESOURCE_MODEL__RMODEL_HAS_SETTER);
		createEReference(resourceModelEClass, RESOURCE_MODEL__RMODEL_HAS_GETTER);
		createEReference(resourceModelEClass, RESOURCE_MODEL__IS_MAPPED_TO_RDBMS_TABLE);
		createEReference(resourceModelEClass, RESOURCE_MODEL__RMODEL_HAS_PARSE_FUNCTION);
		createEReference(resourceModelEClass, RESOURCE_MODEL__RMODEL_MARSHALLING_FUNCTION);

		resourceControllerManagerEClass = createEClass(RESOURCE_CONTROLLER_MANAGER);
		createEAttribute(resourceControllerManagerEClass, RESOURCE_CONTROLLER_MANAGER__NAME);
		createEAttribute(resourceControllerManagerEClass, RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI);
		createEReference(resourceControllerManagerEClass, RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER);
		createEReference(resourceControllerManagerEClass, RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_HAS_CRUD_ACTIVITY);
		createEAttribute(resourceControllerManagerEClass, RESOURCE_CONTROLLER_MANAGER__PARENT_NAME);

		resourceControllerEClass = createEClass(RESOURCE_CONTROLLER);
		createEAttribute(resourceControllerEClass, RESOURCE_CONTROLLER__NAME);
		createEAttribute(resourceControllerEClass, RESOURCE_CONTROLLER__CONTROLLER_URI);
		createEReference(resourceControllerEClass, RESOURCE_CONTROLLER__HAS_ASSOCIATED_RMODEL);
		createEReference(resourceControllerEClass, RESOURCE_CONTROLLER__RCONTROLLER_HAS_CRUD_ACTIVITY);
		createEAttribute(resourceControllerEClass, RESOURCE_CONTROLLER__PARENT_NAME);

		pimComponentPropertyEClass = createEClass(PIM_COMPONENT_PROPERTY);
		createEAttribute(pimComponentPropertyEClass, PIM_COMPONENT_PROPERTY__NAME);
		createEAttribute(pimComponentPropertyEClass, PIM_COMPONENT_PROPERTY__TYPE);
		createEAttribute(pimComponentPropertyEClass, PIM_COMPONENT_PROPERTY__IS_UNIQUE);
		createEAttribute(pimComponentPropertyEClass, PIM_COMPONENT_PROPERTY__IS_NAMING_PROPERTY);
		createEAttribute(pimComponentPropertyEClass, PIM_COMPONENT_PROPERTY__IS_PRIMARY_IDENTIFIER);
		createEReference(pimComponentPropertyEClass, PIM_COMPONENT_PROPERTY__IS_MAPPED_TO_RDBMS_COLUMN);

		representationParseFunctionEClass = createEClass(REPRESENTATION_PARSE_FUNCTION);
		createEReference(representationParseFunctionEClass, REPRESENTATION_PARSE_FUNCTION__PARSES_INPUT_REPRESENTATION);

		representationMarshallingFunctionEClass = createEClass(REPRESENTATION_MARSHALLING_FUNCTION);
		createEReference(representationMarshallingFunctionEClass, REPRESENTATION_MARSHALLING_FUNCTION__MARSHALS_REPRESENTATION);

		resourceInputRepresentationEClass = createEClass(RESOURCE_INPUT_REPRESENTATION);
		createEAttribute(resourceInputRepresentationEClass, RESOURCE_INPUT_REPRESENTATION__INPUT_TYPE);

		resourceOutputRepresentationEClass = createEClass(RESOURCE_OUTPUT_REPRESENTATION);
		createEAttribute(resourceOutputRepresentationEClass, RESOURCE_OUTPUT_REPRESENTATION__OUTPUT_TYPE);

		resourceControllerCRUDActivityEClass = createEClass(RESOURCE_CONTROLLER_CRUD_ACTIVITY);
		createEAttribute(resourceControllerCRUDActivityEClass, RESOURCE_CONTROLLER_CRUD_ACTIVITY__NAME);
		createEAttribute(resourceControllerCRUDActivityEClass, RESOURCE_CONTROLLER_CRUD_ACTIVITY__ACTIVITY_URI);
		createEAttribute(resourceControllerCRUDActivityEClass, RESOURCE_CONTROLLER_CRUD_ACTIVITY__CRUD_VERB);
		createEReference(resourceControllerCRUDActivityEClass, RESOURCE_CONTROLLER_CRUD_ACTIVITY__HAS_CRUD_ACTIVITY_HANDLER);
		createEReference(resourceControllerCRUDActivityEClass, RESOURCE_CONTROLLER_CRUD_ACTIVITY__IS_MAPPED_TO_RDBMS_ACTIVITY);

		setterFunctionEClass = createEClass(SETTER_FUNCTION);
		createEReference(setterFunctionEClass, SETTER_FUNCTION__SETS_PROPERTY);

		getterFunctionEClass = createEClass(GETTER_FUNCTION);
		createEReference(getterFunctionEClass, GETTER_FUNCTION__GETS_PROPERTY);

		functionParameterEClass = createEClass(FUNCTION_PARAMETER);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__NAME);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__TYPE);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__IS_UNIQUE);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__BIS_RETURN_PARAMETER);

		crudActivityHandlerEClass = createEClass(CRUD_ACTIVITY_HANDLER);
		createEAttribute(crudActivityHandlerEClass, CRUD_ACTIVITY_HANDLER__NAME);
		createEAttribute(crudActivityHandlerEClass, CRUD_ACTIVITY_HANDLER__CRUD_VERB);
		createEReference(crudActivityHandlerEClass, CRUD_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION);
		createEReference(crudActivityHandlerEClass, CRUD_ACTIVITY_HANDLER__USES_DB_CONTROLLER);

		createHypermediaPIMFunctionEClass = createEClass(CREATE_HYPERMEDIA_PIM_FUNCTION);
		createEReference(createHypermediaPIMFunctionEClass, CREATE_HYPERMEDIA_PIM_FUNCTION__HAS_HYPERMEDIA_LINK);

		databaseControllerEClass = createEClass(DATABASE_CONTROLLER);
		createEAttribute(databaseControllerEClass, DATABASE_CONTROLLER__NAME);
		createEReference(databaseControllerEClass, DATABASE_CONTROLLER__HAS_RDBMS_ACTIVITY);

		rdbmsActivityEClass = createEClass(RDBMS_ACTIVITY);
		createEAttribute(rdbmsActivityEClass, RDBMS_ACTIVITY__NAME);
		createEAttribute(rdbmsActivityEClass, RDBMS_ACTIVITY__RDBMS_VERB);
		createEReference(rdbmsActivityEClass, RDBMS_ACTIVITY__ALTERS_RDBMS_TABLE);

		rdbmsTableEClass = createEClass(RDBMS_TABLE);
		createEAttribute(rdbmsTableEClass, RDBMS_TABLE__NAME);
		createEReference(rdbmsTableEClass, RDBMS_TABLE__HAS_RDBMS_COLUMNS);

		rdbmsTableColumnEClass = createEClass(RDBMS_TABLE_COLUMN);
		createEAttribute(rdbmsTableColumnEClass, RDBMS_TABLE_COLUMN__NAME);
		createEAttribute(rdbmsTableColumnEClass, RDBMS_TABLE_COLUMN__TYPE);
		createEAttribute(rdbmsTableColumnEClass, RDBMS_TABLE_COLUMN__IS_FOREIGN_KEY);
		createEAttribute(rdbmsTableColumnEClass, RDBMS_TABLE_COLUMN__IS_PRIMARY_KEY);
		createEReference(rdbmsTableColumnEClass, RDBMS_TABLE_COLUMN__REFERENCES_RDBMS_TABLE);

		hypermediaLinkEClass = createEClass(HYPERMEDIA_LINK);
		createEAttribute(hypermediaLinkEClass, HYPERMEDIA_LINK__LINK_CRUD_VERB);
		createEAttribute(hypermediaLinkEClass, HYPERMEDIA_LINK__LINK_TYPE);
		createEReference(hypermediaLinkEClass, HYPERMEDIA_LINK__HAS_TARGET_ALGO_CONTROLLER);
		createEReference(hypermediaLinkEClass, HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER);
		createEReference(hypermediaLinkEClass, HYPERMEDIA_LINK__HAS_TARGET_RCONTROLLER);

		pimComponentFunctionEClass = createEClass(PIM_COMPONENT_FUNCTION);
		createEAttribute(pimComponentFunctionEClass, PIM_COMPONENT_FUNCTION__NAME);
		createEReference(pimComponentFunctionEClass, PIM_COMPONENT_FUNCTION__HAS_FUNCTION_PARAMETER);

		resTfulServicePIMEClass = createEClass(RES_TFUL_SERVICE_PIM);
		createEReference(resTfulServicePIMEClass, RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL);
		createEReference(resTfulServicePIMEClass, RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL_MANAGER);
		createEReference(resTfulServicePIMEClass, RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER);
		createEReference(resTfulServicePIMEClass, RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER_MANAGER);
		createEReference(resTfulServicePIMEClass, RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_MODEL);
		createEReference(resTfulServicePIMEClass, RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_CONTROLLER);
		createEReference(resTfulServicePIMEClass, RES_TFUL_SERVICE_PIM__HAS_RDBMS_TABLE);
		createEReference(resTfulServicePIMEClass, RES_TFUL_SERVICE_PIM__HAS_DATABASE_CONTROLLER);
		createEAttribute(resTfulServicePIMEClass, RES_TFUL_SERVICE_PIM__NAME);

		// Create enums
		mediaTypeEEnum = createEEnum(MEDIA_TYPE);
		crudVerbEEnum = createEEnum(CRUD_VERB);
		rdbmsVerbEEnum = createEEnum(RDBMS_VERB);
		linkTypeEEnum = createEEnum(LINK_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		setterFunctionEClass.getESuperTypes().add(this.getPIMComponentFunction());
		getterFunctionEClass.getESuperTypes().add(this.getPIMComponentFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(algoResourceModelEClass, AlgoResourceModel.class, "AlgoResourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlgoResourceModel_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, AlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgoResourceModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, AlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoResourceModel_AlgoModelHasInputRepresentation(), this.getResourceInputRepresentation(), null, "algoModelHasInputRepresentation", null, 0, -1, AlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoResourceModel_AlgoModelHasOutputRepresentation(), this.getResourceOutputRepresentation(), null, "algoModelHasOutputRepresentation", null, 1, -1, AlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoResourceModel_AlgoModelHasProperty(), this.getPIMComponentProperty(), null, "algoModelHasProperty", null, 1, 1, AlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoResourceModel_AlgoModelHasSetter(), this.getSetterFunction(), null, "algoModelHasSetter", null, 1, 1, AlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoResourceModel_AlgoModelHasGetter(), this.getGetterFunction(), null, "algoModelHasGetter", null, 1, 1, AlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoResourceModel_HasRelatedAlgoModel(), this.getAlgoResourceModel(), null, "hasRelatedAlgoModel", null, 0, -1, AlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoResourceModel_IsRelatedAlgoModel(), this.getAlgoResourceModel(), null, "isRelatedAlgoModel", null, 0, -1, AlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoResourceModel_AlgoModelHasParseFunction(), this.getRepresentationParseFunction(), null, "algoModelHasParseFunction", null, 0, -1, AlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoResourceModel_AlgoModelHasMarshallingFunction(), this.getRepresentationMarshallingFunction(), null, "algoModelHasMarshallingFunction", null, 1, -1, AlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(algoResourceControllerEClass, AlgoResourceController.class, "AlgoResourceController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlgoResourceController_Name(), ecorePackage.getEString(), "name", null, 1, 1, AlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgoResourceController_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, AlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgoResourceController_ControllerURI(), ecorePackage.getEString(), "controllerURI", null, 1, 1, AlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoResourceController_HasAssociatedAlgoModel(), this.getAlgoResourceModel(), null, "hasAssociatedAlgoModel", null, 1, 1, AlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgoResourceController_AlgoControllerHasCRUDActivity(), this.getResourceControllerCRUDActivity(), null, "algoControllerHasCRUDActivity", null, 1, 1, AlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceModelManagerEClass, ResourceModelManager.class, "ResourceModelManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceModelManager_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceModelManager_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, ResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModelManager_HasRelatedModel(), this.getResourceModel(), null, "hasRelatedModel", null, 1, 1, ResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModelManager_RMManagerHasInputRepresentation(), this.getResourceInputRepresentation(), null, "rMManagerHasInputRepresentation", null, 1, -1, ResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModelManager_RMManagerHasOutputRepresentation(), this.getResourceOutputRepresentation(), null, "rMManagerHasOutputRepresentation", null, 1, -1, ResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModelManager_HasRMManagerProperty(), this.getPIMComponentProperty(), null, "hasRMManagerProperty", null, 1, 1, ResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModelManager_RMManagerHasSetter(), this.getSetterFunction(), null, "rMManagerHasSetter", null, 1, 1, ResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModelManager_RMManagerHasGetter(), this.getGetterFunction(), null, "rMManagerHasGetter", null, 1, 1, ResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModelManager_RMManagerHasParseFunction(), this.getRepresentationParseFunction(), null, "rMManagerHasParseFunction", null, 1, -1, ResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModelManager_RMManagerHasMarshallingFunction(), this.getRepresentationMarshallingFunction(), null, "rMManagerHasMarshallingFunction", null, 1, -1, ResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceModelEClass, ResourceModel.class, "ResourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceModel_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, ResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModel_RModelHasIRepresentation(), this.getResourceInputRepresentation(), null, "rModelHasIRepresentation", null, 1, -1, ResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModel_RModelHasOutputRepresentation(), this.getResourceOutputRepresentation(), null, "rModelHasOutputRepresentation", null, 1, -1, ResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModel_RModelHasProperty(), this.getPIMComponentProperty(), null, "rModelHasProperty", null, 1, -1, ResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModel_HasRelatedModelManager(), this.getResourceModelManager(), null, "hasRelatedModelManager", null, 0, -1, ResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModel_HasRelatedAlgoModel(), this.getAlgoResourceModel(), null, "hasRelatedAlgoModel", null, 0, -1, ResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModel_RModelHasSetter(), this.getSetterFunction(), null, "rModelHasSetter", null, 1, -1, ResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModel_RModelHasGetter(), this.getGetterFunction(), null, "rModelHasGetter", null, 1, -1, ResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModel_IsMappedToRDBMSTable(), this.getRDBMSTable(), null, "isMappedToRDBMSTable", null, 1, 1, ResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModel_RModelHasParseFunction(), this.getRepresentationParseFunction(), null, "rModelHasParseFunction", null, 1, -1, ResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceModel_RModelMarshallingFunction(), this.getRepresentationMarshallingFunction(), null, "rModelMarshallingFunction", null, 1, -1, ResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceControllerManagerEClass, ResourceControllerManager.class, "ResourceControllerManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceControllerManager_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceControllerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceControllerManager_ControllerURI(), ecorePackage.getEString(), "controllerURI", null, 1, 1, ResourceControllerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceControllerManager_HasAssociatedRMManager(), this.getResourceModelManager(), null, "hasAssociatedRMManager", null, 1, 1, ResourceControllerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceControllerManager_RCManagerHasCRUDActivity(), this.getResourceControllerCRUDActivity(), null, "rCManagerHasCRUDActivity", null, 2, -1, ResourceControllerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceControllerManager_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, ResourceControllerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceControllerEClass, ResourceController.class, "ResourceController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceController_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceController_ControllerURI(), ecorePackage.getEString(), "controllerURI", null, 1, 1, ResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceController_HasAssociatedRModel(), this.getResourceModel(), null, "hasAssociatedRModel", null, 1, 1, ResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceController_RControllerHasCRUDActivity(), this.getResourceControllerCRUDActivity(), null, "rControllerHasCRUDActivity", null, 1, -1, ResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceController_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, ResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pimComponentPropertyEClass, PIMComponentProperty.class, "PIMComponentProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPIMComponentProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, PIMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPIMComponentProperty_Type(), ecorePackage.getEString(), "type", null, 1, 1, PIMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPIMComponentProperty_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 1, 1, PIMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPIMComponentProperty_IsNamingProperty(), ecorePackage.getEBoolean(), "isNamingProperty", null, 1, 1, PIMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPIMComponentProperty_IsPrimaryIdentifier(), ecorePackage.getEBoolean(), "isPrimaryIdentifier", null, 1, 1, PIMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPIMComponentProperty_IsMappedToRDBMSColumn(), this.getRDBMSTableColumn(), null, "isMappedToRDBMSColumn", null, 0, 1, PIMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationParseFunctionEClass, RepresentationParseFunction.class, "RepresentationParseFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepresentationParseFunction_ParsesInputRepresentation(), this.getResourceInputRepresentation(), null, "parsesInputRepresentation", null, 1, 1, RepresentationParseFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationMarshallingFunctionEClass, RepresentationMarshallingFunction.class, "RepresentationMarshallingFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepresentationMarshallingFunction_MarshalsRepresentation(), this.getResourceOutputRepresentation(), null, "marshalsRepresentation", null, 1, 1, RepresentationMarshallingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceInputRepresentationEClass, ResourceInputRepresentation.class, "ResourceInputRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceInputRepresentation_InputType(), this.getMediaType(), "inputType", null, 1, 1, ResourceInputRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceOutputRepresentationEClass, ResourceOutputRepresentation.class, "ResourceOutputRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceOutputRepresentation_OutputType(), this.getMediaType(), "outputType", null, 1, 1, ResourceOutputRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceControllerCRUDActivityEClass, ResourceControllerCRUDActivity.class, "ResourceControllerCRUDActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceControllerCRUDActivity_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceControllerCRUDActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceControllerCRUDActivity_ActivityURI(), ecorePackage.getEString(), "activityURI", null, 1, 1, ResourceControllerCRUDActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceControllerCRUDActivity_CrudVerb(), this.getCRUDVerb(), "crudVerb", null, 1, 1, ResourceControllerCRUDActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceControllerCRUDActivity_HasCRUDActivityHandler(), this.getCRUDActivityHandler(), null, "hasCRUDActivityHandler", null, 1, 1, ResourceControllerCRUDActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceControllerCRUDActivity_IsMappedToRDBMSActivity(), this.getRDBMSActivity(), null, "isMappedToRDBMSActivity", null, 0, 1, ResourceControllerCRUDActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setterFunctionEClass, SetterFunction.class, "SetterFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetterFunction_SetsProperty(), this.getPIMComponentProperty(), null, "setsProperty", null, 1, 1, SetterFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getterFunctionEClass, GetterFunction.class, "GetterFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetterFunction_GetsProperty(), this.getPIMComponentProperty(), null, "getsProperty", null, 1, 1, GetterFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionParameterEClass, FunctionParameter.class, "FunctionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionParameter_Type(), ecorePackage.getEString(), "type", null, 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionParameter_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionParameter_BIsReturnParameter(), ecorePackage.getEBoolean(), "bIsReturnParameter", null, 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crudActivityHandlerEClass, CRUDActivityHandler.class, "CRUDActivityHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCRUDActivityHandler_Name(), ecorePackage.getEString(), "name", null, 1, 1, CRUDActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCRUDActivityHandler_CrudVerb(), this.getCRUDVerb(), "crudVerb", null, 1, 1, CRUDActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCRUDActivityHandler_HasHypermediaFunction(), this.getCreateHypermediaPIMFunction(), null, "hasHypermediaFunction", null, 1, 1, CRUDActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCRUDActivityHandler_UsesDBController(), this.getDatabaseController(), null, "usesDBController", null, 1, 1, CRUDActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createHypermediaPIMFunctionEClass, CreateHypermediaPIMFunction.class, "CreateHypermediaPIMFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateHypermediaPIMFunction_HasHypermediaLink(), this.getHypermediaLink(), null, "hasHypermediaLink", null, 1, -1, CreateHypermediaPIMFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseControllerEClass, DatabaseController.class, "DatabaseController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseController_Name(), ecorePackage.getEString(), "name", null, 1, 1, DatabaseController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseController_HasRDBMSActivity(), this.getRDBMSActivity(), null, "hasRDBMSActivity", null, 1, -1, DatabaseController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdbmsActivityEClass, RDBMSActivity.class, "RDBMSActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRDBMSActivity_Name(), ecorePackage.getEString(), "name", null, 1, 1, RDBMSActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDBMSActivity_RdbmsVerb(), this.getRDBMSVerb(), "rdbmsVerb", null, 1, 1, RDBMSActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDBMSActivity_AltersRDBMSTable(), this.getRDBMSTable(), null, "altersRDBMSTable", null, 1, 1, RDBMSActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdbmsTableEClass, RDBMSTable.class, "RDBMSTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRDBMSTable_Name(), ecorePackage.getEString(), "name", null, 1, 1, RDBMSTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDBMSTable_HasRDBMSColumns(), this.getRDBMSTableColumn(), null, "hasRDBMSColumns", null, 2, -1, RDBMSTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdbmsTableColumnEClass, RDBMSTableColumn.class, "RDBMSTableColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRDBMSTableColumn_Name(), ecorePackage.getEString(), "name", null, 1, 1, RDBMSTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDBMSTableColumn_Type(), ecorePackage.getEString(), "type", null, 1, 1, RDBMSTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDBMSTableColumn_IsForeignKey(), ecorePackage.getEBoolean(), "isForeignKey", null, 1, 1, RDBMSTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDBMSTableColumn_IsPrimaryKey(), ecorePackage.getEBoolean(), "isPrimaryKey", null, 1, 1, RDBMSTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDBMSTableColumn_ReferencesRDBMSTable(), this.getRDBMSTable(), null, "referencesRDBMSTable", null, 0, -1, RDBMSTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hypermediaLinkEClass, HypermediaLink.class, "HypermediaLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHypermediaLink_LinkCRUDVerb(), this.getCRUDVerb(), "linkCRUDVerb", null, 1, 1, HypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypermediaLink_LinkType(), this.getLinkType(), "linkType", null, 1, 1, HypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypermediaLink_HasTargetAlgoController(), this.getAlgoResourceController(), null, "hasTargetAlgoController", null, 0, 1, HypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypermediaLink_HasTargetRCManager(), this.getResourceControllerManager(), null, "hasTargetRCManager", null, 0, 1, HypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypermediaLink_HasTargetRController(), this.getResourceController(), null, "hasTargetRController", null, 0, 1, HypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pimComponentFunctionEClass, PIMComponentFunction.class, "PIMComponentFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPIMComponentFunction_Name(), ecorePackage.getEString(), "name", null, 1, 1, PIMComponentFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPIMComponentFunction_HasFunctionParameter(), this.getFunctionParameter(), null, "hasFunctionParameter", null, 0, -1, PIMComponentFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resTfulServicePIMEClass, RESTfulServicePIM.class, "RESTfulServicePIM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRESTfulServicePIM_HasResourceModel(), this.getResourceModel(), null, "hasResourceModel", null, 0, -1, RESTfulServicePIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePIM_HasResourceModelManager(), this.getResourceModelManager(), null, "hasResourceModelManager", null, 0, -1, RESTfulServicePIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePIM_HasResourceController(), this.getResourceController(), null, "hasResourceController", null, 0, -1, RESTfulServicePIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePIM_HasResourceControllerManager(), this.getResourceControllerManager(), null, "hasResourceControllerManager", null, 0, -1, RESTfulServicePIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePIM_HasAlgoResourceModel(), this.getAlgoResourceModel(), null, "hasAlgoResourceModel", null, 0, -1, RESTfulServicePIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePIM_HasAlgoResourceController(), this.getAlgoResourceController(), null, "hasAlgoResourceController", null, 0, -1, RESTfulServicePIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePIM_HasRDBMSTable(), this.getRDBMSTable(), null, "hasRDBMSTable", null, 0, -1, RESTfulServicePIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServicePIM_HasDatabaseController(), this.getDatabaseController(), null, "hasDatabaseController", null, 1, 1, RESTfulServicePIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTfulServicePIM_Name(), ecorePackage.getEString(), "name", null, 1, 1, RESTfulServicePIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mediaTypeEEnum, MediaType.class, "MediaType");
		addEEnumLiteral(mediaTypeEEnum, MediaType.JSON);
		addEEnumLiteral(mediaTypeEEnum, MediaType.XML);

		initEEnum(crudVerbEEnum, CRUDVerb.class, "CRUDVerb");
		addEEnumLiteral(crudVerbEEnum, CRUDVerb.CREATE);
		addEEnumLiteral(crudVerbEEnum, CRUDVerb.READ);
		addEEnumLiteral(crudVerbEEnum, CRUDVerb.UPDATE);
		addEEnumLiteral(crudVerbEEnum, CRUDVerb.DELETE);

		initEEnum(rdbmsVerbEEnum, RDBMSVerb.class, "RDBMSVerb");
		addEEnumLiteral(rdbmsVerbEEnum, RDBMSVerb.INSERT);
		addEEnumLiteral(rdbmsVerbEEnum, RDBMSVerb.SELECT);
		addEEnumLiteral(rdbmsVerbEEnum, RDBMSVerb.UPDATE);
		addEEnumLiteral(rdbmsVerbEEnum, RDBMSVerb.DELETE);

		initEEnum(linkTypeEEnum, LinkType.class, "LinkType");
		addEEnumLiteral(linkTypeEEnum, LinkType.PARENT);
		addEEnumLiteral(linkTypeEEnum, LinkType.SIBLING);
		addEEnumLiteral(linkTypeEEnum, LinkType.CHILD);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (algoResourceModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "existantSettersForAllProperties existantGettersForAllProperties uniqueLinklistProperty"
		   });	
		addAnnotation
		  (algoResourceControllerEClass, 
		   source, 
		   new String[] {
			 "constraints", "algoControllerNotAllowedCRUDVerbs algoControllerHasUniqueCRUDActivity algoControllerActivityAddsHypermediaLinkToSelf"
		   });	
		addAnnotation
		  (resourceModelManagerEClass, 
		   source, 
		   new String[] {
			 "constraints", "existantSettersForAllProperties existantGettersForAllProperties uniqueLinklistProperty"
		   });	
		addAnnotation
		  (resourceModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueNamingProperty uniquePrimaryIdentifier existantSettersForAllProperties existantGettersForAllProperties uniqueLinklistProperty"
		   });	
		addAnnotation
		  (resourceControllerManagerEClass, 
		   source, 
		   new String[] {
			 "constraints", "rCManagerHasUniqueCREATEActivity rCManagerHasUniqueREADActivity rCManagerNotAllowedCRUDActivityVerbs rCManagerCreateActivityAddsCreateHypermediaLinkToSelf rCManagerReadActivityAddsCreateHypermediaLinkToSelf rCManagerCreateActivityAddsReadHypermediaLinkToSelf rCManagerReadActivityAddsReadHypermediaLinkToSelf"
		   });	
		addAnnotation
		  (resourceControllerEClass, 
		   source, 
		   new String[] {
			 "constraints", "rControllerHasUniqueCRUDActivities rControllerNotAllowedCRUDActivitiyVerbs rControllerReadActivityAddsReadHypermediaLinkToSelf rControllerUpdateActivityAddsUpdateHypermediaLinkToSelf rControllerReadActivityAddsUpdateHypermediaLinkToSelf rControllerReadActivityAddsDeleteHypermediaLinkToSelf rControllerUpdateActivityAddsReadHypermediaLinkToSelf rControllerUpdateActivityAddsDeleteHypermediaLinkToSelf"
		   });	
		addAnnotation
		  (pimComponentPropertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "primaryIdentifierMapsToPrimaryKey"
		   });	
		addAnnotation
		  (rdbmsTableEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniquePrimaryKey"
		   });	
		addAnnotation
		  (resTfulServicePIMEClass, 
		   source, 
		   new String[] {
			 "constraints", "controllersHaveUniqueURIs uniqueResourceModels uniqueResourceModelManagers uniqueResourceAlgoModels uniqueResourceControllers uniqueResourceControllerManagers uniqueResourceAlgoControllers uniquePIMComponentNames uniqueRModelRDBMSTableMapping validDatabaseReferentialIntegrity correctlyMatchingRControllerCRUDActivitiesWithRDBMSActivities correctlyMatchingRCManagerCRUDActivitiesWithRDBMSActivities rCManagerCreateActivityAddsReadHypermediaLinkToRRController rCManagerCreateActivityAddsUpdateHypermediaLinkToRRController rCManagerCreateActivityAddsDeleteHypermediaLinkToRRController rCManagerReadActivityAddsReadHypermediaLinkToRRController rCManagerReadActivityAddsUpdateHypermediaLinkToRRController rCManagerReadActivityAddsDeleteHypermediaLinkToRRController rCManagerCreateActivityAddsReadHypermediaLinkToParentRController rCManagerCreateActivityAddsUpdateHypermediaLinkToParentRController rCManagerCreateActivityAddsDeleteHypermediaLinkToParentRController rCManagerReadActivityAddsReadHypermediaLinkToParentRController rCManagerReadActivityAddsUpdateHypermediaLinkToParentRController rCManagerReadActivityAddsDeleteHypermediaLinkToParentRController rControllerReadActivityAddsCreateHypermediaLinkToRCManager rControllerReadActivityAddsReadHypermediaLinkToRCManager rControllerUpdateActivityAddsCreateHypermediaLinkToRCManager rControllerUpdateActivityAddsReadHypermediaLinkToRCManager rControllerReadActivityAddsCreateHypermediaLinkToParentRCManager rControllerReadActivityAddsReadHypermediaLinkToParentRCManager rControllerUpdateActivityAddsCreateHypermediaLinkToParentRCManager rControllerUpdateActivityAddsReadHypermediaLinkToParentRCManager rControllerDeleteActivityAddsCreateHypermediaLinkToParentRCManager rControllerDeleteActivityAddsReadHypermediaLinkToParentRCManager algoControllerActivityAddsHypermediaLinkToRAlgoController algoControllerAddsHypermediaLinkToParentAlgoController rControllerReadAddsHypermediaLinkToRAlgoController rControllerUpdateAddsHypermediaLinkToRAlgoController algoControllerAddsReadHypermediaLinkToParentRController algoControllerAddsUpdateHypermediaLinkToParentRController algoControllerAddsDeleteHypermediaLinkToParentRController"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (algoResourceModelEClass, 
		   source, 
		   new String[] {
			 "existantSettersForAllProperties", "self.algoModelHasProperty->forAll(rAlgoModelProperty | self.algoModelHasSetter->one(setsProperty.name = rAlgoModelProperty.name))",
			 "existantGettersForAllProperties", "self.algoModelHasProperty->forAll(rAlgoModelProperty | self.algoModelHasGetter->one(getsProperty.name = rAlgoModelProperty.name))",
			 "uniqueLinklistProperty", "self.algoModelHasProperty->one(name = \'linklist\')"
		   });	
		addAnnotation
		  (algoResourceControllerEClass, 
		   source, 
		   new String[] {
			 "algoControllerNotAllowedCRUDVerbs", "self.algoControllerHasCRUDActivity->select(CRUDActivity| CRUDActivity.crudVerb =2 or CRUDActivity.crudVerb = 3)->isEmpty()",
			 "algoControllerHasUniqueCRUDActivity", "self.algoControllerHasCRUDActivity->size() = 1",
			 "algoControllerActivityAddsHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\timplies\n\t\t\t\tself.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Sibling\' and hasTargetAlgoController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Sibling\' and hasTargetAlgoController = self)\n\t\t\t\timplies\t\t\n\t\t\t\tself.algoControllerHasCRUDActivity->exists(crudVerb = 0)\t\t\n\t\t\t)\n\t\t)\n\t\tor\n\t\t(\n\t\t\t(\n\t\t\t\tself.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Sibling\' and hasTargetAlgoController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Sibling\' and hasTargetAlgoController = self)\n\t\t\t\timplies\t\t\n\t\t\t\tself.algoControllerHasCRUDActivity->exists(crudVerb = 1)\t\t\n\t\t\t)\n\t\t)"
		   });	
		addAnnotation
		  (resourceModelManagerEClass, 
		   source, 
		   new String[] {
			 "existantSettersForAllProperties", "self.hasRMManagerProperty->forAll(rMManagerProperty | self.rMManagerHasSetter->one(setsProperty.name = rMManagerProperty.name))",
			 "existantGettersForAllProperties", "self.hasRMManagerProperty->forAll(rMManagerProperty | self.rMManagerHasGetter->one(getsProperty.name = rMManagerProperty.name))",
			 "uniqueLinklistProperty", "self.hasRMManagerProperty->one(name = \'linklist\')"
		   });	
		addAnnotation
		  (resourceModelEClass, 
		   source, 
		   new String[] {
			 "uniqueNamingProperty", "self.rModelHasProperty->one(isNamingProperty = true)",
			 "uniquePrimaryIdentifier", "self.rModelHasProperty->one(isPrimaryIdentifier = true)",
			 "existantSettersForAllProperties", "self.rModelHasProperty->forAll(rModelProperty | self.rModelHasSetter->one(setsProperty.name = rModelProperty.name))",
			 "existantGettersForAllProperties", "self.rModelHasProperty->forAll(rModelProperty | self.rModelHasGetter->one(getsProperty.name = rModelProperty.name))",
			 "uniqueLinklistProperty", "self.rModelHasProperty->one(name = \'linklist\')"
		   });	
		addAnnotation
		  (resourceControllerManagerEClass, 
		   source, 
		   new String[] {
			 "rCManagerHasUniqueCREATEActivity", "self.rCManagerHasCRUDActivity->one(crudVerb = 0)",
			 "rCManagerHasUniqueREADActivity", "self.rCManagerHasCRUDActivity->one(crudVerb = 1)",
			 "rCManagerNotAllowedCRUDActivityVerbs", "self.rCManagerHasCRUDActivity->select(crudVerb = 2 or crudVerb = 3)->isEmpty()",
			 "rCManagerCreateActivityAddsCreateHypermediaLinkToSelf", "self.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and hasTargetRCManager = self and linkType = \'Sibling\')",
			 "rCManagerReadActivityAddsCreateHypermediaLinkToSelf", "self.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and hasTargetRCManager = self and linkType = \'Sibling\')",
			 "rCManagerCreateActivityAddsReadHypermediaLinkToSelf", "self.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and hasTargetRCManager = self and linkType = \'Sibling\')",
			 "rCManagerReadActivityAddsReadHypermediaLinkToSelf", "self.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and hasTargetRCManager = self and linkType = \'Sibling\')"
		   });	
		addAnnotation
		  (resourceControllerEClass, 
		   source, 
		   new String[] {
			 "rControllerHasUniqueCRUDActivities", "self.rControllerHasCRUDActivity->isUnique(crudVerb)",
			 "rControllerNotAllowedCRUDActivitiyVerbs", "self.rControllerHasCRUDActivity->select(crudVerb = 0)->isEmpty()",
			 "rControllerReadActivityAddsReadHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity.hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity.hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t)\n\t\t)",
			 "rControllerUpdateActivityAddsUpdateHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity.hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity.hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t)\n\t\t)",
			 "rControllerReadActivityAddsUpdateHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 2) and self.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 2) and self.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t)\n\t\t)",
			 "rControllerReadActivityAddsDeleteHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 3) and self.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 3) and self.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t)\n\t\t)",
			 "rControllerUpdateActivityAddsReadHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 1) and self.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 1) and self.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t)\n\t\t)",
			 "rControllerUpdateActivityAddsDeleteHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 3) and self.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 3) and self.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t)\n\t\t)"
		   });	
		addAnnotation
		  (pimComponentPropertyEClass, 
		   source, 
		   new String[] {
			 "primaryIdentifierMapsToPrimaryKey", "(self.isPrimaryIdentifier = true) implies (self.isMappedToRDBMSColumn.isPrimaryKey = true)"
		   });	
		addAnnotation
		  (rdbmsTableEClass, 
		   source, 
		   new String[] {
			 "uniquePrimaryKey", "self.hasRDBMSColumns->one(isPrimaryKey = true)"
		   });	
		addAnnotation
		  (resTfulServicePIMEClass, 
		   source, 
		   new String[] {
			 "controllersHaveUniqueURIs", "self->isUnique(Bag{self.hasResourceController.controllerURI, self.hasResourceControllerManager.controllerURI, self.hasAlgoResourceController.controllerURI})",
			 "uniqueResourceModels", "self.hasResourceModel->isUnique(name)",
			 "uniqueResourceModelManagers", "self.hasResourceModelManager->isUnique(name)",
			 "uniqueResourceAlgoModels", "self.hasAlgoResourceModel->isUnique(name)",
			 "uniqueResourceControllers", "self.hasResourceController->isUnique(name)",
			 "uniqueResourceControllerManagers", "self.hasResourceControllerManager->isUnique(name)",
			 "uniqueResourceAlgoControllers", "self.hasAlgoResourceController->isUnique(name)",
			 "uniquePIMComponentNames", "self->isUnique(Bag{self.hasResourceModel.name, self.hasResourceController.name, self.hasResourceModelManager.name, self.hasResourceControllerManager, self.hasAlgoResourceModel.name, self.hasAlgoResourceController.name})",
			 "uniqueRModelRDBMSTableMapping", "self.hasResourceModel->forAll(rModel1, rModel2 | rModel1.name <> rModel2.name implies rModel1.isMappedToRDBMSTable.name <> rModel2.isMappedToRDBMSTable.name)",
			 "validDatabaseReferentialIntegrity", "self.hasResourceModel->forAll(rModel1, rModel2 | (rModel1.hasRelatedModelManager.hasRelatedModel = rModel2) implies (self.hasRDBMSTable->forAll(rdbmsTableA, rdbmsTableB | (rModel1.isMappedToRDBMSTable = rdbmsTableA and rModel2.isMappedToRDBMSTable = rdbmsTableB) implies (rModel1.rModelHasProperty->forAll(rModelPropertyA | (rModelPropertyA.isPrimaryIdentifier = true) implies (rdbmsTableB.hasRDBMSColumns->one(isForeignKey = true and name = rModelPropertyA.name and referencesRDBMSTable = rdbmsTableA)))))))",
			 "correctlyMatchingRControllerCRUDActivitiesWithRDBMSActivities", "self.hasResourceController.rControllerHasCRUDActivity->forAll(rControllerCRUDActivityA | self.hasDatabaseController.hasRDBMSActivity->forAll(rdbmsActivityA | (rControllerCRUDActivityA.isMappedToRDBMSActivity = rdbmsActivityA) implies (self.hasResourceController->one(rControllerHasCRUDActivity = rControllerCRUDActivityA and hasAssociatedRModel.isMappedToRDBMSTable = rControllerCRUDActivityA.isMappedToRDBMSActivity.altersRDBMSTable))))",
			 "correctlyMatchingRCManagerCRUDActivitiesWithRDBMSActivities", "self.hasResourceControllerManager.rCManagerHasCRUDActivity->forAll(rCManagerCRUDActivityA | self.hasDatabaseController.hasRDBMSActivity->forAll(rdbmsActivityA | (rCManagerCRUDActivityA.isMappedToRDBMSActivity = rdbmsActivityA) implies (self.hasResourceControllerManager->one(rCManagerHasCRUDActivity = rCManagerCRUDActivityA and hasAssociatedRMManager.hasRelatedModel.isMappedToRDBMSTable = rCManagerCRUDActivityA.isMappedToRDBMSActivity.altersRDBMSTable))))",
			 "rCManagerCreateActivityAddsReadHypermediaLinkToRRController", "\n\t\tself.hasResourceControllerManager->forAll(rCManagerA | \n\t\tself.hasResourceController->forAll( rControllerA | \n\t\t\t(\n\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies \n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and  hasTargetRController = rControllerA)\n\t\t\t)\n\t\t    and \n\t\t\t(\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and  hasTargetRController = rControllerA)\n\t\t\t\timplies\n\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t)\n\t\t))",
			 "rCManagerCreateActivityAddsUpdateHypermediaLinkToRRController", "\n\t\tself.hasResourceControllerManager->forAll(rCManagerA | \n\t\tself.hasResourceController->forAll( rControllerA | \n\t\t\t(\n\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies \n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Child\' and  hasTargetRController = rControllerA)\n\t\t\t)\n\t\t    and \n\t\t\t(\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Child\' and  hasTargetRController = rControllerA)\n\t\t\t\timplies\n\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t)\n\t\t))",
			 "rCManagerCreateActivityAddsDeleteHypermediaLinkToRRController", "\n\t\tself.hasResourceControllerManager->forAll(rCManagerA | \n\t\tself.hasResourceController->forAll( rControllerA | \n\t\t\t(\n\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n\t\t\t\timplies \n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Child\' and  hasTargetRController = rControllerA)\n\t\t\t)\n\t\t    and \n\t\t\t(\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Child\' and  hasTargetRController = rControllerA)\n\t\t\t\timplies\n\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n\t\t\t)\n\t\t))",
			 "rCManagerReadActivityAddsReadHypermediaLinkToRRController", "\n\t\tself.hasResourceControllerManager->forAll(rCManagerA | \n\t\tself.hasResourceController->forAll( rControllerA | \n\t\t\t(\n\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies  \n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and  hasTargetRController = rControllerA)\n\t\t\t)\n\t\t    and \n\t\t\t(\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and  hasTargetRController = rControllerA)\n\t\t\t\timplies\n\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t)\n\t\t))",
			 "rCManagerReadActivityAddsUpdateHypermediaLinkToRRController", "\n\t\tself.hasResourceControllerManager->forAll(rCManagerA | \n\t\tself.hasResourceController->forAll( rControllerA | \n\t\t\t(\n\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies \n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Child\' and  hasTargetRController = rControllerA)\n\t\t\t)\n\t\t    and \n\t\t\t(\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Child\' and  hasTargetRController = rControllerA)\n\t\t\t\timplies\n\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t)\n\t\t))",
			 "rCManagerReadActivityAddsDeleteHypermediaLinkToRRController", "\n\t\tself.hasResourceControllerManager->forAll(rCManagerA | \n\t\tself.hasResourceController->forAll( rControllerA | \n\t\t\t(\n\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n\t\t\t\timplies \n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Child\' and  hasTargetRController = rControllerA)\n\t\t\t)\n\t\t    and \n\t\t\t(\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Child\' and  hasTargetRController = rControllerA)\n\t\t\t\timplies\n\t\t\t\t(rCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n\t\t\t)\n\t\t))",
			 "rCManagerCreateActivityAddsReadHypermediaLinkToParentRController", "\n\t\tself.hasResourceControllerManager->forAll(rCManagerA |\n\t\tself.hasResourceController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\timplies\n\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t)\n\t\t))",
			 "rCManagerCreateActivityAddsUpdateHypermediaLinkToParentRController", "\n\t\tself.hasResourceControllerManager->forAll(rCManagerA |\n\t\tself.hasResourceController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\timplies\n\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t)\n\t\t))",
			 "rCManagerCreateActivityAddsDeleteHypermediaLinkToParentRController", "\n\t\tself.hasResourceControllerManager->forAll(rCManagerA |\n\t\tself.hasResourceController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n\t\t\t\timplies\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\timplies\n\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n\t\t\t)\n\t\t))",
			 "rCManagerReadActivityAddsReadHypermediaLinkToParentRController", "\n\t\tself.hasResourceControllerManager->forAll(rCManagerA |\n\t\tself.hasResourceController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\timplies\n\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t)\n\t\t))",
			 "rCManagerReadActivityAddsUpdateHypermediaLinkToParentRController", "\n\t\tself.hasResourceControllerManager->forAll(rCManagerA |\n\t\tself.hasResourceController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\timplies\n\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t)\n\t\t))",
			 "rCManagerReadActivityAddsDeleteHypermediaLinkToParentRController", "\n\t\tself.hasResourceControllerManager->forAll(rCManagerA |\n\t\tself.hasResourceController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n\t\t\t\timplies\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trCManagerA.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\timplies\n\t\t\t\t(rControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager) and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n\t\t\t)\n\t\t))",
			 "rControllerReadActivityAddsCreateHypermediaLinkToRCManager", "\n\t\tself.hasResourceController->forAll( rControllerA |\n\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n\t\t\t(\n\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Child\' and hasTargetRCManager = rCManagerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Child\' and hasTargetRCManager = rCManagerA)\n\t\t\t\timplies\n\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t)\n\t\t))",
			 "rControllerReadActivityAddsReadHypermediaLinkToRCManager", "\n\t\tself.hasResourceController->forAll( rControllerA |\n\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n\t\t\t(\n\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and hasTargetRCManager = rCManagerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and hasTargetRCManager = rCManagerA)\n\t\t\t\timplies\n\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t)\n\t\t))",
			 "rControllerUpdateActivityAddsCreateHypermediaLinkToRCManager", "\n\t\tself.hasResourceController->forAll( rControllerA |\n\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n\t\t\t(\n\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Child\' and hasTargetRCManager = rCManagerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Child\' and hasTargetRCManager = rCManagerA)\n\t\t\t\timplies\n\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t)\n\t\t))",
			 "rControllerUpdateActivityAddsReadHypermediaLinkToRCManager", "\n\t\tself.hasResourceController->forAll( rControllerA |\n\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n\t\t\t(\n\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and hasTargetRCManager = rCManagerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and hasTargetRCManager = rCManagerA)\n\t\t\t\timplies\n\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedModelManager = rCManagerA.hasAssociatedRMManager and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t)\n\t\t))",
			 "rControllerReadActivityAddsCreateHypermediaLinkToParentRCManager", "\n\t\tself.hasResourceController->forAll( rControllerA |\n\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n\t\t\t(\n\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Parent\' and hasTargetRCManager = rCManagerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Parent\' and hasTargetRCManager = rCManagerA)\n\t\t\t\timplies\n\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\t\t\t\t\t\t\n\t\t\t)\n\t\t))",
			 "rControllerReadActivityAddsReadHypermediaLinkToParentRCManager", "\n\t\tself.hasResourceController->forAll( rControllerA |\n\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n\t\t\t(\n\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRCManager = rCManagerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRCManager = rCManagerA)\n\t\t\t\timplies\n\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1)\t\t\t\t\t\t\n\t\t\t)\n\t\t))",
			 "rControllerUpdateActivityAddsCreateHypermediaLinkToParentRCManager", "\n\t\tself.hasResourceController->forAll( rControllerA |\n\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n\t\t\t(\n\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Parent\' and hasTargetRCManager = rCManagerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Parent\' and hasTargetRCManager = rCManagerA)\n\t\t\t\timplies\n\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\t\t\t\t\t\t\n\t\t\t)\n\t\t))",
			 "rControllerUpdateActivityAddsReadHypermediaLinkToParentRCManager", "\n\t\tself.hasResourceController->forAll( rControllerA |\n\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n\t\t\t(\n\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRCManager = rCManagerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRCManager = rCManagerA)\n\t\t\t\timplies\n\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2)\t\t\t\t\t\t\n\t\t\t)\n\t\t))",
			 "rControllerDeleteActivityAddsCreateHypermediaLinkToParentRCManager", "\n\t\tself.hasResourceController->forAll( rControllerA |\n\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n\t\t\t(\n\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n\t\t\t\timplies\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 3).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Parent\' and hasTargetRCManager = rCManagerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 3).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Parent\' and hasTargetRCManager = rCManagerA)\n\t\t\t\timplies\n\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\t\t\t\t\t\t\n\t\t\t)\n\t\t))",
			 "rControllerDeleteActivityAddsReadHypermediaLinkToParentRCManager", "\n\t\tself.hasResourceController->forAll( rControllerA |\n\t\tself.hasResourceControllerManager->forAll( rCManagerA |\n\t\t\t(\n\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\n\t\t\t\timplies\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 3).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRCManager = rCManagerA)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 3).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRCManager = rCManagerA)\n\t\t\t\timplies\n\t\t\t\trCManagerA.hasAssociatedRMManager.hasRelatedModel = rControllerA.hasAssociatedRModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3)\t\t\t\t\t\t\n\t\t\t)\n\t\t))",
			 "algoControllerActivityAddsHypermediaLinkToRAlgoController", "\n\t\tself.hasAlgoResourceController->forAll(algoControllerA, algoControllerB |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Child\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Child\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Child\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Child\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists( crudVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t)",
			 "algoControllerAddsHypermediaLinkToParentAlgoController", "\n\t\tself.hasAlgoResourceController->forAll(algoControllerA, algoControllerB |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Parent\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Parent\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Parent\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Parent\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerB.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t)",
			 "rControllerReadAddsHypermediaLinkToRAlgoController", "\n\t\tself.hasAlgoResourceController->forAll(algoControllerA |\n\t\tself.hasResourceController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Child\' and hasTargetAlgoController = algoControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Child\' and hasTargetAlgoController = algoControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and hasTargetAlgoController = algoControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and hasTargetAlgoController = algoControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t\n\t\t))",
			 "rControllerUpdateAddsHypermediaLinkToRAlgoController", "\n\t\tself.hasAlgoResourceController->forAll(algoControllerA |\n\t\tself.hasResourceController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Child\' and hasTargetAlgoController = algoControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Child\' and hasTargetAlgoController = algoControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and hasTargetAlgoController = algoControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\trControllerA.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Child\' and hasTargetAlgoController = algoControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t\n\t\t))",
			 "algoControllerAddsReadHypermediaLinkToParentRController", "\n\t\tself.hasAlgoResourceController->forAll(algoControllerA |\n\t\tself.hasResourceController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 1) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t))",
			 "algoControllerAddsUpdateHypermediaLinkToParentRController", "\n\t\tself.hasAlgoResourceController->forAll(algoControllerA |\n\t\tself.hasResourceController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 2) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t))",
			 "algoControllerAddsDeleteHypermediaLinkToParentRController", "\n\t\tself.hasAlgoResourceController->forAll(algoControllerA |\n\t\tself.hasResourceController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Parent\' and hasTargetRController = rControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedRModel.hasRelatedAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.rControllerHasCRUDActivity->exists(crudVerb = 3) and algoControllerA.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t))"
		   });
	}

} //RESTServicePIMPackageImpl
