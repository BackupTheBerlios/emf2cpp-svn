/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Const Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ConstElement#isConst <em>Const</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getConstElement()
 * @model 
 * @generated
 */
public interface ConstElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Const</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' attribute.
	 * @see #setConst(boolean)
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getConstElement_Const()
	 * @model 
	 * @generated
	 */
	boolean isConst();

	/**
	 * Sets the value of the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ConstElement#isConst <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' attribute.
	 * @see #isConst()
	 * @generated
	 */
	void setConst(boolean value);

} // ConstElement
