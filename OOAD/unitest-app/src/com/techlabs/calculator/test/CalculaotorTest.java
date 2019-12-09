package com.techlabs.calculator.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.techlabs.unittest.Calculator;

import junit.framework.Assert;

public class CalculaotorTest {

	@Test
	public void calculatePositiveVal() throws Exception {
		// Arrange
		Calculator cal = new Calculator();
		int expectedResult = 30;
		// Ant
		int actualResult = cal.add(10, 20);
		// Assert
		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void calulateNegativeVal() {

		// Arrange
		boolean exp = false;
		Calculator cal = new Calculator();
		int expectedResult = 50;
		try {
			// Ant
			int actualResult = cal.add(-30, 20);
		} catch (Exception e) {
			exp = true;
		}
		// Assert
		assertTrue(exp);
	}

}
