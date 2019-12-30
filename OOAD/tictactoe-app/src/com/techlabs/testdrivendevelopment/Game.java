package com.techlabs.testdrivendevelopment;

public class Game {

	Player[] players;
	Board gmaeBoard;
	ResultAnalyzer analyzer;
	private int turn;

	public Game(Player[] players, Board gameBoard, ResultAnalyzer analyzer) {
		this.players = players;
		this.gmaeBoard = gameBoard;
		this.analyzer = analyzer;
		turn = 0;

	}

	public Result Play(int i, int j) {

		gmaeBoard.setCell(i, j, players[turn].getMarkType());
		changeTurn();
		return analyzer.analyzeResult();

	}

	public void changeTurn() {
		if (!(analyzer.analyzeResult().equals(Result.win)))
			turn = (turn + 1) % players.length;

	}

	public Player getCurrentPlayer() {
		return players[this.turn];
	}

}
