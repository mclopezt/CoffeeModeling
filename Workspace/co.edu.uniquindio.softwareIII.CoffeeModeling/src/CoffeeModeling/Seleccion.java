/**
 */
package CoffeeModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seleccion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Seleccion#getMetodo <em>Metodo</em>}</li>
 *   <li>{@link CoffeeModeling.Seleccion#getDiasAlmacenamiento <em>Dias Almacenamiento</em>}</li>
 *   <li>{@link CoffeeModeling.Seleccion#getDefecto <em>Defecto</em>}</li>
 *   <li>{@link CoffeeModeling.Seleccion#getSeleccionautomatica <em>Seleccionautomatica</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getSeleccion()
 * @model
 * @generated
 */
public interface Seleccion extends EObject {
	/**
	 * Returns the value of the '<em><b>Metodo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodo</em>' attribute.
	 * @see #setMetodo(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getSeleccion_Metodo()
	 * @model
	 * @generated
	 */
	String getMetodo();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Seleccion#getMetodo <em>Metodo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metodo</em>' attribute.
	 * @see #getMetodo()
	 * @generated
	 */
	void setMetodo(String value);

	/**
	 * Returns the value of the '<em><b>Dias Almacenamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dias Almacenamiento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dias Almacenamiento</em>' attribute.
	 * @see #setDiasAlmacenamiento(int)
	 * @see CoffeeModeling.CoffeeModelingPackage#getSeleccion_DiasAlmacenamiento()
	 * @model
	 * @generated
	 */
	int getDiasAlmacenamiento();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Seleccion#getDiasAlmacenamiento <em>Dias Almacenamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dias Almacenamiento</em>' attribute.
	 * @see #getDiasAlmacenamiento()
	 * @generated
	 */
	void setDiasAlmacenamiento(int value);

	/**
	 * Returns the value of the '<em><b>Defecto</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.Defecto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defecto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defecto</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getSeleccion_Defecto()
	 * @model containment="true"
	 * @generated
	 */
	EList<Defecto> getDefecto();

	/**
	 * Returns the value of the '<em><b>Seleccionautomatica</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.SeleccionAutomatica}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seleccionautomatica</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seleccionautomatica</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getSeleccion_Seleccionautomatica()
	 * @model containment="true"
	 * @generated
	 */
	EList<SeleccionAutomatica> getSeleccionautomatica();

} // Seleccion
