package com.techlab.basic;

public class EvenToZeroTest {
	public static void main(String args[]) {

		int numbers[] = { 10, 20, 55, 35, 40 };
		mutateEvenTOZero(numbers);
		System.out.print("[");
		for (int n : numbers) {
			System.out.print(n+",");
		}
		System.out.println("]");
	}

	static void mutateEvenTOZero(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				num[i] = 0;
				
			}
		}
	}
}
