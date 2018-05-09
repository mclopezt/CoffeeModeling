/**
 */
package CoffeeModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Lote#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getRecoleccion <em>Recoleccion</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getFlotes <em>Flotes</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getDespulpe <em>Despulpe</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getFermentacion <em>Fermentacion</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getLavado <em>Lavado</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getSecado <em>Secado</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getTrilla <em>Trilla</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getSeleccion <em>Seleccion</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getTostion <em>Tostion</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getMolienda <em>Molienda</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getEmpaque <em>Empaque</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getFechaInicio <em>Fecha Inicio</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getFechaFin <em>Fecha Fin</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getEmpleados <em>Empleados</em>}</li>
 *   <li>{@link CoffeeModeling.Lote#getPeso <em>Peso</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getLote()
 * @model
 * @generated
 */
public interface Lote extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Recoleccion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recoleccion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recoleccion</em>' containment reference.
	 * @see #setRecoleccion(Recoleccion)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Recoleccion()
	 * @model containment="true"
	 * @generated
	 */
	Recoleccion getRecoleccion();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getRecoleccion <em>Recoleccion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recoleccion</em>' containment reference.
	 * @see #getRecoleccion()
	 * @generated
	 */
	void setRecoleccion(Recoleccion value);

	/**
	 * Returns the value of the '<em><b>Flotes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flotes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flotes</em>' containment reference.
	 * @see #setFlotes(Flotes)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Flotes()
	 * @model containment="true"
	 * @generated
	 */
	Flotes getFlotes();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getFlotes <em>Flotes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flotes</em>' containment reference.
	 * @see #getFlotes()
	 * @generated
	 */
	void setFlotes(Flotes value);

	/**
	 * Returns the value of the '<em><b>Despulpe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Despulpe</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Despulpe</em>' containment reference.
	 * @see #setDespulpe(Despulpe)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Despulpe()
	 * @model containment="true"
	 * @generated
	 */
	Despulpe getDespulpe();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getDespulpe <em>Despulpe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Despulpe</em>' containment reference.
	 * @see #getDespulpe()
	 * @generated
	 */
	void setDespulpe(Despulpe value);

	/**
	 * Returns the value of the '<em><b>Fermentacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fermentacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fermentacion</em>' containment reference.
	 * @see #setFermentacion(Fermentacion)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Fermentacion()
	 * @model containment="true"
	 * @generated
	 */
	Fermentacion getFermentacion();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getFermentacion <em>Fermentacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fermentacion</em>' containment reference.
	 * @see #getFermentacion()
	 * @generated
	 */
	void setFermentacion(Fermentacion value);

	/**
	 * Returns the value of the '<em><b>Lavado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lavado</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lavado</em>' containment reference.
	 * @see #setLavado(Lavado)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Lavado()
	 * @model containment="true"
	 * @generated
	 */
	Lavado getLavado();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getLavado <em>Lavado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lavado</em>' containment reference.
	 * @see #getLavado()
	 * @generated
	 */
	void setLavado(Lavado value);

	/**
	 * Returns the value of the '<em><b>Secado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secado</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secado</em>' containment reference.
	 * @see #setSecado(Secado)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Secado()
	 * @model containment="true"
	 * @generated
	 */
	Secado getSecado();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getSecado <em>Secado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secado</em>' containment reference.
	 * @see #getSecado()
	 * @generated
	 */
	void setSecado(Secado value);

	/**
	 * Returns the value of the '<em><b>Trilla</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trilla</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trilla</em>' containment reference.
	 * @see #setTrilla(Trilla)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Trilla()
	 * @model containment="true"
	 * @generated
	 */
	Trilla getTrilla();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getTrilla <em>Trilla</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trilla</em>' containment reference.
	 * @see #getTrilla()
	 * @generated
	 */
	void setTrilla(Trilla value);

	/**
	 * Returns the value of the '<em><b>Seleccion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seleccion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seleccion</em>' containment reference.
	 * @see #setSeleccion(Seleccion)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Seleccion()
	 * @model containment="true"
	 * @generated
	 */
	Seleccion getSeleccion();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getSeleccion <em>Seleccion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seleccion</em>' containment reference.
	 * @see #getSeleccion()
	 * @generated
	 */
	void setSeleccion(Seleccion value);

	/**
	 * Returns the value of the '<em><b>Tostion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tostion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tostion</em>' containment reference.
	 * @see #setTostion(Tostion)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Tostion()
	 * @model containment="true"
	 * @generated
	 */
	Tostion getTostion();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getTostion <em>Tostion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tostion</em>' containment reference.
	 * @see #getTostion()
	 * @generated
	 */
	void setTostion(Tostion value);

	/**
	 * Returns the value of the '<em><b>Molienda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molienda</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molienda</em>' containment reference.
	 * @see #setMolienda(Molienda)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Molienda()
	 * @model containment="true"
	 * @generated
	 */
	Molienda getMolienda();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getMolienda <em>Molienda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molienda</em>' containment reference.
	 * @see #getMolienda()
	 * @generated
	 */
	void setMolienda(Molienda value);

	/**
	 * Returns the value of the '<em><b>Empaque</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empaque</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empaque</em>' containment reference.
	 * @see #setEmpaque(Empaque)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Empaque()
	 * @model containment="true"
	 * @generated
	 */
	Empaque getEmpaque();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getEmpaque <em>Empaque</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empaque</em>' containment reference.
	 * @see #getEmpaque()
	 * @generated
	 */
	void setEmpaque(Empaque value);

	/**
	 * Returns the value of the '<em><b>Fecha Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Inicio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Inicio</em>' attribute.
	 * @see #setFechaInicio(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_FechaInicio()
	 * @model
	 * @generated
	 */
	String getFechaInicio();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getFechaInicio <em>Fecha Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Inicio</em>' attribute.
	 * @see #getFechaInicio()
	 * @generated
	 */
	void setFechaInicio(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Fin</em>' attribute.
	 * @see #setFechaFin(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_FechaFin()
	 * @model
	 * @generated
	 */
	String getFechaFin();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getFechaFin <em>Fecha Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Fin</em>' attribute.
	 * @see #getFechaFin()
	 * @generated
	 */
	void setFechaFin(String value);

	/**
	 * Returns the value of the '<em><b>Empleados</b></em>' reference list.
	 * The list contents are of type {@link CoffeeModeling.Empleado}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empleados</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empleados</em>' reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Empleados()
	 * @model
	 * @generated
	 */
	EList<Empleado> getEmpleados();

	/**
	 * Returns the value of the '<em><b>Peso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peso</em>' attribute.
	 * @see #setPeso(int)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLote_Peso()
	 * @model
	 * @generated
	 */
	int getPeso();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lote#getPeso <em>Peso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peso</em>' attribute.
	 * @see #getPeso()
	 * @generated
	 */
	void setPeso(int value);

} // Lote
