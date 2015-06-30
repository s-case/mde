/**
 */
package ServicePIM.impl;

import ServicePIM.RESTServicePIMPackage;
import ServicePIM.ResourceController;
import ServicePIM.ResourceControllerCRUDActivity;
import ServicePIM.ResourceModel;

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
 * An implementation of the model object '<em><b>Resource Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.ResourceControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceControllerImpl#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceControllerImpl#getHasAssociatedRModel <em>Has Associated RModel</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceControllerImpl#getRControllerHasCRUDActivity <em>RController Has CRUD Activity</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceControllerImpl#getParentName <em>Parent Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceControllerImpl extends MinimalEObjectImpl.Container implements ResourceController {
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
	 * The cached value of the '{@link #getHasAssociatedRModel() <em>Has Associated RModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssociatedRModel()
	 * @generated
	 * @ordered
	 */
	protected ResourceModel hasAssociatedRModel;

	/**
	 * The cached value of the '{@link #getRControllerHasCRUDActivity() <em>RController Has CRUD Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRControllerHasCRUDActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceControllerCRUDActivity> rControllerHasCRUDActivity;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER__CONTROLLER_URI, oldControllerURI, controllerURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModel getHasAssociatedRModel() {
		if (hasAssociatedRModel != null && hasAssociatedRModel.eIsProxy()) {
			InternalEObject oldHasAssociatedRModel = (InternalEObject)hasAssociatedRModel;
			hasAssociatedRModel = (ResourceModel)eResolveProxy(oldHasAssociatedRModel);
			if (hasAssociatedRModel != oldHasAssociatedRModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.RESOURCE_CONTROLLER__HAS_ASSOCIATED_RMODEL, oldHasAssociatedRModel, hasAssociatedRModel));
			}
		}
		return hasAssociatedRModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModel basicGetHasAssociatedRModel() {
		return hasAssociatedRModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAssociatedRModel(ResourceModel newHasAssociatedRModel) {
		ResourceModel oldHasAssociatedRModel = hasAssociatedRModel;
		hasAssociatedRModel = newHasAssociatedRModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER__HAS_ASSOCIATED_RMODEL, oldHasAssociatedRModel, hasAssociatedRModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceControllerCRUDActivity> getRControllerHasCRUDActivity() {
		if (rControllerHasCRUDActivity == null) {
			rControllerHasCRUDActivity = new EObjectContainmentEList<ResourceControllerCRUDActivity>(ResourceControllerCRUDActivity.class, this, RESTServicePIMPackage.RESOURCE_CONTROLLER__RCONTROLLER_HAS_CRUD_ACTIVITY);
		}
		return rControllerHasCRUDActivity;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__RCONTROLLER_HAS_CRUD_ACTIVITY:
				return ((InternalEList<?>)getRControllerHasCRUDActivity()).basicRemove(otherEnd, msgs);
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
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__NAME:
				return getName();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__CONTROLLER_URI:
				return getControllerURI();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__HAS_ASSOCIATED_RMODEL:
				if (resolve) return getHasAssociatedRModel();
				return basicGetHasAssociatedRModel();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__RCONTROLLER_HAS_CRUD_ACTIVITY:
				return getRControllerHasCRUDActivity();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__PARENT_NAME:
				return getParentName();
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
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__CONTROLLER_URI:
				setControllerURI((String)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__HAS_ASSOCIATED_RMODEL:
				setHasAssociatedRModel((ResourceModel)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__RCONTROLLER_HAS_CRUD_ACTIVITY:
				getRControllerHasCRUDActivity().clear();
				getRControllerHasCRUDActivity().addAll((Collection<? extends ResourceControllerCRUDActivity>)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__PARENT_NAME:
				setParentName((String)newValue);
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
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__CONTROLLER_URI:
				setControllerURI(CONTROLLER_URI_EDEFAULT);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__HAS_ASSOCIATED_RMODEL:
				setHasAssociatedRModel((ResourceModel)null);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__RCONTROLLER_HAS_CRUD_ACTIVITY:
				getRControllerHasCRUDActivity().clear();
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
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
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__CONTROLLER_URI:
				return CONTROLLER_URI_EDEFAULT == null ? controllerURI != null : !CONTROLLER_URI_EDEFAULT.equals(controllerURI);
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__HAS_ASSOCIATED_RMODEL:
				return hasAssociatedRModel != null;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__RCONTROLLER_HAS_CRUD_ACTIVITY:
				return rControllerHasCRUDActivity != null && !rControllerHasCRUDActivity.isEmpty();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
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
		result.append(", controllerURI: ");
		result.append(controllerURI);
		result.append(", parentName: ");
		result.append(parentName);
		result.append(')');
		return result.toString();
	}

} //ResourceControllerImpl
