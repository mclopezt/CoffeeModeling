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
import CoffeeModeling.Siembra;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getLatitud <em>Latitud</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getLongitud <em>Longitud</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getAltura <em>Altura</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getTemperatura <em>Temperatura</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getPeso <em>Peso</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getSiembra <em>Siembra</em>}</li>
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
 *   <li>{@link CoffeeModeling.impl.LoteImpl#getEmpleado <em>Empleado</em>}</li>
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
	 * The default value of the '{@link #getLatitud() <em>Latitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitud()
	 * @generated
	 * @ordered
	 */
	protected static final float LATITUD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLatitud() <em>Latitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitud()
	 * @generated
	 * @ordered
	 */
	protected float latitud = LATITUD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitud() <em>Longitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitud()
	 * @generated
	 * @ordered
	 */
	protected static final float LONGITUD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLongitud() <em>Longitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitud()
	 * @generated
	 * @ordered
	 */
	protected float longitud = LONGITUD_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltura() <em>Altura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltura()
	 * @generated
	 * @ordered
	 */
	protected static final float ALTURA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAltura() <em>Altura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltura()
	 * @generated
	 * @ordered
	 */
	protected float altura = ALTURA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperatura() <em>Temperatura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatura()
	 * @generated
	 * @ordered
	 */
	protected static final float TEMPERATURA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTemperatura() <em>Temperatura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatura()
	 * @generated
	 * @ordered
	 */
	protected float temperatura = TEMPERATURA_EDEFAULT;

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
	 * The cached value of the '{@link #getSiembra() <em>Siembra</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiembra()
	 * @generated
	 * @ordered
	 */
	protected EList<Siembra> siembra;

	/**
	 * The cached value of the '{@link #getRecoleccion() <em>Recoleccion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoleccion()
	 * @generated
	 * @ordered
	 */
	protected EList<Recoleccion> recoleccion;

	/**
	 * The cached value of the '{@link #getFlotes() <em>Flotes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Flotes> flotes;

	/**
	 * The cached value of the '{@link #getDespulpe() <em>Despulpe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDespulpe()
	 * @generated
	 * @ordered
	 */
	protected EList<Despulpe> despulpe;

	/**
	 * The cached value of the '{@link #getFermentacion() <em>Fermentacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFermentacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Fermentacion> fermentacion;

	/**
	 * The cached value of the '{@link #getLavado() <em>Lavado</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLavado()
	 * @generated
	 * @ordered
	 */
	protected EList<Lavado> lavado;

	/**
	 * The cached value of the '{@link #getSecado() <em>Secado</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecado()
	 * @generated
	 * @ordered
	 */
	protected EList<Secado> secado;

	/**
	 * The cached value of the '{@link #getTrilla() <em>Trilla</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrilla()
	 * @generated
	 * @ordered
	 */
	protected EList<Trilla> trilla;

	/**
	 * The cached value of the '{@link #getSeleccion() <em>Seleccion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeleccion()
	 * @generated
	 * @ordered
	 */
	protected EList<Seleccion> seleccion;

	/**
	 * The cached value of the '{@link #getTostion() <em>Tostion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTostion()
	 * @generated
	 * @ordered
	 */
	protected EList<Tostion> tostion;

	/**
	 * The cached value of the '{@link #getMolienda() <em>Molienda</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolienda()
	 * @generated
	 * @ordered
	 */
	protected EList<Molienda> molienda;

	/**
	 * The cached value of the '{@link #getEmpaque() <em>Empaque</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpaque()
	 * @generated
	 * @ordered
	 */
	protected EList<Empaque> empaque;

	/**
	 * The cached value of the '{@link #getEmpleado() <em>Empleado</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpleado()
	 * @generated
	 * @ordered
	 */
	protected EList<Empleado> empleado;

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
	public float getLatitud() {
		return latitud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitud(float newLatitud) {
		float oldLatitud = latitud;
		latitud = newLatitud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__LATITUD, oldLatitud, latitud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLongitud() {
		return longitud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitud(float newLongitud) {
		float oldLongitud = longitud;
		longitud = newLongitud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__LONGITUD, oldLongitud, longitud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltura(float newAltura) {
		float oldAltura = altura;
		altura = newAltura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__ALTURA, oldAltura, altura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTemperatura() {
		return temperatura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatura(float newTemperatura) {
		float oldTemperatura = temperatura;
		temperatura = newTemperatura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LOTE__TEMPERATURA, oldTemperatura, temperatura));
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
	public EList<Siembra> getSiembra() {
		if (siembra == null) {
			siembra = new EObjectContainmentEList<Siembra>(Siembra.class, this, CoffeeModelingPackage.LOTE__SIEMBRA);
		}
		return siembra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recoleccion> getRecoleccion() {
		if (recoleccion == null) {
			recoleccion = new EObjectContainmentEList<Recoleccion>(Recoleccion.class, this, CoffeeModelingPackage.LOTE__RECOLECCION);
		}
		return recoleccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flotes> getFlotes() {
		if (flotes == null) {
			flotes = new EObjectContainmentEList<Flotes>(Flotes.class, this, CoffeeModelingPackage.LOTE__FLOTES);
		}
		return flotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Despulpe> getDespulpe() {
		if (despulpe == null) {
			despulpe = new EObjectContainmentEList<Despulpe>(Despulpe.class, this, CoffeeModelingPackage.LOTE__DESPULPE);
		}
		return despulpe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fermentacion> getFermentacion() {
		if (fermentacion == null) {
			fermentacion = new EObjectContainmentEList<Fermentacion>(Fermentacion.class, this, CoffeeModelingPackage.LOTE__FERMENTACION);
		}
		return fermentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lavado> getLavado() {
		if (lavado == null) {
			lavado = new EObjectContainmentEList<Lavado>(Lavado.class, this, CoffeeModelingPackage.LOTE__LAVADO);
		}
		return lavado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Secado> getSecado() {
		if (secado == null) {
			secado = new EObjectContainmentEList<Secado>(Secado.class, this, CoffeeModelingPackage.LOTE__SECADO);
		}
		return secado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trilla> getTrilla() {
		if (trilla == null) {
			trilla = new EObjectContainmentEList<Trilla>(Trilla.class, this, CoffeeModelingPackage.LOTE__TRILLA);
		}
		return trilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Seleccion> getSeleccion() {
		if (seleccion == null) {
			seleccion = new EObjectContainmentEList<Seleccion>(Seleccion.class, this, CoffeeModelingPackage.LOTE__SELECCION);
		}
		return seleccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tostion> getTostion() {
		if (tostion == null) {
			tostion = new EObjectContainmentEList<Tostion>(Tostion.class, this, CoffeeModelingPackage.LOTE__TOSTION);
		}
		return tostion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Molienda> getMolienda() {
		if (molienda == null) {
			molienda = new EObjectContainmentEList<Molienda>(Molienda.class, this, CoffeeModelingPackage.LOTE__MOLIENDA);
		}
		return molienda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Empaque> getEmpaque() {
		if (empaque == null) {
			empaque = new EObjectContainmentEList<Empaque>(Empaque.class, this, CoffeeModelingPackage.LOTE__EMPAQUE);
		}
		return empaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Empleado> getEmpleado() {
		if (empleado == null) {
			empleado = new EObjectContainmentEList<Empleado>(Empleado.class, this, CoffeeModelingPackage.LOTE__EMPLEADO);
		}
		return empleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoffeeModelingPackage.LOTE__SIEMBRA:
				return ((InternalEList<?>)getSiembra()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.LOTE__RECOLECCION:
				return ((InternalEList<?>)getRecoleccion()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.LOTE__FLOTES:
				return ((InternalEList<?>)getFlotes()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.LOTE__DESPULPE:
				return ((InternalEList<?>)getDespulpe()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.LOTE__FERMENTACION:
				return ((InternalEList<?>)getFermentacion()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.LOTE__LAVADO:
				return ((InternalEList<?>)getLavado()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.LOTE__SECADO:
				return ((InternalEList<?>)getSecado()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.LOTE__TRILLA:
				return ((InternalEList<?>)getTrilla()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.LOTE__SELECCION:
				return ((InternalEList<?>)getSeleccion()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.LOTE__TOSTION:
				return ((InternalEList<?>)getTostion()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.LOTE__MOLIENDA:
				return ((InternalEList<?>)getMolienda()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.LOTE__EMPAQUE:
				return ((InternalEList<?>)getEmpaque()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.LOTE__EMPLEADO:
				return ((InternalEList<?>)getEmpleado()).basicRemove(otherEnd, msgs);
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
			case CoffeeModelingPackage.LOTE__LATITUD:
				return getLatitud();
			case CoffeeModelingPackage.LOTE__LONGITUD:
				return getLongitud();
			case CoffeeModelingPackage.LOTE__ALTURA:
				return getAltura();
			case CoffeeModelingPackage.LOTE__TEMPERATURA:
				return getTemperatura();
			case CoffeeModelingPackage.LOTE__PESO:
				return getPeso();
			case CoffeeModelingPackage.LOTE__SIEMBRA:
				return getSiembra();
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
			case CoffeeModelingPackage.LOTE__EMPLEADO:
				return getEmpleado();
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
			case CoffeeModelingPackage.LOTE__LATITUD:
				setLatitud((Float)newValue);
				return;
			case CoffeeModelingPackage.LOTE__LONGITUD:
				setLongitud((Float)newValue);
				return;
			case CoffeeModelingPackage.LOTE__ALTURA:
				setAltura((Float)newValue);
				return;
			case CoffeeModelingPackage.LOTE__TEMPERATURA:
				setTemperatura((Float)newValue);
				return;
			case CoffeeModelingPackage.LOTE__PESO:
				setPeso((Integer)newValue);
				return;
			case CoffeeModelingPackage.LOTE__SIEMBRA:
				getSiembra().clear();
				getSiembra().addAll((Collection<? extends Siembra>)newValue);
				return;
			case CoffeeModelingPackage.LOTE__RECOLECCION:
				getRecoleccion().clear();
				getRecoleccion().addAll((Collection<? extends Recoleccion>)newValue);
				return;
			case CoffeeModelingPackage.LOTE__FLOTES:
				getFlotes().clear();
				getFlotes().addAll((Collection<? extends Flotes>)newValue);
				return;
			case CoffeeModelingPackage.LOTE__DESPULPE:
				getDespulpe().clear();
				getDespulpe().addAll((Collection<? extends Despulpe>)newValue);
				return;
			case CoffeeModelingPackage.LOTE__FERMENTACION:
				getFermentacion().clear();
				getFermentacion().addAll((Collection<? extends Fermentacion>)newValue);
				return;
			case CoffeeModelingPackage.LOTE__LAVADO:
				getLavado().clear();
				getLavado().addAll((Collection<? extends Lavado>)newValue);
				return;
			case CoffeeModelingPackage.LOTE__SECADO:
				getSecado().clear();
				getSecado().addAll((Collection<? extends Secado>)newValue);
				return;
			case CoffeeModelingPackage.LOTE__TRILLA:
				getTrilla().clear();
				getTrilla().addAll((Collection<? extends Trilla>)newValue);
				return;
			case CoffeeModelingPackage.LOTE__SELECCION:
				getSeleccion().clear();
				getSeleccion().addAll((Collection<? extends Seleccion>)newValue);
				return;
			case CoffeeModelingPackage.LOTE__TOSTION:
				getTostion().clear();
				getTostion().addAll((Collection<? extends Tostion>)newValue);
				return;
			case CoffeeModelingPackage.LOTE__MOLIENDA:
				getMolienda().clear();
				getMolienda().addAll((Collection<? extends Molienda>)newValue);
				return;
			case CoffeeModelingPackage.LOTE__EMPAQUE:
				getEmpaque().clear();
				getEmpaque().addAll((Collection<? extends Empaque>)newValue);
				return;
			case CoffeeModelingPackage.LOTE__EMPLEADO:
				getEmpleado().clear();
				getEmpleado().addAll((Collection<? extends Empleado>)newValue);
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
			case CoffeeModelingPackage.LOTE__LATITUD:
				setLatitud(LATITUD_EDEFAULT);
				return;
			case CoffeeModelingPackage.LOTE__LONGITUD:
				setLongitud(LONGITUD_EDEFAULT);
				return;
			case CoffeeModelingPackage.LOTE__ALTURA:
				setAltura(ALTURA_EDEFAULT);
				return;
			case CoffeeModelingPackage.LOTE__TEMPERATURA:
				setTemperatura(TEMPERATURA_EDEFAULT);
				return;
			case CoffeeModelingPackage.LOTE__PESO:
				setPeso(PESO_EDEFAULT);
				return;
			case CoffeeModelingPackage.LOTE__SIEMBRA:
				getSiembra().clear();
				return;
			case CoffeeModelingPackage.LOTE__RECOLECCION:
				getRecoleccion().clear();
				return;
			case CoffeeModelingPackage.LOTE__FLOTES:
				getFlotes().clear();
				return;
			case CoffeeModelingPackage.LOTE__DESPULPE:
				getDespulpe().clear();
				return;
			case CoffeeModelingPackage.LOTE__FERMENTACION:
				getFermentacion().clear();
				return;
			case CoffeeModelingPackage.LOTE__LAVADO:
				getLavado().clear();
				return;
			case CoffeeModelingPackage.LOTE__SECADO:
				getSecado().clear();
				return;
			case CoffeeModelingPackage.LOTE__TRILLA:
				getTrilla().clear();
				return;
			case CoffeeModelingPackage.LOTE__SELECCION:
				getSeleccion().clear();
				return;
			case CoffeeModelingPackage.LOTE__TOSTION:
				getTostion().clear();
				return;
			case CoffeeModelingPackage.LOTE__MOLIENDA:
				getMolienda().clear();
				return;
			case CoffeeModelingPackage.LOTE__EMPAQUE:
				getEmpaque().clear();
				return;
			case CoffeeModelingPackage.LOTE__EMPLEADO:
				getEmpleado().clear();
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
			case CoffeeModelingPackage.LOTE__LATITUD:
				return latitud != LATITUD_EDEFAULT;
			case CoffeeModelingPackage.LOTE__LONGITUD:
				return longitud != LONGITUD_EDEFAULT;
			case CoffeeModelingPackage.LOTE__ALTURA:
				return altura != ALTURA_EDEFAULT;
			case CoffeeModelingPackage.LOTE__TEMPERATURA:
				return temperatura != TEMPERATURA_EDEFAULT;
			case CoffeeModelingPackage.LOTE__PESO:
				return peso != PESO_EDEFAULT;
			case CoffeeModelingPackage.LOTE__SIEMBRA:
				return siembra != null && !siembra.isEmpty();
			case CoffeeModelingPackage.LOTE__RECOLECCION:
				return recoleccion != null && !recoleccion.isEmpty();
			case CoffeeModelingPackage.LOTE__FLOTES:
				return flotes != null && !flotes.isEmpty();
			case CoffeeModelingPackage.LOTE__DESPULPE:
				return despulpe != null && !despulpe.isEmpty();
			case CoffeeModelingPackage.LOTE__FERMENTACION:
				return fermentacion != null && !fermentacion.isEmpty();
			case CoffeeModelingPackage.LOTE__LAVADO:
				return lavado != null && !lavado.isEmpty();
			case CoffeeModelingPackage.LOTE__SECADO:
				return secado != null && !secado.isEmpty();
			case CoffeeModelingPackage.LOTE__TRILLA:
				return trilla != null && !trilla.isEmpty();
			case CoffeeModelingPackage.LOTE__SELECCION:
				return seleccion != null && !seleccion.isEmpty();
			case CoffeeModelingPackage.LOTE__TOSTION:
				return tostion != null && !tostion.isEmpty();
			case CoffeeModelingPackage.LOTE__MOLIENDA:
				return molienda != null && !molienda.isEmpty();
			case CoffeeModelingPackage.LOTE__EMPAQUE:
				return empaque != null && !empaque.isEmpty();
			case CoffeeModelingPackage.LOTE__EMPLEADO:
				return empleado != null && !empleado.isEmpty();
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
		result.append(", latitud: ");
		result.append(latitud);
		result.append(", longitud: ");
		result.append(longitud);
		result.append(", altura: ");
		result.append(altura);
		result.append(", temperatura: ");
		result.append(temperatura);
		result.append(", peso: ");
		result.append(peso);
		result.append(')');
		return result.toString();
	}

} //LoteImpl
