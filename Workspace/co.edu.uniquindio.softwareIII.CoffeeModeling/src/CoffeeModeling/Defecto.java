/**
 */
package CoffeeModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defecto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Defecto#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getDefecto()
 * @model
 * @generated
 */
public interface Defecto extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link CoffeeModeling.TipoDefectos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see CoffeeModeling.TipoDefectos
	 * @see #setTipo(TipoDefectos)
	 * @see CoffeeModeling.CoffeeModelingPackage#getDefecto_Tipo()
	 * @model
	 * @generated
	 */
	TipoDefectos getTipo();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Defecto#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see CoffeeModeling.TipoDefectos
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoDefectos value);

} // Defecto
