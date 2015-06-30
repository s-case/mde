/**
 */
package ServicePIM.impl;

import ServicePIM.AlgoResourceController;
import ServicePIM.AlgoResourceModel;
import ServicePIM.DatabaseController;
import ServicePIM.RDBMSTable;
import ServicePIM.RESTServicePIMPackage;
import ServicePIM.RESTfulServicePIM;
import ServicePIM.ResourceController;
import ServicePIM.ResourceControllerManager;
import ServicePIM.ResourceModel;
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
 * An implementation of the model object '<em><b>RES Tful Service PIM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getHasResourceModel <em>Has Resource Model</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getHasResourceModelManager <em>Has Resource Model Manager</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getHasResourceController <em>Has Resource Controller</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getHasResourceControllerManager <em>Has Resource Controller Manager</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getHasAlgoResourceModel <em>Has Algo Resource Model</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getHasAlgoResourceController <em>Has Algo Resource Controller</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getHasRDBMSTable <em>Has RDBMS Table</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getHasDatabaseController <em>Has Database Controller</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RESTfulServicePIMImpl extends MinimalEObjectImpl.Container implements RESTfulServicePIM {
	/**
	 * The cached value of the '{@link #getHasResourceModel() <em>Has Resource Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResourceModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceModel> hasResourceModel;

	/**
	 * The cached value of the '{@link #getHasResourceModelManager() <em>Has Resource Model Manager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResourceModelManager()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceModelManager> hasResourceModelManager;

	/**
	 * The cached value of the '{@link #getHasResourceController() <em>Has Resource Controller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResourceController()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceController> hasResourceController;

	/**
	 * The cached value of the '{@link #getHasResourceControllerManager() <em>Has Resource Controller Manager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResourceControllerManager()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceControllerManager> hasResourceControllerManager;

	/**
	 * The cached value of the '{@link #getHasAlgoResourceModel() <em>Has Algo Resource Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAlgoResourceModel()
	 * @generated
	 * @ordered
	 */
	protected EList<AlgoResourceModel> hasAlgoResourceModel;

	/**
	 * The cached value of the '{@link #getHasAlgoResourceController() <em>Has Algo Resource Controller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAlgoResourceController()
	 * @generated
	 * @ordered
	 */
	protected EList<AlgoResourceController> hasAlgoResourceController;

	/**
	 * The cached value of the '{@link #getHasRDBMSTable() <em>Has RDBMS Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRDBMSTable()
	 * @generated
	 * @ordered
	 */
	protected EList<RDBMSTable> hasRDBMSTable;

	/**
	 * The cached value of the '{@link #getHasDatabaseController() <em>Has Database Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDatabaseController()
	 * @generated
	 * @ordered
	 */
	protected DatabaseController hasDatabaseController;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RESTfulServicePIMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceModel> getHasResourceModel() {
		if (hasResourceModel == null) {
			hasResourceModel = new EObjectContainmentEList<ResourceModel>(ResourceModel.class, this, RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL);
		}
		return hasResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceModelManager> getHasResourceModelManager() {
		if (hasResourceModelManager == null) {
			hasResourceModelManager = new EObjectContainmentEList<ResourceModelManager>(ResourceModelManager.class, this, RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL_MANAGER);
		}
		return hasResourceModelManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceController> getHasResourceController() {
		if (hasResourceController == null) {
			hasResourceController = new EObjectContainmentEList<ResourceController>(ResourceController.class, this, RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER);
		}
		return hasResourceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceControllerManager> getHasResourceControllerManager() {
		if (hasResourceControllerManager == null) {
			hasResourceControllerManager = new EObjectContainmentEList<ResourceControllerManager>(ResourceControllerManager.class, this, RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER_MANAGER);
		}
		return hasResourceControllerManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlgoResourceModel> getHasAlgoResourceModel() {
		if (hasAlgoResourceModel == null) {
			hasAlgoResourceModel = new EObjectContainmentEList<AlgoResourceModel>(AlgoResourceModel.class, this, RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_MODEL);
		}
		return hasAlgoResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlgoResourceController> getHasAlgoResourceController() {
		if (hasAlgoResourceController == null) {
			hasAlgoResourceController = new EObjectContainmentEList<AlgoResourceController>(AlgoResourceController.class, this, RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_CONTROLLER);
		}
		return hasAlgoResourceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDBMSTable> getHasRDBMSTable() {
		if (hasRDBMSTable == null) {
			hasRDBMSTable = new EObjectContainmentEList<RDBMSTable>(RDBMSTable.class, this, RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RDBMS_TABLE);
		}
		return hasRDBMSTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseController getHasDatabaseController() {
		return hasDatabaseController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasDatabaseController(DatabaseController newHasDatabaseController, NotificationChain msgs) {
		DatabaseController oldHasDatabaseController = hasDatabaseController;
		hasDatabaseController = newHasDatabaseController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_DATABASE_CONTROLLER, oldHasDatabaseController, newHasDatabaseController);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDatabaseController(DatabaseController newHasDatabaseController) {
		if (newHasDatabaseController != hasDatabaseController) {
			NotificationChain msgs = null;
			if (hasDatabaseController != null)
				msgs = ((InternalEObject)hasDatabaseController).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_DATABASE_CONTROLLER, null, msgs);
			if (newHasDatabaseController != null)
				msgs = ((InternalEObject)newHasDatabaseController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_DATABASE_CONTROLLER, null, msgs);
			msgs = basicSetHasDatabaseController(newHasDatabaseController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_DATABASE_CONTROLLER, newHasDatabaseController, newHasDatabaseController));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL:
				return ((InternalEList<?>)getHasResourceModel()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL_MANAGER:
				return ((InternalEList<?>)getHasResourceModelManager()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER:
				return ((InternalEList<?>)getHasResourceController()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER_MANAGER:
				return ((InternalEList<?>)getHasResourceControllerManager()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_MODEL:
				return ((InternalEList<?>)getHasAlgoResourceModel()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_CONTROLLER:
				return ((InternalEList<?>)getHasAlgoResourceController()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RDBMS_TABLE:
				return ((InternalEList<?>)getHasRDBMSTable()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_DATABASE_CONTROLLER:
				return basicSetHasDatabaseController(null, msgs);
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
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL:
				return getHasResourceModel();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL_MANAGER:
				return getHasResourceModelManager();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER:
				return getHasResourceController();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER_MANAGER:
				return getHasResourceControllerManager();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_MODEL:
				return getHasAlgoResourceModel();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_CONTROLLER:
				return getHasAlgoResourceController();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RDBMS_TABLE:
				return getHasRDBMSTable();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_DATABASE_CONTROLLER:
				return getHasDatabaseController();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME:
				return getName();
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
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL:
				getHasResourceModel().clear();
				getHasResourceModel().addAll((Collection<? extends ResourceModel>)newValue);
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL_MANAGER:
				getHasResourceModelManager().clear();
				getHasResourceModelManager().addAll((Collection<? extends ResourceModelManager>)newValue);
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER:
				getHasResourceController().clear();
				getHasResourceController().addAll((Collection<? extends ResourceController>)newValue);
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER_MANAGER:
				getHasResourceControllerManager().clear();
				getHasResourceControllerManager().addAll((Collection<? extends ResourceControllerManager>)newValue);
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_MODEL:
				getHasAlgoResourceModel().clear();
				getHasAlgoResourceModel().addAll((Collection<? extends AlgoResourceModel>)newValue);
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_CONTROLLER:
				getHasAlgoResourceController().clear();
				getHasAlgoResourceController().addAll((Collection<? extends AlgoResourceController>)newValue);
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RDBMS_TABLE:
				getHasRDBMSTable().clear();
				getHasRDBMSTable().addAll((Collection<? extends RDBMSTable>)newValue);
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_DATABASE_CONTROLLER:
				setHasDatabaseController((DatabaseController)newValue);
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME:
				setName((String)newValue);
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
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL:
				getHasResourceModel().clear();
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL_MANAGER:
				getHasResourceModelManager().clear();
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER:
				getHasResourceController().clear();
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER_MANAGER:
				getHasResourceControllerManager().clear();
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_MODEL:
				getHasAlgoResourceModel().clear();
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_CONTROLLER:
				getHasAlgoResourceController().clear();
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RDBMS_TABLE:
				getHasRDBMSTable().clear();
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_DATABASE_CONTROLLER:
				setHasDatabaseController((DatabaseController)null);
				return;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME:
				setName(NAME_EDEFAULT);
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
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL:
				return hasResourceModel != null && !hasResourceModel.isEmpty();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_MODEL_MANAGER:
				return hasResourceModelManager != null && !hasResourceModelManager.isEmpty();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER:
				return hasResourceController != null && !hasResourceController.isEmpty();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCE_CONTROLLER_MANAGER:
				return hasResourceControllerManager != null && !hasResourceControllerManager.isEmpty();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_MODEL:
				return hasAlgoResourceModel != null && !hasAlgoResourceModel.isEmpty();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ALGO_RESOURCE_CONTROLLER:
				return hasAlgoResourceController != null && !hasAlgoResourceController.isEmpty();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RDBMS_TABLE:
				return hasRDBMSTable != null && !hasRDBMSTable.isEmpty();
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_DATABASE_CONTROLLER:
				return hasDatabaseController != null;
			case RESTServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //RESTfulServicePIMImpl
