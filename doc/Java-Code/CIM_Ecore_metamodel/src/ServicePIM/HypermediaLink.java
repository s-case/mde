/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypermedia Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.HypermediaLink#getLinkCRUDVerb <em>Link CRUD Verb</em>}</li>
 *   <li>{@link ServicePIM.HypermediaLink#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link ServicePIM.HypermediaLink#getHasTargetAlgoController <em>Has Target Algo Controller</em>}</li>
 *   <li>{@link ServicePIM.HypermediaLink#getHasTargetRCManager <em>Has Target RC Manager</em>}</li>
 *   <li>{@link ServicePIM.HypermediaLink#getHasTargetRController <em>Has Target RController</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getHypermediaLink()
 * @model
 * @generated
 */
public interface HypermediaLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Link CRUD Verb</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePIM.CRUDVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link CRUD Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link CRUD Verb</em>' attribute.
	 * @see ServicePIM.CRUDVerb
	 * @see #setLinkCRUDVerb(CRUDVerb)
	 * @see ServicePIM.RESTServicePIMPackage#getHypermediaLink_LinkCRUDVerb()
	 * @model required="true"
	 * @generated
	 */
	CRUDVerb getLinkCRUDVerb();

	/**
	 * Sets the value of the '{@link ServicePIM.HypermediaLink#getLinkCRUDVerb <em>Link CRUD Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link CRUD Verb</em>' attribute.
	 * @see ServicePIM.CRUDVerb
	 * @see #getLinkCRUDVerb()
	 * @generated
	 */
	void setLinkCRUDVerb(CRUDVerb value);

	/**
	 * Returns the value of the '<em><b>Link Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePIM.LinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Type</em>' attribute.
	 * @see ServicePIM.LinkType
	 * @see #setLinkType(LinkType)
	 * @see ServicePIM.RESTServicePIMPackage#getHypermediaLink_LinkType()
	 * @model required="true"
	 * @generated
	 */
	LinkType getLinkType();

	/**
	 * Sets the value of the '{@link ServicePIM.HypermediaLink#getLinkType <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type</em>' attribute.
	 * @see ServicePIM.LinkType
	 * @see #getLinkType()
	 * @generated
	 */
	void setLinkType(LinkType value);

	/**
	 * Returns the value of the '<em><b>Has Target Algo Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Target Algo Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Target Algo Controller</em>' reference.
	 * @see #setHasTargetAlgoController(AlgoResourceController)
	 * @see ServicePIM.RESTServicePIMPackage#getHypermediaLink_HasTargetAlgoController()
	 * @model
	 * @generated
	 */
	AlgoResourceController getHasTargetAlgoController();

	/**
	 * Sets the value of the '{@link ServicePIM.HypermediaLink#getHasTargetAlgoController <em>Has Target Algo Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Target Algo Controller</em>' reference.
	 * @see #getHasTargetAlgoController()
	 * @generated
	 */
	void setHasTargetAlgoController(AlgoResourceController value);

	/**
	 * Returns the value of the '<em><b>Has Target RC Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Target RC Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Target RC Manager</em>' reference.
	 * @see #setHasTargetRCManager(ResourceControllerManager)
	 * @see ServicePIM.RESTServicePIMPackage#getHypermediaLink_HasTargetRCManager()
	 * @model
	 * @generated
	 */
	ResourceControllerManager getHasTargetRCManager();

	/**
	 * Sets the value of the '{@link ServicePIM.HypermediaLink#getHasTargetRCManager <em>Has Target RC Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Target RC Manager</em>' reference.
	 * @see #getHasTargetRCManager()
	 * @generated
	 */
	void setHasTargetRCManager(ResourceControllerManager value);

	/**
	 * Returns the value of the '<em><b>Has Target RController</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Target RController</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Target RController</em>' reference.
	 * @see #setHasTargetRController(ResourceController)
	 * @see ServicePIM.RESTServicePIMPackage#getHypermediaLink_HasTargetRController()
	 * @model
	 * @generated
	 */
	ResourceController getHasTargetRController();

	/**
	 * Sets the value of the '{@link ServicePIM.HypermediaLink#getHasTargetRController <em>Has Target RController</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Target RController</em>' reference.
	 * @see #getHasTargetRController()
	 * @generated
	 */
	void setHasTargetRController(ResourceController value);

} // HypermediaLink
