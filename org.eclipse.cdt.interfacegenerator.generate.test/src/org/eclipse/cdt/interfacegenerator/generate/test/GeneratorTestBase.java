/*
 * Created on Sep 14, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.cdt.interfacegenerator.generate.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.cdt.interfacegenerator.test.InterfaceGeneratorTestBase;

/**
 * @author jpacher
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GeneratorTestBase extends InterfaceGeneratorTestBase {

	protected static class OperationParameter
	{
		private String name=null;
		private String type=null;
		public OperationParameter(String name,String type)
		{
			this.name=name;
			this.type=type;
		}
		/**
		 * @return Returns the name.
		 */
		public String getName() {
			return name;
		}
		/**
		 * @return Returns the type.
		 */
		public String getType() {
			return type;
		}
		public String toString()
		{
			return type + " " + name;
		}
	}

	protected static class OperationDesc
	{
		private String name=null;
		private String returnType="void";
		private List parameters=new ArrayList();
		private boolean isConst=false;
		public OperationDesc(String name)
		{
			this.name=name;
		}
		/**
		 * @return Returns the isConst.
		 */
		public boolean isConst() {
			return isConst;
		}
		/**
		 * @param isConst The isConst to set.
		 */
		public void setConst(boolean isConst) {
			this.isConst = isConst;
		}
		/**
		 * @return Returns the returnType.
		 */
		public String getReturnType() {
			return returnType;
		}
		/**
		 * @param returnType The returnType to set.
		 */
		public void setReturnType(String returnType) {
			this.returnType = returnType;
		}
		/**
		 * @return Returns the name.
		 */
		public String getName() {
			return name;
		}
		/**
		 * @return Returns the parameters.
		 */
		public List getParameters() {
			return parameters;
		}
		
		public void addParameter(OperationParameter parm)
		{
			parameters.add(parm);
		}
	}

	/**
	 * @return
	 */
	protected String getSimpleClassCode(String className, String baseClasses[]) {
		return getClassCode(className, baseClasses,new OperationDesc[]{});
	}

	/**
	 * @param className
	 * @param baseClasses
	 * @return
	 */
	protected String getClassCode(String className, String[] baseClasses, OperationDesc operations[]) {
		StringBuffer expected=new StringBuffer();
		expected.append(getClassHeader(className, baseClasses,operations));
		expected.append(getFunctionTableType(className,operations));
		expected.append(getClassFunctions(className,operations));
		expected.append(getClassFooter(className));
		return expected.toString();
	}

	/**
	 * @param className
	 * @param expected
	 */
	private String getClassFooter(String className) {
		StringBuffer result=new StringBuffer();
		result.append("   private:\r\n");
		result.append("      " + className + "_functionTableType const& myT;\r\n");
		result.append("};\r\n");
		return result.toString();
	}

	/**
	 * @param className
	 * @param expected
	 */
	private String getClassFunctions(String className, OperationDesc operations[]) {
		StringBuffer result=new StringBuffer();
		result.append("      template <class T> struct " + className + "_functions\r\n");
		result.append("      {\r\n");
		final String classPrefix = className + "::" + className;
		result.append("         static struct " + classPrefix + "_functionTableType &table()\r\n");
		result.append("         {\r\n");
		result.append("            static struct " + classPrefix + "_functionTableType table=\r\n");
		result.append("            {\r\n");
		for (int i=0; i < operations.length;i++)
		{
			OperationDesc op=operations[i];
			result.append("               &" + classPrefix + "_functions<T>::" + op.getName());
			if (i < operations.length-1)
			{
				result.append(",");
			}
			result.append("\r\n");
		}
		result.append("            };\r\n");
		result.append("            return table;\r\n");
		result.append("         }\r\n");
		result.append("      };\r\n");
		return result.toString();
	}

	/**
	 * @param className
	 * @param expected
	 */
	private String getFunctionTableType(String className, OperationDesc operations[]) {
		StringBuffer result=new StringBuffer();
		result.append("\r\n      struct " + className + "_functionTableType\r\n");
		result.append("      {\r\n"); 
		for (int i=0; i < operations.length;i++)
		{
			OperationDesc op=operations[i];
			String returnType = op.getReturnType();
			result.append("         " + returnType + " (*" + op.getName() + ") (void *");
			for (Iterator iter=op.getParameters().iterator();iter.hasNext();)
			{
				result.append(", ");
				result.append(iter.next());
			}
			result.append(");\r\n");
		}
		result.append("      };\r\n");
		return result.toString();
	}

	/**
	 * @param className
	 * @param baseClasses
	 * @param expected
	 */
	private String getClassHeader(String className, String[] baseClasses, OperationDesc operations[]) {
		StringBuffer result=new StringBuffer();
		result.append("\r\nclass " + className + " : ");
		for (int i=0; i < baseClasses.length;i++)
		{
			result.append("public "+ baseClasses[i]);
			if (i < baseClasses.length-1)
			{
				result.append(", ");
			}
		}
		result.append("{\r\n");
		result.append("   public:\r\n");
		result.append("      template <class T> struct " + className + "_functions;\r\n");
		result.append("      template <class T> " + className + "(T& x): ");
		for (int i=0; i < baseClasses.length;i++)
		{
			result.append(baseClasses[i]);
			result.append("(x)");
			if (i < baseClasses.length-1)
			{
				result.append(", ");
			}
		}
		
		result.append(",\r\n         myT(" + className + "_functions<T>::table()){};\r\n");
		for (int i=0; i < operations.length;i++)
		{
			OperationDesc op=operations[i];
			String returnType = op.getReturnType();
			result.append("      " + returnType + " " + op.getName() + "(");
			for (Iterator iter=op.getParameters().iterator();iter.hasNext();)
			{
				result.append(iter.next());
				if (iter.hasNext())
				{
					result.append(", ");
				}
			}
			result.append(")");
			if (op.isConst())
			{
				result.append(" const");
			}
			result.append("\r\n      {\r\n");
			result.append("         " + (!"void".equals(returnType) ? "return " : "") + "myT." + op.getName() + "(const_cast<void*>(myA)");
			for (Iterator iter=op.getParameters().iterator();iter.hasNext();)
			{
				OperationParameter param=(OperationParameter) iter.next();
				result.append(", ");
				result.append(param.getName());
			}
			result.append(");\r\n");
			result.append("      };\r\n");
		}
		return result.toString();
	}

}
