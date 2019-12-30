package com.techlabs.testdrivendevelopment;

public class ResultAnalyzer {
	Result result;
	Board gameBoard;

	public ResultAnalyzer(Board gameBoard) {
		// this.result = result;
		this.gameBoard = gameBoard;
	}

	public Result analyzeResult() {
		String line = "";
		try {
			line = gameBoard.getCell(0, 0).getMark().toString() + gameBoard.getCell(0, 1).getMark().toString()
					+ gameBoard.getCell(0, 2).getMark().toString();

			if (line.equals("XXX")) {
				return result.win;
			} else if (line.equals("OOO")) {
				return result.win;
			}
		} catch (Exception e) {
			return result.lose;
		}

		line = gameBoard.getCell(1, 0).getMark().toString() + gameBoard.getCell(1, 1).getMark()
				+ gameBoard.getCell(1, 2).getMark().toString();
		if (line.equals("XXX")) {
			return result.win;
		} else if (line.equals("OOO")) {
			return result.win;
		}

		try {

			line = gameBoard.getCell(2, 0).getMark().toString() + gameBoard.getCell(2, 1).getMark().toString()
					+ gameBoard.getCell(2, 2).getMark().toString();
			if (line.equals("XXX")) {
				return result.win;
			} else if (line.equals("OOO")) {
				return result.win;
			}
		} catch (Exception e) {
			return result.lose;
		}

		try {
			line = gameBoard.getCell(0, 0).getMark().toString() + gameBoard.getCell(1, 0).getMark().toString()
					+ gameBoard.getCell(2, 0).getMark().toString();
			if (line.equals("XXX")) {
				return result.win;
			} else if (line.equals("OOO")) {
				return result.win;
			}
		} catch (Exception e) {

			return result.lose;
		}

		line = gameBoard.getCell(0, 1).getMark().toString() + gameBoard.getCell(1, 1).getMark().toString()
				+ gameBoard.getCell(2, 1).getMark().toString();
		if (line.equals("XXX")) {
			return result.win;
		} else if (line.equals("OOO")) {
			return result.win;
		}

		line = gameBoard.getCell(0, 2).getMark().toString() + gameBoard.getCell(1, 2).getMark().toString()
				+ gameBoard.getCell(2, 2).getMark().toString();
		if (line.equals("XXX")) {
			return result.win;
		} else if (line.equals("OOO")) {
			return result.win;
		}

		line = gameBoard.getCell(0, 0).getMark().toString() + gameBoard.getCell(1, 1).getMark().toString()
				+ gameBoard.getCell(2, 2).getMark().toString();
		if (line.equals("XXX")) {
			return result.win;
		} else if (line.equals("OOO")) {
			return result.win;
		}

		line = gameBoard.getCell(0, 2).getMark().toString() + gameBoard.getCell(1, 1).getMark().toString()
				+ gameBoard.getCell(2, 0).getMark().toString();
		if (line.equals("XXX")) {
			return result.win;
		} else if (line.equals("OOO")) {
			return result.win;
		}
		return null;

	}

}
