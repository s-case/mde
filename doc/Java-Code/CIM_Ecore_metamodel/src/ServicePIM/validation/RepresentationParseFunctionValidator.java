/**
 *
 * $Id$
 */
package ServicePIM.validation;

import ServicePIM.ResourceInputRepresentation;

/**
 * A sample validator interface for {@link ServicePIM.RepresentationParseFunction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RepresentationParseFunctionValidator {
	boolean validate();

	boolean validateParsesInputRepresentation(ResourceInputRepresentation value);
}