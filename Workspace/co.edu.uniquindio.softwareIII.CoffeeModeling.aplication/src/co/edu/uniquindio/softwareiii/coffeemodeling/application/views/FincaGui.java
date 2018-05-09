package co.edu.uniquindio.softwareiii.coffeemodeling.application.views;

import java.util.ArrayList;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;

import CoffeeModeling.CoffeeModelingPackage.Literals;
import CoffeeModeling.Finca;
import CoffeeModeling.Lote;
import CoffeeModeling.Siembra;
import CoffeeModeling.Terreno;
import co.edu.uniquindio.softwareiii.coffeemodeling.application.model.ModelFactoryModel;

public class FincaGui extends ViewPart {
	private DataBindingContext m_bindingContext;

	public static final String ID = "co.edu.uniquindio.softwareiii.coffeemodeling.application.views.FincaGui"; //$NON-NLS-1$
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	Finca finca;
	ModelFactoryModel mfm = ModelFactoryModel.getInstance();

	Terreno terreno_Seleccionado;
	ArrayList<Siembra> siembras = new ArrayList<>();

	String siembra_Seleccionado;
	ArrayList<Lote> lotes = new ArrayList<>();

	String lote_Seleccionado;
	ArrayList<String> procesos = new ArrayList<>();

	private Group grpTerrenosDeLa;
	private Group grpSiembrasDelTerreno;
	private Group grpLotesDeLa;
	private Group grpProcesosRealizadosAl;
	private Composite composite;
	private ListViewer listViewerTerrenos;
	private ListViewer listViewerLotes;
	private ListViewer listViewerSiembras;
	private ListViewer listViewer;

