/**
 */
package ServicePIM.impl;

import ServicePIM.CreateHypermediaPIMFunction;
import ServicePIM.HypermediaLink;
import ServicePIM.RESTServicePIMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Hypermedia PIM Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.CreateHypermediaPIMFunctionImpl#getHasHypermediaLink <em>Has Hypermedia Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateHypermediaPIMFunctionImpl extends MinimalEObjectImpl.Container implements CreateHypermediaPIMFunction {
	/**
	 * The cached value of the '{@link #getHasHypermediaLink() <em>Has Hypermedia Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHypermediaLink()
	 * @generated
	 * @ordered
	 */
	protected EList<HypermediaLink> hasHypermediaLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateHypermediaPIMFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.CREATE_HYPERMEDIA_PIM_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HypermediaLink> getHasHypermediaLink() {
		if (hasHypermediaLink == null) {
			hasHypermediaLink = new EObjectContainmentEList<HypermediaLink>(HypermediaLink.class, this, RESTServicePIMPackage.CREATE_HYPERMEDIA_PIM_FUNCTION__HAS_HYPERMEDIA_LINK);
		}
		return hasHypermediaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTServicePIMPackage.CREATE_HYPERMEDIA_PIM_FUNCTION__HAS_HYPERMEDIA_LINK:
				return ((InternalEList<?>)getHasHypermediaLink()).basicRemove(otherEnd, msgs);
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
			case RESTServicePIMPackage.CREATE_HYPERMEDIA_PIM_FUNCTION__HAS_HYPERMEDIA_LINK:
				return getHasHypermediaLink();
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
			case RESTServicePIMPackage.CREATE_HYPERMEDIA_PIM_FUNCTION__HAS_HYPERMEDIA_LINK:
				getHasHypermediaLink().clear();
				getHasHypermediaLink().addAll((Collection<? extends HypermediaLink>)newValue);
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
			case RESTServicePIMPackage.CREATE_HYPERMEDIA_PIM_FUNCTION__HAS_HYPERMEDIA_LINK:
				getHasHypermediaLink().clear();
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
			case RESTServicePIMPackage.CREATE_HYPERMEDIA_PIM_FUNCTION__HAS_HYPERMEDIA_LINK:
				return hasHypermediaLink != null && !hasHypermediaLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CreateHypermediaPIMFunctionImpl
