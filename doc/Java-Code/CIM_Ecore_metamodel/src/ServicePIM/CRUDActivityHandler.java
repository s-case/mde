/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CRUD Activity Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.CRUDActivityHandler#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.CRUDActivityHandler#getCrudVerb <em>Crud Verb</em>}</li>
 *   <li>{@link ServicePIM.CRUDActivityHandler#getHasHypermediaFunction <em>Has Hypermedia Function</em>}</li>
 *   <li>{@link ServicePIM.CRUDActivityHandler#getUsesDBController <em>Uses DB Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getCRUDActivityHandler()
 * @model
 * @generated
 */
public interface CRUDActivityHandler extends EObject {
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
	 * @see ServicePIM.RESTServicePIMPackage#getCRUDActivityHandler_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.CRUDActivityHandler#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see ServicePIM.RESTServicePIMPackage#getCRUDActivityHandler_CrudVerb()
	 * @model required="true"
	 * @generated
	 */
	CRUDVerb getCrudVerb();

	/**
	 * Sets the value of the '{@link ServicePIM.CRUDActivityHandler#getCrudVerb <em>Crud Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crud Verb</em>' attribute.
	 * @see ServicePIM.CRUDVerb
	 * @see #getCrudVerb()
	 * @generated
	 */
	void setCrudVerb(CRUDVerb value);

	/**
	 * Returns the value of the '<em><b>Has Hypermedia Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Hypermedia Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Hypermedia Function</em>' containment reference.
	 * @see #setHasHypermediaFunction(CreateHypermediaPIMFunction)
	 * @see ServicePIM.RESTServicePIMPackage#getCRUDActivityHandler_HasHypermediaFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CreateHypermediaPIMFunction getHasHypermediaFunction();

	/**
	 * Sets the value of the '{@link ServicePIM.CRUDActivityHandler#getHasHypermediaFunction <em>Has Hypermedia Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Hypermedia Function</em>' containment reference.
	 * @see #getHasHypermediaFunction()
	 * @generated
	 */
	void setHasHypermediaFunction(CreateHypermediaPIMFunction value);

	/**
	 * Returns the value of the '<em><b>Uses DB Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses DB Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses DB Controller</em>' reference.
	 * @see #setUsesDBController(DatabaseController)
	 * @see ServicePIM.RESTServicePIMPackage#getCRUDActivityHandler_UsesDBController()
	 * @model required="true"
	 * @generated
	 */
	DatabaseController getUsesDBController();

	/**
	 * Sets the value of the '{@link ServicePIM.CRUDActivityHandler#getUsesDBController <em>Uses DB Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses DB Controller</em>' reference.
	 * @see #getUsesDBController()
	 * @generated
	 */
	void setUsesDBController(DatabaseController value);

} // CRUDActivityHandler
