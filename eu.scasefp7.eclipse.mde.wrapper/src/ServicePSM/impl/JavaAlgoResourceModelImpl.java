/**
 */
package ServicePSM.impl;

import ServicePSM.JAXBAnnotation;
import ServicePSM.JavaAlgoResourceModel;
import ServicePSM.JavaGetterFunction;
import ServicePSM.JavaSetterFunction;
import ServicePSM.PSMComponentProperty;
import ServicePSM.ServicePSMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Algo Resource Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePSM.impl.JavaAlgoResourceModelImpl#getJavaAlgoModelHasJAXBAnnotation <em>Java Algo Model Has JAXB Annotation</em>}</li>
 *   <li>{@link ServicePSM.impl.JavaAlgoResourceModelImpl#getJavaAlgoModelHasProperty <em>Java Algo Model Has Property</em>}</li>
 *   <li>{@link ServicePSM.impl.JavaAlgoResourceModelImpl#getJavaAlgoModelHasSetterFunction <em>Java Algo Model Has Setter Function</em>}</li>
 *   <li>{@link ServicePSM.impl.JavaAlgoResourceModelImpl#getJavaAlgoModelHasGetterFunction <em>Java Algo Model Has Getter Function</em>}</li>
 *   <li>{@link ServicePSM.impl.JavaAlgoResourceModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePSM.impl.JavaAlgoResourceModelImpl#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link ServicePSM.impl.JavaAlgoResourceModelImpl#getHasRelatedAlgoModel <em>Has Related Algo Model</em>}</li>
 *   <li>{@link ServicePSM.impl.JavaAlgoResourceModelImpl#getIsRelatedAlgoModel <em>Is Related Algo Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaAlgoResourceModelImpl extends MinimalEObjectImpl.Container implements JavaAlgoResourceModel {
	/**
	 * The cached value of the '{@link #getJavaAlgoModelHasJAXBAnnotation() <em>Java Algo Model Has JAXB Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaAlgoModelHasJAXBAnnotation()
	 * @generated
	 * @ordered
	 */
	protected JAXBAnnotation javaAlgoModelHasJAXBAnnotation;

	/**
	 * The cached value of the '{@link #getJavaAlgoModelHasProperty() <em>Java Algo Model Has Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaAlgoModelHasProperty()
	 * @generated
	 * @ordered
	 */
	protected PSMComponentProperty javaAlgoModelHasProperty;

	/**
	 * The cached value of the '{@link #getJavaAlgoModelHasSetterFunction() <em>Java Algo Model Has Setter Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaAlgoModelHasSetterFunction()
	 * @generated
	 * @ordered
	 */
	protected JavaSetterFunction javaAlgoModelHasSetterFunction;

	/**
	 * The cached value of the '{@link #getJavaAlgoModelHasGetterFunction() <em>Java Algo Model Has Getter Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaAlgoModelHasGetterFunction()
	 * @generated
	 * @ordered
	 */
	protected JavaGetterFunction javaAlgoModelHasGetterFunction;

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
	 * The cached value of the '{@link #getHasRelatedAlgoModel() <em>Has Related Algo Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelatedAlgoModel()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaAlgoResourceModel> hasRelatedAlgoModel;

	/**
	 * The cached value of the '{@link #getIsRelatedAlgoModel() <em>Is Related Algo Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelatedAlgoModel()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaAlgoResourceModel> isRelatedAlgoModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaAlgoResourceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePSMPackage.Literals.JAVA_ALGO_RESOURCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAXBAnnotation getJavaAlgoModelHasJAXBAnnotation() {
		return javaAlgoModelHasJAXBAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaAlgoModelHasJAXBAnnotation(JAXBAnnotation newJavaAlgoModelHasJAXBAnnotation, NotificationChain msgs) {
		JAXBAnnotation oldJavaAlgoModelHasJAXBAnnotation = javaAlgoModelHasJAXBAnnotation;
		javaAlgoModelHasJAXBAnnotation = newJavaAlgoModelHasJAXBAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_JAXB_ANNOTATION, oldJavaAlgoModelHasJAXBAnnotation, newJavaAlgoModelHasJAXBAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaAlgoModelHasJAXBAnnotation(JAXBAnnotation newJavaAlgoModelHasJAXBAnnotation) {
		if (newJavaAlgoModelHasJAXBAnnotation != javaAlgoModelHasJAXBAnnotation) {
			NotificationChain msgs = null;
			if (javaAlgoModelHasJAXBAnnotation != null)
				msgs = ((InternalEObject)javaAlgoModelHasJAXBAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_JAXB_ANNOTATION, null, msgs);
			if (newJavaAlgoModelHasJAXBAnnotation != null)
				msgs = ((InternalEObject)newJavaAlgoModelHasJAXBAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_JAXB_ANNOTATION, null, msgs);
			msgs = basicSetJavaAlgoModelHasJAXBAnnotation(newJavaAlgoModelHasJAXBAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_JAXB_ANNOTATION, newJavaAlgoModelHasJAXBAnnotation, newJavaAlgoModelHasJAXBAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty getJavaAlgoModelHasProperty() {
		return javaAlgoModelHasProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaAlgoModelHasProperty(PSMComponentProperty newJavaAlgoModelHasProperty, NotificationChain msgs) {
		PSMComponentProperty oldJavaAlgoModelHasProperty = javaAlgoModelHasProperty;
		javaAlgoModelHasProperty = newJavaAlgoModelHasProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_PROPERTY, oldJavaAlgoModelHasProperty, newJavaAlgoModelHasProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaAlgoModelHasProperty(PSMComponentProperty newJavaAlgoModelHasProperty) {
		if (newJavaAlgoModelHasProperty != javaAlgoModelHasProperty) {
			NotificationChain msgs = null;
			if (javaAlgoModelHasProperty != null)
				msgs = ((InternalEObject)javaAlgoModelHasProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_PROPERTY, null, msgs);
			if (newJavaAlgoModelHasProperty != null)
				msgs = ((InternalEObject)newJavaAlgoModelHasProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_PROPERTY, null, msgs);
			msgs = basicSetJavaAlgoModelHasProperty(newJavaAlgoModelHasProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_PROPERTY, newJavaAlgoModelHasProperty, newJavaAlgoModelHasProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSetterFunction getJavaAlgoModelHasSetterFunction() {
		return javaAlgoModelHasSetterFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaAlgoModelHasSetterFunction(JavaSetterFunction newJavaAlgoModelHasSetterFunction, NotificationChain msgs) {
		JavaSetterFunction oldJavaAlgoModelHasSetterFunction = javaAlgoModelHasSetterFunction;
		javaAlgoModelHasSetterFunction = newJavaAlgoModelHasSetterFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_SETTER_FUNCTION, oldJavaAlgoModelHasSetterFunction, newJavaAlgoModelHasSetterFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaAlgoModelHasSetterFunction(JavaSetterFunction newJavaAlgoModelHasSetterFunction) {
		if (newJavaAlgoModelHasSetterFunction != javaAlgoModelHasSetterFunction) {
			NotificationChain msgs = null;
			if (javaAlgoModelHasSetterFunction != null)
				msgs = ((InternalEObject)javaAlgoModelHasSetterFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_SETTER_FUNCTION, null, msgs);
			if (newJavaAlgoModelHasSetterFunction != null)
				msgs = ((InternalEObject)newJavaAlgoModelHasSetterFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_SETTER_FUNCTION, null, msgs);
			msgs = basicSetJavaAlgoModelHasSetterFunction(newJavaAlgoModelHasSetterFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_SETTER_FUNCTION, newJavaAlgoModelHasSetterFunction, newJavaAlgoModelHasSetterFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaGetterFunction getJavaAlgoModelHasGetterFunction() {
		return javaAlgoModelHasGetterFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaAlgoModelHasGetterFunction(JavaGetterFunction newJavaAlgoModelHasGetterFunction, NotificationChain msgs) {
		JavaGetterFunction oldJavaAlgoModelHasGetterFunction = javaAlgoModelHasGetterFunction;
		javaAlgoModelHasGetterFunction = newJavaAlgoModelHasGetterFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_GETTER_FUNCTION, oldJavaAlgoModelHasGetterFunction, newJavaAlgoModelHasGetterFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaAlgoModelHasGetterFunction(JavaGetterFunction newJavaAlgoModelHasGetterFunction) {
		if (newJavaAlgoModelHasGetterFunction != javaAlgoModelHasGetterFunction) {
			NotificationChain msgs = null;
			if (javaAlgoModelHasGetterFunction != null)
				msgs = ((InternalEObject)javaAlgoModelHasGetterFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_GETTER_FUNCTION, null, msgs);
			if (newJavaAlgoModelHasGetterFunction != null)
				msgs = ((InternalEObject)newJavaAlgoModelHasGetterFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_GETTER_FUNCTION, null, msgs);
			msgs = basicSetJavaAlgoModelHasGetterFunction(newJavaAlgoModelHasGetterFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_GETTER_FUNCTION, newJavaAlgoModelHasGetterFunction, newJavaAlgoModelHasGetterFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaAlgoResourceModel> getHasRelatedAlgoModel() {
		if (hasRelatedAlgoModel == null) {
			hasRelatedAlgoModel = new EObjectResolvingEList<JavaAlgoResourceModel>(JavaAlgoResourceModel.class, this, ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL);
		}
		return hasRelatedAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaAlgoResourceModel> getIsRelatedAlgoModel() {
		if (isRelatedAlgoModel == null) {
			isRelatedAlgoModel = new EObjectResolvingEList<JavaAlgoResourceModel>(JavaAlgoResourceModel.class, this, ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL);
		}
		return isRelatedAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_JAXB_ANNOTATION:
				return basicSetJavaAlgoModelHasJAXBAnnotation(null, msgs);
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_PROPERTY:
				return basicSetJavaAlgoModelHasProperty(null, msgs);
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_SETTER_FUNCTION:
				return basicSetJavaAlgoModelHasSetterFunction(null, msgs);
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_GETTER_FUNCTION:
				return basicSetJavaAlgoModelHasGetterFunction(null, msgs);
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
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_JAXB_ANNOTATION:
				return getJavaAlgoModelHasJAXBAnnotation();
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_PROPERTY:
				return getJavaAlgoModelHasProperty();
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_SETTER_FUNCTION:
				return getJavaAlgoModelHasSetterFunction();
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_GETTER_FUNCTION:
				return getJavaAlgoModelHasGetterFunction();
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__NAME:
				return getName();
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__PARENT_NAME:
				return getParentName();
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL:
				return getHasRelatedAlgoModel();
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL:
				return getIsRelatedAlgoModel();
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
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_JAXB_ANNOTATION:
				setJavaAlgoModelHasJAXBAnnotation((JAXBAnnotation)newValue);
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_PROPERTY:
				setJavaAlgoModelHasProperty((PSMComponentProperty)newValue);
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_SETTER_FUNCTION:
				setJavaAlgoModelHasSetterFunction((JavaSetterFunction)newValue);
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_GETTER_FUNCTION:
				setJavaAlgoModelHasGetterFunction((JavaGetterFunction)newValue);
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__NAME:
				setName((String)newValue);
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__PARENT_NAME:
				setParentName((String)newValue);
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL:
				getHasRelatedAlgoModel().clear();
				getHasRelatedAlgoModel().addAll((Collection<? extends JavaAlgoResourceModel>)newValue);
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL:
				getIsRelatedAlgoModel().clear();
				getIsRelatedAlgoModel().addAll((Collection<? extends JavaAlgoResourceModel>)newValue);
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
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_JAXB_ANNOTATION:
				setJavaAlgoModelHasJAXBAnnotation((JAXBAnnotation)null);
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_PROPERTY:
				setJavaAlgoModelHasProperty((PSMComponentProperty)null);
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_SETTER_FUNCTION:
				setJavaAlgoModelHasSetterFunction((JavaSetterFunction)null);
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_GETTER_FUNCTION:
				setJavaAlgoModelHasGetterFunction((JavaGetterFunction)null);
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL:
				getHasRelatedAlgoModel().clear();
				return;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL:
				getIsRelatedAlgoModel().clear();
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
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_JAXB_ANNOTATION:
				return javaAlgoModelHasJAXBAnnotation != null;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_PROPERTY:
				return javaAlgoModelHasProperty != null;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_SETTER_FUNCTION:
				return javaAlgoModelHasSetterFunction != null;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_GETTER_FUNCTION:
				return javaAlgoModelHasGetterFunction != null;
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL:
				return hasRelatedAlgoModel != null && !hasRelatedAlgoModel.isEmpty();
			case ServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL:
				return isRelatedAlgoModel != null && !isRelatedAlgoModel.isEmpty();
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

} //JavaAlgoResourceModelImpl