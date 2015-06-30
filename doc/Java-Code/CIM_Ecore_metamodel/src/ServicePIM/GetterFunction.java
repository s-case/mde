/**
 */
package ServicePIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Getter Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.GetterFunction#getGetsProperty <em>Gets Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getGetterFunction()
 * @model
 * @generated
 */
public interface GetterFunction extends PIMComponentFunction {
	/**
	 * Returns the value of the '<em><b>Gets Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gets Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gets Property</em>' reference.
	 * @see #setGetsProperty(PIMComponentProperty)
	 * @see ServicePIM.RESTServicePIMPackage#getGetterFunction_GetsProperty()
	 * @model required="true"
	 * @generated
	 */
	PIMComponentProperty getGetsProperty();

	/**
	 * Sets the value of the '{@link ServicePIM.GetterFunction#getGetsProperty <em>Gets Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gets Property</em>' reference.
	 * @see #getGetsProperty()
	 * @generated
	 */
	void setGetsProperty(PIMComponentProperty value);

} // GetterFunction
