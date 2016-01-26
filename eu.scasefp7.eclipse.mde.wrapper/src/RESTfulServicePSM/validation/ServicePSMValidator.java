/**
 *
 * $Id$
 */
package RESTfulServicePSM.validation;

import RESTfulServicePSM.HibernateController;
import RESTfulServicePSM.JavaAlgoResourceController;
import RESTfulServicePSM.JavaAlgoResourceModel;
import RESTfulServicePSM.JavaResourceController;
import RESTfulServicePSM.JavaResourceControllerManager;
import RESTfulServicePSM.JavaResourceModel;
import RESTfulServicePSM.JavaResourceModelManager;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link RESTfulServicePSM.ServicePSM}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ServicePSMValidator {
	boolean validate();

	boolean validateHasJavaRModel(EList<JavaResourceModel> value);
	boolean validateHasJavaRController(EList<JavaResourceController> value);
	boolean validateHasJavaRCManager(EList<JavaResourceControllerManager> value);
	boolean validateHasJavaRMManager(EList<JavaResourceModelManager> value);
	boolean validateHasJavaAlgoModel(EList<JavaAlgoResourceModel> value);
	boolean validateHasJavaAlgoController(EList<JavaAlgoResourceController> value);
	boolean validateHasHibernateController(HibernateController value);
	boolean validateName(String value);
	boolean validateServiceOutputPath(String value);
	boolean validateServiceDatabaseIP(String value);
	boolean validateServiceDatabasePort(String value);
	boolean validateServiceDatabaseUsername(String value);
	boolean validateServiceDatabasePassword(String value);
	boolean validateServiceDatabaseType(String value);
}
