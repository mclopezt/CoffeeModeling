/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.Agua;
import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Flotes;

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
 * An implementation of the model object '<em><b>Flotes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.FlotesImpl#getCantGranoDefectuoso <em>Cant Grano Defectuoso</em>}</li>
 *   <li>{@link CoffeeModeling.impl.FlotesImpl#getAguaUsada <em>Agua Usada</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlotesImpl extends MinimalEObjectImpl.Container implements Flotes {
	/**
	 * The default value of the '{@link #getCantGranoDefectuoso() <em>Cant Grano Defectuoso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantGranoDefectuoso()
	 * @generated
	 * @ordered
	 */
	protected static final int CANT_GRANO_DEFECTUOSO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCantGranoDefectuoso() <em>Cant Grano Defectuoso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantGranoDefectuoso()
	 * @generated
	 * @ordered
	 */
	protected int cantGranoDefectuoso = CANT_GRANO_DEFECTUOSO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAguaUsada() <em>Agua Usada</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAguaUsada()
	 * @generated
	 * @ordered
	 */
	protected EList<Agua> aguaUsada;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlotesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.FLOTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCantGranoDefectuoso() {
		return cantGranoDefectuoso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCantGranoDefectuoso(int newCantGranoDefectuoso) {
		int oldCantGranoDefectuoso = cantGranoDefectuoso;
		cantGranoDefectuoso = newCantGranoDefectuoso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.FLOTES__CANT_GRANO_DEFECTUOSO, oldCantGranoDefectuoso, cantGranoDefectuoso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agua> getAguaUsada() {
		if (aguaUsada == null) {
			aguaUsada = new EObjectContainmentEList<Agua>(Agua.class, this, CoffeeModelingPackage.FLOTES__AGUA_USADA);
		}
		return aguaUsada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoffeeModelingPackage.FLOTES__AGUA_USADA:
				return ((InternalEList<?>)getAguaUsada()).basicRemove(otherEnd, msgs);
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
			case CoffeeModelingPackage.FLOTES__CANT_GRANO_DEFECTUOSO:
				return getCantGranoDefectuoso();
			case CoffeeModelingPackage.FLOTES__AGUA_USADA:
				return getAguaUsada();
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
			case CoffeeModelingPackage.FLOTES__CANT_GRANO_DEFECTUOSO:
				setCantGranoDefectuoso((Integer)newValue);
				return;
			case CoffeeModelingPackage.FLOTES__AGUA_USADA:
				getAguaUsada().clear();
				getAguaUsada().addAll((Collection<? extends Agua>)newValue);
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
			case CoffeeModelingPackage.FLOTES__CANT_GRANO_DEFECTUOSO:
				setCantGranoDefectuoso(CANT_GRANO_DEFECTUOSO_EDEFAULT);
				return;
			case CoffeeModelingPackage.FLOTES__AGUA_USADA:
				getAguaUsada().clear();
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
			case CoffeeModelingPackage.FLOTES__CANT_GRANO_DEFECTUOSO:
				return cantGranoDefectuoso != CANT_GRANO_DEFECTUOSO_EDEFAULT;
			case CoffeeModelingPackage.FLOTES__AGUA_USADA:
				return aguaUsada != null && !aguaUsada.isEmpty();
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
		result.append(" (cantGranoDefectuoso: ");
		result.append(cantGranoDefectuoso);
		result.append(')');
		return result.toString();
	}

} //FlotesImpl
