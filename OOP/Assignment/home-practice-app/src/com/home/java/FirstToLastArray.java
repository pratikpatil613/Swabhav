package com.home.java;

public class FirstToLastArray {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70 };

		firstTolast(numbers);
		for (int n : numbers) {
			System.out.println(n);
		}
	}

	public static void firstTolast(int[] arrayInput) {
		int temp = 0, j = arrayInput.length - 1;
		for (int i = 0; i < j; i++) {
			temp = arrayInput[i];
			arrayInput[i] = arrayInput[j];
			arrayInput[j] = temp;

		}
	}

}
