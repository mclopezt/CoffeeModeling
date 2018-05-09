/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Empleado;
import CoffeeModeling.Finca;
import CoffeeModeling.Terreno;
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
 * An implementation of the model object '<em><b>Finca</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.FincaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link CoffeeModeling.impl.FincaImpl#getTerreno <em>Terreno</em>}</li>
 *   <li>{@link CoffeeModeling.impl.FincaImpl#getEmpleado <em>Empleado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FincaImpl extends MinimalEObjectImpl.Container implements Finca {
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
	 * The cached value of the '{@link #getTerreno() <em>Terreno</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerreno()
	 * @generated
	 * @ordered
	 */
	protected EList<Terreno> terreno;

	/**
	 * The cached value of the '{@link #getEmpleado() <em>Empleado</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpleado()
	 * @generated
	 * @ordered
	 */
	protected EList<Empleado> empleado;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FincaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.FINCA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.FINCA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Terreno> getTerreno() {
		if (terreno == null) {
			terreno = new EObjectContainmentEList<Terreno>(Terreno.class, this, CoffeeModelingPackage.FINCA__TERRENO);
		}
		return terreno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Empleado> getEmpleado() {
		if (empleado == null) {
			empleado = new EObjectContainmentEList<Empleado>(Empleado.class, this, CoffeeModelingPackage.FINCA__EMPLEADO);
		}
		return empleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoffeeModelingPackage.FINCA__TERRENO:
				return ((InternalEList<?>)getTerreno()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.FINCA__EMPLEADO:
				return ((InternalEList<?>)getEmpleado()).basicRemove(otherEnd, msgs);
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
			case CoffeeModelingPackage.FINCA__NOMBRE:
				return getNombre();
			case CoffeeModelingPackage.FINCA__TERRENO:
				return getTerreno();
			case CoffeeModelingPackage.FINCA__EMPLEADO:
				return getEmpleado();
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
			case CoffeeModelingPackage.FINCA__NOMBRE:
				setNombre((String)newValue);
				return;
			case CoffeeModelingPackage.FINCA__TERRENO:
				getTerreno().clear();
				getTerreno().addAll((Collection<? extends Terreno>)newValue);
				return;
			case CoffeeModelingPackage.FINCA__EMPLEADO:
				getEmpleado().clear();
				getEmpleado().addAll((Collection<? extends Empleado>)newValue);
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
			case CoffeeModelingPackage.FINCA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CoffeeModelingPackage.FINCA__TERRENO:
				getTerreno().clear();
				return;
			case CoffeeModelingPackage.FINCA__EMPLEADO:
				getEmpleado().clear();
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
			case CoffeeModelingPackage.FINCA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CoffeeModelingPackage.FINCA__TERRENO:
				return terreno != null && !terreno.isEmpty();
			case CoffeeModelingPackage.FINCA__EMPLEADO:
				return empleado != null && !empleado.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //FincaImpl
