/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator.impl;

import java.util.Collection;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Component;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.PackageImpl#isIsNamespace <em>Is Namespace</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.PackageImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.PackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.PackageImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.PackageImpl#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements org.eclipse.cdt.interfacegenerator.interfacegenerator.Package {
	/**
	 * The default value of the '{@link #isIsNamespace() <em>Is Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NAMESPACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNamespace() <em>Is Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNamespace()
	 * @generated
	 * @ordered
	 */
	protected boolean isNamespace = IS_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList dataTypes = null;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList packages = null;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.cdt.interfacegenerator.interfacegenerator.Package parent = null;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList components = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InterfacegeneratorPackage.eINSTANCE.getPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNamespace() {
		return isNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNamespace(boolean newIsNamespace) {
		boolean oldIsNamespace = isNamespace;
		isNamespace = newIsNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfacegeneratorPackage.PACKAGE__IS_NAMESPACE, oldIsNamespace, isNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentWithInverseEList(AbstractCppDataType.class, this, InterfacegeneratorPackage.PACKAGE__DATA_TYPES, InterfacegeneratorPackage.ABSTRACT_CPP_DATA_TYPE__PACKAGE);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackages() {
		if (packages == null) {
			packages = new EObjectWithInverseResolvingEList(org.eclipse.cdt.interfacegenerator.interfacegenerator.Package.class, this, InterfacegeneratorPackage.PACKAGE__PACKAGES, InterfacegeneratorPackage.PACKAGE__PARENT);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.cdt.interfacegenerator.interfacegenerator.Package getParent() {
		if (parent != null && parent.eIsProxy()) {
			org.eclipse.cdt.interfacegenerator.interfacegenerator.Package oldParent = parent;
			parent = (org.eclipse.cdt.interfacegenerator.interfacegenerator.Package)eResolveProxy((InternalEObject)parent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterfacegeneratorPackage.PACKAGE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.cdt.interfacegenerator.interfacegenerator.Package basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(org.eclipse.cdt.interfacegenerator.interfacegenerator.Package newParent, NotificationChain msgs) {
		org.eclipse.cdt.interfacegenerator.interfacegenerator.Package oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InterfacegeneratorPackage.PACKAGE__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(org.eclipse.cdt.interfacegenerator.interfacegenerator.Package newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, InterfacegeneratorPackage.PACKAGE__PACKAGES, org.eclipse.cdt.interfacegenerator.interfacegenerator.Package.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, InterfacegeneratorPackage.PACKAGE__PACKAGES, org.eclipse.cdt.interfacegenerator.interfacegenerator.Package.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfacegeneratorPackage.PACKAGE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList(Component.class, this, InterfacegeneratorPackage.PACKAGE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case InterfacegeneratorPackage.PACKAGE__DATA_TYPES:
					return ((InternalEList)getDataTypes()).basicAdd(otherEnd, msgs);
				case InterfacegeneratorPackage.PACKAGE__PACKAGES:
					return ((InternalEList)getPackages()).basicAdd(otherEnd, msgs);
				case InterfacegeneratorPackage.PACKAGE__PARENT:
					if (parent != null)
						msgs = ((InternalEObject)parent).eInverseRemove(this, InterfacegeneratorPackage.PACKAGE__PACKAGES, org.eclipse.cdt.interfacegenerator.interfacegenerator.Package.class, msgs);
					return basicSetParent((org.eclipse.cdt.interfacegenerator.interfacegenerator.Package)otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case InterfacegeneratorPackage.PACKAGE__DATA_TYPES:
					return ((InternalEList)getDataTypes()).basicRemove(otherEnd, msgs);
				case InterfacegeneratorPackage.PACKAGE__PACKAGES:
					return ((InternalEList)getPackages()).basicRemove(otherEnd, msgs);
				case InterfacegeneratorPackage.PACKAGE__PARENT:
					return basicSetParent(null, msgs);
				case InterfacegeneratorPackage.PACKAGE__COMPONENTS:
					return ((InternalEList)getComponents()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case InterfacegeneratorPackage.PACKAGE__NAME:
				return getName();
			case InterfacegeneratorPackage.PACKAGE__IS_NAMESPACE:
				return isIsNamespace() ? Boolean.TRUE : Boolean.FALSE;
			case InterfacegeneratorPackage.PACKAGE__DATA_TYPES:
				return getDataTypes();
			case InterfacegeneratorPackage.PACKAGE__PACKAGES:
				return getPackages();
			case InterfacegeneratorPackage.PACKAGE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case InterfacegeneratorPackage.PACKAGE__COMPONENTS:
				return getComponents();
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
			case InterfacegeneratorPackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case InterfacegeneratorPackage.PACKAGE__IS_NAMESPACE:
				setIsNamespace(((Boolean)newValue).booleanValue());
				return;
			case InterfacegeneratorPackage.PACKAGE__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection)newValue);
				return;
			case InterfacegeneratorPackage.PACKAGE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection)newValue);
				return;
			case InterfacegeneratorPackage.PACKAGE__PARENT:
				setParent((org.eclipse.cdt.interfacegenerator.interfacegenerator.Package)newValue);
				return;
			case InterfacegeneratorPackage.PACKAGE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection)newValue);
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
			case InterfacegeneratorPackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InterfacegeneratorPackage.PACKAGE__IS_NAMESPACE:
				setIsNamespace(IS_NAMESPACE_EDEFAULT);
				return;
			case InterfacegeneratorPackage.PACKAGE__DATA_TYPES:
				getDataTypes().clear();
				return;
			case InterfacegeneratorPackage.PACKAGE__PACKAGES:
				getPackages().clear();
				return;
			case InterfacegeneratorPackage.PACKAGE__PARENT:
				setParent((org.eclipse.cdt.interfacegenerator.interfacegenerator.Package)null);
				return;
			case InterfacegeneratorPackage.PACKAGE__COMPONENTS:
				getComponents().clear();
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
			case InterfacegeneratorPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InterfacegeneratorPackage.PACKAGE__IS_NAMESPACE:
				return isNamespace != IS_NAMESPACE_EDEFAULT;
			case InterfacegeneratorPackage.PACKAGE__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case InterfacegeneratorPackage.PACKAGE__PACKAGES:
				return packages != null && !packages.isEmpty();
			case InterfacegeneratorPackage.PACKAGE__PARENT:
				return parent != null;
			case InterfacegeneratorPackage.PACKAGE__COMPONENTS:
				return components != null && !components.isEmpty();
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
		result.append(" (isNamespace: ");
		result.append(isNamespace);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
