/**
 */
package CoffeeModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Veneno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Veneno#getNombre <em>Nombre</em>}</li>
 *   <li>{@link CoffeeModeling.Veneno#getFechaAplicado <em>Fecha Aplicado</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getVeneno()
 * @model
 * @generated
 */
public interface Veneno extends EObject {
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
	 * @see CoffeeModeling.CoffeeModelingPackage#getVeneno_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Veneno#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Aplicado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Aplicado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Aplicado</em>' attribute.
	 * @see #setFechaAplicado(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getVeneno_FechaAplicado()
	 * @model
	 * @generated
	 */
	String getFechaAplicado();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Veneno#getFechaAplicado <em>Fecha Aplicado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Aplicado</em>' attribute.
	 * @see #getFechaAplicado()
	 * @generated
	 */
	void setFechaAplicado(String value);

} // Veneno
