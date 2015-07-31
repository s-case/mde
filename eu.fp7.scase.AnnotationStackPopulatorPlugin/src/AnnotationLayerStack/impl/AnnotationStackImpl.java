/**
 */
package AnnotationLayerStack.impl;

import AnnotationLayerStack.AnnotationLayerStackPackage;
import AnnotationLayerStack.AnnotationStack;

import AuthenticationLayerPSM.AnnotationModel;

import ServicePSM.RESTfulServicePSM;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AnnotationLayerStack.impl.AnnotationStackImpl#getHasAuthenticationLayer <em>Has Authentication Layer</em>}</li>
 *   <li>{@link AnnotationLayerStack.impl.AnnotationStackImpl#isBHasAuthenticationAnnotation <em>BHas Authentication Annotation</em>}</li>
 *   <li>{@link AnnotationLayerStack.impl.AnnotationStackImpl#getHasCorePSM <em>Has Core PSM</em>}</li>
 *   <li>{@link AnnotationLayerStack.impl.AnnotationStackImpl#getHasSearchLayer <em>Has Search Layer</em>}</li>
 *   <li>{@link AnnotationLayerStack.impl.AnnotationStackImpl#isBHasSearchLayer <em>BHas Search Layer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationStackImpl extends MinimalEObjectImpl.Container implements AnnotationStack {
	/**
	 * The cached value of the '{@link #getHasAuthenticationLayer() <em>Has Authentication Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAuthenticationLayer()
	 * @generated
	 * @ordered
	 */
	protected AnnotationModel hasAuthenticationLayer;

	/**
	 * The default value of the '{@link #isBHasAuthenticationAnnotation() <em>BHas Authentication Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBHasAuthenticationAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BHAS_AUTHENTICATION_ANNOTATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBHasAuthenticationAnnotation() <em>BHas Authentication Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBHasAuthenticationAnnotation()
	 * @generated
	 * @ordered
	 */
	protected boolean bHasAuthenticationAnnotation = BHAS_AUTHENTICATION_ANNOTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasCorePSM() <em>Has Core PSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCorePSM()
	 * @generated
	 * @ordered
	 */
	protected RESTfulServicePSM hasCorePSM;

	/**
	 * The cached value of the '{@link #getHasSearchLayer() <em>Has Search Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSearchLayer()
	 * @generated
	 * @ordered
	 */
	protected SearchLayerPSM.AnnotationModel hasSearchLayer;

	/**
	 * The default value of the '{@link #isBHasSearchLayer() <em>BHas Search Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBHasSearchLayer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BHAS_SEARCH_LAYER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBHasSearchLayer() <em>BHas Search Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBHasSearchLayer()
	 * @generated
	 * @ordered
	 */
	protected boolean bHasSearchLayer = BHAS_SEARCH_LAYER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationStackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationLayerStackPackage.Literals.ANNOTATION_STACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationModel getHasAuthenticationLayer() {
		if (hasAuthenticationLayer != null && hasAuthenticationLayer.eIsProxy()) {
			InternalEObject oldHasAuthenticationLayer = (InternalEObject)hasAuthenticationLayer;
			hasAuthenticationLayer = (AnnotationModel)eResolveProxy(oldHasAuthenticationLayer);
			if (hasAuthenticationLayer != oldHasAuthenticationLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_AUTHENTICATION_LAYER, oldHasAuthenticationLayer, hasAuthenticationLayer));
			}
		}
		return hasAuthenticationLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationModel basicGetHasAuthenticationLayer() {
		return hasAuthenticationLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAuthenticationLayer(AnnotationModel newHasAuthenticationLayer) {
		AnnotationModel oldHasAuthenticationLayer = hasAuthenticationLayer;
		hasAuthenticationLayer = newHasAuthenticationLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_AUTHENTICATION_LAYER, oldHasAuthenticationLayer, hasAuthenticationLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBHasAuthenticationAnnotation() {
		return bHasAuthenticationAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHasAuthenticationAnnotation(boolean newBHasAuthenticationAnnotation) {
		boolean oldBHasAuthenticationAnnotation = bHasAuthenticationAnnotation;
		bHasAuthenticationAnnotation = newBHasAuthenticationAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationLayerStackPackage.ANNOTATION_STACK__BHAS_AUTHENTICATION_ANNOTATION, oldBHasAuthenticationAnnotation, bHasAuthenticationAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTfulServicePSM getHasCorePSM() {
		if (hasCorePSM != null && hasCorePSM.eIsProxy()) {
			InternalEObject oldHasCorePSM = (InternalEObject)hasCorePSM;
			hasCorePSM = (RESTfulServicePSM)eResolveProxy(oldHasCorePSM);
			if (hasCorePSM != oldHasCorePSM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_CORE_PSM, oldHasCorePSM, hasCorePSM));
			}
		}
		return hasCorePSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTfulServicePSM basicGetHasCorePSM() {
		return hasCorePSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasCorePSM(RESTfulServicePSM newHasCorePSM) {
		RESTfulServicePSM oldHasCorePSM = hasCorePSM;
		hasCorePSM = newHasCorePSM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_CORE_PSM, oldHasCorePSM, hasCorePSM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchLayerPSM.AnnotationModel getHasSearchLayer() {
		if (hasSearchLayer != null && hasSearchLayer.eIsProxy()) {
			InternalEObject oldHasSearchLayer = (InternalEObject)hasSearchLayer;
			hasSearchLayer = (SearchLayerPSM.AnnotationModel)eResolveProxy(oldHasSearchLayer);
			if (hasSearchLayer != oldHasSearchLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_SEARCH_LAYER, oldHasSearchLayer, hasSearchLayer));
			}
		}
		return hasSearchLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchLayerPSM.AnnotationModel basicGetHasSearchLayer() {
		return hasSearchLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSearchLayer(SearchLayerPSM.AnnotationModel newHasSearchLayer) {
		SearchLayerPSM.AnnotationModel oldHasSearchLayer = hasSearchLayer;
		hasSearchLayer = newHasSearchLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_SEARCH_LAYER, oldHasSearchLayer, hasSearchLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBHasSearchLayer() {
		return bHasSearchLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHasSearchLayer(boolean newBHasSearchLayer) {
		boolean oldBHasSearchLayer = bHasSearchLayer;
		bHasSearchLayer = newBHasSearchLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationLayerStackPackage.ANNOTATION_STACK__BHAS_SEARCH_LAYER, oldBHasSearchLayer, bHasSearchLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_AUTHENTICATION_LAYER:
				if (resolve) return getHasAuthenticationLayer();
				return basicGetHasAuthenticationLayer();
			case AnnotationLayerStackPackage.ANNOTATION_STACK__BHAS_AUTHENTICATION_ANNOTATION:
				return isBHasAuthenticationAnnotation();
			case AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_CORE_PSM:
				if (resolve) return getHasCorePSM();
				return basicGetHasCorePSM();
			case AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_SEARCH_LAYER:
				if (resolve) return getHasSearchLayer();
				return basicGetHasSearchLayer();
			case AnnotationLayerStackPackage.ANNOTATION_STACK__BHAS_SEARCH_LAYER:
				return isBHasSearchLayer();
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
			case AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_AUTHENTICATION_LAYER:
				setHasAuthenticationLayer((AnnotationModel)newValue);
				return;
			case AnnotationLayerStackPackage.ANNOTATION_STACK__BHAS_AUTHENTICATION_ANNOTATION:
				setBHasAuthenticationAnnotation((Boolean)newValue);
				return;
			case AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_CORE_PSM:
				setHasCorePSM((RESTfulServicePSM)newValue);
				return;
			case AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_SEARCH_LAYER:
				setHasSearchLayer((SearchLayerPSM.AnnotationModel)newValue);
				return;
			case AnnotationLayerStackPackage.ANNOTATION_STACK__BHAS_SEARCH_LAYER:
				setBHasSearchLayer((Boolean)newValue);
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
			case AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_AUTHENTICATION_LAYER:
				setHasAuthenticationLayer((AnnotationModel)null);
				return;
			case AnnotationLayerStackPackage.ANNOTATION_STACK__BHAS_AUTHENTICATION_ANNOTATION:
				setBHasAuthenticationAnnotation(BHAS_AUTHENTICATION_ANNOTATION_EDEFAULT);
				return;
			case AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_CORE_PSM:
				setHasCorePSM((RESTfulServicePSM)null);
				return;
			case AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_SEARCH_LAYER:
				setHasSearchLayer((SearchLayerPSM.AnnotationModel)null);
				return;
			case AnnotationLayerStackPackage.ANNOTATION_STACK__BHAS_SEARCH_LAYER:
				setBHasSearchLayer(BHAS_SEARCH_LAYER_EDEFAULT);
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
			case AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_AUTHENTICATION_LAYER:
				return hasAuthenticationLayer != null;
			case AnnotationLayerStackPackage.ANNOTATION_STACK__BHAS_AUTHENTICATION_ANNOTATION:
				return bHasAuthenticationAnnotation != BHAS_AUTHENTICATION_ANNOTATION_EDEFAULT;
			case AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_CORE_PSM:
				return hasCorePSM != null;
			case AnnotationLayerStackPackage.ANNOTATION_STACK__HAS_SEARCH_LAYER:
				return hasSearchLayer != null;
			case AnnotationLayerStackPackage.ANNOTATION_STACK__BHAS_SEARCH_LAYER:
				return bHasSearchLayer != BHAS_SEARCH_LAYER_EDEFAULT;
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
		result.append(" (bHasAuthenticationAnnotation: ");
		result.append(bHasAuthenticationAnnotation);
		result.append(", bHasSearchLayer: ");
		result.append(bHasSearchLayer);
		result.append(')');
		return result.toString();
	}

} //AnnotationStackImpl
