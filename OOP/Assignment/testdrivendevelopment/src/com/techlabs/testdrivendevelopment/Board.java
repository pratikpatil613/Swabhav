package com.techlabs.testdrivendevelopment;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private Cell[][] gameBoard;

	public Board(int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				gameBoard = new Cell[rows][columns];
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

	public void setMarkCell(int i, int j, Cell cell) {
		gameBoard[i][j] = cell;

	}

	public Cell getMarkCell(int i, int j) {
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
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(gameBoard[i][j].getMark() + "|");
			}
			System.out.println();
		}

		System.out.println(" ");
	}

}
