/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorFactory
 * @generated
 */
public interface InterfacegeneratorPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interfacegenerator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/cdt/interfacegenerator/interfacegenerator.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.cdt.interfacegenerator.interfacegenerator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfacegeneratorPackage eINSTANCE = org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.NamedElementImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.AbstractCppDataTypeImpl <em>Abstract Cpp Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.AbstractCppDataTypeImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getAbstractCppDataType()
	 * @generated
	 */
	int ABSTRACT_CPP_DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CPP_DATA_TYPE__PACKAGE = 0;

	/**
	 * The number of structural features of the the '<em>Abstract Cpp Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CPP_DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfaceImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PACKAGE = ABSTRACT_CPP_DATA_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = ABSTRACT_CPP_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERATIONS = ABSTRACT_CPP_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DERIVED_FROM = ABSTRACT_CPP_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assigned Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ASSIGNED_COMPONENTS = ABSTRACT_CPP_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = ABSTRACT_CPP_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.TemplateInterfaceImpl <em>Template Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.TemplateInterfaceImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getTemplateInterface()
	 * @generated
	 */
	int TEMPLATE_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INTERFACE__PACKAGE = INTERFACE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INTERFACE__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INTERFACE__OPERATIONS = INTERFACE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INTERFACE__DERIVED_FROM = INTERFACE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Assigned Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INTERFACE__ASSIGNED_COMPONENTS = INTERFACE__ASSIGNED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INTERFACE__PARAMETERS = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Template Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.TemplateParameterImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getTemplateParameter()
	 * @generated
	 */
	int TEMPLATE_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__PACKAGE = ABSTRACT_CPP_DATA_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__NAME = ABSTRACT_CPP_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__TYPE = ABSTRACT_CPP_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Template Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_FEATURE_COUNT = ABSTRACT_CPP_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.ConstElementImpl <em>Const Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.ConstElementImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getConstElement()
	 * @generated
	 */
	int CONST_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_ELEMENT__CONST = 0;

	/**
	 * The number of structural features of the the '<em>Const Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.OperationImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONST = CONST_ELEMENT__CONST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = CONST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = CONST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = CONST_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = CONST_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.DerivationImpl <em>Derivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.DerivationImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getDerivation()
	 * @generated
	 */
	int DERIVATION = 7;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__BASE_TYPE = 0;

	/**
	 * The number of structural features of the the '<em>Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.TypeElementImpl <em>Type Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.TypeElementImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getTypeElement()
	 * @generated
	 */
	int TYPE_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ELEMENT__CONST = CONST_ELEMENT__CONST;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ELEMENT__REFERENCE_TYPE = CONST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ELEMENT__TYPE = CONST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ELEMENT_FEATURE_COUNT = CONST_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.ParameterImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONST = TYPE_ELEMENT__CONST;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REFERENCE_TYPE = TYPE_ELEMENT__REFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = TYPE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.PrimitiveCppTypeImpl <em>Primitive Cpp Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.PrimitiveCppTypeImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getPrimitiveCppType()
	 * @generated
	 */
	int PRIMITIVE_CPP_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CPP_TYPE__PACKAGE = ABSTRACT_CPP_DATA_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CPP_TYPE__TYPE = ABSTRACT_CPP_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Primitive Cpp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CPP_TYPE_FEATURE_COUNT = ABSTRACT_CPP_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.ReturnTypeImpl <em>Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.ReturnTypeImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__CONST = TYPE_ELEMENT__CONST;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__REFERENCE_TYPE = TYPE_ELEMENT__REFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__TYPE = TYPE_ELEMENT__TYPE;

	/**
	 * The number of structural features of the the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.PackageImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_NAMESPACE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DATA_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMPONENTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.ComponentImpl
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is On Search Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_ON_SEARCH_PATH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXTENSION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Create Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_CREATE_CODE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assigned Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ASSIGNED_INTERFACES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameterType <em>Template Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameterType
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getTemplateParameterType()
	 * @generated
	 */
	int TEMPLATE_PARAMETER_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType <em>Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveTypes <em>Primitive Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveTypes
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getPrimitiveTypes()
	 * @generated
	 */
	int PRIMITIVE_TYPES = 16;


	/**
	 * The meta object id for the '<em>Java List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfacegeneratorPackageImpl#getJavaList()
	 * @generated
	 */
	int JAVA_LIST = 17;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getOperations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derived From</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getDerivedFrom()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_DerivedFrom();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getAssignedComponents <em>Assigned Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Components</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getAssignedComponents()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_AssignedComponents();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType <em>Abstract Cpp Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Cpp Data Type</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType
	 * @generated
	 */
	EClass getAbstractCppDataType();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType#getPackage()
	 * @see #getAbstractCppDataType()
	 * @generated
	 */
	EReference getAbstractCppDataType_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateInterface <em>Template Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Interface</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateInterface
	 * @generated
	 */
	EClass getTemplateInterface();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateInterface#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateInterface#getParameters()
	 * @see #getTemplateInterface()
	 * @generated
	 */
	EReference getTemplateInterface_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Parameter</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameter
	 * @generated
	 */
	EClass getTemplateParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameter#getType()
	 * @see #getTemplateParameter()
	 * @generated
	 */
	EAttribute getTemplateParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ConstElement <em>Const Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Element</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.ConstElement
	 * @generated
	 */
	EClass getConstElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ConstElement#isConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Const</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.ConstElement#isConst()
	 * @see #getConstElement()
	 * @generated
	 */
	EAttribute getConstElement_Const();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivation</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation
	 * @generated
	 */
	EClass getDerivation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Type</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation#getBaseType()
	 * @see #getDerivation()
	 * @generated
	 */
	EReference getDerivation_BaseType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement <em>Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Element</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement
	 * @generated
	 */
	EClass getTypeElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement#getReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Type</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement#getReferenceType()
	 * @see #getTypeElement()
	 * @generated
	 */
	EAttribute getTypeElement_ReferenceType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement#getType()
	 * @see #getTypeElement()
	 * @generated
	 */
	EReference getTypeElement_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveCppType <em>Primitive Cpp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Cpp Type</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveCppType
	 * @generated
	 */
	EClass getPrimitiveCppType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveCppType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveCppType#getType()
	 * @see #getPrimitiveCppType()
	 * @generated
	 */
	EAttribute getPrimitiveCppType_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.ReturnType
	 * @generated
	 */
	EClass getReturnType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#isIsNamespace <em>Is Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Namespace</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#isIsNamespace()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_IsNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getDataTypes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_DataTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Packages</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Packages();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getParent()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getComponents()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Components();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#isIsOnSearchPath <em>Is On Search Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is On Search Path</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#isIsOnSearchPath()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_IsOnSearchPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#getExtension()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#isIsCreateCode <em>Is Create Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Create Code</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#isIsCreateCode()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_IsCreateCode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#getAssignedInterfaces <em>Assigned Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Interfaces</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#getAssignedInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AssignedInterfaces();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameterType <em>Template Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Template Parameter Type</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameterType
	 * @generated
	 */
	EEnum getTemplateParameterType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Type</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType
	 * @generated
	 */
	EEnum getReferenceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveTypes <em>Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Types</em>'.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveTypes
	 * @generated
	 */
	EEnum getPrimitiveTypes();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Java List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 * @generated
	 */
	EDataType getJavaList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterfacegeneratorFactory getInterfacegeneratorFactory();

} //InterfacegeneratorPackage
