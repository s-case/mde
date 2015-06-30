/**
 */
package ServicePSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Activity Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePSM.HTTPActivityFunctionParameter#getHTTPFunctionParameterHasJAXRSAnnotation <em>HTTP Function Parameter Has JAXRS Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePSM.RESTfulServicePSMPackage#getHTTPActivityFunctionParameter()
 * @model
 * @generated
 */
public interface HTTPActivityFunctionParameter extends FunctionParameter {
	/**
	 * Returns the value of the '<em><b>HTTP Function Parameter Has JAXRS Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTTP Function Parameter Has JAXRS Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTTP Function Parameter Has JAXRS Annotation</em>' containment reference.
	 * @see #setHTTPFunctionParameterHasJAXRSAnnotation(JAXRSAnnotation)
	 * @see ServicePSM.RESTfulServicePSMPackage#getHTTPActivityFunctionParameter_HTTPFunctionParameterHasJAXRSAnnotation()
	 * @model containment="true"
	 * @generated
	 */
	JAXRSAnnotation getHTTPFunctionParameterHasJAXRSAnnotation();

	/**
	 * Sets the value of the '{@link ServicePSM.HTTPActivityFunctionParameter#getHTTPFunctionParameterHasJAXRSAnnotation <em>HTTP Function Parameter Has JAXRS Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HTTP Function Parameter Has JAXRS Annotation</em>' containment reference.
	 * @see #getHTTPFunctionParameterHasJAXRSAnnotation()
	 * @generated
	 */
	void setHTTPFunctionParameterHasJAXRSAnnotation(JAXRSAnnotation value);

} // HTTPActivityFunctionParameter
