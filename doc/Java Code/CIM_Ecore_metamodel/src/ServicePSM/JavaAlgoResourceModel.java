/**
 */
package ServicePSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Algo Resource Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasJAXBAnnotation <em>Java Algo Model Has JAXB Annotation</em>}</li>
 *   <li>{@link ServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasProperty <em>Java Algo Model Has Property</em>}</li>
 *   <li>{@link ServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasSetterFunction <em>Java Algo Model Has Setter Function</em>}</li>
 *   <li>{@link ServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasGetterFunction <em>Java Algo Model Has Getter Function</em>}</li>
 *   <li>{@link ServicePSM.JavaAlgoResourceModel#getName <em>Name</em>}</li>
 *   <li>{@link ServicePSM.JavaAlgoResourceModel#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link ServicePSM.JavaAlgoResourceModel#getHasRelatedAlgoModel <em>Has Related Algo Model</em>}</li>
 *   <li>{@link ServicePSM.JavaAlgoResourceModel#getIsRelatedAlgoModel <em>Is Related Algo Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueXMLRootElementAnnotation uniqueSetterForEveryProeprty uniqueGetterForEveryProeprty uniqueLinkListProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueXMLRootElementAnnotation='self.JavaAlgoModelHasJAXBAnnotation->one(JAXBAnnotationText = \'@XmlRootElement\')' uniqueSetterForEveryProeprty='self.JavaAlgoModelHasProperty->forAll(Property | \n\t\t\tself.JavaAlgoModelHasSetterFunction->one(name = \'set\' + Property.name)\n\t\t)' uniqueGetterForEveryProeprty='self.JavaAlgoModelHasProperty->forAll(Property | \n\t\t\tself.JavaAlgoModelHasGetterFunction->one(name = \'get\' + Property.name)\n\t\t)' uniqueLinkListProperty='self.JavaAlgoModelHasProperty->one(name = \'linklist\') \n\t\t\tand self.JavaAlgoModelHasProperty->select(name = \'linklist\').PropertyHasHibernateAnnotation->one(\'@Transient\')'"
 * @generated
 */
public interface JavaAlgoResourceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Java Algo Model Has JAXB Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Algo Model Has JAXB Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Algo Model Has JAXB Annotation</em>' containment reference.
	 * @see #setJavaAlgoModelHasJAXBAnnotation(JAXBAnnotation)
	 * @see ServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_JavaAlgoModelHasJAXBAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JAXBAnnotation getJavaAlgoModelHasJAXBAnnotation();

	/**
	 * Sets the value of the '{@link ServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasJAXBAnnotation <em>Java Algo Model Has JAXB Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Algo Model Has JAXB Annotation</em>' containment reference.
	 * @see #getJavaAlgoModelHasJAXBAnnotation()
	 * @generated
	 */
	void setJavaAlgoModelHasJAXBAnnotation(JAXBAnnotation value);

	/**
	 * Returns the value of the '<em><b>Java Algo Model Has Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Algo Model Has Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Algo Model Has Property</em>' containment reference.
	 * @see #setJavaAlgoModelHasProperty(PSMComponentProperty)
	 * @see ServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_JavaAlgoModelHasProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PSMComponentProperty getJavaAlgoModelHasProperty();

	/**
	 * Sets the value of the '{@link ServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasProperty <em>Java Algo Model Has Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Algo Model Has Property</em>' containment reference.
	 * @see #getJavaAlgoModelHasProperty()
	 * @generated
	 */
	void setJavaAlgoModelHasProperty(PSMComponentProperty value);

	/**
	 * Returns the value of the '<em><b>Java Algo Model Has Setter Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Algo Model Has Setter Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Algo Model Has Setter Function</em>' containment reference.
	 * @see #setJavaAlgoModelHasSetterFunction(JavaSetterFunction)
	 * @see ServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_JavaAlgoModelHasSetterFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaSetterFunction getJavaAlgoModelHasSetterFunction();

	/**
	 * Sets the value of the '{@link ServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasSetterFunction <em>Java Algo Model Has Setter Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Algo Model Has Setter Function</em>' containment reference.
	 * @see #getJavaAlgoModelHasSetterFunction()
	 * @generated
	 */
	void setJavaAlgoModelHasSetterFunction(JavaSetterFunction value);

	/**
	 * Returns the value of the '<em><b>Java Algo Model Has Getter Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Algo Model Has Getter Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Algo Model Has Getter Function</em>' containment reference.
	 * @see #setJavaAlgoModelHasGetterFunction(JavaGetterFunction)
	 * @see ServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_JavaAlgoModelHasGetterFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaGetterFunction getJavaAlgoModelHasGetterFunction();

	/**
	 * Sets the value of the '{@link ServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasGetterFunction <em>Java Algo Model Has Getter Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Algo Model Has Getter Function</em>' containment reference.
	 * @see #getJavaAlgoModelHasGetterFunction()
	 * @generated
	 */
	void setJavaAlgoModelHasGetterFunction(JavaGetterFunction value);

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
	 * @see ServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePSM.JavaAlgoResourceModel#getName <em>Name</em>}' attribute.
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
	 * @see ServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link ServicePSM.JavaAlgoResourceModel#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

	/**
	 * Returns the value of the '<em><b>Has Related Algo Model</b></em>' reference list.
	 * The list contents are of type {@link ServicePSM.JavaAlgoResourceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Related Algo Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related Algo Model</em>' reference list.
	 * @see ServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_HasRelatedAlgoModel()
	 * @model
	 * @generated
	 */
	EList<JavaAlgoResourceModel> getHasRelatedAlgoModel();

	/**
	 * Returns the value of the '<em><b>Is Related Algo Model</b></em>' reference list.
	 * The list contents are of type {@link ServicePSM.JavaAlgoResourceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related Algo Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related Algo Model</em>' reference list.
	 * @see ServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_IsRelatedAlgoModel()
	 * @model
	 * @generated
	 */
	EList<JavaAlgoResourceModel> getIsRelatedAlgoModel();

} // JavaAlgoResourceModel
