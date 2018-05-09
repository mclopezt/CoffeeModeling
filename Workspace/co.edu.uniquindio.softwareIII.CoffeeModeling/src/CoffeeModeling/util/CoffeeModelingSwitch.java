/**
 */
package CoffeeModeling.util;

import CoffeeModeling.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CoffeeModeling.CoffeeModelingPackage
 * @generated
 */
public class CoffeeModelingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoffeeModelingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeModelingSwitch() {
		if (modelPackage == null) {
			modelPackage = CoffeeModelingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CoffeeModelingPackage.FINCA: {
				Finca finca = (Finca)theEObject;
				T result = caseFinca(finca);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.LOTE: {
				Lote lote = (Lote)theEObject;
				T result = caseLote(lote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.SIEMBRA: {
				Siembra siembra = (Siembra)theEObject;
				T result = caseSiembra(siembra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.ABONO: {
				Abono abono = (Abono)theEObject;
				T result = caseAbono(abono);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.VENENO: {
				Veneno veneno = (Veneno)theEObject;
				T result = caseVeneno(veneno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.RECOLECCION: {
				Recoleccion recoleccion = (Recoleccion)theEObject;
				T result = caseRecoleccion(recoleccion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.FLOTES: {
				Flotes flotes = (Flotes)theEObject;
				T result = caseFlotes(flotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.DESPULPE: {
				Despulpe despulpe = (Despulpe)theEObject;
				T result = caseDespulpe(despulpe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.AGUA: {
				Agua agua = (Agua)theEObject;
				T result = caseAgua(agua);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.FERMENTACION: {
				Fermentacion fermentacion = (Fermentacion)theEObject;
				T result = caseFermentacion(fermentacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.LAVADO: {
				Lavado lavado = (Lavado)theEObject;
				T result = caseLavado(lavado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.SECADO: {
				Secado secado = (Secado)theEObject;
				T result = caseSecado(secado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.TRILLA: {
				Trilla trilla = (Trilla)theEObject;
				T result = caseTrilla(trilla);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.SELECCION: {
				Seleccion seleccion = (Seleccion)theEObject;
				T result = caseSeleccion(seleccion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.TOSTION: {
				Tostion tostion = (Tostion)theEObject;
				T result = caseTostion(tostion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.DEFECTO: {
				Defecto defecto = (Defecto)theEObject;
				T result = caseDefecto(defecto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.SELECCION_AUTOMATICA: {
				SeleccionAutomatica seleccionAutomatica = (SeleccionAutomatica)theEObject;
				T result = caseSeleccionAutomatica(seleccionAutomatica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.MOLIENDA: {
				Molienda molienda = (Molienda)theEObject;
				T result = caseMolienda(molienda);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.EMPAQUE: {
				Empaque empaque = (Empaque)theEObject;
				T result = caseEmpaque(empaque);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.EMPLEADO: {
				Empleado empleado = (Empleado)theEObject;
				T result = caseEmpleado(empleado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoffeeModelingPackage.PROCESO: {
				Proceso proceso = (Proceso)theEObject;
				T result = caseProceso(proceso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finca</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finca</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinca(Finca object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLote(Lote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Siembra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Siembra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiembra(Siembra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abono</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abono</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbono(Abono object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Veneno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Veneno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVeneno(Veneno object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recoleccion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recoleccion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecoleccion(Recoleccion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flotes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flotes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlotes(Flotes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Despulpe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Despulpe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDespulpe(Despulpe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agua</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agua</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgua(Agua object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fermentacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fermentacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFermentacion(Fermentacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lavado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lavado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLavado(Lavado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecado(Secado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trilla</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trilla</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrilla(Trilla object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seleccion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seleccion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeleccion(Seleccion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tostion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tostion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTostion(Tostion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defecto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defecto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefecto(Defecto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seleccion Automatica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seleccion Automatica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeleccionAutomatica(SeleccionAutomatica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molienda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molienda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolienda(Molienda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empaque</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empaque</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmpaque(Empaque object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empleado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empleado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmpleado(Empleado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proceso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proceso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceso(Proceso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoffeeModelingSwitch
