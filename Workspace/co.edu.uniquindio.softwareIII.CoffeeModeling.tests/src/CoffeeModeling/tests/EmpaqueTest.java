/**
 */
package CoffeeModeling.tests;

import CoffeeModeling.CoffeeModelingFactory;
import CoffeeModeling.Empaque;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Empaque</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmpaqueTest extends TestCase {

	/**
	 * The fixture for this Empaque test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Empaque fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EmpaqueTest.class);
	}

	/**
	 * Constructs a new Empaque test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmpaqueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Empaque test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Empaque fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Empaque test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Empaque getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoffeeModelingFactory.eINSTANCE.createEmpaque());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EmpaqueTest
