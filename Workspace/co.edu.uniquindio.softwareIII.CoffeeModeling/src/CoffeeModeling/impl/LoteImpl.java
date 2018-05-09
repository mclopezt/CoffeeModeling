/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Despulpe;
import CoffeeModeling.Empaque;
import CoffeeModeling.Empleado;
import CoffeeModeling.Fermentacion;
import CoffeeModeling.Flotes;
import CoffeeModeling.Lavado;
import CoffeeModeling.Lote;
import CoffeeModeling.Molienda;
import CoffeeModeling.Recoleccion;
import CoffeeModeling.Secado;
import CoffeeModeling.Seleccion;
import CoffeeModeling.Tostion;
import CoffeeModeling.Trilla;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getRecoleccion <em>Recoleccion</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getFlotes <em>Flotes</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getDespulpe <em>Despulpe</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getFermentacion <em>Fermentacion</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getLavado <em>Lavado</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getSecado <em>Secado</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getTrilla <em>Trilla</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getSeleccion <em>Seleccion</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getTostion <em>Tostion</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getMolienda <em>Molienda</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getEmpaque <em>Empaque</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getFechaInicio <em>Fecha Inicio</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getFechaFin <em>Fecha Fin</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getEmpleados <em>Empleados</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getPeso <em>Peso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoteImpl extends MinimalEObjectImpl.Container implements Lote {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecoleccion() <em>Recoleccion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoleccion()
	 * @generated
	 * @ordered
	 */
	protected Recoleccion recoleccion;

	/**
	 * The cached value of the '{@link #getFlotes() <em>Flotes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlotes()
	 * @generated
	 * @ordered
	 */
	protected Flotes flotes;

	/**
	 * The cached value of the '{@link #getDespulpe() <em>Despulpe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDespulpe()
	 * @generated
	 * @ordered
	 */
	protected Despulpe despulpe;

	/**
	 * The cached value of the '{@link #getFermentacion() <em>Fermentacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFermentacion()
	 * @generated
	 * @ordered
	 */
	protected Fermentacion fermentacion;

	/**
	 * The cached value of the '{@link #getLavado() <em>Lavado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLavado()
	 * @generated
	 * @ordered
	 */
	protected Lavado lavado;

	/**
	 * The cached value of the '{@link #getSecado() <em>Secado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecado()
	 * @generated
	 * @ordered
	 */
	protected Secado secado;

	/**
	 * The cached value of the '{@link #getTrilla() <em>Trilla</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrilla()
	 * @generated
	 * @ordered
	 */
	protected Trilla trilla;

	/**
	 * The cached value of the '{@link #getSeleccion() <em>Seleccion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeleccion()
	 * @generated
	 * @ordered
	 */
	protected Seleccion seleccion;

	/**
	 * The cached value of the '{@link #getTostion() <em>Tostion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTostion()
	 * @generated
	 * @ordered
	 */
	protected Tostion tostion;

	/**
	 * The cached value of the '{@link #getMolienda() <em>Molienda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolienda()
	 * @generated
	 * @ordered
	 */
	protected Molienda molienda;

	/**
	 * The cached value of the '{@link #getEmpaque() <em>Empaque</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpaque()
	 * @generated
	 * @ordered
	 */
	protected Empaque empaque;

	/**
	 * The default value of the '{@link #getFechaInicio() <em>Fecha Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaInicio()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_INICIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaInicio() <em>Fecha Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaInicio()
	 * @generated
	 * @ordered
	 */
	protected String fechaInicio = FECHA_INICIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaFin() <em>Fecha Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaFin()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaFin() <em>Fecha Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaFin()
	 * @generated
	 * @ordered
	 */
	protected String fechaFin = FECHA_FIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmpleados() <em>Empleados</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpleados()
	 * @generated
	 * @ordered
	 */
	protected EList<Empleado> empleados;

	/**
	 * The default value of the '{@link #getPeso() <em>Peso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeso()
	 * @generated
	 * @ordered
	 */
	protected static final int PESO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeso() <em>Peso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeso()
	 * @generated
	 * @ordered
	 */
	protected int peso = PESO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.LOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recoleccion getRecoleccion() {
		return recoleccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecoleccion(Recoleccion newRecoleccion, NotificationChain msgs) {
		Recoleccion oldRecoleccion = recoleccion;
		recoleccion = newRecoleccion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__RECOLECCION, oldRecoleccion, newRecoleccion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoleccion(Recoleccion newRecoleccion) {
		if (newRecoleccion != recoleccion) {
			NotificationChain msgs = null;
			if (recoleccion != null)
				msgs = ((InternalEObject)recoleccion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__RECOLECCION, null, msgs);
			if (newRecoleccion != null)
				msgs = ((InternalEObject)newRecoleccion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__RECOLECCION, null, msgs);
			msgs = basicSetRecoleccion(newRecoleccion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__RECOLECCION, newRecoleccion, newRecoleccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flotes getFlotes() {
		return flotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlotes(Flotes newFlotes, NotificationChain msgs) {
		Flotes oldFlotes = flotes;
		flotes = newFlotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__FLOTES, oldFlotes, newFlotes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlotes(Flotes newFlotes) {
		if (newFlotes != flotes) {
			NotificationChain msgs = null;
			if (flotes != null)
				msgs = ((InternalEObject)flotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__FLOTES, null, msgs);
			if (newFlotes != null)
				msgs = ((InternalEObject)newFlotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__FLOTES, null, msgs);
			msgs = basicSetFlotes(newFlotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__FLOTES, newFlotes, newFlotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Despulpe getDespulpe() {
		return despulpe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDespulpe(Despulpe newDespulpe, NotificationChain msgs) {
		Despulpe oldDespulpe = despulpe;
		despulpe = newDespulpe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__DESPULPE, oldDespulpe, newDespulpe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDespulpe(Despulpe newDespulpe) {
		if (newDespulpe != despulpe) {
			NotificationChain msgs = null;
			if (despulpe != null)
				msgs = ((InternalEObject)despulpe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__DESPULPE, null, msgs);
			if (newDespulpe != null)
				msgs = ((InternalEObject)newDespulpe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__DESPULPE, null, msgs);
			msgs = basicSetDespulpe(newDespulpe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__DESPULPE, newDespulpe, newDespulpe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fermentacion getFermentacion() {
		return fermentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFermentacion(Fermentacion newFermentacion, NotificationChain msgs) {
		Fermentacion oldFermentacion = fermentacion;
		fermentacion = newFermentacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__FERMENTACION, oldFermentacion, newFermentacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFermentacion(Fermentacion newFermentacion) {
		if (newFermentacion != fermentacion) {
			NotificationChain msgs = null;
			if (fermentacion != null)
				msgs = ((InternalEObject)fermentacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__FERMENTACION, null, msgs);
			if (newFermentacion != null)
				msgs = ((InternalEObject)newFermentacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__FERMENTACION, null, msgs);
			msgs = basicSetFermentacion(newFermentacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__FERMENTACION, newFermentacion, newFermentacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lavado getLavado() {
		return lavado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLavado(Lavado newLavado, NotificationChain msgs) {
		Lavado oldLavado = lavado;
		lavado = newLavado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__LAVADO, oldLavado, newLavado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLavado(Lavado newLavado) {
		if (newLavado != lavado) {
			NotificationChain msgs = null;
			if (lavado != null)
				msgs = ((InternalEObject)lavado).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__LAVADO, null, msgs);
			if (newLavado != null)
				msgs = ((InternalEObject)newLavado).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__LAVADO, null, msgs);
			msgs = basicSetLavado(newLavado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__LAVADO, newLavado, newLavado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secado getSecado() {
		return secado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecado(Secado newSecado, NotificationChain msgs) {
		Secado oldSecado = secado;
		secado = newSecado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__SECADO, oldSecado, newSecado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecado(Secado newSecado) {
		if (newSecado != secado) {
			NotificationChain msgs = null;
			if (secado != null)
				msgs = ((InternalEObject)secado).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__SECADO, null, msgs);
			if (newSecado != null)
				msgs = ((InternalEObject)newSecado).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__SECADO, null, msgs);
			msgs = basicSetSecado(newSecado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__SECADO, newSecado, newSecado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trilla getTrilla() {
		return trilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrilla(Trilla newTrilla, NotificationChain msgs) {
		Trilla oldTrilla = trilla;
		trilla = newTrilla;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__TRILLA, oldTrilla, newTrilla);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrilla(Trilla newTrilla) {
		if (newTrilla != trilla) {
			NotificationChain msgs = null;
			if (trilla != null)
				msgs = ((InternalEObject)trilla).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__TRILLA, null, msgs);
			if (newTrilla != null)
				msgs = ((InternalEObject)newTrilla).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__TRILLA, null, msgs);
			msgs = basicSetTrilla(newTrilla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__TRILLA, newTrilla, newTrilla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seleccion getSeleccion() {
		return seleccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeleccion(Seleccion newSeleccion, NotificationChain msgs) {
		Seleccion oldSeleccion = seleccion;
		seleccion = newSeleccion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__SELECCION, oldSeleccion, newSeleccion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeleccion(Seleccion newSeleccion) {
		if (newSeleccion != seleccion) {
			NotificationChain msgs = null;
			if (seleccion != null)
				msgs = ((InternalEObject)seleccion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__SELECCION, null, msgs);
			if (newSeleccion != null)
				msgs = ((InternalEObject)newSeleccion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__SELECCION, null, msgs);
			msgs = basicSetSeleccion(newSeleccion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__SELECCION, newSeleccion, newSeleccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tostion getTostion() {
		return tostion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTostion(Tostion newTostion, NotificationChain msgs) {
		Tostion oldTostion = tostion;
		tostion = newTostion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__TOSTION, oldTostion, newTostion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTostion(Tostion newTostion) {
		if (newTostion != tostion) {
			NotificationChain msgs = null;
			if (tostion != null)
				msgs = ((InternalEObject)tostion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__TOSTION, null, msgs);
			if (newTostion != null)
				msgs = ((InternalEObject)newTostion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__TOSTION, null, msgs);
			msgs = basicSetTostion(newTostion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__TOSTION, newTostion, newTostion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Molienda getMolienda() {
		return molienda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMolienda(Molienda newMolienda, NotificationChain msgs) {
		Molienda oldMolienda = molienda;
		molienda = newMolienda;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__MOLIENDA, oldMolienda, newMolienda);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMolienda(Molienda newMolienda) {
		if (newMolienda != molienda) {
			NotificationChain msgs = null;
			if (molienda != null)
				msgs = ((InternalEObject)molienda).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__MOLIENDA, null, msgs);
			if (newMolienda != null)
				msgs = ((InternalEObject)newMolienda).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__MOLIENDA, null, msgs);
			msgs = basicSetMolienda(newMolienda, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__MOLIENDA, newMolienda, newMolienda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empaque getEmpaque() {
		return empaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpaque(Empaque newEmpaque, NotificationChain msgs) {
		Empaque oldEmpaque = empaque;
		empaque = newEmpaque;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__EMPAQUE, oldEmpaque, newEmpaque);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpaque(Empaque newEmpaque) {
		if (newEmpaque != empaque) {
			NotificationChain msgs = null;
			if (empaque != null)
				msgs = ((InternalEObject)empaque).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__EMPAQUE, null, msgs);
			if (newEmpaque != null)
				msgs = ((InternalEObject)newEmpaque).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.LOTE__EMPAQUE, null, msgs);
			msgs = basicSetEmpaque(newEmpaque, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__EMPAQUE, newEmpaque, newEmpaque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaInicio(String newFechaInicio) {
		String oldFechaInicio = fechaInicio;
		fechaInicio = newFechaInicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__FECHA_INICIO, oldFechaInicio, fechaInicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaFin() {
		return fechaFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaFin(String newFechaFin) {
		String oldFechaFin = fechaFin;
		fechaFin = newFechaFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__FECHA_FIN, oldFechaFin, fechaFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Empleado> getEmpleados() {
		if (empleados == null) {
			empleados = new EObjectResolvingEList<Empleado>(Empleado.class, this, CoffeeModelingPackage.LOTE__EMPLEADOS);
		}
		return empleados;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeso(int newPeso) {
		int oldPeso = peso;
		peso = newPeso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__PESO, oldPeso, peso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoffeeModelingPackage.LOTE__RECOLECCION:
				return basicSetRecoleccion(null, msgs);
			case CoffeeModelingPackage.LOTE__FLOTES:
				return basicSetFlotes(null, msgs);
			case CoffeeModelingPackage.LOTE__DESPULPE:
				return basicSetDespulpe(null, msgs);
			case CoffeeModelingPackage.LOTE__FERMENTACION:
				return basicSetFermentacion(null, msgs);
			case CoffeeModelingPackage.LOTE__LAVADO:
				return basicSetLavado(null, msgs);
			case CoffeeModelingPackage.LOTE__SECADO:
				return basicSetSecado(null, msgs);
			case CoffeeModelingPackage.LOTE__TRILLA:
				return basicSetTrilla(null, msgs);
			case CoffeeModelingPackage.LOTE__SELECCION:
				return basicSetSeleccion(null, msgs);
			case CoffeeModelingPackage.LOTE__TOSTION:
				return basicSetTostion(null, msgs);
			case CoffeeModelingPackage.LOTE__MOLIENDA:
				return basicSetMolienda(null, msgs);
			case CoffeeModelingPackage.LOTE__EMPAQUE:
				return basicSetEmpaque(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoffeeModelingPackage.LOTE__ID:
				return getId();
			case CoffeeModelingPackage.LOTE__RECOLECCION:
				return getRecoleccion();
			case CoffeeModelingPackage.LOTE__FLOTES:
				return getFlotes();
			case CoffeeModelingPackage.LOTE__DESPULPE:
				return getDespulpe();
			case CoffeeModelingPackage.LOTE__FERMENTACION:
				return getFermentacion();
			case CoffeeModelingPackage.LOTE__LAVADO:
				return getLavado();
			case CoffeeModelingPackage.LOTE__SECADO:
				return getSecado();
			case CoffeeModelingPackage.LOTE__TRILLA:
				return getTrilla();
			case CoffeeModelingPackage.LOTE__SELECCION:
				return getSeleccion();
			case CoffeeModelingPackage.LOTE__TOSTION:
				return getTostion();
			case CoffeeModelingPackage.LOTE__MOLIENDA:
				return getMolienda();
			case CoffeeModelingPackage.LOTE__EMPAQUE:
				return getEmpaque();
			case CoffeeModelingPackage.LOTE__FECHA_INICIO:
				return getFechaInicio();
			case CoffeeModelingPackage.LOTE__FECHA_FIN:
				return getFechaFin();
			case CoffeeModelingPackage.LOTE__EMPLEADOS:
				return getEmpleados();
			case CoffeeModelingPackage.LOTE__PESO:
				return getPeso();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoffeeModelingPackage.LOTE__ID:
				setId((String)newValue);
				return;
			case CoffeeModelingPackage.LOTE__RECOLECCION:
				setRecoleccion((Recoleccion)newValue);
				return;
			case CoffeeModelingPackage.LOTE__FLOTES:
				setFlotes((Flotes)newValue);
				return;
			case CoffeeModelingPackage.LOTE__DESPULPE:
				setDespulpe((Despulpe)newValue);
				return;
			case CoffeeModelingPackage.LOTE__FERMENTACION:
				setFermentacion((Fermentacion)newValue);
				return;
			case CoffeeModelingPackage.LOTE__LAVADO:
				setLavado((Lavado)newValue);
				return;
			case CoffeeModelingPackage.LOTE__SECADO:
				setSecado((Secado)newValue);
				return;
			case CoffeeModelingPackage.LOTE__TRILLA:
				setTrilla((Trilla)newValue);
				return;
			case CoffeeModelingPackage.LOTE__SELECCION:
				setSeleccion((Seleccion)newValue);
				return;
			case CoffeeModelingPackage.LOTE__TOSTION:
				setTostion((Tostion)newValue);
				return;
			case CoffeeModelingPackage.LOTE__MOLIENDA:
				setMolienda((Molienda)newValue);
				return;
			case CoffeeModelingPackage.LOTE__EMPAQUE:
				setEmpaque((Empaque)newValue);
				return;
			case CoffeeModelingPackage.LOTE__FECHA_INICIO:
				setFechaInicio((String)newValue);
				return;
			case CoffeeModelingPackage.LOTE__FECHA_FIN:
				setFechaFin((String)newValue);
				return;
			case CoffeeModelingPackage.LOTE__EMPLEADOS:
				getEmpleados().clear();
				getEmpleados().addAll((Collection<? extends Empleado>)newValue);
				return;
			case CoffeeModelingPackage.LOTE__PESO:
				setPeso((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoffeeModelingPackage.LOTE__ID:
				setId(ID_EDEFAULT);
				return;
			case CoffeeModelingPackage.LOTE__RECOLECCION:
				setRecoleccion((Recoleccion)null);
				return;
			case CoffeeModelingPackage.LOTE__FLOTES:
				setFlotes((Flotes)null);
				return;
			case CoffeeModelingPackage.LOTE__DESPULPE:
				setDespulpe((Despulpe)null);
				return;
			case CoffeeModelingPackage.LOTE__FERMENTACION:
				setFermentacion((Fermentacion)null);
				return;
			case CoffeeModelingPackage.LOTE__LAVADO:
				setLavado((Lavado)null);
				return;
			case CoffeeModelingPackage.LOTE__SECADO:
				setSecado((Secado)null);
				return;
			case CoffeeModelingPackage.LOTE__TRILLA:
				setTrilla((Trilla)null);
				return;
			case CoffeeModelingPackage.LOTE__SELECCION:
				setSeleccion((Seleccion)null);
				return;
			case CoffeeModelingPackage.LOTE__TOSTION:
				setTostion((Tostion)null);
				return;
			case CoffeeModelingPackage.LOTE__MOLIENDA:
				setMolienda((Molienda)null);
				return;
			case CoffeeModelingPackage.LOTE__EMPAQUE:
				setEmpaque((Empaque)null);
				return;
			case CoffeeModelingPackage.LOTE__FECHA_INICIO:
				setFechaInicio(FECHA_INICIO_EDEFAULT);
				return;
			case CoffeeModelingPackage.LOTE__FECHA_FIN:
				setFechaFin(FECHA_FIN_EDEFAULT);
				return;
			case CoffeeModelingPackage.LOTE__EMPLEADOS:
				getEmpleados().clear();
				return;
			case CoffeeModelingPackage.LOTE__PESO:
				setPeso(PESO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoffeeModelingPackage.LOTE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoffeeModelingPackage.LOTE__RECOLECCION:
				return recoleccion != null;
			case CoffeeModelingPackage.LOTE__FLOTES:
				return flotes != null;
			case CoffeeModelingPackage.LOTE__DESPULPE:
				return despulpe != null;
			case CoffeeModelingPackage.LOTE__FERMENTACION:
				return fermentacion != null;
			case CoffeeModelingPackage.LOTE__LAVADO:
				return lavado != null;
			case CoffeeModelingPackage.LOTE__SECADO:
				return secado != null;
			case CoffeeModelingPackage.LOTE__TRILLA:
				return trilla != null;
			case CoffeeModelingPackage.LOTE__SELECCION:
				return seleccion != null;
			case CoffeeModelingPackage.LOTE__TOSTION:
				return tostion != null;
			case CoffeeModelingPackage.LOTE__MOLIENDA:
				return molienda != null;
			case CoffeeModelingPackage.LOTE__EMPAQUE:
				return empaque != null;
			case CoffeeModelingPackage.LOTE__FECHA_INICIO:
				return FECHA_INICIO_EDEFAULT == null ? fechaInicio != null : !FECHA_INICIO_EDEFAULT.equals(fechaInicio);
			case CoffeeModelingPackage.LOTE__FECHA_FIN:
				return FECHA_FIN_EDEFAULT == null ? fechaFin != null : !FECHA_FIN_EDEFAULT.equals(fechaFin);
			case CoffeeModelingPackage.LOTE__EMPLEADOS:
				return empleados != null && !empleados.isEmpty();
			case CoffeeModelingPackage.LOTE__PESO:
				return peso != PESO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", fechaInicio: ");
		result.append(fechaInicio);
		result.append(", fechaFin: ");
		result.append(fechaFin);
		result.append(", peso: ");
		result.append(peso);
		result.append(')');
		return result.toString();
	}

} //LoteImpl
