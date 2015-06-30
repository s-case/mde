/**
 */
package ServicePIM.impl;

import ServicePIM.GetterFunction;
import ServicePIM.PIMComponentProperty;
import ServicePIM.RESTServicePIMPackage;
import ServicePIM.RepresentationMarshallingFunction;
import ServicePIM.RepresentationParseFunction;
import ServicePIM.ResourceInputRepresentation;
import ServicePIM.ResourceModel;
import ServicePIM.ResourceModelManager;
import ServicePIM.ResourceOutputRepresentation;
import ServicePIM.SetterFunction;

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
 * An implementation of the model object '<em><b>Resource Model Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.ResourceModelManagerImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelManagerImpl#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelManagerImpl#getHasRelatedModel <em>Has Related Model</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelManagerImpl#getRMManagerHasInputRepresentation <em>RM Manager Has Input Representation</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelManagerImpl#getRMManagerHasOutputRepresentation <em>RM Manager Has Output Representation</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelManagerImpl#getHasRMManagerProperty <em>Has RM Manager Property</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelManagerImpl#getRMManagerHasSetter <em>RM Manager Has Setter</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelManagerImpl#getRMManagerHasGetter <em>RM Manager Has Getter</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelManagerImpl#getRMManagerHasParseFunction <em>RM Manager Has Parse Function</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelManagerImpl#getRMManagerHasMarshallingFunction <em>RM Manager Has Marshalling Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceModelManagerImpl extends MinimalEObjectImpl.Container implements ResourceModelManager {
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
	 * The cached value of the '{@link #getHasRelatedModel() <em>Has Related Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelatedModel()
	 * @generated
	 * @ordered
	 */
	protected ResourceModel hasRelatedModel;

	/**
	 * The cached value of the '{@link #getRMManagerHasInputRepresentation() <em>RM Manager Has Input Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMManagerHasInputRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInputRepresentation> rMManagerHasInputRepresentation;

	/**
	 * The cached value of the '{@link #getRMManagerHasOutputRepresentation() <em>RM Manager Has Output Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMManagerHasOutputRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceOutputRepresentation> rMManagerHasOutputRepresentation;

	/**
	 * The cached value of the '{@link #getHasRMManagerProperty() <em>Has RM Manager Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRMManagerProperty()
	 * @generated
	 * @ordered
	 */
	protected PIMComponentProperty hasRMManagerProperty;

	/**
	 * The cached value of the '{@link #getRMManagerHasSetter() <em>RM Manager Has Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMManagerHasSetter()
	 * @generated
	 * @ordered
	 */
	protected SetterFunction rMManagerHasSetter;

	/**
	 * The cached value of the '{@link #getRMManagerHasGetter() <em>RM Manager Has Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMManagerHasGetter()
	 * @generated
	 * @ordered
	 */
	protected GetterFunction rMManagerHasGetter;

	/**
	 * The cached value of the '{@link #getRMManagerHasParseFunction() <em>RM Manager Has Parse Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMManagerHasParseFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentationParseFunction> rMManagerHasParseFunction;

	/**
	 * The cached value of the '{@link #getRMManagerHasMarshallingFunction() <em>RM Manager Has Marshalling Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMManagerHasMarshallingFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentationMarshallingFunction> rMManagerHasMarshallingFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceModelManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.RESOURCE_MODEL_MANAGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModel getHasRelatedModel() {
		if (hasRelatedModel != null && hasRelatedModel.eIsProxy()) {
			InternalEObject oldHasRelatedModel = (InternalEObject)hasRelatedModel;
			hasRelatedModel = (ResourceModel)eResolveProxy(oldHasRelatedModel);
			if (hasRelatedModel != oldHasRelatedModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RELATED_MODEL, oldHasRelatedModel, hasRelatedModel));
			}
		}
		return hasRelatedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModel basicGetHasRelatedModel() {
		return hasRelatedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRelatedModel(ResourceModel newHasRelatedModel) {
		ResourceModel oldHasRelatedModel = hasRelatedModel;
		hasRelatedModel = newHasRelatedModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RELATED_MODEL, oldHasRelatedModel, hasRelatedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInputRepresentation> getRMManagerHasInputRepresentation() {
		if (rMManagerHasInputRepresentation == null) {
			rMManagerHasInputRepresentation = new EObjectContainmentEList<ResourceInputRepresentation>(ResourceInputRepresentation.class, this, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_INPUT_REPRESENTATION);
		}
		return rMManagerHasInputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceOutputRepresentation> getRMManagerHasOutputRepresentation() {
		if (rMManagerHasOutputRepresentation == null) {
			rMManagerHasOutputRepresentation = new EObjectContainmentEList<ResourceOutputRepresentation>(ResourceOutputRepresentation.class, this, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_OUTPUT_REPRESENTATION);
		}
		return rMManagerHasOutputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMComponentProperty getHasRMManagerProperty() {
		return hasRMManagerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasRMManagerProperty(PIMComponentProperty newHasRMManagerProperty, NotificationChain msgs) {
		PIMComponentProperty oldHasRMManagerProperty = hasRMManagerProperty;
		hasRMManagerProperty = newHasRMManagerProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RM_MANAGER_PROPERTY, oldHasRMManagerProperty, newHasRMManagerProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRMManagerProperty(PIMComponentProperty newHasRMManagerProperty) {
		if (newHasRMManagerProperty != hasRMManagerProperty) {
			NotificationChain msgs = null;
			if (hasRMManagerProperty != null)
				msgs = ((InternalEObject)hasRMManagerProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RM_MANAGER_PROPERTY, null, msgs);
			if (newHasRMManagerProperty != null)
				msgs = ((InternalEObject)newHasRMManagerProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RM_MANAGER_PROPERTY, null, msgs);
			msgs = basicSetHasRMManagerProperty(newHasRMManagerProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RM_MANAGER_PROPERTY, newHasRMManagerProperty, newHasRMManagerProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetterFunction getRMManagerHasSetter() {
		return rMManagerHasSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRMManagerHasSetter(SetterFunction newRMManagerHasSetter, NotificationChain msgs) {
		SetterFunction oldRMManagerHasSetter = rMManagerHasSetter;
		rMManagerHasSetter = newRMManagerHasSetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_SETTER, oldRMManagerHasSetter, newRMManagerHasSetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRMManagerHasSetter(SetterFunction newRMManagerHasSetter) {
		if (newRMManagerHasSetter != rMManagerHasSetter) {
			NotificationChain msgs = null;
			if (rMManagerHasSetter != null)
				msgs = ((InternalEObject)rMManagerHasSetter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_SETTER, null, msgs);
			if (newRMManagerHasSetter != null)
				msgs = ((InternalEObject)newRMManagerHasSetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_SETTER, null, msgs);
			msgs = basicSetRMManagerHasSetter(newRMManagerHasSetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_SETTER, newRMManagerHasSetter, newRMManagerHasSetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetterFunction getRMManagerHasGetter() {
		return rMManagerHasGetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRMManagerHasGetter(GetterFunction newRMManagerHasGetter, NotificationChain msgs) {
		GetterFunction oldRMManagerHasGetter = rMManagerHasGetter;
		rMManagerHasGetter = newRMManagerHasGetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_GETTER, oldRMManagerHasGetter, newRMManagerHasGetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRMManagerHasGetter(GetterFunction newRMManagerHasGetter) {
		if (newRMManagerHasGetter != rMManagerHasGetter) {
			NotificationChain msgs = null;
			if (rMManagerHasGetter != null)
				msgs = ((InternalEObject)rMManagerHasGetter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_GETTER, null, msgs);
			if (newRMManagerHasGetter != null)
				msgs = ((InternalEObject)newRMManagerHasGetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_GETTER, null, msgs);
			msgs = basicSetRMManagerHasGetter(newRMManagerHasGetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_GETTER, newRMManagerHasGetter, newRMManagerHasGetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentationParseFunction> getRMManagerHasParseFunction() {
		if (rMManagerHasParseFunction == null) {
			rMManagerHasParseFunction = new EObjectContainmentEList<RepresentationParseFunction>(RepresentationParseFunction.class, this, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_PARSE_FUNCTION);
		}
		return rMManagerHasParseFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentationMarshallingFunction> getRMManagerHasMarshallingFunction() {
		if (rMManagerHasMarshallingFunction == null) {
			rMManagerHasMarshallingFunction = new EObjectContainmentEList<RepresentationMarshallingFunction>(RepresentationMarshallingFunction.class, this, RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_MARSHALLING_FUNCTION);
		}
		return rMManagerHasMarshallingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_INPUT_REPRESENTATION:
				return ((InternalEList<?>)getRMManagerHasInputRepresentation()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_OUTPUT_REPRESENTATION:
				return ((InternalEList<?>)getRMManagerHasOutputRepresentation()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RM_MANAGER_PROPERTY:
				return basicSetHasRMManagerProperty(null, msgs);
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_SETTER:
				return basicSetRMManagerHasSetter(null, msgs);
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_GETTER:
				return basicSetRMManagerHasGetter(null, msgs);
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_PARSE_FUNCTION:
				return ((InternalEList<?>)getRMManagerHasParseFunction()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_MARSHALLING_FUNCTION:
				return ((InternalEList<?>)getRMManagerHasMarshallingFunction()).basicRemove(otherEnd, msgs);
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
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__NAME:
				return getName();
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__PARENT_NAME:
				return getParentName();
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RELATED_MODEL:
				if (resolve) return getHasRelatedModel();
				return basicGetHasRelatedModel();
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_INPUT_REPRESENTATION:
				return getRMManagerHasInputRepresentation();
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_OUTPUT_REPRESENTATION:
				return getRMManagerHasOutputRepresentation();
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RM_MANAGER_PROPERTY:
				return getHasRMManagerProperty();
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_SETTER:
				return getRMManagerHasSetter();
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_GETTER:
				return getRMManagerHasGetter();
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_PARSE_FUNCTION:
				return getRMManagerHasParseFunction();
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_MARSHALLING_FUNCTION:
				return getRMManagerHasMarshallingFunction();
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
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__PARENT_NAME:
				setParentName((String)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RELATED_MODEL:
				setHasRelatedModel((ResourceModel)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_INPUT_REPRESENTATION:
				getRMManagerHasInputRepresentation().clear();
				getRMManagerHasInputRepresentation().addAll((Collection<? extends ResourceInputRepresentation>)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_OUTPUT_REPRESENTATION:
				getRMManagerHasOutputRepresentation().clear();
				getRMManagerHasOutputRepresentation().addAll((Collection<? extends ResourceOutputRepresentation>)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RM_MANAGER_PROPERTY:
				setHasRMManagerProperty((PIMComponentProperty)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_SETTER:
				setRMManagerHasSetter((SetterFunction)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_GETTER:
				setRMManagerHasGetter((GetterFunction)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_PARSE_FUNCTION:
				getRMManagerHasParseFunction().clear();
				getRMManagerHasParseFunction().addAll((Collection<? extends RepresentationParseFunction>)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_MARSHALLING_FUNCTION:
				getRMManagerHasMarshallingFunction().clear();
				getRMManagerHasMarshallingFunction().addAll((Collection<? extends RepresentationMarshallingFunction>)newValue);
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
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RELATED_MODEL:
				setHasRelatedModel((ResourceModel)null);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_INPUT_REPRESENTATION:
				getRMManagerHasInputRepresentation().clear();
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_OUTPUT_REPRESENTATION:
				getRMManagerHasOutputRepresentation().clear();
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RM_MANAGER_PROPERTY:
				setHasRMManagerProperty((PIMComponentProperty)null);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_SETTER:
				setRMManagerHasSetter((SetterFunction)null);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_GETTER:
				setRMManagerHasGetter((GetterFunction)null);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_PARSE_FUNCTION:
				getRMManagerHasParseFunction().clear();
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_MARSHALLING_FUNCTION:
				getRMManagerHasMarshallingFunction().clear();
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
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RELATED_MODEL:
				return hasRelatedModel != null;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_INPUT_REPRESENTATION:
				return rMManagerHasInputRepresentation != null && !rMManagerHasInputRepresentation.isEmpty();
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_OUTPUT_REPRESENTATION:
				return rMManagerHasOutputRepresentation != null && !rMManagerHasOutputRepresentation.isEmpty();
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__HAS_RM_MANAGER_PROPERTY:
				return hasRMManagerProperty != null;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_SETTER:
				return rMManagerHasSetter != null;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_GETTER:
				return rMManagerHasGetter != null;
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_PARSE_FUNCTION:
				return rMManagerHasParseFunction != null && !rMManagerHasParseFunction.isEmpty();
			case RESTServicePIMPackage.RESOURCE_MODEL_MANAGER__RM_MANAGER_HAS_MARSHALLING_FUNCTION:
				return rMManagerHasMarshallingFunction != null && !rMManagerHasMarshallingFunction.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ResourceModelManagerImpl
