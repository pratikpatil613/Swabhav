package com.techlabs.testdrivendevelopment.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.techlabs.testdrivendevelopment.Board;
import com.techlabs.testdrivendevelopment.Cell;
import com.techlabs.testdrivendevelopment.MarkType;

public class BoardTest {

	@Test
	public void checkBoardIsEmpty() {
		List<Cell> cellList = new ArrayList<Cell>(9);
		Board board = new Board();
		MarkType extectedMark = MarkType.EMPTY;
		cellList.add(new Cell(MarkType.EMPTY));
		cellList.add(new Cell(MarkType.EMPTY));
		board.setCellList(cellList);

		MarkType actualMark = board.getCellList().get(0).getMark();
		MarkType actualMark1 = board.getCellList().get(1).getMark();
//		Cell actualMark2 = board.getCellList().get(2);

		assertEquals(extectedMark, actualMark);

	}

	@Test
	void checkBoardIsFull() {
		List<Cell> cellList = new ArrayList<Cell>();
		Board board = new Board();
		MarkType expectedMark = MarkType.o;
		MarkType expectedMark1 = MarkType.X;

		cellList.add(new Cell(MarkType.o));
		cellList.add(new Cell(MarkType.X));

		board.setCellList(cellList);
		MarkType actualMark = board.getCellList().get(0).getMark();
		MarkType actualMark1 = board.getCellList().get(0).getMark();

		assertEquals(expectedMark, actualMark);
		assertEquals(expectedMark1, actualMark1);

	}

}
