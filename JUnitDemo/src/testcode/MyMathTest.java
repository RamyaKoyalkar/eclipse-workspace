package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.MyMath;

public class MyMathTest {

	// Create a Object Reference of a class to be Tested
	MyMath m;
	
	@Before
	public void setUp() throws Exception {
		m=new MyMath();
	}
	/*@After annotation is used on a method containing java code to run after each test case.
     * These methods will run even if any exceptions are thrown in the test case or in the
     *  case of assertion failures.*/
	@After
	public void tearDown() throws Exception {
		m=null;
	}

	@Test
	public void testMyMath() {
		System.out.println("test with 5 Numbers");
		assertEquals(20, m.sum(new int[] {5,3,1,6,5}),0);
	}

	@Test
	public void testSum() {
		System.out.println("test with 3 Numbers");
		int s=m.sum(new int[] {5,3,2});
		assertEquals(10,s,0);
	}

}
