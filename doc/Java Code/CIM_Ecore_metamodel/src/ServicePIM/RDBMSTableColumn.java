/**
 */
package ServicePIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDBMS Table Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.RDBMSTableColumn#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.RDBMSTableColumn#getType <em>Type</em>}</li>
 *   <li>{@link ServicePIM.RDBMSTableColumn#isIsForeignKey <em>Is Foreign Key</em>}</li>
 *   <li>{@link ServicePIM.RDBMSTableColumn#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link ServicePIM.RDBMSTableColumn#getReferencesRDBMSTable <em>References RDBMS Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getRDBMSTableColumn()
 * @model
 * @generated
 */
public interface RDBMSTableColumn extends EObject {
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
	 * @see ServicePIM.RESTServicePIMPackage#getRDBMSTableColumn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.RDBMSTableColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ServicePIM.RESTServicePIMPackage#getRDBMSTableColumn_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ServicePIM.RDBMSTableColumn#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Is Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Foreign Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Foreign Key</em>' attribute.
	 * @see #setIsForeignKey(boolean)
	 * @see ServicePIM.RESTServicePIMPackage#getRDBMSTableColumn_IsForeignKey()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsForeignKey();

	/**
	 * Sets the value of the '{@link ServicePIM.RDBMSTableColumn#isIsForeignKey <em>Is Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Foreign Key</em>' attribute.
	 * @see #isIsForeignKey()
	 * @generated
	 */
	void setIsForeignKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary Key</em>' attribute.
	 * @see #setIsPrimaryKey(boolean)
	 * @see ServicePIM.RESTServicePIMPackage#getRDBMSTableColumn_IsPrimaryKey()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPrimaryKey();

	/**
	 * Sets the value of the '{@link ServicePIM.RDBMSTableColumn#isIsPrimaryKey <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary Key</em>' attribute.
	 * @see #isIsPrimaryKey()
	 * @generated
	 */
	void setIsPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>References RDBMS Table</b></em>' reference list.
	 * The list contents are of type {@link ServicePIM.RDBMSTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References RDBMS Table</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References RDBMS Table</em>' reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getRDBMSTableColumn_ReferencesRDBMSTable()
	 * @model
	 * @generated
	 */
	EList<RDBMSTable> getReferencesRDBMSTable();

} // RDBMSTableColumn
