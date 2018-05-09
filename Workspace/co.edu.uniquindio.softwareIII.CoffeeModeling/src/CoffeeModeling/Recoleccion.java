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
 *   <li>{@link CoffeeModeling.Recoleccion#getId <em>Id</em>}</li>
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
	 * @see CoffeeModeling.CoffeeModelingPackage#getRecoleccion_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Recoleccion#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Recoleccion
