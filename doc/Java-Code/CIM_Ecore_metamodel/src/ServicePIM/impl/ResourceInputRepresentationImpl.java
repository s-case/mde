/**
 */
package ServicePIM.impl;

import ServicePIM.MediaType;
import ServicePIM.RESTServicePIMPackage;
import ServicePIM.ResourceInputRepresentation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Input Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.ResourceInputRepresentationImpl#getInputType <em>Input Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceInputRepresentationImpl extends MinimalEObjectImpl.Container implements ResourceInputRepresentation {
	/**
	 * The default value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputType()
	 * @generated
	 * @ordered
	 */
	protected static final MediaType INPUT_TYPE_EDEFAULT = MediaType.JSON;

	/**
	 * The cached value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputType()
	 * @generated
	 * @ordered
	 */
	protected MediaType inputType = INPUT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInputRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.RESOURCE_INPUT_REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType getInputType() {
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputType(MediaType newInputType) {
		MediaType oldInputType = inputType;
		inputType = newInputType == null ? INPUT_TYPE_EDEFAULT : newInputType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_INPUT_REPRESENTATION__INPUT_TYPE, oldInputType, inputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTServicePIMPackage.RESOURCE_INPUT_REPRESENTATION__INPUT_TYPE:
				return getInputType();
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
			case RESTServicePIMPackage.RESOURCE_INPUT_REPRESENTATION__INPUT_TYPE:
				setInputType((MediaType)newValue);
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
			case RESTServicePIMPackage.RESOURCE_INPUT_REPRESENTATION__INPUT_TYPE:
				setInputType(INPUT_TYPE_EDEFAULT);
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
			case RESTServicePIMPackage.RESOURCE_INPUT_REPRESENTATION__INPUT_TYPE:
				return inputType != INPUT_TYPE_EDEFAULT;
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
		result.append(" (inputType: ");
		result.append(inputType);
		result.append(')');
		return result.toString();
	}

} //ResourceInputRepresentationImpl
