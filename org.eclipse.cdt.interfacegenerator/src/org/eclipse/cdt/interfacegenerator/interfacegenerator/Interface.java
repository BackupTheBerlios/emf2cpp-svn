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
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getAssignedComponents <em>Assigned Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getInterface()
 * @model 
 * @generated
 */
public interface Interface extends AbstractCppDataType{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getInterface_Name()
	 * @model 
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getInterface_Operations()
	 * @model type="org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation" containment="true"
	 * @generated
	 */
	EList getOperations();

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getInterface_DerivedFrom()
	 * @model type="org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation" containment="true"
	 * @generated
	 */
	EList getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Assigned Components</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#getAssignedInterfaces <em>Assigned Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Components</em>' reference list.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getInterface_AssignedComponents()
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#getAssignedInterfaces
	 * @model type="org.eclipse.cdt.interfacegenerator.interfacegenerator.Component" opposite="assignedInterfaces"
	 * @generated
	 */
	EList getAssignedComponents();

} // Interface
