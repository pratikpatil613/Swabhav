package com.techlab.basic;

public class FunctionTest {
	public static void main(String args[]) {
		boolean r1 = checkEven1(10);
		System.out.println(r1);

		boolean r2 = checkEven2(10);
		System.out.println(r2);

		int r3 = squareEvenNo(2);
		System.out.println(r3);

		int r4 = squareEvenNo2(5);
		System.out.println(r4);

	}

	private static boolean checkEven1(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean checkEven2(int no) {
		return (no % 2 == 0);
	}

	private static int squareEvenNo(int n1) {
		if (n1 % 2 == 0) {
			return n1 * n1;
		} else {
			return -1;
		}
	}

	private static int squareEvenNo2(int n2) {
		if (checkEven2(n2)) {
			return n2 * n2;
		}
		return -1;
	}

}
