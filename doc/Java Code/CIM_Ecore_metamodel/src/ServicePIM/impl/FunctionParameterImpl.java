/**
 */
package ServicePIM.impl;

import ServicePIM.FunctionParameter;
import ServicePIM.RESTServicePIMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.FunctionParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.FunctionParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link ServicePIM.impl.FunctionParameterImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link ServicePIM.impl.FunctionParameterImpl#isBIsReturnParameter <em>BIs Return Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionParameterImpl extends MinimalEObjectImpl.Container implements FunctionParameter {
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
	 * The default value of the '{@link #isBIsReturnParameter() <em>BIs Return Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsReturnParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIS_RETURN_PARAMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBIsReturnParameter() <em>BIs Return Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsReturnParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean bIsReturnParameter = BIS_RETURN_PARAMETER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.FUNCTION_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.FUNCTION_PARAMETER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.FUNCTION_PARAMETER__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.FUNCTION_PARAMETER__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBIsReturnParameter() {
		return bIsReturnParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBIsReturnParameter(boolean newBIsReturnParameter) {
		boolean oldBIsReturnParameter = bIsReturnParameter;
		bIsReturnParameter = newBIsReturnParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.FUNCTION_PARAMETER__BIS_RETURN_PARAMETER, oldBIsReturnParameter, bIsReturnParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTServicePIMPackage.FUNCTION_PARAMETER__NAME:
				return getName();
			case RESTServicePIMPackage.FUNCTION_PARAMETER__TYPE:
				return getType();
			case RESTServicePIMPackage.FUNCTION_PARAMETER__IS_UNIQUE:
				return isIsUnique();
			case RESTServicePIMPackage.FUNCTION_PARAMETER__BIS_RETURN_PARAMETER:
				return isBIsReturnParameter();
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
			case RESTServicePIMPackage.FUNCTION_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.FUNCTION_PARAMETER__TYPE:
				setType((String)newValue);
				return;
			case RESTServicePIMPackage.FUNCTION_PARAMETER__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case RESTServicePIMPackage.FUNCTION_PARAMETER__BIS_RETURN_PARAMETER:
				setBIsReturnParameter((Boolean)newValue);
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
			case RESTServicePIMPackage.FUNCTION_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.FUNCTION_PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RESTServicePIMPackage.FUNCTION_PARAMETER__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case RESTServicePIMPackage.FUNCTION_PARAMETER__BIS_RETURN_PARAMETER:
				setBIsReturnParameter(BIS_RETURN_PARAMETER_EDEFAULT);
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
			case RESTServicePIMPackage.FUNCTION_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.FUNCTION_PARAMETER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case RESTServicePIMPackage.FUNCTION_PARAMETER__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case RESTServicePIMPackage.FUNCTION_PARAMETER__BIS_RETURN_PARAMETER:
				return bIsReturnParameter != BIS_RETURN_PARAMETER_EDEFAULT;
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
		result.append(", bIsReturnParameter: ");
		result.append(bIsReturnParameter);
		result.append(')');
		return result.toString();
	}

} //FunctionParameterImpl
