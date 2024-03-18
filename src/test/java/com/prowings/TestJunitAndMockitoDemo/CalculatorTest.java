package com.prowings.TestJunitAndMockitoDemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

import org.junit.Test;

import com.prowings.JunitDemo.Calculator;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		
		Calculator mockCalculator = mock(Calculator.class);
		
		when(mockCalculator.add(3,5)).thenReturn(8);
		
		assertEquals(8,mockCalculator.add(3,5));
		
		verify(mockCalculator).add(3,5);
	}
	
	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		
		Calculator mockCalculator = mock(Calculator.class);
		
		when(mockCalculator.divide(10,2)).thenReturn(5);
		
		assertEquals(5,mockCalculator.divide(10,2));
		
		verify(mockCalculator).divide(10,2);
		
//		assertThrows(IllegalArgumentException.class,() -> mockCalculator.divide(10,0));
		
		
	}

}
