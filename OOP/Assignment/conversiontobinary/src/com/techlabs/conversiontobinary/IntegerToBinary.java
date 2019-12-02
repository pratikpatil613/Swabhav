package com.techlabs.conversiontobinary;

public class IntegerToBinary {
	public static void main(String[] args) {
		int number = 121;
		findBinary(number);

	}

	private static void findBinary(int number) {

		int[] reminder = new int[100];
		final int TWO = 2;
		int quotient = 0;
		int p = 0;

		for (int i = 0; number > 0; i++) {
			quotient = number / TWO;
			reminder[p] = number % TWO;
			number = quotient;
			p++;
		}

		for (int j = p - 1; j >= 0; j--) {
			System.out.print(reminder[j]);
		}
	}

}
