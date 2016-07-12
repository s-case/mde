/**
 *
 * $Id$
 */
package AuthenticationLayerPSM.validation;

import AuthenticationLayerPSM.AnnJPAController;
import AuthenticationLayerPSM.AuthenticationToken;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link AuthenticationLayerPSM.AuthenticationPerformer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AuthenticationPerformerValidator {
	boolean validate();

	boolean validateHasAuthenticationToken(EList<AuthenticationToken> value);
	boolean validateIsSystemAuthenticationPerformer(AnnJPAController value);
	boolean validateAuthenticationModelName(String value);
	boolean validateAuthenticationModelParentName(String value);
}
