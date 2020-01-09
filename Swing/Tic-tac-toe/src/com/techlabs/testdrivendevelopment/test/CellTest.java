package com.techlabs.testdrivendevelopment.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.techlabs.testdrivendevelopment.Cell;
import com.techlabs.testdrivendevelopment.MarkType;




public class CellTest {

	@Test
	public void testCellCotainO() {
		Cell cell = new Cell(MarkType.O);
		MarkType expectedMark = MarkType.O;
		MarkType actualMark = cell.getMark();
		assertEquals(expectedMark, actualMark);
	}

	@Test
	public void testCellContainsX() {
		Cell cell = new Cell(MarkType.X);
		MarkType expectedMark = MarkType.X;
		MarkType actualMark = cell.getMark();
		assertEquals(expectedMark, actualMark);
	}

	@Test
	public void testCellIsEmpty() {
		Cell cell = new Cell(MarkType.EMPTY);
		MarkType expecteMark = MarkType.EMPTY;
		MarkType actualMark = cell.getMark();
	}

	@Test
	public void testCellAlreayContainsMark() {
		boolean result = false;
		Cell cell = new Cell(MarkType.O);
		MarkType expextedMark = MarkType.O;
		try {
			cell.setMark(MarkType.X);
			MarkType actualMark = cell.getMark();

		} catch (Exception e) {
			result = true;
		}
		assertTrue(result);
	}
}
