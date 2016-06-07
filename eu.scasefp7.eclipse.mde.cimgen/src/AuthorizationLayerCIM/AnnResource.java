/**
 */
package AuthorizationLayerCIM;

import ServiceCIM.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ann Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerCIM.AnnResource#getAnnotatesResource <em>Annotates Resource</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAnnResource()
 * @model
 * @generated
 */
public interface AnnResource extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Annotates Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotates Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotates Resource</em>' reference.
	 * @see #setAnnotatesResource(Resource)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAnnResource_AnnotatesResource()
	 * @model required="true"
	 * @generated
	 */
	Resource getAnnotatesResource();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.AnnResource#getAnnotatesResource <em>Annotates Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates Resource</em>' reference.
	 * @see #getAnnotatesResource()
	 * @generated
	 */
	void setAnnotatesResource(Resource value);

} // AnnResource
