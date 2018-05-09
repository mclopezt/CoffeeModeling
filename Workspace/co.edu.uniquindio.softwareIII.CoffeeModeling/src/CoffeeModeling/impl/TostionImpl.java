/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Tostion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tostion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.TostionImpl#getHoras <em>Horas</em>}</li>
 *   <li>{@link CoffeeModeling.impl.TostionImpl#getTemperatura <em>Temperatura</em>}</li>
 *   <li>{@link CoffeeModeling.impl.TostionImpl#getRefMaquinaria <em>Ref Maquinaria</em>}</li>
 *   <li>{@link CoffeeModeling.impl.TostionImpl#getFechaUltimoMantenimiento <em>Fecha Ultimo Mantenimiento</em>}</li>
 *   <li>{@link CoffeeModeling.impl.TostionImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TostionImpl extends MinimalEObjectImpl.Container implements Tostion {
	/**
	 * The default value of the '{@link #getHoras() <em>Horas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoras()
	 * @generated
	 * @ordered
	 */
	protected static final String HORAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHoras() <em>Horas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoras()
	 * @generated
	 * @ordered
	 */
	protected String horas = HORAS_EDEFAULT;

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
	 * The default value of the '{@link #getRefMaquinaria() <em>Ref Maquinaria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefMaquinaria()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_MAQUINARIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefMaquinaria() <em>Ref Maquinaria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefMaquinaria()
	 * @generated
	 * @ordered
	 */
	protected String refMaquinaria = REF_MAQUINARIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaUltimoMantenimiento() <em>Fecha Ultimo Mantenimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaUltimoMantenimiento()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_ULTIMO_MANTENIMIENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaUltimoMantenimiento() <em>Fecha Ultimo Mantenimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaUltimoMantenimiento()
	 * @generated
	 * @ordered
	 */
	protected String fechaUltimoMantenimiento = FECHA_ULTIMO_MANTENIMIENTO_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TostionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.TOSTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHoras() {
		return horas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoras(String newHoras) {
		String oldHoras = horas;
		horas = newHoras;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.TOSTION__HORAS, oldHoras, horas));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.TOSTION__TEMPERATURA, oldTemperatura, temperatura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefMaquinaria() {
		return refMaquinaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefMaquinaria(String newRefMaquinaria) {
		String oldRefMaquinaria = refMaquinaria;
		refMaquinaria = newRefMaquinaria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.TOSTION__REF_MAQUINARIA, oldRefMaquinaria, refMaquinaria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaUltimoMantenimiento() {
		return fechaUltimoMantenimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaUltimoMantenimiento(String newFechaUltimoMantenimiento) {
		String oldFechaUltimoMantenimiento = fechaUltimoMantenimiento;
		fechaUltimoMantenimiento = newFechaUltimoMantenimiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.TOSTION__FECHA_ULTIMO_MANTENIMIENTO, oldFechaUltimoMantenimiento, fechaUltimoMantenimiento));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.TOSTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoffeeModelingPackage.TOSTION__HORAS:
				return getHoras();
			case CoffeeModelingPackage.TOSTION__TEMPERATURA:
				return getTemperatura();
			case CoffeeModelingPackage.TOSTION__REF_MAQUINARIA:
				return getRefMaquinaria();
			case CoffeeModelingPackage.TOSTION__FECHA_ULTIMO_MANTENIMIENTO:
				return getFechaUltimoMantenimiento();
			case CoffeeModelingPackage.TOSTION__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoffeeModelingPackage.TOSTION__HORAS:
				setHoras((String)newValue);
				return;
			case CoffeeModelingPackage.TOSTION__TEMPERATURA:
				setTemperatura((Float)newValue);
				return;
			case CoffeeModelingPackage.TOSTION__REF_MAQUINARIA:
				setRefMaquinaria((String)newValue);
				return;
			case CoffeeModelingPackage.TOSTION__FECHA_ULTIMO_MANTENIMIENTO:
				setFechaUltimoMantenimiento((String)newValue);
				return;
			case CoffeeModelingPackage.TOSTION__ID:
				setId((String)newValue);
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
			case CoffeeModelingPackage.TOSTION__HORAS:
				setHoras(HORAS_EDEFAULT);
				return;
			case CoffeeModelingPackage.TOSTION__TEMPERATURA:
				setTemperatura(TEMPERATURA_EDEFAULT);
				return;
			case CoffeeModelingPackage.TOSTION__REF_MAQUINARIA:
				setRefMaquinaria(REF_MAQUINARIA_EDEFAULT);
				return;
			case CoffeeModelingPackage.TOSTION__FECHA_ULTIMO_MANTENIMIENTO:
				setFechaUltimoMantenimiento(FECHA_ULTIMO_MANTENIMIENTO_EDEFAULT);
				return;
			case CoffeeModelingPackage.TOSTION__ID:
				setId(ID_EDEFAULT);
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
			case CoffeeModelingPackage.TOSTION__HORAS:
				return HORAS_EDEFAULT == null ? horas != null : !HORAS_EDEFAULT.equals(horas);
			case CoffeeModelingPackage.TOSTION__TEMPERATURA:
				return temperatura != TEMPERATURA_EDEFAULT;
			case CoffeeModelingPackage.TOSTION__REF_MAQUINARIA:
				return REF_MAQUINARIA_EDEFAULT == null ? refMaquinaria != null : !REF_MAQUINARIA_EDEFAULT.equals(refMaquinaria);
			case CoffeeModelingPackage.TOSTION__FECHA_ULTIMO_MANTENIMIENTO:
				return FECHA_ULTIMO_MANTENIMIENTO_EDEFAULT == null ? fechaUltimoMantenimiento != null : !FECHA_ULTIMO_MANTENIMIENTO_EDEFAULT.equals(fechaUltimoMantenimiento);
			case CoffeeModelingPackage.TOSTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (horas: ");
		result.append(horas);
		result.append(", temperatura: ");
		result.append(temperatura);
		result.append(", refMaquinaria: ");
		result.append(refMaquinaria);
		result.append(", fechaUltimoMantenimiento: ");
		result.append(fechaUltimoMantenimiento);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TostionImpl
