/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator.util;

import java.util.List;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Component;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ConstElement;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.NamedElement;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Parameter;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveCppType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ReturnType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateInterface;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameter;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage
 * @generated
 */
public class InterfacegeneratorSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InterfacegeneratorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacegeneratorSwitch() {
		if (modelPackage == null) {
			modelPackage = InterfacegeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InterfacegeneratorPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				Object result = caseInterface(interface_);
				if (result == null) result = caseAbstractCppDataType(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacegeneratorPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				Object result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE: {
				TemplateInterface templateInterface = (TemplateInterface)theEObject;
				Object result = caseTemplateInterface(templateInterface);
				if (result == null) result = caseInterface(templateInterface);
				if (result == null) result = caseAbstractCppDataType(templateInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacegeneratorPackage.TEMPLATE_PARAMETER: {
				TemplateParameter templateParameter = (TemplateParameter)theEObject;
				Object result = caseTemplateParameter(templateParameter);
				if (result == null) result = caseAbstractCppDataType(templateParameter);
				if (result == null) result = caseNamedElement(templateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacegeneratorPackage.CONST_ELEMENT: {
				ConstElement constElement = (ConstElement)theEObject;
				Object result = caseConstElement(constElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacegeneratorPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				Object result = caseOperation(operation);
				if (result == null) result = caseConstElement(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacegeneratorPackage.DERIVATION: {
				Derivation derivation = (Derivation)theEObject;
				Object result = caseDerivation(derivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacegeneratorPackage.TYPE_ELEMENT: {
				TypeElement typeElement = (TypeElement)theEObject;
				Object result = caseTypeElement(typeElement);
				if (result == null) result = caseConstElement(typeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacegeneratorPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				Object result = caseParameter(parameter);
				if (result == null) result = caseTypeElement(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseConstElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacegeneratorPackage.PRIMITIVE_CPP_TYPE: {
				PrimitiveCppType primitiveCppType = (PrimitiveCppType)theEObject;
				Object result = casePrimitiveCppType(primitiveCppType);
				if (result == null) result = caseAbstractCppDataType(primitiveCppType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacegeneratorPackage.RETURN_TYPE: {
				ReturnType returnType = (ReturnType)theEObject;
				Object result = caseReturnType(returnType);
				if (result == null) result = caseTypeElement(returnType);
				if (result == null) result = caseConstElement(returnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacegeneratorPackage.PACKAGE: {
				org.eclipse.cdt.interfacegenerator.interfacegenerator.Package package_ = (org.eclipse.cdt.interfacegenerator.interfacegenerator.Package)theEObject;
				Object result = casePackage(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacegeneratorPackage.COMPONENT: {
				Component component = (Component)theEObject;
				Object result = caseComponent(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Cpp Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Cpp Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractCppDataType(AbstractCppDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Template Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Template Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplateInterface(TemplateInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplateParameter(TemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Const Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Const Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstElement(ConstElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDerivation(Derivation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Type Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeElement(TypeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Primitive Cpp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Primitive Cpp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrimitiveCppType(PrimitiveCppType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Return Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReturnType(ReturnType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackage(org.eclipse.cdt.interfacegenerator.interfacegenerator.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //InterfacegeneratorSwitch
