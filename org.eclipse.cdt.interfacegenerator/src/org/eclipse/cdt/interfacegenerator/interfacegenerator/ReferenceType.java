/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reference Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getReferenceType()
 * @model
 * @generated
 */
public final class ReferenceType extends AbstractEnumerator {
	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 0;

	/**
	 * The '<em><b>Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_LITERAL
	 * @model name="reference"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE = 1;

	/**
	 * The '<em><b>Pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINTER_LITERAL
	 * @model name="pointer"
	 * @generated
	 * @ordered
	 */
	public static final int POINTER = 2;

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final ReferenceType NONE_LITERAL = new ReferenceType(NONE, "none");

	/**
	 * The '<em><b>Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reference</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERENCE
	 * @generated
	 * @ordered
	 */
	public static final ReferenceType REFERENCE_LITERAL = new ReferenceType(REFERENCE, "reference");

	/**
	 * The '<em><b>Pointer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pointer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINTER
	 * @generated
	 * @ordered
	 */
	public static final ReferenceType POINTER_LITERAL = new ReferenceType(POINTER, "pointer");

	/**
	 * An array of all the '<em><b>Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReferenceType[] VALUES_ARRAY =
		new ReferenceType[] {
			NONE_LITERAL,
			REFERENCE_LITERAL,
			POINTER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceType get(int value) {
		switch (value) {
			case NONE: return NONE_LITERAL;
			case REFERENCE: return REFERENCE_LITERAL;
			case POINTER: return POINTER_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ReferenceType(int value, String name) {
		super(value, name);
	}

} //ReferenceType
