/*
 * Created on 12.09.2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.cdt.interfacegenerator.generate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Package;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Parameter;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement;
import org.eclipse.emf.common.util.EList;

/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Helper {
	static public List getBaseClasses(Interface theInterface)
	{
		List result=new ArrayList();
		EList derivations=theInterface.getDerivedFrom();
		if (derivations != null)
		{
			for (Iterator iter=derivations.iterator();iter.hasNext();)
			{
				Derivation derivation=(Derivation) iter.next();
				AbstractCppDataType baseType=derivation != null ? derivation.getBaseType() : null;
				if (baseType != null)
				{
					result.add(baseType.getTypeName());
				}
				
			}
		}
		if (result.isEmpty())
		{
			result.add("InterfaceBase");
		}
		return result;
	}
	
	public static String getTypeString(TypeElement returnType)
	{
		StringBuffer s=new StringBuffer();
		if (returnType.isConst())
		{
			s.append("const ");
		}
		AbstractCppDataType type=returnType.getType();
		Package parent=type.getPackage();
		while (parent != null)
		{
			if (parent.isIsNamespace())
			{
				s.append(parent.getName() + "::");
			}
			parent=parent.getParent();
		}
		s.append(returnType.getType().getTypeName());
		switch (returnType.getReferenceType().getValue())
		{
			case ReferenceType.POINTER:
				s.append("*");
				break;
			case ReferenceType.REFERENCE:
				s.append("&");
				break;
		}
		return s.toString();
	}
	
	public static String getParameterString(Parameter param)
	{
		return getTypeString(param) +  " " + param.getName();
	}
	
	public static List getNamespace(AbstractCppDataType dataType)
	{
		List result=new ArrayList();
		Package parent=dataType.getPackage();
		while (parent != null)
		{
			if (parent.isIsNamespace())
			{
				result.add(0,parent.getName());
			}
			parent=parent.getParent();
		}
		return result;
	}
}
