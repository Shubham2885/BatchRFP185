package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javaconstructprogramming.Calculate;

public class TestClass {

	Calculate calculate = new Calculate();
	private static final double DELTA = 1e-15;
	
	@Test
	public void areaOfRectangleTest() {
		int result = calculate.areaOfRectangle(5, 10);
		assertEquals(50, result);
	}
	
	@Test
	public void areaOfTriangleTest() {
		double result = calculate.areaOfTriangle(10, 10);
		assertEquals(50, result, DELTA);
	}
}
