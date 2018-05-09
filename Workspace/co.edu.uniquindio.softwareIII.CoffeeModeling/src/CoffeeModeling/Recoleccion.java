/**
 */
package CoffeeModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recoleccion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Recoleccion#getFecha <em>Fecha</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getRecoleccion()
 * @model
 * @generated
 */
public interface Recoleccion extends EObject {
	/**
	 * Returns the value of the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha</em>' attribute.
	 * @see #setFecha(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getRecoleccion_Fecha()
	 * @model
	 * @generated
	 */
	String getFecha();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Recoleccion#getFecha <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha</em>' attribute.
	 * @see #getFecha()
	 * @generated
	 */
	void setFecha(String value);

} // Recoleccion
