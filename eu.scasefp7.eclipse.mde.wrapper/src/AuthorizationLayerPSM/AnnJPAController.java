/**
 */
package AuthorizationLayerPSM;

import RESTfulServicePSM.HibernateController;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ann JPA Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.AnnJPAController#getAnnotatesJPAController <em>Annotates JPA Controller</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAnnJPAController()
 * @model
 * @generated
 */
public interface AnnJPAController extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Annotates JPA Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotates JPA Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotates JPA Controller</em>' reference.
	 * @see #setAnnotatesJPAController(HibernateController)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAnnJPAController_AnnotatesJPAController()
	 * @model
	 * @generated
	 */
	HibernateController getAnnotatesJPAController();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AnnJPAController#getAnnotatesJPAController <em>Annotates JPA Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates JPA Controller</em>' reference.
	 * @see #getAnnotatesJPAController()
	 * @generated
	 */
	void setAnnotatesJPAController(HibernateController value);

} // AnnJPAController
