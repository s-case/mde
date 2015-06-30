/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PIM Component Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.PIMComponentProperty#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.PIMComponentProperty#getType <em>Type</em>}</li>
 *   <li>{@link ServicePIM.PIMComponentProperty#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link ServicePIM.PIMComponentProperty#isIsNamingProperty <em>Is Naming Property</em>}</li>
 *   <li>{@link ServicePIM.PIMComponentProperty#isIsPrimaryIdentifier <em>Is Primary Identifier</em>}</li>
 *   <li>{@link ServicePIM.PIMComponentProperty#getIsMappedToRDBMSColumn <em>Is Mapped To RDBMS Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getPIMComponentProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='primaryIdentifierMapsToPrimaryKey'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot primaryIdentifierMapsToPrimaryKey='(self.isPrimaryIdentifier = true) implies (self.isMappedToRDBMSColumn.isPrimaryKey = true)'"
 * @generated
 */
public interface PIMComponentProperty extends EObject {
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
	 * @see ServicePIM.RESTServicePIMPackage#getPIMComponentProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.PIMComponentProperty#getName <em>Name</em>}' attribute.
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
	 * @see ServicePIM.RESTServicePIMPackage#getPIMComponentProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ServicePIM.PIMComponentProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see ServicePIM.RESTServicePIMPackage#getPIMComponentProperty_IsUnique()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link ServicePIM.PIMComponentProperty#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Naming Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Naming Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Naming Property</em>' attribute.
	 * @see #setIsNamingProperty(boolean)
	 * @see ServicePIM.RESTServicePIMPackage#getPIMComponentProperty_IsNamingProperty()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsNamingProperty();

	/**
	 * Sets the value of the '{@link ServicePIM.PIMComponentProperty#isIsNamingProperty <em>Is Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Naming Property</em>' attribute.
	 * @see #isIsNamingProperty()
	 * @generated
	 */
	void setIsNamingProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Primary Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Primary Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary Identifier</em>' attribute.
	 * @see #setIsPrimaryIdentifier(boolean)
	 * @see ServicePIM.RESTServicePIMPackage#getPIMComponentProperty_IsPrimaryIdentifier()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPrimaryIdentifier();

	/**
	 * Sets the value of the '{@link ServicePIM.PIMComponentProperty#isIsPrimaryIdentifier <em>Is Primary Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary Identifier</em>' attribute.
	 * @see #isIsPrimaryIdentifier()
	 * @generated
	 */
	void setIsPrimaryIdentifier(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Mapped To RDBMS Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mapped To RDBMS Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mapped To RDBMS Column</em>' reference.
	 * @see #setIsMappedToRDBMSColumn(RDBMSTableColumn)
	 * @see ServicePIM.RESTServicePIMPackage#getPIMComponentProperty_IsMappedToRDBMSColumn()
	 * @model
	 * @generated
	 */
	RDBMSTableColumn getIsMappedToRDBMSColumn();

	/**
	 * Sets the value of the '{@link ServicePIM.PIMComponentProperty#getIsMappedToRDBMSColumn <em>Is Mapped To RDBMS Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mapped To RDBMS Column</em>' reference.
	 * @see #getIsMappedToRDBMSColumn()
	 * @generated
	 */
	void setIsMappedToRDBMSColumn(RDBMSTableColumn value);

} // PIMComponentProperty
