package eu.fp7.scase.launcher.cimgenerator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	/**
	 * A UTC ISO 8601 date formatter used to log the time of errors.
	 */
	private static final DateFormat oDateFormatter;
	static {
		oDateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
		oDateFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
	}

	/**
	 * The starting time of the current session for this plugin.
	 */
	private static String STARTING_TIME;

	/**
	 * The current error ID for this session for this plugin.
	 */
	private static int errorID;
	
	// The plug-in ID
	public static final String PLUGIN_ID = "eu.scasefp7.eclipse.mde.cimgen"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		STARTING_TIME = this.oDateFormatter.format(new Date());
		errorID = 0;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	/**
	 * Logs an exception to the Eclipse log file. This method detects the class and the method in which the exception
	 * was caught automatically using the current stack trace. If required, the user can override these values by
	 * calling {@link #log(String, String, String, Exception)} instead.
	 * 
	 * @param message a human-readable message about the exception.
	 * @param exception the exception that will be logged.
	 */
	public static void log(String message, Exception exception) {
		StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
		log(stackTraceElement.getClassName(), stackTraceElement.getMethodName(), message, exception);
	}

	/**
	 * Logs an exception to the Eclipse log file. Note that in most cases you can use the
	 * {@link #log(String, Exception)} method which automatically detects the class and the method in which the
	 * exception was caught, so it requires as parameters only a human-readable message and the exception.
	 * 
	 * @param className the name of the class in which the exception was caught.
	 * @param methodName the name of the method in which the exception was caught.
	 * @param message a human-readable message about the exception.
	 * @param exception the exception that will be logged.
	 */
	public static void log(String className, String methodName, String message, Exception exception) {
		String msg = message;
		msg += "\n!ERROR_ID t" + errorID;
		msg += "\n!SERVICE_NAME MDE CIM generator plugin";
		msg += "\n!SERVICE_VERSION 1.0.0-SNAPSHOT";
		msg += "\n!STARTING_TIME " + STARTING_TIME;
		msg += "\n!CLASS_NAME " + className;
		msg += "\n!FUNCTION_NAME " + methodName;
		msg += "\n!FAILURE_TIMESTAMP " + oDateFormatter.format(new Date());
		errorID++;
		if (plugin != null)
			plugin.getLog().log(new Status(Status.ERROR, PLUGIN_ID, Status.OK, msg, exception));
		else
			exception.printStackTrace();
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
