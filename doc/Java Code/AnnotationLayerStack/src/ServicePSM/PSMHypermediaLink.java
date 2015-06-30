/**
 */
package ServicePSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSM Hypermedia Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePSM.PSMHypermediaLink#getHasTargetJavaAlgoController <em>Has Target Java Algo Controller</em>}</li>
 *   <li>{@link ServicePSM.PSMHypermediaLink#getHasTargetJavaRController <em>Has Target Java RController</em>}</li>
 *   <li>{@link ServicePSM.PSMHypermediaLink#getHasTargetRCManager <em>Has Target RC Manager</em>}</li>
 *   <li>{@link ServicePSM.PSMHypermediaLink#getLinkHTTPVerb <em>Link HTTP Verb</em>}</li>
 *   <li>{@link ServicePSM.PSMHypermediaLink#getLinkType <em>Link Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePSM.RESTfulServicePSMPackage#getPSMHypermediaLink()
 * @model
 * @generated
 */
public interface PSMHypermediaLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Target Java Algo Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Target Java Algo Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Target Java Algo Controller</em>' reference.
	 * @see #setHasTargetJavaAlgoController(JavaAlgoResourceController)
	 * @see ServicePSM.RESTfulServicePSMPackage#getPSMHypermediaLink_HasTargetJavaAlgoController()
	 * @model
	 * @generated
	 */
	JavaAlgoResourceController getHasTargetJavaAlgoController();

	/**
	 * Sets the value of the '{@link ServicePSM.PSMHypermediaLink#getHasTargetJavaAlgoController <em>Has Target Java Algo Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Target Java Algo Controller</em>' reference.
	 * @see #getHasTargetJavaAlgoController()
	 * @generated
	 */
	void setHasTargetJavaAlgoController(JavaAlgoResourceController value);

	/**
	 * Returns the value of the '<em><b>Has Target Java RController</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Target Java RController</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Target Java RController</em>' reference.
	 * @see #setHasTargetJavaRController(JavaResourceController)
	 * @see ServicePSM.RESTfulServicePSMPackage#getPSMHypermediaLink_HasTargetJavaRController()
	 * @model
	 * @generated
	 */
	JavaResourceController getHasTargetJavaRController();

	/**
	 * Sets the value of the '{@link ServicePSM.PSMHypermediaLink#getHasTargetJavaRController <em>Has Target Java RController</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Target Java RController</em>' reference.
	 * @see #getHasTargetJavaRController()
	 * @generated
	 */
	void setHasTargetJavaRController(JavaResourceController value);

	/**
	 * Returns the value of the '<em><b>Has Target RC Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Target RC Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Target RC Manager</em>' reference.
	 * @see #setHasTargetRCManager(JavaResourceControllerManager)
	 * @see ServicePSM.RESTfulServicePSMPackage#getPSMHypermediaLink_HasTargetRCManager()
	 * @model
	 * @generated
	 */
	JavaResourceControllerManager getHasTargetRCManager();

	/**
	 * Sets the value of the '{@link ServicePSM.PSMHypermediaLink#getHasTargetRCManager <em>Has Target RC Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Target RC Manager</em>' reference.
	 * @see #getHasTargetRCManager()
	 * @generated
	 */
	void setHasTargetRCManager(JavaResourceControllerManager value);

	/**
	 * Returns the value of the '<em><b>Link HTTP Verb</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePSM.HTTPVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link HTTP Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link HTTP Verb</em>' attribute.
	 * @see ServicePSM.HTTPVerb
	 * @see #setLinkHTTPVerb(HTTPVerb)
	 * @see ServicePSM.RESTfulServicePSMPackage#getPSMHypermediaLink_LinkHTTPVerb()
	 * @model required="true"
	 * @generated
	 */
	HTTPVerb getLinkHTTPVerb();

	/**
	 * Sets the value of the '{@link ServicePSM.PSMHypermediaLink#getLinkHTTPVerb <em>Link HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link HTTP Verb</em>' attribute.
	 * @see ServicePSM.HTTPVerb
	 * @see #getLinkHTTPVerb()
	 * @generated
	 */
	void setLinkHTTPVerb(HTTPVerb value);

	/**
	 * Returns the value of the '<em><b>Link Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePSM.LinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Type</em>' attribute.
	 * @see ServicePSM.LinkType
	 * @see #setLinkType(LinkType)
	 * @see ServicePSM.RESTfulServicePSMPackage#getPSMHypermediaLink_LinkType()
	 * @model required="true"
	 * @generated
	 */
	LinkType getLinkType();

	/**
	 * Sets the value of the '{@link ServicePSM.PSMHypermediaLink#getLinkType <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type</em>' attribute.
	 * @see ServicePSM.LinkType
	 * @see #getLinkType()
	 * @generated
	 */
	void setLinkType(LinkType value);

} // PSMHypermediaLink
