/*
 * Created on 12.09.2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.cdt.interfacegenerator.test;

import java.util.List;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Package;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class AbstractCppDataTypeTestCase extends InterfaceGeneratorTestBase {
	public void testNoNamespace() throws Exception
	{
		AbstractCppDataType dataType=interfaceFactory.createPrimitiveCppType();
		List namespace=dataType.getNamespace();
		assertNotNull(namespace);
		assertTrue(namespace.isEmpty());
		Package p=interfaceFactory.createPackage();
		p.getDataTypes().add(dataType);
		namespace=dataType.getNamespace();
		assertNotNull(namespace);
		assertTrue(namespace.isEmpty());
		
	}

}
