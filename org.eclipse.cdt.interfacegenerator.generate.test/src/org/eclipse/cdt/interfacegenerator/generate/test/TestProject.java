/*
 * Created on Sep 15, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.cdt.interfacegenerator.generate.test;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

/**
 * @author jpacher
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TestProject {
	private IProject project=null;
	private String name=null;
	/**
	 * 
	 */
	public TestProject(String name) {
		super();
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return Returns the project.
	 */
	public IProject getProject() throws CoreException {
		if (project==null)
		{
			project=ResourcesPlugin.getWorkspace().getRoot().getProject(name);
			if (!project.exists())
			{
				project.create(new NullProgressMonitor());
			}
		}
		return project;
	}
	
	public void dispose() throws CoreException
	{
		if (project != null && project.exists())
		{
			project.delete(true,true,new NullProgressMonitor());
			project=null;
		}
	}
}
