/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator.impl;

import java.util.Collection;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateInterface;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.cdt.interfacegenerator.interfacegenerator.impl.TemplateInterfaceImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateInterfaceImpl extends InterfaceImpl implements TemplateInterface {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter parameters = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InterfacegeneratorPackage.eINSTANCE.getTemplateInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(TemplateParameter newParameters, NotificationChain msgs) {
		TemplateParameter oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InterfacegeneratorPackage.TEMPLATE_INTERFACE__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(TemplateParameter newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InterfacegeneratorPackage.TEMPLATE_INTERFACE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InterfacegeneratorPackage.TEMPLATE_INTERFACE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfacegeneratorPackage.TEMPLATE_INTERFACE__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case InterfacegeneratorPackage.TEMPLATE_INTERFACE__PACKAGE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, InterfacegeneratorPackage.TEMPLATE_INTERFACE__PACKAGE, msgs);
				case InterfacegeneratorPackage.TEMPLATE_INTERFACE__ASSIGNED_COMPONENTS:
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
				case InterfacegeneratorPackage.TEMPLATE_INTERFACE__PACKAGE:
					return eBasicSetContainer(null, InterfacegeneratorPackage.TEMPLATE_INTERFACE__PACKAGE, msgs);
				case InterfacegeneratorPackage.TEMPLATE_INTERFACE__OPERATIONS:
					return ((InternalEList)getOperations()).basicRemove(otherEnd, msgs);
				case InterfacegeneratorPackage.TEMPLATE_INTERFACE__DERIVED_FROM:
					return ((InternalEList)getDerivedFrom()).basicRemove(otherEnd, msgs);
				case InterfacegeneratorPackage.TEMPLATE_INTERFACE__ASSIGNED_COMPONENTS:
					return ((InternalEList)getAssignedComponents()).basicRemove(otherEnd, msgs);
				case InterfacegeneratorPackage.TEMPLATE_INTERFACE__PARAMETERS:
					return basicSetParameters(null, msgs);
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
				case InterfacegeneratorPackage.TEMPLATE_INTERFACE__PACKAGE:
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
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__PACKAGE:
				return getPackage();
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__NAME:
				return getName();
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__OPERATIONS:
				return getOperations();
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__DERIVED_FROM:
				return getDerivedFrom();
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__ASSIGNED_COMPONENTS:
				return getAssignedComponents();
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__PARAMETERS:
				return getParameters();
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
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__PACKAGE:
				setPackage((org.eclipse.cdt.interfacegenerator.interfacegenerator.Package)newValue);
				return;
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection)newValue);
				return;
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection)newValue);
				return;
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__ASSIGNED_COMPONENTS:
				getAssignedComponents().clear();
				getAssignedComponents().addAll((Collection)newValue);
				return;
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__PARAMETERS:
				setParameters((TemplateParameter)newValue);
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
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__PACKAGE:
				setPackage((org.eclipse.cdt.interfacegenerator.interfacegenerator.Package)null);
				return;
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__OPERATIONS:
				getOperations().clear();
				return;
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__ASSIGNED_COMPONENTS:
				getAssignedComponents().clear();
				return;
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__PARAMETERS:
				setParameters((TemplateParameter)null);
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
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__PACKAGE:
				return getPackage() != null;
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__ASSIGNED_COMPONENTS:
				return assignedComponents != null && !assignedComponents.isEmpty();
			case InterfacegeneratorPackage.TEMPLATE_INTERFACE__PARAMETERS:
				return parameters != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //TemplateInterfaceImpl
