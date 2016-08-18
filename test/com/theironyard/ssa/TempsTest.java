package com.theironyard.ssa;

import static org.junit.Assert.*;
import java.awt.FontFormatException;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.theironyard.ssa.Temp;

public class TempsTest {

	Temp testTemp = new Temp(0);

	@Test
	public void simpleTest() {

		assertEquals(0, new Temp(0).display());
	}

	@Test
	public void nineOverFive() {
		assertEquals((9 / 5), 1);
	}

	@Test
	public void oneNineNineOverOneHundred() {
		assertEquals((199 / 100), 1);
	}

	@Test
	public void simple() {
		assertFalse(28 == new Temp(0).display());
	}

	@Test
	public void fahrenheitTestA() {
		assertEquals(0, testTemp.displayInF());
		assertEquals(41, new Temp(5, false).displayInF());
		assertEquals(32, new Temp(0, false).displayInF());
	}

	@Test
	public void celsiusTestA() {
		assertEquals(0, new Temp(32).displayInC());
		assertEquals(100, new Temp(212).displayInC());

	}

	@Test
	public void simpleF() {
		assertTrue(testTemp.displayInF() != testTemp.displayInC());
	}

	@Test
	public void zach() {
		assertTrue("the" == "the");
	}

	@Test
	public void perils() {
		float sum = 0f;
		for (float i = 0.0f; i < 0.9f; i+= 0.1f) {
			sum += i;
		}
		
		assertTrue(3.6f == sum);
	}

}
