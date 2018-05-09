package co.edu.uniquindio.softwareiii.coffeemodeling.application.model;

import java.util.ArrayList;

import CoffeeModeling.CoffeeModelingFactory;
import CoffeeModeling.Finca;
import CoffeeModeling.Lote;
import CoffeeModeling.Siembra;
import CoffeeModeling.Terreno;

public class Busquedas {
	
	Finca finca;
	
	public ArrayList <Terreno> listarTerreno(Finca f){
		
		finca = f;
		ArrayList<Terreno> terrenos = new ArrayList<>();
		
		for (int i = 0; i < f.getTerreno().size(); i++) {
			terrenos.add(f.getTerreno().get(i));
		}
	
		
		return terrenos;
	}
		

	public ArrayList<Siembra> listarSiembrasDeUnTerreno(Finca f, Terreno t) {

		ArrayList<Siembra> siembras = new ArrayList<Siembra>();

		for (int i = 0; i < f.getTerreno().size(); i++) {
			if (f.getTerreno().get(i).equals(t)) {
				siembras.addAll(f.getTerreno().get(i).getSiembra());
			}
		}
		return siembras;
	}

	public ArrayList<Lote> listarLotesDeUnaSiembra(Finca f, Terreno t, String siembra) {

		ArrayList<Lote> lotes = new ArrayList<Lote>();
		Terreno t1 = null;
		Siembra s1 = null;

		for (int i = 0; i < f.getTerreno().size(); i++) {
			if (f.getTerreno().get(i).equals(t)) {

				t1 = f.getTerreno().get(i);
			}
		}
		for (int i = 0; i < t1.getSiembra().size(); i++) {
			if (t1.getSiembra().get(i).getId().equals(siembra)) {

				s1 = t1.getSiembra().get(i);

			}
		}

		lotes.addAll(s1.getLotes());
		return lotes;
	}

	public ArrayList<String> procesosRealizados(Finca f, Terreno t, String siembra, String lote) {
		ArrayList<String> procesos = new ArrayList<String>();
		Terreno t1 = null;
		Siembra s1 = null;
		Lote l1 = null;

		for (int i = 0; i < f.getTerreno().size(); i++) {
			if (f.getTerreno().get(i).equals(t)) {

				t1 = f.getTerreno().get(i);
			}
		}
		for (int i = 0; i < t1.getSiembra().size(); i++) {
			if (t1.getSiembra().get(i).getId().equals(siembra)) {

				s1 = t1.getSiembra().get(i);

			}
		}

		for (int i = 0; i < s1.getLotes().size(); i++) {
			if (s1.getLotes().get(i).getId().equals(lote)) {

				l1 = s1.getLotes().get(i);

			}
		}

		if (!(l1.getRecoleccion()==null)) {
			procesos.add("Recoleción");
		}

		if (!(l1.getFlotes()==null)) {
			procesos.add("Flotado");
		}

		if (!(l1.getDespulpe()==null)) {
			procesos.add("Despulpado");
		}

		if (!(l1.getFermentacion()==null)) {
			procesos.add("Fermentado");
		}

		if (!(l1.getLavado()==null)) {
			procesos.add("Lavado");
		}

		if (!(l1.getSecado()==null)) {
			procesos.add("Secado");
		}

		if (!(l1.getTrilla()==null)) {
			procesos.add("Trillado");
		}

		if (!(l1.getSeleccion()==null)) {
			procesos.add("Seleccionado");
		}

		if (!(l1.getTostion()==null)) {
			procesos.add("Tostado");
		}

		if (!(l1.getMolienda()==null)) {
			procesos.add("Molido");
		}

		if (!(l1.getEmpaque()==null)) {
			procesos.add("Empacado");
		}

		int contAbono = 1;

		for (int j = 0; j < s1.getAbono().size(); j++) {
			if (s1.getAbono().get(j).getLoteRelacionado() != null) {
				if (s1.getAbono().get(j).getLoteRelacionado().equals(l1)) {
					procesos.add("Abonado: Vez numero: " + contAbono);
					contAbono++;
				}
			}
		}

		int contVeneno = 1;

		for (int i = 0; i < s1.getVeneno().size(); i++) {
			if (s1.getVeneno().get(i).getLoteRelacionado() != null) {
				if (s1.getVeneno().get(i).getLoteRelacionado().equals(l1)) {
					procesos.add("Fumigado: Vez numero: " + contVeneno);
					contVeneno++;
				}
			}
		}

		int contRiego = 1;

		for (int i = 0; i < s1.getAguaRiego().size(); i++) {
			if (s1.getAguaRiego().get(i).getLoteRelacionado() != null) {
				if (s1.getAguaRiego().get(i).getLoteRelacionado().equals(l1)) {
					procesos.add("Regado: Vez numero: " + contVeneno);
					contRiego++;
				}
			}
		}

		return procesos;
	}
}
