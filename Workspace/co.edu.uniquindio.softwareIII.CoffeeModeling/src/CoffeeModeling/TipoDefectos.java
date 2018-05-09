/**
 */
package CoffeeModeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Defectos</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CoffeeModeling.CoffeeModelingPackage#getTipoDefectos()
 * @model
 * @generated
 */
public enum TipoDefectos implements Enumerator {
	/**
	 * The '<em><b>Veteado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VETEADO_VALUE
	 * @generated
	 * @ordered
	 */
	VETEADO(1, "Veteado", "Veteado"),

	/**
	 * The '<em><b>Reposado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPOSADO_VALUE
	 * @generated
	 * @ordered
	 */
	REPOSADO(2, "Reposado", "Reposado"),

	/**
	 * The '<em><b>Ambar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMBAR_VALUE
	 * @generated
	 * @ordered
	 */
	AMBAR(3, "Ambar", "Ambar"),

	/**
	 * The '<em><b>Mordido</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORDIDO_VALUE
	 * @generated
	 * @ordered
	 */
	MORDIDO(4, "Mordido", "Mordido"),

	/**
	 * The '<em><b>Sobre Secado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOBRE_SECADO_VALUE
	 * @generated
	 * @ordered
	 */
	SOBRE_SECADO(5, "SobreSecado", "SobreSecado"),

	/**
	 * The '<em><b>Brocado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROCADO_VALUE
	 * @generated
	 * @ordered
	 */
	BROCADO(6, "Brocado", "Brocado"),

	/**
	 * The '<em><b>Averranado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERRANADO_VALUE
	 * @generated
	 * @ordered
	 */
	AVERRANADO(7, "Averranado", "Averranado"),

	/**
	 * The '<em><b>Inmaduro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INMADURO_VALUE
	 * @generated
	 * @ordered
	 */
	INMADURO(8, "Inmaduro", "Inmaduro"),

	/**
	 * The '<em><b>Vinagre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VINAGRE_VALUE
	 * @generated
	 * @ordered
	 */
	VINAGRE(9, "Vinagre", "Vinagre"),

	/**
	 * The '<em><b>Cristalizado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRISTALIZADO_VALUE
	 * @generated
	 * @ordered
	 */
	CRISTALIZADO(10, "Cristalizado", "Cristalizado"),

	/**
	 * The '<em><b>Cardenillo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDENILLO_VALUE
	 * @generated
	 * @ordered
	 */
	CARDENILLO(11, "Cardenillo", "Cardenillo"),

	/**
	 * The '<em><b>Negro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGRO_VALUE
	 * @generated
	 * @ordered
	 */
	NEGRO(12, "Negro", "Negro");

	/**
	 * The '<em><b>Veteado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Veteado</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VETEADO
	 * @model name="Veteado"
	 * @generated
	 * @ordered
	 */
	public static final int VETEADO_VALUE = 1;

	/**
	 * The '<em><b>Reposado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reposado</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPOSADO
	 * @model name="Reposado"
	 * @generated
	 * @ordered
	 */
	public static final int REPOSADO_VALUE = 2;

	/**
	 * The '<em><b>Ambar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ambar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMBAR
	 * @model name="Ambar"
	 * @generated
	 * @ordered
	 */
	public static final int AMBAR_VALUE = 3;

	/**
	 * The '<em><b>Mordido</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mordido</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MORDIDO
	 * @model name="Mordido"
	 * @generated
	 * @ordered
	 */
	public static final int MORDIDO_VALUE = 4;

	/**
	 * The '<em><b>Sobre Secado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sobre Secado</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOBRE_SECADO
	 * @model name="SobreSecado"
	 * @generated
	 * @ordered
	 */
	public static final int SOBRE_SECADO_VALUE = 5;

	/**
	 * The '<em><b>Brocado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Brocado</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BROCADO
	 * @model name="Brocado"
	 * @generated
	 * @ordered
	 */
	public static final int BROCADO_VALUE = 6;

	/**
	 * The '<em><b>Averranado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Averranado</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVERRANADO
	 * @model name="Averranado"
	 * @generated
	 * @ordered
	 */
	public static final int AVERRANADO_VALUE = 7;

	/**
	 * The '<em><b>Inmaduro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inmaduro</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INMADURO
	 * @model name="Inmaduro"
	 * @generated
	 * @ordered
	 */
	public static final int INMADURO_VALUE = 8;

	/**
	 * The '<em><b>Vinagre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vinagre</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VINAGRE
	 * @model name="Vinagre"
	 * @generated
	 * @ordered
	 */
	public static final int VINAGRE_VALUE = 9;

	/**
	 * The '<em><b>Cristalizado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cristalizado</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRISTALIZADO
	 * @model name="Cristalizado"
	 * @generated
	 * @ordered
	 */
	public static final int CRISTALIZADO_VALUE = 10;

	/**
	 * The '<em><b>Cardenillo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cardenillo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARDENILLO
	 * @model name="Cardenillo"
	 * @generated
	 * @ordered
	 */
	public static final int CARDENILLO_VALUE = 11;

	/**
	 * The '<em><b>Negro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Negro</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEGRO
	 * @model name="Negro"
	 * @generated
	 * @ordered
	 */
	public static final int NEGRO_VALUE = 12;

	/**
	 * An array of all the '<em><b>Tipo Defectos</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoDefectos[] VALUES_ARRAY =
		new TipoDefectos[] {
			VETEADO,
			REPOSADO,
			AMBAR,
			MORDIDO,
			SOBRE_SECADO,
			BROCADO,
			AVERRANADO,
			INMADURO,
			VINAGRE,
			CRISTALIZADO,
			CARDENILLO,
			NEGRO,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Defectos</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoDefectos> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Defectos</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoDefectos get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoDefectos result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Defectos</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoDefectos getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoDefectos result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Defectos</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoDefectos get(int value) {
		switch (value) {
			case VETEADO_VALUE: return VETEADO;
			case REPOSADO_VALUE: return REPOSADO;
			case AMBAR_VALUE: return AMBAR;
			case MORDIDO_VALUE: return MORDIDO;
			case SOBRE_SECADO_VALUE: return SOBRE_SECADO;
			case BROCADO_VALUE: return BROCADO;
			case AVERRANADO_VALUE: return AVERRANADO;
			case INMADURO_VALUE: return INMADURO;
			case VINAGRE_VALUE: return VINAGRE;
			case CRISTALIZADO_VALUE: return CRISTALIZADO;
			case CARDENILLO_VALUE: return CARDENILLO;
			case NEGRO_VALUE: return NEGRO;
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
	private TipoDefectos(int value, String name, String literal) {
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
	
} //TipoDefectos
