/**
 */
package CoffeeModeling.provider;

import CoffeeModeling.util.CoffeeModelingAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
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
public class CoffeeModelingItemProviderAdapterFactory extends CoffeeModelingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeModelingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Finca} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FincaItemProvider fincaItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Finca}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFincaAdapter() {
		if (fincaItemProvider == null) {
			fincaItemProvider = new FincaItemProvider(this);
		}

		return fincaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Lote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoteItemProvider loteItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Lote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoteAdapter() {
		if (loteItemProvider == null) {
			loteItemProvider = new LoteItemProvider(this);
		}

		return loteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Siembra} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiembraItemProvider siembraItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Siembra}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSiembraAdapter() {
		if (siembraItemProvider == null) {
			siembraItemProvider = new SiembraItemProvider(this);
		}

		return siembraItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Abono} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbonoItemProvider abonoItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Abono}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbonoAdapter() {
		if (abonoItemProvider == null) {
			abonoItemProvider = new AbonoItemProvider(this);
		}

		return abonoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Veneno} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VenenoItemProvider venenoItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Veneno}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVenenoAdapter() {
		if (venenoItemProvider == null) {
			venenoItemProvider = new VenenoItemProvider(this);
		}

		return venenoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Recoleccion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecoleccionItemProvider recoleccionItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Recoleccion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecoleccionAdapter() {
		if (recoleccionItemProvider == null) {
			recoleccionItemProvider = new RecoleccionItemProvider(this);
		}

		return recoleccionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Flotes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlotesItemProvider flotesItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Flotes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlotesAdapter() {
		if (flotesItemProvider == null) {
			flotesItemProvider = new FlotesItemProvider(this);
		}

		return flotesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Despulpe} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DespulpeItemProvider despulpeItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Despulpe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDespulpeAdapter() {
		if (despulpeItemProvider == null) {
			despulpeItemProvider = new DespulpeItemProvider(this);
		}

		return despulpeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Agua} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AguaItemProvider aguaItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Agua}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAguaAdapter() {
		if (aguaItemProvider == null) {
			aguaItemProvider = new AguaItemProvider(this);
		}

		return aguaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Fermentacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FermentacionItemProvider fermentacionItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Fermentacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFermentacionAdapter() {
		if (fermentacionItemProvider == null) {
			fermentacionItemProvider = new FermentacionItemProvider(this);
		}

		return fermentacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Lavado} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LavadoItemProvider lavadoItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Lavado}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLavadoAdapter() {
		if (lavadoItemProvider == null) {
			lavadoItemProvider = new LavadoItemProvider(this);
		}

		return lavadoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Secado} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecadoItemProvider secadoItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Secado}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecadoAdapter() {
		if (secadoItemProvider == null) {
			secadoItemProvider = new SecadoItemProvider(this);
		}

		return secadoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Trilla} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrillaItemProvider trillaItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Trilla}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrillaAdapter() {
		if (trillaItemProvider == null) {
			trillaItemProvider = new TrillaItemProvider(this);
		}

		return trillaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Seleccion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeleccionItemProvider seleccionItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Seleccion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeleccionAdapter() {
		if (seleccionItemProvider == null) {
			seleccionItemProvider = new SeleccionItemProvider(this);
		}

		return seleccionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Tostion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TostionItemProvider tostionItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Tostion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTostionAdapter() {
		if (tostionItemProvider == null) {
			tostionItemProvider = new TostionItemProvider(this);
		}

		return tostionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Defecto} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefectoItemProvider defectoItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Defecto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefectoAdapter() {
		if (defectoItemProvider == null) {
			defectoItemProvider = new DefectoItemProvider(this);
		}

		return defectoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.SeleccionAutomatica} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeleccionAutomaticaItemProvider seleccionAutomaticaItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.SeleccionAutomatica}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeleccionAutomaticaAdapter() {
		if (seleccionAutomaticaItemProvider == null) {
			seleccionAutomaticaItemProvider = new SeleccionAutomaticaItemProvider(this);
		}

		return seleccionAutomaticaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Molienda} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoliendaItemProvider moliendaItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Molienda}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMoliendaAdapter() {
		if (moliendaItemProvider == null) {
			moliendaItemProvider = new MoliendaItemProvider(this);
		}

		return moliendaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Empaque} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmpaqueItemProvider empaqueItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Empaque}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmpaqueAdapter() {
		if (empaqueItemProvider == null) {
			empaqueItemProvider = new EmpaqueItemProvider(this);
		}

		return empaqueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Empleado} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmpleadoItemProvider empleadoItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Empleado}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmpleadoAdapter() {
		if (empleadoItemProvider == null) {
			empleadoItemProvider = new EmpleadoItemProvider(this);
		}

		return empleadoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Proceso} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcesoItemProvider procesoItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Proceso}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcesoAdapter() {
		if (procesoItemProvider == null) {
			procesoItemProvider = new ProcesoItemProvider(this);
		}

		return procesoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CoffeeModeling.Terreno} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerrenoItemProvider terrenoItemProvider;

	/**
	 * This creates an adapter for a {@link CoffeeModeling.Terreno}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTerrenoAdapter() {
		if (terrenoItemProvider == null) {
			terrenoItemProvider = new TerrenoItemProvider(this);
		}

		return terrenoItemProvider;
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
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
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

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (fincaItemProvider != null) fincaItemProvider.dispose();
		if (loteItemProvider != null) loteItemProvider.dispose();
		if (siembraItemProvider != null) siembraItemProvider.dispose();
		if (abonoItemProvider != null) abonoItemProvider.dispose();
		if (venenoItemProvider != null) venenoItemProvider.dispose();
		if (recoleccionItemProvider != null) recoleccionItemProvider.dispose();
		if (flotesItemProvider != null) flotesItemProvider.dispose();
		if (despulpeItemProvider != null) despulpeItemProvider.dispose();
		if (aguaItemProvider != null) aguaItemProvider.dispose();
		if (fermentacionItemProvider != null) fermentacionItemProvider.dispose();
		if (lavadoItemProvider != null) lavadoItemProvider.dispose();
		if (secadoItemProvider != null) secadoItemProvider.dispose();
		if (trillaItemProvider != null) trillaItemProvider.dispose();
		if (seleccionItemProvider != null) seleccionItemProvider.dispose();
		if (tostionItemProvider != null) tostionItemProvider.dispose();
		if (defectoItemProvider != null) defectoItemProvider.dispose();
		if (seleccionAutomaticaItemProvider != null) seleccionAutomaticaItemProvider.dispose();
		if (moliendaItemProvider != null) moliendaItemProvider.dispose();
		if (empaqueItemProvider != null) empaqueItemProvider.dispose();
		if (empleadoItemProvider != null) empleadoItemProvider.dispose();
		if (procesoItemProvider != null) procesoItemProvider.dispose();
		if (terrenoItemProvider != null) terrenoItemProvider.dispose();
	}

}
