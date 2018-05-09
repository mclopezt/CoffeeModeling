/**
 */
package CoffeeModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empleado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Empleado#getNombreCompleto <em>Nombre Completo</em>}</li>
 *   <li>{@link CoffeeModeling.Empleado#getTiempoExperiencia <em>Tiempo Experiencia</em>}</li>
 *   <li>{@link CoffeeModeling.Empleado#getPoblacion <em>Poblacion</em>}</li>
 *   <li>{@link CoffeeModeling.Empleado#getProcesoEnQueParticipa <em>Proceso En Que Participa</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getEmpleado()
 * @model
 * @generated
 */
public interface Empleado extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Completo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Completo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Completo</em>' attribute.
	 * @see #setNombreCompleto(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getEmpleado_NombreCompleto()
	 * @model
	 * @generated
	 */
	String getNombreCompleto();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Empleado#getNombreCompleto <em>Nombre Completo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Completo</em>' attribute.
	 * @see #getNombreCompleto()
	 * @generated
	 */
	void setNombreCompleto(String value);

	/**
	 * Returns the value of the '<em><b>Tiempo Experiencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiempo Experiencia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiempo Experiencia</em>' attribute.
	 * @see #setTiempoExperiencia(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getEmpleado_TiempoExperiencia()
	 * @model
	 * @generated
	 */
	String getTiempoExperiencia();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Empleado#getTiempoExperiencia <em>Tiempo Experiencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiempo Experiencia</em>' attribute.
	 * @see #getTiempoExperiencia()
	 * @generated
	 */
	void setTiempoExperiencia(String value);

	/**
	 * Returns the value of the '<em><b>Poblacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poblacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poblacion</em>' attribute.
	 * @see #setPoblacion(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getEmpleado_Poblacion()
	 * @model
	 * @generated
	 */
	String getPoblacion();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Empleado#getPoblacion <em>Poblacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poblacion</em>' attribute.
	 * @see #getPoblacion()
	 * @generated
	 */
	void setPoblacion(String value);

	/**
	 * Returns the value of the '<em><b>Proceso En Que Participa</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.Proceso}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proceso En Que Participa</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proceso En Que Participa</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getEmpleado_ProcesoEnQueParticipa()
	 * @model containment="true"
	 * @generated
	 */
	EList<Proceso> getProcesoEnQueParticipa();

} // Empleado
