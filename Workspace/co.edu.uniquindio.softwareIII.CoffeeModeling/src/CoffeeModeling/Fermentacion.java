/**
 */
package CoffeeModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fermentacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Fermentacion#getAltitud <em>Altitud</em>}</li>
 *   <li>{@link CoffeeModeling.Fermentacion#getTemperatura <em>Temperatura</em>}</li>
 *   <li>{@link CoffeeModeling.Fermentacion#getHoraSol <em>Hora Sol</em>}</li>
 *   <li>{@link CoffeeModeling.Fermentacion#getHoraSombra <em>Hora Sombra</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getFermentacion()
 * @model
 * @generated
 */
public interface Fermentacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Altitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitud</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitud</em>' attribute.
	 * @see #setAltitud(float)
	 * @see CoffeeModeling.CoffeeModelingPackage#getFermentacion_Altitud()
	 * @model
	 * @generated
	 */
	float getAltitud();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Fermentacion#getAltitud <em>Altitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitud</em>' attribute.
	 * @see #getAltitud()
	 * @generated
	 */
	void setAltitud(float value);

	/**
	 * Returns the value of the '<em><b>Temperatura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperatura</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperatura</em>' attribute.
	 * @see #setTemperatura(float)
	 * @see CoffeeModeling.CoffeeModelingPackage#getFermentacion_Temperatura()
	 * @model
	 * @generated
	 */
	float getTemperatura();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Fermentacion#getTemperatura <em>Temperatura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperatura</em>' attribute.
	 * @see #getTemperatura()
	 * @generated
	 */
	void setTemperatura(float value);

	/**
	 * Returns the value of the '<em><b>Hora Sol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hora Sol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hora Sol</em>' attribute.
	 * @see #setHoraSol(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getFermentacion_HoraSol()
	 * @model
	 * @generated
	 */
	String getHoraSol();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Fermentacion#getHoraSol <em>Hora Sol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hora Sol</em>' attribute.
	 * @see #getHoraSol()
	 * @generated
	 */
	void setHoraSol(String value);

	/**
	 * Returns the value of the '<em><b>Hora Sombra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hora Sombra</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hora Sombra</em>' attribute.
	 * @see #setHoraSombra(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getFermentacion_HoraSombra()
	 * @model
	 * @generated
	 */
	String getHoraSombra();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Fermentacion#getHoraSombra <em>Hora Sombra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hora Sombra</em>' attribute.
	 * @see #getHoraSombra()
	 * @generated
	 */
	void setHoraSombra(String value);

} // Fermentacion
