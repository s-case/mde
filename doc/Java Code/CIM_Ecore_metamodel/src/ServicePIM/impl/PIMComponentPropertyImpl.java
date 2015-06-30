/**
 */
package ServicePIM.impl;

import ServicePIM.PIMComponentProperty;
import ServicePIM.RDBMSTableColumn;
import ServicePIM.RESTServicePIMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PIM Component Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.PIMComponentPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.PIMComponentPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link ServicePIM.impl.PIMComponentPropertyImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link ServicePIM.impl.PIMComponentPropertyImpl#isIsNamingProperty <em>Is Naming Property</em>}</li>
 *   <li>{@link ServicePIM.impl.PIMComponentPropertyImpl#isIsPrimaryIdentifier <em>Is Primary Identifier</em>}</li>
 *   <li>{@link ServicePIM.impl.PIMComponentPropertyImpl#getIsMappedToRDBMSColumn <em>Is Mapped To RDBMS Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PIMComponentPropertyImpl extends MinimalEObjectImpl.Container implements PIMComponentProperty {
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
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNamingProperty() <em>Is Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNamingProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NAMING_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNamingProperty() <em>Is Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNamingProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean isNamingProperty = IS_NAMING_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPrimaryIdentifier() <em>Is Primary Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimaryIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIMARY_IDENTIFIER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrimaryIdentifier() <em>Is Primary Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimaryIdentifier()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrimaryIdentifier = IS_PRIMARY_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsMappedToRDBMSColumn() <em>Is Mapped To RDBMS Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMappedToRDBMSColumn()
	 * @generated
	 * @ordered
	 */
	protected RDBMSTableColumn isMappedToRDBMSColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIMComponentPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.PIM_COMPONENT_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNamingProperty() {
		return isNamingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNamingProperty(boolean newIsNamingProperty) {
		boolean oldIsNamingProperty = isNamingProperty;
		isNamingProperty = newIsNamingProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_NAMING_PROPERTY, oldIsNamingProperty, isNamingProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPrimaryIdentifier() {
		return isPrimaryIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrimaryIdentifier(boolean newIsPrimaryIdentifier) {
		boolean oldIsPrimaryIdentifier = isPrimaryIdentifier;
		isPrimaryIdentifier = newIsPrimaryIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_PRIMARY_IDENTIFIER, oldIsPrimaryIdentifier, isPrimaryIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMSTableColumn getIsMappedToRDBMSColumn() {
		if (isMappedToRDBMSColumn != null && isMappedToRDBMSColumn.eIsProxy()) {
			InternalEObject oldIsMappedToRDBMSColumn = (InternalEObject)isMappedToRDBMSColumn;
			isMappedToRDBMSColumn = (RDBMSTableColumn)eResolveProxy(oldIsMappedToRDBMSColumn);
			if (isMappedToRDBMSColumn != oldIsMappedToRDBMSColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_MAPPED_TO_RDBMS_COLUMN, oldIsMappedToRDBMSColumn, isMappedToRDBMSColumn));
			}
		}
		return isMappedToRDBMSColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMSTableColumn basicGetIsMappedToRDBMSColumn() {
		return isMappedToRDBMSColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMappedToRDBMSColumn(RDBMSTableColumn newIsMappedToRDBMSColumn) {
		RDBMSTableColumn oldIsMappedToRDBMSColumn = isMappedToRDBMSColumn;
		isMappedToRDBMSColumn = newIsMappedToRDBMSColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_MAPPED_TO_RDBMS_COLUMN, oldIsMappedToRDBMSColumn, isMappedToRDBMSColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__NAME:
				return getName();
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__TYPE:
				return getType();
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_UNIQUE:
				return isIsUnique();
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_NAMING_PROPERTY:
				return isIsNamingProperty();
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_PRIMARY_IDENTIFIER:
				return isIsPrimaryIdentifier();
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_MAPPED_TO_RDBMS_COLUMN:
				if (resolve) return getIsMappedToRDBMSColumn();
				return basicGetIsMappedToRDBMSColumn();
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
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__TYPE:
				setType((String)newValue);
				return;
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_NAMING_PROPERTY:
				setIsNamingProperty((Boolean)newValue);
				return;
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_PRIMARY_IDENTIFIER:
				setIsPrimaryIdentifier((Boolean)newValue);
				return;
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_MAPPED_TO_RDBMS_COLUMN:
				setIsMappedToRDBMSColumn((RDBMSTableColumn)newValue);
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
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_NAMING_PROPERTY:
				setIsNamingProperty(IS_NAMING_PROPERTY_EDEFAULT);
				return;
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_PRIMARY_IDENTIFIER:
				setIsPrimaryIdentifier(IS_PRIMARY_IDENTIFIER_EDEFAULT);
				return;
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_MAPPED_TO_RDBMS_COLUMN:
				setIsMappedToRDBMSColumn((RDBMSTableColumn)null);
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
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_NAMING_PROPERTY:
				return isNamingProperty != IS_NAMING_PROPERTY_EDEFAULT;
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_PRIMARY_IDENTIFIER:
				return isPrimaryIdentifier != IS_PRIMARY_IDENTIFIER_EDEFAULT;
			case RESTServicePIMPackage.PIM_COMPONENT_PROPERTY__IS_MAPPED_TO_RDBMS_COLUMN:
				return isMappedToRDBMSColumn != null;
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
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", isNamingProperty: ");
		result.append(isNamingProperty);
		result.append(", isPrimaryIdentifier: ");
		result.append(isPrimaryIdentifier);
		result.append(')');
		return result.toString();
	}

} //PIMComponentPropertyImpl
