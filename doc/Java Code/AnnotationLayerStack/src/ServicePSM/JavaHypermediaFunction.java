/**
 */
package ServicePSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Hypermedia Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePSM.JavaHypermediaFunction#getHasPSMHypermediaLink <em>Has PSM Hypermedia Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePSM.RESTfulServicePSMPackage#getJavaHypermediaFunction()
 * @model
 * @generated
 */
public interface JavaHypermediaFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Has PSM Hypermedia Link</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePSM.PSMHypermediaLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has PSM Hypermedia Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has PSM Hypermedia Link</em>' containment reference list.
	 * @see ServicePSM.RESTfulServicePSMPackage#getJavaHypermediaFunction_HasPSMHypermediaLink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PSMHypermediaLink> getHasPSMHypermediaLink();

} // JavaHypermediaFunction
