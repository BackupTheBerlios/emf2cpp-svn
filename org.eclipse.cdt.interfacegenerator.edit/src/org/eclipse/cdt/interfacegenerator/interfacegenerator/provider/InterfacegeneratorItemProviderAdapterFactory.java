/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cdt.interfacegenerator.interfacegenerator.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.cdt.interfacegenerator.interfacegenerator.util.InterfacegeneratorAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfacegeneratorItemProviderAdapterFactory extends InterfacegeneratorAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection supportedTypes = new ArrayList();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacegeneratorItemProviderAdapterFactory() {
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceItemProvider interfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		if (interfaceItemProvider == null) {
			interfaceItemProvider = new InterfaceItemProvider(this);
		}

		return interfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.NamedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementItemProvider namedElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		if (namedElementItemProvider == null) {
			namedElementItemProvider = new NamedElementItemProvider(this);
		}

		return namedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateInterfaceItemProvider templateInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTemplateInterfaceAdapter() {
		if (templateInterfaceItemProvider == null) {
			templateInterfaceItemProvider = new TemplateInterfaceItemProvider(this);
		}

		return templateInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateParameterItemProvider templateParameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTemplateParameterAdapter() {
		if (templateParameterItemProvider == null) {
			templateParameterItemProvider = new TemplateParameterItemProvider(this);
		}

		return templateParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ConstElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstElementItemProvider constElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ConstElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createConstElementAdapter() {
		if (constElementItemProvider == null) {
			constElementItemProvider = new ConstElementItemProvider(this);
		}

		return constElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivationItemProvider derivationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Derivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDerivationAdapter() {
		if (derivationItemProvider == null) {
			derivationItemProvider = new DerivationItemProvider(this);
		}

		return derivationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeElementItemProvider typeElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.TypeElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTypeElementAdapter() {
		if (typeElementItemProvider == null) {
			typeElementItemProvider = new TypeElementItemProvider(this);
		}

		return typeElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveCppType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveCppTypeItemProvider primitiveCppTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.PrimitiveCppType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPrimitiveCppTypeAdapter() {
		if (primitiveCppTypeItemProvider == null) {
			primitiveCppTypeItemProvider = new PrimitiveCppTypeItemProvider(this);
		}

		return primitiveCppTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ReturnType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnTypeItemProvider returnTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.ReturnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createReturnTypeAdapter() {
		if (returnTypeItemProvider == null) {
			returnTypeItemProvider = new ReturnTypeItemProvider(this);
		}

		return returnTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageItemProvider packageItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this);
		}

		return packageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cdt.interfacegenerator.interfacegenerator.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

}
