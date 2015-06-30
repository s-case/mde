/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Input Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.ResourceInputRepresentation#getInputType <em>Input Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getResourceInputRepresentation()
 * @model
 * @generated
 */
public interface ResourceInputRepresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePIM.MediaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Type</em>' attribute.
	 * @see ServicePIM.MediaType
	 * @see #setInputType(MediaType)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceInputRepresentation_InputType()
	 * @model required="true"
	 * @generated
	 */
	MediaType getInputType();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceInputRepresentation#getInputType <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Type</em>' attribute.
	 * @see ServicePIM.MediaType
	 * @see #getInputType()
	 * @generated
	 */
	void setInputType(MediaType value);

} // ResourceInputRepresentation
