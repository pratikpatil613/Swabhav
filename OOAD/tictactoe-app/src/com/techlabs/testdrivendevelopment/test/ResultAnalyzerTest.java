package com.techlabs.testdrivendevelopment.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.techlabs.testdrivendevelopment.Board;
import com.techlabs.testdrivendevelopment.MarkType;
import com.techlabs.testdrivendevelopment.Result;
import com.techlabs.testdrivendevelopment.ResultAnalyzer;



public class ResultAnalyzerTest {

	@Test
	public void checkHorizantaly() {
		Board board = new Board(3, 3);
		board.setCell(0, 0, (MarkType.X));
		board.setCell(0, 1, (MarkType.X));
		board.setCell(0, 2, (MarkType.X));

		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Result expectedResult = Result.win;
		Result actualResult = analyzer.analyzeResult();

		assertEquals(expectedResult, actualResult);
		// analyzer.printBoard();
	}

	@Test
	public void checkVertically() {
		Board board = new Board(3, 3);
		board.setCell(0, 2, (MarkType.O));
		board.setCell(1, 2, (MarkType.O));
		board.setCell(2, 2, (MarkType.O));

		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Result expectedResult = Result.win;

		Result actualResult = analyzer.analyzeResult();

		assertEquals(expectedResult, actualResult);

		// analyzer.printBoard();
	}

	@Test
	public void checkDiagonally() {
		Board board = new Board(3, 3);
		board.setCell(0, 2, (MarkType.X));
		board.setCell(1, 1, (MarkType.X));
		board.setCell(2, 0, (MarkType.X));

		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Result expectedResult = Result.win;
		Result actualResult = analyzer.analyzeResult();

		assertEquals(expectedResult, actualResult);

		// analyzer.printBoard();
	}

	@Test
	public void checkDraw() {

		Board board = new Board(3, 3);
		board.setCell(0, 0, (MarkType.O));
		board.setCell(0, 1, (MarkType.X));
		board.setCell(0, 2, (MarkType.O));
		board.setCell(1, 0, (MarkType.O));
		board.setCell(1, 1, (MarkType.X));
		board.setCell(1, 2, (MarkType.X));
		board.setCell(2, 0, (MarkType.X));
		board.setCell(2, 1, (MarkType.O));
		board.setCell(2, 2, (MarkType.O));

		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Result expectedResult = Result.Draw;

		Result actualResult = analyzer.analyzeResult();

		assertEquals(expectedResult, actualResult);

		board.printBoard();

	}

}
