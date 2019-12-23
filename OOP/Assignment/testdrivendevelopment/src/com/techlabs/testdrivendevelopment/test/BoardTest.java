package com.techlabs.testdrivendevelopment.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.techlabs.testdrivendevelopment.Board;
import com.techlabs.testdrivendevelopment.Cell;
import com.techlabs.testdrivendevelopment.MarkType;

public class BoardTest {

	@Test
	public void checkBoardIsEmpty() {
		Board board = new Board(3, 3);

		// MarkType extectedMark=MarkType.EMPTY;
		// board.setMarkBoard(extectedMark);
		Cell[][] returnBoard = new Cell[3][3];
		board.setGameBoard(3, 3);
		Cell[][] expectedBoard = returnBoard;
		Cell[][] actualBoard = board.getGameBoard();

		assertEquals(actualBoard, actualBoard);
		// board.printBoard();

	}

	@Test
	public void BoardIsFull() {
		Board board = new Board(3, 3);
		boolean expextedIsEmpty = true;

		board.setMarkCell(0, 0, new Cell(MarkType.X));
		board.setMarkCell(0, 1, new Cell(MarkType.O));
		board.setMarkCell(0, 2, new Cell(MarkType.X));
		board.setMarkCell(1, 0, new Cell(MarkType.O));
		board.setMarkCell(1, 1, new Cell(MarkType.EMPTY));
		board.setMarkCell(1, 2, new Cell(MarkType.O));
		board.setMarkCell(2, 0, new Cell(MarkType.X));
		board.setMarkCell(2, 1, new Cell(MarkType.O));
		board.setMarkCell(2, 2, new Cell(MarkType.X));

		board.printBoard();

		boolean expextedIsEmpty1 = board.isBoardEmpty();
		expextedIsEmpty = expextedIsEmpty1;
		assertTrue(expextedIsEmpty);
	}

	@Test
	public void getMarkCell() {
		Board board = new Board(3, 3);
		MarkType expeMarkType = MarkType.EMPTY;
		board.setMarkCell(2, 0,new Cell(MarkType.EMPTY));
		MarkType actualMarkType = board.getMarkCell(2,0).getMark();

		Assert.assertEquals(expeMarkType, actualMarkType);
	}
	

}
