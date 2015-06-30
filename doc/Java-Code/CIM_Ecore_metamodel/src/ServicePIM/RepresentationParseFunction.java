/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation Parse Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.RepresentationParseFunction#getParsesInputRepresentation <em>Parses Input Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getRepresentationParseFunction()
 * @model
 * @generated
 */
public interface RepresentationParseFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Parses Input Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parses Input Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parses Input Representation</em>' reference.
	 * @see #setParsesInputRepresentation(ResourceInputRepresentation)
	 * @see ServicePIM.RESTServicePIMPackage#getRepresentationParseFunction_ParsesInputRepresentation()
	 * @model required="true"
	 * @generated
	 */
	ResourceInputRepresentation getParsesInputRepresentation();

	/**
	 * Sets the value of the '{@link ServicePIM.RepresentationParseFunction#getParsesInputRepresentation <em>Parses Input Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parses Input Representation</em>' reference.
	 * @see #getParsesInputRepresentation()
	 * @generated
	 */
	void setParsesInputRepresentation(ResourceInputRepresentation value);

} // RepresentationParseFunction
