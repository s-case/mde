/**
 */
package ServicePIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Hypermedia PIM Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.CreateHypermediaPIMFunction#getHasHypermediaLink <em>Has Hypermedia Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getCreateHypermediaPIMFunction()
 * @model
 * @generated
 */
public interface CreateHypermediaPIMFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Hypermedia Link</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.HypermediaLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Hypermedia Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Hypermedia Link</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getCreateHypermediaPIMFunction_HasHypermediaLink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<HypermediaLink> getHasHypermediaLink();

} // CreateHypermediaPIMFunction
