package com.prowings.TestJunitDemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import com.prowings.JunitDemo.Calculator;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(3,5);
		
		assertEquals(8,result);
	}
	
	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		
		int result = calculator.subtract(8,3);
		
		assertEquals(5, result);
	}
	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		
		int result = calculator.multiply(4,5);
		
		assertEquals(20,result);
	}
	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		
		int result = calculator.divide(10,2);
		
		assertEquals(5,result);
		
		assertThrows(IllegalArgumentException.class, () -> calculator.divide(10,result));
	}

}
