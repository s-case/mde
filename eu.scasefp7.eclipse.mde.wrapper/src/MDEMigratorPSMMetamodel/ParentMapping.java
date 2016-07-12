/**
 */
package MDEMigratorPSMMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MDEMigratorPSMMetamodel.ParentMapping#getHasParentTargetRelation <em>Has Parent Target Relation</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.ParentMapping#getHasForeignKeyColumn <em>Has Foreign Key Column</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.ParentMapping#getSourceRelationFKMappingName <em>Source Relation FK Mapping Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getParentMapping()
 * @model
 * @generated
 */
public interface ParentMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Parent Target Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Parent Target Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Parent Target Relation</em>' reference.
	 * @see #setHasParentTargetRelation(TargetRelation)
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getParentMapping_HasParentTargetRelation()
	 * @model required="true"
	 * @generated
	 */
	TargetRelation getHasParentTargetRelation();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.ParentMapping#getHasParentTargetRelation <em>Has Parent Target Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Parent Target Relation</em>' reference.
	 * @see #getHasParentTargetRelation()
	 * @generated
	 */
	void setHasParentTargetRelation(TargetRelation value);

	/**
	 * Returns the value of the '<em><b>Has Foreign Key Column</b></em>' reference list.
	 * The list contents are of type {@link MDEMigratorPSMMetamodel.SourceColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Foreign Key Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Foreign Key Column</em>' reference list.
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getParentMapping_HasForeignKeyColumn()
	 * @model required="true"
	 * @generated
	 */
	EList<SourceColumn> getHasForeignKeyColumn();

	/**
	 * Returns the value of the '<em><b>Source Relation FK Mapping Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Relation FK Mapping Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Relation FK Mapping Name</em>' attribute.
	 * @see #setSourceRelationFKMappingName(String)
	 * @see MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage#getParentMapping_SourceRelationFKMappingName()
	 * @model default="" required="true"
	 * @generated
	 */
	String getSourceRelationFKMappingName();

	/**
	 * Sets the value of the '{@link MDEMigratorPSMMetamodel.ParentMapping#getSourceRelationFKMappingName <em>Source Relation FK Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Relation FK Mapping Name</em>' attribute.
	 * @see #getSourceRelationFKMappingName()
	 * @generated
	 */
	void setSourceRelationFKMappingName(String value);

} // ParentMapping
