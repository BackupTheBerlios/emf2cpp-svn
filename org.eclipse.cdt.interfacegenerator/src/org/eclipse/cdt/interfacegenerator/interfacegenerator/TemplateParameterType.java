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
 * A representation of the literals of the enumeration '<em><b>Template Parameter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage#getTemplateParameterType()
 * @model
 * @generated
 */
public final class TemplateParameterType extends AbstractEnumerator {
	/**
	 * The '<em><b>Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_LITERAL
	 * @model name="class"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS = 0;

	/**
	 * The '<em><b>Typename</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPENAME_LITERAL
	 * @model name="typename"
	 * @generated
	 * @ordered
	 */
	public static final int TYPENAME = 1;

	/**
	 * The '<em><b>Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Class</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS
	 * @generated
	 * @ordered
	 */
	public static final TemplateParameterType CLASS_LITERAL = new TemplateParameterType(CLASS, "class");

	/**
	 * The '<em><b>Typename</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Typename</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYPENAME
	 * @generated
	 * @ordered
	 */
	public static final TemplateParameterType TYPENAME_LITERAL = new TemplateParameterType(TYPENAME, "typename");

	/**
	 * An array of all the '<em><b>Template Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TemplateParameterType[] VALUES_ARRAY =
		new TemplateParameterType[] {
			CLASS_LITERAL,
			TYPENAME_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Template Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Template Parameter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemplateParameterType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TemplateParameterType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Template Parameter Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemplateParameterType get(int value) {
		switch (value) {
			case CLASS: return CLASS_LITERAL;
			case TYPENAME: return TYPENAME_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TemplateParameterType(int value, String name) {
		super(value, name);
	}

} //TemplateParameterType
