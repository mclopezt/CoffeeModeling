/**
 */
package CoffeeModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terreno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Terreno#getSiembra <em>Siembra</em>}</li>
 *   <li>{@link CoffeeModeling.Terreno#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.Terreno#getAltura <em>Altura</em>}</li>
 *   <li>{@link CoffeeModeling.Terreno#getTemperatura <em>Temperatura</em>}</li>
 *   <li>{@link CoffeeModeling.Terreno#getLongitud <em>Longitud</em>}</li>
 *   <li>{@link CoffeeModeling.Terreno#getLatitud <em>Latitud</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getTerreno()
 * @model
 * @generated
 */
public interface Terreno extends EObject {
	/**
	 * Returns the value of the '<em><b>Siembra</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.Siembra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Siembra</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siembra</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getTerreno_Siembra()
	 * @model containment="true"
	 * @generated
	 */
	EList<Siembra> getSiembra();

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
	 * @see CoffeeModeling.CoffeeModelingPackage#getTerreno_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Terreno#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Altura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altura</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altura</em>' attribute.
	 * @see #setAltura(float)
	 * @see CoffeeModeling.CoffeeModelingPackage#getTerreno_Altura()
	 * @model
	 * @generated
	 */
	float getAltura();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Terreno#getAltura <em>Altura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altura</em>' attribute.
	 * @see #getAltura()
	 * @generated
	 */
	void setAltura(float value);

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
	 * @see CoffeeModeling.CoffeeModelingPackage#getTerreno_Temperatura()
	 * @model
	 * @generated
	 */
	float getTemperatura();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Terreno#getTemperatura <em>Temperatura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperatura</em>' attribute.
	 * @see #getTemperatura()
	 * @generated
	 */
	void setTemperatura(float value);

	/**
	 * Returns the value of the '<em><b>Longitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitud</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitud</em>' attribute.
	 * @see #setLongitud(float)
	 * @see CoffeeModeling.CoffeeModelingPackage#getTerreno_Longitud()
	 * @model
	 * @generated
	 */
	float getLongitud();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Terreno#getLongitud <em>Longitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitud</em>' attribute.
	 * @see #getLongitud()
	 * @generated
	 */
	void setLongitud(float value);

	/**
	 * Returns the value of the '<em><b>Latitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitud</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitud</em>' attribute.
	 * @see #setLatitud(float)
	 * @see CoffeeModeling.CoffeeModelingPackage#getTerreno_Latitud()
	 * @model
	 * @generated
	 */
	float getLatitud();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Terreno#getLatitud <em>Latitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitud</em>' attribute.
	 * @see #getLatitud()
	 * @generated
	 */
	void setLatitud(float value);

} // Terreno
