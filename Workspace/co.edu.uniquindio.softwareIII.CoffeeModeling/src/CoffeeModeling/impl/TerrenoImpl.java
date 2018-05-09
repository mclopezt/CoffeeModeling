/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Siembra;
import CoffeeModeling.Terreno;
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
 * An implementation of the model object '<em><b>Terreno</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.TerrenoImpl#getSiembra <em>Siembra</em>}</li>
 *   <li>{@link CoffeeModeling.impl.TerrenoImpl#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.impl.TerrenoImpl#getAltura <em>Altura</em>}</li>
 *   <li>{@link CoffeeModeling.impl.TerrenoImpl#getTemperatura <em>Temperatura</em>}</li>
 *   <li>{@link CoffeeModeling.impl.TerrenoImpl#getLongitud <em>Longitud</em>}</li>
 *   <li>{@link CoffeeModeling.impl.TerrenoImpl#getLatitud <em>Latitud</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerrenoImpl extends MinimalEObjectImpl.Container implements Terreno {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerrenoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.TERRENO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Siembra> getSiembra() {
		if (siembra == null) {
			siembra = new EObjectContainmentEList<Siembra>(Siembra.class, this, CoffeeModelingPackage.TERRENO__SIEMBRA);
		}
		return siembra;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.TERRENO__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.TERRENO__ALTURA, oldAltura, altura));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.TERRENO__TEMPERATURA, oldTemperatura, temperatura));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.TERRENO__LONGITUD, oldLongitud, longitud));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.TERRENO__LATITUD, oldLatitud, latitud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoffeeModelingPackage.TERRENO__SIEMBRA:
				return ((InternalEList<?>)getSiembra()).basicRemove(otherEnd, msgs);
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
			case CoffeeModelingPackage.TERRENO__SIEMBRA:
				return getSiembra();
			case CoffeeModelingPackage.TERRENO__ID:
				return getId();
			case CoffeeModelingPackage.TERRENO__ALTURA:
				return getAltura();
			case CoffeeModelingPackage.TERRENO__TEMPERATURA:
				return getTemperatura();
			case CoffeeModelingPackage.TERRENO__LONGITUD:
				return getLongitud();
			case CoffeeModelingPackage.TERRENO__LATITUD:
				return getLatitud();
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
			case CoffeeModelingPackage.TERRENO__SIEMBRA:
				getSiembra().clear();
				getSiembra().addAll((Collection<? extends Siembra>)newValue);
				return;
			case CoffeeModelingPackage.TERRENO__ID:
				setId((String)newValue);
				return;
			case CoffeeModelingPackage.TERRENO__ALTURA:
				setAltura((Float)newValue);
				return;
			case CoffeeModelingPackage.TERRENO__TEMPERATURA:
				setTemperatura((Float)newValue);
				return;
			case CoffeeModelingPackage.TERRENO__LONGITUD:
				setLongitud((Float)newValue);
				return;
			case CoffeeModelingPackage.TERRENO__LATITUD:
				setLatitud((Float)newValue);
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
			case CoffeeModelingPackage.TERRENO__SIEMBRA:
				getSiembra().clear();
				return;
			case CoffeeModelingPackage.TERRENO__ID:
				setId(ID_EDEFAULT);
				return;
			case CoffeeModelingPackage.TERRENO__ALTURA:
				setAltura(ALTURA_EDEFAULT);
				return;
			case CoffeeModelingPackage.TERRENO__TEMPERATURA:
				setTemperatura(TEMPERATURA_EDEFAULT);
				return;
			case CoffeeModelingPackage.TERRENO__LONGITUD:
				setLongitud(LONGITUD_EDEFAULT);
				return;
			case CoffeeModelingPackage.TERRENO__LATITUD:
				setLatitud(LATITUD_EDEFAULT);
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
			case CoffeeModelingPackage.TERRENO__SIEMBRA:
				return siembra != null && !siembra.isEmpty();
			case CoffeeModelingPackage.TERRENO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoffeeModelingPackage.TERRENO__ALTURA:
				return altura != ALTURA_EDEFAULT;
			case CoffeeModelingPackage.TERRENO__TEMPERATURA:
				return temperatura != TEMPERATURA_EDEFAULT;
			case CoffeeModelingPackage.TERRENO__LONGITUD:
				return longitud != LONGITUD_EDEFAULT;
			case CoffeeModelingPackage.TERRENO__LATITUD:
				return latitud != LATITUD_EDEFAULT;
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
		result.append(", altura: ");
		result.append(altura);
		result.append(", temperatura: ");
		result.append(temperatura);
		result.append(", longitud: ");
		result.append(longitud);
		result.append(", latitud: ");
		result.append(latitud);
		result.append(')');
		return result.toString();
	}

} //TerrenoImpl
