/**
 */
package CoffeeModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lavado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Lavado#getTecnica <em>Tecnica</em>}</li>
 *   <li>{@link CoffeeModeling.Lavado#getAguaUsada <em>Agua Usada</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getLavado()
 * @model
 * @generated
 */
public interface Lavado extends EObject {
	/**
	 * Returns the value of the '<em><b>Tecnica</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tecnica</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tecnica</em>' attribute.
	 * @see #setTecnica(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getLavado_Tecnica()
	 * @model
	 * @generated
	 */
	String getTecnica();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Lavado#getTecnica <em>Tecnica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tecnica</em>' attribute.
	 * @see #getTecnica()
	 * @generated
	 */
	void setTecnica(String value);

	/**
	 * Returns the value of the '<em><b>Agua Usada</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.Agua}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agua Usada</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agua Usada</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getLavado_AguaUsada()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agua> getAguaUsada();

} // Lavado
