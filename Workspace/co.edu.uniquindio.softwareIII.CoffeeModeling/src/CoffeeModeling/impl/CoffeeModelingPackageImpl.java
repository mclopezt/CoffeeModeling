/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.Abono;
import CoffeeModeling.Agua;
import CoffeeModeling.CoffeeModelingFactory;
import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Defecto;
import CoffeeModeling.Despulpe;
import CoffeeModeling.Empaque;
import CoffeeModeling.Empleado;
import CoffeeModeling.Fermentacion;
import CoffeeModeling.Finca;
import CoffeeModeling.Flotes;
import CoffeeModeling.Lavado;
import CoffeeModeling.Lote;
import CoffeeModeling.Molienda;
import CoffeeModeling.Proceso;
import CoffeeModeling.Procesos;
import CoffeeModeling.Recoleccion;
import CoffeeModeling.Secado;
import CoffeeModeling.Seleccion;
import CoffeeModeling.SeleccionAutomatica;
import CoffeeModeling.Siembra;
import CoffeeModeling.TipoDefectos;
import CoffeeModeling.Tostion;
import CoffeeModeling.Trilla;
import CoffeeModeling.Veneno;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoffeeModelingPackageImpl extends EPackageImpl implements CoffeeModelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fincaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siembraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abonoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass venenoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recoleccionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flotesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass despulpeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aguaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fermentacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lavadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trillaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seleccionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tostionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defectoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seleccionAutomaticaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moliendaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empaqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empleadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procesoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoDefectosEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procesosEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CoffeeModeling.CoffeeModelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CoffeeModelingPackageImpl() {
		super(eNS_URI, CoffeeModelingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CoffeeModelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CoffeeModelingPackage init() {
		if (isInited) return (CoffeeModelingPackage)EPackage.Registry.INSTANCE.getEPackage(CoffeeModelingPackage.eNS_URI);

		// Obtain or create and register package
		CoffeeModelingPackageImpl theCoffeeModelingPackage = (CoffeeModelingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CoffeeModelingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CoffeeModelingPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCoffeeModelingPackage.createPackageContents();

		// Initialize created meta-data
		theCoffeeModelingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCoffeeModelingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CoffeeModelingPackage.eNS_URI, theCoffeeModelingPackage);
		return theCoffeeModelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinca() {
		return fincaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinca_Nombre() {
		return (EAttribute)fincaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinca_Lotes() {
		return (EReference)fincaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLote() {
		return loteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLote_Id() {
		return (EAttribute)loteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLote_Latitud() {
		return (EAttribute)loteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLote_Longitud() {
		return (EAttribute)loteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLote_Altura() {
		return (EAttribute)loteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLote_Temperatura() {
		return (EAttribute)loteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLote_Peso() {
		return (EAttribute)loteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLote_Siembra() {
		return (EReference)loteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLote_Recoleccion() {
		return (EReference)loteEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLote_Flotes() {
		return (EReference)loteEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLote_Despulpe() {
		return (EReference)loteEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLote_Fermentacion() {
		return (EReference)loteEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLote_Lavado() {
		return (EReference)loteEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLote_Secado() {
		return (EReference)loteEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLote_Trilla() {
		return (EReference)loteEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLote_Seleccion() {
		return (EReference)loteEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLote_Tostion() {
		return (EReference)loteEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLote_Molienda() {
		return (EReference)loteEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLote_Empaque() {
		return (EReference)loteEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLote_Empleado() {
		return (EReference)loteEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiembra() {
		return siembraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiembra_EdadCultivo() {
		return (EAttribute)siembraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiembra_FechaInicio() {
		return (EAttribute)siembraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiembra_Variedad() {
		return (EAttribute)siembraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiembra_Abono() {
		return (EReference)siembraEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiembra_Veneno() {
		return (EReference)siembraEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiembra_AguaRiego() {
		return (EReference)siembraEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbono() {
		return abonoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbono_Nombre() {
		return (EAttribute)abonoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbono_FechaAplicado() {
		return (EAttribute)abonoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVeneno() {
		return venenoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVeneno_Nombre() {
		return (EAttribute)venenoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVeneno_FechaAplicado() {
		return (EAttribute)venenoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecoleccion() {
		return recoleccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecoleccion_Fecha() {
		return (EAttribute)recoleccionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlotes() {
		return flotesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlotes_CantGranoDefectuoso() {
		return (EAttribute)flotesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlotes_AguaUsada() {
		return (EReference)flotesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDespulpe() {
		return despulpeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDespulpe_RefMaquinaria() {
		return (EAttribute)despulpeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDespulpe_FechaUltimoMantenimiento() {
		return (EAttribute)despulpeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgua() {
		return aguaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgua_Tipo() {
		return (EAttribute)aguaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgua_Cantidad() {
		return (EAttribute)aguaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFermentacion() {
		return fermentacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFermentacion_Altitud() {
		return (EAttribute)fermentacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFermentacion_Temperatura() {
		return (EAttribute)fermentacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFermentacion_HoraSol() {
		return (EAttribute)fermentacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFermentacion_HoraSombra() {
		return (EAttribute)fermentacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLavado() {
		return lavadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLavado_Tecnica() {
		return (EAttribute)lavadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLavado_AguaUsada() {
		return (EReference)lavadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecado() {
		return secadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecado_Tipo() {
		return (EAttribute)secadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecado_HoraSol() {
		return (EAttribute)secadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecado_HoraSombra() {
		return (EAttribute)secadoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecado_HoraAlmacenamiento() {
		return (EAttribute)secadoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecado_Humedad() {
		return (EAttribute)secadoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrilla() {
		return trillaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrilla_TecnicaEmpleada() {
		return (EAttribute)trillaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrilla_Malla() {
		return (EAttribute)trillaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeleccion() {
		return seleccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeleccion_Metodo() {
		return (EAttribute)seleccionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeleccion_DiasAlmacenamiento() {
		return (EAttribute)seleccionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeleccion_Defecto() {
		return (EReference)seleccionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeleccion_Seleccionautomatica() {
		return (EReference)seleccionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTostion() {
		return tostionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTostion_Horas() {
		return (EAttribute)tostionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTostion_Temperatura() {
		return (EAttribute)tostionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTostion_RefMaquinaria() {
		return (EAttribute)tostionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTostion_FechaUltimoMantenimiento() {
		return (EAttribute)tostionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefecto() {
		return defectoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefecto_Tipo() {
		return (EAttribute)defectoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeleccionAutomatica() {
		return seleccionAutomaticaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeleccionAutomatica_RefMaquinaria() {
		return (EAttribute)seleccionAutomaticaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeleccionAutomatica_FechaUltimoMantenimiento() {
		return (EAttribute)seleccionAutomaticaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMolienda() {
		return moliendaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolienda_RefMaquinaria() {
		return (EAttribute)moliendaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMolienda_FechaUltimoMantenimiento() {
		return (EAttribute)moliendaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmpaque() {
		return empaqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpaque_Tipo() {
		return (EAttribute)empaqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpaque_Codigo() {
		return (EAttribute)empaqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmpleado() {
		return empleadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_NombreCompleto() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_TiempoExperiencia() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_Poblacion() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmpleado_ProcesoEnQueParticipa() {
		return (EReference)empleadoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProceso() {
		return procesoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProceso_NombreProceso() {
		return (EAttribute)procesoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoDefectos() {
		return tipoDefectosEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcesos() {
		return procesosEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeModelingFactory getCoffeeModelingFactory() {
		return (CoffeeModelingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fincaEClass = createEClass(FINCA);
		createEAttribute(fincaEClass, FINCA__NOMBRE);
		createEReference(fincaEClass, FINCA__LOTES);

		loteEClass = createEClass(LOTE);
		createEAttribute(loteEClass, LOTE__ID);
		createEAttribute(loteEClass, LOTE__LATITUD);
		createEAttribute(loteEClass, LOTE__LONGITUD);
		createEAttribute(loteEClass, LOTE__ALTURA);
		createEAttribute(loteEClass, LOTE__TEMPERATURA);
		createEAttribute(loteEClass, LOTE__PESO);
		createEReference(loteEClass, LOTE__SIEMBRA);
		createEReference(loteEClass, LOTE__RECOLECCION);
		createEReference(loteEClass, LOTE__FLOTES);
		createEReference(loteEClass, LOTE__DESPULPE);
		createEReference(loteEClass, LOTE__FERMENTACION);
		createEReference(loteEClass, LOTE__LAVADO);
		createEReference(loteEClass, LOTE__SECADO);
		createEReference(loteEClass, LOTE__TRILLA);
		createEReference(loteEClass, LOTE__SELECCION);
		createEReference(loteEClass, LOTE__TOSTION);
		createEReference(loteEClass, LOTE__MOLIENDA);
		createEReference(loteEClass, LOTE__EMPAQUE);
		createEReference(loteEClass, LOTE__EMPLEADO);

		siembraEClass = createEClass(SIEMBRA);
		createEAttribute(siembraEClass, SIEMBRA__EDAD_CULTIVO);
		createEAttribute(siembraEClass, SIEMBRA__FECHA_INICIO);
		createEAttribute(siembraEClass, SIEMBRA__VARIEDAD);
		createEReference(siembraEClass, SIEMBRA__ABONO);
		createEReference(siembraEClass, SIEMBRA__VENENO);
		createEReference(siembraEClass, SIEMBRA__AGUA_RIEGO);

		abonoEClass = createEClass(ABONO);
		createEAttribute(abonoEClass, ABONO__NOMBRE);
		createEAttribute(abonoEClass, ABONO__FECHA_APLICADO);

		venenoEClass = createEClass(VENENO);
		createEAttribute(venenoEClass, VENENO__NOMBRE);
		createEAttribute(venenoEClass, VENENO__FECHA_APLICADO);

		recoleccionEClass = createEClass(RECOLECCION);
		createEAttribute(recoleccionEClass, RECOLECCION__FECHA);

		flotesEClass = createEClass(FLOTES);
		createEAttribute(flotesEClass, FLOTES__CANT_GRANO_DEFECTUOSO);
		createEReference(flotesEClass, FLOTES__AGUA_USADA);

		despulpeEClass = createEClass(DESPULPE);
		createEAttribute(despulpeEClass, DESPULPE__REF_MAQUINARIA);
		createEAttribute(despulpeEClass, DESPULPE__FECHA_ULTIMO_MANTENIMIENTO);

		aguaEClass = createEClass(AGUA);
		createEAttribute(aguaEClass, AGUA__TIPO);
		createEAttribute(aguaEClass, AGUA__CANTIDAD);

		fermentacionEClass = createEClass(FERMENTACION);
		createEAttribute(fermentacionEClass, FERMENTACION__ALTITUD);
		createEAttribute(fermentacionEClass, FERMENTACION__TEMPERATURA);
		createEAttribute(fermentacionEClass, FERMENTACION__HORA_SOL);
		createEAttribute(fermentacionEClass, FERMENTACION__HORA_SOMBRA);

		lavadoEClass = createEClass(LAVADO);
		createEAttribute(lavadoEClass, LAVADO__TECNICA);
		createEReference(lavadoEClass, LAVADO__AGUA_USADA);

		secadoEClass = createEClass(SECADO);
		createEAttribute(secadoEClass, SECADO__TIPO);
		createEAttribute(secadoEClass, SECADO__HORA_SOL);
		createEAttribute(secadoEClass, SECADO__HORA_SOMBRA);
		createEAttribute(secadoEClass, SECADO__HORA_ALMACENAMIENTO);
		createEAttribute(secadoEClass, SECADO__HUMEDAD);

		trillaEClass = createEClass(TRILLA);
		createEAttribute(trillaEClass, TRILLA__TECNICA_EMPLEADA);
		createEAttribute(trillaEClass, TRILLA__MALLA);

		seleccionEClass = createEClass(SELECCION);
		createEAttribute(seleccionEClass, SELECCION__METODO);
		createEAttribute(seleccionEClass, SELECCION__DIAS_ALMACENAMIENTO);
		createEReference(seleccionEClass, SELECCION__DEFECTO);
		createEReference(seleccionEClass, SELECCION__SELECCIONAUTOMATICA);

		tostionEClass = createEClass(TOSTION);
		createEAttribute(tostionEClass, TOSTION__HORAS);
		createEAttribute(tostionEClass, TOSTION__TEMPERATURA);
		createEAttribute(tostionEClass, TOSTION__REF_MAQUINARIA);
		createEAttribute(tostionEClass, TOSTION__FECHA_ULTIMO_MANTENIMIENTO);

		defectoEClass = createEClass(DEFECTO);
		createEAttribute(defectoEClass, DEFECTO__TIPO);

		seleccionAutomaticaEClass = createEClass(SELECCION_AUTOMATICA);
		createEAttribute(seleccionAutomaticaEClass, SELECCION_AUTOMATICA__REF_MAQUINARIA);
		createEAttribute(seleccionAutomaticaEClass, SELECCION_AUTOMATICA__FECHA_ULTIMO_MANTENIMIENTO);

		moliendaEClass = createEClass(MOLIENDA);
		createEAttribute(moliendaEClass, MOLIENDA__REF_MAQUINARIA);
		createEAttribute(moliendaEClass, MOLIENDA__FECHA_ULTIMO_MANTENIMIENTO);

		empaqueEClass = createEClass(EMPAQUE);
		createEAttribute(empaqueEClass, EMPAQUE__TIPO);
		createEAttribute(empaqueEClass, EMPAQUE__CODIGO);

		empleadoEClass = createEClass(EMPLEADO);
		createEAttribute(empleadoEClass, EMPLEADO__NOMBRE_COMPLETO);
		createEAttribute(empleadoEClass, EMPLEADO__TIEMPO_EXPERIENCIA);
		createEAttribute(empleadoEClass, EMPLEADO__POBLACION);
		createEReference(empleadoEClass, EMPLEADO__PROCESO_EN_QUE_PARTICIPA);

		procesoEClass = createEClass(PROCESO);
		createEAttribute(procesoEClass, PROCESO__NOMBRE_PROCESO);

		// Create enums
		tipoDefectosEEnum = createEEnum(TIPO_DEFECTOS);
		procesosEEnum = createEEnum(PROCESOS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(fincaEClass, Finca.class, "Finca", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinca_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Finca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinca_Lotes(), this.getLote(), null, "lotes", null, 0, -1, Finca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loteEClass, Lote.class, "Lote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLote_Id(), ecorePackage.getEString(), "id", null, 0, 1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLote_Latitud(), ecorePackage.getEFloat(), "latitud", null, 0, 1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLote_Longitud(), ecorePackage.getEFloat(), "longitud", null, 0, 1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLote_Altura(), ecorePackage.getEFloat(), "altura", null, 0, 1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLote_Temperatura(), ecorePackage.getEFloat(), "temperatura", null, 0, 1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLote_Peso(), ecorePackage.getEInt(), "peso", null, 0, 1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLote_Siembra(), this.getSiembra(), null, "siembra", null, 0, -1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLote_Recoleccion(), this.getRecoleccion(), null, "recoleccion", null, 0, -1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLote_Flotes(), this.getFlotes(), null, "flotes", null, 0, -1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLote_Despulpe(), this.getDespulpe(), null, "despulpe", null, 0, -1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLote_Fermentacion(), this.getFermentacion(), null, "fermentacion", null, 0, -1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLote_Lavado(), this.getLavado(), null, "lavado", null, 0, -1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLote_Secado(), this.getSecado(), null, "secado", null, 0, -1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLote_Trilla(), this.getTrilla(), null, "trilla", null, 0, -1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLote_Seleccion(), this.getSeleccion(), null, "seleccion", null, 0, -1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLote_Tostion(), this.getTostion(), null, "tostion", null, 0, -1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLote_Molienda(), this.getMolienda(), null, "molienda", null, 0, -1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLote_Empaque(), this.getEmpaque(), null, "empaque", null, 0, -1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLote_Empleado(), this.getEmpleado(), null, "empleado", null, 0, -1, Lote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siembraEClass, Siembra.class, "Siembra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSiembra_EdadCultivo(), ecorePackage.getEInt(), "edadCultivo", null, 0, 1, Siembra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSiembra_FechaInicio(), ecorePackage.getEString(), "fechaInicio", null, 0, 1, Siembra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSiembra_Variedad(), ecorePackage.getEString(), "variedad", null, 0, 1, Siembra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSiembra_Abono(), this.getAbono(), null, "abono", null, 0, -1, Siembra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSiembra_Veneno(), this.getVeneno(), null, "veneno", null, 0, -1, Siembra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSiembra_AguaRiego(), this.getAgua(), null, "aguaRiego", null, 0, -1, Siembra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abonoEClass, Abono.class, "Abono", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbono_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Abono.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbono_FechaAplicado(), ecorePackage.getEString(), "fechaAplicado", null, 0, 1, Abono.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(venenoEClass, Veneno.class, "Veneno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVeneno_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Veneno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVeneno_FechaAplicado(), ecorePackage.getEString(), "fechaAplicado", null, 0, 1, Veneno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recoleccionEClass, Recoleccion.class, "Recoleccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecoleccion_Fecha(), ecorePackage.getEString(), "fecha", null, 0, 1, Recoleccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flotesEClass, Flotes.class, "Flotes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlotes_CantGranoDefectuoso(), ecorePackage.getEInt(), "cantGranoDefectuoso", null, 0, 1, Flotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlotes_AguaUsada(), this.getAgua(), null, "aguaUsada", null, 0, -1, Flotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(despulpeEClass, Despulpe.class, "Despulpe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDespulpe_RefMaquinaria(), ecorePackage.getEString(), "refMaquinaria", null, 0, 1, Despulpe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDespulpe_FechaUltimoMantenimiento(), ecorePackage.getEString(), "fechaUltimoMantenimiento", null, 0, 1, Despulpe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aguaEClass, Agua.class, "Agua", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgua_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Agua.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgua_Cantidad(), ecorePackage.getEFloat(), "cantidad", null, 0, 1, Agua.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fermentacionEClass, Fermentacion.class, "Fermentacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFermentacion_Altitud(), ecorePackage.getEFloat(), "altitud", null, 0, 1, Fermentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFermentacion_Temperatura(), ecorePackage.getEFloat(), "temperatura", null, 0, 1, Fermentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFermentacion_HoraSol(), ecorePackage.getEString(), "horaSol", null, 0, 1, Fermentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFermentacion_HoraSombra(), ecorePackage.getEString(), "horaSombra", null, 0, 1, Fermentacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lavadoEClass, Lavado.class, "Lavado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLavado_Tecnica(), ecorePackage.getEString(), "tecnica", null, 0, 1, Lavado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLavado_AguaUsada(), this.getAgua(), null, "aguaUsada", null, 0, -1, Lavado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secadoEClass, Secado.class, "Secado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecado_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Secado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecado_HoraSol(), ecorePackage.getEString(), "horaSol", null, 0, 1, Secado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecado_HoraSombra(), ecorePackage.getEString(), "horaSombra", null, 0, 1, Secado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecado_HoraAlmacenamiento(), ecorePackage.getEString(), "horaAlmacenamiento", null, 0, 1, Secado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecado_Humedad(), ecorePackage.getEFloat(), "humedad", null, 0, 1, Secado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trillaEClass, Trilla.class, "Trilla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrilla_TecnicaEmpleada(), ecorePackage.getEString(), "tecnicaEmpleada", null, 0, 1, Trilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrilla_Malla(), ecorePackage.getEInt(), "malla", null, 0, 1, Trilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seleccionEClass, Seleccion.class, "Seleccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeleccion_Metodo(), ecorePackage.getEString(), "metodo", null, 0, 1, Seleccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeleccion_DiasAlmacenamiento(), ecorePackage.getEInt(), "diasAlmacenamiento", null, 0, 1, Seleccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeleccion_Defecto(), this.getDefecto(), null, "defecto", null, 0, -1, Seleccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeleccion_Seleccionautomatica(), this.getSeleccionAutomatica(), null, "seleccionautomatica", null, 0, -1, Seleccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tostionEClass, Tostion.class, "Tostion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTostion_Horas(), ecorePackage.getEString(), "horas", null, 0, 1, Tostion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTostion_Temperatura(), ecorePackage.getEFloat(), "temperatura", null, 0, 1, Tostion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTostion_RefMaquinaria(), ecorePackage.getEString(), "refMaquinaria", null, 0, 1, Tostion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTostion_FechaUltimoMantenimiento(), ecorePackage.getEString(), "fechaUltimoMantenimiento", null, 0, 1, Tostion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defectoEClass, Defecto.class, "Defecto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefecto_Tipo(), this.getTipoDefectos(), "tipo", null, 0, 1, Defecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seleccionAutomaticaEClass, SeleccionAutomatica.class, "SeleccionAutomatica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeleccionAutomatica_RefMaquinaria(), ecorePackage.getEString(), "refMaquinaria", null, 0, 1, SeleccionAutomatica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeleccionAutomatica_FechaUltimoMantenimiento(), ecorePackage.getEString(), "fechaUltimoMantenimiento", null, 0, 1, SeleccionAutomatica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moliendaEClass, Molienda.class, "Molienda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolienda_RefMaquinaria(), ecorePackage.getEString(), "refMaquinaria", null, 0, 1, Molienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMolienda_FechaUltimoMantenimiento(), ecorePackage.getEString(), "fechaUltimoMantenimiento", null, 0, 1, Molienda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empaqueEClass, Empaque.class, "Empaque", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmpaque_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Empaque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpaque_Codigo(), ecorePackage.getEString(), "codigo", null, 0, 1, Empaque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empleadoEClass, Empleado.class, "Empleado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmpleado_NombreCompleto(), ecorePackage.getEString(), "nombreCompleto", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_TiempoExperiencia(), ecorePackage.getEString(), "tiempoExperiencia", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_Poblacion(), ecorePackage.getEString(), "poblacion", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmpleado_ProcesoEnQueParticipa(), this.getProceso(), null, "procesoEnQueParticipa", null, 0, -1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procesoEClass, Proceso.class, "Proceso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProceso_NombreProceso(), this.getProcesos(), "nombreProceso", null, 0, 1, Proceso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoDefectosEEnum, TipoDefectos.class, "TipoDefectos");
		addEEnumLiteral(tipoDefectosEEnum, TipoDefectos.NINGUNO);
		addEEnumLiteral(tipoDefectosEEnum, TipoDefectos.VETEADO);
		addEEnumLiteral(tipoDefectosEEnum, TipoDefectos.REPOSADO);
		addEEnumLiteral(tipoDefectosEEnum, TipoDefectos.AMBAR);
		addEEnumLiteral(tipoDefectosEEnum, TipoDefectos.MORDIDO);
		addEEnumLiteral(tipoDefectosEEnum, TipoDefectos.SOBRE_SECADO);
		addEEnumLiteral(tipoDefectosEEnum, TipoDefectos.BROCADO);
		addEEnumLiteral(tipoDefectosEEnum, TipoDefectos.AVERRANADO);
		addEEnumLiteral(tipoDefectosEEnum, TipoDefectos.INMADURO);
		addEEnumLiteral(tipoDefectosEEnum, TipoDefectos.VINAGRE);
		addEEnumLiteral(tipoDefectosEEnum, TipoDefectos.CRISTALIZADO);
		addEEnumLiteral(tipoDefectosEEnum, TipoDefectos.CARDENILLO);
		addEEnumLiteral(tipoDefectosEEnum, TipoDefectos.NEGRO);

		initEEnum(procesosEEnum, Procesos.class, "Procesos");
		addEEnumLiteral(procesosEEnum, Procesos.SIEMBRA);
		addEEnumLiteral(procesosEEnum, Procesos.RECOLECCION);
		addEEnumLiteral(procesosEEnum, Procesos.FLOTES);
		addEEnumLiteral(procesosEEnum, Procesos.FERMNTACION);
		addEEnumLiteral(procesosEEnum, Procesos.TRILLA);
		addEEnumLiteral(procesosEEnum, Procesos.LAVADO);
		addEEnumLiteral(procesosEEnum, Procesos.SECADO);
		addEEnumLiteral(procesosEEnum, Procesos.SELECCION);
		addEEnumLiteral(procesosEEnum, Procesos.EMPAQUE);

		// Create resource
		createResource(eNS_URI);
	}

} //CoffeeModelingPackageImpl
