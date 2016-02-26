package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void testisEven() {
		MyInteger even = new MyInteger(2);
		MyInteger noteven = new MyInteger(3);
		assertEquals(true, even.isEven());
		assertEquals(false, noteven.isEven());
	}
	
	@Test
	public void testisOdd() {
		MyInteger odd = new MyInteger(3);
		MyInteger notodd = new MyInteger(2);
		assertEquals(true, odd.isOdd());
		assertEquals(false, notodd.isOdd());
	}
	
	@Test
	public void testisPrime() {
		MyInteger prime = new MyInteger (107);
		MyInteger notprime = new MyInteger (57);
		MyInteger negative = new MyInteger (-17);
		assertEquals(true, prime.isPrime());
		assertEquals(false, notprime.isPrime());
		assertEquals(false, negative.isPrime());
	}
	
	@Test
	public void testisEvenint() {
		assertEquals(true, MyInteger.isEven(2));
		assertEquals(false, MyInteger.isEven(3));
	}
	
	@Test
	public void testisOddint() {
		assertEquals(true, MyInteger.isOdd(3));
		assertEquals(false, MyInteger.isOdd(2));
	}
	
	@Test 
	public void testisPrimeint() {
		assertEquals(true, MyInteger.isPrime(17));
		assertEquals(false, MyInteger.isPrime(22));
		assertEquals(false, MyInteger.isPrime(-17));
	}
	
	@Test
	public void testisEvenmyint() {
		MyInteger even = new MyInteger(2);
		MyInteger noteven = new MyInteger(3);
		assertEquals(true, MyInteger.isEven(even));
		assertEquals(false, MyInteger.isEven(noteven));

		
	}
	
	@Test
	public void testisOddmyint() {
		MyInteger odd = new MyInteger(3);
		MyInteger notodd = new MyInteger(2);
		assertEquals(true, MyInteger.isOdd(odd));
		assertEquals(false, MyInteger.isOdd(notodd));
	}
	
	@Test
	public void testisPrimemyint() {
		MyInteger prime = new MyInteger(17);
		MyInteger notprime = new MyInteger (27);
		MyInteger negative = new MyInteger (-17);
		assertEquals(true, MyInteger.isPrime(prime));
		assertEquals(false, MyInteger.isPrime(notprime));
		assertEquals(false, MyInteger.isPrime(negative));
	}

	@Test
	public void testequalint() {
		MyInteger doesequal = new MyInteger(100);
		assertEquals(true, doesequal.equals(100));
		assertEquals(false, doesequal.equals(20));
	}
	
	@Test 
	public void testequalmyint() {
		MyInteger doesequal = new MyInteger(100);
		MyInteger itdoequal = new MyInteger(100);
		MyInteger noequal = new MyInteger(99);
		assertEquals(true, doesequal.equals(itdoequal));
		assertEquals(false, doesequal.equals(noequal));
	}

}
