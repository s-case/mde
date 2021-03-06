/**
 */
package ExternalServiceLayerPSM;

import RESTfulServicePSM.JavaResourceModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ann Java Resource Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.AnnJavaResourceModel#getAnnotatesJavaResourceModel <em>Annotates Java Resource Model</em>}</li>
 * </ul>
 *
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getAnnJavaResourceModel()
 * @model
 * @generated
 */
public interface AnnJavaResourceModel extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Annotates Java Resource Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotates Java Resource Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotates Java Resource Model</em>' reference.
	 * @see #setAnnotatesJavaResourceModel(JavaResourceModel)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getAnnJavaResourceModel_AnnotatesJavaResourceModel()
	 * @model required="true"
	 * @generated
	 */
	JavaResourceModel getAnnotatesJavaResourceModel();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.AnnJavaResourceModel#getAnnotatesJavaResourceModel <em>Annotates Java Resource Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates Java Resource Model</em>' reference.
	 * @see #getAnnotatesJavaResourceModel()
	 * @generated
	 */
	void setAnnotatesJavaResourceModel(JavaResourceModel value);

} // AnnJavaResourceModel
