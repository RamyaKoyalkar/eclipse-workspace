package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//Junit Test Case to demonstrate Assert Methods
public class AssertionTest {
	
	private static String  string1,string2,string3,string4,string5;
    private static int variable1,variable2;
    private static int[] airethematicArrary1;
    private static int[] airethematicArrary2;
    private static Integer string6;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Variable initialization   
        string1="Junit";                   
       string2="Junit";                   
       string3="test";                   
       string4="test";                   
       string5=null;                   
        variable1=1;                   
       variable2=2;                   
       airethematicArrary1 = new  int[] { 1, 2, 3 };                   
       airethematicArrary2 =new int[] { 1, 2, 3 };                   
       string6 =10;
       System.out.println("Before Class Executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class Executed");
	}

	/*@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}*/

	@Test
	public void test() {
		System.out.println("In Test Case");
        //Assert statements       
         assertEquals(string1,string2);    // asserts two objects are equal               
           assertSame(string3, string3);        // asserts that two objects refer to same object           
        assertNotSame(string1, string3);                   
          assertNotNull(string1);           
          assertNull(string5);    //        
           assertTrue(variable1 < variable2);                   
           assertArrayEquals(airethematicArrary1, airethematicArrary2);
	}

}
