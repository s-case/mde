/**
 */
package ServicePIM.impl;

import ServicePIM.AlgoResourceController;
import ServicePIM.AlgoResourceModel;
import ServicePIM.RESTServicePIMPackage;
import ServicePIM.ResourceControllerCRUDActivity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algo Resource Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.AlgoResourceControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceControllerImpl#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceControllerImpl#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceControllerImpl#getHasAssociatedAlgoModel <em>Has Associated Algo Model</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceControllerImpl#getAlgoControllerHasCRUDActivity <em>Algo Controller Has CRUD Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlgoResourceControllerImpl extends MinimalEObjectImpl.Container implements AlgoResourceController {
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
	 * The default value of the '{@link #getParentName() <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentName() <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentName()
	 * @generated
	 * @ordered
	 */
	protected String parentName = PARENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getControllerURI() <em>Controller URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerURI()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControllerURI() <em>Controller URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerURI()
	 * @generated
	 * @ordered
	 */
	protected String controllerURI = CONTROLLER_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasAssociatedAlgoModel() <em>Has Associated Algo Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssociatedAlgoModel()
	 * @generated
	 * @ordered
	 */
	protected AlgoResourceModel hasAssociatedAlgoModel;

	/**
	 * The cached value of the '{@link #getAlgoControllerHasCRUDActivity() <em>Algo Controller Has CRUD Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgoControllerHasCRUDActivity()
	 * @generated
	 * @ordered
	 */
	protected ResourceControllerCRUDActivity algoControllerHasCRUDActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgoResourceControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.ALGO_RESOURCE_CONTROLLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentName() {
		return parentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentName(String newParentName) {
		String oldParentName = parentName;
		parentName = newParentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControllerURI() {
		return controllerURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerURI(String newControllerURI) {
		String oldControllerURI = controllerURI;
		controllerURI = newControllerURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI, oldControllerURI, controllerURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgoResourceModel getHasAssociatedAlgoModel() {
		if (hasAssociatedAlgoModel != null && hasAssociatedAlgoModel.eIsProxy()) {
			InternalEObject oldHasAssociatedAlgoModel = (InternalEObject)hasAssociatedAlgoModel;
			hasAssociatedAlgoModel = (AlgoResourceModel)eResolveProxy(oldHasAssociatedAlgoModel);
			if (hasAssociatedAlgoModel != oldHasAssociatedAlgoModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL, oldHasAssociatedAlgoModel, hasAssociatedAlgoModel));
			}
		}
		return hasAssociatedAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgoResourceModel basicGetHasAssociatedAlgoModel() {
		return hasAssociatedAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAssociatedAlgoModel(AlgoResourceModel newHasAssociatedAlgoModel) {
		AlgoResourceModel oldHasAssociatedAlgoModel = hasAssociatedAlgoModel;
		hasAssociatedAlgoModel = newHasAssociatedAlgoModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL, oldHasAssociatedAlgoModel, hasAssociatedAlgoModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceControllerCRUDActivity getAlgoControllerHasCRUDActivity() {
		return algoControllerHasCRUDActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgoControllerHasCRUDActivity(ResourceControllerCRUDActivity newAlgoControllerHasCRUDActivity, NotificationChain msgs) {
		ResourceControllerCRUDActivity oldAlgoControllerHasCRUDActivity = algoControllerHasCRUDActivity;
		algoControllerHasCRUDActivity = newAlgoControllerHasCRUDActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_CRUD_ACTIVITY, oldAlgoControllerHasCRUDActivity, newAlgoControllerHasCRUDActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgoControllerHasCRUDActivity(ResourceControllerCRUDActivity newAlgoControllerHasCRUDActivity) {
		if (newAlgoControllerHasCRUDActivity != algoControllerHasCRUDActivity) {
			NotificationChain msgs = null;
			if (algoControllerHasCRUDActivity != null)
				msgs = ((InternalEObject)algoControllerHasCRUDActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_CRUD_ACTIVITY, null, msgs);
			if (newAlgoControllerHasCRUDActivity != null)
				msgs = ((InternalEObject)newAlgoControllerHasCRUDActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_CRUD_ACTIVITY, null, msgs);
			msgs = basicSetAlgoControllerHasCRUDActivity(newAlgoControllerHasCRUDActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_CRUD_ACTIVITY, newAlgoControllerHasCRUDActivity, newAlgoControllerHasCRUDActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_CRUD_ACTIVITY:
				return basicSetAlgoControllerHasCRUDActivity(null, msgs);
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
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__NAME:
				return getName();
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__PARENT_NAME:
				return getParentName();
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI:
				return getControllerURI();
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL:
				if (resolve) return getHasAssociatedAlgoModel();
				return basicGetHasAssociatedAlgoModel();
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_CRUD_ACTIVITY:
				return getAlgoControllerHasCRUDActivity();
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
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__PARENT_NAME:
				setParentName((String)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI:
				setControllerURI((String)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL:
				setHasAssociatedAlgoModel((AlgoResourceModel)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_CRUD_ACTIVITY:
				setAlgoControllerHasCRUDActivity((ResourceControllerCRUDActivity)newValue);
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
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI:
				setControllerURI(CONTROLLER_URI_EDEFAULT);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL:
				setHasAssociatedAlgoModel((AlgoResourceModel)null);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_CRUD_ACTIVITY:
				setAlgoControllerHasCRUDActivity((ResourceControllerCRUDActivity)null);
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
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI:
				return CONTROLLER_URI_EDEFAULT == null ? controllerURI != null : !CONTROLLER_URI_EDEFAULT.equals(controllerURI);
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL:
				return hasAssociatedAlgoModel != null;
			case RESTServicePIMPackage.ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_CRUD_ACTIVITY:
				return algoControllerHasCRUDActivity != null;
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
		result.append(", parentName: ");
		result.append(parentName);
		result.append(", controllerURI: ");
		result.append(controllerURI);
		result.append(')');
		return result.toString();
	}

} //AlgoResourceControllerImpl
