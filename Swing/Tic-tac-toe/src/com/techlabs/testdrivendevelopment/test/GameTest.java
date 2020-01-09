package com.techlabs.testdrivendevelopment.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.techlabs.testdrivendevelopment.Board;
import com.techlabs.testdrivendevelopment.Game;
import com.techlabs.testdrivendevelopment.MarkType;
import com.techlabs.testdrivendevelopment.Player;
import com.techlabs.testdrivendevelopment.Result;
import com.techlabs.testdrivendevelopment.ResultAnalyzer;


public class GameTest {

	@Test
	public void checkPlayerTurn() {
		Board board = new Board(3, 3);
		// board.setCell(0, 1, MarkType.O);
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		Player[] players = { new Player("a", MarkType.X), new Player("B", MarkType.O) };
		Game game = new Game(players, board, analyzer);
		Player player = game.getCurrentPlayer();
		assertEquals(players[0], player);

		game.Play(0, 0);
		player = game.getCurrentPlayer();
		assertEquals(players[1], player);

		game.Play(0, 1);
		player = game.getCurrentPlayer();
		assertEquals(players[0], player);

	}

	@Test
	public void checkResult() {
		Board board = new Board(3, 3);
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		Player[] players = { new Player("P", MarkType.X), new Player("Q", MarkType.O) };
		Game game = new Game(players, board, analyzer);
		Result expectedrResult = Result.progress;
		Result actualResult = game.Play(0, 0);

		assertEquals(expectedrResult, actualResult);
		game.Play(0, 1);
		game.Play(0, 2);
		game.Play(1, 0);
		game.Play(1, 1);
		game.Play(1, 2);
		game.Play(2, 0);
		game.Play(2, 1);
		game.Play(2, 2);
		System.out.println(analyzer.analyzeResult());

	}

}
