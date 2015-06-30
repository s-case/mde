/**
 */
package ServicePIM.impl;

import ServicePIM.GetterFunction;
import ServicePIM.PIMComponentProperty;
import ServicePIM.RESTServicePIMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Getter Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.GetterFunctionImpl#getGetsProperty <em>Gets Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetterFunctionImpl extends PIMComponentFunctionImpl implements GetterFunction {
	/**
	 * The cached value of the '{@link #getGetsProperty() <em>Gets Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetsProperty()
	 * @generated
	 * @ordered
	 */
	protected PIMComponentProperty getsProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetterFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.GETTER_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMComponentProperty getGetsProperty() {
		if (getsProperty != null && getsProperty.eIsProxy()) {
			InternalEObject oldGetsProperty = (InternalEObject)getsProperty;
			getsProperty = (PIMComponentProperty)eResolveProxy(oldGetsProperty);
			if (getsProperty != oldGetsProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.GETTER_FUNCTION__GETS_PROPERTY, oldGetsProperty, getsProperty));
			}
		}
		return getsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMComponentProperty basicGetGetsProperty() {
		return getsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetsProperty(PIMComponentProperty newGetsProperty) {
		PIMComponentProperty oldGetsProperty = getsProperty;
		getsProperty = newGetsProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.GETTER_FUNCTION__GETS_PROPERTY, oldGetsProperty, getsProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTServicePIMPackage.GETTER_FUNCTION__GETS_PROPERTY:
				if (resolve) return getGetsProperty();
				return basicGetGetsProperty();
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
			case RESTServicePIMPackage.GETTER_FUNCTION__GETS_PROPERTY:
				setGetsProperty((PIMComponentProperty)newValue);
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
			case RESTServicePIMPackage.GETTER_FUNCTION__GETS_PROPERTY:
				setGetsProperty((PIMComponentProperty)null);
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
			case RESTServicePIMPackage.GETTER_FUNCTION__GETS_PROPERTY:
				return getsProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //GetterFunctionImpl
