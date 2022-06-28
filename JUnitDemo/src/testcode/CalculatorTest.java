package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.Calculator;

public class CalculatorTest {
	
	// Create a object of a Class to be tested
	private Calculator calc;
	/*@Before annotation in JUnit is used on a method containing Java code to
     *  run before each test case. i.e it runs before each test execution.*/

	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
	}
	
	/*@After annotation is used on a method containing java code to run after each test case.
     * These methods will run even if any exceptions are thrown in the test case or in the
     *  case of assertion failures.*/
	@After
	public void tearDown() throws Exception {
		calc=null;
	}

	@Test
	public void testAdd() {
		double add=calc.add(10.5,20.32);
		assertEquals(30.82,add,0);
	}

	@Test
	public void testSubtract() {
		double sub=calc.subtract(100.5,100);
		assertEquals(.5,sub,0);
	}

	@Test
	public void testMultiply() {
		double mul=calc.multiply(2.5,100);
		assertEquals(250,mul,0);
	}

	@Test
	public void testDivide() {
		double div=calc.divide(100,5);
		assertEquals(20,div,0.001);
	}
	
	@Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calc.divide(100, 0);
	}

}
