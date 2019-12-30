package com.techlabs.testdrivendevelopment.test;

import java.util.Scanner;

import com.techlabs.testdrivendevelopment.Board;
import com.techlabs.testdrivendevelopment.Cell;
import com.techlabs.testdrivendevelopment.Game;
import com.techlabs.testdrivendevelopment.MarkType;
import com.techlabs.testdrivendevelopment.Player;
import com.techlabs.testdrivendevelopment.Result;
import com.techlabs.testdrivendevelopment.ResultAnalyzer;

public class GameConsole {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter First player name");
		String p1 = input.next();
		System.out.println("Enter Second player name");
		String p2 = input.next();

		Board board = new Board(3, 3);
		Cell[][] gameBoard = board.getGameBoard();
		Player[] players = { new Player(p1, MarkType.X), new Player(p2, MarkType.O) };
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		Game game = new Game(players, board, analyzer);
		printBoard(gameBoard);

		do {
			try {

				System.out.println(game.getCurrentPlayer().getName() + " Enter cell number");
				// int row = input.nextInt();
				// int column = input.nextInt();
				int choice = input.nextInt();
				int row = 0, column = 0;

				if (choice == 1) {
					row = 0;
					column = 0;
				} else if (choice == 2) {
					row = 0;
					column = 1;
				} else if (choice == 3) {
					row = 0;
					column = 2;
				} else if (choice == 4) {
					row = 1;
					column = 0;

				} else if (choice == 5) {
					row = 1;
					column = 1;

				} else if (choice == 6) {
					row = 1;
					column = 2;

				} else if (choice == 7) {
					row = 2;
					column = 0;

				} else if (choice == 8) {
					row = 2;
					column = 1;

				} else if (choice == 9) {
					row = 2;
					column = 2;

				}

				game.Play(row, column);
				board.printBoard();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (analyzer.analyzeResult().name().equals("progress"));
		if (analyzer.analyzeResult().equals(Result.win)) {
			System.out.println(game.getCurrentPlayer().getName() + " " + analyzer.analyzeResult());
		} else
			System.out.println("Gmae " + analyzer.analyzeResult());

	}

	private static void printBoard(Cell[][] gameBoard) {
		int p = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("|" + gameBoard[i][j] + "|");

			}
			System.out.println(" ");
		}

	}

}
