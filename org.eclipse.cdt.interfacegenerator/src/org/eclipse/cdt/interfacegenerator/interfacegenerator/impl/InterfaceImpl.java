/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator.impl;

import java.util.Collection;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.Component;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfaceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfaceImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.InterfaceImpl#getAssignedComponents <em>Assigned Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends AbstractCppDataTypeImpl implements Interface {
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
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList operations = null;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList derivedFrom = null;

	/**
	 * The cached value of the '{@link #getAssignedComponents() <em>Assigned Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedComponents()
	 * @generated
	 * @ordered
	 */
	protected EList assignedComponents = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InterfacegeneratorPackage.eINSTANCE.getInterface();
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
			eNotify(new ENotificationImpl(this, Notification.SET, InterfacegeneratorPackage.INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList(Operation.class, this, InterfacegeneratorPackage.INTERFACE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList(Derivation.class, this, InterfacegeneratorPackage.INTERFACE__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssignedComponents() {
		if (assignedComponents == null) {
			assignedComponents = new EObjectWithInverseResolvingEList.ManyInverse(Component.class, this, InterfacegeneratorPackage.INTERFACE__ASSIGNED_COMPONENTS, InterfacegeneratorPackage.COMPONENT__ASSIGNED_INTERFACES);
		}
		return assignedComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case InterfacegeneratorPackage.INTERFACE__PACKAGE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, InterfacegeneratorPackage.INTERFACE__PACKAGE, msgs);
				case InterfacegeneratorPackage.INTERFACE__ASSIGNED_COMPONENTS:
					return ((InternalEList)getAssignedComponents()).basicAdd(otherEnd, msgs);
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
				case InterfacegeneratorPackage.INTERFACE__PACKAGE:
					return eBasicSetContainer(null, InterfacegeneratorPackage.INTERFACE__PACKAGE, msgs);
				case InterfacegeneratorPackage.INTERFACE__OPERATIONS:
					return ((InternalEList)getOperations()).basicRemove(otherEnd, msgs);
				case InterfacegeneratorPackage.INTERFACE__DERIVED_FROM:
					return ((InternalEList)getDerivedFrom()).basicRemove(otherEnd, msgs);
				case InterfacegeneratorPackage.INTERFACE__ASSIGNED_COMPONENTS:
					return ((InternalEList)getAssignedComponents()).basicRemove(otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case InterfacegeneratorPackage.INTERFACE__PACKAGE:
					return ((InternalEObject)eContainer).eInverseRemove(this, InterfacegeneratorPackage.PACKAGE__DATA_TYPES, org.eclipse.cdt.interfacegenerator.interfacegenerator.Package.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return ((InternalEObject)eContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case InterfacegeneratorPackage.INTERFACE__PACKAGE:
				return getPackage();
			case InterfacegeneratorPackage.INTERFACE__NAME:
				return getName();
			case InterfacegeneratorPackage.INTERFACE__OPERATIONS:
				return getOperations();
			case InterfacegeneratorPackage.INTERFACE__DERIVED_FROM:
				return getDerivedFrom();
			case InterfacegeneratorPackage.INTERFACE__ASSIGNED_COMPONENTS:
				return getAssignedComponents();
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
			case InterfacegeneratorPackage.INTERFACE__PACKAGE:
				setPackage((org.eclipse.cdt.interfacegenerator.interfacegenerator.Package)newValue);
				return;
			case InterfacegeneratorPackage.INTERFACE__NAME:
				setName((String)newValue);
				return;
			case InterfacegeneratorPackage.INTERFACE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection)newValue);
				return;
			case InterfacegeneratorPackage.INTERFACE__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection)newValue);
				return;
			case InterfacegeneratorPackage.INTERFACE__ASSIGNED_COMPONENTS:
				getAssignedComponents().clear();
				getAssignedComponents().addAll((Collection)newValue);
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
			case InterfacegeneratorPackage.INTERFACE__PACKAGE:
				setPackage((org.eclipse.cdt.interfacegenerator.interfacegenerator.Package)null);
				return;
			case InterfacegeneratorPackage.INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InterfacegeneratorPackage.INTERFACE__OPERATIONS:
				getOperations().clear();
				return;
			case InterfacegeneratorPackage.INTERFACE__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case InterfacegeneratorPackage.INTERFACE__ASSIGNED_COMPONENTS:
				getAssignedComponents().clear();
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
			case InterfacegeneratorPackage.INTERFACE__PACKAGE:
				return getPackage() != null;
			case InterfacegeneratorPackage.INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InterfacegeneratorPackage.INTERFACE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case InterfacegeneratorPackage.INTERFACE__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case InterfacegeneratorPackage.INTERFACE__ASSIGNED_COMPONENTS:
				return assignedComponents != null && !assignedComponents.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType#getTypeName()
	 */
	public String getTypeName() {
		// TODO Auto-generated method stub
		return getName();
	}
} //InterfaceImpl
