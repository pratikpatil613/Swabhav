package com.techlabs.tictactoegame;

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {

		int winner = 0;
		Scanner userInput = new Scanner(System.in);

		String[][] gameBoard = new String[3][3];
		int z = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				gameBoard[i][j] = Integer.toString(z++);

				// z++;
				System.out.print("|" + gameBoard[i][j] + "|");

			}
			System.out.println();

		}

		new Player().play(gameBoard);

		/*
		 * String sign = "X"; do {
		 * 
		 * System.out.println("player 1: plese select no to enter your choice"); String
		 * choice = userInput.nextLine(); // System.out.println("enter your sign"); //
		 * String sign = userInput.nextLine();
		 * 
		 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 3; j++) {
		 * 
		 * if (gameBoard[i][j].equals(choice)) { gameBoard[i][j] = sign; }
		 * System.out.print("|" + gameBoard[i][j] + "|");
		 * 
		 * } System.out.println();
		 * 
		 * } if (sign.equals("X")) { sign = "O"; } else sign = "X";
		 * 
		 * winner++; } while (winner < 9); System.out.println("bord is full");
		 */

	}

}
