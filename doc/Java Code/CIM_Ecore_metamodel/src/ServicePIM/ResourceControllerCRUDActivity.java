/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Controller CRUD Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.ResourceControllerCRUDActivity#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.ResourceControllerCRUDActivity#getActivityURI <em>Activity URI</em>}</li>
 *   <li>{@link ServicePIM.ResourceControllerCRUDActivity#getCrudVerb <em>Crud Verb</em>}</li>
 *   <li>{@link ServicePIM.ResourceControllerCRUDActivity#getHasCRUDActivityHandler <em>Has CRUD Activity Handler</em>}</li>
 *   <li>{@link ServicePIM.ResourceControllerCRUDActivity#getIsMappedToRDBMSActivity <em>Is Mapped To RDBMS Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getResourceControllerCRUDActivity()
 * @model
 * @generated
 */
public interface ResourceControllerCRUDActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceControllerCRUDActivity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceControllerCRUDActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Activity URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity URI</em>' attribute.
	 * @see #setActivityURI(String)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceControllerCRUDActivity_ActivityURI()
	 * @model required="true"
	 * @generated
	 */
	String getActivityURI();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceControllerCRUDActivity#getActivityURI <em>Activity URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity URI</em>' attribute.
	 * @see #getActivityURI()
	 * @generated
	 */
	void setActivityURI(String value);

	/**
	 * Returns the value of the '<em><b>Crud Verb</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePIM.CRUDVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crud Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crud Verb</em>' attribute.
	 * @see ServicePIM.CRUDVerb
	 * @see #setCrudVerb(CRUDVerb)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceControllerCRUDActivity_CrudVerb()
	 * @model required="true"
	 * @generated
	 */
	CRUDVerb getCrudVerb();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceControllerCRUDActivity#getCrudVerb <em>Crud Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crud Verb</em>' attribute.
	 * @see ServicePIM.CRUDVerb
	 * @see #getCrudVerb()
	 * @generated
	 */
	void setCrudVerb(CRUDVerb value);

	/**
	 * Returns the value of the '<em><b>Has CRUD Activity Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has CRUD Activity Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has CRUD Activity Handler</em>' containment reference.
	 * @see #setHasCRUDActivityHandler(CRUDActivityHandler)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceControllerCRUDActivity_HasCRUDActivityHandler()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CRUDActivityHandler getHasCRUDActivityHandler();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceControllerCRUDActivity#getHasCRUDActivityHandler <em>Has CRUD Activity Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has CRUD Activity Handler</em>' containment reference.
	 * @see #getHasCRUDActivityHandler()
	 * @generated
	 */
	void setHasCRUDActivityHandler(CRUDActivityHandler value);

	/**
	 * Returns the value of the '<em><b>Is Mapped To RDBMS Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mapped To RDBMS Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mapped To RDBMS Activity</em>' reference.
	 * @see #setIsMappedToRDBMSActivity(RDBMSActivity)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceControllerCRUDActivity_IsMappedToRDBMSActivity()
	 * @model
	 * @generated
	 */
	RDBMSActivity getIsMappedToRDBMSActivity();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceControllerCRUDActivity#getIsMappedToRDBMSActivity <em>Is Mapped To RDBMS Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mapped To RDBMS Activity</em>' reference.
	 * @see #getIsMappedToRDBMSActivity()
	 * @generated
	 */
	void setIsMappedToRDBMSActivity(RDBMSActivity value);

} // ResourceControllerCRUDActivity
