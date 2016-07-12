/**
 *
 * $Id$
 */
package RESTfulServicePSM.validation;

import RESTfulServicePSM.HTTPVerb;
import RESTfulServicePSM.JavaHypermediaFunction;

/**
 * A sample validator interface for {@link RESTfulServicePSM.HTTPActivityHandler}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HTTPActivityHandlerValidator {
	boolean validate();

	boolean validateHasHypermediaFunction(JavaHypermediaFunction value);
	boolean validateName(String value);
	boolean validateHandlerHTTPVerb(HTTPVerb value);
}
