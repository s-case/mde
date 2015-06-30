/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDBMS Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.RDBMSActivity#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.RDBMSActivity#getRdbmsVerb <em>Rdbms Verb</em>}</li>
 *   <li>{@link ServicePIM.RDBMSActivity#getAltersRDBMSTable <em>Alters RDBMS Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getRDBMSActivity()
 * @model
 * @generated
 */
public interface RDBMSActivity extends EObject {
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
	 * @see ServicePIM.RESTServicePIMPackage#getRDBMSActivity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.RDBMSActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rdbms Verb</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePIM.RDBMSVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdbms Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdbms Verb</em>' attribute.
	 * @see ServicePIM.RDBMSVerb
	 * @see #setRdbmsVerb(RDBMSVerb)
	 * @see ServicePIM.RESTServicePIMPackage#getRDBMSActivity_RdbmsVerb()
	 * @model required="true"
	 * @generated
	 */
	RDBMSVerb getRdbmsVerb();

	/**
	 * Sets the value of the '{@link ServicePIM.RDBMSActivity#getRdbmsVerb <em>Rdbms Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdbms Verb</em>' attribute.
	 * @see ServicePIM.RDBMSVerb
	 * @see #getRdbmsVerb()
	 * @generated
	 */
	void setRdbmsVerb(RDBMSVerb value);

	/**
	 * Returns the value of the '<em><b>Alters RDBMS Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alters RDBMS Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alters RDBMS Table</em>' reference.
	 * @see #setAltersRDBMSTable(RDBMSTable)
	 * @see ServicePIM.RESTServicePIMPackage#getRDBMSActivity_AltersRDBMSTable()
	 * @model required="true"
	 * @generated
	 */
	RDBMSTable getAltersRDBMSTable();

	/**
	 * Sets the value of the '{@link ServicePIM.RDBMSActivity#getAltersRDBMSTable <em>Alters RDBMS Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alters RDBMS Table</em>' reference.
	 * @see #getAltersRDBMSTable()
	 * @generated
	 */
	void setAltersRDBMSTable(RDBMSTable value);

} // RDBMSActivity
