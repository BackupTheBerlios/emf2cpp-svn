/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator.impl;

import java.util.Collection;

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

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.ComponentImpl#isIsOnSearchPath <em>Is On Search Path</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.ComponentImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.ComponentImpl#isIsCreateCode <em>Is Create Code</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.ComponentImpl#getAssignedInterfaces <em>Assigned Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends NamedElementImpl implements Component {
	/**
	 * The default value of the '{@link #isIsOnSearchPath() <em>Is On Search Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOnSearchPath()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ON_SEARCH_PATH_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsOnSearchPath() <em>Is On Search Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOnSearchPath()
	 * @generated
	 * @ordered
	 */
	protected boolean isOnSearchPath = IS_ON_SEARCH_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = "h";

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCreateCode() <em>Is Create Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCreateCode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CREATE_CODE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsCreateCode() <em>Is Create Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCreateCode()
	 * @generated
	 * @ordered
	 */
	protected boolean isCreateCode = IS_CREATE_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignedInterfaces() <em>Assigned Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList assignedInterfaces = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InterfacegeneratorPackage.eINSTANCE.getComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOnSearchPath() {
		return isOnSearchPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOnSearchPath(boolean newIsOnSearchPath) {
		boolean oldIsOnSearchPath = isOnSearchPath;
		isOnSearchPath = newIsOnSearchPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfacegeneratorPackage.COMPONENT__IS_ON_SEARCH_PATH, oldIsOnSearchPath, isOnSearchPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfacegeneratorPackage.COMPONENT__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCreateCode() {
		return isCreateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCreateCode(boolean newIsCreateCode) {
		boolean oldIsCreateCode = isCreateCode;
		isCreateCode = newIsCreateCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfacegeneratorPackage.COMPONENT__IS_CREATE_CODE, oldIsCreateCode, isCreateCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssignedInterfaces() {
		if (assignedInterfaces == null) {
			assignedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse(Interface.class, this, InterfacegeneratorPackage.COMPONENT__ASSIGNED_INTERFACES, InterfacegeneratorPackage.INTERFACE__ASSIGNED_COMPONENTS);
		}
		return assignedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case InterfacegeneratorPackage.COMPONENT__ASSIGNED_INTERFACES:
					return ((InternalEList)getAssignedInterfaces()).basicAdd(otherEnd, msgs);
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
				case InterfacegeneratorPackage.COMPONENT__ASSIGNED_INTERFACES:
					return ((InternalEList)getAssignedInterfaces()).basicRemove(otherEnd, msgs);
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
			case InterfacegeneratorPackage.COMPONENT__NAME:
				return getName();
			case InterfacegeneratorPackage.COMPONENT__IS_ON_SEARCH_PATH:
				return isIsOnSearchPath() ? Boolean.TRUE : Boolean.FALSE;
			case InterfacegeneratorPackage.COMPONENT__EXTENSION:
				return getExtension();
			case InterfacegeneratorPackage.COMPONENT__IS_CREATE_CODE:
				return isIsCreateCode() ? Boolean.TRUE : Boolean.FALSE;
			case InterfacegeneratorPackage.COMPONENT__ASSIGNED_INTERFACES:
				return getAssignedInterfaces();
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
			case InterfacegeneratorPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case InterfacegeneratorPackage.COMPONENT__IS_ON_SEARCH_PATH:
				setIsOnSearchPath(((Boolean)newValue).booleanValue());
				return;
			case InterfacegeneratorPackage.COMPONENT__EXTENSION:
				setExtension((String)newValue);
				return;
			case InterfacegeneratorPackage.COMPONENT__IS_CREATE_CODE:
				setIsCreateCode(((Boolean)newValue).booleanValue());
				return;
			case InterfacegeneratorPackage.COMPONENT__ASSIGNED_INTERFACES:
				getAssignedInterfaces().clear();
				getAssignedInterfaces().addAll((Collection)newValue);
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
			case InterfacegeneratorPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InterfacegeneratorPackage.COMPONENT__IS_ON_SEARCH_PATH:
				setIsOnSearchPath(IS_ON_SEARCH_PATH_EDEFAULT);
				return;
			case InterfacegeneratorPackage.COMPONENT__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case InterfacegeneratorPackage.COMPONENT__IS_CREATE_CODE:
				setIsCreateCode(IS_CREATE_CODE_EDEFAULT);
				return;
			case InterfacegeneratorPackage.COMPONENT__ASSIGNED_INTERFACES:
				getAssignedInterfaces().clear();
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
			case InterfacegeneratorPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InterfacegeneratorPackage.COMPONENT__IS_ON_SEARCH_PATH:
				return isOnSearchPath != IS_ON_SEARCH_PATH_EDEFAULT;
			case InterfacegeneratorPackage.COMPONENT__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case InterfacegeneratorPackage.COMPONENT__IS_CREATE_CODE:
				return isCreateCode != IS_CREATE_CODE_EDEFAULT;
			case InterfacegeneratorPackage.COMPONENT__ASSIGNED_INTERFACES:
				return assignedInterfaces != null && !assignedInterfaces.isEmpty();
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
		result.append(" (isOnSearchPath: ");
		result.append(isOnSearchPath);
		result.append(", extension: ");
		result.append(extension);
		result.append(", isCreateCode: ");
		result.append(isCreateCode);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
