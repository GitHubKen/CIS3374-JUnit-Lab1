package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2,  2));
		
		assertNotEquals(4, calculator.add(1, 2));
	}
	
	@Test
	public void subTest(){
		assertEquals(10, calculator.subtract(20, 10));
		
		assertNotEquals(4, calculator.add(1, 2));
	}
	
	@Test
	public void multiTest(){
		assertEquals(15, calculator.multiply(5, 3));
		
		assertNotEquals(4, calculator.add(1, 2));
	}
	
	@Test
	public void divTest(){
		assertEquals(4, calculator.divide(16, 4));
	
		assertNotEquals(4, calculator.add(1, 2));
	}
	
	@Test
	public void isEqualTest(){
		assertEquals(true, calculator.isEqual(1, 1));
		assertTrue(true);
		
		assertNotEquals(true, calculator.isEqual(2, 3));
		assertFalse(false);
	}
}