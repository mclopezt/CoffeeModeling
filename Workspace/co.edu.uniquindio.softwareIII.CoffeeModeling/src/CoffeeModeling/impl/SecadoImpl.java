/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Secado;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.SecadoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SecadoImpl#getHoraSol <em>Hora Sol</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SecadoImpl#getHoraSombra <em>Hora Sombra</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SecadoImpl#getHoraAlmacenamiento <em>Hora Almacenamiento</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SecadoImpl#getHumedad <em>Humedad</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SecadoImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecadoImpl extends MinimalEObjectImpl.Container implements Secado {
	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoraSol() <em>Hora Sol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraSol()
	 * @generated
	 * @ordered
	 */
	protected static final String HORA_SOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHoraSol() <em>Hora Sol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraSol()
	 * @generated
	 * @ordered
	 */
	protected String horaSol = HORA_SOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoraSombra() <em>Hora Sombra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraSombra()
	 * @generated
	 * @ordered
	 */
	protected static final String HORA_SOMBRA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHoraSombra() <em>Hora Sombra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraSombra()
	 * @generated
	 * @ordered
	 */
	protected String horaSombra = HORA_SOMBRA_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoraAlmacenamiento() <em>Hora Almacenamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraAlmacenamiento()
	 * @generated
	 * @ordered
	 */
	protected static final String HORA_ALMACENAMIENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHoraAlmacenamiento() <em>Hora Almacenamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraAlmacenamiento()
	 * @generated
	 * @ordered
	 */
	protected String horaAlmacenamiento = HORA_ALMACENAMIENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getHumedad() <em>Humedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumedad()
	 * @generated
	 * @ordered
	 */
	protected static final float HUMEDAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHumedad() <em>Humedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumedad()
	 * @generated
	 * @ordered
	 */
	protected float humedad = HUMEDAD_EDEFAULT;

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
	protected SecadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.SECADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SECADO__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHoraSol() {
		return horaSol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoraSol(String newHoraSol) {
		String oldHoraSol = horaSol;
		horaSol = newHoraSol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SECADO__HORA_SOL, oldHoraSol, horaSol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHoraSombra() {
		return horaSombra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoraSombra(String newHoraSombra) {
		String oldHoraSombra = horaSombra;
		horaSombra = newHoraSombra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SECADO__HORA_SOMBRA, oldHoraSombra, horaSombra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHoraAlmacenamiento() {
		return horaAlmacenamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoraAlmacenamiento(String newHoraAlmacenamiento) {
		String oldHoraAlmacenamiento = horaAlmacenamiento;
		horaAlmacenamiento = newHoraAlmacenamiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SECADO__HORA_ALMACENAMIENTO, oldHoraAlmacenamiento, horaAlmacenamiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHumedad() {
		return humedad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumedad(float newHumedad) {
		float oldHumedad = humedad;
		humedad = newHumedad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SECADO__HUMEDAD, oldHumedad, humedad));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SECADO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoffeeModelingPackage.SECADO__TIPO:
				return getTipo();
			case CoffeeModelingPackage.SECADO__HORA_SOL:
				return getHoraSol();
			case CoffeeModelingPackage.SECADO__HORA_SOMBRA:
				return getHoraSombra();
			case CoffeeModelingPackage.SECADO__HORA_ALMACENAMIENTO:
				return getHoraAlmacenamiento();
			case CoffeeModelingPackage.SECADO__HUMEDAD:
				return getHumedad();
			case CoffeeModelingPackage.SECADO__ID:
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
			case CoffeeModelingPackage.SECADO__TIPO:
				setTipo((String)newValue);
				return;
			case CoffeeModelingPackage.SECADO__HORA_SOL:
				setHoraSol((String)newValue);
				return;
			case CoffeeModelingPackage.SECADO__HORA_SOMBRA:
				setHoraSombra((String)newValue);
				return;
			case CoffeeModelingPackage.SECADO__HORA_ALMACENAMIENTO:
				setHoraAlmacenamiento((String)newValue);
				return;
			case CoffeeModelingPackage.SECADO__HUMEDAD:
				setHumedad((Float)newValue);
				return;
			case CoffeeModelingPackage.SECADO__ID:
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
			case CoffeeModelingPackage.SECADO__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case CoffeeModelingPackage.SECADO__HORA_SOL:
				setHoraSol(HORA_SOL_EDEFAULT);
				return;
			case CoffeeModelingPackage.SECADO__HORA_SOMBRA:
				setHoraSombra(HORA_SOMBRA_EDEFAULT);
				return;
			case CoffeeModelingPackage.SECADO__HORA_ALMACENAMIENTO:
				setHoraAlmacenamiento(HORA_ALMACENAMIENTO_EDEFAULT);
				return;
			case CoffeeModelingPackage.SECADO__HUMEDAD:
				setHumedad(HUMEDAD_EDEFAULT);
				return;
			case CoffeeModelingPackage.SECADO__ID:
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
			case CoffeeModelingPackage.SECADO__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case CoffeeModelingPackage.SECADO__HORA_SOL:
				return HORA_SOL_EDEFAULT == null ? horaSol != null : !HORA_SOL_EDEFAULT.equals(horaSol);
			case CoffeeModelingPackage.SECADO__HORA_SOMBRA:
				return HORA_SOMBRA_EDEFAULT == null ? horaSombra != null : !HORA_SOMBRA_EDEFAULT.equals(horaSombra);
			case CoffeeModelingPackage.SECADO__HORA_ALMACENAMIENTO:
				return HORA_ALMACENAMIENTO_EDEFAULT == null ? horaAlmacenamiento != null : !HORA_ALMACENAMIENTO_EDEFAULT.equals(horaAlmacenamiento);
			case CoffeeModelingPackage.SECADO__HUMEDAD:
				return humedad != HUMEDAD_EDEFAULT;
			case CoffeeModelingPackage.SECADO__ID:
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
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(", horaSol: ");
		result.append(horaSol);
		result.append(", horaSombra: ");
		result.append(horaSombra);
		result.append(", horaAlmacenamiento: ");
		result.append(horaAlmacenamiento);
		result.append(", humedad: ");
		result.append(humedad);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SecadoImpl
