package testcode;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationsDemoTest {
	
	private ArrayList<String> list;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Using @BeforeClass , executed before all test cases ");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Using @AfterClass ,executed after all test cases");   
	}

	@Before
	public void setUp() throws Exception {
		list = new ArrayList<String>();                   
        System.out.println("Using @Before annotations ,executed before each test cases ");   
	}

	@After
	public void tearDown() throws Exception {
		list.clear();           
        System.out.println("Using @After ,executed after each test cases");   
	}

	@Test
	public void test() {
		list.add("Junit");   
        list.add("Mockito");
       
        assertFalse(list.isEmpty());           
        assertEquals(2, list.size());
        System.out.println("In Test Method");
	}
	@Test
    public void test1() {
        list.add("Junit");   
        assertFalse(list.isEmpty());           
        assertEquals(1, list.size());
        System.out.println("In Test Method");
    }
	
	@Ignore
    public void m6() {                    
        System.out.println("Using @Ignore , this execution is ignored");                    
    }        

 

    @Test(timeout = 10)            
    public void m7() {                    
        System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");                    
    }        

 

    @Test(expected = NoSuchMethodException.class)                    
    public void m8() {                    
        System.out.println("Using @Test(expected) ,it will check for "+ "specified exception during its execution");
    }
 
}
