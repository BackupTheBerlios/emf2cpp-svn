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

import org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorFactory;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adpater for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider
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
	public PackageItemProvider(AdapterFactory adapterFactory) {
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

			addIsNamespacePropertyDescriptor(object);
			addParentPropertyDescriptor(object);
			addComponentsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_isNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_isNamespace_feature", "_UI_Package_type"),
				 InterfacegeneratorPackage.eINSTANCE.getPackage_IsNamespace(),
				 true,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_parent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_parent_feature", "_UI_Package_type"),
				 InterfacegeneratorPackage.eINSTANCE.getPackage_Parent(),
				 true));
	}

	/**
	 * This adds a property descriptor for the Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_components_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_components_feature", "_UI_Package_type"),
				 InterfacegeneratorPackage.eINSTANCE.getPackage_Components(),
				 true));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(InterfacegeneratorPackage.eINSTANCE.getPackage_DataTypes());
			childrenFeatures.add(InterfacegeneratorPackage.eINSTANCE.getPackage_Packages());
			childrenFeatures.add(InterfacegeneratorPackage.eINSTANCE.getPackage_Components());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/Package");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((org.eclipse.cdt.interfacegenerator.interfacegenerator.Package)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Package_type") :
			getString("_UI_Package_type") + " " + label;
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

		switch (notification.getFeatureID(org.eclipse.cdt.interfacegenerator.interfacegenerator.Package.class)) {
			case InterfacegeneratorPackage.PACKAGE__IS_NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case InterfacegeneratorPackage.PACKAGE__DATA_TYPES:
			case InterfacegeneratorPackage.PACKAGE__PACKAGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(InterfacegeneratorPackage.eINSTANCE.getPackage_DataTypes(),
				 InterfacegeneratorFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(InterfacegeneratorPackage.eINSTANCE.getPackage_DataTypes(),
				 InterfacegeneratorFactory.eINSTANCE.createTemplateInterface()));

		newChildDescriptors.add
			(createChildParameter
				(InterfacegeneratorPackage.eINSTANCE.getPackage_DataTypes(),
				 InterfacegeneratorFactory.eINSTANCE.createTemplateParameter()));

		newChildDescriptors.add
			(createChildParameter
				(InterfacegeneratorPackage.eINSTANCE.getPackage_DataTypes(),
				 InterfacegeneratorFactory.eINSTANCE.createPrimitiveCppType()));

		newChildDescriptors.add
			(createChildParameter
				(InterfacegeneratorPackage.eINSTANCE.getPackage_Packages(),
				 InterfacegeneratorFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(InterfacegeneratorPackage.eINSTANCE.getPackage_Components(),
				 InterfacegeneratorFactory.eINSTANCE.createComponent()));
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
