/**
 */
package ServicePIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.DatabaseController#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.DatabaseController#getHasRDBMSActivity <em>Has RDBMS Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getDatabaseController()
 * @model
 * @generated
 */
public interface DatabaseController extends EObject {
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
	 * @see ServicePIM.RESTServicePIMPackage#getDatabaseController_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.DatabaseController#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has RDBMS Activity</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.RDBMSActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has RDBMS Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has RDBMS Activity</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getDatabaseController_HasRDBMSActivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RDBMSActivity> getHasRDBMSActivity();

} // DatabaseController
