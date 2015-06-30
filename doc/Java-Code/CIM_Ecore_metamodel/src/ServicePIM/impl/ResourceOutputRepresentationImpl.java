/**
 */
package ServicePIM.impl;

import ServicePIM.MediaType;
import ServicePIM.RESTServicePIMPackage;
import ServicePIM.ResourceOutputRepresentation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Output Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.ResourceOutputRepresentationImpl#getOutputType <em>Output Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceOutputRepresentationImpl extends MinimalEObjectImpl.Container implements ResourceOutputRepresentation {
	/**
	 * The default value of the '{@link #getOutputType() <em>Output Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputType()
	 * @generated
	 * @ordered
	 */
	protected static final MediaType OUTPUT_TYPE_EDEFAULT = MediaType.JSON;

	/**
	 * The cached value of the '{@link #getOutputType() <em>Output Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputType()
	 * @generated
	 * @ordered
	 */
	protected MediaType outputType = OUTPUT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceOutputRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.RESOURCE_OUTPUT_REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType getOutputType() {
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputType(MediaType newOutputType) {
		MediaType oldOutputType = outputType;
		outputType = newOutputType == null ? OUTPUT_TYPE_EDEFAULT : newOutputType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_OUTPUT_REPRESENTATION__OUTPUT_TYPE, oldOutputType, outputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTServicePIMPackage.RESOURCE_OUTPUT_REPRESENTATION__OUTPUT_TYPE:
				return getOutputType();
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
			case RESTServicePIMPackage.RESOURCE_OUTPUT_REPRESENTATION__OUTPUT_TYPE:
				setOutputType((MediaType)newValue);
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
			case RESTServicePIMPackage.RESOURCE_OUTPUT_REPRESENTATION__OUTPUT_TYPE:
				setOutputType(OUTPUT_TYPE_EDEFAULT);
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
			case RESTServicePIMPackage.RESOURCE_OUTPUT_REPRESENTATION__OUTPUT_TYPE:
				return outputType != OUTPUT_TYPE_EDEFAULT;
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
		result.append(" (outputType: ");
		result.append(outputType);
		result.append(')');
		return result.toString();
	}

} //ResourceOutputRepresentationImpl
