/*
 * Created on Sep 14, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.cdt.interfacegenerator.generate.test;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PluginTestBase extends TestCase {

	protected IProject project = null;

	protected void setUp() throws Exception {
		project=ResourcesPlugin.getWorkspace().getRoot().getProject("abc");
		NullProgressMonitor monitor = new NullProgressMonitor();
		if (!project.exists())
		{
			project.create(monitor);
		}
		project.open(monitor);
	}

	protected void tearDown() throws Exception {
		project.delete(true,new NullProgressMonitor());
	}

}
