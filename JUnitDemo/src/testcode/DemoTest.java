package testcode;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.Demo;

public class DemoTest {
	
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Before Test Case");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after test case");
	}

	@Test
	public void testFindMax() {
		System.out.println("test case to find max");
		assertEquals(10,Demo.findMax(new int[] {20,2,10,15}));
		assertEquals(-2,Demo.findMax(new int[] {-12,-2,-4,-222}));
	}

	@Test
	public void testCube() {
		System.out.println("Test case cube");
		assertEquals(27,Demo.cube(3));
	}

	@Test
	public void testReverseWord() {
		System.out.println("Test case reverse word");
		assertEquals("madam",Demo.reverseWord("madam"));
	}

}
