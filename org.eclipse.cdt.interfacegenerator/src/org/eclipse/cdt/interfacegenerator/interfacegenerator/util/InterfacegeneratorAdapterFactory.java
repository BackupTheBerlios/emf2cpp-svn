/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage
 * @generated
 */
public class InterfacegeneratorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InterfacegeneratorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacegeneratorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InterfacegeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfacegeneratorSwitch modelSwitch =
		new InterfacegeneratorSwitch() {
			public Object caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object caseAbstractCppDataType(AbstractCppDataType object) {
				return createAbstractCppDataTypeAdapter();
			}
			public Object caseTemplateInterface(TemplateInterface object) {
				return createTemplateInterfaceAdapter();
			}
			public Object caseTemplateParameter(TemplateParameter object) {
				return createTemplateParameterAdapter();
			}
			public Object caseConstElement(ConstElement object) {
				return createConstElementAdapter();
			}
			public Object caseOperation(Operation object) {
				return createOperationAdapter();
			}
			public Object caseDerivation(Derivation object) {
				return createDerivationAdapter();
			}
			public Object caseTypeElement(TypeElement object) {
				return createTypeElementAdapter();
			}
			public Object caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			public Object casePrimitiveCppType(PrimitiveCppType object) {
				return createPrimitiveCppTypeAdapter();
			}
			public Object caseReturnType(ReturnType object) {
				return createReturnTypeAdapter();
			}
			public Object casePackage(org.eclipse.cdt.interfacegenerator.interfacegenerator.Package object) {
				return createPackageAdapter();
			}
			public Object caseComponent(Component object) {
				return createComponentAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType <em>Abstract Cpp Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType
	 * @generated
	 */
	public Adapter createAbstractCppDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateInterface <em>Template Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateInterface
	 * @generated
	 */
	public Adapter createTemplateInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameter
	 * @generated
	 */
	public Adapter createTemplateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ConstElement <em>Const Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.ConstElement
	 * @generated
	 */
	public Adapter createConstElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation
	 * @generated
	 */
	public Adapter createDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement <em>Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement
	 * @generated
	 */
	public Adapter createTypeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveCppType <em>Primitive Cpp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveCppType
	 * @generated
	 */
	public Adapter createPrimitiveCppTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.ReturnType
	 * @generated
	 */
	public Adapter createReturnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InterfacegeneratorAdapterFactory
