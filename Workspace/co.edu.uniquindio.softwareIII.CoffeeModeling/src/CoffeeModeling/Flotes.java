/**
 */
package CoffeeModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flotes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Flotes#getCantGranoDefectuoso <em>Cant Grano Defectuoso</em>}</li>
 *   <li>{@link CoffeeModeling.Flotes#getAguaUsada <em>Agua Usada</em>}</li>
 *   <li>{@link CoffeeModeling.Flotes#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getFlotes()
 * @model
 * @generated
 */
public interface Flotes extends EObject {
	/**
	 * Returns the value of the '<em><b>Cant Grano Defectuoso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cant Grano Defectuoso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cant Grano Defectuoso</em>' attribute.
	 * @see #setCantGranoDefectuoso(int)
	 * @see CoffeeModeling.CoffeeModelingPackage#getFlotes_CantGranoDefectuoso()
	 * @model
	 * @generated
	 */
	int getCantGranoDefectuoso();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Flotes#getCantGranoDefectuoso <em>Cant Grano Defectuoso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cant Grano Defectuoso</em>' attribute.
	 * @see #getCantGranoDefectuoso()
	 * @generated
	 */
	void setCantGranoDefectuoso(int value);

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
	 * @see CoffeeModeling.CoffeeModelingPackage#getFlotes_AguaUsada()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agua> getAguaUsada();

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
	 * @see CoffeeModeling.CoffeeModelingPackage#getFlotes_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Flotes#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Flotes
