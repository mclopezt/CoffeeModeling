/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Empleado;
import CoffeeModeling.Proceso;

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
 * An implementation of the model object '<em><b>Empleado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.EmpleadoImpl#getNombreCompleto <em>Nombre Completo</em>}</li>
 *   <li>{@link CoffeeModeling.impl.EmpleadoImpl#getTiempoExperiencia <em>Tiempo Experiencia</em>}</li>
 *   <li>{@link CoffeeModeling.impl.EmpleadoImpl#getPoblacion <em>Poblacion</em>}</li>
 *   <li>{@link CoffeeModeling.impl.EmpleadoImpl#getProcesoEnQueParticipa <em>Proceso En Que Participa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmpleadoImpl extends MinimalEObjectImpl.Container implements Empleado {
	/**
	 * The default value of the '{@link #getNombreCompleto() <em>Nombre Completo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCompleto()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_COMPLETO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreCompleto() <em>Nombre Completo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCompleto()
	 * @generated
	 * @ordered
	 */
	protected String nombreCompleto = NOMBRE_COMPLETO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTiempoExperiencia() <em>Tiempo Experiencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiempoExperiencia()
	 * @generated
	 * @ordered
	 */
	protected static final String TIEMPO_EXPERIENCIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTiempoExperiencia() <em>Tiempo Experiencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiempoExperiencia()
	 * @generated
	 * @ordered
	 */
	protected String tiempoExperiencia = TIEMPO_EXPERIENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoblacion() <em>Poblacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoblacion()
	 * @generated
	 * @ordered
	 */
	protected static final String POBLACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoblacion() <em>Poblacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoblacion()
	 * @generated
	 * @ordered
	 */
	protected String poblacion = POBLACION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcesoEnQueParticipa() <em>Proceso En Que Participa</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesoEnQueParticipa()
	 * @generated
	 * @ordered
	 */
	protected EList<Proceso> procesoEnQueParticipa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmpleadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.EMPLEADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreCompleto(String newNombreCompleto) {
		String oldNombreCompleto = nombreCompleto;
		nombreCompleto = newNombreCompleto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.EMPLEADO__NOMBRE_COMPLETO, oldNombreCompleto, nombreCompleto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTiempoExperiencia() {
		return tiempoExperiencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiempoExperiencia(String newTiempoExperiencia) {
		String oldTiempoExperiencia = tiempoExperiencia;
		tiempoExperiencia = newTiempoExperiencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.EMPLEADO__TIEMPO_EXPERIENCIA, oldTiempoExperiencia, tiempoExperiencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPoblacion() {
		return poblacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoblacion(String newPoblacion) {
		String oldPoblacion = poblacion;
		poblacion = newPoblacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.EMPLEADO__POBLACION, oldPoblacion, poblacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Proceso> getProcesoEnQueParticipa() {
		if (procesoEnQueParticipa == null) {
			procesoEnQueParticipa = new EObjectContainmentEList<Proceso>(Proceso.class, this, CoffeeModelingPackage.EMPLEADO__PROCESO_EN_QUE_PARTICIPA);
		}
		return procesoEnQueParticipa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoffeeModelingPackage.EMPLEADO__PROCESO_EN_QUE_PARTICIPA:
				return ((InternalEList<?>)getProcesoEnQueParticipa()).basicRemove(otherEnd, msgs);
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
			case CoffeeModelingPackage.EMPLEADO__NOMBRE_COMPLETO:
				return getNombreCompleto();
			case CoffeeModelingPackage.EMPLEADO__TIEMPO_EXPERIENCIA:
				return getTiempoExperiencia();
			case CoffeeModelingPackage.EMPLEADO__POBLACION:
				return getPoblacion();
			case CoffeeModelingPackage.EMPLEADO__PROCESO_EN_QUE_PARTICIPA:
				return getProcesoEnQueParticipa();
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
			case CoffeeModelingPackage.EMPLEADO__NOMBRE_COMPLETO:
				setNombreCompleto((String)newValue);
				return;
			case CoffeeModelingPackage.EMPLEADO__TIEMPO_EXPERIENCIA:
				setTiempoExperiencia((String)newValue);
				return;
			case CoffeeModelingPackage.EMPLEADO__POBLACION:
				setPoblacion((String)newValue);
				return;
			case CoffeeModelingPackage.EMPLEADO__PROCESO_EN_QUE_PARTICIPA:
				getProcesoEnQueParticipa().clear();
				getProcesoEnQueParticipa().addAll((Collection<? extends Proceso>)newValue);
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
			case CoffeeModelingPackage.EMPLEADO__NOMBRE_COMPLETO:
				setNombreCompleto(NOMBRE_COMPLETO_EDEFAULT);
				return;
			case CoffeeModelingPackage.EMPLEADO__TIEMPO_EXPERIENCIA:
				setTiempoExperiencia(TIEMPO_EXPERIENCIA_EDEFAULT);
				return;
			case CoffeeModelingPackage.EMPLEADO__POBLACION:
				setPoblacion(POBLACION_EDEFAULT);
				return;
			case CoffeeModelingPackage.EMPLEADO__PROCESO_EN_QUE_PARTICIPA:
				getProcesoEnQueParticipa().clear();
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
			case CoffeeModelingPackage.EMPLEADO__NOMBRE_COMPLETO:
				return NOMBRE_COMPLETO_EDEFAULT == null ? nombreCompleto != null : !NOMBRE_COMPLETO_EDEFAULT.equals(nombreCompleto);
			case CoffeeModelingPackage.EMPLEADO__TIEMPO_EXPERIENCIA:
				return TIEMPO_EXPERIENCIA_EDEFAULT == null ? tiempoExperiencia != null : !TIEMPO_EXPERIENCIA_EDEFAULT.equals(tiempoExperiencia);
			case CoffeeModelingPackage.EMPLEADO__POBLACION:
				return POBLACION_EDEFAULT == null ? poblacion != null : !POBLACION_EDEFAULT.equals(poblacion);
			case CoffeeModelingPackage.EMPLEADO__PROCESO_EN_QUE_PARTICIPA:
				return procesoEnQueParticipa != null && !procesoEnQueParticipa.isEmpty();
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
		result.append(" (nombreCompleto: ");
		result.append(nombreCompleto);
		result.append(", tiempoExperiencia: ");
		result.append(tiempoExperiencia);
		result.append(", poblacion: ");
		result.append(poblacion);
		result.append(')');
		return result.toString();
	}

} //EmpleadoImpl
