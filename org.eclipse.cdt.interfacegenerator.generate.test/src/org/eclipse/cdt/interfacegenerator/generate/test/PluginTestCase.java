/*
 * Created on Sep 14, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.cdt.interfacegenerator.generate.test;

import org.eclipse.cdt.interfacegenerator.generate.GeneratePlugin;
import org.eclipse.core.resources.ICommand;

/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PluginTestCase extends PluginTestBase {
	public void testAddNature() throws Exception
	{
		GeneratePlugin.getDefault().addNature(project);
		assertTrue(project.hasNature(GeneratePlugin.NATURE_ID));
		ICommand [] commands=project.getDescription().getBuildSpec();
		boolean found=false;
		for (int i=0;!found && i < commands.length;i++)
		{
			found=GeneratePlugin.BUILDER_ID.equals(commands[i].getBuilderName());
		}
		assertTrue(found);
		
	}

}
