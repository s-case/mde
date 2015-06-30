/**
 */
package ServicePIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Model Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.ResourceModelManager#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.ResourceModelManager#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link ServicePIM.ResourceModelManager#getHasRelatedModel <em>Has Related Model</em>}</li>
 *   <li>{@link ServicePIM.ResourceModelManager#getRMManagerHasInputRepresentation <em>RM Manager Has Input Representation</em>}</li>
 *   <li>{@link ServicePIM.ResourceModelManager#getRMManagerHasOutputRepresentation <em>RM Manager Has Output Representation</em>}</li>
 *   <li>{@link ServicePIM.ResourceModelManager#getHasRMManagerProperty <em>Has RM Manager Property</em>}</li>
 *   <li>{@link ServicePIM.ResourceModelManager#getRMManagerHasSetter <em>RM Manager Has Setter</em>}</li>
 *   <li>{@link ServicePIM.ResourceModelManager#getRMManagerHasGetter <em>RM Manager Has Getter</em>}</li>
 *   <li>{@link ServicePIM.ResourceModelManager#getRMManagerHasParseFunction <em>RM Manager Has Parse Function</em>}</li>
 *   <li>{@link ServicePIM.ResourceModelManager#getRMManagerHasMarshallingFunction <em>RM Manager Has Marshalling Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getResourceModelManager()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='existantSettersForAllProperties existantGettersForAllProperties uniqueLinklistProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot existantSettersForAllProperties='self.hasRMManagerProperty->forAll(rMManagerProperty | self.rMManagerHasSetter->one(setsProperty.name = rMManagerProperty.name))' existantGettersForAllProperties='self.hasRMManagerProperty->forAll(rMManagerProperty | self.rMManagerHasGetter->one(getsProperty.name = rMManagerProperty.name))' uniqueLinklistProperty='self.hasRMManagerProperty->one(name = \'linklist\')'"
 * @generated
 */
public interface ResourceModelManager extends EObject {
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
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModelManager_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceModelManager#getName <em>Name</em>}' attribute.
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
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModelManager_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceModelManager#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

	/**
	 * Returns the value of the '<em><b>Has Related Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Related Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related Model</em>' reference.
	 * @see #setHasRelatedModel(ResourceModel)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModelManager_HasRelatedModel()
	 * @model required="true"
	 * @generated
	 */
	ResourceModel getHasRelatedModel();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceModelManager#getHasRelatedModel <em>Has Related Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Related Model</em>' reference.
	 * @see #getHasRelatedModel()
	 * @generated
	 */
	void setHasRelatedModel(ResourceModel value);

	/**
	 * Returns the value of the '<em><b>RM Manager Has Input Representation</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.ResourceInputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RM Manager Has Input Representation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RM Manager Has Input Representation</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModelManager_RMManagerHasInputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceInputRepresentation> getRMManagerHasInputRepresentation();

	/**
	 * Returns the value of the '<em><b>RM Manager Has Output Representation</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.ResourceOutputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RM Manager Has Output Representation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RM Manager Has Output Representation</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModelManager_RMManagerHasOutputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceOutputRepresentation> getRMManagerHasOutputRepresentation();

	/**
	 * Returns the value of the '<em><b>Has RM Manager Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has RM Manager Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has RM Manager Property</em>' containment reference.
	 * @see #setHasRMManagerProperty(PIMComponentProperty)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModelManager_HasRMManagerProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PIMComponentProperty getHasRMManagerProperty();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceModelManager#getHasRMManagerProperty <em>Has RM Manager Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has RM Manager Property</em>' containment reference.
	 * @see #getHasRMManagerProperty()
	 * @generated
	 */
	void setHasRMManagerProperty(PIMComponentProperty value);

	/**
	 * Returns the value of the '<em><b>RM Manager Has Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RM Manager Has Setter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RM Manager Has Setter</em>' containment reference.
	 * @see #setRMManagerHasSetter(SetterFunction)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModelManager_RMManagerHasSetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SetterFunction getRMManagerHasSetter();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceModelManager#getRMManagerHasSetter <em>RM Manager Has Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RM Manager Has Setter</em>' containment reference.
	 * @see #getRMManagerHasSetter()
	 * @generated
	 */
	void setRMManagerHasSetter(SetterFunction value);

	/**
	 * Returns the value of the '<em><b>RM Manager Has Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RM Manager Has Getter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RM Manager Has Getter</em>' containment reference.
	 * @see #setRMManagerHasGetter(GetterFunction)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModelManager_RMManagerHasGetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GetterFunction getRMManagerHasGetter();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceModelManager#getRMManagerHasGetter <em>RM Manager Has Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RM Manager Has Getter</em>' containment reference.
	 * @see #getRMManagerHasGetter()
	 * @generated
	 */
	void setRMManagerHasGetter(GetterFunction value);

	/**
	 * Returns the value of the '<em><b>RM Manager Has Parse Function</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.RepresentationParseFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RM Manager Has Parse Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RM Manager Has Parse Function</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModelManager_RMManagerHasParseFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RepresentationParseFunction> getRMManagerHasParseFunction();

	/**
	 * Returns the value of the '<em><b>RM Manager Has Marshalling Function</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.RepresentationMarshallingFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RM Manager Has Marshalling Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RM Manager Has Marshalling Function</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceModelManager_RMManagerHasMarshallingFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RepresentationMarshallingFunction> getRMManagerHasMarshallingFunction();

} // ResourceModelManager
