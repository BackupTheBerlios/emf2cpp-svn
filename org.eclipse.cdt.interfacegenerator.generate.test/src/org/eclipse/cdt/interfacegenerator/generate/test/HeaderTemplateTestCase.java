/*
 * Created on 13.09.2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.cdt.interfacegenerator.generate.test;

import org.eclipse.cdt.interfacegenerator.generate.template.HeaderFileTemplate;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Component;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface;

/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class HeaderTemplateTestCase extends GeneratorTestBase {

	public void testEmptyFile()
	{
		Component c=interfaceFactory.createComponent();
		c.setName("IFoo");
		HeaderFileTemplate template=new HeaderFileTemplate();
		String expected=""+
		"#ifndef IFOO_H\r\n"+
		"#define IFOO_H 1\r\n\r\n"+
		"#endif // IFOO_H\r\n";
		assertEquals(expected,template.generate(c));
	}
	
	public void testSimpleClass()
	{
		Component c=interfaceFactory.createComponent();
		c.setName("IFoo");
		Interface simpleIf=interfaceFactory.createInterface();
		final String interfaceName = "IFoo";
		simpleIf.setName(interfaceName);
		c.getAssignedInterfaces().add(simpleIf);
		HeaderFileTemplate template=new HeaderFileTemplate();
		String expected=""+
		"#ifndef IFOO_H\r\n"+
		"#define IFOO_H 1\r\n\r\n"+
		getSimpleClassCode(interfaceName,new String[]{"InterfaceBase"}) +
		"\r\n#endif // IFOO_H\r\n";
		assertEquals(expected,template.generate(c));
	}
}
