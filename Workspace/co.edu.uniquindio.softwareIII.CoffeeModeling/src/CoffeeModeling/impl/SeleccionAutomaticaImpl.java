/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.SeleccionAutomatica;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seleccion Automatica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.SeleccionAutomaticaImpl#getRefMaquinaria <em>Ref Maquinaria</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SeleccionAutomaticaImpl#getFechaUltimoMantenimiento <em>Fecha Ultimo Mantenimiento</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeleccionAutomaticaImpl extends MinimalEObjectImpl.Container implements SeleccionAutomatica {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeleccionAutomaticaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.SELECCION_AUTOMATICA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SELECCION_AUTOMATICA__REF_MAQUINARIA, oldRefMaquinaria, refMaquinaria));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SELECCION_AUTOMATICA__FECHA_ULTIMO_MANTENIMIENTO, oldFechaUltimoMantenimiento, fechaUltimoMantenimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoffeeModelingPackage.SELECCION_AUTOMATICA__REF_MAQUINARIA:
				return getRefMaquinaria();
			case CoffeeModelingPackage.SELECCION_AUTOMATICA__FECHA_ULTIMO_MANTENIMIENTO:
				return getFechaUltimoMantenimiento();
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
			case CoffeeModelingPackage.SELECCION_AUTOMATICA__REF_MAQUINARIA:
				setRefMaquinaria((String)newValue);
				return;
			case CoffeeModelingPackage.SELECCION_AUTOMATICA__FECHA_ULTIMO_MANTENIMIENTO:
				setFechaUltimoMantenimiento((String)newValue);
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
			case CoffeeModelingPackage.SELECCION_AUTOMATICA__REF_MAQUINARIA:
				setRefMaquinaria(REF_MAQUINARIA_EDEFAULT);
				return;
			case CoffeeModelingPackage.SELECCION_AUTOMATICA__FECHA_ULTIMO_MANTENIMIENTO:
				setFechaUltimoMantenimiento(FECHA_ULTIMO_MANTENIMIENTO_EDEFAULT);
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
			case CoffeeModelingPackage.SELECCION_AUTOMATICA__REF_MAQUINARIA:
				return REF_MAQUINARIA_EDEFAULT == null ? refMaquinaria != null : !REF_MAQUINARIA_EDEFAULT.equals(refMaquinaria);
			case CoffeeModelingPackage.SELECCION_AUTOMATICA__FECHA_ULTIMO_MANTENIMIENTO:
				return FECHA_ULTIMO_MANTENIMIENTO_EDEFAULT == null ? fechaUltimoMantenimiento != null : !FECHA_ULTIMO_MANTENIMIENTO_EDEFAULT.equals(fechaUltimoMantenimiento);
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
		result.append(" (refMaquinaria: ");
		result.append(refMaquinaria);
		result.append(", fechaUltimoMantenimiento: ");
		result.append(fechaUltimoMantenimiento);
		result.append(')');
		return result.toString();
	}

} //SeleccionAutomaticaImpl
