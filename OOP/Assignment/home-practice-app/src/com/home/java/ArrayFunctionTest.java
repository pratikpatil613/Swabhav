package com.home.java;

public class ArrayFunctionTest {
	public static void main(String args[]) {
		int[] num = { 10, 20, 30, 40, 50 };

		int maxNo = maxOfArray(num);
		System.out.println(maxNo);

		int minNo = minOfArray(num);
		System.out.println(minNo);

		int avgNO = everageOfArray(num);
		System.out.println(avgNO);

	}

	static int maxOfArray(int[] maxInput) {
		int max = maxInput[0];
		System.out.println("Maximun NO:");

		for (int i = 0; i < maxInput.length; i++) {
			if (max < maxInput[i]) {
				max = maxInput[i];

			}
		}
		return max;
	}

	static int minOfArray(int[] minInput) {
		int min = minInput[0];
		System.out.println("Minimum No:");
		for (int i = 0; i < minInput.length; i++) {
			if (min > minInput[i]) {
				min = minInput[i];
			}
		}
		return min;
	}

	static int everageOfArray(int[] averageInput) {
		int sum = 0, avg = 0;
		System.out.println("Average:");
		for (int i = 0; i < averageInput.length; i++) {
			sum = (sum + averageInput[i]);
			avg = sum / averageInput.length;

		}
		return avg;
	}
}
