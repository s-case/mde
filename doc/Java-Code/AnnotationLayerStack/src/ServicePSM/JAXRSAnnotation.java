/**
 */
package ServicePSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JAXRS Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePSM.JAXRSAnnotation#getJAXRSAnnotationText <em>JAXRS Annotation Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePSM.RESTfulServicePSMPackage#getJAXRSAnnotation()
 * @model
 * @generated
 */
public interface JAXRSAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>JAXRS Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JAXRS Annotation Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JAXRS Annotation Text</em>' attribute.
	 * @see #setJAXRSAnnotationText(String)
	 * @see ServicePSM.RESTfulServicePSMPackage#getJAXRSAnnotation_JAXRSAnnotationText()
	 * @model required="true"
	 * @generated
	 */
	String getJAXRSAnnotationText();

	/**
	 * Sets the value of the '{@link ServicePSM.JAXRSAnnotation#getJAXRSAnnotationText <em>JAXRS Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JAXRS Annotation Text</em>' attribute.
	 * @see #getJAXRSAnnotationText()
	 * @generated
	 */
	void setJAXRSAnnotationText(String value);

} // JAXRSAnnotation
