/**
 */
package CoffeeModeling.tests;

import CoffeeModeling.CoffeeModelingFactory;
import CoffeeModeling.Siembra;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Siembra</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SiembraTest extends TestCase {

	/**
	 * The fixture for this Siembra test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Siembra fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SiembraTest.class);
	}

	/**
	 * Constructs a new Siembra test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiembraTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Siembra test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Siembra fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Siembra test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Siembra getFixture() {
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
		setFixture(CoffeeModelingFactory.eINSTANCE.createSiembra());
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

} //SiembraTest
