package org.eclipse.cdt.interfacegenerator.generate;

import org.eclipse.cdt.core.CCProjectNature;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.plugin.*;
import org.osgi.framework.BundleContext;
import java.util.*;

/**
 * The main plugin class to be used in the desktop.
 */
public class GeneratePlugin extends AbstractUIPlugin {
	//The shared instance.
	private static GeneratePlugin plugin;
	//Resource bundle.
	private ResourceBundle resourceBundle;
	
	public static final String NATURE_ID= "org.eclipse.cdt.interfacegenerator.generate.InterfaceGeneratorNature";
	public static final String BUILDER_ID= "org.eclipse.cdt.interfacegenerator.generate.Builder";
	
	/**
	 * The constructor.
	 */
	public GeneratePlugin() {
		super();
		plugin = this;
		try {
			resourceBundle = ResourceBundle.getBundle("org.eclipse.cdt.interfacegenerator.generate.GeneratePluginResources");
		} catch (MissingResourceException x) {
			resourceBundle = null;
		}
	}

	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 */
	public static GeneratePlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns the string from the plugin's resource bundle,
	 * or 'key' if not found.
	 */
	public static String getResourceString(String key) {
		ResourceBundle bundle = GeneratePlugin.getDefault().getResourceBundle();
		try {
			return (bundle != null) ? bundle.getString(key) : key;
		} catch (MissingResourceException e) {
			return key;
		}
	}

	/**
	 * Returns the plugin's resource bundle,
	 */
	public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}
	
	public void addNature(IProject project) throws CoreException
	{
		if (!project.hasNature(NATURE_ID))
		{
			IProjectDescription description=project.getDescription();
			NullProgressMonitor nullProgressMonitor = new NullProgressMonitor();
			if (!project.hasNature(CCProjectNature.CC_NATURE_ID))
			{
				CCProjectNature.addCNature(project,nullProgressMonitor);
				CCProjectNature.addCCNature(project,nullProgressMonitor);
			}
			String ids[]=description.getNatureIds();
			String newIds[]=new String[ids.length + 2];
			System.arraycopy(ids,0,newIds,0,ids.length);
			newIds[ids.length]=NATURE_ID;
			newIds[ids.length+1]=CCProjectNature.CC_NATURE_ID;
			description.setNatureIds(newIds);
			project.setDescription(description,nullProgressMonitor);
		}
	}
}
