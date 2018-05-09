/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Trilla;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trilla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.TrillaImpl#getTecnicaEmpleada <em>Tecnica Empleada</em>}</li>
 *   <li>{@link CoffeeModeling.impl.TrillaImpl#getMalla <em>Malla</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrillaImpl extends MinimalEObjectImpl.Container implements Trilla {
	/**
	 * The default value of the '{@link #getTecnicaEmpleada() <em>Tecnica Empleada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTecnicaEmpleada()
	 * @generated
	 * @ordered
	 */
	protected static final String TECNICA_EMPLEADA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTecnicaEmpleada() <em>Tecnica Empleada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTecnicaEmpleada()
	 * @generated
	 * @ordered
	 */
	protected String tecnicaEmpleada = TECNICA_EMPLEADA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMalla() <em>Malla</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMalla()
	 * @generated
	 * @ordered
	 */
	protected static final int MALLA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMalla() <em>Malla</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMalla()
	 * @generated
	 * @ordered
	 */
	protected int malla = MALLA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrillaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.TRILLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTecnicaEmpleada() {
		return tecnicaEmpleada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTecnicaEmpleada(String newTecnicaEmpleada) {
		String oldTecnicaEmpleada = tecnicaEmpleada;
		tecnicaEmpleada = newTecnicaEmpleada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.TRILLA__TECNICA_EMPLEADA, oldTecnicaEmpleada, tecnicaEmpleada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMalla() {
		return malla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMalla(int newMalla) {
		int oldMalla = malla;
		malla = newMalla;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.TRILLA__MALLA, oldMalla, malla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoffeeModelingPackage.TRILLA__TECNICA_EMPLEADA:
				return getTecnicaEmpleada();
			case CoffeeModelingPackage.TRILLA__MALLA:
				return getMalla();
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
			case CoffeeModelingPackage.TRILLA__TECNICA_EMPLEADA:
				setTecnicaEmpleada((String)newValue);
				return;
			case CoffeeModelingPackage.TRILLA__MALLA:
				setMalla((Integer)newValue);
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
			case CoffeeModelingPackage.TRILLA__TECNICA_EMPLEADA:
				setTecnicaEmpleada(TECNICA_EMPLEADA_EDEFAULT);
				return;
			case CoffeeModelingPackage.TRILLA__MALLA:
				setMalla(MALLA_EDEFAULT);
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
			case CoffeeModelingPackage.TRILLA__TECNICA_EMPLEADA:
				return TECNICA_EMPLEADA_EDEFAULT == null ? tecnicaEmpleada != null : !TECNICA_EMPLEADA_EDEFAULT.equals(tecnicaEmpleada);
			case CoffeeModelingPackage.TRILLA__MALLA:
				return malla != MALLA_EDEFAULT;
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
		result.append(" (tecnicaEmpleada: ");
		result.append(tecnicaEmpleada);
		result.append(", malla: ");
		result.append(malla);
		result.append(')');
		return result.toString();
	}

} //TrillaImpl
