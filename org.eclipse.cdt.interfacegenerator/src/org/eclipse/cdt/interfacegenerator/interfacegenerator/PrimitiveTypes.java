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
 * A representation of the literals of the enumeration '<em><b>Primitive Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getPrimitiveTypes()
 * @model
 * @generated
 */
public final class PrimitiveTypes extends AbstractEnumerator {
	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_LITERAL
	 * @model name="int"
	 * @generated
	 * @ordered
	 */
	public static final int INT = 0;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_LITERAL
	 * @model name="float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT = 1;

	/**
	 * The '<em><b>Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_LITERAL
	 * @model name="long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG = 2;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_LITERAL
	 * @model name="double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE = 3;

	/**
	 * The '<em><b>Char</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR_LITERAL
	 * @model name="char"
	 * @generated
	 * @ordered
	 */
	public static final int CHAR = 4;

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveTypes INT_LITERAL = new PrimitiveTypes(INT, "int");

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveTypes FLOAT_LITERAL = new PrimitiveTypes(FLOAT, "float");

	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveTypes LONG_LITERAL = new PrimitiveTypes(LONG, "long");

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveTypes DOUBLE_LITERAL = new PrimitiveTypes(DOUBLE, "double");

	/**
	 * The '<em><b>Char</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Char</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAR
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveTypes CHAR_LITERAL = new PrimitiveTypes(CHAR, "char");

	/**
	 * An array of all the '<em><b>Primitive Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrimitiveTypes[] VALUES_ARRAY =
		new PrimitiveTypes[] {
			INT_LITERAL,
			FLOAT_LITERAL,
			LONG_LITERAL,
			DOUBLE_LITERAL,
			CHAR_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Primitive Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Primitive Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitiveTypes get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Types</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitiveTypes get(int value) {
		switch (value) {
			case INT: return INT_LITERAL;
			case FLOAT: return FLOAT_LITERAL;
			case LONG: return LONG_LITERAL;
			case DOUBLE: return DOUBLE_LITERAL;
			case CHAR: return CHAR_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PrimitiveTypes(int value, String name) {
		super(value, name);
	}

} //PrimitiveTypes
