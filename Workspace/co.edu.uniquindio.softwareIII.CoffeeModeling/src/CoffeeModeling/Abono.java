/**
 */
package CoffeeModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abono</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Abono#getNombre <em>Nombre</em>}</li>
 *   <li>{@link CoffeeModeling.Abono#getFechaAplicado <em>Fecha Aplicado</em>}</li>
 *   <li>{@link CoffeeModeling.Abono#getLoteRelacionado <em>Lote Relacionado</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getAbono()
 * @model
 * @generated
 */
public interface Abono extends EObject {
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
	 * @see CoffeeModeling.CoffeeModelingPackage#getAbono_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Abono#getNombre <em>Nombre</em>}' attribute.
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
	 * @see CoffeeModeling.CoffeeModelingPackage#getAbono_FechaAplicado()
	 * @model
	 * @generated
	 */
	String getFechaAplicado();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Abono#getFechaAplicado <em>Fecha Aplicado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Aplicado</em>' attribute.
	 * @see #getFechaAplicado()
	 * @generated
	 */
	void setFechaAplicado(String value);

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
	 * @see CoffeeModeling.CoffeeModelingPackage#getAbono_LoteRelacionado()
	 * @model
	 * @generated
	 */
	Lote getLoteRelacionado();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Abono#getLoteRelacionado <em>Lote Relacionado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lote Relacionado</em>' reference.
	 * @see #getLoteRelacionado()
	 * @generated
	 */
	void setLoteRelacionado(Lote value);

} // Abono
