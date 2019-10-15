package com.techlab.basic;

public class EvenArrayTest {
	public static void main(String args[]) {
		int[] nos = { 10, 20, 30, 55, 40, 55, 50 };
		// giveEven(nos);
		int even1[] = givEven2(nos);
		for (int e : even1) {
			System.out.println(e);
		}

	}

	/*
	 * static void giveEven(int[] p) {
	 * 
	 * for (int i = 0; i < p.length; i++) { if (p[i] % 2 == 0) {
	 * 
	 * System.out.println(p[i]); }
	 * 
	 * }
	 * 
	 * }
	 */

	public static int[] givEven2(int[] eveInput) {
		int count = 0;
//		int ev[] = null;
		for (int i = 0; i < eveInput.length; i++) {
			if (eveInput[i] % 2 == 0) {
				count = count + 1;

			}

		}
		int even[] = new int[count];
		int eveIndex = 0;
		for (int j = 0; j < eveInput.length; j++) {
			if (eveInput[j] % 2 == 0) {
				even[eveIndex] = eveInput[j];
				eveIndex = eveIndex + 1;

			}

		}
		return even;

	}

}
