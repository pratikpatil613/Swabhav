package com.techlabs.tictactoegame;

import java.util.*;

public class Player {
	private String sign = "X";
	private String winner;

	public void play(String[][] gameBoard) {

		Scanner userInput = new Scanner(System.in);

		do {
			System.out.println("player: plese select number to enter your choice");
			String choice = userInput.nextLine();

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {

					if (gameBoard[i][j].equals(choice)) {
						gameBoard[i][j] = sign;
					}
					System.out.print("|" + gameBoard[i][j] + "|");

				}
				System.out.println();

			}
			if (sign.equals("X")) {
				sign = "O";
			} else
				sign = "X";

			winner = Winner.checkWinner(gameBoard);

		} while (winner == null);
		// System.out.println("!!!!Congratulations " + "'" + winner + "'" + "opted
		// player win!!!!!");
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("It's a draw! Thanks for playing.");
		} else {
			System.out.println("Congratulations! " + winner + "'s " + "have won! Thanks for playing.");
		}

	}

}
