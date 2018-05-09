/**
 */
package CoffeeModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trilla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Trilla#getTecnicaEmpleada <em>Tecnica Empleada</em>}</li>
 *   <li>{@link CoffeeModeling.Trilla#getMalla <em>Malla</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getTrilla()
 * @model
 * @generated
 */
public interface Trilla extends EObject {
	/**
	 * Returns the value of the '<em><b>Tecnica Empleada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tecnica Empleada</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tecnica Empleada</em>' attribute.
	 * @see #setTecnicaEmpleada(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getTrilla_TecnicaEmpleada()
	 * @model
	 * @generated
	 */
	String getTecnicaEmpleada();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Trilla#getTecnicaEmpleada <em>Tecnica Empleada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tecnica Empleada</em>' attribute.
	 * @see #getTecnicaEmpleada()
	 * @generated
	 */
	void setTecnicaEmpleada(String value);

	/**
	 * Returns the value of the '<em><b>Malla</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Malla</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Malla</em>' attribute.
	 * @see #setMalla(int)
	 * @see CoffeeModeling.CoffeeModelingPackage#getTrilla_Malla()
	 * @model
	 * @generated
	 */
	int getMalla();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Trilla#getMalla <em>Malla</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Malla</em>' attribute.
	 * @see #getMalla()
	 * @generated
	 */
	void setMalla(int value);

} // Trilla
