/**
 */
package ServicePIM.impl;

import ServicePIM.RESTServicePIMPackage;
import ServicePIM.RepresentationParseFunction;
import ServicePIM.ResourceInputRepresentation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation Parse Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.RepresentationParseFunctionImpl#getParsesInputRepresentation <em>Parses Input Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepresentationParseFunctionImpl extends MinimalEObjectImpl.Container implements RepresentationParseFunction {
	/**
	 * The cached value of the '{@link #getParsesInputRepresentation() <em>Parses Input Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParsesInputRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ResourceInputRepresentation parsesInputRepresentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationParseFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.REPRESENTATION_PARSE_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInputRepresentation getParsesInputRepresentation() {
		if (parsesInputRepresentation != null && parsesInputRepresentation.eIsProxy()) {
			InternalEObject oldParsesInputRepresentation = (InternalEObject)parsesInputRepresentation;
			parsesInputRepresentation = (ResourceInputRepresentation)eResolveProxy(oldParsesInputRepresentation);
			if (parsesInputRepresentation != oldParsesInputRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.REPRESENTATION_PARSE_FUNCTION__PARSES_INPUT_REPRESENTATION, oldParsesInputRepresentation, parsesInputRepresentation));
			}
		}
		return parsesInputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInputRepresentation basicGetParsesInputRepresentation() {
		return parsesInputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParsesInputRepresentation(ResourceInputRepresentation newParsesInputRepresentation) {
		ResourceInputRepresentation oldParsesInputRepresentation = parsesInputRepresentation;
		parsesInputRepresentation = newParsesInputRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.REPRESENTATION_PARSE_FUNCTION__PARSES_INPUT_REPRESENTATION, oldParsesInputRepresentation, parsesInputRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTServicePIMPackage.REPRESENTATION_PARSE_FUNCTION__PARSES_INPUT_REPRESENTATION:
				if (resolve) return getParsesInputRepresentation();
				return basicGetParsesInputRepresentation();
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
			case RESTServicePIMPackage.REPRESENTATION_PARSE_FUNCTION__PARSES_INPUT_REPRESENTATION:
				setParsesInputRepresentation((ResourceInputRepresentation)newValue);
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
			case RESTServicePIMPackage.REPRESENTATION_PARSE_FUNCTION__PARSES_INPUT_REPRESENTATION:
				setParsesInputRepresentation((ResourceInputRepresentation)null);
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
			case RESTServicePIMPackage.REPRESENTATION_PARSE_FUNCTION__PARSES_INPUT_REPRESENTATION:
				return parsesInputRepresentation != null;
		}
		return super.eIsSet(featureID);
	}

} //RepresentationParseFunctionImpl
