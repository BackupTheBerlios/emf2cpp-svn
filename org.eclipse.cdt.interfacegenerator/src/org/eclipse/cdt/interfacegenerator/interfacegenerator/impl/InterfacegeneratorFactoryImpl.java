/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator.impl;

import java.util.List;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.Component;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ConstElement;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorFactory;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.NamedElement;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Parameter;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveCppType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveTypes;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ReturnType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateInterface;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameter;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameterType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfacegeneratorFactoryImpl extends EFactoryImpl implements InterfacegeneratorFactory {
	/**
	 * Creates and instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacegeneratorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InterfacegeneratorPackage.INTERFACE: return createInterface();
			case InterfacegeneratorPackage.NAMED_ELEMENT: return createNamedElement();
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE: return createTemplateInterface();
			case InterfacegeneratorPackage.TEMPLATE_PARAMETER: return createTemplateParameter();
			case InterfacegeneratorPackage.CONST_ELEMENT: return createConstElement();
			case InterfacegeneratorPackage.OPERATION: return createOperation();
			case InterfacegeneratorPackage.DERIVATION: return createDerivation();
			case InterfacegeneratorPackage.TYPE_ELEMENT: return createTypeElement();
			case InterfacegeneratorPackage.PARAMETER: return createParameter();
			case InterfacegeneratorPackage.PRIMITIVE_CPP_TYPE: return createPrimitiveCppType();
			case InterfacegeneratorPackage.RETURN_TYPE: return createReturnType();
			case InterfacegeneratorPackage.PACKAGE: return createPackage();
			case InterfacegeneratorPackage.COMPONENT: return createComponent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InterfacegeneratorPackage.TEMPLATE_PARAMETER_TYPE: {
				TemplateParameterType result = TemplateParameterType.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case InterfacegeneratorPackage.REFERENCE_TYPE: {
				ReferenceType result = ReferenceType.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case InterfacegeneratorPackage.PRIMITIVE_TYPES: {
				PrimitiveTypes result = PrimitiveTypes.get(initialValue);
				if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
				return result;
			}
			case InterfacegeneratorPackage.JAVA_LIST:
				return createJavaListFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InterfacegeneratorPackage.TEMPLATE_PARAMETER_TYPE:
				return instanceValue == null ? null : instanceValue.toString();
			case InterfacegeneratorPackage.REFERENCE_TYPE:
				return instanceValue == null ? null : instanceValue.toString();
			case InterfacegeneratorPackage.PRIMITIVE_TYPES:
				return instanceValue == null ? null : instanceValue.toString();
			case InterfacegeneratorPackage.JAVA_LIST:
				return convertJavaListToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateInterface createTemplateInterface() {
		TemplateInterfaceImpl templateInterface = new TemplateInterfaceImpl();
		return templateInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createTemplateParameter() {
		TemplateParameterImpl templateParameter = new TemplateParameterImpl();
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstElement createConstElement() {
		ConstElementImpl constElement = new ConstElementImpl();
		return constElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Derivation createDerivation() {
		DerivationImpl derivation = new DerivationImpl();
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElement createTypeElement() {
		TypeElementImpl typeElement = new TypeElementImpl();
		return typeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveCppType createPrimitiveCppType() {
		PrimitiveCppTypeImpl primitiveCppType = new PrimitiveCppTypeImpl();
		return primitiveCppType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnType createReturnType() {
		ReturnTypeImpl returnType = new ReturnTypeImpl();
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.cdt.interfacegenerator.interfacegenerator.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createJavaListFromString(EDataType eDataType, String initialValue) {
		return (List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacegeneratorPackage getInterfacegeneratorPackage() {
		return (InterfacegeneratorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static InterfacegeneratorPackage getPackage() {
		return InterfacegeneratorPackage.eINSTANCE;
	}

} //InterfacegeneratorFactoryImpl
