/*
 * Created on Sep 14, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.cdt.interfacegenerator.generate.action;

import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

/**
 * @author jpacher
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ComponentGeneratorImpl implements IComponentGenerator {
	private IProject project=null;

	/**
	 * 
	 */
	public ComponentGeneratorImpl(IProject p) {
		super();
		project=p;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.cdt.interfacegenerator.generate.action.IComponentGenerator#generateComponent(java.lang.String, java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void generateComponent(IPath fileName, InputStream code,
			IProgressMonitor monitor) throws CoreException{
		monitor.beginTask("Creating file " + fileName,2);
		// create the directories (if required)
		if (fileName.segmentCount() > 1)
		{
			// fileName contains directories
			// create the hierarchy if necessary
			IPath targetFolder=fileName.removeLastSegments(1);
			IFolder currentFolder=null;
			for (int i=0; i < targetFolder.segmentCount();i++)
			{
				String segment=targetFolder.segment(i);
				if (currentFolder == null)
				{
					currentFolder=project.getFolder(segment);
				}
				else
				{
					currentFolder=currentFolder.getFolder(segment);
				}
				if (!currentFolder.exists())
				{
					currentFolder.create(true,true,new SubProgressMonitor(monitor,1));
				}
			}
		}
		monitor.worked(1);
		// open/create the file
		IFile file=project.getFile(fileName);
		if (!file.exists())
		{
			monitor.subTask("Creating file");
			file.create(code,true,new SubProgressMonitor(monitor,1));
		}
		else
		{
			monitor.subTask("Updating file");
			file.setContents(code,true,false,new SubProgressMonitor(monitor,1));
		}
		monitor.worked(1);
	}

}
