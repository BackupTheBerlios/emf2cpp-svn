/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator.impl;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ReturnType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReturnTypeImpl extends TypeElementImpl implements ReturnType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InterfacegeneratorPackage.eINSTANCE.getReturnType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case InterfacegeneratorPackage.RETURN_TYPE__CONST:
				return isConst() ? Boolean.TRUE : Boolean.FALSE;
			case InterfacegeneratorPackage.RETURN_TYPE__REFERENCE_TYPE:
				return getReferenceType();
			case InterfacegeneratorPackage.RETURN_TYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case InterfacegeneratorPackage.RETURN_TYPE__CONST:
				setConst(((Boolean)newValue).booleanValue());
				return;
			case InterfacegeneratorPackage.RETURN_TYPE__REFERENCE_TYPE:
				setReferenceType((ReferenceType)newValue);
				return;
			case InterfacegeneratorPackage.RETURN_TYPE__TYPE:
				setType((AbstractCppDataType)newValue);
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
			case InterfacegeneratorPackage.RETURN_TYPE__CONST:
				setConst(CONST_EDEFAULT);
				return;
			case InterfacegeneratorPackage.RETURN_TYPE__REFERENCE_TYPE:
				setReferenceType(REFERENCE_TYPE_EDEFAULT);
				return;
			case InterfacegeneratorPackage.RETURN_TYPE__TYPE:
				setType((AbstractCppDataType)null);
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
			case InterfacegeneratorPackage.RETURN_TYPE__CONST:
				return const_ != CONST_EDEFAULT;
			case InterfacegeneratorPackage.RETURN_TYPE__REFERENCE_TYPE:
				return referenceType != REFERENCE_TYPE_EDEFAULT;
			case InterfacegeneratorPackage.RETURN_TYPE__TYPE:
				return type != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ReturnTypeImpl
