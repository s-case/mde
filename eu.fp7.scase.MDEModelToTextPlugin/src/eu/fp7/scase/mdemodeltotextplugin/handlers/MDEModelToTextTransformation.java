package eu.fp7.scase.mdemodeltotextplugin.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;

import LayeredPSMToText.main.Generate;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class MDEModelToTextTransformation extends AbstractHandler {
	
	private static MessageConsole myConsole = findConsole("SCASE-UI");
	private static MessageConsoleStream out = myConsole.newMessageStream();
	
	/**
	 * The constructor.
	 */
	public MDEModelToTextTransformation() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		String[] acceleoArguments = new String[2];
		acceleoArguments[0] = event.getParameter("MDEOutputFolder") + "/AnnotationStack/" + event.getParameter("WebServiceName") + "AnnotationStack.xmi";
		acceleoArguments[1] = event.getParameter("MDEOutputFolder") + "/MDEGeneratedCode/";		

		Generate.main(acceleoArguments);
		return null;
	}
	
	private static MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++){
		    if (name.equals(existing[i].getName())){
		    	return (MessageConsole) existing[i];
		    }
		}
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}
}
