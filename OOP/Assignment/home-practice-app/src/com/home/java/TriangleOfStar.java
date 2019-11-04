package com.home.java;

public class TriangleOfStar {
	public static void main(String[] args) {
		printTriangle();
	}

	public static void printTriangle() {
		final int NO = 5;
		for (int i = 0; i < NO; i++) {
			for (int j = NO; j > i; j--) {
				System.out.print("-");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
