/**
 */
package ServicePIM.impl;

import ServicePIM.AlgoResourceController;
import ServicePIM.CRUDVerb;
import ServicePIM.HypermediaLink;
import ServicePIM.LinkType;
import ServicePIM.RESTServicePIMPackage;
import ServicePIM.ResourceController;
import ServicePIM.ResourceControllerManager;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypermedia Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.HypermediaLinkImpl#getLinkCRUDVerb <em>Link CRUD Verb</em>}</li>
 *   <li>{@link ServicePIM.impl.HypermediaLinkImpl#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link ServicePIM.impl.HypermediaLinkImpl#getHasTargetAlgoController <em>Has Target Algo Controller</em>}</li>
 *   <li>{@link ServicePIM.impl.HypermediaLinkImpl#getHasTargetRCManager <em>Has Target RC Manager</em>}</li>
 *   <li>{@link ServicePIM.impl.HypermediaLinkImpl#getHasTargetRController <em>Has Target RController</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HypermediaLinkImpl extends MinimalEObjectImpl.Container implements HypermediaLink {
	/**
	 * The default value of the '{@link #getLinkCRUDVerb() <em>Link CRUD Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkCRUDVerb()
	 * @generated
	 * @ordered
	 */
	protected static final CRUDVerb LINK_CRUD_VERB_EDEFAULT = CRUDVerb.CREATE;

	/**
	 * The cached value of the '{@link #getLinkCRUDVerb() <em>Link CRUD Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkCRUDVerb()
	 * @generated
	 * @ordered
	 */
	protected CRUDVerb linkCRUDVerb = LINK_CRUD_VERB_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final LinkType LINK_TYPE_EDEFAULT = LinkType.PARENT;

	/**
	 * The cached value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected LinkType linkType = LINK_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasTargetAlgoController() <em>Has Target Algo Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTargetAlgoController()
	 * @generated
	 * @ordered
	 */
	protected AlgoResourceController hasTargetAlgoController;

	/**
	 * The cached value of the '{@link #getHasTargetRCManager() <em>Has Target RC Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTargetRCManager()
	 * @generated
	 * @ordered
	 */
	protected ResourceControllerManager hasTargetRCManager;

	/**
	 * The cached value of the '{@link #getHasTargetRController() <em>Has Target RController</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTargetRController()
	 * @generated
	 * @ordered
	 */
	protected ResourceController hasTargetRController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HypermediaLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.HYPERMEDIA_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDVerb getLinkCRUDVerb() {
		return linkCRUDVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkCRUDVerb(CRUDVerb newLinkCRUDVerb) {
		CRUDVerb oldLinkCRUDVerb = linkCRUDVerb;
		linkCRUDVerb = newLinkCRUDVerb == null ? LINK_CRUD_VERB_EDEFAULT : newLinkCRUDVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.HYPERMEDIA_LINK__LINK_CRUD_VERB, oldLinkCRUDVerb, linkCRUDVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType getLinkType() {
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkType(LinkType newLinkType) {
		LinkType oldLinkType = linkType;
		linkType = newLinkType == null ? LINK_TYPE_EDEFAULT : newLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.HYPERMEDIA_LINK__LINK_TYPE, oldLinkType, linkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgoResourceController getHasTargetAlgoController() {
		if (hasTargetAlgoController != null && hasTargetAlgoController.eIsProxy()) {
			InternalEObject oldHasTargetAlgoController = (InternalEObject)hasTargetAlgoController;
			hasTargetAlgoController = (AlgoResourceController)eResolveProxy(oldHasTargetAlgoController);
			if (hasTargetAlgoController != oldHasTargetAlgoController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_ALGO_CONTROLLER, oldHasTargetAlgoController, hasTargetAlgoController));
			}
		}
		return hasTargetAlgoController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgoResourceController basicGetHasTargetAlgoController() {
		return hasTargetAlgoController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTargetAlgoController(AlgoResourceController newHasTargetAlgoController) {
		AlgoResourceController oldHasTargetAlgoController = hasTargetAlgoController;
		hasTargetAlgoController = newHasTargetAlgoController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_ALGO_CONTROLLER, oldHasTargetAlgoController, hasTargetAlgoController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceControllerManager getHasTargetRCManager() {
		if (hasTargetRCManager != null && hasTargetRCManager.eIsProxy()) {
			InternalEObject oldHasTargetRCManager = (InternalEObject)hasTargetRCManager;
			hasTargetRCManager = (ResourceControllerManager)eResolveProxy(oldHasTargetRCManager);
			if (hasTargetRCManager != oldHasTargetRCManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER, oldHasTargetRCManager, hasTargetRCManager));
			}
		}
		return hasTargetRCManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceControllerManager basicGetHasTargetRCManager() {
		return hasTargetRCManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTargetRCManager(ResourceControllerManager newHasTargetRCManager) {
		ResourceControllerManager oldHasTargetRCManager = hasTargetRCManager;
		hasTargetRCManager = newHasTargetRCManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER, oldHasTargetRCManager, hasTargetRCManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceController getHasTargetRController() {
		if (hasTargetRController != null && hasTargetRController.eIsProxy()) {
			InternalEObject oldHasTargetRController = (InternalEObject)hasTargetRController;
			hasTargetRController = (ResourceController)eResolveProxy(oldHasTargetRController);
			if (hasTargetRController != oldHasTargetRController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_RCONTROLLER, oldHasTargetRController, hasTargetRController));
			}
		}
		return hasTargetRController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceController basicGetHasTargetRController() {
		return hasTargetRController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTargetRController(ResourceController newHasTargetRController) {
		ResourceController oldHasTargetRController = hasTargetRController;
		hasTargetRController = newHasTargetRController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_RCONTROLLER, oldHasTargetRController, hasTargetRController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTServicePIMPackage.HYPERMEDIA_LINK__LINK_CRUD_VERB:
				return getLinkCRUDVerb();
			case RESTServicePIMPackage.HYPERMEDIA_LINK__LINK_TYPE:
				return getLinkType();
			case RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_ALGO_CONTROLLER:
				if (resolve) return getHasTargetAlgoController();
				return basicGetHasTargetAlgoController();
			case RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER:
				if (resolve) return getHasTargetRCManager();
				return basicGetHasTargetRCManager();
			case RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_RCONTROLLER:
				if (resolve) return getHasTargetRController();
				return basicGetHasTargetRController();
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
			case RESTServicePIMPackage.HYPERMEDIA_LINK__LINK_CRUD_VERB:
				setLinkCRUDVerb((CRUDVerb)newValue);
				return;
			case RESTServicePIMPackage.HYPERMEDIA_LINK__LINK_TYPE:
				setLinkType((LinkType)newValue);
				return;
			case RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_ALGO_CONTROLLER:
				setHasTargetAlgoController((AlgoResourceController)newValue);
				return;
			case RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER:
				setHasTargetRCManager((ResourceControllerManager)newValue);
				return;
			case RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_RCONTROLLER:
				setHasTargetRController((ResourceController)newValue);
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
			case RESTServicePIMPackage.HYPERMEDIA_LINK__LINK_CRUD_VERB:
				setLinkCRUDVerb(LINK_CRUD_VERB_EDEFAULT);
				return;
			case RESTServicePIMPackage.HYPERMEDIA_LINK__LINK_TYPE:
				setLinkType(LINK_TYPE_EDEFAULT);
				return;
			case RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_ALGO_CONTROLLER:
				setHasTargetAlgoController((AlgoResourceController)null);
				return;
			case RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER:
				setHasTargetRCManager((ResourceControllerManager)null);
				return;
			case RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_RCONTROLLER:
				setHasTargetRController((ResourceController)null);
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
			case RESTServicePIMPackage.HYPERMEDIA_LINK__LINK_CRUD_VERB:
				return linkCRUDVerb != LINK_CRUD_VERB_EDEFAULT;
			case RESTServicePIMPackage.HYPERMEDIA_LINK__LINK_TYPE:
				return linkType != LINK_TYPE_EDEFAULT;
			case RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_ALGO_CONTROLLER:
				return hasTargetAlgoController != null;
			case RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER:
				return hasTargetRCManager != null;
			case RESTServicePIMPackage.HYPERMEDIA_LINK__HAS_TARGET_RCONTROLLER:
				return hasTargetRController != null;
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
		result.append(" (linkCRUDVerb: ");
		result.append(linkCRUDVerb);
		result.append(", linkType: ");
		result.append(linkType);
		result.append(')');
		return result.toString();
	}

} //HypermediaLinkImpl
