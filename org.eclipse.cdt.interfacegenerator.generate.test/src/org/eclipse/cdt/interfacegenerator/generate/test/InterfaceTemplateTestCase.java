/*
 * Created on 11.09.2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.cdt.interfacegenerator.generate.test;

import org.eclipse.cdt.interfacegenerator.generate.template.InterfaceTemplate;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Package;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Parameter;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveCppType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveTypes;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ReturnType;


/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class InterfaceTemplateTestCase extends GeneratorTestBase {
	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSimpleInterface() throws Exception
	{
		InterfaceTemplate template=new InterfaceTemplate();
		Interface simpleIf=interfaceFactory.createInterface();
		final String interfaceName = "IFoo";
		simpleIf.setName(interfaceName);
		String generatedCode=template.generate(simpleIf);
		String expected = getSimpleClassCode(interfaceName,new String[]{"InterfaceBase"});
		assertEquals(expected,generatedCode);
	}

	public void testDerivedInterface() throws Exception
	{
		InterfaceTemplate template=new InterfaceTemplate();
		Interface simpleIf=interfaceFactory.createInterface();
		Interface base1=interfaceFactory.createInterface();
		base1.setName("IFooBase");
		Derivation derivation1=interfaceFactory.createDerivation();
		derivation1.setBaseType(base1);
		simpleIf.getDerivedFrom().add(derivation1);
		Interface base2=interfaceFactory.createInterface();
		base2.setName("IFooBase2");
		Derivation derivation2=interfaceFactory.createDerivation();
		derivation2.setBaseType(base2);
		simpleIf.getDerivedFrom().add(derivation2);
		final String interfaceName = "IFoo";
		simpleIf.setName(interfaceName);
		String generatedCode=template.generate(simpleIf);
		String expected = getSimpleClassCode(interfaceName,new String[]{"IFooBase","IFooBase2"});
		assertEquals(expected,generatedCode);
	}
	
	public void testVoidOperation() throws Exception
	{
		InterfaceTemplate template=new InterfaceTemplate();
		Interface simpleIf=interfaceFactory.createInterface();
		simpleIf.setName("IFoo");
		Operation op=interfaceFactory.createOperation();
		op.setName("foo");
		op.setConst(false);
		simpleIf.getOperations().add(op);
		OperationDesc []ops=new OperationDesc[1];
		ops[0]=new OperationDesc("foo");
		assertEquals(getClassCode("IFoo",new String[]{"InterfaceBase"},ops),template.generate(simpleIf));
		ops[0].setConst(true);
		op.setConst(true);
		assertEquals(getClassCode("IFoo",new String[]{"InterfaceBase"},ops),template.generate(simpleIf));
	}

	public void testOperationWithReturn() throws Exception
	{
		InterfaceTemplate template=new InterfaceTemplate();
		Interface simpleIf=interfaceFactory.createInterface();
		simpleIf.setName("IFoo");
		Operation op=interfaceFactory.createOperation();
		op.setName("foo");
		op.setConst(false);
		PrimitiveCppType intType=interfaceFactory.createPrimitiveCppType();
		intType.setType(PrimitiveTypes.INT_LITERAL);
		ReturnType returnType=interfaceFactory.createReturnType();
		returnType.setType(intType);
		op.setReturnType(returnType);
		simpleIf.getOperations().add(op);
		OperationDesc []ops=new OperationDesc[1];
		ops[0]=new OperationDesc("foo");
		ops[0].setReturnType("int");
		assertEquals(getClassCode("IFoo",new String[]{"InterfaceBase"},ops),template.generate(simpleIf));
		returnType.setConst(true);
		ops[0].setReturnType("const int");
		assertEquals(getClassCode("IFoo",new String[]{"InterfaceBase"},ops),template.generate(simpleIf));
		returnType.setReferenceType(ReferenceType.REFERENCE_LITERAL);
		ops[0].setReturnType("const int&");
		assertEquals(getClassCode("IFoo",new String[]{"InterfaceBase"},ops),template.generate(simpleIf));
	}

	public void testOperationWithParams() throws Exception
	{
		InterfaceTemplate template=new InterfaceTemplate();
		Interface simpleIf=interfaceFactory.createInterface();
		simpleIf.setName("IFoo");
		Operation op=interfaceFactory.createOperation();
		op.setName("foo");
		op.setConst(false);
		PrimitiveCppType intType=interfaceFactory.createPrimitiveCppType();
		intType.setType(PrimitiveTypes.INT_LITERAL);
		Parameter px=interfaceFactory.createParameter();
		px.setName("x");
		px.setType(intType);
		px.setConst(false);
		px.setReferenceType(ReferenceType.NONE_LITERAL);
		op.getParameters().add(px);
		Parameter py=interfaceFactory.createParameter();
		py.setName("y");
		py.setType(intType);
		py.setConst(false);
		py.setReferenceType(ReferenceType.NONE_LITERAL);
		op.getParameters().add(py);
		simpleIf.getOperations().add(op);
		OperationDesc []ops=new OperationDesc[1];
		ops[0]=new OperationDesc("foo");
		ops[0].addParameter(new OperationParameter("x","int"));
		ops[0].addParameter(new OperationParameter("y","int"));
		assertEquals(getClassCode("IFoo",new String[]{"InterfaceBase"},ops),template.generate(simpleIf));
	}
	
	public void testNamespace() throws Exception
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
		Interface simpleIf=interfaceFactory.createInterface();
		simpleIf.setName("IFoo");
		xyz.getDataTypes().add(simpleIf);
		InterfaceTemplate template=new InterfaceTemplate();
		String generatedCode=template.generate(simpleIf);
		String expected = "" +
		"namespace abc{\r\n"+
		"   namespace xyz{\r\n"+
		getSimpleClassCode("IFoo",new String[]{"InterfaceBase"}) + 
		"   } // xyz\r\n"+
		"} // abc\r\n";
		assertEquals(expected,generatedCode);
	}
	
}
