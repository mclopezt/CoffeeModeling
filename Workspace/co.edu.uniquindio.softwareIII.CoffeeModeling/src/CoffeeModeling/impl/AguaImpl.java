/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.Agua;
import CoffeeModeling.CoffeeModelingPackage;

import CoffeeModeling.Lote;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agua</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.AguaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link CoffeeModeling.impl.AguaImpl#getCantidad <em>Cantidad</em>}</li>
 *   <li>{@link CoffeeModeling.impl.AguaImpl#getLoteRelacionado <em>Lote Relacionado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AguaImpl extends MinimalEObjectImpl.Container implements Agua {
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
	 * The default value of the '{@link #getCantidad() <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidad()
	 * @generated
	 * @ordered
	 */
	protected static final float CANTIDAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCantidad() <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidad()
	 * @generated
	 * @ordered
	 */
	protected float cantidad = CANTIDAD_EDEFAULT;

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
	protected AguaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.AGUA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.AGUA__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCantidad() {
		return cantidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCantidad(float newCantidad) {
		float oldCantidad = cantidad;
		cantidad = newCantidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.AGUA__CANTIDAD, oldCantidad, cantidad));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoffeeModelingPackage.AGUA__LOTE_RELACIONADO, oldLoteRelacionado, loteRelacionado));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.AGUA__LOTE_RELACIONADO, oldLoteRelacionado, loteRelacionado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoffeeModelingPackage.AGUA__TIPO:
				return getTipo();
			case CoffeeModelingPackage.AGUA__CANTIDAD:
				return getCantidad();
			case CoffeeModelingPackage.AGUA__LOTE_RELACIONADO:
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
			case CoffeeModelingPackage.AGUA__TIPO:
				setTipo((String)newValue);
				return;
			case CoffeeModelingPackage.AGUA__CANTIDAD:
				setCantidad((Float)newValue);
				return;
			case CoffeeModelingPackage.AGUA__LOTE_RELACIONADO:
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
			case CoffeeModelingPackage.AGUA__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case CoffeeModelingPackage.AGUA__CANTIDAD:
				setCantidad(CANTIDAD_EDEFAULT);
				return;
			case CoffeeModelingPackage.AGUA__LOTE_RELACIONADO:
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
			case CoffeeModelingPackage.AGUA__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case CoffeeModelingPackage.AGUA__CANTIDAD:
				return cantidad != CANTIDAD_EDEFAULT;
			case CoffeeModelingPackage.AGUA__LOTE_RELACIONADO:
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
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(", cantidad: ");
		result.append(cantidad);
		result.append(')');
		return result.toString();
	}

} //AguaImpl
