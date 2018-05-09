/**
 */
package CoffeeModeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CoffeeModeling.CoffeeModelingFactory
 * @model kind="package"
 * @generated
 */
public interface CoffeeModelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CoffeeModeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/CoffeeModeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CoffeeModeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoffeeModelingPackage eINSTANCE = CoffeeModeling.impl.CoffeeModelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.FincaImpl <em>Finca</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.FincaImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getFinca()
	 * @generated
	 */
	int FINCA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINCA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Lotes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINCA__LOTES = 1;

	/**
	 * The number of structural features of the '<em>Finca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINCA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Finca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINCA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.LoteImpl <em>Lote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.LoteImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getLote()
	 * @generated
	 */
	int LOTE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__ID = 0;

	/**
	 * The feature id for the '<em><b>Latitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__LATITUD = 1;

	/**
	 * The feature id for the '<em><b>Longitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__LONGITUD = 2;

	/**
	 * The feature id for the '<em><b>Altura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__ALTURA = 3;

	/**
	 * The feature id for the '<em><b>Temperatura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__TEMPERATURA = 4;

	/**
	 * The feature id for the '<em><b>Peso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__PESO = 5;

	/**
	 * The feature id for the '<em><b>Siembra</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__SIEMBRA = 6;

	/**
	 * The feature id for the '<em><b>Recoleccion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__RECOLECCION = 7;

	/**
	 * The feature id for the '<em><b>Flotes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__FLOTES = 8;

	/**
	 * The feature id for the '<em><b>Despulpe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__DESPULPE = 9;

	/**
	 * The feature id for the '<em><b>Fermentacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__FERMENTACION = 10;

	/**
	 * The feature id for the '<em><b>Lavado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__LAVADO = 11;

	/**
	 * The feature id for the '<em><b>Secado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__SECADO = 12;

	/**
	 * The feature id for the '<em><b>Trilla</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__TRILLA = 13;

	/**
	 * The feature id for the '<em><b>Seleccion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__SELECCION = 14;

	/**
	 * The feature id for the '<em><b>Tostion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__TOSTION = 15;

	/**
	 * The feature id for the '<em><b>Molienda</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__MOLIENDA = 16;

	/**
	 * The feature id for the '<em><b>Empaque</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__EMPAQUE = 17;

	/**
	 * The feature id for the '<em><b>Empleado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE__EMPLEADO = 18;

	/**
	 * The number of structural features of the '<em>Lote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Lote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.SiembraImpl <em>Siembra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.SiembraImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getSiembra()
	 * @generated
	 */
	int SIEMBRA = 2;

	/**
	 * The feature id for the '<em><b>Edad Cultivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEMBRA__EDAD_CULTIVO = 0;

	/**
	 * The feature id for the '<em><b>Fecha Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEMBRA__FECHA_INICIO = 1;

	/**
	 * The feature id for the '<em><b>Variedad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEMBRA__VARIEDAD = 2;

	/**
	 * The feature id for the '<em><b>Abono</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEMBRA__ABONO = 3;

	/**
	 * The feature id for the '<em><b>Veneno</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEMBRA__VENENO = 4;

	/**
	 * The feature id for the '<em><b>Agua Riego</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEMBRA__AGUA_RIEGO = 5;

	/**
	 * The number of structural features of the '<em>Siembra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEMBRA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Siembra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIEMBRA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.AbonoImpl <em>Abono</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.AbonoImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getAbono()
	 * @generated
	 */
	int ABONO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABONO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Fecha Aplicado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABONO__FECHA_APLICADO = 1;

	/**
	 * The number of structural features of the '<em>Abono</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABONO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abono</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABONO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.VenenoImpl <em>Veneno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.VenenoImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getVeneno()
	 * @generated
	 */
	int VENENO = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENENO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Fecha Aplicado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENENO__FECHA_APLICADO = 1;

	/**
	 * The number of structural features of the '<em>Veneno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENENO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Veneno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENENO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.RecoleccionImpl <em>Recoleccion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.RecoleccionImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getRecoleccion()
	 * @generated
	 */
	int RECOLECCION = 5;

	/**
	 * The feature id for the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOLECCION__FECHA = 0;

	/**
	 * The number of structural features of the '<em>Recoleccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOLECCION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Recoleccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOLECCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.FlotesImpl <em>Flotes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.FlotesImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getFlotes()
	 * @generated
	 */
	int FLOTES = 6;

	/**
	 * The feature id for the '<em><b>Cant Grano Defectuoso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOTES__CANT_GRANO_DEFECTUOSO = 0;

	/**
	 * The feature id for the '<em><b>Agua Usada</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOTES__AGUA_USADA = 1;

	/**
	 * The number of structural features of the '<em>Flotes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flotes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.DespulpeImpl <em>Despulpe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.DespulpeImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getDespulpe()
	 * @generated
	 */
	int DESPULPE = 7;

	/**
	 * The feature id for the '<em><b>Ref Maquinaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESPULPE__REF_MAQUINARIA = 0;

	/**
	 * The feature id for the '<em><b>Fecha Ultimo Mantenimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESPULPE__FECHA_ULTIMO_MANTENIMIENTO = 1;

	/**
	 * The number of structural features of the '<em>Despulpe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESPULPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Despulpe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESPULPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.AguaImpl <em>Agua</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.AguaImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getAgua()
	 * @generated
	 */
	int AGUA = 8;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGUA__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Cantidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGUA__CANTIDAD = 1;

	/**
	 * The number of structural features of the '<em>Agua</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGUA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Agua</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGUA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.FermentacionImpl <em>Fermentacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.FermentacionImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getFermentacion()
	 * @generated
	 */
	int FERMENTACION = 9;

	/**
	 * The feature id for the '<em><b>Altitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FERMENTACION__ALTITUD = 0;

	/**
	 * The feature id for the '<em><b>Temperatura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FERMENTACION__TEMPERATURA = 1;

	/**
	 * The feature id for the '<em><b>Hora Sol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FERMENTACION__HORA_SOL = 2;

	/**
	 * The feature id for the '<em><b>Hora Sombra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FERMENTACION__HORA_SOMBRA = 3;

	/**
	 * The number of structural features of the '<em>Fermentacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FERMENTACION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fermentacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FERMENTACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.LavadoImpl <em>Lavado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.LavadoImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getLavado()
	 * @generated
	 */
	int LAVADO = 10;

	/**
	 * The feature id for the '<em><b>Tecnica</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVADO__TECNICA = 0;

	/**
	 * The feature id for the '<em><b>Agua Usada</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVADO__AGUA_USADA = 1;

	/**
	 * The number of structural features of the '<em>Lavado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVADO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lavado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVADO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.SecadoImpl <em>Secado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.SecadoImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getSecado()
	 * @generated
	 */
	int SECADO = 11;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECADO__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Hora Sol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECADO__HORA_SOL = 1;

	/**
	 * The feature id for the '<em><b>Hora Sombra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECADO__HORA_SOMBRA = 2;

	/**
	 * The feature id for the '<em><b>Hora Almacenamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECADO__HORA_ALMACENAMIENTO = 3;

	/**
	 * The feature id for the '<em><b>Humedad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECADO__HUMEDAD = 4;

	/**
	 * The number of structural features of the '<em>Secado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECADO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Secado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECADO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.TrillaImpl <em>Trilla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.TrillaImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getTrilla()
	 * @generated
	 */
	int TRILLA = 12;

	/**
	 * The feature id for the '<em><b>Tecnica Empleada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRILLA__TECNICA_EMPLEADA = 0;

	/**
	 * The feature id for the '<em><b>Malla</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRILLA__MALLA = 1;

	/**
	 * The number of structural features of the '<em>Trilla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRILLA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trilla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRILLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.SeleccionImpl <em>Seleccion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.SeleccionImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getSeleccion()
	 * @generated
	 */
	int SELECCION = 13;

	/**
	 * The feature id for the '<em><b>Metodo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECCION__METODO = 0;

	/**
	 * The feature id for the '<em><b>Dias Almacenamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECCION__DIAS_ALMACENAMIENTO = 1;

	/**
	 * The feature id for the '<em><b>Defecto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECCION__DEFECTO = 2;

	/**
	 * The feature id for the '<em><b>Seleccionautomatica</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECCION__SELECCIONAUTOMATICA = 3;

	/**
	 * The number of structural features of the '<em>Seleccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECCION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Seleccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.TostionImpl <em>Tostion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.TostionImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getTostion()
	 * @generated
	 */
	int TOSTION = 14;

	/**
	 * The feature id for the '<em><b>Horas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSTION__HORAS = 0;

	/**
	 * The feature id for the '<em><b>Temperatura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSTION__TEMPERATURA = 1;

	/**
	 * The feature id for the '<em><b>Ref Maquinaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSTION__REF_MAQUINARIA = 2;

	/**
	 * The feature id for the '<em><b>Fecha Ultimo Mantenimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSTION__FECHA_ULTIMO_MANTENIMIENTO = 3;

	/**
	 * The number of structural features of the '<em>Tostion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tostion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.DefectoImpl <em>Defecto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.DefectoImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getDefecto()
	 * @generated
	 */
	int DEFECTO = 15;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFECTO__TIPO = 0;

	/**
	 * The number of structural features of the '<em>Defecto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFECTO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Defecto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFECTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.SeleccionAutomaticaImpl <em>Seleccion Automatica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.SeleccionAutomaticaImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getSeleccionAutomatica()
	 * @generated
	 */
	int SELECCION_AUTOMATICA = 16;

	/**
	 * The feature id for the '<em><b>Ref Maquinaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECCION_AUTOMATICA__REF_MAQUINARIA = 0;

	/**
	 * The feature id for the '<em><b>Fecha Ultimo Mantenimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECCION_AUTOMATICA__FECHA_ULTIMO_MANTENIMIENTO = 1;

	/**
	 * The number of structural features of the '<em>Seleccion Automatica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECCION_AUTOMATICA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Seleccion Automatica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECCION_AUTOMATICA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.MoliendaImpl <em>Molienda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.MoliendaImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getMolienda()
	 * @generated
	 */
	int MOLIENDA = 17;

	/**
	 * The feature id for the '<em><b>Ref Maquinaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLIENDA__REF_MAQUINARIA = 0;

	/**
	 * The feature id for the '<em><b>Fecha Ultimo Mantenimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLIENDA__FECHA_ULTIMO_MANTENIMIENTO = 1;

	/**
	 * The number of structural features of the '<em>Molienda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLIENDA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Molienda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLIENDA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.EmpaqueImpl <em>Empaque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.EmpaqueImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getEmpaque()
	 * @generated
	 */
	int EMPAQUE = 18;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPAQUE__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPAQUE__CODIGO = 1;

	/**
	 * The number of structural features of the '<em>Empaque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPAQUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Empaque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPAQUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.EmpleadoImpl <em>Empleado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.EmpleadoImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getEmpleado()
	 * @generated
	 */
	int EMPLEADO = 19;

	/**
	 * The feature id for the '<em><b>Nombre Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__NOMBRE_COMPLETO = 0;

	/**
	 * The feature id for the '<em><b>Tiempo Experiencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__TIEMPO_EXPERIENCIA = 1;

	/**
	 * The feature id for the '<em><b>Poblacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__POBLACION = 2;

	/**
	 * The feature id for the '<em><b>Proceso En Que Participa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__PROCESO_EN_QUE_PARTICIPA = 3;

	/**
	 * The number of structural features of the '<em>Empleado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Empleado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.ProcesoImpl <em>Proceso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.ProcesoImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getProceso()
	 * @generated
	 */
	int PROCESO = 20;

	/**
	 * The feature id for the '<em><b>Nombre Proceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO__NOMBRE_PROCESO = 0;

	/**
	 * The number of structural features of the '<em>Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Proceso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.TipoDefectos <em>Tipo Defectos</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.TipoDefectos
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getTipoDefectos()
	 * @generated
	 */
	int TIPO_DEFECTOS = 21;

	/**
	 * The meta object id for the '{@link CoffeeModeling.Procesos <em>Procesos</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.Procesos
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getProcesos()
	 * @generated
	 */
	int PROCESOS = 22;


	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Finca <em>Finca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finca</em>'.
	 * @see CoffeeModeling.Finca
	 * @generated
	 */
	EClass getFinca();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Finca#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see CoffeeModeling.Finca#getNombre()
	 * @see #getFinca()
	 * @generated
	 */
	EAttribute getFinca_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Finca#getLotes <em>Lotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lotes</em>'.
	 * @see CoffeeModeling.Finca#getLotes()
	 * @see #getFinca()
	 * @generated
	 */
	EReference getFinca_Lotes();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Lote <em>Lote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lote</em>'.
	 * @see CoffeeModeling.Lote
	 * @generated
	 */
	EClass getLote();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Lote#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see CoffeeModeling.Lote#getId()
	 * @see #getLote()
	 * @generated
	 */
	EAttribute getLote_Id();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Lote#getLatitud <em>Latitud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitud</em>'.
	 * @see CoffeeModeling.Lote#getLatitud()
	 * @see #getLote()
	 * @generated
	 */
	EAttribute getLote_Latitud();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Lote#getLongitud <em>Longitud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitud</em>'.
	 * @see CoffeeModeling.Lote#getLongitud()
	 * @see #getLote()
	 * @generated
	 */
	EAttribute getLote_Longitud();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Lote#getAltura <em>Altura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altura</em>'.
	 * @see CoffeeModeling.Lote#getAltura()
	 * @see #getLote()
	 * @generated
	 */
	EAttribute getLote_Altura();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Lote#getTemperatura <em>Temperatura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperatura</em>'.
	 * @see CoffeeModeling.Lote#getTemperatura()
	 * @see #getLote()
	 * @generated
	 */
	EAttribute getLote_Temperatura();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Lote#getPeso <em>Peso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peso</em>'.
	 * @see CoffeeModeling.Lote#getPeso()
	 * @see #getLote()
	 * @generated
	 */
	EAttribute getLote_Peso();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lote#getSiembra <em>Siembra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Siembra</em>'.
	 * @see CoffeeModeling.Lote#getSiembra()
	 * @see #getLote()
	 * @generated
	 */
	EReference getLote_Siembra();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lote#getRecoleccion <em>Recoleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recoleccion</em>'.
	 * @see CoffeeModeling.Lote#getRecoleccion()
	 * @see #getLote()
	 * @generated
	 */
	EReference getLote_Recoleccion();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lote#getFlotes <em>Flotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flotes</em>'.
	 * @see CoffeeModeling.Lote#getFlotes()
	 * @see #getLote()
	 * @generated
	 */
	EReference getLote_Flotes();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lote#getDespulpe <em>Despulpe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Despulpe</em>'.
	 * @see CoffeeModeling.Lote#getDespulpe()
	 * @see #getLote()
	 * @generated
	 */
	EReference getLote_Despulpe();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lote#getFermentacion <em>Fermentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fermentacion</em>'.
	 * @see CoffeeModeling.Lote#getFermentacion()
	 * @see #getLote()
	 * @generated
	 */
	EReference getLote_Fermentacion();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lote#getLavado <em>Lavado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lavado</em>'.
	 * @see CoffeeModeling.Lote#getLavado()
	 * @see #getLote()
	 * @generated
	 */
	EReference getLote_Lavado();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lote#getSecado <em>Secado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secado</em>'.
	 * @see CoffeeModeling.Lote#getSecado()
	 * @see #getLote()
	 * @generated
	 */
	EReference getLote_Secado();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lote#getTrilla <em>Trilla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trilla</em>'.
	 * @see CoffeeModeling.Lote#getTrilla()
	 * @see #getLote()
	 * @generated
	 */
	EReference getLote_Trilla();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lote#getSeleccion <em>Seleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seleccion</em>'.
	 * @see CoffeeModeling.Lote#getSeleccion()
	 * @see #getLote()
	 * @generated
	 */
	EReference getLote_Seleccion();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lote#getTostion <em>Tostion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tostion</em>'.
	 * @see CoffeeModeling.Lote#getTostion()
	 * @see #getLote()
	 * @generated
	 */
	EReference getLote_Tostion();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lote#getMolienda <em>Molienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Molienda</em>'.
	 * @see CoffeeModeling.Lote#getMolienda()
	 * @see #getLote()
	 * @generated
	 */
	EReference getLote_Molienda();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lote#getEmpaque <em>Empaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Empaque</em>'.
	 * @see CoffeeModeling.Lote#getEmpaque()
	 * @see #getLote()
	 * @generated
	 */
	EReference getLote_Empaque();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lote#getEmpleado <em>Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Empleado</em>'.
	 * @see CoffeeModeling.Lote#getEmpleado()
	 * @see #getLote()
	 * @generated
	 */
	EReference getLote_Empleado();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Siembra <em>Siembra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Siembra</em>'.
	 * @see CoffeeModeling.Siembra
	 * @generated
	 */
	EClass getSiembra();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Siembra#getEdadCultivo <em>Edad Cultivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edad Cultivo</em>'.
	 * @see CoffeeModeling.Siembra#getEdadCultivo()
	 * @see #getSiembra()
	 * @generated
	 */
	EAttribute getSiembra_EdadCultivo();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Siembra#getFechaInicio <em>Fecha Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Inicio</em>'.
	 * @see CoffeeModeling.Siembra#getFechaInicio()
	 * @see #getSiembra()
	 * @generated
	 */
	EAttribute getSiembra_FechaInicio();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Siembra#getVariedad <em>Variedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variedad</em>'.
	 * @see CoffeeModeling.Siembra#getVariedad()
	 * @see #getSiembra()
	 * @generated
	 */
	EAttribute getSiembra_Variedad();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Siembra#getAbono <em>Abono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abono</em>'.
	 * @see CoffeeModeling.Siembra#getAbono()
	 * @see #getSiembra()
	 * @generated
	 */
	EReference getSiembra_Abono();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Siembra#getVeneno <em>Veneno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Veneno</em>'.
	 * @see CoffeeModeling.Siembra#getVeneno()
	 * @see #getSiembra()
	 * @generated
	 */
	EReference getSiembra_Veneno();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Siembra#getAguaRiego <em>Agua Riego</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agua Riego</em>'.
	 * @see CoffeeModeling.Siembra#getAguaRiego()
	 * @see #getSiembra()
	 * @generated
	 */
	EReference getSiembra_AguaRiego();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Abono <em>Abono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abono</em>'.
	 * @see CoffeeModeling.Abono
	 * @generated
	 */
	EClass getAbono();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Abono#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see CoffeeModeling.Abono#getNombre()
	 * @see #getAbono()
	 * @generated
	 */
	EAttribute getAbono_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Abono#getFechaAplicado <em>Fecha Aplicado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Aplicado</em>'.
	 * @see CoffeeModeling.Abono#getFechaAplicado()
	 * @see #getAbono()
	 * @generated
	 */
	EAttribute getAbono_FechaAplicado();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Veneno <em>Veneno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Veneno</em>'.
	 * @see CoffeeModeling.Veneno
	 * @generated
	 */
	EClass getVeneno();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Veneno#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see CoffeeModeling.Veneno#getNombre()
	 * @see #getVeneno()
	 * @generated
	 */
	EAttribute getVeneno_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Veneno#getFechaAplicado <em>Fecha Aplicado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Aplicado</em>'.
	 * @see CoffeeModeling.Veneno#getFechaAplicado()
	 * @see #getVeneno()
	 * @generated
	 */
	EAttribute getVeneno_FechaAplicado();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Recoleccion <em>Recoleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recoleccion</em>'.
	 * @see CoffeeModeling.Recoleccion
	 * @generated
	 */
	EClass getRecoleccion();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Recoleccion#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha</em>'.
	 * @see CoffeeModeling.Recoleccion#getFecha()
	 * @see #getRecoleccion()
	 * @generated
	 */
	EAttribute getRecoleccion_Fecha();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Flotes <em>Flotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flotes</em>'.
	 * @see CoffeeModeling.Flotes
	 * @generated
	 */
	EClass getFlotes();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Flotes#getCantGranoDefectuoso <em>Cant Grano Defectuoso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cant Grano Defectuoso</em>'.
	 * @see CoffeeModeling.Flotes#getCantGranoDefectuoso()
	 * @see #getFlotes()
	 * @generated
	 */
	EAttribute getFlotes_CantGranoDefectuoso();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Flotes#getAguaUsada <em>Agua Usada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agua Usada</em>'.
	 * @see CoffeeModeling.Flotes#getAguaUsada()
	 * @see #getFlotes()
	 * @generated
	 */
	EReference getFlotes_AguaUsada();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Despulpe <em>Despulpe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Despulpe</em>'.
	 * @see CoffeeModeling.Despulpe
	 * @generated
	 */
	EClass getDespulpe();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Despulpe#getRefMaquinaria <em>Ref Maquinaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Maquinaria</em>'.
	 * @see CoffeeModeling.Despulpe#getRefMaquinaria()
	 * @see #getDespulpe()
	 * @generated
	 */
	EAttribute getDespulpe_RefMaquinaria();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Despulpe#getFechaUltimoMantenimiento <em>Fecha Ultimo Mantenimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Ultimo Mantenimiento</em>'.
	 * @see CoffeeModeling.Despulpe#getFechaUltimoMantenimiento()
	 * @see #getDespulpe()
	 * @generated
	 */
	EAttribute getDespulpe_FechaUltimoMantenimiento();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Agua <em>Agua</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agua</em>'.
	 * @see CoffeeModeling.Agua
	 * @generated
	 */
	EClass getAgua();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Agua#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see CoffeeModeling.Agua#getTipo()
	 * @see #getAgua()
	 * @generated
	 */
	EAttribute getAgua_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Agua#getCantidad <em>Cantidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cantidad</em>'.
	 * @see CoffeeModeling.Agua#getCantidad()
	 * @see #getAgua()
	 * @generated
	 */
	EAttribute getAgua_Cantidad();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Fermentacion <em>Fermentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fermentacion</em>'.
	 * @see CoffeeModeling.Fermentacion
	 * @generated
	 */
	EClass getFermentacion();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Fermentacion#getAltitud <em>Altitud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitud</em>'.
	 * @see CoffeeModeling.Fermentacion#getAltitud()
	 * @see #getFermentacion()
	 * @generated
	 */
	EAttribute getFermentacion_Altitud();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Fermentacion#getTemperatura <em>Temperatura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperatura</em>'.
	 * @see CoffeeModeling.Fermentacion#getTemperatura()
	 * @see #getFermentacion()
	 * @generated
	 */
	EAttribute getFermentacion_Temperatura();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Fermentacion#getHoraSol <em>Hora Sol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora Sol</em>'.
	 * @see CoffeeModeling.Fermentacion#getHoraSol()
	 * @see #getFermentacion()
	 * @generated
	 */
	EAttribute getFermentacion_HoraSol();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Fermentacion#getHoraSombra <em>Hora Sombra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora Sombra</em>'.
	 * @see CoffeeModeling.Fermentacion#getHoraSombra()
	 * @see #getFermentacion()
	 * @generated
	 */
	EAttribute getFermentacion_HoraSombra();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Lavado <em>Lavado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lavado</em>'.
	 * @see CoffeeModeling.Lavado
	 * @generated
	 */
	EClass getLavado();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Lavado#getTecnica <em>Tecnica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tecnica</em>'.
	 * @see CoffeeModeling.Lavado#getTecnica()
	 * @see #getLavado()
	 * @generated
	 */
	EAttribute getLavado_Tecnica();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Lavado#getAguaUsada <em>Agua Usada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agua Usada</em>'.
	 * @see CoffeeModeling.Lavado#getAguaUsada()
	 * @see #getLavado()
	 * @generated
	 */
	EReference getLavado_AguaUsada();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Secado <em>Secado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secado</em>'.
	 * @see CoffeeModeling.Secado
	 * @generated
	 */
	EClass getSecado();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Secado#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see CoffeeModeling.Secado#getTipo()
	 * @see #getSecado()
	 * @generated
	 */
	EAttribute getSecado_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Secado#getHoraSol <em>Hora Sol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora Sol</em>'.
	 * @see CoffeeModeling.Secado#getHoraSol()
	 * @see #getSecado()
	 * @generated
	 */
	EAttribute getSecado_HoraSol();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Secado#getHoraSombra <em>Hora Sombra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora Sombra</em>'.
	 * @see CoffeeModeling.Secado#getHoraSombra()
	 * @see #getSecado()
	 * @generated
	 */
	EAttribute getSecado_HoraSombra();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Secado#getHoraAlmacenamiento <em>Hora Almacenamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora Almacenamiento</em>'.
	 * @see CoffeeModeling.Secado#getHoraAlmacenamiento()
	 * @see #getSecado()
	 * @generated
	 */
	EAttribute getSecado_HoraAlmacenamiento();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Secado#getHumedad <em>Humedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Humedad</em>'.
	 * @see CoffeeModeling.Secado#getHumedad()
	 * @see #getSecado()
	 * @generated
	 */
	EAttribute getSecado_Humedad();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Trilla <em>Trilla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trilla</em>'.
	 * @see CoffeeModeling.Trilla
	 * @generated
	 */
	EClass getTrilla();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Trilla#getTecnicaEmpleada <em>Tecnica Empleada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tecnica Empleada</em>'.
	 * @see CoffeeModeling.Trilla#getTecnicaEmpleada()
	 * @see #getTrilla()
	 * @generated
	 */
	EAttribute getTrilla_TecnicaEmpleada();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Trilla#getMalla <em>Malla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Malla</em>'.
	 * @see CoffeeModeling.Trilla#getMalla()
	 * @see #getTrilla()
	 * @generated
	 */
	EAttribute getTrilla_Malla();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Seleccion <em>Seleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seleccion</em>'.
	 * @see CoffeeModeling.Seleccion
	 * @generated
	 */
	EClass getSeleccion();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Seleccion#getMetodo <em>Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metodo</em>'.
	 * @see CoffeeModeling.Seleccion#getMetodo()
	 * @see #getSeleccion()
	 * @generated
	 */
	EAttribute getSeleccion_Metodo();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Seleccion#getDiasAlmacenamiento <em>Dias Almacenamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dias Almacenamiento</em>'.
	 * @see CoffeeModeling.Seleccion#getDiasAlmacenamiento()
	 * @see #getSeleccion()
	 * @generated
	 */
	EAttribute getSeleccion_DiasAlmacenamiento();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Seleccion#getDefecto <em>Defecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defecto</em>'.
	 * @see CoffeeModeling.Seleccion#getDefecto()
	 * @see #getSeleccion()
	 * @generated
	 */
	EReference getSeleccion_Defecto();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Seleccion#getSeleccionautomatica <em>Seleccionautomatica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seleccionautomatica</em>'.
	 * @see CoffeeModeling.Seleccion#getSeleccionautomatica()
	 * @see #getSeleccion()
	 * @generated
	 */
	EReference getSeleccion_Seleccionautomatica();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Tostion <em>Tostion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tostion</em>'.
	 * @see CoffeeModeling.Tostion
	 * @generated
	 */
	EClass getTostion();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Tostion#getHoras <em>Horas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horas</em>'.
	 * @see CoffeeModeling.Tostion#getHoras()
	 * @see #getTostion()
	 * @generated
	 */
	EAttribute getTostion_Horas();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Tostion#getTemperatura <em>Temperatura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperatura</em>'.
	 * @see CoffeeModeling.Tostion#getTemperatura()
	 * @see #getTostion()
	 * @generated
	 */
	EAttribute getTostion_Temperatura();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Tostion#getRefMaquinaria <em>Ref Maquinaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Maquinaria</em>'.
	 * @see CoffeeModeling.Tostion#getRefMaquinaria()
	 * @see #getTostion()
	 * @generated
	 */
	EAttribute getTostion_RefMaquinaria();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Tostion#getFechaUltimoMantenimiento <em>Fecha Ultimo Mantenimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Ultimo Mantenimiento</em>'.
	 * @see CoffeeModeling.Tostion#getFechaUltimoMantenimiento()
	 * @see #getTostion()
	 * @generated
	 */
	EAttribute getTostion_FechaUltimoMantenimiento();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Defecto <em>Defecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defecto</em>'.
	 * @see CoffeeModeling.Defecto
	 * @generated
	 */
	EClass getDefecto();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Defecto#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see CoffeeModeling.Defecto#getTipo()
	 * @see #getDefecto()
	 * @generated
	 */
	EAttribute getDefecto_Tipo();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.SeleccionAutomatica <em>Seleccion Automatica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seleccion Automatica</em>'.
	 * @see CoffeeModeling.SeleccionAutomatica
	 * @generated
	 */
	EClass getSeleccionAutomatica();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.SeleccionAutomatica#getRefMaquinaria <em>Ref Maquinaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Maquinaria</em>'.
	 * @see CoffeeModeling.SeleccionAutomatica#getRefMaquinaria()
	 * @see #getSeleccionAutomatica()
	 * @generated
	 */
	EAttribute getSeleccionAutomatica_RefMaquinaria();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.SeleccionAutomatica#getFechaUltimoMantenimiento <em>Fecha Ultimo Mantenimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Ultimo Mantenimiento</em>'.
	 * @see CoffeeModeling.SeleccionAutomatica#getFechaUltimoMantenimiento()
	 * @see #getSeleccionAutomatica()
	 * @generated
	 */
	EAttribute getSeleccionAutomatica_FechaUltimoMantenimiento();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Molienda <em>Molienda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molienda</em>'.
	 * @see CoffeeModeling.Molienda
	 * @generated
	 */
	EClass getMolienda();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Molienda#getRefMaquinaria <em>Ref Maquinaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Maquinaria</em>'.
	 * @see CoffeeModeling.Molienda#getRefMaquinaria()
	 * @see #getMolienda()
	 * @generated
	 */
	EAttribute getMolienda_RefMaquinaria();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Molienda#getFechaUltimoMantenimiento <em>Fecha Ultimo Mantenimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Ultimo Mantenimiento</em>'.
	 * @see CoffeeModeling.Molienda#getFechaUltimoMantenimiento()
	 * @see #getMolienda()
	 * @generated
	 */
	EAttribute getMolienda_FechaUltimoMantenimiento();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Empaque <em>Empaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empaque</em>'.
	 * @see CoffeeModeling.Empaque
	 * @generated
	 */
	EClass getEmpaque();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Empaque#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see CoffeeModeling.Empaque#getTipo()
	 * @see #getEmpaque()
	 * @generated
	 */
	EAttribute getEmpaque_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Empaque#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see CoffeeModeling.Empaque#getCodigo()
	 * @see #getEmpaque()
	 * @generated
	 */
	EAttribute getEmpaque_Codigo();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Empleado <em>Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empleado</em>'.
	 * @see CoffeeModeling.Empleado
	 * @generated
	 */
	EClass getEmpleado();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Empleado#getNombreCompleto <em>Nombre Completo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Completo</em>'.
	 * @see CoffeeModeling.Empleado#getNombreCompleto()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_NombreCompleto();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Empleado#getTiempoExperiencia <em>Tiempo Experiencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiempo Experiencia</em>'.
	 * @see CoffeeModeling.Empleado#getTiempoExperiencia()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_TiempoExperiencia();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Empleado#getPoblacion <em>Poblacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poblacion</em>'.
	 * @see CoffeeModeling.Empleado#getPoblacion()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Poblacion();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Empleado#getProcesoEnQueParticipa <em>Proceso En Que Participa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proceso En Que Participa</em>'.
	 * @see CoffeeModeling.Empleado#getProcesoEnQueParticipa()
	 * @see #getEmpleado()
	 * @generated
	 */
	EReference getEmpleado_ProcesoEnQueParticipa();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Proceso <em>Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proceso</em>'.
	 * @see CoffeeModeling.Proceso
	 * @generated
	 */
	EClass getProceso();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Proceso#getNombreProceso <em>Nombre Proceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Proceso</em>'.
	 * @see CoffeeModeling.Proceso#getNombreProceso()
	 * @see #getProceso()
	 * @generated
	 */
	EAttribute getProceso_NombreProceso();

	/**
	 * Returns the meta object for enum '{@link CoffeeModeling.TipoDefectos <em>Tipo Defectos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Defectos</em>'.
	 * @see CoffeeModeling.TipoDefectos
	 * @generated
	 */
	EEnum getTipoDefectos();

	/**
	 * Returns the meta object for enum '{@link CoffeeModeling.Procesos <em>Procesos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procesos</em>'.
	 * @see CoffeeModeling.Procesos
	 * @generated
	 */
	EEnum getProcesos();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoffeeModelingFactory getCoffeeModelingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.FincaImpl <em>Finca</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.FincaImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getFinca()
		 * @generated
		 */
		EClass FINCA = eINSTANCE.getFinca();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINCA__NOMBRE = eINSTANCE.getFinca_Nombre();

		/**
		 * The meta object literal for the '<em><b>Lotes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINCA__LOTES = eINSTANCE.getFinca_Lotes();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.LoteImpl <em>Lote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.LoteImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getLote()
		 * @generated
		 */
		EClass LOTE = eINSTANCE.getLote();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOTE__ID = eINSTANCE.getLote_Id();

		/**
		 * The meta object literal for the '<em><b>Latitud</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOTE__LATITUD = eINSTANCE.getLote_Latitud();

		/**
		 * The meta object literal for the '<em><b>Longitud</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOTE__LONGITUD = eINSTANCE.getLote_Longitud();

		/**
		 * The meta object literal for the '<em><b>Altura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOTE__ALTURA = eINSTANCE.getLote_Altura();

		/**
		 * The meta object literal for the '<em><b>Temperatura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOTE__TEMPERATURA = eINSTANCE.getLote_Temperatura();

		/**
		 * The meta object literal for the '<em><b>Peso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOTE__PESO = eINSTANCE.getLote_Peso();

		/**
		 * The meta object literal for the '<em><b>Siembra</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTE__SIEMBRA = eINSTANCE.getLote_Siembra();

		/**
		 * The meta object literal for the '<em><b>Recoleccion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTE__RECOLECCION = eINSTANCE.getLote_Recoleccion();

		/**
		 * The meta object literal for the '<em><b>Flotes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTE__FLOTES = eINSTANCE.getLote_Flotes();

		/**
		 * The meta object literal for the '<em><b>Despulpe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTE__DESPULPE = eINSTANCE.getLote_Despulpe();

		/**
		 * The meta object literal for the '<em><b>Fermentacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTE__FERMENTACION = eINSTANCE.getLote_Fermentacion();

		/**
		 * The meta object literal for the '<em><b>Lavado</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTE__LAVADO = eINSTANCE.getLote_Lavado();

		/**
		 * The meta object literal for the '<em><b>Secado</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTE__SECADO = eINSTANCE.getLote_Secado();

		/**
		 * The meta object literal for the '<em><b>Trilla</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTE__TRILLA = eINSTANCE.getLote_Trilla();

		/**
		 * The meta object literal for the '<em><b>Seleccion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTE__SELECCION = eINSTANCE.getLote_Seleccion();

		/**
		 * The meta object literal for the '<em><b>Tostion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTE__TOSTION = eINSTANCE.getLote_Tostion();

		/**
		 * The meta object literal for the '<em><b>Molienda</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTE__MOLIENDA = eINSTANCE.getLote_Molienda();

		/**
		 * The meta object literal for the '<em><b>Empaque</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTE__EMPAQUE = eINSTANCE.getLote_Empaque();

		/**
		 * The meta object literal for the '<em><b>Empleado</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOTE__EMPLEADO = eINSTANCE.getLote_Empleado();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.SiembraImpl <em>Siembra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.SiembraImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getSiembra()
		 * @generated
		 */
		EClass SIEMBRA = eINSTANCE.getSiembra();

		/**
		 * The meta object literal for the '<em><b>Edad Cultivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIEMBRA__EDAD_CULTIVO = eINSTANCE.getSiembra_EdadCultivo();

		/**
		 * The meta object literal for the '<em><b>Fecha Inicio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIEMBRA__FECHA_INICIO = eINSTANCE.getSiembra_FechaInicio();

		/**
		 * The meta object literal for the '<em><b>Variedad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIEMBRA__VARIEDAD = eINSTANCE.getSiembra_Variedad();

		/**
		 * The meta object literal for the '<em><b>Abono</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIEMBRA__ABONO = eINSTANCE.getSiembra_Abono();

		/**
		 * The meta object literal for the '<em><b>Veneno</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIEMBRA__VENENO = eINSTANCE.getSiembra_Veneno();

		/**
		 * The meta object literal for the '<em><b>Agua Riego</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIEMBRA__AGUA_RIEGO = eINSTANCE.getSiembra_AguaRiego();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.AbonoImpl <em>Abono</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.AbonoImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getAbono()
		 * @generated
		 */
		EClass ABONO = eINSTANCE.getAbono();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABONO__NOMBRE = eINSTANCE.getAbono_Nombre();

		/**
		 * The meta object literal for the '<em><b>Fecha Aplicado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABONO__FECHA_APLICADO = eINSTANCE.getAbono_FechaAplicado();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.VenenoImpl <em>Veneno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.VenenoImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getVeneno()
		 * @generated
		 */
		EClass VENENO = eINSTANCE.getVeneno();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENENO__NOMBRE = eINSTANCE.getVeneno_Nombre();

		/**
		 * The meta object literal for the '<em><b>Fecha Aplicado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENENO__FECHA_APLICADO = eINSTANCE.getVeneno_FechaAplicado();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.RecoleccionImpl <em>Recoleccion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.RecoleccionImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getRecoleccion()
		 * @generated
		 */
		EClass RECOLECCION = eINSTANCE.getRecoleccion();

		/**
		 * The meta object literal for the '<em><b>Fecha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOLECCION__FECHA = eINSTANCE.getRecoleccion_Fecha();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.FlotesImpl <em>Flotes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.FlotesImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getFlotes()
		 * @generated
		 */
		EClass FLOTES = eINSTANCE.getFlotes();

		/**
		 * The meta object literal for the '<em><b>Cant Grano Defectuoso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOTES__CANT_GRANO_DEFECTUOSO = eINSTANCE.getFlotes_CantGranoDefectuoso();

		/**
		 * The meta object literal for the '<em><b>Agua Usada</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOTES__AGUA_USADA = eINSTANCE.getFlotes_AguaUsada();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.DespulpeImpl <em>Despulpe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.DespulpeImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getDespulpe()
		 * @generated
		 */
		EClass DESPULPE = eINSTANCE.getDespulpe();

		/**
		 * The meta object literal for the '<em><b>Ref Maquinaria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESPULPE__REF_MAQUINARIA = eINSTANCE.getDespulpe_RefMaquinaria();

		/**
		 * The meta object literal for the '<em><b>Fecha Ultimo Mantenimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESPULPE__FECHA_ULTIMO_MANTENIMIENTO = eINSTANCE.getDespulpe_FechaUltimoMantenimiento();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.AguaImpl <em>Agua</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.AguaImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getAgua()
		 * @generated
		 */
		EClass AGUA = eINSTANCE.getAgua();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGUA__TIPO = eINSTANCE.getAgua_Tipo();

		/**
		 * The meta object literal for the '<em><b>Cantidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGUA__CANTIDAD = eINSTANCE.getAgua_Cantidad();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.FermentacionImpl <em>Fermentacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.FermentacionImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getFermentacion()
		 * @generated
		 */
		EClass FERMENTACION = eINSTANCE.getFermentacion();

		/**
		 * The meta object literal for the '<em><b>Altitud</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FERMENTACION__ALTITUD = eINSTANCE.getFermentacion_Altitud();

		/**
		 * The meta object literal for the '<em><b>Temperatura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FERMENTACION__TEMPERATURA = eINSTANCE.getFermentacion_Temperatura();

		/**
		 * The meta object literal for the '<em><b>Hora Sol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FERMENTACION__HORA_SOL = eINSTANCE.getFermentacion_HoraSol();

		/**
		 * The meta object literal for the '<em><b>Hora Sombra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FERMENTACION__HORA_SOMBRA = eINSTANCE.getFermentacion_HoraSombra();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.LavadoImpl <em>Lavado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.LavadoImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getLavado()
		 * @generated
		 */
		EClass LAVADO = eINSTANCE.getLavado();

		/**
		 * The meta object literal for the '<em><b>Tecnica</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAVADO__TECNICA = eINSTANCE.getLavado_Tecnica();

		/**
		 * The meta object literal for the '<em><b>Agua Usada</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAVADO__AGUA_USADA = eINSTANCE.getLavado_AguaUsada();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.SecadoImpl <em>Secado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.SecadoImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getSecado()
		 * @generated
		 */
		EClass SECADO = eINSTANCE.getSecado();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECADO__TIPO = eINSTANCE.getSecado_Tipo();

		/**
		 * The meta object literal for the '<em><b>Hora Sol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECADO__HORA_SOL = eINSTANCE.getSecado_HoraSol();

		/**
		 * The meta object literal for the '<em><b>Hora Sombra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECADO__HORA_SOMBRA = eINSTANCE.getSecado_HoraSombra();

		/**
		 * The meta object literal for the '<em><b>Hora Almacenamiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECADO__HORA_ALMACENAMIENTO = eINSTANCE.getSecado_HoraAlmacenamiento();

		/**
		 * The meta object literal for the '<em><b>Humedad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECADO__HUMEDAD = eINSTANCE.getSecado_Humedad();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.TrillaImpl <em>Trilla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.TrillaImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getTrilla()
		 * @generated
		 */
		EClass TRILLA = eINSTANCE.getTrilla();

		/**
		 * The meta object literal for the '<em><b>Tecnica Empleada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRILLA__TECNICA_EMPLEADA = eINSTANCE.getTrilla_TecnicaEmpleada();

		/**
		 * The meta object literal for the '<em><b>Malla</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRILLA__MALLA = eINSTANCE.getTrilla_Malla();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.SeleccionImpl <em>Seleccion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.SeleccionImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getSeleccion()
		 * @generated
		 */
		EClass SELECCION = eINSTANCE.getSeleccion();

		/**
		 * The meta object literal for the '<em><b>Metodo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECCION__METODO = eINSTANCE.getSeleccion_Metodo();

		/**
		 * The meta object literal for the '<em><b>Dias Almacenamiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECCION__DIAS_ALMACENAMIENTO = eINSTANCE.getSeleccion_DiasAlmacenamiento();

		/**
		 * The meta object literal for the '<em><b>Defecto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECCION__DEFECTO = eINSTANCE.getSeleccion_Defecto();

		/**
		 * The meta object literal for the '<em><b>Seleccionautomatica</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECCION__SELECCIONAUTOMATICA = eINSTANCE.getSeleccion_Seleccionautomatica();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.TostionImpl <em>Tostion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.TostionImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getTostion()
		 * @generated
		 */
		EClass TOSTION = eINSTANCE.getTostion();

		/**
		 * The meta object literal for the '<em><b>Horas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSTION__HORAS = eINSTANCE.getTostion_Horas();

		/**
		 * The meta object literal for the '<em><b>Temperatura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSTION__TEMPERATURA = eINSTANCE.getTostion_Temperatura();

		/**
		 * The meta object literal for the '<em><b>Ref Maquinaria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSTION__REF_MAQUINARIA = eINSTANCE.getTostion_RefMaquinaria();

		/**
		 * The meta object literal for the '<em><b>Fecha Ultimo Mantenimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSTION__FECHA_ULTIMO_MANTENIMIENTO = eINSTANCE.getTostion_FechaUltimoMantenimiento();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.DefectoImpl <em>Defecto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.DefectoImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getDefecto()
		 * @generated
		 */
		EClass DEFECTO = eINSTANCE.getDefecto();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFECTO__TIPO = eINSTANCE.getDefecto_Tipo();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.SeleccionAutomaticaImpl <em>Seleccion Automatica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.SeleccionAutomaticaImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getSeleccionAutomatica()
		 * @generated
		 */
		EClass SELECCION_AUTOMATICA = eINSTANCE.getSeleccionAutomatica();

		/**
		 * The meta object literal for the '<em><b>Ref Maquinaria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECCION_AUTOMATICA__REF_MAQUINARIA = eINSTANCE.getSeleccionAutomatica_RefMaquinaria();

		/**
		 * The meta object literal for the '<em><b>Fecha Ultimo Mantenimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECCION_AUTOMATICA__FECHA_ULTIMO_MANTENIMIENTO = eINSTANCE.getSeleccionAutomatica_FechaUltimoMantenimiento();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.MoliendaImpl <em>Molienda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.MoliendaImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getMolienda()
		 * @generated
		 */
		EClass MOLIENDA = eINSTANCE.getMolienda();

		/**
		 * The meta object literal for the '<em><b>Ref Maquinaria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLIENDA__REF_MAQUINARIA = eINSTANCE.getMolienda_RefMaquinaria();

		/**
		 * The meta object literal for the '<em><b>Fecha Ultimo Mantenimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLIENDA__FECHA_ULTIMO_MANTENIMIENTO = eINSTANCE.getMolienda_FechaUltimoMantenimiento();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.EmpaqueImpl <em>Empaque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.EmpaqueImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getEmpaque()
		 * @generated
		 */
		EClass EMPAQUE = eINSTANCE.getEmpaque();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPAQUE__TIPO = eINSTANCE.getEmpaque_Tipo();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPAQUE__CODIGO = eINSTANCE.getEmpaque_Codigo();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.EmpleadoImpl <em>Empleado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.EmpleadoImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getEmpleado()
		 * @generated
		 */
		EClass EMPLEADO = eINSTANCE.getEmpleado();

		/**
		 * The meta object literal for the '<em><b>Nombre Completo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__NOMBRE_COMPLETO = eINSTANCE.getEmpleado_NombreCompleto();

		/**
		 * The meta object literal for the '<em><b>Tiempo Experiencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__TIEMPO_EXPERIENCIA = eINSTANCE.getEmpleado_TiempoExperiencia();

		/**
		 * The meta object literal for the '<em><b>Poblacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__POBLACION = eINSTANCE.getEmpleado_Poblacion();

		/**
		 * The meta object literal for the '<em><b>Proceso En Que Participa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLEADO__PROCESO_EN_QUE_PARTICIPA = eINSTANCE.getEmpleado_ProcesoEnQueParticipa();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.ProcesoImpl <em>Proceso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.ProcesoImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getProceso()
		 * @generated
		 */
		EClass PROCESO = eINSTANCE.getProceso();

		/**
		 * The meta object literal for the '<em><b>Nombre Proceso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESO__NOMBRE_PROCESO = eINSTANCE.getProceso_NombreProceso();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.TipoDefectos <em>Tipo Defectos</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.TipoDefectos
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getTipoDefectos()
		 * @generated
		 */
		EEnum TIPO_DEFECTOS = eINSTANCE.getTipoDefectos();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.Procesos <em>Procesos</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.Procesos
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getProcesos()
		 * @generated
		 */
		EEnum PROCESOS = eINSTANCE.getProcesos();

	}

} //CoffeeModelingPackage
