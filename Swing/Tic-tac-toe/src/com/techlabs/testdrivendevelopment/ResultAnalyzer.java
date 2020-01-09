package com.techlabs.testdrivendevelopment;

public class ResultAnalyzer {
	Result result;
	Board gameBoard;

	public ResultAnalyzer(Board gameBoard) {
		this.gameBoard = gameBoard;
	}

	public Result analyzeResult() {
		String line = "";
		try {
			line = gameBoard.getCell(0, 0).getMark().toString() + gameBoard.getCell(0, 1).getMark().toString()
					+ gameBoard.getCell(0, 2).getMark().toString();

			if (line.equalsIgnoreCase("XXX")) {
				return result.win;
			} else if (line.equalsIgnoreCase("OOO")) {
				return result.win;
			}
		} catch (Exception e) {
		}

		line = gameBoard.getCell(1, 0).getMark().toString() + gameBoard.getCell(1, 1).getMark()
				+ gameBoard.getCell(1, 2).getMark().toString();
		if (line.equalsIgnoreCase("XXX")) {
			return result.win;
		} else if (line.equalsIgnoreCase("OOO")) {
			return result.win;
		}

		try {

			line = gameBoard.getCell(2, 0).getMark().toString() + gameBoard.getCell(2, 1).getMark().toString()
					+ gameBoard.getCell(2, 2).getMark().toString();
			if (line.equalsIgnoreCase("XXX")) {
				return result.win;
			} else if (line.equalsIgnoreCase("OOO")) {
				return result.win;
			}
		} catch (Exception e) {
		}

		try {
			line = gameBoard.getCell(0, 0).getMark().toString() + gameBoard.getCell(1, 0).getMark().toString()
					+ gameBoard.getCell(2, 0).getMark().toString();
			if (line.equalsIgnoreCase("XXX")) {
				return result.win;
			} else if (line.equalsIgnoreCase("OOO")) {
				return result.win;
			}
		} catch (Exception e) {

		}

		line = gameBoard.getCell(0, 1).getMark().toString() + gameBoard.getCell(1, 1).getMark().toString()
				+ gameBoard.getCell(2, 1).getMark().toString();
		if (line.equalsIgnoreCase("XXX")) {
			return result.win;
		} else if (line.equalsIgnoreCase("OOO")) {
			return result.win;
		}

		line = gameBoard.getCell(0, 2).getMark().toString() + gameBoard.getCell(1, 2).getMark().toString()
				+ gameBoard.getCell(2, 2).getMark().toString();
		if (line.equalsIgnoreCase("XXX")) {
			return result.win;
		} else if (line.equalsIgnoreCase("OOO")) {
			return result.win;
		}

		line = gameBoard.getCell(0, 0).getMark().toString() + gameBoard.getCell(1, 1).getMark().toString()
				+ gameBoard.getCell(2, 2).getMark().toString();
		if (line.equalsIgnoreCase("XXX")) {
			return result.win;
		} else if (line.equalsIgnoreCase("OOO")) {
		}

		line = gameBoard.getCell(0, 2).getMark().toString() + gameBoard.getCell(1, 1).getMark().toString()
				+ gameBoard.getCell(2, 0).getMark().toString();
		if (line.equalsIgnoreCase("XXX")) {
			return result.win;
		} else if (line.equalsIgnoreCase("OOO")) {
			return result.win;
		}

		/*
		 * for (int i=0;i<gameBoard.getGameBoard().length;i++) { for (int
		 * j=0;j<gameBoard.getGameBoard().length;j++) { if (gameBoard.isBoardEmpty()) {
		 * return result.progress; } } return result.Draw;
		 * 
		 * }
		 */

		for (Cell[] cell : gameBoard.getGameBoard()) {
			for (Cell c : cell) {
				if (c.getMark() == MarkType.EMPTY) {
					return result.progress;
				}
			}
		}
		return result.Draw;

		// return null;

	}

	public void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(gameBoard.getGameBoard()[i][j].getMark() + "|");
			}
			System.out.println();
		}

		System.out.println(" ");
	}

}
