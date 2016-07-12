/**
 *
 * $Id$
 */
package RESTfulServicePSM.validation;

import RESTfulServicePSM.JAXBAnnotation;
import RESTfulServicePSM.JavaGetterFunction;
import RESTfulServicePSM.JavaResourceModel;
import RESTfulServicePSM.JavaSetterFunction;
import RESTfulServicePSM.PSMComponentProperty;

/**
 * A sample validator interface for {@link RESTfulServicePSM.JavaResourceModelManager}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface JavaResourceModelManagerValidator {
	boolean validate();

	boolean validateJavaRMManagerHasJAXBAnnotation(JAXBAnnotation value);
	boolean validateJavaRMManagerHasProperty(PSMComponentProperty value);
	boolean validateHasRelatedJavaRModel(JavaResourceModel value);
	boolean validateJavaRMManagerHasSetter(JavaSetterFunction value);
	boolean validateJavaRMManagerHasGetter(JavaGetterFunction value);
	boolean validateName(String value);
	boolean validateParentName(String value);
}
