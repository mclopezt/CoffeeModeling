/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Defecto;
import CoffeeModeling.Seleccion;
import CoffeeModeling.SeleccionAutomatica;

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
 * An implementation of the model object '<em><b>Seleccion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.SeleccionImpl#getMetodo <em>Metodo</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SeleccionImpl#getDiasAlmacenamiento <em>Dias Almacenamiento</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SeleccionImpl#getDefecto <em>Defecto</em>}</li>
 *   <li>{@link CoffeeModeling.impl.SeleccionImpl#getSeleccionautomatica <em>Seleccionautomatica</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeleccionImpl extends MinimalEObjectImpl.Container implements Seleccion {
	/**
	 * The default value of the '{@link #getMetodo() <em>Metodo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetodo()
	 * @generated
	 * @ordered
	 */
	protected static final String METODO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetodo() <em>Metodo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetodo()
	 * @generated
	 * @ordered
	 */
	protected String metodo = METODO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiasAlmacenamiento() <em>Dias Almacenamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiasAlmacenamiento()
	 * @generated
	 * @ordered
	 */
	protected static final int DIAS_ALMACENAMIENTO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDiasAlmacenamiento() <em>Dias Almacenamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiasAlmacenamiento()
	 * @generated
	 * @ordered
	 */
	protected int diasAlmacenamiento = DIAS_ALMACENAMIENTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefecto() <em>Defecto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefecto()
	 * @generated
	 * @ordered
	 */
	protected EList<Defecto> defecto;

	/**
	 * The cached value of the '{@link #getSeleccionautomatica() <em>Seleccionautomatica</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeleccionautomatica()
	 * @generated
	 * @ordered
	 */
	protected EList<SeleccionAutomatica> seleccionautomatica;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeleccionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.SELECCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetodo() {
		return metodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetodo(String newMetodo) {
		String oldMetodo = metodo;
		metodo = newMetodo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SELECCION__METODO, oldMetodo, metodo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDiasAlmacenamiento() {
		return diasAlmacenamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiasAlmacenamiento(int newDiasAlmacenamiento) {
		int oldDiasAlmacenamiento = diasAlmacenamiento;
		diasAlmacenamiento = newDiasAlmacenamiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.SELECCION__DIAS_ALMACENAMIENTO, oldDiasAlmacenamiento, diasAlmacenamiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Defecto> getDefecto() {
		if (defecto == null) {
			defecto = new EObjectContainmentEList<Defecto>(Defecto.class, this, CoffeeModelingPackage.SELECCION__DEFECTO);
		}
		return defecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SeleccionAutomatica> getSeleccionautomatica() {
		if (seleccionautomatica == null) {
			seleccionautomatica = new EObjectContainmentEList<SeleccionAutomatica>(SeleccionAutomatica.class, this, CoffeeModelingPackage.SELECCION__SELECCIONAUTOMATICA);
		}
		return seleccionautomatica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoffeeModelingPackage.SELECCION__DEFECTO:
				return ((InternalEList<?>)getDefecto()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.SELECCION__SELECCIONAUTOMATICA:
				return ((InternalEList<?>)getSeleccionautomatica()).basicRemove(otherEnd, msgs);
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
			case CoffeeModelingPackage.SELECCION__METODO:
				return getMetodo();
			case CoffeeModelingPackage.SELECCION__DIAS_ALMACENAMIENTO:
				return getDiasAlmacenamiento();
			case CoffeeModelingPackage.SELECCION__DEFECTO:
				return getDefecto();
			case CoffeeModelingPackage.SELECCION__SELECCIONAUTOMATICA:
				return getSeleccionautomatica();
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
			case CoffeeModelingPackage.SELECCION__METODO:
				setMetodo((String)newValue);
				return;
			case CoffeeModelingPackage.SELECCION__DIAS_ALMACENAMIENTO:
				setDiasAlmacenamiento((Integer)newValue);
				return;
			case CoffeeModelingPackage.SELECCION__DEFECTO:
				getDefecto().clear();
				getDefecto().addAll((Collection<? extends Defecto>)newValue);
				return;
			case CoffeeModelingPackage.SELECCION__SELECCIONAUTOMATICA:
				getSeleccionautomatica().clear();
				getSeleccionautomatica().addAll((Collection<? extends SeleccionAutomatica>)newValue);
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
			case CoffeeModelingPackage.SELECCION__METODO:
				setMetodo(METODO_EDEFAULT);
				return;
			case CoffeeModelingPackage.SELECCION__DIAS_ALMACENAMIENTO:
				setDiasAlmacenamiento(DIAS_ALMACENAMIENTO_EDEFAULT);
				return;
			case CoffeeModelingPackage.SELECCION__DEFECTO:
				getDefecto().clear();
				return;
			case CoffeeModelingPackage.SELECCION__SELECCIONAUTOMATICA:
				getSeleccionautomatica().clear();
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
			case CoffeeModelingPackage.SELECCION__METODO:
				return METODO_EDEFAULT == null ? metodo != null : !METODO_EDEFAULT.equals(metodo);
			case CoffeeModelingPackage.SELECCION__DIAS_ALMACENAMIENTO:
				return diasAlmacenamiento != DIAS_ALMACENAMIENTO_EDEFAULT;
			case CoffeeModelingPackage.SELECCION__DEFECTO:
				return defecto != null && !defecto.isEmpty();
			case CoffeeModelingPackage.SELECCION__SELECCIONAUTOMATICA:
				return seleccionautomatica != null && !seleccionautomatica.isEmpty();
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
		result.append(" (metodo: ");
		result.append(metodo);
		result.append(", diasAlmacenamiento: ");
		result.append(diasAlmacenamiento);
		result.append(')');
		return result.toString();
	}

} //SeleccionImpl
