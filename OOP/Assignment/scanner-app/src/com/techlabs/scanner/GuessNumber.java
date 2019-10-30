package com.techlabs.scanner;

import java.util.*;

public class GuessNumber {
	public static void main(String[] args) {

		guessNumber();

	}

	public static void guessNumber() {
		Scanner in = new Scanner(System.in);
		int choice, guessNum;
		do {
			int count = 0;
			System.out.println("1.Start");
			System.out.println("2.Stop");
			choice = in.nextInt();
			if (choice == 1) {
				int num = (int) (Math.random() * 50);
				System.out.println("I Already guess a Number");
				do {
					System.out.println("Can You Tell NO");
					guessNum = in.nextInt();
					if (num == guessNum) {
						count++;
						System.out.println("Yeh You Win At:" + count);

					} else if (num > guessNum) {
						System.out.println("Too Less");
						count++;
					} else if (num < guessNum) {
						System.out.println("Too High");
						count++;
					}
				} while (!(num == guessNum));
			} else if (choice == 2) {
				System.out.println("Game End");
				break;

			}
		} while (!(choice == 2));
	}

}
