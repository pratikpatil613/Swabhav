package com.home.java;

public class ArrayMigration {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60 };

		arrayMigrate(numbers, 2);
		for (int n : numbers) {
			System.out.println(n);
		}

	}

	public static void arrayMigrate(int[] arrayInput, int num) {
		int len = arrayInput.length - 1, temp = 0;
		for (int i = 0; i < num; i++) {
			temp = arrayInput[0];
			for (int j = 0; j < len; j++) {

				arrayInput[j] = arrayInput[j + 1];

			}
			arrayInput[len] = temp;

		}
	}
}
