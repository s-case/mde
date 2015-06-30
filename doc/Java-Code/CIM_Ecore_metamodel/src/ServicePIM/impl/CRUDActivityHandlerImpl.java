/**
 */
package ServicePIM.impl;

import ServicePIM.CRUDActivityHandler;
import ServicePIM.CRUDVerb;
import ServicePIM.CreateHypermediaPIMFunction;
import ServicePIM.DatabaseController;
import ServicePIM.RESTServicePIMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CRUD Activity Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.CRUDActivityHandlerImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.CRUDActivityHandlerImpl#getCrudVerb <em>Crud Verb</em>}</li>
 *   <li>{@link ServicePIM.impl.CRUDActivityHandlerImpl#getHasHypermediaFunction <em>Has Hypermedia Function</em>}</li>
 *   <li>{@link ServicePIM.impl.CRUDActivityHandlerImpl#getUsesDBController <em>Uses DB Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CRUDActivityHandlerImpl extends MinimalEObjectImpl.Container implements CRUDActivityHandler {
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
	 * The cached value of the '{@link #getHasHypermediaFunction() <em>Has Hypermedia Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHypermediaFunction()
	 * @generated
	 * @ordered
	 */
	protected CreateHypermediaPIMFunction hasHypermediaFunction;

	/**
	 * The cached value of the '{@link #getUsesDBController() <em>Uses DB Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesDBController()
	 * @generated
	 * @ordered
	 */
	protected DatabaseController usesDBController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CRUDActivityHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.CRUD_ACTIVITY_HANDLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__CRUD_VERB, oldCrudVerb, crudVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateHypermediaPIMFunction getHasHypermediaFunction() {
		return hasHypermediaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasHypermediaFunction(CreateHypermediaPIMFunction newHasHypermediaFunction, NotificationChain msgs) {
		CreateHypermediaPIMFunction oldHasHypermediaFunction = hasHypermediaFunction;
		hasHypermediaFunction = newHasHypermediaFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION, oldHasHypermediaFunction, newHasHypermediaFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasHypermediaFunction(CreateHypermediaPIMFunction newHasHypermediaFunction) {
		if (newHasHypermediaFunction != hasHypermediaFunction) {
			NotificationChain msgs = null;
			if (hasHypermediaFunction != null)
				msgs = ((InternalEObject)hasHypermediaFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION, null, msgs);
			if (newHasHypermediaFunction != null)
				msgs = ((InternalEObject)newHasHypermediaFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION, null, msgs);
			msgs = basicSetHasHypermediaFunction(newHasHypermediaFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION, newHasHypermediaFunction, newHasHypermediaFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseController getUsesDBController() {
		if (usesDBController != null && usesDBController.eIsProxy()) {
			InternalEObject oldUsesDBController = (InternalEObject)usesDBController;
			usesDBController = (DatabaseController)eResolveProxy(oldUsesDBController);
			if (usesDBController != oldUsesDBController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__USES_DB_CONTROLLER, oldUsesDBController, usesDBController));
			}
		}
		return usesDBController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseController basicGetUsesDBController() {
		return usesDBController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesDBController(DatabaseController newUsesDBController) {
		DatabaseController oldUsesDBController = usesDBController;
		usesDBController = newUsesDBController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__USES_DB_CONTROLLER, oldUsesDBController, usesDBController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				return basicSetHasHypermediaFunction(null, msgs);
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
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__NAME:
				return getName();
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__CRUD_VERB:
				return getCrudVerb();
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				return getHasHypermediaFunction();
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__USES_DB_CONTROLLER:
				if (resolve) return getUsesDBController();
				return basicGetUsesDBController();
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
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__CRUD_VERB:
				setCrudVerb((CRUDVerb)newValue);
				return;
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				setHasHypermediaFunction((CreateHypermediaPIMFunction)newValue);
				return;
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__USES_DB_CONTROLLER:
				setUsesDBController((DatabaseController)newValue);
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
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__CRUD_VERB:
				setCrudVerb(CRUD_VERB_EDEFAULT);
				return;
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				setHasHypermediaFunction((CreateHypermediaPIMFunction)null);
				return;
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__USES_DB_CONTROLLER:
				setUsesDBController((DatabaseController)null);
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
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__CRUD_VERB:
				return crudVerb != CRUD_VERB_EDEFAULT;
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				return hasHypermediaFunction != null;
			case RESTServicePIMPackage.CRUD_ACTIVITY_HANDLER__USES_DB_CONTROLLER:
				return usesDBController != null;
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
		result.append(", crudVerb: ");
		result.append(crudVerb);
		result.append(')');
		return result.toString();
	}

} //CRUDActivityHandlerImpl
