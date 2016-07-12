/**
 */
package databaseMetamodel.impl;

import databaseMetamodel.Column;
import databaseMetamodel.DatabaseMetamodelPackage;
import databaseMetamodel.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link databaseMetamodel.impl.RelationImpl#getHasColumns <em>Has Columns</em>}</li>
 *   <li>{@link databaseMetamodel.impl.RelationImpl#getHasPrimaryKey <em>Has Primary Key</em>}</li>
 *   <li>{@link databaseMetamodel.impl.RelationImpl#getHasForeignKey <em>Has Foreign Key</em>}</li>
 *   <li>{@link databaseMetamodel.impl.RelationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
	/**
	 * The cached value of the '{@link #getHasColumns() <em>Has Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> hasColumns;

	/**
	 * The cached value of the '{@link #getHasPrimaryKey() <em>Has Primary Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> hasPrimaryKey;

	/**
	 * The cached value of the '{@link #getHasForeignKey() <em>Has Foreign Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> hasForeignKey;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseMetamodelPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getHasColumns() {
		if (hasColumns == null) {
			hasColumns = new EObjectContainmentEList<Column>(Column.class, this, DatabaseMetamodelPackage.RELATION__HAS_COLUMNS);
		}
		return hasColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getHasPrimaryKey() {
		if (hasPrimaryKey == null) {
			hasPrimaryKey = new EObjectResolvingEList<Column>(Column.class, this, DatabaseMetamodelPackage.RELATION__HAS_PRIMARY_KEY);
		}
		return hasPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getHasForeignKey() {
		if (hasForeignKey == null) {
			hasForeignKey = new EObjectResolvingEList<Column>(Column.class, this, DatabaseMetamodelPackage.RELATION__HAS_FOREIGN_KEY);
		}
		return hasForeignKey;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseMetamodelPackage.RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabaseMetamodelPackage.RELATION__HAS_COLUMNS:
				return ((InternalEList<?>)getHasColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabaseMetamodelPackage.RELATION__HAS_COLUMNS:
				return getHasColumns();
			case DatabaseMetamodelPackage.RELATION__HAS_PRIMARY_KEY:
				return getHasPrimaryKey();
			case DatabaseMetamodelPackage.RELATION__HAS_FOREIGN_KEY:
				return getHasForeignKey();
			case DatabaseMetamodelPackage.RELATION__NAME:
				return getName();
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
			case DatabaseMetamodelPackage.RELATION__HAS_COLUMNS:
				getHasColumns().clear();
				getHasColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case DatabaseMetamodelPackage.RELATION__HAS_PRIMARY_KEY:
				getHasPrimaryKey().clear();
				getHasPrimaryKey().addAll((Collection<? extends Column>)newValue);
				return;
			case DatabaseMetamodelPackage.RELATION__HAS_FOREIGN_KEY:
				getHasForeignKey().clear();
				getHasForeignKey().addAll((Collection<? extends Column>)newValue);
				return;
			case DatabaseMetamodelPackage.RELATION__NAME:
				setName((String)newValue);
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
			case DatabaseMetamodelPackage.RELATION__HAS_COLUMNS:
				getHasColumns().clear();
				return;
			case DatabaseMetamodelPackage.RELATION__HAS_PRIMARY_KEY:
				getHasPrimaryKey().clear();
				return;
			case DatabaseMetamodelPackage.RELATION__HAS_FOREIGN_KEY:
				getHasForeignKey().clear();
				return;
			case DatabaseMetamodelPackage.RELATION__NAME:
				setName(NAME_EDEFAULT);
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
			case DatabaseMetamodelPackage.RELATION__HAS_COLUMNS:
				return hasColumns != null && !hasColumns.isEmpty();
			case DatabaseMetamodelPackage.RELATION__HAS_PRIMARY_KEY:
				return hasPrimaryKey != null && !hasPrimaryKey.isEmpty();
			case DatabaseMetamodelPackage.RELATION__HAS_FOREIGN_KEY:
				return hasForeignKey != null && !hasForeignKey.isEmpty();
			case DatabaseMetamodelPackage.RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //RelationImpl
