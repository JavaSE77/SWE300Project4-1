package xyz.javase.swe300.project2;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class Main {
	
	/**
	 * Project 4 - Part 1
	 * SWE 300
	 * @author Russell Stevens, Makaylie Lucas
	 * 
	 */

	public static void main(String[] args) {
		
		//Test cases in main
		Context context = new Context();
		System.out.println(context.parse("1"));
		System.out.println(context.parse("12"));
		System.out.println(context.parse("-1"));
		System.out.println(context.parse("-12"));
		System.out.println(context.parse(".12"));
		System.out.println(context.parse("1.12"));
		System.out.println(context.parse("+12"));
		System.out.println(context.parse("trehtre"));
		System.out.println(context.parse("1f2"));
		System.out.println(context.parse("1+3"));
		System.out.println(context.parse("1-5"));
		System.out.println(context.parse("\0"));
		System.out.println(context.parse(".e"));
		System.out.println(context.parse(".1q"));
		System.out.println(context.parse("1.12"));
		
	}
	
	
	@Test
	public void testInt() {
		Context context = new Context();
		int testValue = 1;
		double test = context.parse("" + testValue);
		assertTrue(testValue == test);
		
		testValue = 12;
		test = context.parse("" + testValue);
		assertTrue(testValue == test);
		
		testValue = 8234167;
		test = context.parse("" + testValue);
		assertTrue(testValue == test);
	}
	
	
	@Test
	public void testNegative() {
		Context context = new Context();
		double testValue = -1;
		double test = context.parse("" + testValue);
		assertTrue(testValue == test);
		
		testValue = -12;
		test = context.parse("" + testValue);
		assertTrue(testValue == test);
		
		testValue = -8234167;
		test = context.parse("" + testValue);
		assertTrue(testValue == test);
		
		testValue = -82.167;
		test = context.parse("" + testValue);
		assertTrue(testValue == test);
	}	
	
	
	@Test
	public void testDecimal() {
		Context context = new Context();
		double testValue = .1;
		double test = context.parse("" + testValue);
		assertTrue(testValue == test);
		
		testValue = .12;
		test = context.parse("" + testValue);
		assertTrue(testValue == test);
		
		testValue = 1.12;
		test = context.parse("" + testValue);
		assertTrue(testValue == test);
		
		testValue = .8234167;
		test = context.parse("" + testValue);
		assertTrue(testValue == test);		
	}
	
	
	@Test
	public void testPositive() {
		Context context = new Context();
		double testValue = +1;
		double test = context.parse("" + testValue);
		assertTrue(testValue == test);
		
		testValue = +12;
		test = context.parse("" + testValue);
		assertTrue(testValue == test);
		
		testValue = +8234167;
		test = context.parse("" + testValue);
		assertTrue(testValue == test);
		
		testValue = +82.167;
		test = context.parse("" + testValue);
		assertTrue(testValue == test);
	}
	
	
	@Test
	public void testBadInput() {
		Context context = new Context();
		String testValue = "+1e";
		double test = context.parse(testValue);
		assertTrue(0 == test);
		
		testValue = "01+2";
		test = context.parse(testValue);
		assertTrue(0 == test);
		
		testValue = "reg";
		test = context.parse(testValue);
		assertTrue(0 == test);

		testValue = "";
		test = context.parse(testValue);
		assertTrue(0 == test);
		
		testValue = "1-04";
		test = context.parse(testValue);
		assertTrue(0 == test);
		
		testValue = "\0";
		test = context.parse(testValue);
		assertTrue(0 == test);
		
		testValue = ".e";
		test = context.parse(testValue);
		assertTrue(0 == test);	
		
		testValue = "1.e";
		test = context.parse(testValue);
		assertTrue(0 == test);
		
		testValue = ".1-04";
		test = context.parse(testValue);
		assertTrue(0 == test);
	}
	
	
}
