/**
 */
package ServicePSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePSM.JavaFunction#getHasFunctionParameter <em>Has Function Parameter</em>}</li>
 *   <li>{@link ServicePSM.JavaFunction#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePSM.RESTfulServicePSMPackage#getJavaFunction()
 * @model
 * @generated
 */
public interface JavaFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Function Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePSM.FunctionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Function Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Function Parameter</em>' containment reference list.
	 * @see ServicePSM.RESTfulServicePSMPackage#getJavaFunction_HasFunctionParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionParameter> getHasFunctionParameter();

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
	 * @see ServicePSM.RESTfulServicePSMPackage#getJavaFunction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePSM.JavaFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // JavaFunction
