/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator.provider;


import interfacegenerator.provider.CppinterfaceEditPlugin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.AbstractCppDataType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorFactory;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.InterfacegeneratorPackage;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.Parameter;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ReferenceType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.ReturnType;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
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
 * This is the item provider adpater for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationItemProvider
	extends ConstElementItemProvider
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
	public OperationItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 InterfacegeneratorPackage.eINSTANCE.getNamedElement_Name(),
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
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
			childrenFeatures.add(InterfacegeneratorPackage.eINSTANCE.getOperation_ReturnType());
			childrenFeatures.add(InterfacegeneratorPackage.eINSTANCE.getOperation_Parameters());
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
	 * This returns Operation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/Operation");
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getText(Object object) {
		Operation operation=(Operation) object;
		StringBuffer s=new StringBuffer(getString("_UI_Operation_type"));
		s.append(' ');
		ReturnType returnType=operation.getReturnType();
		if (returnType != null)
		{
			if (returnType.isConst())
			{
				s.append("const ");
			}
			AbstractCppDataType type=returnType.getType();
			if (type != null)
			{
				s.append(type.getTypeName());
			}
			switch (returnType.getReferenceType().getValue())
			{
				case ReferenceType.REFERENCE:
					s.append(" & ");
					break;
				case ReferenceType.POINTER:
					s.append(" * ");
					break;
				default:
					s.append(' ');
					break;
			}
		}
		else
		{
			s.append("void ");
		}
		String name=operation.getName();
		if (name != null)
		{
			s.append(name);
		}
		s.append('(');
		EList params=operation.getParameters();
		if (params != null)
		{
			for (Iterator iter=params.iterator();iter.hasNext();)
			{
				Parameter param=(Parameter) iter.next();
				if (param.isConst())
				{
					s.append("const ");
				}
				AbstractCppDataType paramType=param.getType();
				if (paramType != null)
				{
					s.append(paramType.getTypeName());
				}
				switch (param.getReferenceType().getValue())
				{
					case ReferenceType.REFERENCE:
						s.append(" & ");
						break;
					case ReferenceType.POINTER:
						s.append(" * ");
						break;
					default:
						s.append(' ');
						break;
				}
				s.append(param.getName());
				if (iter.hasNext())
				{
					s.append(',');
				}
			}
		}
		s.append(')');
		if (operation.isConst())
		{
			s.append(" const");
		}
		return s.toString();
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

		switch (notification.getFeatureID(Operation.class)) {
			case InterfacegeneratorPackage.OPERATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case InterfacegeneratorPackage.OPERATION__RETURN_TYPE:
			case InterfacegeneratorPackage.OPERATION__PARAMETERS:
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
				(InterfacegeneratorPackage.eINSTANCE.getOperation_ReturnType(),
				 InterfacegeneratorFactory.eINSTANCE.createReturnType()));

		newChildDescriptors.add
			(createChildParameter
				(InterfacegeneratorPackage.eINSTANCE.getOperation_Parameters(),
				 InterfacegeneratorFactory.eINSTANCE.createParameter()));
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
