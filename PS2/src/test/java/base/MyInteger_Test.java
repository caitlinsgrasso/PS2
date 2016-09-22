package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	static MyInteger iValue;
	static MyInteger num;
	static int evenNum;
	static int oddNum;
	static int primeNum;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		iValue = new MyInteger(4);
		num = new MyInteger(3);
		evenNum=6;
		oddNum=7;
		primeNum=3;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test 
	public void getiValueTest() {
		assertEquals(iValue.getiValue(),4);
	}
	
	@Test
	public void isEvenTest() {
		assertTrue(iValue.isEven());
		assertFalse(num.isEven());
		assertTrue(MyInteger.isEven(evenNum));
		assertFalse(MyInteger.isEven(oddNum));
		assertTrue(MyInteger.isEven(iValue));
		assertFalse(MyInteger.isEven(num));
	}
	
	public void isOddTest() {
		assertTrue(iValue.isOdd());
		assertFalse(num.isOdd());
		assertFalse(MyInteger.isOdd(evenNum));
		assertTrue(MyInteger.isOdd(oddNum));
		assertTrue(MyInteger.isOdd(num));
		assertFalse(MyInteger.isOdd(iValue));
	}
	
	public void isPrimeTest(){
		assertFalse(num.isPrime());
		assertFalse(iValue.isPrime());
		assertTrue(MyInteger.isPrime(primeNum));
		assertFalse(MyInteger.isPrime(evenNum));
		assertFalse(MyInteger.isPrime(num));
		assertFalse(MyInteger.isPrime(iValue));
	}
	
	public void equalsTest() {
		assertTrue(iValue.isEven());
		assertFalse(num.isEven());
		assertFalse(MyInteger.isEven(oddNum));
		assertTrue(MyInteger.isEven(evenNum));
		assertFalse(MyInteger.isEven(num));
		assertTrue(MyInteger.isEven(iValue));
	}
}
