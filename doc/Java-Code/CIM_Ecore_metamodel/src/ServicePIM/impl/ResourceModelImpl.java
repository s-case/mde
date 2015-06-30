/**
 */
package ServicePIM.impl;

import ServicePIM.AlgoResourceModel;
import ServicePIM.GetterFunction;
import ServicePIM.PIMComponentProperty;
import ServicePIM.RDBMSTable;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePIM.impl.ResourceModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelImpl#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelImpl#getRModelHasIRepresentation <em>RModel Has IRepresentation</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelImpl#getRModelHasOutputRepresentation <em>RModel Has Output Representation</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelImpl#getRModelHasProperty <em>RModel Has Property</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelImpl#getHasRelatedModelManager <em>Has Related Model Manager</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelImpl#getHasRelatedAlgoModel <em>Has Related Algo Model</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelImpl#getRModelHasSetter <em>RModel Has Setter</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelImpl#getRModelHasGetter <em>RModel Has Getter</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelImpl#getIsMappedToRDBMSTable <em>Is Mapped To RDBMS Table</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelImpl#getRModelHasParseFunction <em>RModel Has Parse Function</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceModelImpl#getRModelMarshallingFunction <em>RModel Marshalling Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceModelImpl extends MinimalEObjectImpl.Container implements ResourceModel {
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
	 * The cached value of the '{@link #getRModelHasIRepresentation() <em>RModel Has IRepresentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRModelHasIRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInputRepresentation> rModelHasIRepresentation;

	/**
	 * The cached value of the '{@link #getRModelHasOutputRepresentation() <em>RModel Has Output Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRModelHasOutputRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceOutputRepresentation> rModelHasOutputRepresentation;

	/**
	 * The cached value of the '{@link #getRModelHasProperty() <em>RModel Has Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRModelHasProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PIMComponentProperty> rModelHasProperty;

	/**
	 * The cached value of the '{@link #getHasRelatedModelManager() <em>Has Related Model Manager</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelatedModelManager()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceModelManager> hasRelatedModelManager;

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
	 * The cached value of the '{@link #getRModelHasSetter() <em>RModel Has Setter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRModelHasSetter()
	 * @generated
	 * @ordered
	 */
	protected EList<SetterFunction> rModelHasSetter;

	/**
	 * The cached value of the '{@link #getRModelHasGetter() <em>RModel Has Getter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRModelHasGetter()
	 * @generated
	 * @ordered
	 */
	protected EList<GetterFunction> rModelHasGetter;

	/**
	 * The cached value of the '{@link #getIsMappedToRDBMSTable() <em>Is Mapped To RDBMS Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMappedToRDBMSTable()
	 * @generated
	 * @ordered
	 */
	protected RDBMSTable isMappedToRDBMSTable;

	/**
	 * The cached value of the '{@link #getRModelHasParseFunction() <em>RModel Has Parse Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRModelHasParseFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentationParseFunction> rModelHasParseFunction;

	/**
	 * The cached value of the '{@link #getRModelMarshallingFunction() <em>RModel Marshalling Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRModelMarshallingFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentationMarshallingFunction> rModelMarshallingFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTServicePIMPackage.Literals.RESOURCE_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_MODEL__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInputRepresentation> getRModelHasIRepresentation() {
		if (rModelHasIRepresentation == null) {
			rModelHasIRepresentation = new EObjectContainmentEList<ResourceInputRepresentation>(ResourceInputRepresentation.class, this, RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_IREPRESENTATION);
		}
		return rModelHasIRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceOutputRepresentation> getRModelHasOutputRepresentation() {
		if (rModelHasOutputRepresentation == null) {
			rModelHasOutputRepresentation = new EObjectContainmentEList<ResourceOutputRepresentation>(ResourceOutputRepresentation.class, this, RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_OUTPUT_REPRESENTATION);
		}
		return rModelHasOutputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PIMComponentProperty> getRModelHasProperty() {
		if (rModelHasProperty == null) {
			rModelHasProperty = new EObjectContainmentEList<PIMComponentProperty>(PIMComponentProperty.class, this, RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_PROPERTY);
		}
		return rModelHasProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceModelManager> getHasRelatedModelManager() {
		if (hasRelatedModelManager == null) {
			hasRelatedModelManager = new EObjectResolvingEList<ResourceModelManager>(ResourceModelManager.class, this, RESTServicePIMPackage.RESOURCE_MODEL__HAS_RELATED_MODEL_MANAGER);
		}
		return hasRelatedModelManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlgoResourceModel> getHasRelatedAlgoModel() {
		if (hasRelatedAlgoModel == null) {
			hasRelatedAlgoModel = new EObjectResolvingEList<AlgoResourceModel>(AlgoResourceModel.class, this, RESTServicePIMPackage.RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL);
		}
		return hasRelatedAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetterFunction> getRModelHasSetter() {
		if (rModelHasSetter == null) {
			rModelHasSetter = new EObjectContainmentEList<SetterFunction>(SetterFunction.class, this, RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_SETTER);
		}
		return rModelHasSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GetterFunction> getRModelHasGetter() {
		if (rModelHasGetter == null) {
			rModelHasGetter = new EObjectContainmentEList<GetterFunction>(GetterFunction.class, this, RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_GETTER);
		}
		return rModelHasGetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMSTable getIsMappedToRDBMSTable() {
		if (isMappedToRDBMSTable != null && isMappedToRDBMSTable.eIsProxy()) {
			InternalEObject oldIsMappedToRDBMSTable = (InternalEObject)isMappedToRDBMSTable;
			isMappedToRDBMSTable = (RDBMSTable)eResolveProxy(oldIsMappedToRDBMSTable);
			if (isMappedToRDBMSTable != oldIsMappedToRDBMSTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTServicePIMPackage.RESOURCE_MODEL__IS_MAPPED_TO_RDBMS_TABLE, oldIsMappedToRDBMSTable, isMappedToRDBMSTable));
			}
		}
		return isMappedToRDBMSTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMSTable basicGetIsMappedToRDBMSTable() {
		return isMappedToRDBMSTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMappedToRDBMSTable(RDBMSTable newIsMappedToRDBMSTable) {
		RDBMSTable oldIsMappedToRDBMSTable = isMappedToRDBMSTable;
		isMappedToRDBMSTable = newIsMappedToRDBMSTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTServicePIMPackage.RESOURCE_MODEL__IS_MAPPED_TO_RDBMS_TABLE, oldIsMappedToRDBMSTable, isMappedToRDBMSTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentationParseFunction> getRModelHasParseFunction() {
		if (rModelHasParseFunction == null) {
			rModelHasParseFunction = new EObjectContainmentEList<RepresentationParseFunction>(RepresentationParseFunction.class, this, RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_PARSE_FUNCTION);
		}
		return rModelHasParseFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentationMarshallingFunction> getRModelMarshallingFunction() {
		if (rModelMarshallingFunction == null) {
			rModelMarshallingFunction = new EObjectContainmentEList<RepresentationMarshallingFunction>(RepresentationMarshallingFunction.class, this, RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_MARSHALLING_FUNCTION);
		}
		return rModelMarshallingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_IREPRESENTATION:
				return ((InternalEList<?>)getRModelHasIRepresentation()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_OUTPUT_REPRESENTATION:
				return ((InternalEList<?>)getRModelHasOutputRepresentation()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_PROPERTY:
				return ((InternalEList<?>)getRModelHasProperty()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_SETTER:
				return ((InternalEList<?>)getRModelHasSetter()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_GETTER:
				return ((InternalEList<?>)getRModelHasGetter()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_PARSE_FUNCTION:
				return ((InternalEList<?>)getRModelHasParseFunction()).basicRemove(otherEnd, msgs);
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_MARSHALLING_FUNCTION:
				return ((InternalEList<?>)getRModelMarshallingFunction()).basicRemove(otherEnd, msgs);
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
			case RESTServicePIMPackage.RESOURCE_MODEL__NAME:
				return getName();
			case RESTServicePIMPackage.RESOURCE_MODEL__PARENT_NAME:
				return getParentName();
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_IREPRESENTATION:
				return getRModelHasIRepresentation();
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_OUTPUT_REPRESENTATION:
				return getRModelHasOutputRepresentation();
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_PROPERTY:
				return getRModelHasProperty();
			case RESTServicePIMPackage.RESOURCE_MODEL__HAS_RELATED_MODEL_MANAGER:
				return getHasRelatedModelManager();
			case RESTServicePIMPackage.RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL:
				return getHasRelatedAlgoModel();
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_SETTER:
				return getRModelHasSetter();
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_GETTER:
				return getRModelHasGetter();
			case RESTServicePIMPackage.RESOURCE_MODEL__IS_MAPPED_TO_RDBMS_TABLE:
				if (resolve) return getIsMappedToRDBMSTable();
				return basicGetIsMappedToRDBMSTable();
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_PARSE_FUNCTION:
				return getRModelHasParseFunction();
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_MARSHALLING_FUNCTION:
				return getRModelMarshallingFunction();
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
			case RESTServicePIMPackage.RESOURCE_MODEL__NAME:
				setName((String)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__PARENT_NAME:
				setParentName((String)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_IREPRESENTATION:
				getRModelHasIRepresentation().clear();
				getRModelHasIRepresentation().addAll((Collection<? extends ResourceInputRepresentation>)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_OUTPUT_REPRESENTATION:
				getRModelHasOutputRepresentation().clear();
				getRModelHasOutputRepresentation().addAll((Collection<? extends ResourceOutputRepresentation>)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_PROPERTY:
				getRModelHasProperty().clear();
				getRModelHasProperty().addAll((Collection<? extends PIMComponentProperty>)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__HAS_RELATED_MODEL_MANAGER:
				getHasRelatedModelManager().clear();
				getHasRelatedModelManager().addAll((Collection<? extends ResourceModelManager>)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL:
				getHasRelatedAlgoModel().clear();
				getHasRelatedAlgoModel().addAll((Collection<? extends AlgoResourceModel>)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_SETTER:
				getRModelHasSetter().clear();
				getRModelHasSetter().addAll((Collection<? extends SetterFunction>)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_GETTER:
				getRModelHasGetter().clear();
				getRModelHasGetter().addAll((Collection<? extends GetterFunction>)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__IS_MAPPED_TO_RDBMS_TABLE:
				setIsMappedToRDBMSTable((RDBMSTable)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_PARSE_FUNCTION:
				getRModelHasParseFunction().clear();
				getRModelHasParseFunction().addAll((Collection<? extends RepresentationParseFunction>)newValue);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_MARSHALLING_FUNCTION:
				getRModelMarshallingFunction().clear();
				getRModelMarshallingFunction().addAll((Collection<? extends RepresentationMarshallingFunction>)newValue);
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
			case RESTServicePIMPackage.RESOURCE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_IREPRESENTATION:
				getRModelHasIRepresentation().clear();
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_OUTPUT_REPRESENTATION:
				getRModelHasOutputRepresentation().clear();
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_PROPERTY:
				getRModelHasProperty().clear();
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__HAS_RELATED_MODEL_MANAGER:
				getHasRelatedModelManager().clear();
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL:
				getHasRelatedAlgoModel().clear();
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_SETTER:
				getRModelHasSetter().clear();
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_GETTER:
				getRModelHasGetter().clear();
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__IS_MAPPED_TO_RDBMS_TABLE:
				setIsMappedToRDBMSTable((RDBMSTable)null);
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_PARSE_FUNCTION:
				getRModelHasParseFunction().clear();
				return;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_MARSHALLING_FUNCTION:
				getRModelMarshallingFunction().clear();
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
			case RESTServicePIMPackage.RESOURCE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTServicePIMPackage.RESOURCE_MODEL__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_IREPRESENTATION:
				return rModelHasIRepresentation != null && !rModelHasIRepresentation.isEmpty();
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_OUTPUT_REPRESENTATION:
				return rModelHasOutputRepresentation != null && !rModelHasOutputRepresentation.isEmpty();
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_PROPERTY:
				return rModelHasProperty != null && !rModelHasProperty.isEmpty();
			case RESTServicePIMPackage.RESOURCE_MODEL__HAS_RELATED_MODEL_MANAGER:
				return hasRelatedModelManager != null && !hasRelatedModelManager.isEmpty();
			case RESTServicePIMPackage.RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL:
				return hasRelatedAlgoModel != null && !hasRelatedAlgoModel.isEmpty();
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_SETTER:
				return rModelHasSetter != null && !rModelHasSetter.isEmpty();
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_GETTER:
				return rModelHasGetter != null && !rModelHasGetter.isEmpty();
			case RESTServicePIMPackage.RESOURCE_MODEL__IS_MAPPED_TO_RDBMS_TABLE:
				return isMappedToRDBMSTable != null;
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_HAS_PARSE_FUNCTION:
				return rModelHasParseFunction != null && !rModelHasParseFunction.isEmpty();
			case RESTServicePIMPackage.RESOURCE_MODEL__RMODEL_MARSHALLING_FUNCTION:
				return rModelMarshallingFunction != null && !rModelMarshallingFunction.isEmpty();
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

} //ResourceModelImpl
