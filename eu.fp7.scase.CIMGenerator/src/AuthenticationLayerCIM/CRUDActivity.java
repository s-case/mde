/**
 */
package AuthenticationLayerCIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CRUD Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AuthenticationLayerCIM.CRUDActivity#getParentResourceName <em>Parent Resource Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getCRUDActivity()
 * @model
 * @generated
 */
public interface CRUDActivity extends AnnotatedElement {

	/**
	 * Returns the value of the '<em><b>Parent Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Resource Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Resource Name</em>' attribute.
	 * @see #setParentResourceName(String)
	 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getCRUDActivity_ParentResourceName()
	 * @model required="true"
	 * @generated
	 */
	String getParentResourceName();

	/**
	 * Sets the value of the '{@link AuthenticationLayerCIM.CRUDActivity#getParentResourceName <em>Parent Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Resource Name</em>' attribute.
	 * @see #getParentResourceName()
	 * @generated
	 */
	void setParentResourceName(String value);
} // CRUDActivity
