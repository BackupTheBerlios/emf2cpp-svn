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
import org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.TypeElementImpl#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.TypeElementImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeElementImpl extends ConstElementImpl implements TypeElement {
	/**
	 * The default value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected static final ReferenceType REFERENCE_TYPE_EDEFAULT = ReferenceType.NONE_LITERAL;

	/**
	 * The cached value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType referenceType = REFERENCE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AbstractCppDataType type = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InterfacegeneratorPackage.eINSTANCE.getTypeElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getReferenceType() {
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceType(ReferenceType newReferenceType) {
		ReferenceType oldReferenceType = referenceType;
		referenceType = newReferenceType == null ? REFERENCE_TYPE_EDEFAULT : newReferenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfacegeneratorPackage.TYPE_ELEMENT__REFERENCE_TYPE, oldReferenceType, referenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCppDataType getType() {
		if (type != null && type.eIsProxy()) {
			AbstractCppDataType oldType = type;
			type = (AbstractCppDataType)eResolveProxy((InternalEObject)type);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterfacegeneratorPackage.TYPE_ELEMENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCppDataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AbstractCppDataType newType) {
		AbstractCppDataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfacegeneratorPackage.TYPE_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case InterfacegeneratorPackage.TYPE_ELEMENT__CONST:
				return isConst() ? Boolean.TRUE : Boolean.FALSE;
			case InterfacegeneratorPackage.TYPE_ELEMENT__REFERENCE_TYPE:
				return getReferenceType();
			case InterfacegeneratorPackage.TYPE_ELEMENT__TYPE:
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
			case InterfacegeneratorPackage.TYPE_ELEMENT__CONST:
				setConst(((Boolean)newValue).booleanValue());
				return;
			case InterfacegeneratorPackage.TYPE_ELEMENT__REFERENCE_TYPE:
				setReferenceType((ReferenceType)newValue);
				return;
			case InterfacegeneratorPackage.TYPE_ELEMENT__TYPE:
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
			case InterfacegeneratorPackage.TYPE_ELEMENT__CONST:
				setConst(CONST_EDEFAULT);
				return;
			case InterfacegeneratorPackage.TYPE_ELEMENT__REFERENCE_TYPE:
				setReferenceType(REFERENCE_TYPE_EDEFAULT);
				return;
			case InterfacegeneratorPackage.TYPE_ELEMENT__TYPE:
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
			case InterfacegeneratorPackage.TYPE_ELEMENT__CONST:
				return const_ != CONST_EDEFAULT;
			case InterfacegeneratorPackage.TYPE_ELEMENT__REFERENCE_TYPE:
				return referenceType != REFERENCE_TYPE_EDEFAULT;
			case InterfacegeneratorPackage.TYPE_ELEMENT__TYPE:
				return type != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (referenceType: ");
		result.append(referenceType);
		result.append(')');
		return result.toString();
	}

} //TypeElementImpl
