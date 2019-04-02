import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {
	@BeforeClass 
	public static void Greet() {
		System.out.println("Before Everything");
	} 
	
	@Before
	public void BeforeMethod() {
		System.out.println("Before Each Test");
	}
	
	@After
	public void AfterMethod() {
		System.out.println("After Each Test");
	}
	
	@AfterClass
	public static void Farewell() {
		System.out.println("Goodbye");
	}
	
	@Test
	public void TestOne() {
		assertEquals(0, Calculate.Multiply(0, 1));
		System.out.println("Test 1");
	}
	
	@Test
	public void TestTwo() {
		assertEquals(1, Calculate.Multiply(1, 1));
		System.out.println("Test 2");
	}
	
	@Test
	public void TestThree() {
		assertEquals(2.0, Calculate.Multiply(1.0, 2.0), 0.5);
		System.out.println("Test 3");
	}
}
