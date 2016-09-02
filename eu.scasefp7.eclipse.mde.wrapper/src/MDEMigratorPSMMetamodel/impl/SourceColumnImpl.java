/**
 */
package MDEMigratorPSMMetamodel.impl;

import MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage;
import MDEMigratorPSMMetamodel.SourceColumn;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.SourceColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.SourceColumnImpl#getType <em>Type</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.SourceColumnImpl#getHasPkOrder <em>Has Pk Order</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.SourceColumnImpl#getHasFKOrder <em>Has FK Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceColumnImpl extends MinimalEObjectImpl.Container implements SourceColumn {
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
	 * The default value of the '{@link #getHasPkOrder() <em>Has Pk Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPkOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int HAS_PK_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHasPkOrder() <em>Has Pk Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPkOrder()
	 * @generated
	 * @ordered
	 */
	protected int hasPkOrder = HAS_PK_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasFKOrder() <em>Has FK Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFKOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int HAS_FK_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHasFKOrder() <em>Has FK Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFKOrder()
	 * @generated
	 * @ordered
	 */
	protected int hasFKOrder = HAS_FK_ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDEMigratorPSMMetamodelPackage.Literals.SOURCE_COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHasPkOrder() {
		return hasPkOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPkOrder(int newHasPkOrder) {
		int oldHasPkOrder = hasPkOrder;
		hasPkOrder = newHasPkOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__HAS_PK_ORDER, oldHasPkOrder, hasPkOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHasFKOrder() {
		return hasFKOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFKOrder(int newHasFKOrder) {
		int oldHasFKOrder = hasFKOrder;
		hasFKOrder = newHasFKOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__HAS_FK_ORDER, oldHasFKOrder, hasFKOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__NAME:
				return getName();
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__TYPE:
				return getType();
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__HAS_PK_ORDER:
				return getHasPkOrder();
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__HAS_FK_ORDER:
				return getHasFKOrder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__NAME:
				setName((String)newValue);
				return;
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__TYPE:
				setType((String)newValue);
				return;
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__HAS_PK_ORDER:
				setHasPkOrder((Integer)newValue);
				return;
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__HAS_FK_ORDER:
				setHasFKOrder((Integer)newValue);
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
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__HAS_PK_ORDER:
				setHasPkOrder(HAS_PK_ORDER_EDEFAULT);
				return;
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__HAS_FK_ORDER:
				setHasFKOrder(HAS_FK_ORDER_EDEFAULT);
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
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__HAS_PK_ORDER:
				return hasPkOrder != HAS_PK_ORDER_EDEFAULT;
			case MDEMigratorPSMMetamodelPackage.SOURCE_COLUMN__HAS_FK_ORDER:
				return hasFKOrder != HAS_FK_ORDER_EDEFAULT;
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
		result.append(", hasPkOrder: ");
		result.append(hasPkOrder);
		result.append(", hasFKOrder: ");
		result.append(hasFKOrder);
		result.append(')');
		return result.toString();
	}

} //SourceColumnImpl
