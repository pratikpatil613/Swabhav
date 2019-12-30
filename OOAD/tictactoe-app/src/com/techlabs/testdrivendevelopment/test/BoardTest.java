package com.techlabs.testdrivendevelopment.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

		board.setCell(0, 0, (MarkType.X));
		board.setCell(0, 1, (MarkType.O));
		board.setCell(0, 2, (MarkType.X));
		board.setCell(1, 0, (MarkType.O));
		board.setCell(1, 1, (MarkType.X));
		board.setCell(1, 2, (MarkType.O));
		board.setCell(2, 0, (MarkType.X));
		board.setCell(2, 1, (MarkType.O));
		board.setCell(2, 2, (MarkType.EMPTY));

		// board.printBoard();
		boolean expextedIsEmpty = true;
		boolean expextedIsEmpty1 = board.isBoardEmpty();
		expextedIsEmpty = expextedIsEmpty1;
		assertTrue(expextedIsEmpty);
	}

	@Test
	public void getMarkCell() {
		Board board = new Board(3, 3);
		MarkType expeMarkType = MarkType.EMPTY;
		board.setCell(2, 0, (MarkType.EMPTY));
		MarkType actualMarkType = board.getCell(2, 0).getMark();

		Assert.assertEquals(expeMarkType, actualMarkType);
	}

	@Test
	public void tesboard() {
		Board board = new Board(3, 3);
		board.printBoard();
	}

}
