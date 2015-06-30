/**
 */
package ServicePIM.impl;

import ServicePIM.AlgoResourceModel;
import ServicePIM.GetterFunction;
import ServicePIM.PIMComponentProperty;
import ServicePIM.RESTServicePIMPackage;
import ServicePIM.RepresentationMarshallingFunction;
import ServicePIM.RepresentationParseFunction;
import ServicePIM.ResourceInputRepresentation;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algo Resource Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.AlgoResourceModelImpl#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceModelImpl#getAlgoModelHasInputRepresentation <em>Algo Model Has Input Representation</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceModelImpl#getAlgoModelHasOutputRepresentation <em>Algo Model Has Output Representation</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceModelImpl#getAlgoModelHasProperty <em>Algo Model Has Property</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceModelImpl#getAlgoModelHasSetter <em>Algo Model Has Setter</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceModelImpl#getAlgoModelHasGetter <em>Algo Model Has Getter</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceModelImpl#getHasRelatedAlgoModel <em>Has Related Algo Model</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceModelImpl#getIsRelatedAlgoModel <em>Is Related Algo Model</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceModelImpl#getAlgoModelHasParseFunction <em>Algo Model Has Parse Function</em>}</li>
 *   <li>{@link ServicePIM.impl.AlgoResourceModelImpl#getAlgoModelHasMarshallingFunction <em>Algo Model Has Marshalling Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlgoResourceModelImpl extends MinimalEObjectImpl.Container implements AlgoResourceModel {
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
	 * The cached value of the '{@link #getAlgoModelHasInputRepresentation() <em>Algo Model Has Input Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgoModelHasInputRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInputRepresentation> algoModelHasInputRepresentation;

	/**
	 * The cached value of the '{@link #getAlgoModelHasOutputRepresentation() <em>Algo Model Has Output Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgoModelHasOutputRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceOutputRepresentation> algoModelHasOutputRepresentation;

	/**
	 * The cached value of the '{@link #getAlgoModelHasProperty() <em>Algo Model Has Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgoModelHasProperty()
	 * @generated
	 * @ordered
	 */
	protected PIMComponentProperty algoModelHasProperty;

	/**
	 * The cached value of the '{@link #getAlgoModelHasSetter() <em>Algo Model Has Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgoModelHasSetter()
	 * @generated
	 * @ordered
	 */
	protected SetterFunction algoModelHasSetter;

	/**
	 * The cached value of the '{@link #getAlgoModelHasGetter() <em>Algo Model Has Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgoModelHasGetter()
	 * @generated
	 * @ordered
	 */
	protected GetterFunction algoModelHasGetter;

	/**
	 * The cached value of the '{@link #getHasRelatedAlgoModel() <em>Has Related Algo Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelatedAlgoModel()
	 * @generated
	 * @ordered
	 */
	protected EList<AlgoResourceModel> hasRelatedAlgoModel;

	/**
	 * The cached value of the '{@link #getIsRelatedAlgoModel() <em>Is Related Algo Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelatedAlgoModel()
	 * @generated
	 * @ordered
	 */
	protected EList<AlgoResourceModel> isRelatedAlgoModel;

	/**
	 * The cached value of the '{@link #getAlgoModelHasParseFunction() <em>Algo Model Has Parse Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgoModelHasParseFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentationParseFunction> algoModelHasParseFunction;

	/**
	 * The cached value of the '{@link #getAlgoModelHasMarshallingFunction() <em>Algo Model Has Marshalling Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgoModelHasMarshallingFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentationMarshallingFunction> algoModelHasMarshallingFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgoResourceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.ALGO_RESOURCE_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__PARENT_NAME, oldParentName, parentName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInputRepresentation> getAlgoModelHasInputRepresentation() {
		if (algoModelHasInputRepresentation == null) {
			algoModelHasInputRepresentation = new EObjectContainmentEList<ResourceInputRepresentation>(ResourceInputRepresentation.class, this, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_INPUT_REPRESENTATION);
		}
		return algoModelHasInputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceOutputRepresentation> getAlgoModelHasOutputRepresentation() {
		if (algoModelHasOutputRepresentation == null) {
			algoModelHasOutputRepresentation = new EObjectContainmentEList<ResourceOutputRepresentation>(ResourceOutputRepresentation.class, this, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_OUTPUT_REPRESENTATION);
		}
		return algoModelHasOutputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMComponentProperty getAlgoModelHasProperty() {
		return algoModelHasProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgoModelHasProperty(PIMComponentProperty newAlgoModelHasProperty, NotificationChain msgs) {
		PIMComponentProperty oldAlgoModelHasProperty = algoModelHasProperty;
		algoModelHasProperty = newAlgoModelHasProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PROPERTY, oldAlgoModelHasProperty, newAlgoModelHasProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgoModelHasProperty(PIMComponentProperty newAlgoModelHasProperty) {
		if (newAlgoModelHasProperty != algoModelHasProperty) {
			NotificationChain msgs = null;
			if (algoModelHasProperty != null)
				msgs = ((InternalEObject)algoModelHasProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PROPERTY, null, msgs);
			if (newAlgoModelHasProperty != null)
				msgs = ((InternalEObject)newAlgoModelHasProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PROPERTY, null, msgs);
			msgs = basicSetAlgoModelHasProperty(newAlgoModelHasProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PROPERTY, newAlgoModelHasProperty, newAlgoModelHasProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetterFunction getAlgoModelHasSetter() {
		return algoModelHasSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgoModelHasSetter(SetterFunction newAlgoModelHasSetter, NotificationChain msgs) {
		SetterFunction oldAlgoModelHasSetter = algoModelHasSetter;
		algoModelHasSetter = newAlgoModelHasSetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_SETTER, oldAlgoModelHasSetter, newAlgoModelHasSetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgoModelHasSetter(SetterFunction newAlgoModelHasSetter) {
		if (newAlgoModelHasSetter != algoModelHasSetter) {
			NotificationChain msgs = null;
			if (algoModelHasSetter != null)
				msgs = ((InternalEObject)algoModelHasSetter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_SETTER, null, msgs);
			if (newAlgoModelHasSetter != null)
				msgs = ((InternalEObject)newAlgoModelHasSetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_SETTER, null, msgs);
			msgs = basicSetAlgoModelHasSetter(newAlgoModelHasSetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_SETTER, newAlgoModelHasSetter, newAlgoModelHasSetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetterFunction getAlgoModelHasGetter() {
		return algoModelHasGetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgoModelHasGetter(GetterFunction newAlgoModelHasGetter, NotificationChain msgs) {
		GetterFunction oldAlgoModelHasGetter = algoModelHasGetter;
		algoModelHasGetter = newAlgoModelHasGetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_GETTER, oldAlgoModelHasGetter, newAlgoModelHasGetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgoModelHasGetter(GetterFunction newAlgoModelHasGetter) {
		if (newAlgoModelHasGetter != algoModelHasGetter) {
			NotificationChain msgs = null;
			if (algoModelHasGetter != null)
				msgs = ((InternalEObject)algoModelHasGetter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_GETTER, null, msgs);
			if (newAlgoModelHasGetter != null)
				msgs = ((InternalEObject)newAlgoModelHasGetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_GETTER, null, msgs);
			msgs = basicSetAlgoModelHasGetter(newAlgoModelHasGetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_GETTER, newAlgoModelHasGetter, newAlgoModelHasGetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlgoResourceModel> getHasRelatedAlgoModel() {
		if (hasRelatedAlgoModel == null) {
			hasRelatedAlgoModel = new EObjectResolvingEList<AlgoResourceModel>(AlgoResourceModel.class, this, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL);
		}
		return hasRelatedAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlgoResourceModel> getIsRelatedAlgoModel() {
		if (isRelatedAlgoModel == null) {
			isRelatedAlgoModel = new EObjectResolvingEList<AlgoResourceModel>(AlgoResourceModel.class, this, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL);
		}
		return isRelatedAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentationParseFunction> getAlgoModelHasParseFunction() {
		if (algoModelHasParseFunction == null) {
			algoModelHasParseFunction = new EObjectContainmentEList<RepresentationParseFunction>(RepresentationParseFunction.class, this, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PARSE_FUNCTION);
		}
		return algoModelHasParseFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentationMarshallingFunction> getAlgoModelHasMarshallingFunction() {
		if (algoModelHasMarshallingFunction == null) {
			algoModelHasMarshallingFunction = new EObjectContainmentEList<RepresentationMarshallingFunction>(RepresentationMarshallingFunction.class, this, RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_MARSHALLING_FUNCTION);
		}
		return algoModelHasMarshallingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_INPUT_REPRESENTATION:
				return ((InternalEList<?>)getAlgoModelHasInputRepresentation()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_OUTPUT_REPRESENTATION:
				return ((InternalEList<?>)getAlgoModelHasOutputRepresentation()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PROPERTY:
				return basicSetAlgoModelHasProperty(null, msgs);
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_SETTER:
				return basicSetAlgoModelHasSetter(null, msgs);
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_GETTER:
				return basicSetAlgoModelHasGetter(null, msgs);
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PARSE_FUNCTION:
				return ((InternalEList<?>)getAlgoModelHasParseFunction()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_MARSHALLING_FUNCTION:
				return ((InternalEList<?>)getAlgoModelHasMarshallingFunction()).basicRemove(otherEnd, msgs);
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
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__PARENT_NAME:
				return getParentName();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__NAME:
				return getName();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_INPUT_REPRESENTATION:
				return getAlgoModelHasInputRepresentation();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_OUTPUT_REPRESENTATION:
				return getAlgoModelHasOutputRepresentation();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PROPERTY:
				return getAlgoModelHasProperty();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_SETTER:
				return getAlgoModelHasSetter();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_GETTER:
				return getAlgoModelHasGetter();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL:
				return getHasRelatedAlgoModel();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL:
				return getIsRelatedAlgoModel();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PARSE_FUNCTION:
				return getAlgoModelHasParseFunction();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_MARSHALLING_FUNCTION:
				return getAlgoModelHasMarshallingFunction();
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
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__PARENT_NAME:
				setParentName((String)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_INPUT_REPRESENTATION:
				getAlgoModelHasInputRepresentation().clear();
				getAlgoModelHasInputRepresentation().addAll((Collection<? extends ResourceInputRepresentation>)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_OUTPUT_REPRESENTATION:
				getAlgoModelHasOutputRepresentation().clear();
				getAlgoModelHasOutputRepresentation().addAll((Collection<? extends ResourceOutputRepresentation>)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PROPERTY:
				setAlgoModelHasProperty((PIMComponentProperty)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_SETTER:
				setAlgoModelHasSetter((SetterFunction)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_GETTER:
				setAlgoModelHasGetter((GetterFunction)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL:
				getHasRelatedAlgoModel().clear();
				getHasRelatedAlgoModel().addAll((Collection<? extends AlgoResourceModel>)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL:
				getIsRelatedAlgoModel().clear();
				getIsRelatedAlgoModel().addAll((Collection<? extends AlgoResourceModel>)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PARSE_FUNCTION:
				getAlgoModelHasParseFunction().clear();
				getAlgoModelHasParseFunction().addAll((Collection<? extends RepresentationParseFunction>)newValue);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_MARSHALLING_FUNCTION:
				getAlgoModelHasMarshallingFunction().clear();
				getAlgoModelHasMarshallingFunction().addAll((Collection<? extends RepresentationMarshallingFunction>)newValue);
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
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_INPUT_REPRESENTATION:
				getAlgoModelHasInputRepresentation().clear();
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_OUTPUT_REPRESENTATION:
				getAlgoModelHasOutputRepresentation().clear();
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PROPERTY:
				setAlgoModelHasProperty((PIMComponentProperty)null);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_SETTER:
				setAlgoModelHasSetter((SetterFunction)null);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_GETTER:
				setAlgoModelHasGetter((GetterFunction)null);
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL:
				getHasRelatedAlgoModel().clear();
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL:
				getIsRelatedAlgoModel().clear();
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PARSE_FUNCTION:
				getAlgoModelHasParseFunction().clear();
				return;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_MARSHALLING_FUNCTION:
				getAlgoModelHasMarshallingFunction().clear();
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
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_INPUT_REPRESENTATION:
				return algoModelHasInputRepresentation != null && !algoModelHasInputRepresentation.isEmpty();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_OUTPUT_REPRESENTATION:
				return algoModelHasOutputRepresentation != null && !algoModelHasOutputRepresentation.isEmpty();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PROPERTY:
				return algoModelHasProperty != null;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_SETTER:
				return algoModelHasSetter != null;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_GETTER:
				return algoModelHasGetter != null;
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL:
				return hasRelatedAlgoModel != null && !hasRelatedAlgoModel.isEmpty();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL:
				return isRelatedAlgoModel != null && !isRelatedAlgoModel.isEmpty();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_PARSE_FUNCTION:
				return algoModelHasParseFunction != null && !algoModelHasParseFunction.isEmpty();
			case RESTServicePIMPackage.ALGO_RESOURCE_MODEL__ALGO_MODEL_HAS_MARSHALLING_FUNCTION:
				return algoModelHasMarshallingFunction != null && !algoModelHasMarshallingFunction.isEmpty();
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
		result.append(" (parentName: ");
		result.append(parentName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AlgoResourceModelImpl
