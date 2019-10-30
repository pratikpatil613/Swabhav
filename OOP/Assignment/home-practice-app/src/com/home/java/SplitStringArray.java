package com.home.java;

public class SplitStringArray {
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

		String newArray[] = new String[nameInput.length()];

		for (int i = 0; i < nameInput.length(); i++) {
			newArray[i] = "";
		}

		for (int i = 0; i < nameInput.length(); i++) {
			char c = nameInput.charAt(i);
			if (!(c == charInput)) {
				newArray[i] = "" + nameInput.charAt(i);

			}

		}
		return newArray;

	}
}
