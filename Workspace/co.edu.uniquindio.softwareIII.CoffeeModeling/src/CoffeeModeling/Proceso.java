/**
 */
package CoffeeModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Proceso#getNombreProceso <em>Nombre Proceso</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getProceso()
 * @model
 * @generated
 */
public interface Proceso extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Proceso</b></em>' attribute.
	 * The literals are from the enumeration {@link CoffeeModeling.Procesos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Proceso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Proceso</em>' attribute.
	 * @see CoffeeModeling.Procesos
	 * @see #setNombreProceso(Procesos)
	 * @see CoffeeModeling.CoffeeModelingPackage#getProceso_NombreProceso()
	 * @model
	 * @generated
	 */
	Procesos getNombreProceso();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Proceso#getNombreProceso <em>Nombre Proceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Proceso</em>' attribute.
	 * @see CoffeeModeling.Procesos
	 * @see #getNombreProceso()
	 * @generated
	 */
	void setNombreProceso(Procesos value);

} // Proceso
