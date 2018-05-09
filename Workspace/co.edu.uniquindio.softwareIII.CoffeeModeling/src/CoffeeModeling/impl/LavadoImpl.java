/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.Agua;
import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Lavado;

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
 * An implementation of the model object '<em><b>Lavado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.LavadoImpl#getTecnica <em>Tecnica</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LavadoImpl#getAguaUsada <em>Agua Usada</em>}</li>
 *   <li>{@link CoffeeModeling.impl.LavadoImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LavadoImpl extends MinimalEObjectImpl.Container implements Lavado {
	/**
	 * The default value of the '{@link #getTecnica() <em>Tecnica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTecnica()
	 * @generated
	 * @ordered
	 */
	protected static final String TECNICA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTecnica() <em>Tecnica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTecnica()
	 * @generated
	 * @ordered
	 */
	protected String tecnica = TECNICA_EDEFAULT;

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
	protected LavadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.LAVADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTecnica() {
		return tecnica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTecnica(String newTecnica) {
		String oldTecnica = tecnica;
		tecnica = newTecnica;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LAVADO__TECNICA, oldTecnica, tecnica));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agua> getAguaUsada() {
		if (aguaUsada == null) {
			aguaUsada = new EObjectContainmentEList<Agua>(Agua.class, this, CoffeeModelingPackage.LAVADO__AGUA_USADA);
		}
		return aguaUsada;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.LAVADO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoffeeModelingPackage.LAVADO__AGUA_USADA:
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
			case CoffeeModelingPackage.LAVADO__TECNICA:
				return getTecnica();
			case CoffeeModelingPackage.LAVADO__AGUA_USADA:
				return getAguaUsada();
			case CoffeeModelingPackage.LAVADO__ID:
				return getId();
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
			case CoffeeModelingPackage.LAVADO__TECNICA:
				setTecnica((String)newValue);
				return;
			case CoffeeModelingPackage.LAVADO__AGUA_USADA:
				getAguaUsada().clear();
				getAguaUsada().addAll((Collection<? extends Agua>)newValue);
				return;
			case CoffeeModelingPackage.LAVADO__ID:
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
			case CoffeeModelingPackage.LAVADO__TECNICA:
				setTecnica(TECNICA_EDEFAULT);
				return;
			case CoffeeModelingPackage.LAVADO__AGUA_USADA:
				getAguaUsada().clear();
				return;
			case CoffeeModelingPackage.LAVADO__ID:
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
			case CoffeeModelingPackage.LAVADO__TECNICA:
				return TECNICA_EDEFAULT == null ? tecnica != null : !TECNICA_EDEFAULT.equals(tecnica);
			case CoffeeModelingPackage.LAVADO__AGUA_USADA:
				return aguaUsada != null && !aguaUsada.isEmpty();
			case CoffeeModelingPackage.LAVADO__ID:
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
		result.append(" (tecnica: ");
		result.append(tecnica);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //LavadoImpl
