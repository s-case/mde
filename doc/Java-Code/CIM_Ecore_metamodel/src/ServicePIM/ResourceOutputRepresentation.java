/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Output Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.ResourceOutputRepresentation#getOutputType <em>Output Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getResourceOutputRepresentation()
 * @model
 * @generated
 */
public interface ResourceOutputRepresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePIM.MediaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Type</em>' attribute.
	 * @see ServicePIM.MediaType
	 * @see #setOutputType(MediaType)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceOutputRepresentation_OutputType()
	 * @model required="true"
	 * @generated
	 */
	MediaType getOutputType();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceOutputRepresentation#getOutputType <em>Output Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Type</em>' attribute.
	 * @see ServicePIM.MediaType
	 * @see #getOutputType()
	 * @generated
	 */
	void setOutputType(MediaType value);

} // ResourceOutputRepresentation
