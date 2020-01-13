package com.techlab.basic;

public class PassByValueTest {
	public static void main(String args[]) {
		int mark = 100;
		int[] marks = { 10, 20, 30, 40 };

		mutateMarkToZero(mark);
		System.out.println(mark);

		mutateMarksToZero(marks);
		for (int i : marks) {
			System.out.print(i);
		}

	}

	static void mutateMarkToZero(int markPassed) {
		markPassed = 0;
	}

	static void mutateMarksToZero(int[] marksPassed) {
		for (int i = 0; i < marksPassed.length; i++) {
			marksPassed[i] = 0;
		}
	}
}
