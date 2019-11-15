package com.techlabs.stringinput;

public class StringInputCount {
	public static void main(String[] args) {
		String name = "papr";

		countOccurancess(name);

	}

	public static void countOccurancess(String inputString) {
		for (int first = 0; first < inputString.length(); first++) {
			int count = 0;
			char startChar = inputString.charAt(first);
			for (int each = 0; each < inputString.length(); each++) {
				char secondChar = inputString.charAt(each);
				if (each < first && startChar == secondChar) {
					break;
				}
				if (startChar == secondChar) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(inputString.charAt(first) + "=" + count);
			}

		}

	}
}
