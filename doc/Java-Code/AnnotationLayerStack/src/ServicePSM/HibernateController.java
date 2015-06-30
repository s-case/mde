/**
 */
package ServicePSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hibernate Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePSM.HibernateController#getHasHibernateActivity <em>Has Hibernate Activity</em>}</li>
 *   <li>{@link ServicePSM.HibernateController#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePSM.RESTfulServicePSMPackage#getHibernateController()
 * @model
 * @generated
 */
public interface HibernateController extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Hibernate Activity</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePSM.HibernateActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Hibernate Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Hibernate Activity</em>' containment reference list.
	 * @see ServicePSM.RESTfulServicePSMPackage#getHibernateController_HasHibernateActivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<HibernateActivity> getHasHibernateActivity();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ServicePSM.RESTfulServicePSMPackage#getHibernateController_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePSM.HibernateController#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HibernateController
