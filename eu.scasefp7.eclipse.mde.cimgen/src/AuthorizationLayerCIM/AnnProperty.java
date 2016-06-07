/**
 */
package AuthorizationLayerCIM;

import ServiceCIM.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ann Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerCIM.AnnProperty#getAnnotatesProperty <em>Annotates Property</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAnnProperty()
 * @model
 * @generated
 */
public interface AnnProperty extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Annotates Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotates Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotates Property</em>' reference.
	 * @see #setAnnotatesProperty(Property)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAnnProperty_AnnotatesProperty()
	 * @model required="true"
	 * @generated
	 */
	Property getAnnotatesProperty();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.AnnProperty#getAnnotatesProperty <em>Annotates Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates Property</em>' reference.
	 * @see #getAnnotatesProperty()
	 * @generated
	 */
	void setAnnotatesProperty(Property value);

} // AnnProperty
