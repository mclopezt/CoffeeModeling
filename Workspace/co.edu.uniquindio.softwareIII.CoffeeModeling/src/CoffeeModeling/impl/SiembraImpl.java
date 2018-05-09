/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.Abono;
import CoffeeModeling.Agua;
import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Lote;
import CoffeeModeling.Siembra;
import CoffeeModeling.Veneno;

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
 * An implementation of the model object '<em><b>Siembra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.SiembraImpl#getEdadCultivo <em>Edad Cultivo</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SiembraImpl#getFechaInicio <em>Fecha Inicio</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SiembraImpl#getVariedad <em>Variedad</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SiembraImpl#getAbono <em>Abono</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SiembraImpl#getVeneno <em>Veneno</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SiembraImpl#getAguaRiego <em>Agua Riego</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SiembraImpl#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SiembraImpl#getLotes <em>Lotes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiembraImpl extends MinimalEObjectImpl.Container implements Siembra {
	/**
	 * The default value of the '{@link #getEdadCultivo() <em>Edad Cultivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdadCultivo()
	 * @generated
	 * @ordered
	 */
	protected static final int EDAD_CULTIVO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEdadCultivo() <em>Edad Cultivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdadCultivo()
	 * @generated
	 * @ordered
	 */
	protected int edadCultivo = EDAD_CULTIVO_EDEFAULT;

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
	 * The default value of the '{@link #getVariedad() <em>Variedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariedad()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIEDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariedad() <em>Variedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariedad()
	 * @generated
	 * @ordered
	 */
	protected String variedad = VARIEDAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbono() <em>Abono</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbono()
	 * @generated
	 * @ordered
	 */
	protected EList<Abono> abono;

	/**
	 * The cached value of the '{@link #getVeneno() <em>Veneno</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVeneno()
	 * @generated
	 * @ordered
	 */
	protected EList<Veneno> veneno;

	/**
	 * The cached value of the '{@link #getAguaRiego() <em>Agua Riego</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAguaRiego()
	 * @generated
	 * @ordered
	 */
	protected EList<Agua> aguaRiego;

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
	 * The cached value of the '{@link #getLotes() <em>Lotes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Lote> lotes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiembraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.SIEMBRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEdadCultivo() {
		return edadCultivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdadCultivo(int newEdadCultivo) {
		int oldEdadCultivo = edadCultivo;
		edadCultivo = newEdadCultivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SIEMBRA__EDAD_CULTIVO, oldEdadCultivo, edadCultivo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SIEMBRA__FECHA_INICIO, oldFechaInicio, fechaInicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariedad() {
		return variedad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariedad(String newVariedad) {
		String oldVariedad = variedad;
		variedad = newVariedad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SIEMBRA__VARIEDAD, oldVariedad, variedad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Abono> getAbono() {
		if (abono == null) {
			abono = new EObjectContainmentEList<Abono>(Abono.class, this, CoffeeModelingPackage.SIEMBRA__ABONO);
		}
		return abono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Veneno> getVeneno() {
		if (veneno == null) {
			veneno = new EObjectContainmentEList<Veneno>(Veneno.class, this, CoffeeModelingPackage.SIEMBRA__VENENO);
		}
		return veneno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agua> getAguaRiego() {
		if (aguaRiego == null) {
			aguaRiego = new EObjectContainmentEList<Agua>(Agua.class, this, CoffeeModelingPackage.SIEMBRA__AGUA_RIEGO);
		}
		return aguaRiego;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SIEMBRA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lote> getLotes() {
		if (lotes == null) {
			lotes = new EObjectContainmentEList<Lote>(Lote.class, this, CoffeeModelingPackage.SIEMBRA__LOTES);
		}
		return lotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoffeeModelingPackage.SIEMBRA__ABONO:
				return ((InternalEList<?>)getAbono()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.SIEMBRA__VENENO:
				return ((InternalEList<?>)getVeneno()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.SIEMBRA__AGUA_RIEGO:
				return ((InternalEList<?>)getAguaRiego()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.SIEMBRA__LOTES:
				return ((InternalEList<?>)getLotes()).basicRemove(otherEnd, msgs);
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
			case CoffeeModelingPackage.SIEMBRA__EDAD_CULTIVO:
				return getEdadCultivo();
			case CoffeeModelingPackage.SIEMBRA__FECHA_INICIO:
				return getFechaInicio();
			case CoffeeModelingPackage.SIEMBRA__VARIEDAD:
				return getVariedad();
			case CoffeeModelingPackage.SIEMBRA__ABONO:
				return getAbono();
			case CoffeeModelingPackage.SIEMBRA__VENENO:
				return getVeneno();
			case CoffeeModelingPackage.SIEMBRA__AGUA_RIEGO:
				return getAguaRiego();
			case CoffeeModelingPackage.SIEMBRA__ID:
				return getId();
			case CoffeeModelingPackage.SIEMBRA__LOTES:
				return getLotes();
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
			case CoffeeModelingPackage.SIEMBRA__EDAD_CULTIVO:
				setEdadCultivo((Integer)newValue);
				return;
			case CoffeeModelingPackage.SIEMBRA__FECHA_INICIO:
				setFechaInicio((String)newValue);
				return;
			case CoffeeModelingPackage.SIEMBRA__VARIEDAD:
				setVariedad((String)newValue);
				return;
			case CoffeeModelingPackage.SIEMBRA__ABONO:
				getAbono().clear();
				getAbono().addAll((Collection<? extends Abono>)newValue);
				return;
			case CoffeeModelingPackage.SIEMBRA__VENENO:
				getVeneno().clear();
				getVeneno().addAll((Collection<? extends Veneno>)newValue);
				return;
			case CoffeeModelingPackage.SIEMBRA__AGUA_RIEGO:
				getAguaRiego().clear();
				getAguaRiego().addAll((Collection<? extends Agua>)newValue);
				return;
			case CoffeeModelingPackage.SIEMBRA__ID:
				setId((String)newValue);
				return;
			case CoffeeModelingPackage.SIEMBRA__LOTES:
				getLotes().clear();
				getLotes().addAll((Collection<? extends Lote>)newValue);
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
			case CoffeeModelingPackage.SIEMBRA__EDAD_CULTIVO:
				setEdadCultivo(EDAD_CULTIVO_EDEFAULT);
				return;
			case CoffeeModelingPackage.SIEMBRA__FECHA_INICIO:
				setFechaInicio(FECHA_INICIO_EDEFAULT);
				return;
			case CoffeeModelingPackage.SIEMBRA__VARIEDAD:
				setVariedad(VARIEDAD_EDEFAULT);
				return;
			case CoffeeModelingPackage.SIEMBRA__ABONO:
				getAbono().clear();
				return;
			case CoffeeModelingPackage.SIEMBRA__VENENO:
				getVeneno().clear();
				return;
			case CoffeeModelingPackage.SIEMBRA__AGUA_RIEGO:
				getAguaRiego().clear();
				return;
			case CoffeeModelingPackage.SIEMBRA__ID:
				setId(ID_EDEFAULT);
				return;
			case CoffeeModelingPackage.SIEMBRA__LOTES:
				getLotes().clear();
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
			case CoffeeModelingPackage.SIEMBRA__EDAD_CULTIVO:
				return edadCultivo != EDAD_CULTIVO_EDEFAULT;
			case CoffeeModelingPackage.SIEMBRA__FECHA_INICIO:
				return FECHA_INICIO_EDEFAULT == null ? fechaInicio != null : !FECHA_INICIO_EDEFAULT.equals(fechaInicio);
			case CoffeeModelingPackage.SIEMBRA__VARIEDAD:
				return VARIEDAD_EDEFAULT == null ? variedad != null : !VARIEDAD_EDEFAULT.equals(variedad);
			case CoffeeModelingPackage.SIEMBRA__ABONO:
				return abono != null && !abono.isEmpty();
			case CoffeeModelingPackage.SIEMBRA__VENENO:
				return veneno != null && !veneno.isEmpty();
			case CoffeeModelingPackage.SIEMBRA__AGUA_RIEGO:
				return aguaRiego != null && !aguaRiego.isEmpty();
			case CoffeeModelingPackage.SIEMBRA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoffeeModelingPackage.SIEMBRA__LOTES:
				return lotes != null && !lotes.isEmpty();
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
		result.append(" (edadCultivo: ");
		result.append(edadCultivo);
		result.append(", fechaInicio: ");
		result.append(fechaInicio);
		result.append(", variedad: ");
		result.append(variedad);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SiembraImpl
