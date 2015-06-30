/**
 */
package ServicePIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setter Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.SetterFunction#getSetsProperty <em>Sets Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getSetterFunction()
 * @model
 * @generated
 */
public interface SetterFunction extends PIMComponentFunction {
	/**
	 * Returns the value of the '<em><b>Sets Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sets Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets Property</em>' reference.
	 * @see #setSetsProperty(PIMComponentProperty)
	 * @see ServicePIM.RESTServicePIMPackage#getSetterFunction_SetsProperty()
	 * @model required="true"
	 * @generated
	 */
	PIMComponentProperty getSetsProperty();

	/**
	 * Sets the value of the '{@link ServicePIM.SetterFunction#getSetsProperty <em>Sets Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sets Property</em>' reference.
	 * @see #getSetsProperty()
	 * @generated
	 */
	void setSetsProperty(PIMComponentProperty value);

} // SetterFunction
