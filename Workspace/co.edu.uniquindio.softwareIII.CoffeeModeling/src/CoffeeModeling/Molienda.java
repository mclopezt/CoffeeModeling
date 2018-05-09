/**
 */
package CoffeeModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molienda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Molienda#getRefMaquinaria <em>Ref Maquinaria</em>}</li>
 *   <li>{@link CoffeeModeling.Molienda#getFechaUltimoMantenimiento <em>Fecha Ultimo Mantenimiento</em>}</li>
 *   <li>{@link CoffeeModeling.Molienda#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getMolienda()
 * @model
 * @generated
 */
public interface Molienda extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref Maquinaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Maquinaria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Maquinaria</em>' attribute.
	 * @see #setRefMaquinaria(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getMolienda_RefMaquinaria()
	 * @model
	 * @generated
	 */
	String getRefMaquinaria();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Molienda#getRefMaquinaria <em>Ref Maquinaria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Maquinaria</em>' attribute.
	 * @see #getRefMaquinaria()
	 * @generated
	 */
	void setRefMaquinaria(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Ultimo Mantenimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Ultimo Mantenimiento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Ultimo Mantenimiento</em>' attribute.
	 * @see #setFechaUltimoMantenimiento(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getMolienda_FechaUltimoMantenimiento()
	 * @model
	 * @generated
	 */
	String getFechaUltimoMantenimiento();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Molienda#getFechaUltimoMantenimiento <em>Fecha Ultimo Mantenimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Ultimo Mantenimiento</em>' attribute.
	 * @see #getFechaUltimoMantenimiento()
	 * @generated
	 */
	void setFechaUltimoMantenimiento(String value);

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
	 * @see CoffeeModeling.CoffeeModelingPackage#getMolienda_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Molienda#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Molienda
