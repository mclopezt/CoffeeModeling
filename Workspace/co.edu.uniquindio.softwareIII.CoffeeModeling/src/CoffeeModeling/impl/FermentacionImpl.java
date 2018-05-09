/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Fermentacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fermentacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.FermentacionImpl#getAltitud <em>Altitud</em>}</li>
 *   <li>{@link CoffeeModeling.impl.FermentacionImpl#getTemperatura <em>Temperatura</em>}</li>
 *   <li>{@link CoffeeModeling.impl.FermentacionImpl#getHoraSol <em>Hora Sol</em>}</li>
 *   <li>{@link CoffeeModeling.impl.FermentacionImpl#getHoraSombra <em>Hora Sombra</em>}</li>
 *   <li>{@link CoffeeModeling.impl.FermentacionImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FermentacionImpl extends MinimalEObjectImpl.Container implements Fermentacion {
	/**
	 * The default value of the '{@link #getAltitud() <em>Altitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitud()
	 * @generated
	 * @ordered
	 */
	protected static final float ALTITUD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAltitud() <em>Altitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitud()
	 * @generated
	 * @ordered
	 */
	protected float altitud = ALTITUD_EDEFAULT;

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
	protected FermentacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.FERMENTACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAltitud() {
		return altitud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitud(float newAltitud) {
		float oldAltitud = altitud;
		altitud = newAltitud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.FERMENTACION__ALTITUD, oldAltitud, altitud));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.FERMENTACION__TEMPERATURA, oldTemperatura, temperatura));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.FERMENTACION__HORA_SOL, oldHoraSol, horaSol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.FERMENTACION__HORA_SOMBRA, oldHoraSombra, horaSombra));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.FERMENTACION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoffeeModelingPackage.FERMENTACION__ALTITUD:
				return getAltitud();
			case CoffeeModelingPackage.FERMENTACION__TEMPERATURA:
				return getTemperatura();
			case CoffeeModelingPackage.FERMENTACION__HORA_SOL:
				return getHoraSol();
			case CoffeeModelingPackage.FERMENTACION__HORA_SOMBRA:
				return getHoraSombra();
			case CoffeeModelingPackage.FERMENTACION__ID:
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
			case CoffeeModelingPackage.FERMENTACION__ALTITUD:
				setAltitud((Float)newValue);
				return;
			case CoffeeModelingPackage.FERMENTACION__TEMPERATURA:
				setTemperatura((Float)newValue);
				return;
			case CoffeeModelingPackage.FERMENTACION__HORA_SOL:
				setHoraSol((String)newValue);
				return;
			case CoffeeModelingPackage.FERMENTACION__HORA_SOMBRA:
				setHoraSombra((String)newValue);
				return;
			case CoffeeModelingPackage.FERMENTACION__ID:
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
			case CoffeeModelingPackage.FERMENTACION__ALTITUD:
				setAltitud(ALTITUD_EDEFAULT);
				return;
			case CoffeeModelingPackage.FERMENTACION__TEMPERATURA:
				setTemperatura(TEMPERATURA_EDEFAULT);
				return;
			case CoffeeModelingPackage.FERMENTACION__HORA_SOL:
				setHoraSol(HORA_SOL_EDEFAULT);
				return;
			case CoffeeModelingPackage.FERMENTACION__HORA_SOMBRA:
				setHoraSombra(HORA_SOMBRA_EDEFAULT);
				return;
			case CoffeeModelingPackage.FERMENTACION__ID:
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
			case CoffeeModelingPackage.FERMENTACION__ALTITUD:
				return altitud != ALTITUD_EDEFAULT;
			case CoffeeModelingPackage.FERMENTACION__TEMPERATURA:
				return temperatura != TEMPERATURA_EDEFAULT;
			case CoffeeModelingPackage.FERMENTACION__HORA_SOL:
				return HORA_SOL_EDEFAULT == null ? horaSol != null : !HORA_SOL_EDEFAULT.equals(horaSol);
			case CoffeeModelingPackage.FERMENTACION__HORA_SOMBRA:
				return HORA_SOMBRA_EDEFAULT == null ? horaSombra != null : !HORA_SOMBRA_EDEFAULT.equals(horaSombra);
			case CoffeeModelingPackage.FERMENTACION__ID:
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
		result.append(" (altitud: ");
		result.append(altitud);
		result.append(", temperatura: ");
		result.append(temperatura);
		result.append(", horaSol: ");
		result.append(horaSol);
		result.append(", horaSombra: ");
		result.append(horaSombra);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //FermentacionImpl
