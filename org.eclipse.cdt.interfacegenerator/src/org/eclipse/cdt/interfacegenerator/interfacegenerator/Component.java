/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#isIsOnSearchPath <em>Is On Search Path</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#isIsCreateCode <em>Is Create Code</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#getAssignedInterfaces <em>Assigned Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getComponent()
 * @model 
 * @generated
 */
public interface Component extends NamedElement{
	/**
	 * Returns the value of the '<em><b>Is On Search Path</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is On Search Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is On Search Path</em>' attribute.
	 * @see #setIsOnSearchPath(boolean)
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getComponent_IsOnSearchPath()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsOnSearchPath();

	/**
	 * Sets the value of the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#isIsOnSearchPath <em>Is On Search Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is On Search Path</em>' attribute.
	 * @see #isIsOnSearchPath()
	 * @generated
	 */
	void setIsOnSearchPath(boolean value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * The default value is <code>"h"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getComponent_Extension()
	 * @model default="h"
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Is Create Code</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Create Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Create Code</em>' attribute.
	 * @see #setIsCreateCode(boolean)
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getComponent_IsCreateCode()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsCreateCode();

	/**
	 * Sets the value of the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component#isIsCreateCode <em>Is Create Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Create Code</em>' attribute.
	 * @see #isIsCreateCode()
	 * @generated
	 */
	void setIsCreateCode(boolean value);

	/**
	 * Returns the value of the '<em><b>Assigned Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getAssignedComponents <em>Assigned Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Interfaces</em>' reference list.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getComponent_AssignedInterfaces()
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface#getAssignedComponents
	 * @model type="org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface" opposite="assignedComponents"
	 * @generated
	 */
	EList getAssignedInterfaces();

} // Component
