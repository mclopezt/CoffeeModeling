/**
 */
package CoffeeModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Siembra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Siembra#getEdadCultivo <em>Edad Cultivo</em>}</li>
 *   <li>{@link CoffeeModeling.Siembra#getFechaInicio <em>Fecha Inicio</em>}</li>
 *   <li>{@link CoffeeModeling.Siembra#getVariedad <em>Variedad</em>}</li>
 *   <li>{@link CoffeeModeling.Siembra#getAbono <em>Abono</em>}</li>
 *   <li>{@link CoffeeModeling.Siembra#getVeneno <em>Veneno</em>}</li>
 *   <li>{@link CoffeeModeling.Siembra#getAguaRiego <em>Agua Riego</em>}</li>
 *   <li>{@link CoffeeModeling.Siembra#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.Siembra#getLotes <em>Lotes</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getSiembra()
 * @model
 * @generated
 */
public interface Siembra extends EObject {
	/**
	 * Returns the value of the '<em><b>Edad Cultivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edad Cultivo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edad Cultivo</em>' attribute.
	 * @see #setEdadCultivo(int)
	 * @see CoffeeModeling.CoffeeModelingPackage#getSiembra_EdadCultivo()
	 * @model
	 * @generated
	 */
	int getEdadCultivo();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Siembra#getEdadCultivo <em>Edad Cultivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edad Cultivo</em>' attribute.
	 * @see #getEdadCultivo()
	 * @generated
	 */
	void setEdadCultivo(int value);

	/**
	 * Returns the value of the '<em><b>Fecha Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Inicio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Inicio</em>' attribute.
	 * @see #setFechaInicio(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getSiembra_FechaInicio()
	 * @model
	 * @generated
	 */
	String getFechaInicio();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Siembra#getFechaInicio <em>Fecha Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Inicio</em>' attribute.
	 * @see #getFechaInicio()
	 * @generated
	 */
	void setFechaInicio(String value);

	/**
	 * Returns the value of the '<em><b>Variedad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variedad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variedad</em>' attribute.
	 * @see #setVariedad(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getSiembra_Variedad()
	 * @model
	 * @generated
	 */
	String getVariedad();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Siembra#getVariedad <em>Variedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variedad</em>' attribute.
	 * @see #getVariedad()
	 * @generated
	 */
	void setVariedad(String value);

	/**
	 * Returns the value of the '<em><b>Abono</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.Abono}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abono</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abono</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getSiembra_Abono()
	 * @model containment="true"
	 * @generated
	 */
	EList<Abono> getAbono();

	/**
	 * Returns the value of the '<em><b>Veneno</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.Veneno}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Veneno</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Veneno</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getSiembra_Veneno()
	 * @model containment="true"
	 * @generated
	 */
	EList<Veneno> getVeneno();

	/**
	 * Returns the value of the '<em><b>Agua Riego</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.Agua}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agua Riego</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agua Riego</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getSiembra_AguaRiego()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agua> getAguaRiego();

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
	 * @see CoffeeModeling.CoffeeModelingPackage#getSiembra_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Siembra#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lotes</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.Lote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lotes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lotes</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getSiembra_Lotes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lote> getLotes();

} // Siembra
