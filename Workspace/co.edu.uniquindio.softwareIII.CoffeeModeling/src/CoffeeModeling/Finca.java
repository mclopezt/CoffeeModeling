/**
 */
package CoffeeModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finca</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Finca#getNombre <em>Nombre</em>}</li>
 *   <li>{@link CoffeeModeling.Finca#getTerreno <em>Terreno</em>}</li>
 *   <li>{@link CoffeeModeling.Finca#getEmpleado <em>Empleado</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getFinca()
 * @model
 * @generated
 */
public interface Finca extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getFinca_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Finca#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Terreno</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.Terreno}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terreno</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terreno</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getFinca_Terreno()
	 * @model containment="true"
	 * @generated
	 */
	EList<Terreno> getTerreno();

	/**
	 * Returns the value of the '<em><b>Empleado</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.Empleado}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empleado</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empleado</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getFinca_Empleado()
	 * @model containment="true"
	 * @generated
	 */
	EList<Empleado> getEmpleado();

} // Finca
