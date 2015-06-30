/**
 */
package ServicePIM.impl;

import ServicePIM.RDBMSTable;
import ServicePIM.RDBMSTableColumn;
import ServicePIM.RESTServicePIMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDBMS Table Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.RDBMSTableColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.RDBMSTableColumnImpl#getType <em>Type</em>}</li>
 *   <li>{@link ServicePIM.impl.RDBMSTableColumnImpl#isIsForeignKey <em>Is Foreign Key</em>}</li>
 *   <li>{@link ServicePIM.impl.RDBMSTableColumnImpl#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link ServicePIM.impl.RDBMSTableColumnImpl#getReferencesRDBMSTable <em>References RDBMS Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RDBMSTableColumnImpl extends MinimalEObjectImpl.Container implements RDBMSTableColumn {
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
	protected static final String TYPE_EDEFAULT = null;

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
	 * The default value of the '{@link #isIsForeignKey() <em>Is Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForeignKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FOREIGN_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForeignKey() <em>Is Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForeignKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isForeignKey = IS_FOREIGN_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPrimaryKey() <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrimaryKey() <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrimaryKey = IS_PRIMARY_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencesRDBMSTable() <em>References RDBMS Table</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesRDBMSTable()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBMSTable> referencesRDBMSTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBMSTableColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.RDBMS_TABLE_COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RDBMS_TABLE_COLUMN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RDBMS_TABLE_COLUMN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForeignKey() {
		return isForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForeignKey(boolean newIsForeignKey) {
		boolean oldIsForeignKey = isForeignKey;
		isForeignKey = newIsForeignKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RDBMS_TABLE_COLUMN__IS_FOREIGN_KEY, oldIsForeignKey, isForeignKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPrimaryKey() {
		return isPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrimaryKey(boolean newIsPrimaryKey) {
		boolean oldIsPrimaryKey = isPrimaryKey;
		isPrimaryKey = newIsPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RDBMS_TABLE_COLUMN__IS_PRIMARY_KEY, oldIsPrimaryKey, isPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBMSTable> getReferencesRDBMSTable() {
		if (referencesRDBMSTable == null) {
			referencesRDBMSTable = new EObjectResolvingEList<RDBMSTable>(RDBMSTable.class, this, RESTServicePIMPackage.RDBMS_TABLE_COLUMN__REFERENCES_RDBMS_TABLE);
		}
		return referencesRDBMSTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__NAME:
				return getName();
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__TYPE:
				return getType();
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__IS_FOREIGN_KEY:
				return isIsForeignKey();
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__IS_PRIMARY_KEY:
				return isIsPrimaryKey();
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__REFERENCES_RDBMS_TABLE:
				return getReferencesRDBMSTable();
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
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__TYPE:
				setType((String)newValue);
				return;
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__IS_FOREIGN_KEY:
				setIsForeignKey((Boolean)newValue);
				return;
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__IS_PRIMARY_KEY:
				setIsPrimaryKey((Boolean)newValue);
				return;
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__REFERENCES_RDBMS_TABLE:
				getReferencesRDBMSTable().clear();
				getReferencesRDBMSTable().addAll((Collection<? extends RDBMSTable>)newValue);
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
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__IS_FOREIGN_KEY:
				setIsForeignKey(IS_FOREIGN_KEY_EDEFAULT);
				return;
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__IS_PRIMARY_KEY:
				setIsPrimaryKey(IS_PRIMARY_KEY_EDEFAULT);
				return;
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__REFERENCES_RDBMS_TABLE:
				getReferencesRDBMSTable().clear();
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
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__IS_FOREIGN_KEY:
				return isForeignKey != IS_FOREIGN_KEY_EDEFAULT;
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__IS_PRIMARY_KEY:
				return isPrimaryKey != IS_PRIMARY_KEY_EDEFAULT;
			case RESTServicePIMPackage.RDBMS_TABLE_COLUMN__REFERENCES_RDBMS_TABLE:
				return referencesRDBMSTable != null && !referencesRDBMSTable.isEmpty();
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
		result.append(", isForeignKey: ");
		result.append(isForeignKey);
		result.append(", isPrimaryKey: ");
		result.append(isPrimaryKey);
		result.append(')');
		return result.toString();
	}

} //RDBMSTableColumnImpl
