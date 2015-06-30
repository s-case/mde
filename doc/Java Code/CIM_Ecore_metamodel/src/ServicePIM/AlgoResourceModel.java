/**
 */
package ServicePIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algo Resource Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.AlgoResourceModel#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceModel#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceModel#getAlgoModelHasInputRepresentation <em>Algo Model Has Input Representation</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceModel#getAlgoModelHasOutputRepresentation <em>Algo Model Has Output Representation</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceModel#getAlgoModelHasProperty <em>Algo Model Has Property</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceModel#getAlgoModelHasSetter <em>Algo Model Has Setter</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceModel#getAlgoModelHasGetter <em>Algo Model Has Getter</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceModel#getHasRelatedAlgoModel <em>Has Related Algo Model</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceModel#getIsRelatedAlgoModel <em>Is Related Algo Model</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceModel#getAlgoModelHasParseFunction <em>Algo Model Has Parse Function</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceModel#getAlgoModelHasMarshallingFunction <em>Algo Model Has Marshalling Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='existantSettersForAllProperties existantGettersForAllProperties uniqueLinklistProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot existantSettersForAllProperties='self.algoModelHasProperty->forAll(rAlgoModelProperty | self.algoModelHasSetter->one(setsProperty.name = rAlgoModelProperty.name))' existantGettersForAllProperties='self.algoModelHasProperty->forAll(rAlgoModelProperty | self.algoModelHasGetter->one(getsProperty.name = rAlgoModelProperty.name))' uniqueLinklistProperty='self.algoModelHasProperty->one(name = \'linklist\')'"
 * @generated
 */
public interface AlgoResourceModel extends EObject {
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
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceModel_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link ServicePIM.AlgoResourceModel#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

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
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.AlgoResourceModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Algo Model Has Input Representation</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.ResourceInputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algo Model Has Input Representation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo Model Has Input Representation</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceModel_AlgoModelHasInputRepresentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceInputRepresentation> getAlgoModelHasInputRepresentation();

	/**
	 * Returns the value of the '<em><b>Algo Model Has Output Representation</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.ResourceOutputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algo Model Has Output Representation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo Model Has Output Representation</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceModel_AlgoModelHasOutputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceOutputRepresentation> getAlgoModelHasOutputRepresentation();

	/**
	 * Returns the value of the '<em><b>Algo Model Has Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algo Model Has Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo Model Has Property</em>' containment reference.
	 * @see #setAlgoModelHasProperty(PIMComponentProperty)
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceModel_AlgoModelHasProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PIMComponentProperty getAlgoModelHasProperty();

	/**
	 * Sets the value of the '{@link ServicePIM.AlgoResourceModel#getAlgoModelHasProperty <em>Algo Model Has Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algo Model Has Property</em>' containment reference.
	 * @see #getAlgoModelHasProperty()
	 * @generated
	 */
	void setAlgoModelHasProperty(PIMComponentProperty value);

	/**
	 * Returns the value of the '<em><b>Algo Model Has Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algo Model Has Setter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo Model Has Setter</em>' containment reference.
	 * @see #setAlgoModelHasSetter(SetterFunction)
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceModel_AlgoModelHasSetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SetterFunction getAlgoModelHasSetter();

	/**
	 * Sets the value of the '{@link ServicePIM.AlgoResourceModel#getAlgoModelHasSetter <em>Algo Model Has Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algo Model Has Setter</em>' containment reference.
	 * @see #getAlgoModelHasSetter()
	 * @generated
	 */
	void setAlgoModelHasSetter(SetterFunction value);

	/**
	 * Returns the value of the '<em><b>Algo Model Has Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algo Model Has Getter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo Model Has Getter</em>' containment reference.
	 * @see #setAlgoModelHasGetter(GetterFunction)
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceModel_AlgoModelHasGetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GetterFunction getAlgoModelHasGetter();

	/**
	 * Sets the value of the '{@link ServicePIM.AlgoResourceModel#getAlgoModelHasGetter <em>Algo Model Has Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algo Model Has Getter</em>' containment reference.
	 * @see #getAlgoModelHasGetter()
	 * @generated
	 */
	void setAlgoModelHasGetter(GetterFunction value);

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
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceModel_HasRelatedAlgoModel()
	 * @model
	 * @generated
	 */
	EList<AlgoResourceModel> getHasRelatedAlgoModel();

	/**
	 * Returns the value of the '<em><b>Is Related Algo Model</b></em>' reference list.
	 * The list contents are of type {@link ServicePIM.AlgoResourceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related Algo Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related Algo Model</em>' reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceModel_IsRelatedAlgoModel()
	 * @model
	 * @generated
	 */
	EList<AlgoResourceModel> getIsRelatedAlgoModel();

	/**
	 * Returns the value of the '<em><b>Algo Model Has Parse Function</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.RepresentationParseFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algo Model Has Parse Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo Model Has Parse Function</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceModel_AlgoModelHasParseFunction()
	 * @model containment="true"
	 * @generated
	 */
	EList<RepresentationParseFunction> getAlgoModelHasParseFunction();

	/**
	 * Returns the value of the '<em><b>Algo Model Has Marshalling Function</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.RepresentationMarshallingFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algo Model Has Marshalling Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo Model Has Marshalling Function</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceModel_AlgoModelHasMarshallingFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RepresentationMarshallingFunction> getAlgoModelHasMarshallingFunction();

} // AlgoResourceModel
