/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ServicePIM.RESTServicePIMPackage
 * @generated
 */
public interface RESTServicePIMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RESTServicePIMFactory eINSTANCE = ServicePIM.impl.RESTServicePIMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algo Resource Model</em>'.
	 * @generated
	 */
	AlgoResourceModel createAlgoResourceModel();

	/**
	 * Returns a new object of class '<em>Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algo Resource Controller</em>'.
	 * @generated
	 */
	AlgoResourceController createAlgoResourceController();

	/**
	 * Returns a new object of class '<em>Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Model Manager</em>'.
	 * @generated
	 */
	ResourceModelManager createResourceModelManager();

	/**
	 * Returns a new object of class '<em>Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Model</em>'.
	 * @generated
	 */
	ResourceModel createResourceModel();

	/**
	 * Returns a new object of class '<em>Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Controller Manager</em>'.
	 * @generated
	 */
	ResourceControllerManager createResourceControllerManager();

	/**
	 * Returns a new object of class '<em>Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Controller</em>'.
	 * @generated
	 */
	ResourceController createResourceController();

	/**
	 * Returns a new object of class '<em>PIM Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PIM Component Property</em>'.
	 * @generated
	 */
	PIMComponentProperty createPIMComponentProperty();

	/**
	 * Returns a new object of class '<em>Representation Parse Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation Parse Function</em>'.
	 * @generated
	 */
	RepresentationParseFunction createRepresentationParseFunction();

	/**
	 * Returns a new object of class '<em>Representation Marshalling Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation Marshalling Function</em>'.
	 * @generated
	 */
	RepresentationMarshallingFunction createRepresentationMarshallingFunction();

	/**
	 * Returns a new object of class '<em>Resource Input Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Input Representation</em>'.
	 * @generated
	 */
	ResourceInputRepresentation createResourceInputRepresentation();

	/**
	 * Returns a new object of class '<em>Resource Output Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Output Representation</em>'.
	 * @generated
	 */
	ResourceOutputRepresentation createResourceOutputRepresentation();

	/**
	 * Returns a new object of class '<em>Resource Controller CRUD Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Controller CRUD Activity</em>'.
	 * @generated
	 */
	ResourceControllerCRUDActivity createResourceControllerCRUDActivity();

	/**
	 * Returns a new object of class '<em>Setter Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setter Function</em>'.
	 * @generated
	 */
	SetterFunction createSetterFunction();

	/**
	 * Returns a new object of class '<em>Getter Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Getter Function</em>'.
	 * @generated
	 */
	GetterFunction createGetterFunction();

	/**
	 * Returns a new object of class '<em>Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Parameter</em>'.
	 * @generated
	 */
	FunctionParameter createFunctionParameter();

	/**
	 * Returns a new object of class '<em>CRUD Activity Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CRUD Activity Handler</em>'.
	 * @generated
	 */
	CRUDActivityHandler createCRUDActivityHandler();

	/**
	 * Returns a new object of class '<em>Create Hypermedia PIM Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Hypermedia PIM Function</em>'.
	 * @generated
	 */
	CreateHypermediaPIMFunction createCreateHypermediaPIMFunction();

	/**
	 * Returns a new object of class '<em>Database Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Controller</em>'.
	 * @generated
	 */
	DatabaseController createDatabaseController();

	/**
	 * Returns a new object of class '<em>RDBMS Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDBMS Activity</em>'.
	 * @generated
	 */
	RDBMSActivity createRDBMSActivity();

	/**
	 * Returns a new object of class '<em>RDBMS Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDBMS Table</em>'.
	 * @generated
	 */
	RDBMSTable createRDBMSTable();

	/**
	 * Returns a new object of class '<em>RDBMS Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDBMS Table Column</em>'.
	 * @generated
	 */
	RDBMSTableColumn createRDBMSTableColumn();

	/**
	 * Returns a new object of class '<em>Hypermedia Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hypermedia Link</em>'.
	 * @generated
	 */
	HypermediaLink createHypermediaLink();

	/**
	 * Returns a new object of class '<em>PIM Component Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PIM Component Function</em>'.
	 * @generated
	 */
	PIMComponentFunction createPIMComponentFunction();

	/**
	 * Returns a new object of class '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RES Tful Service PIM</em>'.
	 * @generated
	 */
	RESTfulServicePIM createRESTfulServicePIM();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RESTServicePIMPackage getRESTServicePIMPackage();

} //RESTServicePIMFactory
