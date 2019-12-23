package com.techlabs.testdrivendevelopment.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.techlabs.testdrivendevelopment.Board;
import com.techlabs.testdrivendevelopment.Cell;
import com.techlabs.testdrivendevelopment.MarkType;
import com.techlabs.testdrivendevelopment.Result;
import com.techlabs.testdrivendevelopment.ResultAnalyzer;

public class ResultAnalyzerTest {

	@Test
	public void checkHorizantaly() {
		Board board = new Board(3, 3);
		board.setMarkCell(0, 0, new Cell(MarkType.X));
		board.setMarkCell(0, 1, new Cell(MarkType.X));
		board.setMarkCell(0, 2, new Cell(MarkType.X));

		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Result expectedResult = Result.win;
		Result actualResult = analyzer.analyzeResult();

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void checkVertically() {
		Board board = new Board(3, 3);
		board.setMarkCell(0, 0, new Cell(MarkType.O));
		board.setMarkCell(1, 0, new Cell(MarkType.O));
		board.setMarkCell(2, 0, new Cell(MarkType.O));

		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Result expectedResult = Result.lose;

		Result actualResult = analyzer.analyzeResult();

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void diagonally() {
		Board board = new Board(3, 3);
		board.setMarkCell(0, 0, new Cell(MarkType.X));
		board.setMarkCell(0, 1, new Cell(MarkType.X));
		board.setMarkCell(2, 2, new Cell(MarkType.X));

		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Result expectedResult = Result.win;
		Result actualResult = analyzer.analyzeResult();

		assertEquals(expectedResult, actualResult);
	}

}
