package com.techlab.basic;

public class ReverseIntArry {
	public static void main(String args[]) {
		int[] nos = { 10, 20, 30, 40, 50 };
		reverseNumber(nos);
		System.out.print("[");
		for (int i : nos) {
			System.out.print(i + ",");

		}
		System.out.print("]");
	}

	static void reverseNumber(int[] num) {
		int temp = 0, j = 4;
		for (int i = 0; i < j; i++) {
			temp = num[i];
			num[i] = num[j];
			num[j] = temp;
			j--;

		}

	}

}
