/**
 */
package ServicePIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Controller Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.ResourceControllerManager#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.ResourceControllerManager#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link ServicePIM.ResourceControllerManager#getHasAssociatedRMManager <em>Has Associated RM Manager</em>}</li>
 *   <li>{@link ServicePIM.ResourceControllerManager#getRCManagerHasCRUDActivity <em>RC Manager Has CRUD Activity</em>}</li>
 *   <li>{@link ServicePIM.ResourceControllerManager#getParentName <em>Parent Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getResourceControllerManager()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='rCManagerHasUniqueCREATEActivity rCManagerHasUniqueREADActivity rCManagerNotAllowedCRUDActivityVerbs rCManagerCreateActivityAddsCreateHypermediaLinkToSelf rCManagerReadActivityAddsCreateHypermediaLinkToSelf rCManagerCreateActivityAddsReadHypermediaLinkToSelf rCManagerReadActivityAddsReadHypermediaLinkToSelf'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot rCManagerHasUniqueCREATEActivity='self.rCManagerHasCRUDActivity->one(crudVerb = 0)' rCManagerHasUniqueREADActivity='self.rCManagerHasCRUDActivity->one(crudVerb = 1)' rCManagerNotAllowedCRUDActivityVerbs='self.rCManagerHasCRUDActivity->select(crudVerb = 2 or crudVerb = 3)->isEmpty()' rCManagerCreateActivityAddsCreateHypermediaLinkToSelf='self.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and hasTargetRCManager = self and linkType = \'Sibling\')' rCManagerReadActivityAddsCreateHypermediaLinkToSelf='self.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and hasTargetRCManager = self and linkType = \'Sibling\')' rCManagerCreateActivityAddsReadHypermediaLinkToSelf='self.rCManagerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and hasTargetRCManager = self and linkType = \'Sibling\')' rCManagerReadActivityAddsReadHypermediaLinkToSelf='self.rCManagerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and hasTargetRCManager = self and linkType = \'Sibling\')'"
 * @generated
 */
public interface ResourceControllerManager extends EObject {
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
	 * @see ServicePIM.RESTServicePIMPackage#getResourceControllerManager_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceControllerManager#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Controller URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller URI</em>' attribute.
	 * @see #setControllerURI(String)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceControllerManager_ControllerURI()
	 * @model required="true"
	 * @generated
	 */
	String getControllerURI();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceControllerManager#getControllerURI <em>Controller URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller URI</em>' attribute.
	 * @see #getControllerURI()
	 * @generated
	 */
	void setControllerURI(String value);

	/**
	 * Returns the value of the '<em><b>Has Associated RM Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Associated RM Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Associated RM Manager</em>' reference.
	 * @see #setHasAssociatedRMManager(ResourceModelManager)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceControllerManager_HasAssociatedRMManager()
	 * @model required="true"
	 * @generated
	 */
	ResourceModelManager getHasAssociatedRMManager();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceControllerManager#getHasAssociatedRMManager <em>Has Associated RM Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Associated RM Manager</em>' reference.
	 * @see #getHasAssociatedRMManager()
	 * @generated
	 */
	void setHasAssociatedRMManager(ResourceModelManager value);

	/**
	 * Returns the value of the '<em><b>RC Manager Has CRUD Activity</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.ResourceControllerCRUDActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RC Manager Has CRUD Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RC Manager Has CRUD Activity</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceControllerManager_RCManagerHasCRUDActivity()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<ResourceControllerCRUDActivity> getRCManagerHasCRUDActivity();

	/**
	 * Returns the value of the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Name</em>' attribute.
	 * @see #setParentName(String)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceControllerManager_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceControllerManager#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

} // ResourceControllerManager
