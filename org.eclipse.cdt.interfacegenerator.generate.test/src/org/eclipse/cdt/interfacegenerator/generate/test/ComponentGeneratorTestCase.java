/*
 * Created on Sep 14, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.cdt.interfacegenerator.generate.test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.cdt.interfacegenerator.generate.action.ComponentGeneratorImpl;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

/**
 * @author jpacher
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ComponentGeneratorTestCase extends PluginTestBase {
	public void testCtor()
	{
		ComponentGeneratorImpl gen=new ComponentGeneratorImpl(project);
	}
	
	public void testCreateSimpleFile() throws Exception
	{
		ComponentGeneratorImpl gen=new ComponentGeneratorImpl(project);
		MockIProgressMonitor monitor=new MockIProgressMonitor();
		monitor.addExpectedBeginTaskValues("Creating file test.h",2);
		monitor.addExpectedWorkedValues(1);
		monitor.addExpectedWorkedValues(1);
		monitor.addExpectedSubTaskValues("Creating file");
		monitor.addExpectedSubTaskValues("");
		gen.generateComponent(new Path("test.h"),new ByteArrayInputStream("test".getBytes()),monitor);
		monitor.verify();
		// The file should exist now
		IFile file=project.getFile("test.h");
		assertNotNull(file);
		assertTrue(file.exists());
		InputStream is=file.getContents();
		StringBuffer got=new StringBuffer();
		while (is.available() > 0)
		{
			got.append((char) is.read());
		}
		is.close();
		assertEquals("test",got.toString());
	}

	public void testCreateFileInExistingDirectory() throws Exception
	{
		IFolder xyz=project.getFolder("xyz");
		if (!xyz.exists())
		{
			xyz.create(true,true,new NullProgressMonitor());
		}
		ComponentGeneratorImpl gen=new ComponentGeneratorImpl(project);
		MockIProgressMonitor monitor=new MockIProgressMonitor();
		monitor.addExpectedBeginTaskValues("Creating file xyz/test.h",2);
		monitor.addExpectedWorkedValues(1);
		monitor.addExpectedWorkedValues(1);
		monitor.addExpectedSubTaskValues("Creating file");
		monitor.addExpectedSubTaskValues("");
		gen.generateComponent(new Path("xyz/test.h"),new ByteArrayInputStream("test".getBytes()),monitor);
		monitor.verify();
		// The file should exist now
		IFile file=project.getFile("xyz/test.h");
		assertNotNull(file);
		assertTrue(file.exists());
		InputStream is=file.getContents();
		StringBuffer got=new StringBuffer();
		while (is.available() > 0)
		{
			got.append((char) is.read());
		}
		is.close();
		assertEquals("test",got.toString());
	}

	public void testCreateMissingDirectories() throws Exception
	{
		IFolder xyz=project.getFolder("xyz");
		if (xyz.exists())
		{
			xyz.delete(true,false,new NullProgressMonitor());
		}
		ComponentGeneratorImpl gen=new ComponentGeneratorImpl(project);
		MockIProgressMonitor monitor=new MockIProgressMonitor();
		monitor.addExpectedBeginTaskValues("Creating file xyz/def/test.h",2);
		monitor.addExpectedWorkedValues(1);
		monitor.addExpectedWorkedValues(1);
		gen.generateComponent(new Path("xyz/def/test.h"),new ByteArrayInputStream("test".getBytes()),monitor);
		monitor.verify();
		// The file should exist now
		IFile file=project.getFile("xyz/def/test.h");
		assertNotNull(file);
		assertTrue(file.exists());
		InputStream is=file.getContents();
		StringBuffer got=new StringBuffer();
		while (is.available() > 0)
		{
			got.append((char) is.read());
		}
		is.close();
		assertEquals("test",got.toString());
	}

	public void testOverrideFile() throws Exception
	{
		IFile f=project.getFile("test.h");
		NullProgressMonitor nullProgressMonitor = new NullProgressMonitor();
		if (f.exists())
		{
			f.delete(true,false,nullProgressMonitor);
		}
		f.create(new ByteArrayInputStream("xyz".getBytes()),true,nullProgressMonitor);
		ComponentGeneratorImpl gen=new ComponentGeneratorImpl(project);
		MockIProgressMonitor monitor=new MockIProgressMonitor();
		monitor.addExpectedBeginTaskValues("Creating file test.h",2);
		monitor.addExpectedWorkedValues(1);
		monitor.addExpectedWorkedValues(1);
		monitor.addExpectedSubTaskValues("Updating file");
		monitor.addExpectedSubTaskValues("");
		gen.generateComponent(new Path("test.h"),new ByteArrayInputStream("test".getBytes()),monitor);
		monitor.verify();
		// The file should exist now
		IFile file=project.getFile("test.h");
		assertNotNull(file);
		assertTrue(file.exists());
		InputStream is=file.getContents();
		StringBuffer got=new StringBuffer();
		while (is.available() > 0)
		{
			got.append((char) is.read());
		}
		is.close();
		assertEquals("test",got.toString());
	}
	
}
