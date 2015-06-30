/**
 */
package ServicePIM.impl;

import ServicePIM.RESTServicePIMPackage;
import ServicePIM.RepresentationMarshallingFunction;
import ServicePIM.ResourceOutputRepresentation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation Marshalling Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.RepresentationMarshallingFunctionImpl#getMarshalsRepresentation <em>Marshals Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepresentationMarshallingFunctionImpl extends MinimalEObjectImpl.Container implements RepresentationMarshallingFunction {
	/**
	 * The cached value of the '{@link #getMarshalsRepresentation() <em>Marshals Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarshalsRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ResourceOutputRepresentation marshalsRepresentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationMarshallingFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.REPRESENTATION_MARSHALLING_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceOutputRepresentation getMarshalsRepresentation() {
		if (marshalsRepresentation != null && marshalsRepresentation.eIsProxy()) {
			InternalEObject oldMarshalsRepresentation = (InternalEObject)marshalsRepresentation;
			marshalsRepresentation = (ResourceOutputRepresentation)eResolveProxy(oldMarshalsRepresentation);
			if (marshalsRepresentation != oldMarshalsRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.REPRESENTATION_MARSHALLING_FUNCTION__MARSHALS_REPRESENTATION, oldMarshalsRepresentation, marshalsRepresentation));
			}
		}
		return marshalsRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceOutputRepresentation basicGetMarshalsRepresentation() {
		return marshalsRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarshalsRepresentation(ResourceOutputRepresentation newMarshalsRepresentation) {
		ResourceOutputRepresentation oldMarshalsRepresentation = marshalsRepresentation;
		marshalsRepresentation = newMarshalsRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.REPRESENTATION_MARSHALLING_FUNCTION__MARSHALS_REPRESENTATION, oldMarshalsRepresentation, marshalsRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTServicePIMPackage.REPRESENTATION_MARSHALLING_FUNCTION__MARSHALS_REPRESENTATION:
				if (resolve) return getMarshalsRepresentation();
				return basicGetMarshalsRepresentation();
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
			case RESTServicePIMPackage.REPRESENTATION_MARSHALLING_FUNCTION__MARSHALS_REPRESENTATION:
				setMarshalsRepresentation((ResourceOutputRepresentation)newValue);
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
			case RESTServicePIMPackage.REPRESENTATION_MARSHALLING_FUNCTION__MARSHALS_REPRESENTATION:
				setMarshalsRepresentation((ResourceOutputRepresentation)null);
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
			case RESTServicePIMPackage.REPRESENTATION_MARSHALLING_FUNCTION__MARSHALS_REPRESENTATION:
				return marshalsRepresentation != null;
		}
		return super.eIsSet(featureID);
	}

} //RepresentationMarshallingFunctionImpl
