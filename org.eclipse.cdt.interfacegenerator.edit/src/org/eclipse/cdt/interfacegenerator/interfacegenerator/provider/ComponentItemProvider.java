/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator.provider;


import interfacegenerator.provider.CppinterfaceEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.Component;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.emf.edit.provider.ItemProviderAdapter;

/**
 * This is the item provider adpater for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider
	extends NamedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIsOnSearchPathPropertyDescriptor(object);
			addExtensionPropertyDescriptor(object);
			addIsCreateCodePropertyDescriptor(object);
			addAssignedInterfacesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is On Search Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOnSearchPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_isOnSearchPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_isOnSearchPath_feature", "_UI_Component_type"),
				 InterfacegeneratorPackage.eINSTANCE.getComponent_IsOnSearchPath(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Extension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_extension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_extension_feature", "_UI_Component_type"),
				 InterfacegeneratorPackage.eINSTANCE.getComponent_Extension(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Is Create Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCreateCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_isCreateCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_isCreateCode_feature", "_UI_Component_type"),
				 InterfacegeneratorPackage.eINSTANCE.getComponent_IsCreateCode(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Assigned Interfaces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignedInterfacesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_assignedInterfaces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_assignedInterfaces_feature", "_UI_Component_type"),
				 InterfacegeneratorPackage.eINSTANCE.getComponent_AssignedInterfaces(),
				 true));
	}

	/**
	 * This returns Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/Component");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Component)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Component_type") :
			getString("_UI_Component_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Component.class)) {
			case InterfacegeneratorPackage.COMPONENT__IS_ON_SEARCH_PATH:
			case InterfacegeneratorPackage.COMPONENT__EXTENSION:
			case InterfacegeneratorPackage.COMPONENT__IS_CREATE_CODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return CppinterfaceEditPlugin.INSTANCE;
	}

}
