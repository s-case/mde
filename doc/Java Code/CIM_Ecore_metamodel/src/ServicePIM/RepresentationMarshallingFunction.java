/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation Marshalling Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.RepresentationMarshallingFunction#getMarshalsRepresentation <em>Marshals Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getRepresentationMarshallingFunction()
 * @model
 * @generated
 */
public interface RepresentationMarshallingFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Marshals Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marshals Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marshals Representation</em>' reference.
	 * @see #setMarshalsRepresentation(ResourceOutputRepresentation)
	 * @see ServicePIM.RESTServicePIMPackage#getRepresentationMarshallingFunction_MarshalsRepresentation()
	 * @model required="true"
	 * @generated
	 */
	ResourceOutputRepresentation getMarshalsRepresentation();

	/**
	 * Sets the value of the '{@link ServicePIM.RepresentationMarshallingFunction#getMarshalsRepresentation <em>Marshals Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marshals Representation</em>' reference.
	 * @see #getMarshalsRepresentation()
	 * @generated
	 */
	void setMarshalsRepresentation(ResourceOutputRepresentation value);

} // RepresentationMarshallingFunction
