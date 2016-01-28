/**
 *
 * $Id$
 */
package ExternalServiceLayerPSM.validation;

import ExternalServiceLayerPSM.AnnJavaAlgoController;
import ExternalServiceLayerPSM.ComplexType;
import ExternalServiceLayerPSM.JavaRESTClientHTTPActivity;
import ExternalServiceLayerPSM.JavaRESTClientModel;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ExternalServiceLayerPSM.JavaRESTClientController}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface JavaRESTClientControllerValidator {
	boolean validate();

	boolean validateHasJavaRESTClientHTTPActivity(JavaRESTClientHTTPActivity value);
	boolean validateIsJavaRESTClientController(AnnJavaAlgoController value);
	boolean validateHasAssociatedModel(JavaRESTClientModel value);
	boolean validateHasComplexTypes(EList<ComplexType> value);
}
