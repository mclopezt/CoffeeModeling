/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Despulpe;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Despulpe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.DespulpeImpl#getRefMaquinaria <em>Ref Maquinaria</em>}</li>
 *   <li>{@link CoffeeModeling.impl.DespulpeImpl#getFechaUltimoMantenimiento <em>Fecha Ultimo Mantenimiento</em>}</li>
 *   <li>{@link CoffeeModeling.impl.DespulpeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DespulpeImpl extends MinimalEObjectImpl.Container implements Despulpe {
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
	protected DespulpeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.DESPULPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.DESPULPE__REF_MAQUINARIA, oldRefMaquinaria, refMaquinaria));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.DESPULPE__FECHA_ULTIMO_MANTENIMIENTO, oldFechaUltimoMantenimiento, fechaUltimoMantenimiento));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.DESPULPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoffeeModelingPackage.DESPULPE__REF_MAQUINARIA:
				return getRefMaquinaria();
			case CoffeeModelingPackage.DESPULPE__FECHA_ULTIMO_MANTENIMIENTO:
				return getFechaUltimoMantenimiento();
			case CoffeeModelingPackage.DESPULPE__ID:
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
			case CoffeeModelingPackage.DESPULPE__REF_MAQUINARIA:
				setRefMaquinaria((String)newValue);
				return;
			case CoffeeModelingPackage.DESPULPE__FECHA_ULTIMO_MANTENIMIENTO:
				setFechaUltimoMantenimiento((String)newValue);
				return;
			case CoffeeModelingPackage.DESPULPE__ID:
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
			case CoffeeModelingPackage.DESPULPE__REF_MAQUINARIA:
				setRefMaquinaria(REF_MAQUINARIA_EDEFAULT);
				return;
			case CoffeeModelingPackage.DESPULPE__FECHA_ULTIMO_MANTENIMIENTO:
				setFechaUltimoMantenimiento(FECHA_ULTIMO_MANTENIMIENTO_EDEFAULT);
				return;
			case CoffeeModelingPackage.DESPULPE__ID:
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
			case CoffeeModelingPackage.DESPULPE__REF_MAQUINARIA:
				return REF_MAQUINARIA_EDEFAULT == null ? refMaquinaria != null : !REF_MAQUINARIA_EDEFAULT.equals(refMaquinaria);
			case CoffeeModelingPackage.DESPULPE__FECHA_ULTIMO_MANTENIMIENTO:
				return FECHA_ULTIMO_MANTENIMIENTO_EDEFAULT == null ? fechaUltimoMantenimiento != null : !FECHA_ULTIMO_MANTENIMIENTO_EDEFAULT.equals(fechaUltimoMantenimiento);
			case CoffeeModelingPackage.DESPULPE__ID:
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
		result.append(" (refMaquinaria: ");
		result.append(refMaquinaria);
		result.append(", fechaUltimoMantenimiento: ");
		result.append(fechaUltimoMantenimiento);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DespulpeImpl
