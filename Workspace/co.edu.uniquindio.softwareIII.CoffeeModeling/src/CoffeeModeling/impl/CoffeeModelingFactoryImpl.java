/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoffeeModelingFactoryImpl extends EFactoryImpl implements CoffeeModelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoffeeModelingFactory init() {
		try {
			CoffeeModelingFactory theCoffeeModelingFactory = (CoffeeModelingFactory)EPackage.Registry.INSTANCE.getEFactory(CoffeeModelingPackage.eNS_URI);
			if (theCoffeeModelingFactory != null) {
				return theCoffeeModelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoffeeModelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeModelingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CoffeeModelingPackage.FINCA: return createFinca();
			case CoffeeModelingPackage.LOTE: return createLote();
			case CoffeeModelingPackage.SIEMBRA: return createSiembra();
			case CoffeeModelingPackage.ABONO: return createAbono();
			case CoffeeModelingPackage.VENENO: return createVeneno();
			case CoffeeModelingPackage.RECOLECCION: return createRecoleccion();
			case CoffeeModelingPackage.FLOTES: return createFlotes();
			case CoffeeModelingPackage.DESPULPE: return createDespulpe();
			case CoffeeModelingPackage.AGUA: return createAgua();
			case CoffeeModelingPackage.FERMENTACION: return createFermentacion();
			case CoffeeModelingPackage.LAVADO: return createLavado();
			case CoffeeModelingPackage.SECADO: return createSecado();
			case CoffeeModelingPackage.TRILLA: return createTrilla();
			case CoffeeModelingPackage.SELECCION: return createSeleccion();
			case CoffeeModelingPackage.TOSTION: return createTostion();
			case CoffeeModelingPackage.DEFECTO: return createDefecto();
			case CoffeeModelingPackage.SELECCION_AUTOMATICA: return createSeleccionAutomatica();
			case CoffeeModelingPackage.MOLIENDA: return createMolienda();
			case CoffeeModelingPackage.EMPAQUE: return createEmpaque();
			case CoffeeModelingPackage.EMPLEADO: return createEmpleado();
			case CoffeeModelingPackage.PROCESO: return createProceso();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CoffeeModelingPackage.TIPO_DEFECTOS:
				return createTipoDefectosFromString(eDataType, initialValue);
			case CoffeeModelingPackage.PROCESOS:
				return createProcesosFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CoffeeModelingPackage.TIPO_DEFECTOS:
				return convertTipoDefectosToString(eDataType, instanceValue);
			case CoffeeModelingPackage.PROCESOS:
				return convertProcesosToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Finca createFinca() {
		FincaImpl finca = new FincaImpl();
		return finca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lote createLote() {
		LoteImpl lote = new LoteImpl();
		return lote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Siembra createSiembra() {
		SiembraImpl siembra = new SiembraImpl();
		return siembra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abono createAbono() {
		AbonoImpl abono = new AbonoImpl();
		return abono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Veneno createVeneno() {
		VenenoImpl veneno = new VenenoImpl();
		return veneno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recoleccion createRecoleccion() {
		RecoleccionImpl recoleccion = new RecoleccionImpl();
		return recoleccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flotes createFlotes() {
		FlotesImpl flotes = new FlotesImpl();
		return flotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Despulpe createDespulpe() {
		DespulpeImpl despulpe = new DespulpeImpl();
		return despulpe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agua createAgua() {
		AguaImpl agua = new AguaImpl();
		return agua;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fermentacion createFermentacion() {
		FermentacionImpl fermentacion = new FermentacionImpl();
		return fermentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lavado createLavado() {
		LavadoImpl lavado = new LavadoImpl();
		return lavado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secado createSecado() {
		SecadoImpl secado = new SecadoImpl();
		return secado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trilla createTrilla() {
		TrillaImpl trilla = new TrillaImpl();
		return trilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seleccion createSeleccion() {
		SeleccionImpl seleccion = new SeleccionImpl();
		return seleccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tostion createTostion() {
		TostionImpl tostion = new TostionImpl();
		return tostion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Defecto createDefecto() {
		DefectoImpl defecto = new DefectoImpl();
		return defecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeleccionAutomatica createSeleccionAutomatica() {
		SeleccionAutomaticaImpl seleccionAutomatica = new SeleccionAutomaticaImpl();
		return seleccionAutomatica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Molienda createMolienda() {
		MoliendaImpl molienda = new MoliendaImpl();
		return molienda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empaque createEmpaque() {
		EmpaqueImpl empaque = new EmpaqueImpl();
		return empaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empleado createEmpleado() {
		EmpleadoImpl empleado = new EmpleadoImpl();
		return empleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proceso createProceso() {
		ProcesoImpl proceso = new ProcesoImpl();
		return proceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDefectos createTipoDefectosFromString(EDataType eDataType, String initialValue) {
		TipoDefectos result = TipoDefectos.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoDefectosToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procesos createProcesosFromString(EDataType eDataType, String initialValue) {
		Procesos result = Procesos.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcesosToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeModelingPackage getCoffeeModelingPackage() {
		return (CoffeeModelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoffeeModelingPackage getPackage() {
		return CoffeeModelingPackage.eINSTANCE;
	}

} //CoffeeModelingFactoryImpl
