/*
 * Created on Sep 15, 2004
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
 * @author jpacher
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TestProjectTestCase extends TestCase {
	protected void setUp() throws Exception
	{
		IProject project=ResourcesPlugin.getWorkspace().getRoot().getProject("abc");
		if (project.exists())
		{
			project.delete(true,true,new NullProgressMonitor());
		}
	}

	protected void tearDown() throws Exception
	{
		IProject project=ResourcesPlugin.getWorkspace().getRoot().getProject("abc");
		if (project.exists())
		{
			project.delete(true,true,new NullProgressMonitor());
		}
	}
	
	public void testGetProject() throws Exception
	{
		TestProject p=new TestProject("abc");
		IProject project=p.getProject();
		assertNotNull(project);
		assertTrue(project.exists());
	}
	
	public void testDispose() throws Exception
	{
		TestProject p=new TestProject("abc");
		p.getProject();
		p.dispose();
		IProject project=ResourcesPlugin.getWorkspace().getRoot().getProject("abc");
		assertTrue(!project.exists());
	}

}
