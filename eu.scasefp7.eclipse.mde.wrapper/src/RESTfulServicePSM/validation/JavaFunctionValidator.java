/**
 *
 * $Id$
 */
package RESTfulServicePSM.validation;

import RESTfulServicePSM.FunctionParameter;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link RESTfulServicePSM.JavaFunction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface JavaFunctionValidator {
	boolean validate();

	boolean validateHasFunctionParameter(EList<FunctionParameter> value);
	boolean validateName(String value);
}
