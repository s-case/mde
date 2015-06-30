/**
 */
package ServicePIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.ResourceModel#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.ResourceModel#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link ServicePIM.ResourceModel#getRModelHasIRepresentation <em>RModel Has IRepresentation</em>}</li>
 *   <li>{@link ServicePIM.ResourceModel#getRModelHasOutputRepresentation <em>RModel Has Output Representation</em>}</li>
 *   <li>{@link ServicePIM.ResourceModel#getRModelHasProperty <em>RModel Has Property</em>}</li>
 *   <li>{@link ServicePIM.ResourceModel#getHasRelatedModelManager <em>Has Related Model Manager</em>}</li>
 *   <li>{@link ServicePIM.ResourceModel#getHasRelatedAlgoModel <em>Has Related Algo Model</em>}</li>
 *   <li>{@link ServicePIM.ResourceModel#getRModelHasSetter <em>RModel Has Setter</em>}</li>
 *   <li>{@link ServicePIM.ResourceModel#getRModelHasGetter <em>RModel Has Getter</em>}</li>
 *   <li>{@link ServicePIM.ResourceModel#getIsMappedToRDBMSTable <em>Is Mapped To RDBMS Table</em>}</li>
 *   <li>{@link ServicePIM.ResourceModel#getRModelHasParseFunction <em>RModel Has Parse Function</em>}</li>
 *   <li>{@link ServicePIM.ResourceModel#getRModelMarshallingFunction <em>RModel Marshalling Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getResourceModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueNamingProperty uniquePrimaryIdentifier existantSettersForAllProperties existantGettersForAllProperties uniqueLinklistProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueNamingProperty='self.rModelHasProperty->one(isNamingProperty = true)' uniquePrimaryIdentifier='self.rModelHasProperty->one(isPrimaryIdentifier = true)' existantSettersForAllProperties='self.rModelHasProperty->forAll(rModelProperty | self.rModelHasSetter->one(setsProperty.name = rModelProperty.name))' existantGettersForAllProperties='self.rModelHasProperty->forAll(rModelProperty | self.rModelHasGetter->one(getsProperty.name = rModelProperty.name))' uniqueLinklistProperty='self.rModelHasProperty->one(name = \'linklist\')'"
 * @generated
 */
public interface ResourceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Name</em>' attribute.
	 * @see #setParentName(String)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModel_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceModel#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

	/**
	 * Returns the value of the '<em><b>RModel Has IRepresentation</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.ResourceInputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RModel Has IRepresentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RModel Has IRepresentation</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModel_RModelHasIRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceInputRepresentation> getRModelHasIRepresentation();

	/**
	 * Returns the value of the '<em><b>RModel Has Output Representation</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.ResourceOutputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RModel Has Output Representation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RModel Has Output Representation</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModel_RModelHasOutputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceOutputRepresentation> getRModelHasOutputRepresentation();

	/**
	 * Returns the value of the '<em><b>RModel Has Property</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.PIMComponentProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RModel Has Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RModel Has Property</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModel_RModelHasProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PIMComponentProperty> getRModelHasProperty();

	/**
	 * Returns the value of the '<em><b>Has Related Model Manager</b></em>' reference list.
	 * The list contents are of type {@link ServicePIM.ResourceModelManager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Related Model Manager</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related Model Manager</em>' reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModel_HasRelatedModelManager()
	 * @model
	 * @generated
	 */
	EList<ResourceModelManager> getHasRelatedModelManager();

	/**
	 * Returns the value of the '<em><b>Has Related Algo Model</b></em>' reference list.
	 * The list contents are of type {@link ServicePIM.AlgoResourceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Related Algo Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related Algo Model</em>' reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModel_HasRelatedAlgoModel()
	 * @model
	 * @generated
	 */
	EList<AlgoResourceModel> getHasRelatedAlgoModel();

	/**
	 * Returns the value of the '<em><b>RModel Has Setter</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.SetterFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RModel Has Setter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RModel Has Setter</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModel_RModelHasSetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SetterFunction> getRModelHasSetter();

	/**
	 * Returns the value of the '<em><b>RModel Has Getter</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.GetterFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RModel Has Getter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RModel Has Getter</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModel_RModelHasGetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GetterFunction> getRModelHasGetter();

	/**
	 * Returns the value of the '<em><b>Is Mapped To RDBMS Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mapped To RDBMS Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mapped To RDBMS Table</em>' reference.
	 * @see #setIsMappedToRDBMSTable(RDBMSTable)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModel_IsMappedToRDBMSTable()
	 * @model required="true"
	 * @generated
	 */
	RDBMSTable getIsMappedToRDBMSTable();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceModel#getIsMappedToRDBMSTable <em>Is Mapped To RDBMS Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mapped To RDBMS Table</em>' reference.
	 * @see #getIsMappedToRDBMSTable()
	 * @generated
	 */
	void setIsMappedToRDBMSTable(RDBMSTable value);

	/**
	 * Returns the value of the '<em><b>RModel Has Parse Function</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.RepresentationParseFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RModel Has Parse Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RModel Has Parse Function</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModel_RModelHasParseFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RepresentationParseFunction> getRModelHasParseFunction();

	/**
	 * Returns the value of the '<em><b>RModel Marshalling Function</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.RepresentationMarshallingFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RModel Marshalling Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RModel Marshalling Function</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModel_RModelMarshallingFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RepresentationMarshallingFunction> getRModelMarshallingFunction();

} // ResourceModel
