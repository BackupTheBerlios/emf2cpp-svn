/*
 * Created on 12.09.2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.cdt.interfacegenerator.generate.test;

import java.util.List;

import org.eclipse.cdt.interfacegenerator.generate.Helper;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Package;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Parameter;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveCppType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveTypes;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ReturnType;
import org.eclipse.cdt.interfacegenerator.test.InterfaceGeneratorTestBase;

/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class HelperTestCase extends InterfaceGeneratorTestBase {
	
	public void testDerivationString()
	{
		Interface simpleIf=interfaceFactory.createInterface();
		List baseClasses=Helper.getBaseClasses(simpleIf);
		assertEquals(1,baseClasses.size());
		assertEquals("InterfaceBase",(String) baseClasses.get(0));
		Interface base1=interfaceFactory.createInterface();
		base1.setName("IFooBase");
		Derivation derivation1=interfaceFactory.createDerivation();
		derivation1.setBaseType(base1);
		simpleIf.getDerivedFrom().add(derivation1);
		baseClasses=Helper.getBaseClasses(simpleIf);
		assertEquals(1,baseClasses.size());
		assertEquals("IFooBase",(String) baseClasses.get(0));
		Interface base2=interfaceFactory.createInterface();
		base2.setName("IFooBase2");
		Derivation derivation2=interfaceFactory.createDerivation();
		derivation2.setBaseType(base2);
		simpleIf.getDerivedFrom().add(derivation2);
		baseClasses=Helper.getBaseClasses(simpleIf);
		assertEquals(2,baseClasses.size());
		assertEquals("IFooBase",(String) baseClasses.get(0));
		assertEquals("IFooBase2",(String) baseClasses.get(1));
		
	}
	
	public void testGetTypeString()
	{
		Package root=interfaceFactory.createPackage();
		root.setName("abc");
		root.setIsNamespace(true);
		Package abc=interfaceFactory.createPackage();
		abc.setName("def");
		abc.setIsNamespace(false);
		root.getPackages().add(abc);
		PrimitiveCppType type=interfaceFactory.createPrimitiveCppType();
		type.setType(PrimitiveTypes.INT_LITERAL);
		abc.getDataTypes().add(type);
		ReturnType returnType=interfaceFactory.createReturnType();
		returnType.setType(type);
		returnType.setConst(false);
		returnType.setReferenceType(ReferenceType.NONE_LITERAL);
		assertEquals("abc::int",Helper.getTypeString(returnType));
		returnType.setReferenceType(ReferenceType.REFERENCE_LITERAL);
		assertEquals("abc::int&",Helper.getTypeString(returnType));
		returnType.setReferenceType(ReferenceType.POINTER_LITERAL);
		assertEquals("abc::int*",Helper.getTypeString(returnType));
		returnType.setConst(true);
		assertEquals("const abc::int*",Helper.getTypeString(returnType));
	}
	
	public void testGetParameterString()
	{
		PrimitiveCppType type=interfaceFactory.createPrimitiveCppType();
		type.setType(PrimitiveTypes.INT_LITERAL);
		Parameter param=interfaceFactory.createParameter();
		param.setName("x");
		param.setType(type);
		param.setConst(false);
		param.setReferenceType(ReferenceType.NONE_LITERAL);
		assertEquals("int x",Helper.getParameterString(param));
	}

	public void testNameSpace()
	{
		Package root=interfaceFactory.createPackage();
		root.setName("abc");
		root.setIsNamespace(true);
		Package abc=interfaceFactory.createPackage();
		abc.setName("def");
		abc.setIsNamespace(false);
		root.getPackages().add(abc);
		Package xyz=interfaceFactory.createPackage();
		xyz.setName("xyz");
		xyz.setIsNamespace(true);
		abc.getPackages().add(xyz);
		PrimitiveCppType type=interfaceFactory.createPrimitiveCppType();
		type.setType(PrimitiveTypes.INT_LITERAL);
		xyz.getDataTypes().add(type);
		List ns=Helper.getNamespace(type);
		assertEquals(2,ns.size());
		assertEquals("abc",ns.get(0));
		assertEquals("xyz",ns.get(1));
	}
	
}
