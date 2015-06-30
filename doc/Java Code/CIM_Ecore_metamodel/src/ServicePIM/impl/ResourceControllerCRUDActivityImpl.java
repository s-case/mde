/**
 */
package ServicePIM.impl;

import ServicePIM.CRUDActivityHandler;
import ServicePIM.CRUDVerb;
import ServicePIM.RDBMSActivity;
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
 * An implementation of the model object '<em><b>Resource Controller CRUD Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.ResourceControllerCRUDActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceControllerCRUDActivityImpl#getActivityURI <em>Activity URI</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceControllerCRUDActivityImpl#getCrudVerb <em>Crud Verb</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceControllerCRUDActivityImpl#getHasCRUDActivityHandler <em>Has CRUD Activity Handler</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceControllerCRUDActivityImpl#getIsMappedToRDBMSActivity <em>Is Mapped To RDBMS Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceControllerCRUDActivityImpl extends MinimalEObjectImpl.Container implements ResourceControllerCRUDActivity {
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
	 * The default value of the '{@link #getActivityURI() <em>Activity URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityURI() <em>Activity URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityURI()
	 * @generated
	 * @ordered
	 */
	protected String activityURI = ACTIVITY_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrudVerb() <em>Crud Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrudVerb()
	 * @generated
	 * @ordered
	 */
	protected static final CRUDVerb CRUD_VERB_EDEFAULT = CRUDVerb.CREATE;

	/**
	 * The cached value of the '{@link #getCrudVerb() <em>Crud Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrudVerb()
	 * @generated
	 * @ordered
	 */
	protected CRUDVerb crudVerb = CRUD_VERB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasCRUDActivityHandler() <em>Has CRUD Activity Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCRUDActivityHandler()
	 * @generated
	 * @ordered
	 */
	protected CRUDActivityHandler hasCRUDActivityHandler;

	/**
	 * The cached value of the '{@link #getIsMappedToRDBMSActivity() <em>Is Mapped To RDBMS Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMappedToRDBMSActivity()
	 * @generated
	 * @ordered
	 */
	protected RDBMSActivity isMappedToRDBMSActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceControllerCRUDActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.RESOURCE_CONTROLLER_CRUD_ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityURI() {
		return activityURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityURI(String newActivityURI) {
		String oldActivityURI = activityURI;
		activityURI = newActivityURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__ACTIVITY_URI, oldActivityURI, activityURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDVerb getCrudVerb() {
		return crudVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrudVerb(CRUDVerb newCrudVerb) {
		CRUDVerb oldCrudVerb = crudVerb;
		crudVerb = newCrudVerb == null ? CRUD_VERB_EDEFAULT : newCrudVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__CRUD_VERB, oldCrudVerb, crudVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDActivityHandler getHasCRUDActivityHandler() {
		return hasCRUDActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasCRUDActivityHandler(CRUDActivityHandler newHasCRUDActivityHandler, NotificationChain msgs) {
		CRUDActivityHandler oldHasCRUDActivityHandler = hasCRUDActivityHandler;
		hasCRUDActivityHandler = newHasCRUDActivityHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__HAS_CRUD_ACTIVITY_HANDLER, oldHasCRUDActivityHandler, newHasCRUDActivityHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasCRUDActivityHandler(CRUDActivityHandler newHasCRUDActivityHandler) {
		if (newHasCRUDActivityHandler != hasCRUDActivityHandler) {
			NotificationChain msgs = null;
			if (hasCRUDActivityHandler != null)
				msgs = ((InternalEObject)hasCRUDActivityHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__HAS_CRUD_ACTIVITY_HANDLER, null, msgs);
			if (newHasCRUDActivityHandler != null)
				msgs = ((InternalEObject)newHasCRUDActivityHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__HAS_CRUD_ACTIVITY_HANDLER, null, msgs);
			msgs = basicSetHasCRUDActivityHandler(newHasCRUDActivityHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__HAS_CRUD_ACTIVITY_HANDLER, newHasCRUDActivityHandler, newHasCRUDActivityHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMSActivity getIsMappedToRDBMSActivity() {
		if (isMappedToRDBMSActivity != null && isMappedToRDBMSActivity.eIsProxy()) {
			InternalEObject oldIsMappedToRDBMSActivity = (InternalEObject)isMappedToRDBMSActivity;
			isMappedToRDBMSActivity = (RDBMSActivity)eResolveProxy(oldIsMappedToRDBMSActivity);
			if (isMappedToRDBMSActivity != oldIsMappedToRDBMSActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__IS_MAPPED_TO_RDBMS_ACTIVITY, oldIsMappedToRDBMSActivity, isMappedToRDBMSActivity));
			}
		}
		return isMappedToRDBMSActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMSActivity basicGetIsMappedToRDBMSActivity() {
		return isMappedToRDBMSActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMappedToRDBMSActivity(RDBMSActivity newIsMappedToRDBMSActivity) {
		RDBMSActivity oldIsMappedToRDBMSActivity = isMappedToRDBMSActivity;
		isMappedToRDBMSActivity = newIsMappedToRDBMSActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__IS_MAPPED_TO_RDBMS_ACTIVITY, oldIsMappedToRDBMSActivity, isMappedToRDBMSActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__HAS_CRUD_ACTIVITY_HANDLER:
				return basicSetHasCRUDActivityHandler(null, msgs);
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
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__NAME:
				return getName();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__ACTIVITY_URI:
				return getActivityURI();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__CRUD_VERB:
				return getCrudVerb();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__HAS_CRUD_ACTIVITY_HANDLER:
				return getHasCRUDActivityHandler();
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__IS_MAPPED_TO_RDBMS_ACTIVITY:
				if (resolve) return getIsMappedToRDBMSActivity();
				return basicGetIsMappedToRDBMSActivity();
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
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__ACTIVITY_URI:
				setActivityURI((String)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__CRUD_VERB:
				setCrudVerb((CRUDVerb)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__HAS_CRUD_ACTIVITY_HANDLER:
				setHasCRUDActivityHandler((CRUDActivityHandler)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__IS_MAPPED_TO_RDBMS_ACTIVITY:
				setIsMappedToRDBMSActivity((RDBMSActivity)newValue);
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
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__ACTIVITY_URI:
				setActivityURI(ACTIVITY_URI_EDEFAULT);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__CRUD_VERB:
				setCrudVerb(CRUD_VERB_EDEFAULT);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__HAS_CRUD_ACTIVITY_HANDLER:
				setHasCRUDActivityHandler((CRUDActivityHandler)null);
				return;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__IS_MAPPED_TO_RDBMS_ACTIVITY:
				setIsMappedToRDBMSActivity((RDBMSActivity)null);
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
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__ACTIVITY_URI:
				return ACTIVITY_URI_EDEFAULT == null ? activityURI != null : !ACTIVITY_URI_EDEFAULT.equals(activityURI);
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__CRUD_VERB:
				return crudVerb != CRUD_VERB_EDEFAULT;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__HAS_CRUD_ACTIVITY_HANDLER:
				return hasCRUDActivityHandler != null;
			case RESTServicePIMPackage.RESOURCE_CONTROLLER_CRUD_ACTIVITY__IS_MAPPED_TO_RDBMS_ACTIVITY:
				return isMappedToRDBMSActivity != null;
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
		result.append(", activityURI: ");
		result.append(activityURI);
		result.append(", crudVerb: ");
		result.append(crudVerb);
		result.append(')');
		return result.toString();
	}

} //ResourceControllerCRUDActivityImpl
