/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algo Resource Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePIM.AlgoResourceController#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceController#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceController#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceController#getHasAssociatedAlgoModel <em>Has Associated Algo Model</em>}</li>
 *   <li>{@link ServicePIM.AlgoResourceController#getAlgoControllerHasCRUDActivity <em>Algo Controller Has CRUD Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceController()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='algoControllerNotAllowedCRUDVerbs algoControllerHasUniqueCRUDActivity algoControllerActivityAddsHypermediaLinkToSelf'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot algoControllerNotAllowedCRUDVerbs='self.algoControllerHasCRUDActivity->select(CRUDActivity| CRUDActivity.crudVerb =2 or CRUDActivity.crudVerb = 3)->isEmpty()' algoControllerHasUniqueCRUDActivity='self.algoControllerHasCRUDActivity->size() = 1' algoControllerActivityAddsHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.algoControllerHasCRUDActivity->exists(crudVerb = 0)\n\t\t\t\timplies\n\t\t\t\tself.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Sibling\' and hasTargetAlgoController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.algoControllerHasCRUDActivity->select(crudVerb = 0).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 0 and linkType = \'Sibling\' and hasTargetAlgoController = self)\n\t\t\t\timplies\t\t\n\t\t\t\tself.algoControllerHasCRUDActivity->exists(crudVerb = 0)\t\t\n\t\t\t)\n\t\t)\n\t\tor\n\t\t(\n\t\t\t(\n\t\t\t\tself.algoControllerHasCRUDActivity->exists(crudVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Sibling\' and hasTargetAlgoController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.algoControllerHasCRUDActivity->select(crudVerb = 1).hasCRUDActivityHandler.hasHypermediaFunction.hasHypermediaLink->one(linkCRUDVerb = 1 and linkType = \'Sibling\' and hasTargetAlgoController = self)\n\t\t\t\timplies\t\t\n\t\t\t\tself.algoControllerHasCRUDActivity->exists(crudVerb = 1)\t\t\n\t\t\t)\n\t\t)'"
 * @generated
 */
public interface AlgoResourceController extends EObject {
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
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceController_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.AlgoResourceController#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceController_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link ServicePIM.AlgoResourceController#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

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
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceController_ControllerURI()
	 * @model required="true"
	 * @generated
	 */
	String getControllerURI();

	/**
	 * Sets the value of the '{@link ServicePIM.AlgoResourceController#getControllerURI <em>Controller URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller URI</em>' attribute.
	 * @see #getControllerURI()
	 * @generated
	 */
	void setControllerURI(String value);

	/**
	 * Returns the value of the '<em><b>Has Associated Algo Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Associated Algo Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Associated Algo Model</em>' reference.
	 * @see #setHasAssociatedAlgoModel(AlgoResourceModel)
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceController_HasAssociatedAlgoModel()
	 * @model required="true"
	 * @generated
	 */
	AlgoResourceModel getHasAssociatedAlgoModel();

	/**
	 * Sets the value of the '{@link ServicePIM.AlgoResourceController#getHasAssociatedAlgoModel <em>Has Associated Algo Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Associated Algo Model</em>' reference.
	 * @see #getHasAssociatedAlgoModel()
	 * @generated
	 */
	void setHasAssociatedAlgoModel(AlgoResourceModel value);

	/**
	 * Returns the value of the '<em><b>Algo Controller Has CRUD Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algo Controller Has CRUD Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo Controller Has CRUD Activity</em>' containment reference.
	 * @see #setAlgoControllerHasCRUDActivity(ResourceControllerCRUDActivity)
	 * @see ServicePIM.RESTServicePIMPackage#getAlgoResourceController_AlgoControllerHasCRUDActivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResourceControllerCRUDActivity getAlgoControllerHasCRUDActivity();

	/**
	 * Sets the value of the '{@link ServicePIM.AlgoResourceController#getAlgoControllerHasCRUDActivity <em>Algo Controller Has CRUD Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algo Controller Has CRUD Activity</em>' containment reference.
	 * @see #getAlgoControllerHasCRUDActivity()
	 * @generated
	 */
	void setAlgoControllerHasCRUDActivity(ResourceControllerCRUDActivity value);

} // AlgoResourceController
