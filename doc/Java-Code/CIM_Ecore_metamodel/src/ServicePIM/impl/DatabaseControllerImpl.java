/**
 */
package ServicePIM.impl;

import ServicePIM.DatabaseController;
import ServicePIM.RDBMSActivity;
import ServicePIM.RESTServicePIMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.DatabaseControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.DatabaseControllerImpl#getHasRDBMSActivity <em>Has RDBMS Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseControllerImpl extends MinimalEObjectImpl.Container implements DatabaseController {
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
	 * The cached value of the '{@link #getHasRDBMSActivity() <em>Has RDBMS Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRDBMSActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBMSActivity> hasRDBMSActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.DATABASE_CONTROLLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.DATABASE_CONTROLLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBMSActivity> getHasRDBMSActivity() {
		if (hasRDBMSActivity == null) {
			hasRDBMSActivity = new EObjectContainmentEList<RDBMSActivity>(RDBMSActivity.class, this, RESTServicePIMPackage.DATABASE_CONTROLLER__HAS_RDBMS_ACTIVITY);
		}
		return hasRDBMSActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTServicePIMPackage.DATABASE_CONTROLLER__HAS_RDBMS_ACTIVITY:
				return ((InternalEList<?>)getHasRDBMSActivity()).basicRemove(otherEnd, msgs);
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
			case RESTServicePIMPackage.DATABASE_CONTROLLER__NAME:
				return getName();
			case RESTServicePIMPackage.DATABASE_CONTROLLER__HAS_RDBMS_ACTIVITY:
				return getHasRDBMSActivity();
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
			case RESTServicePIMPackage.DATABASE_CONTROLLER__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.DATABASE_CONTROLLER__HAS_RDBMS_ACTIVITY:
				getHasRDBMSActivity().clear();
				getHasRDBMSActivity().addAll((Collection<? extends RDBMSActivity>)newValue);
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
			case RESTServicePIMPackage.DATABASE_CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.DATABASE_CONTROLLER__HAS_RDBMS_ACTIVITY:
				getHasRDBMSActivity().clear();
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
			case RESTServicePIMPackage.DATABASE_CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.DATABASE_CONTROLLER__HAS_RDBMS_ACTIVITY:
				return hasRDBMSActivity != null && !hasRDBMSActivity.isEmpty();
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

} //DatabaseControllerImpl
