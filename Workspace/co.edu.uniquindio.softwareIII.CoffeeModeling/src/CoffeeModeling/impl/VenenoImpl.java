/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Lote;
import CoffeeModeling.Veneno;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Veneno</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.VenenoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link CoffeeModeling.impl.VenenoImpl#getFechaAplicado <em>Fecha Aplicado</em>}</li>
 *   <li>{@link CoffeeModeling.impl.VenenoImpl#getLoteRelacionado <em>Lote Relacionado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VenenoImpl extends MinimalEObjectImpl.Container implements Veneno {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaAplicado() <em>Fecha Aplicado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaAplicado()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_APLICADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaAplicado() <em>Fecha Aplicado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaAplicado()
	 * @generated
	 * @ordered
	 */
	protected String fechaAplicado = FECHA_APLICADO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoteRelacionado() <em>Lote Relacionado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoteRelacionado()
	 * @generated
	 * @ordered
	 */
	protected Lote loteRelacionado;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VenenoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.VENENO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.VENENO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaAplicado() {
		return fechaAplicado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaAplicado(String newFechaAplicado) {
		String oldFechaAplicado = fechaAplicado;
		fechaAplicado = newFechaAplicado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.VENENO__FECHA_APLICADO, oldFechaAplicado, fechaAplicado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lote getLoteRelacionado() {
		if (loteRelacionado != null && loteRelacionado.eIsProxy()) {
			InternalEObject oldLoteRelacionado = (InternalEObject)loteRelacionado;
			loteRelacionado = (Lote)eResolveProxy(oldLoteRelacionado);
			if (loteRelacionado != oldLoteRelacionado) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoffeeModelingPackage.VENENO__LOTE_RELACIONADO, oldLoteRelacionado, loteRelacionado));
			}
		}
		return loteRelacionado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lote basicGetLoteRelacionado() {
		return loteRelacionado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoteRelacionado(Lote newLoteRelacionado) {
		Lote oldLoteRelacionado = loteRelacionado;
		loteRelacionado = newLoteRelacionado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.VENENO__LOTE_RELACIONADO, oldLoteRelacionado, loteRelacionado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoffeeModelingPackage.VENENO__NOMBRE:
				return getNombre();
			case CoffeeModelingPackage.VENENO__FECHA_APLICADO:
				return getFechaAplicado();
			case CoffeeModelingPackage.VENENO__LOTE_RELACIONADO:
				if (resolve) return getLoteRelacionado();
				return basicGetLoteRelacionado();
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
			case CoffeeModelingPackage.VENENO__NOMBRE:
				setNombre((String)newValue);
				return;
			case CoffeeModelingPackage.VENENO__FECHA_APLICADO:
				setFechaAplicado((String)newValue);
				return;
			case CoffeeModelingPackage.VENENO__LOTE_RELACIONADO:
				setLoteRelacionado((Lote)newValue);
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
			case CoffeeModelingPackage.VENENO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CoffeeModelingPackage.VENENO__FECHA_APLICADO:
				setFechaAplicado(FECHA_APLICADO_EDEFAULT);
				return;
			case CoffeeModelingPackage.VENENO__LOTE_RELACIONADO:
				setLoteRelacionado((Lote)null);
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
			case CoffeeModelingPackage.VENENO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CoffeeModelingPackage.VENENO__FECHA_APLICADO:
				return FECHA_APLICADO_EDEFAULT == null ? fechaAplicado != null : !FECHA_APLICADO_EDEFAULT.equals(fechaAplicado);
			case CoffeeModelingPackage.VENENO__LOTE_RELACIONADO:
				return loteRelacionado != null;
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", fechaAplicado: ");
		result.append(fechaAplicado);
		result.append(')');
		return result.toString();
	}

} //VenenoImpl
