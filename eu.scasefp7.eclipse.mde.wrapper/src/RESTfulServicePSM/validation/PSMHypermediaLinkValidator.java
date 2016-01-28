/**
 *
 * $Id$
 */
package RESTfulServicePSM.validation;

import RESTfulServicePSM.HTTPVerb;
import RESTfulServicePSM.JavaAlgoResourceController;
import RESTfulServicePSM.JavaResourceController;
import RESTfulServicePSM.JavaResourceControllerManager;
import RESTfulServicePSM.LinkType;

/**
 * A sample validator interface for {@link RESTfulServicePSM.PSMHypermediaLink}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PSMHypermediaLinkValidator {
	boolean validate();

	boolean validateHasTargetJavaAlgoController(JavaAlgoResourceController value);
	boolean validateHasTargetJavaRController(JavaResourceController value);
	boolean validateHasTargetRCManager(JavaResourceControllerManager value);
	boolean validateLinkHTTPVerb(HTTPVerb value);
	boolean validateLinkType(LinkType value);
}
