/**
 */
package AuthorizationLayerPSM;

import RESTfulServicePSM.HTTPActivityHandler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ann HTTP Activity Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.AnnHTTPActivityHandler#getAnnotatesHTTPActivityHandler <em>Annotates HTTP Activity Handler</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAnnHTTPActivityHandler()
 * @model
 * @generated
 */
public interface AnnHTTPActivityHandler extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Annotates HTTP Activity Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotates HTTP Activity Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotates HTTP Activity Handler</em>' reference.
	 * @see #setAnnotatesHTTPActivityHandler(HTTPActivityHandler)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAnnHTTPActivityHandler_AnnotatesHTTPActivityHandler()
	 * @model
	 * @generated
	 */
	HTTPActivityHandler getAnnotatesHTTPActivityHandler();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AnnHTTPActivityHandler#getAnnotatesHTTPActivityHandler <em>Annotates HTTP Activity Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates HTTP Activity Handler</em>' reference.
	 * @see #getAnnotatesHTTPActivityHandler()
	 * @generated
	 */
	void setAnnotatesHTTPActivityHandler(HTTPActivityHandler value);

} // AnnHTTPActivityHandler
