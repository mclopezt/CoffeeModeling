/**
 */
package CoffeeModeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Procesos</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CoffeeModeling.CoffeeModelingPackage#getProcesos()
 * @model
 * @generated
 */
public enum Procesos implements Enumerator {
	/**
	 * The '<em><b>Siembra</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIEMBRA_VALUE
	 * @generated
	 * @ordered
	 */
	SIEMBRA(0, "Siembra", "Siembra"),

	/**
	 * The '<em><b>Recoleccion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOLECCION_VALUE
	 * @generated
	 * @ordered
	 */
	RECOLECCION(1, "Recoleccion", "Recoleccion"),

	/**
	 * The '<em><b>Flotes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOTES_VALUE
	 * @generated
	 * @ordered
	 */
	FLOTES(2, "Flotes", "Flotes"),

	/**
	 * The '<em><b>Fermntacion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FERMNTACION_VALUE
	 * @generated
	 * @ordered
	 */
	FERMNTACION(3, "Fermntacion", "Fermntacion"),

	/**
	 * The '<em><b>Trilla</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRILLA_VALUE
	 * @generated
	 * @ordered
	 */
	TRILLA(4, "Trilla", "Trilla"),

	/**
	 * The '<em><b>Lavado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAVADO_VALUE
	 * @generated
	 * @ordered
	 */
	LAVADO(5, "Lavado", "Lavado"),

	/**
	 * The '<em><b>Secado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECADO_VALUE
	 * @generated
	 * @ordered
	 */
	SECADO(6, "Secado", "Secado"),

	/**
	 * The '<em><b>Seleccion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECCION_VALUE
	 * @generated
	 * @ordered
	 */
	SELECCION(7, "Seleccion", "Seleccion"),

	/**
	 * The '<em><b>Empaque</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPAQUE_VALUE
	 * @generated
	 * @ordered
	 */
	EMPAQUE(8, "Empaque", "Empaque");

	/**
	 * The '<em><b>Siembra</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Siembra</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIEMBRA
	 * @model name="Siembra"
	 * @generated
	 * @ordered
	 */
	public static final int SIEMBRA_VALUE = 0;

	/**
	 * The '<em><b>Recoleccion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Recoleccion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECOLECCION
	 * @model name="Recoleccion"
	 * @generated
	 * @ordered
	 */
	public static final int RECOLECCION_VALUE = 1;

	/**
	 * The '<em><b>Flotes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flotes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOTES
	 * @model name="Flotes"
	 * @generated
	 * @ordered
	 */
	public static final int FLOTES_VALUE = 2;

	/**
	 * The '<em><b>Fermntacion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fermntacion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FERMNTACION
	 * @model name="Fermntacion"
	 * @generated
	 * @ordered
	 */
	public static final int FERMNTACION_VALUE = 3;

	/**
	 * The '<em><b>Trilla</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trilla</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRILLA
	 * @model name="Trilla"
	 * @generated
	 * @ordered
	 */
	public static final int TRILLA_VALUE = 4;

	/**
	 * The '<em><b>Lavado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lavado</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAVADO
	 * @model name="Lavado"
	 * @generated
	 * @ordered
	 */
	public static final int LAVADO_VALUE = 5;

	/**
	 * The '<em><b>Secado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Secado</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECADO
	 * @model name="Secado"
	 * @generated
	 * @ordered
	 */
	public static final int SECADO_VALUE = 6;

	/**
	 * The '<em><b>Seleccion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Seleccion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECCION
	 * @model name="Seleccion"
	 * @generated
	 * @ordered
	 */
	public static final int SELECCION_VALUE = 7;

	/**
	 * The '<em><b>Empaque</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Empaque</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPAQUE
	 * @model name="Empaque"
	 * @generated
	 * @ordered
	 */
	public static final int EMPAQUE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Procesos</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Procesos[] VALUES_ARRAY =
		new Procesos[] {
			SIEMBRA,
			RECOLECCION,
			FLOTES,
			FERMNTACION,
			TRILLA,
			LAVADO,
			SECADO,
			SELECCION,
			EMPAQUE,
		};

	/**
	 * A public read-only list of all the '<em><b>Procesos</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Procesos> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Procesos</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Procesos get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Procesos result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Procesos</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Procesos getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Procesos result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Procesos</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Procesos get(int value) {
		switch (value) {
			case SIEMBRA_VALUE: return SIEMBRA;
			case RECOLECCION_VALUE: return RECOLECCION;
			case FLOTES_VALUE: return FLOTES;
			case FERMNTACION_VALUE: return FERMNTACION;
			case TRILLA_VALUE: return TRILLA;
			case LAVADO_VALUE: return LAVADO;
			case SECADO_VALUE: return SECADO;
			case SELECCION_VALUE: return SELECCION;
			case EMPAQUE_VALUE: return EMPAQUE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Procesos(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Procesos
