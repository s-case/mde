/**
 */
package ServicePIM.impl;

import ServicePIM.FunctionParameter;
import ServicePIM.PIMComponentFunction;
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
 * An implementation of the model object '<em><b>PIM Component Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.PIMComponentFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.PIMComponentFunctionImpl#getHasFunctionParameter <em>Has Function Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PIMComponentFunctionImpl extends MinimalEObjectImpl.Container implements PIMComponentFunction {
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
	 * The cached value of the '{@link #getHasFunctionParameter() <em>Has Function Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFunctionParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionParameter> hasFunctionParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIMComponentFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.PIM_COMPONENT_FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.PIM_COMPONENT_FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionParameter> getHasFunctionParameter() {
		if (hasFunctionParameter == null) {
			hasFunctionParameter = new EObjectContainmentEList<FunctionParameter>(FunctionParameter.class, this, RESTServicePIMPackage.PIM_COMPONENT_FUNCTION__HAS_FUNCTION_PARAMETER);
		}
		return hasFunctionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTServicePIMPackage.PIM_COMPONENT_FUNCTION__HAS_FUNCTION_PARAMETER:
				return ((InternalEList<?>)getHasFunctionParameter()).basicRemove(otherEnd, msgs);
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
			case RESTServicePIMPackage.PIM_COMPONENT_FUNCTION__NAME:
				return getName();
			case RESTServicePIMPackage.PIM_COMPONENT_FUNCTION__HAS_FUNCTION_PARAMETER:
				return getHasFunctionParameter();
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
			case RESTServicePIMPackage.PIM_COMPONENT_FUNCTION__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.PIM_COMPONENT_FUNCTION__HAS_FUNCTION_PARAMETER:
				getHasFunctionParameter().clear();
				getHasFunctionParameter().addAll((Collection<? extends FunctionParameter>)newValue);
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
			case RESTServicePIMPackage.PIM_COMPONENT_FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.PIM_COMPONENT_FUNCTION__HAS_FUNCTION_PARAMETER:
				getHasFunctionParameter().clear();
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
			case RESTServicePIMPackage.PIM_COMPONENT_FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.PIM_COMPONENT_FUNCTION__HAS_FUNCTION_PARAMETER:
				return hasFunctionParameter != null && !hasFunctionParameter.isEmpty();
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

} //PIMComponentFunctionImpl
