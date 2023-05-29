import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: DELL 5510
 * Student ID: {type your id here}
 * Class: {type your class here}
 * Date/Time created: Monday 29-05-2023 12:11
 */

/**
 * @author DELL 5510
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);	
	}
	
	public void testMultiply() {
		int a = 200;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 400;
		assertEquals (actual, expected);
	}
	
	public void testDivide() {
		int a = 200;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 100;
		assertEquals (actual, expected);
	}
	
	


}
