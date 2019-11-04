package com.home.java;

public class ReverseNumber {
	public static void main(String[] args) {
		int reNumber = reverseNO(12345);
		System.out.println(reNumber);

	}

	private static int reverseNO(int numberInput) {
		int reverseNO = 0;
		while (numberInput > 0) {
			int num = numberInput % 10;
			reverseNO = (reverseNO * 10) + num;
			numberInput = numberInput / 10;
		}
		return reverseNO;
	}

}
