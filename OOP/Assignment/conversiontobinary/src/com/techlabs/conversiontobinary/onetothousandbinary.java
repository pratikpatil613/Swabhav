package com.techlabs.conversiontobinary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class onetothousandbinary {

	public static void main(String[] args) {
		findBinary();

	}

	private static void findBinary() {
		List<int[]> binary = new ArrayList();

		int[] reminder = new int[10];
		final int TWO = 2;
		int quotient = 0;
		int number = 1;

		try {
			while (number <= 1000) {
				int newNumber = number;
				int p = 0;
				for (int i = 0; newNumber > 0; i++) {
					quotient = newNumber / TWO;
					reminder[p++] = newNumber % TWO;
					newNumber = quotient;
					// p++;
				}

				int[] reversReminder = new int[p];
				int q = 0;
				for (int j = p; j > 0; j--) {
					reversReminder[q] = reminder[j - 1];
					q++;
				}

				/*
				 * for (int i = 0; i < reminder.length; i++) { reminder[i] = 0; }
				 */

				binary.add(reversReminder);

				number++;

			}

			for (int[] a : binary) {
				int no = binary.indexOf(a) + 1;
				System.out.println(Arrays.toString(a).replace('[', ' ')
						.replace(",", "").replace(']', ' '));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
