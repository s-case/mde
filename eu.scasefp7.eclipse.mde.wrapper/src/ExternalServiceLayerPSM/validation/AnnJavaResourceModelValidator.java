/**
 *
 * $Id$
 */
package ExternalServiceLayerPSM.validation;

import RESTfulServicePSM.JavaResourceModel;

/**
 * A sample validator interface for {@link ExternalServiceLayerPSM.AnnJavaResourceModel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AnnJavaResourceModelValidator {
	boolean validate();

	boolean validateAnnotatesJavaResourceModel(JavaResourceModel value);
}