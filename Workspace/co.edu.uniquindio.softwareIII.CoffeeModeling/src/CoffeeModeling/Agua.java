/**
 */
package CoffeeModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agua</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Agua#getTipo <em>Tipo</em>}</li>
 *   <li>{@link CoffeeModeling.Agua#getCantidad <em>Cantidad</em>}</li>
 *   <li>{@link CoffeeModeling.Agua#getLoteRelacionado <em>Lote Relacionado</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getAgua()
 * @model
 * @generated
 */
public interface Agua extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getAgua_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Agua#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Cantidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cantidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cantidad</em>' attribute.
	 * @see #setCantidad(float)
	 * @see CoffeeModeling.CoffeeModelingPackage#getAgua_Cantidad()
	 * @model
	 * @generated
	 */
	float getCantidad();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Agua#getCantidad <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cantidad</em>' attribute.
	 * @see #getCantidad()
	 * @generated
	 */
	void setCantidad(float value);

	/**
	 * Returns the value of the '<em><b>Lote Relacionado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lote Relacionado</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lote Relacionado</em>' reference.
	 * @see #setLoteRelacionado(Lote)
	 * @see CoffeeModeling.CoffeeModelingPackage#getAgua_LoteRelacionado()
	 * @model
	 * @generated
	 */
	Lote getLoteRelacionado();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Agua#getLoteRelacionado <em>Lote Relacionado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lote Relacionado</em>' reference.
	 * @see #getLoteRelacionado()
	 * @generated
	 */
	void setLoteRelacionado(Lote value);

} // Agua
