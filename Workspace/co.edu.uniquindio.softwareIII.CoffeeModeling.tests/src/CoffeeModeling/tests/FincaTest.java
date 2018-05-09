package CoffeeModeling.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import CoffeeModeling.Abono;
import CoffeeModeling.Agua;
import CoffeeModeling.CoffeeModelingFactory;
import CoffeeModeling.Despulpe;
import CoffeeModeling.Empaque;
import CoffeeModeling.Empleado;
import CoffeeModeling.Fermentacion;
import CoffeeModeling.Finca;
import CoffeeModeling.Flotes;
import CoffeeModeling.Lavado;
import CoffeeModeling.Lote;
import CoffeeModeling.Molienda;
import CoffeeModeling.Recoleccion;
import CoffeeModeling.Secado;
import CoffeeModeling.Seleccion;
import CoffeeModeling.Siembra;
import CoffeeModeling.Terreno;
import CoffeeModeling.Tostion;
import CoffeeModeling.Trilla;
import CoffeeModeling.Veneno;
import co.edu.uniquindio.softwareiii.coffeemodeling.application.model.Busquedas;
import co.edu.uniquindio.softwareiii.coffeemodeling.application.model.ModelFactoryModel;

public class FincaTest {

	Finca finca;
	Terreno terreno;
	Siembra siembra;
	Lote lote;
	Veneno veneno;
	Abono abono;
	Agua agua;
	Recoleccion recoleccion;
	Flotes flote;
	Despulpe despulpe;
	Fermentacion fermentacion;
	Lavado lavado;
	Secado secado;
	Trilla trilla;
	Seleccion seleccion;
	Tostion tostion;
	Molienda molienda;
	Empaque empaque;
	Empleado empleado;
	Busquedas b;

	@Test
	public void testInsert() {

		finca = CoffeeModelingFactory.eINSTANCE.createFinca();
		b = new Busquedas();

		finca.setNombre("La Granja");

		String id[] = { "Terreno 1, Terreno 2" };
		float altura[] = { 19, 22 };
		float latitud[] = { 3, 22 };
		float longitud[] = { 1, 66 };
		float temperatura[] = { 2, 11 };

		for (int i = 0; i < id.length; i++) {
			terreno = CoffeeModelingFactory.eINSTANCE.createTerreno();
			terreno.setId(id[i]);
			terreno.setAltura(altura[i]);
			terreno.setLatitud(latitud[i]);
			terreno.setLongitud(longitud[i]);
			terreno.setTemperatura(temperatura[i]);

			finca.getTerreno().add(terreno);
		}

		String idS[] = { "Siembra 1, Siembra 2" };
		String fecha[] = { "Mayo 1", "Mayo 15" };
		String variedad[] = { "Variedad 1", "Variedad 2" };
		int edad[] = { 1, 2 };

		for (int i = 0; i < idS.length; i++) {
			siembra = CoffeeModelingFactory.eINSTANCE.createSiembra();

			siembra.setId(idS[i]);
			siembra.setEdadCultivo(edad[i]);
			siembra.setFechaInicio(fecha[i]);
			siembra.setVariedad(variedad[i]);

			finca.getTerreno().get(0).getSiembra().add(siembra);
		}

		String idL[] = { "Lote 1", "Lote 2" };
		int peso[] = { 12, 14 };

		for (int i = 0; i < idL.length; i++) {
			lote = CoffeeModelingFactory.eINSTANCE.createLote();

			lote.setId(idL[i]);
			lote.setFechaFin(fecha[i]);
			lote.setFechaInicio(fecha[i]);
			lote.setPeso(peso[i]);

			finca.getTerreno().get(0).getSiembra().get(0).getLotes().add(lote);

		}

		String idR[] = { "Recoleccion 1", "Recoleccion 2" };

		for (int i = 0; i < idR.length; i++) {
			recoleccion = CoffeeModelingFactory.eINSTANCE.createRecoleccion();

			recoleccion.setId(idR[i]);
			recoleccion.setFecha(fecha[i]);

			finca.getTerreno().get(0).getSiembra().get(0).getLotes().get(i).setRecoleccion(recoleccion);

		}

		String idF[] = { "Flote 1", "Flote 2" };
		int contGranos[] = { 100, 166 };

		for (int i = 0; i < idR.length; i++) {
			flote = CoffeeModelingFactory.eINSTANCE.createFlotes();

			flote.setId(idR[i]);
			flote.setCantGranoDefectuoso(contGranos[i]);

			finca.getTerreno().get(0).getSiembra().get(0).getLotes().get(i).setFlotes(flote);

		}

		String idD[] = { "Despulpe 1", "Despulpe 2" };
		String ref[] = { "Ref 1", "Ref 2" };

		for (int i = 0; i < idR.length; i++) {
			despulpe = CoffeeModelingFactory.eINSTANCE.createDespulpe();

			despulpe.setId(idD[i]);
			despulpe.setFechaUltimoMantenimiento(fecha[i]);
			despulpe.setRefMaquinaria(ref[i]);

			finca.getTerreno().get(0).getSiembra().get(0).getLotes().get(i).setDespulpe(despulpe);

		}

		ArrayList<Terreno> terrenos = new ArrayList<>();

		terrenos = b.listarTerreno(finca);

		assertEquals(terrenos.size(), 1);

		ArrayList<Siembra> siembras = new ArrayList<>();

		siembras = b.listarSiembrasDeUnTerreno(finca, terreno);

		assertEquals(siembras.size(), 1);

		ArrayList<Lote> lotes = new ArrayList<>();

		lotes = b.listarLotesDeUnaSiembra(finca, terreno, siembra.getId());

		assertEquals(lotes.size(), 2);
	}
}
