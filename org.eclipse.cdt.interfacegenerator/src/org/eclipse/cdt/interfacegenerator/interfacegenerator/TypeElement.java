/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getTypeElement()
 * @model 
 * @generated
 */
public interface TypeElement extends ConstElement {
	/**
	 * Returns the value of the '<em><b>Reference Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type</em>' attribute.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType
	 * @see #setReferenceType(ReferenceType)
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getTypeElement_ReferenceType()
	 * @model 
	 * @generated
	 */
	ReferenceType getReferenceType();

	/**
	 * Sets the value of the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement#getReferenceType <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type</em>' attribute.
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType
	 * @see #getReferenceType()
	 * @generated
	 */
	void setReferenceType(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(AbstractCppDataType)
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getTypeElement_Type()
	 * @model required="true"
	 * @generated
	 */
	AbstractCppDataType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AbstractCppDataType value);

} // TypeElement
