package com.home.java;

public class SplitUsingStartEnd {

	public static void main(String[] args) {

		String name = "Hello-word";
		String name1 = "Hello-word-mumbai";
		String name2 = "Hello|word|mumbai";

		String splitArray[] = splitFunction(name, '-');
		for (String str : splitArray) {
			System.out.print(str);
		}
		System.out.println();

		String splitArray1[] = splitFunction(name1, '-');
		for (String str : splitArray1) {
			System.out.print(str);
		}
		System.out.println();

		String splitArray2[] = splitFunction(name2, '|');
		for (String str : splitArray2) {
			System.out.print(str);
		}

	}

	public static String[] splitFunction(String nameInput, char charInput) {

		int start = 0;
		int end = nameInput.length();
		int count = 0;

		for (int i = 0; i < nameInput.length(); i++) {
			if (nameInput.charAt(i) == charInput) {
				count++;
			}

		}

		String[] newArray = new String[count + 1];
		int k = 0;

		for (int j = 0; j < end; j++) {
			if (nameInput.charAt(j) == charInput) {
				newArray[k] = nameInput.substring(start, j);
				k++;
				start = j + 1;

			}
			if (j == end - 1) {
				newArray[k] = nameInput.substring(start, j+1);
			}

		}
		return newArray;

	}
}
