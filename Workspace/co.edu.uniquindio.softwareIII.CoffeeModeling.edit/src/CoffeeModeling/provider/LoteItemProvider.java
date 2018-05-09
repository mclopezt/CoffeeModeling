/**
 */
package CoffeeModeling.provider;


import CoffeeModeling.CoffeeModelingFactory;
import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Lote;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CoffeeModeling.Lote} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoteItemProvider 
	extends ItemProviderAdapter
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
	public LoteItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addFechaInicioPropertyDescriptor(object);
			addFechaFinPropertyDescriptor(object);
			addEmpleadosPropertyDescriptor(object);
			addPesoPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lote_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lote_id_feature", "_UI_Lote_type"),
				 CoffeeModelingPackage.Literals.LOTE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fecha Inicio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFechaInicioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lote_fechaInicio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lote_fechaInicio_feature", "_UI_Lote_type"),
				 CoffeeModelingPackage.Literals.LOTE__FECHA_INICIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fecha Fin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFechaFinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lote_fechaFin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lote_fechaFin_feature", "_UI_Lote_type"),
				 CoffeeModelingPackage.Literals.LOTE__FECHA_FIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Empleados feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmpleadosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lote_empleados_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lote_empleados_feature", "_UI_Lote_type"),
				 CoffeeModelingPackage.Literals.LOTE__EMPLEADOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Peso feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPesoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lote_peso_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lote_peso_feature", "_UI_Lote_type"),
				 CoffeeModelingPackage.Literals.LOTE__PESO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CoffeeModelingPackage.Literals.LOTE__RECOLECCION);
			childrenFeatures.add(CoffeeModelingPackage.Literals.LOTE__FLOTES);
			childrenFeatures.add(CoffeeModelingPackage.Literals.LOTE__DESPULPE);
			childrenFeatures.add(CoffeeModelingPackage.Literals.LOTE__FERMENTACION);
			childrenFeatures.add(CoffeeModelingPackage.Literals.LOTE__LAVADO);
			childrenFeatures.add(CoffeeModelingPackage.Literals.LOTE__SECADO);
			childrenFeatures.add(CoffeeModelingPackage.Literals.LOTE__TRILLA);
			childrenFeatures.add(CoffeeModelingPackage.Literals.LOTE__SELECCION);
			childrenFeatures.add(CoffeeModelingPackage.Literals.LOTE__TOSTION);
			childrenFeatures.add(CoffeeModelingPackage.Literals.LOTE__MOLIENDA);
			childrenFeatures.add(CoffeeModelingPackage.Literals.LOTE__EMPAQUE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Lote.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Lote"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Lote)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Lote_type") :
			getString("_UI_Lote_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Lote.class)) {
			case CoffeeModelingPackage.LOTE__ID:
			case CoffeeModelingPackage.LOTE__FECHA_INICIO:
			case CoffeeModelingPackage.LOTE__FECHA_FIN:
			case CoffeeModelingPackage.LOTE__PESO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CoffeeModelingPackage.LOTE__RECOLECCION:
			case CoffeeModelingPackage.LOTE__FLOTES:
			case CoffeeModelingPackage.LOTE__DESPULPE:
			case CoffeeModelingPackage.LOTE__FERMENTACION:
			case CoffeeModelingPackage.LOTE__LAVADO:
			case CoffeeModelingPackage.LOTE__SECADO:
			case CoffeeModelingPackage.LOTE__TRILLA:
			case CoffeeModelingPackage.LOTE__SELECCION:
			case CoffeeModelingPackage.LOTE__TOSTION:
			case CoffeeModelingPackage.LOTE__MOLIENDA:
			case CoffeeModelingPackage.LOTE__EMPAQUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CoffeeModelingPackage.Literals.LOTE__RECOLECCION,
				 CoffeeModelingFactory.eINSTANCE.createRecoleccion()));

		newChildDescriptors.add
			(createChildParameter
				(CoffeeModelingPackage.Literals.LOTE__FLOTES,
				 CoffeeModelingFactory.eINSTANCE.createFlotes()));

		newChildDescriptors.add
			(createChildParameter
				(CoffeeModelingPackage.Literals.LOTE__DESPULPE,
				 CoffeeModelingFactory.eINSTANCE.createDespulpe()));

		newChildDescriptors.add
			(createChildParameter
				(CoffeeModelingPackage.Literals.LOTE__FERMENTACION,
				 CoffeeModelingFactory.eINSTANCE.createFermentacion()));

		newChildDescriptors.add
			(createChildParameter
				(CoffeeModelingPackage.Literals.LOTE__LAVADO,
				 CoffeeModelingFactory.eINSTANCE.createLavado()));

		newChildDescriptors.add
			(createChildParameter
				(CoffeeModelingPackage.Literals.LOTE__SECADO,
				 CoffeeModelingFactory.eINSTANCE.createSecado()));

		newChildDescriptors.add
			(createChildParameter
				(CoffeeModelingPackage.Literals.LOTE__TRILLA,
				 CoffeeModelingFactory.eINSTANCE.createTrilla()));

		newChildDescriptors.add
			(createChildParameter
				(CoffeeModelingPackage.Literals.LOTE__SELECCION,
				 CoffeeModelingFactory.eINSTANCE.createSeleccion()));

		newChildDescriptors.add
			(createChildParameter
				(CoffeeModelingPackage.Literals.LOTE__TOSTION,
				 CoffeeModelingFactory.eINSTANCE.createTostion()));

		newChildDescriptors.add
			(createChildParameter
				(CoffeeModelingPackage.Literals.LOTE__MOLIENDA,
				 CoffeeModelingFactory.eINSTANCE.createMolienda()));

		newChildDescriptors.add
			(createChildParameter
				(CoffeeModelingPackage.Literals.LOTE__EMPAQUE,
				 CoffeeModelingFactory.eINSTANCE.createEmpaque()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CoffeeModelingEditPlugin.INSTANCE;
	}

}
