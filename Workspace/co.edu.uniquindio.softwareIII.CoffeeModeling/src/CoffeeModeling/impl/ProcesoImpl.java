/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Proceso;
import CoffeeModeling.Procesos;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proceso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.ProcesoImpl#getNombreProceso <em>Nombre Proceso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcesoImpl extends MinimalEObjectImpl.Container implements Proceso {
	/**
	 * The default value of the '{@link #getNombreProceso() <em>Nombre Proceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreProceso()
	 * @generated
	 * @ordered
	 */
	protected static final Procesos NOMBRE_PROCESO_EDEFAULT = Procesos.SIEMBRA;

	/**
	 * The cached value of the '{@link #getNombreProceso() <em>Nombre Proceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreProceso()
	 * @generated
	 * @ordered
	 */
	protected Procesos nombreProceso = NOMBRE_PROCESO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcesoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.PROCESO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procesos getNombreProceso() {
		return nombreProceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreProceso(Procesos newNombreProceso) {
		Procesos oldNombreProceso = nombreProceso;
		nombreProceso = newNombreProceso == null ? NOMBRE_PROCESO_EDEFAULT : newNombreProceso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PROCESO__NOMBRE_PROCESO, oldNombreProceso, nombreProceso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoffeeModelingPackage.PROCESO__NOMBRE_PROCESO:
				return getNombreProceso();
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
			case CoffeeModelingPackage.PROCESO__NOMBRE_PROCESO:
				setNombreProceso((Procesos)newValue);
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
			case CoffeeModelingPackage.PROCESO__NOMBRE_PROCESO:
				setNombreProceso(NOMBRE_PROCESO_EDEFAULT);
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
			case CoffeeModelingPackage.PROCESO__NOMBRE_PROCESO:
				return nombreProceso != NOMBRE_PROCESO_EDEFAULT;
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
		result.append(" (nombreProceso: ");
		result.append(nombreProceso);
		result.append(')');
		return result.toString();
	}

} //ProcesoImpl
