/*
 * Created on Sep 14, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.cdt.interfacegenerator.generate;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class InterfaceGeneratorNature implements IProjectNature {
	private IProject project=null;

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	public void configure() throws CoreException {
		IProjectDescription description = project.getDescription();
		ICommand [] commands=description.getBuildSpec();
		boolean found=false;
		for (int i=0;!found && i < commands.length;i++)
		{
			found=GeneratePlugin.BUILDER_ID.equals(commands[i].getBuilderName());
		}
		if (!found)
		{
			ICommand command=description.newCommand();
			command.setBuilderName(GeneratePlugin.BUILDER_ID);
			ICommand newCommands[]=new ICommand[commands.length+1];
			System.arraycopy(commands,0,newCommands,0,commands.length);
			newCommands[commands.length]=command;
			description.setBuildSpec(newCommands);
			getProject().setDescription(description,new NullProgressMonitor());
		}
		

	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	public IProject getProject() {
		return project;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	public void setProject(IProject project) {
		this.project=project;
	}

}
