/**
 */
package ServicePIM.impl;

import ServicePIM.PIMComponentProperty;
import ServicePIM.RESTServicePIMPackage;
import ServicePIM.SetterFunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setter Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.SetterFunctionImpl#getSetsProperty <em>Sets Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetterFunctionImpl extends PIMComponentFunctionImpl implements SetterFunction {
	/**
	 * The cached value of the '{@link #getSetsProperty() <em>Sets Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetsProperty()
	 * @generated
	 * @ordered
	 */
	protected PIMComponentProperty setsProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetterFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.SETTER_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMComponentProperty getSetsProperty() {
		if (setsProperty != null && setsProperty.eIsProxy()) {
			InternalEObject oldSetsProperty = (InternalEObject)setsProperty;
			setsProperty = (PIMComponentProperty)eResolveProxy(oldSetsProperty);
			if (setsProperty != oldSetsProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.SETTER_FUNCTION__SETS_PROPERTY, oldSetsProperty, setsProperty));
			}
		}
		return setsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMComponentProperty basicGetSetsProperty() {
		return setsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetsProperty(PIMComponentProperty newSetsProperty) {
		PIMComponentProperty oldSetsProperty = setsProperty;
		setsProperty = newSetsProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.SETTER_FUNCTION__SETS_PROPERTY, oldSetsProperty, setsProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTServicePIMPackage.SETTER_FUNCTION__SETS_PROPERTY:
				if (resolve) return getSetsProperty();
				return basicGetSetsProperty();
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
			case RESTServicePIMPackage.SETTER_FUNCTION__SETS_PROPERTY:
				setSetsProperty((PIMComponentProperty)newValue);
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
			case RESTServicePIMPackage.SETTER_FUNCTION__SETS_PROPERTY:
				setSetsProperty((PIMComponentProperty)null);
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
			case RESTServicePIMPackage.SETTER_FUNCTION__SETS_PROPERTY:
				return setsProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //SetterFunctionImpl
