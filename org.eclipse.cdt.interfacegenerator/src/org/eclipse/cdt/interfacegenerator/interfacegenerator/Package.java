/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#isIsNamespace <em>Is Namespace</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getPackage()
 * @model 
 * @generated
 */
public interface Package extends NamedElement{
	/**
	 * Returns the value of the '<em><b>Is Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Namespace</em>' attribute.
	 * @see #setIsNamespace(boolean)
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getPackage_IsNamespace()
	 * @model 
	 * @generated
	 */
	boolean isIsNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#isIsNamespace <em>Is Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Namespace</em>' attribute.
	 * @see #isIsNamespace()
	 * @generated
	 */
	void setIsNamespace(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getPackage_DataTypes()
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType#getPackage
	 * @model type="org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType" opposite="package" containment="true"
	 * @generated
	 */
	EList getDataTypes();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' reference list.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getPackage_Packages()
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getParent
	 * @model type="org.eclipse.cdt.interfacegenerator.interfacegenerator.Package" opposite="parent"
	 * @generated
	 */
	EList getPackages();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Package)
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getPackage_Parent()
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getPackages
	 * @model opposite="packages"
	 * @generated
	 */
	Package getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Package value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getPackage_Components()
	 * @model type="org.eclipse.cdt.interfacegenerator.interfacegenerator.Component" containment="true"
	 * @generated
	 */
	EList getComponents();

} // Package
