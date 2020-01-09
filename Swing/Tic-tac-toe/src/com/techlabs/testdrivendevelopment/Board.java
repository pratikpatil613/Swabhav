package com.techlabs.testdrivendevelopment;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private Cell[][] gameBoard;

	public Board(int rows, int columns) {
		gameBoard = new Cell[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				gameBoard[i][j] = new Cell();

			}
		}

	}

	public void setGameBoard(int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				gameBoard = new Cell[rows][columns];
			}
		}
	}

	public Cell[][] getGameBoard() {
		return gameBoard;
	}

	public void setCell(int i, int j, MarkType mark) {
		gameBoard[i][j].setMark(mark);

	}

	public Cell getCell(int i, int j) {
		return gameBoard[i][j];
	}

	public boolean isBoardEmpty() {
		for (Cell[] c : gameBoard) {
			for (Cell e : c) {
				if (e.getMark() == MarkType.EMPTY) {
					return true;
				}
			}
		}
		return false;
	}

	public void printBoard() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (gameBoard[i][j].getMark() == MarkType.X || gameBoard[i][j].getMark() == MarkType.O) {

					System.out.print(gameBoard[i][j].getMark() + "|");

				} else {
					System.out.print(gameBoard[i][j] + "|");

				}
				// if (gameBoard[i][j].getMark() == MarkType.X || gameBoard[i][j].getMark() ==
				// MarkType.O) {
				// continue;

				// } else {
				// System.out.println(gameBoard[i][j]);
				// }

			}
			System.out.println();
		}

		System.out.println(" ");

	}

}
