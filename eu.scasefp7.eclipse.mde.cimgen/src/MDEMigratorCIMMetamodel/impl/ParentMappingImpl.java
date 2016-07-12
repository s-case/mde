/**
 */
package MDEMigratorCIMMetamodel.impl;

import MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage;
import MDEMigratorCIMMetamodel.ParentMapping;
import MDEMigratorCIMMetamodel.SourceColumn;
import MDEMigratorCIMMetamodel.TargetRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parent Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.ParentMappingImpl#getHasParentTargetRelation <em>Has Parent Target Relation</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.ParentMappingImpl#getHasForeignKeyColumn <em>Has Foreign Key Column</em>}</li>
 *   <li>{@link MDEMigratorCIMMetamodel.impl.ParentMappingImpl#getSourceRelationFKMappingName <em>Source Relation FK Mapping Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParentMappingImpl extends MinimalEObjectImpl.Container implements ParentMapping {
	/**
	 * The cached value of the '{@link #getHasParentTargetRelation() <em>Has Parent Target Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasParentTargetRelation()
	 * @generated
	 * @ordered
	 */
	protected TargetRelation hasParentTargetRelation;

	/**
	 * The cached value of the '{@link #getHasForeignKeyColumn() <em>Has Foreign Key Column</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasForeignKeyColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceColumn> hasForeignKeyColumn;

	/**
	 * The default value of the '{@link #getSourceRelationFKMappingName() <em>Source Relation FK Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRelationFKMappingName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_RELATION_FK_MAPPING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRelationFKMappingName() <em>Source Relation FK Mapping Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRelationFKMappingName()
	 * @generated
	 * @ordered
	 */
	protected String sourceRelationFKMappingName = SOURCE_RELATION_FK_MAPPING_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParentMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDEMigratorCIMMetamodelPackage.Literals.PARENT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetRelation getHasParentTargetRelation() {
		if (hasParentTargetRelation != null && hasParentTargetRelation.eIsProxy()) {
			InternalEObject oldHasParentTargetRelation = (InternalEObject)hasParentTargetRelation;
			hasParentTargetRelation = (TargetRelation)eResolveProxy(oldHasParentTargetRelation);
			if (hasParentTargetRelation != oldHasParentTargetRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_PARENT_TARGET_RELATION, oldHasParentTargetRelation, hasParentTargetRelation));
			}
		}
		return hasParentTargetRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetRelation basicGetHasParentTargetRelation() {
		return hasParentTargetRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasParentTargetRelation(TargetRelation newHasParentTargetRelation) {
		TargetRelation oldHasParentTargetRelation = hasParentTargetRelation;
		hasParentTargetRelation = newHasParentTargetRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_PARENT_TARGET_RELATION, oldHasParentTargetRelation, hasParentTargetRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceColumn> getHasForeignKeyColumn() {
		if (hasForeignKeyColumn == null) {
			hasForeignKeyColumn = new EObjectResolvingEList<SourceColumn>(SourceColumn.class, this, MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_FOREIGN_KEY_COLUMN);
		}
		return hasForeignKeyColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRelationFKMappingName() {
		return sourceRelationFKMappingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRelationFKMappingName(String newSourceRelationFKMappingName) {
		String oldSourceRelationFKMappingName = sourceRelationFKMappingName;
		sourceRelationFKMappingName = newSourceRelationFKMappingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__SOURCE_RELATION_FK_MAPPING_NAME, oldSourceRelationFKMappingName, sourceRelationFKMappingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_PARENT_TARGET_RELATION:
				if (resolve) return getHasParentTargetRelation();
				return basicGetHasParentTargetRelation();
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_FOREIGN_KEY_COLUMN:
				return getHasForeignKeyColumn();
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__SOURCE_RELATION_FK_MAPPING_NAME:
				return getSourceRelationFKMappingName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_PARENT_TARGET_RELATION:
				setHasParentTargetRelation((TargetRelation)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_FOREIGN_KEY_COLUMN:
				getHasForeignKeyColumn().clear();
				getHasForeignKeyColumn().addAll((Collection<? extends SourceColumn>)newValue);
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__SOURCE_RELATION_FK_MAPPING_NAME:
				setSourceRelationFKMappingName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_PARENT_TARGET_RELATION:
				setHasParentTargetRelation((TargetRelation)null);
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_FOREIGN_KEY_COLUMN:
				getHasForeignKeyColumn().clear();
				return;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__SOURCE_RELATION_FK_MAPPING_NAME:
				setSourceRelationFKMappingName(SOURCE_RELATION_FK_MAPPING_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_PARENT_TARGET_RELATION:
				return hasParentTargetRelation != null;
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__HAS_FOREIGN_KEY_COLUMN:
				return hasForeignKeyColumn != null && !hasForeignKeyColumn.isEmpty();
			case MDEMigratorCIMMetamodelPackage.PARENT_MAPPING__SOURCE_RELATION_FK_MAPPING_NAME:
				return SOURCE_RELATION_FK_MAPPING_NAME_EDEFAULT == null ? sourceRelationFKMappingName != null : !SOURCE_RELATION_FK_MAPPING_NAME_EDEFAULT.equals(sourceRelationFKMappingName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sourceRelationFKMappingName: ");
		result.append(sourceRelationFKMappingName);
		result.append(')');
		return result.toString();
	}

} //ParentMappingImpl
