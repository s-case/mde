/**
 */
package databaseMetamodel.impl;

import databaseMetamodel.Column;
import databaseMetamodel.DatabaseMetamodelPackage;
import databaseMetamodel.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link databaseMetamodel.impl.ColumnImpl#getIsForeinKeyToColumn <em>Is Forein Key To Column</em>}</li>
 *   <li>{@link databaseMetamodel.impl.ColumnImpl#getIsForeignKeyToRelation <em>Is Foreign Key To Relation</em>}</li>
 *   <li>{@link databaseMetamodel.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link databaseMetamodel.impl.ColumnImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends MinimalEObjectImpl.Container implements Column {
	/**
	 * The cached value of the '{@link #getIsForeinKeyToColumn() <em>Is Forein Key To Column</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsForeinKeyToColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> isForeinKeyToColumn;

	/**
	 * The cached value of the '{@link #getIsForeignKeyToRelation() <em>Is Foreign Key To Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsForeignKeyToRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> isForeignKeyToRelation;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseMetamodelPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getIsForeinKeyToColumn() {
		if (isForeinKeyToColumn == null) {
			isForeinKeyToColumn = new EObjectResolvingEList<Column>(Column.class, this, DatabaseMetamodelPackage.COLUMN__IS_FOREIN_KEY_TO_COLUMN);
		}
		return isForeinKeyToColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getIsForeignKeyToRelation() {
		if (isForeignKeyToRelation == null) {
			isForeignKeyToRelation = new EObjectResolvingEList<Relation>(Relation.class, this, DatabaseMetamodelPackage.COLUMN__IS_FOREIGN_KEY_TO_RELATION);
		}
		return isForeignKeyToRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseMetamodelPackage.COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseMetamodelPackage.COLUMN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabaseMetamodelPackage.COLUMN__IS_FOREIN_KEY_TO_COLUMN:
				return getIsForeinKeyToColumn();
			case DatabaseMetamodelPackage.COLUMN__IS_FOREIGN_KEY_TO_RELATION:
				return getIsForeignKeyToRelation();
			case DatabaseMetamodelPackage.COLUMN__NAME:
				return getName();
			case DatabaseMetamodelPackage.COLUMN__TYPE:
				return getType();
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
			case DatabaseMetamodelPackage.COLUMN__IS_FOREIN_KEY_TO_COLUMN:
				getIsForeinKeyToColumn().clear();
				getIsForeinKeyToColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case DatabaseMetamodelPackage.COLUMN__IS_FOREIGN_KEY_TO_RELATION:
				getIsForeignKeyToRelation().clear();
				getIsForeignKeyToRelation().addAll((Collection<? extends Relation>)newValue);
				return;
			case DatabaseMetamodelPackage.COLUMN__NAME:
				setName((String)newValue);
				return;
			case DatabaseMetamodelPackage.COLUMN__TYPE:
				setType((String)newValue);
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
			case DatabaseMetamodelPackage.COLUMN__IS_FOREIN_KEY_TO_COLUMN:
				getIsForeinKeyToColumn().clear();
				return;
			case DatabaseMetamodelPackage.COLUMN__IS_FOREIGN_KEY_TO_RELATION:
				getIsForeignKeyToRelation().clear();
				return;
			case DatabaseMetamodelPackage.COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatabaseMetamodelPackage.COLUMN__TYPE:
				setType(TYPE_EDEFAULT);
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
			case DatabaseMetamodelPackage.COLUMN__IS_FOREIN_KEY_TO_COLUMN:
				return isForeinKeyToColumn != null && !isForeinKeyToColumn.isEmpty();
			case DatabaseMetamodelPackage.COLUMN__IS_FOREIGN_KEY_TO_RELATION:
				return isForeignKeyToRelation != null && !isForeignKeyToRelation.isEmpty();
			case DatabaseMetamodelPackage.COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatabaseMetamodelPackage.COLUMN__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
