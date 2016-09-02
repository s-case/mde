/**
 */
package ExternalServiceLayerPSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.AnnotationModel#getHasAnnotatedElement <em>Has Annotated Element</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.AnnotationModel#getHasAnnotation <em>Has Annotation</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.AnnotationModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getAnnotationModel()
 * @model
 * @generated
 */
public interface AnnotationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Annotated Element</b></em>' containment reference list.
	 * The list contents are of type {@link ExternalServiceLayerPSM.AnnotatedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Annotated Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Annotated Element</em>' containment reference list.
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getAnnotationModel_HasAnnotatedElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AnnotatedElement> getHasAnnotatedElement();

	/**
	 * Returns the value of the '<em><b>Has Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link ExternalServiceLayerPSM.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Annotation</em>' containment reference list.
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getAnnotationModel_HasAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Annotation> getHasAnnotation();

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
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getAnnotationModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.AnnotationModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AnnotationModel
