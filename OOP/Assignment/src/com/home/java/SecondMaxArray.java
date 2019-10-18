package com.home.java;

public class SecondMaxArray {
	public static void main(String args[]) {
		int[] num = { 10, 100, 20, 90, 85 };

		prinMaxSecMax(num);

	}

	static void prinMaxSecMax(int[] inputArray) {
		int max = inputArray[0];
		int max2 = 0;
		int i = 0;

		for (i = 0; i < inputArray.length; i++) {
			if (max < inputArray[i]) {
				max = inputArray[i];

			}

		}
		System.out.println(max);
		for (i = 0; i < inputArray.length; i++) {

			if (inputArray[i] > max2 && inputArray[i] != max) {
				max2 = inputArray[i];

			}

		}
		System.out.println(max2);
	}

}
