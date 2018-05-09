package co.edu.uniquindio.softwareiii.coffeemodeling.application.model;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

import CoffeeModeling.Abono;
import CoffeeModeling.CoffeeModelingFactory;
import CoffeeModeling.Finca;
import CoffeeModeling.Lote;
import CoffeeModeling.Siembra;
import CoffeeModeling.Terreno;

public class ModelFactoryModel {
	
	Busquedas b = new Busquedas();

	
	// ------------------------------ Singleton
	// ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aquí al ser
		// protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	// ------------------------------ Singleton
	// ------------------------------------------------
	Finca modelFactory = CoffeeModelingFactory.eINSTANCE.createFinca();

	public Finca getModelFactory() {
		return modelFactory;
	}

	public void setModelFactory(Finca modelFactory) {
		this.modelFactory = modelFactory;
	}

	public ModelFactoryModel() {

		modelFactory = cargar("compras");
		salvar("tienda");
	}

	public void update() {
		modelFactory = cargar("compras");
	}

	public void salvar() {
		salvar("tienda");
	}

	public Finca cargar(final String nombre) {
		Finca modelFactory = null;
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/"
				+ "co.edu.uniquindio.softwareIII.CoffeeModeling.simulacion" + "/My.coffeemodeling");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(java.util.Collections.EMPTY_MAP);
			modelFactory = (Finca) resource.getContents().get(0);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}

		return modelFactory;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void salvar(final String nombre) {
		Finca modelFactory2 = modelFactory;

		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/"
				+ "co.edu.uniquindio.softwareIII.CoffeeModeling.simulacion" + "/My.coffeemodeling");

		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactory2);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}

		return;

	}
	
	public ArrayList <Terreno> listarTerreno(Finca f){
		ArrayList<Terreno> terrenos = new ArrayList<>();
		terrenos=  b.listarTerreno(modelFactory);
		return terrenos;
	}
	
	public ArrayList<Siembra> listarSiembrasDeUnTerreno(Finca f, Terreno t) {
		ArrayList<Siembra> siembras= new ArrayList<>();
		siembras = b.listarSiembrasDeUnTerreno(modelFactory, t);
		return siembras;
	}

	public ArrayList<Lote> listarLotesDeUnaSiembra( Finca f, Terreno t, String siembra) {
		ArrayList <Lote> lotes = new ArrayList<>();
		lotes = b.listarLotesDeUnaSiembra(modelFactory, t, siembra);
		return lotes;
	}
	
	public ArrayList<String> procesosRealizados(Finca f, Terreno t, String siembra, String lote) {
		ArrayList<String> procesos = new ArrayList<>();
		procesos =  b.procesosRealizados(modelFactory, t, siembra, lote);
		return procesos;
	}
}
