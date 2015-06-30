/**
 */
package ServicePIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDBMS Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.RDBMSTable#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.RDBMSTable#getHasRDBMSColumns <em>Has RDBMS Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getRDBMSTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniquePrimaryKey'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniquePrimaryKey='self.hasRDBMSColumns->one(isPrimaryKey = true)'"
 * @generated
 */
public interface RDBMSTable extends EObject {
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
	 * @see ServicePIM.RESTServicePIMPackage#getRDBMSTable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.RDBMSTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has RDBMS Columns</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.RDBMSTableColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has RDBMS Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has RDBMS Columns</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getRDBMSTable_HasRDBMSColumns()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<RDBMSTableColumn> getHasRDBMSColumns();

} // RDBMSTable
