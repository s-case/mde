/**
 */
package ServicePIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PIM Component Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.PIMComponentFunction#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.PIMComponentFunction#getHasFunctionParameter <em>Has Function Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getPIMComponentFunction()
 * @model
 * @generated
 */
public interface PIMComponentFunction extends EObject {
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
	 * @see ServicePIM.RESTServicePIMPackage#getPIMComponentFunction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.PIMComponentFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Function Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.FunctionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Function Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Function Parameter</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getPIMComponentFunction_HasFunctionParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionParameter> getHasFunctionParameter();

} // PIMComponentFunction
