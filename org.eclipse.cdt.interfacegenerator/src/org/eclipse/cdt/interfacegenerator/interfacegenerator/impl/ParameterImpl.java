/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator.impl;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.NamedElement;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Parameter;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.ParameterImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends TypeElementImpl implements Parameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InterfacegeneratorPackage.eINSTANCE.getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfacegeneratorPackage.PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case InterfacegeneratorPackage.PARAMETER__CONST:
				return isConst() ? Boolean.TRUE : Boolean.FALSE;
			case InterfacegeneratorPackage.PARAMETER__REFERENCE_TYPE:
				return getReferenceType();
			case InterfacegeneratorPackage.PARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case InterfacegeneratorPackage.PARAMETER__NAME:
				return getName();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case InterfacegeneratorPackage.PARAMETER__CONST:
				setConst(((Boolean)newValue).booleanValue());
				return;
			case InterfacegeneratorPackage.PARAMETER__REFERENCE_TYPE:
				setReferenceType((ReferenceType)newValue);
				return;
			case InterfacegeneratorPackage.PARAMETER__TYPE:
				setType((AbstractCppDataType)newValue);
				return;
			case InterfacegeneratorPackage.PARAMETER__NAME:
				setName((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case InterfacegeneratorPackage.PARAMETER__CONST:
				setConst(CONST_EDEFAULT);
				return;
			case InterfacegeneratorPackage.PARAMETER__REFERENCE_TYPE:
				setReferenceType(REFERENCE_TYPE_EDEFAULT);
				return;
			case InterfacegeneratorPackage.PARAMETER__TYPE:
				setType((AbstractCppDataType)null);
				return;
			case InterfacegeneratorPackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case InterfacegeneratorPackage.PARAMETER__CONST:
				return const_ != CONST_EDEFAULT;
			case InterfacegeneratorPackage.PARAMETER__REFERENCE_TYPE:
				return referenceType != REFERENCE_TYPE_EDEFAULT;
			case InterfacegeneratorPackage.PARAMETER__TYPE:
				return type != null;
			case InterfacegeneratorPackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case InterfacegeneratorPackage.PARAMETER__NAME: return InterfacegeneratorPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case InterfacegeneratorPackage.NAMED_ELEMENT__NAME: return InterfacegeneratorPackage.PARAMETER__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
