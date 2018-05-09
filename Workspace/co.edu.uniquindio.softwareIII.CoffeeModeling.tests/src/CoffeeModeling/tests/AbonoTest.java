/**
 */
package CoffeeModeling.tests;

import CoffeeModeling.Abono;
import CoffeeModeling.CoffeeModelingFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abono</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbonoTest extends TestCase {

	/**
	 * The fixture for this Abono test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Abono fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbonoTest.class);
	}

	/**
	 * Constructs a new Abono test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbonoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Abono test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Abono fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Abono test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Abono getFixture() {
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
		setFixture(CoffeeModelingFactory.eINSTANCE.createAbono());
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

} //AbonoTest
