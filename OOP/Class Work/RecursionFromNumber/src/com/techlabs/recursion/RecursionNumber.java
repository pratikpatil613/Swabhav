package com.techlabs.recursion;

public class RecursionNumber {
	public static void main(String[] args) {
		printNumber(5);
	}

	public static void printNumber(int numInput) {
		numInput++;
		if (numInput <= 10) {
			System.out.println(numInput);
			printNumber(numInput);
		}
	}

}
