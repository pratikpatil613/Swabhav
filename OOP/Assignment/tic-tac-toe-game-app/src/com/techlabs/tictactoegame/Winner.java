package com.techlabs.tictactoegame;

import java.util.Arrays;
import java.util.List;

public class Winner {

	public static String checkWinner(String[][] gameBoard) {
		String line = " ";

		line = gameBoard[0][0] + gameBoard[0][1] + gameBoard[0][2];
		if (line.equals("XXX")) {
			return "X";
		} else if (line.equals("OOO")) {
			return "O";
		}

		line = gameBoard[1][0] + gameBoard[1][1] + gameBoard[1][2];
		if (line.equals("XXX")) {
			return "X";

		} else if (line.equals("OOO")) {
			return "O";
		}

		line = gameBoard[2][0] + gameBoard[2][1] + gameBoard[2][2];
		if (line.equals("XXX")) {
			return "X";

		} else if (line.equals("OOO")) {
			return "O";
		}

		line = gameBoard[0][0] + gameBoard[1][0] + gameBoard[2][0];
		if (line.equals("XXX")) {
			return "X";
		} else if (line.equals("OOO")) {
			return "O";
		}

		line = gameBoard[0][1] + gameBoard[1][1] + gameBoard[2][1];
		if (line.equals("XXX")) {
			return "X";
		} else if (line.equals("OOO")) {
			return "O";
		}

		line = gameBoard[0][2] + gameBoard[1][2] + gameBoard[2][2];
		if (line.equals("XXX")) {
			return "X";
		} else if (line.equals("OOO")) {
			return "O";
		}

		line = gameBoard[0][0] + gameBoard[1][1] + gameBoard[2][2];
		if (line.equals("XXX")) {
			return "X";
		} else if (line.equals("OOO")) {
			return "O";
		}

		line = gameBoard[0][2] + gameBoard[1][1] + gameBoard[2][0];
		if (line.equals("XXX")) {
			return "X";
		} else if (line.equals("OOO")) {
			return "O";
		}

		// List<String[]> list = Arrays.asList(gameBoard);
		// int i = 0;
		int p = 1;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (Arrays.asList(gameBoard[i][j]).contains(String.valueOf(p))) {
					break;
				} else if (p == 9) {
					return "draw";
				}
				p++;

			}
		}

		return null;

	}

}
