/**
 */
package MDEMigratorPSMMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDEMigratorPSMMetamodel.SourceColumn#getName <em>Name</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.SourceColumn#getType <em>Type</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.SourceColumn#getHasPkOrder <em>Has Pk Order</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.SourceColumn#getHasFKOrder <em>Has FK Order</em>}</li>
 * </ul>
 *
 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getSourceColumn()
 * @model
 * @generated
 */
public interface SourceColumn extends EObject {
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
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getSourceColumn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.SourceColumn#getName <em>Name</em>}' attribute.
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
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getSourceColumn_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.SourceColumn#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Has Pk Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Pk Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Pk Order</em>' attribute.
	 * @see #setHasPkOrder(int)
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getSourceColumn_HasPkOrder()
	 * @model required="true"
	 * @generated
	 */
	int getHasPkOrder();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.SourceColumn#getHasPkOrder <em>Has Pk Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Pk Order</em>' attribute.
	 * @see #getHasPkOrder()
	 * @generated
	 */
	void setHasPkOrder(int value);

	/**
	 * Returns the value of the '<em><b>Has FK Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has FK Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has FK Order</em>' attribute.
	 * @see #setHasFKOrder(int)
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getSourceColumn_HasFKOrder()
	 * @model required="true"
	 * @generated
	 */
	int getHasFKOrder();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.SourceColumn#getHasFKOrder <em>Has FK Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has FK Order</em>' attribute.
	 * @see #getHasFKOrder()
	 * @generated
	 */
	void setHasFKOrder(int value);

} // SourceColumn
