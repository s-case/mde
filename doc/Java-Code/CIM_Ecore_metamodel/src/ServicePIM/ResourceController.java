/**
 */
package ServicePIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.ResourceController#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.ResourceController#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link ServicePIM.ResourceController#getHasAssociatedRModel <em>Has Associated RModel</em>}</li>
 *   <li>{@link ServicePIM.ResourceController#getRControllerHasCRUDActivity <em>RController Has CRUD Activity</em>}</li>
 *   <li>{@link ServicePIM.ResourceController#getParentName <em>Parent Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getResourceController()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='rControllerHasUniqueCRUDActivities rControllerNotAllowedCRUDActivitiyVerbs rControllerReadActivityAddsReadHypermediaLinkToSelf rControllerUpdateActivityAddsUpdateHypermediaLinkToSelf rControllerReadActivityAddsUpdateHypermediaLinkToSelf rControllerReadActivityAddsDeleteHypermediaLinkToSelf rControllerUpdateActivityAddsReadHypermediaLinkToSelf rControllerUpdateActivityAddsDeleteHypermediaLinkToSelf'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot rControllerHasUniqueCRUDActivities='self.rControllerHasCRUDActivity->isUnique(crudVerb)' rControllerNotAllowedCRUDActivitiyVerbs='self.rControllerHasCRUDActivity->select(crudVerb = 0)->isEmpty()' rControllerReadActivityAddsReadHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity.hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity.hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t)\n\t\t)' rControllerUpdateActivityAddsUpdateHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity.hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity.hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t)\n\t\t)' rControllerReadActivityAddsUpdateHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 2) and self.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 2 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 2) and self.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t)\n\t\t)' rControllerReadActivityAddsDeleteHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 3) and self.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 3) and self.rControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t)\n\t\t)' rControllerUpdateActivityAddsReadHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 1) and self.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 1) and self.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t)\n\t\t)' rControllerUpdateActivityAddsDeleteHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 3) and self.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.rControllerHasCRUDActivity->select(crudVerb = 2).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 3 and linkType = \'Sibling\' and hasTargetRController = self)\n\t\t\t\timplies\n\t\t\t\tself.rControllerHasCRUDActivity->exists(crudVerb = 3) and self.rControllerHasCRUDActivity->exists(crudVerb = 2)\n\t\t\t)\n\t\t)'"
 * @generated
 */
public interface ResourceController extends EObject {
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
	 * @see ServicePIM.RESTServicePIMPackage#getResourceController_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceController#getName <em>Name</em>}' attribute.
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
	 * @see ServicePIM.RESTServicePIMPackage#getResourceController_ControllerURI()
	 * @model required="true"
	 * @generated
	 */
	String getControllerURI();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceController#getControllerURI <em>Controller URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller URI</em>' attribute.
	 * @see #getControllerURI()
	 * @generated
	 */
	void setControllerURI(String value);

	/**
	 * Returns the value of the '<em><b>Has Associated RModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Associated RModel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Associated RModel</em>' reference.
	 * @see #setHasAssociatedRModel(ResourceModel)
	 * @see ServicePIM.RESTServicePIMPackage#getResourceController_HasAssociatedRModel()
	 * @model required="true"
	 * @generated
	 */
	ResourceModel getHasAssociatedRModel();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceController#getHasAssociatedRModel <em>Has Associated RModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Associated RModel</em>' reference.
	 * @see #getHasAssociatedRModel()
	 * @generated
	 */
	void setHasAssociatedRModel(ResourceModel value);

	/**
	 * Returns the value of the '<em><b>RController Has CRUD Activity</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.ResourceControllerCRUDActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RController Has CRUD Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RController Has CRUD Activity</em>' containment reference list.
	 * @see ServicePIM.RESTServicePIMPackage#getResourceController_RControllerHasCRUDActivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceControllerCRUDActivity> getRControllerHasCRUDActivity();

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
	 * @see ServicePIM.RESTServicePIMPackage#getResourceController_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link ServicePIM.ResourceController#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

} // ResourceController