	public FincaGui() {
		finca = mfm.getModelFactory();
		siembras = new ArrayList<>();
		lotes = new ArrayList<>();
		procesos = new ArrayList<>();
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		parent.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		parent.setLayout(null);
		{
			composite = new Composite(parent, SWT.NONE);
			composite.setBounds(0, 0, 671, 717);
			toolkit.adapt(composite);
			toolkit.paintBordersFor(composite);
			composite.setLayout(null);
			{
				grpTerrenosDeLa = new Group(composite, SWT.NONE);
				grpTerrenosDeLa.setBounds(10, 0, 259, 220);
				grpTerrenosDeLa.setText("Terrenos de la finca");
				toolkit.adapt(grpTerrenosDeLa);
				toolkit.paintBordersFor(grpTerrenosDeLa);
				grpTerrenosDeLa.setLayout(null);

				listViewerTerrenos = new ListViewer(grpTerrenosDeLa, SWT.BORDER | SWT.V_SCROLL);

				listViewerTerrenos.addSelectionChangedListener(new ISelectionChangedListener() {

					public void selectionChanged(SelectionChangedEvent event) {
						IStructuredSelection xselection = (IStructuredSelection) listViewerTerrenos.getSelection();

						terreno_Seleccionado = (Terreno) xselection.getFirstElement();
						siembras = mfm.listarSiembrasDeUnTerreno(finca,terreno_Seleccionado);

						grpSiembrasDelTerreno.setVisible(true);
						grpTerrenosDeLa.setVisible(false);

						listViewerSiembras.refresh();

						for (int i = 0; i < siembras.size(); i++) {
							listViewerSiembras.add(siembras.get(i).getId());
						}

					}
				});

				List listTerrenos = listViewerTerrenos.getList();
				listTerrenos.setBounds(10, 21, 239, 189);
			}

			grpSiembrasDelTerreno = new Group(composite, SWT.NONE);
			grpSiembrasDelTerreno.setText("Siembras del terreno");
			grpSiembrasDelTerreno.setVisible(false);
			grpSiembrasDelTerreno.setBounds(10, 0, 259, 220);
			toolkit.adapt(grpSiembrasDelTerreno);
			toolkit.paintBordersFor(grpSiembrasDelTerreno);

			listViewerSiembras = new ListViewer(grpSiembrasDelTerreno, SWT.BORDER | SWT.V_SCROLL);

			listViewerSiembras.addSelectionChangedListener(new ISelectionChangedListener() {

				public void selectionChanged(SelectionChangedEvent event) {
					IStructuredSelection xselection = (IStructuredSelection) listViewerSiembras.getSelection();
					siembra_Seleccionado = (String) xselection.getFirstElement();

					lotes = mfm.listarLotesDeUnaSiembra(finca, terreno_Seleccionado, siembra_Seleccionado);

					grpSiembrasDelTerreno.setVisible(false);
					grpLotesDeLa.setVisible(true);

					listViewerLotes.refresh();

					for (int i = 0; i < lotes.size(); i++) {
						listViewerLotes.add(lotes.get(i).getId());
					}

				}
			});

			List listSiembras = listViewerSiembras.getList();
			listSiembras.setBounds(10, 20, 239, 162);

			Button btnRegresar = new Button(grpSiembrasDelTerreno, SWT.NONE);
			btnRegresar.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					grpSiembrasDelTerreno.setVisible(false);
					grpTerrenosDeLa.setVisible(true);
				}
			});
			btnRegresar.setBounds(174, 188, 75, 25);
			toolkit.adapt(btnRegresar, true, true);
			btnRegresar.setText("Regresar");

			grpLotesDeLa = new Group(composite, SWT.NONE);
			grpLotesDeLa.setText("Lotes de la siembra");
			grpLotesDeLa.setVisible(false);
			grpLotesDeLa.setBounds(10, 0, 259, 220);
			toolkit.adapt(grpLotesDeLa);
			toolkit.paintBordersFor(grpLotesDeLa);

			listViewerLotes = new ListViewer(grpLotesDeLa, SWT.BORDER | SWT.V_SCROLL);
			
			listViewerLotes.addSelectionChangedListener(new ISelectionChangedListener() {

				public void selectionChanged(SelectionChangedEvent event) {
					IStructuredSelection xselection = (IStructuredSelection) listViewerLotes.getSelection();
					lote_Seleccionado = (String) xselection.getFirstElement();

					procesos = mfm.procesosRealizados(finca, terreno_Seleccionado, siembra_Seleccionado, lote_Seleccionado);

					grpLotesDeLa.setVisible(false);
					grpProcesosRealizadosAl.setVisible(true);

					listViewer.refresh();

					for (int i = 0; i < procesos.size(); i++) {
						listViewer.add(procesos.get(i).toString());
					}

				}
			});

			List listLotes = listViewerLotes.getList();
			listLotes.setBounds(10, 21, 239, 162);

			Button button = new Button(grpLotesDeLa, SWT.NONE);
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					grpLotesDeLa.setVisible(false);
					grpSiembrasDelTerreno.setVisible(true);
				}
			});
			button.setText("Regresar");
			button.setBounds(174, 189, 75, 25);
			toolkit.adapt(button, true, true);

			grpProcesosRealizadosAl = new Group(composite, SWT.NONE);
			grpProcesosRealizadosAl.setText("Procesos realizados al lote");
			grpProcesosRealizadosAl.setVisible(false);
			grpProcesosRealizadosAl.setBounds(10, 0, 259, 220);
			toolkit.adapt(grpProcesosRealizadosAl);
			toolkit.paintBordersFor(grpProcesosRealizadosAl);

			Button button_1 = new Button(grpProcesosRealizadosAl, SWT.NONE);
			button_1.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					grpProcesosRealizadosAl.setVisible(false);
					grpLotesDeLa.setVisible(true);
				}
			});
			button_1.setText("Regresar");
			button_1.setBounds(174, 189, 75, 25);
			toolkit.adapt(button_1, true, true);
			
			listViewer = new ListViewer(grpProcesosRealizadosAl, SWT.BORDER | SWT.V_SCROLL);
			List list = listViewer.getList();
			list.setBounds(10, 24, 239, 162);

		}

		createActions();
		initializeToolBar();
		initializeMenu();
		m_bindingContext = initDataBindings();
	}

	public void dispose() {
		toolkit.dispose();
		super.dispose();
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		IToolBarManager tbm = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager manager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		IObservableMap[] observeMaps = EMFObservables.observeMaps(listContentProvider.getKnownElements(),
				new EStructuralFeature[] { Literals.TERRENO__ID });
		listViewerTerrenos.setLabelProvider(new ObservableMapLabelProvider(observeMaps));
		listViewerTerrenos.setContentProvider(listContentProvider);
		//
		IObservableList fincaTerrenoObserveList = EMFObservables.observeList(Realm.getDefault(), finca,
				Literals.FINCA__TERRENO);
		listViewerTerrenos.setInput(fincaTerrenoObserveList);
		//
		return bindingContext;
	}
}
