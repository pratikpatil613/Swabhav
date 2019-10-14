package com.techlab.basic;

public class ArrayTest {
	public static void main(String args[]) {
		int[] nos = { 10, 20, 30 };
		printNumbers(nos);
		printSum(nos);
		printsum2(nos);
		;

	}

	static void printNumbers(int[] nos) {
		System.out.println("numbers are");
		for (int j = 0; j < nos.length; j++) {
			System.out.println(j + "->" + nos[j]);
		}
	}

	static void printSum(int[] nos) {
		int sum = 0;
		System.out.println("sum of no");
		for (int i = 0; i < nos.length; i++) {
			sum = sum + nos[i];
		}
		System.out.println(sum);
	}

	static void printsum2(int[] nos) {
		System.out.println("for each");
		for (int num : nos) {
			System.out.println(num);

		}

	}

}
