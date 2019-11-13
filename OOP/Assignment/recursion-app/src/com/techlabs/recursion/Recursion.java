package com.techlabs.recursion;

public class Recursion {
	public static void main(String[] args) {

		printNumber();

	}

	static int num = 0;

	public static void printNumber() {

		num++;
		if (num <= 10) {
			System.out.println(num);
			printNumber();
		}
	}

}
