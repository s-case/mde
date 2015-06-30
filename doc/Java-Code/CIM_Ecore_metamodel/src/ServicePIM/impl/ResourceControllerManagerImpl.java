/**
 */
package ServicePIM.impl;

import ServicePIM.RESTServicePIMPackage;
import ServicePIM.ResourceControllerCRUDActivity;
import ServicePIM.ResourceControllerManager;
import ServicePIM.ResourceModelManager;

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
 * An implementation of the model object '<em><b>Resource Controller Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.ResourceControllerManagerImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceControllerManagerImpl#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceControllerManagerImpl#getHasAssociatedRMManager <em>Has Associated RM Manager</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceControllerManagerImpl#getRCManagerHasCRUDActivity <em>RC Manager Has CRUD Activity</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceControllerManagerImpl#getParentName <em>Parent Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceControllerManagerImpl extends MinimalEObjectImpl.Container implements ResourceControllerManager {
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
	 * The cached value of the '{@link #getHasAssociatedRMManager() <em>Has Associated RM Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssociatedRMManager()
	 * @generated
	 * @ordered
	 */
	protected ResourceModelManager hasAssociatedRMManager;

	/**
	 * The cached value of the '{@link #getRCManagerHasCRUDActivity() <em>RC Manager Has CRUD Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCManagerHasCRUDActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceControllerCRUDActivity> rCManagerHasCRUDActivity;

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
	protected ResourceControllerManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER_MANAGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI, oldControllerURI, controllerURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModelManager getHasAssociatedRMManager() {
		if (hasAssociatedRMManager != null && hasAssociatedRMManager.eIsProxy()) {
			InternalEObject oldHasAssociatedRMManager = (InternalEObject)hasAssociatedRMManager;
			hasAssociatedRMManager = (ResourceModelManager)eResolveProxy(oldHasAssociatedRMManager);
			if (hasAssociatedRMManager != oldHasAssociatedRMManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER, oldHasAssociatedRMManager, hasAssociatedRMManager));
			}
		}
		return hasAssociatedRMManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModelManager basicGetHasAssociatedRMManager() {
		return hasAssociatedRMManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAssociatedRMManager(ResourceModelManager newHasAssociatedRMManager) {
		ResourceModelManager oldHasAssociatedRMManager = hasAssociatedRMManager;
		hasAssociatedRMManager = newHasAssociatedRMManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER, oldHasAssociatedRMManager, hasAssociatedRMManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceControllerCRUDActivity> getRCManagerHasCRUDActivity() {
		if (rCManagerHasCRUDActivity == null) {
			rCManagerHasCRUDActivity = new EObjectContainmentEList<ResourceControllerCRUDActivity>(ResourceControllerCRUDActivity.class, this, RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_HAS_CRUD_ACTIVITY);
		}
		return rCManagerHasCRUDActivity;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_HAS_CRUD_ACTIVITY:
				return ((InternalEList<?>)getRCManagerHasCRUDActivity()).basicRemove(otherEnd, msgs);
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
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__NAME:
				return getName();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI:
				return getControllerURI();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER:
				if (resolve) return getHasAssociatedRMManager();
				return basicGetHasAssociatedRMManager();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_HAS_CRUD_ACTIVITY:
				return getRCManagerHasCRUDActivity();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__PARENT_NAME:
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
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI:
				setControllerURI((String)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER:
				setHasAssociatedRMManager((ResourceModelManager)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_HAS_CRUD_ACTIVITY:
				getRCManagerHasCRUDActivity().clear();
				getRCManagerHasCRUDActivity().addAll((Collection<? extends ResourceControllerCRUDActivity>)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__PARENT_NAME:
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
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI:
				setControllerURI(CONTROLLER_URI_EDEFAULT);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER:
				setHasAssociatedRMManager((ResourceModelManager)null);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_HAS_CRUD_ACTIVITY:
				getRCManagerHasCRUDActivity().clear();
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__PARENT_NAME:
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
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI:
				return CONTROLLER_URI_EDEFAULT == null ? controllerURI != null : !CONTROLLER_URI_EDEFAULT.equals(controllerURI);
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER:
				return hasAssociatedRMManager != null;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_HAS_CRUD_ACTIVITY:
				return rCManagerHasCRUDActivity != null && !rCManagerHasCRUDActivity.isEmpty();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_MANAGER__PARENT_NAME:
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

} //ResourceControllerManagerImpl
