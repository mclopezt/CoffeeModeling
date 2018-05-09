/**
 */
package CoffeeModeling.util;

import CoffeeModeling.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CoffeeModeling.CoffeeModelingPackage
 * @generated
 */
public class CoffeeModelingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoffeeModelingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeModelingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CoffeeModelingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoffeeModelingSwitch<Adapter> modelSwitch =
		new CoffeeModelingSwitch<Adapter>() {
			@Override
			public Adapter caseFinca(Finca object) {
				return createFincaAdapter();
			}
			@Override
			public Adapter caseLote(Lote object) {
				return createLoteAdapter();
			}
			@Override
			public Adapter caseSiembra(Siembra object) {
				return createSiembraAdapter();
			}
			@Override
			public Adapter caseAbono(Abono object) {
				return createAbonoAdapter();
			}
			@Override
			public Adapter caseVeneno(Veneno object) {
				return createVenenoAdapter();
			}
			@Override
			public Adapter caseRecoleccion(Recoleccion object) {
				return createRecoleccionAdapter();
			}
			@Override
			public Adapter caseFlotes(Flotes object) {
				return createFlotesAdapter();
			}
			@Override
			public Adapter caseDespulpe(Despulpe object) {
				return createDespulpeAdapter();
			}
			@Override
			public Adapter caseAgua(Agua object) {
				return createAguaAdapter();
			}
			@Override
			public Adapter caseFermentacion(Fermentacion object) {
				return createFermentacionAdapter();
			}
			@Override
			public Adapter caseLavado(Lavado object) {
				return createLavadoAdapter();
			}
			@Override
			public Adapter caseSecado(Secado object) {
				return createSecadoAdapter();
			}
			@Override
			public Adapter caseTrilla(Trilla object) {
				return createTrillaAdapter();
			}
			@Override
			public Adapter caseSeleccion(Seleccion object) {
				return createSeleccionAdapter();
			}
			@Override
			public Adapter caseTostion(Tostion object) {
				return createTostionAdapter();
			}
			@Override
			public Adapter caseDefecto(Defecto object) {
				return createDefectoAdapter();
			}
			@Override
			public Adapter caseSeleccionAutomatica(SeleccionAutomatica object) {
				return createSeleccionAutomaticaAdapter();
			}
			@Override
			public Adapter caseMolienda(Molienda object) {
				return createMoliendaAdapter();
			}
			@Override
			public Adapter caseEmpaque(Empaque object) {
				return createEmpaqueAdapter();
			}
			@Override
			public Adapter caseEmpleado(Empleado object) {
				return createEmpleadoAdapter();
			}
			@Override
			public Adapter caseProceso(Proceso object) {
				return createProcesoAdapter();
			}
			@Override
			public Adapter caseTerreno(Terreno object) {
				return createTerrenoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Finca <em>Finca</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Finca
	 * @generated
	 */
	public Adapter createFincaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Lote <em>Lote</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Lote
	 * @generated
	 */
	public Adapter createLoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Siembra <em>Siembra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Siembra
	 * @generated
	 */
	public Adapter createSiembraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Abono <em>Abono</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Abono
	 * @generated
	 */
	public Adapter createAbonoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Veneno <em>Veneno</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Veneno
	 * @generated
	 */
	public Adapter createVenenoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Recoleccion <em>Recoleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Recoleccion
	 * @generated
	 */
	public Adapter createRecoleccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Flotes <em>Flotes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Flotes
	 * @generated
	 */
	public Adapter createFlotesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Despulpe <em>Despulpe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Despulpe
	 * @generated
	 */
	public Adapter createDespulpeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Agua <em>Agua</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Agua
	 * @generated
	 */
	public Adapter createAguaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Fermentacion <em>Fermentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Fermentacion
	 * @generated
	 */
	public Adapter createFermentacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Lavado <em>Lavado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Lavado
	 * @generated
	 */
	public Adapter createLavadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Secado <em>Secado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Secado
	 * @generated
	 */
	public Adapter createSecadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Trilla <em>Trilla</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Trilla
	 * @generated
	 */
	public Adapter createTrillaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Seleccion <em>Seleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Seleccion
	 * @generated
	 */
	public Adapter createSeleccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Tostion <em>Tostion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Tostion
	 * @generated
	 */
	public Adapter createTostionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Defecto <em>Defecto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Defecto
	 * @generated
	 */
	public Adapter createDefectoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.SeleccionAutomatica <em>Seleccion Automatica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.SeleccionAutomatica
	 * @generated
	 */
	public Adapter createSeleccionAutomaticaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Molienda <em>Molienda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Molienda
	 * @generated
	 */
	public Adapter createMoliendaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Empaque <em>Empaque</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Empaque
	 * @generated
	 */
	public Adapter createEmpaqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Empleado <em>Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Empleado
	 * @generated
	 */
	public Adapter createEmpleadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Proceso <em>Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Proceso
	 * @generated
	 */
	public Adapter createProcesoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CoffeeModeling.Terreno <em>Terreno</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CoffeeModeling.Terreno
	 * @generated
	 */
	public Adapter createTerrenoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CoffeeModelingAdapterFactory
