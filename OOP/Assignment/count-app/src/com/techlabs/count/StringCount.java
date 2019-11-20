package com.techlabs.count;

public class StringCount {
	public static void main(String[] args) {
		String symbol = "{[abc()]}";

		boolean b = printTrueFalse(symbol);
		System.out.println(b);

	}

	public static boolean printTrueFalse(String symbols) {
		boolean statement = false;
		int lastChar = symbols.length();
		int character = 0;
		char[] newArray = new char[lastChar];
		for (int start = 0; start < newArray.length; start++) {
			char eachCharacter = symbols.charAt(start);

			newArray[character] = eachCharacter;
			character++;
		}

		for (int firstChar = 0; firstChar < symbols.length(); firstChar++) {
			char Firstcharacter = symbols.charAt(firstChar);

			if (Firstcharacter == newArray[firstChar]) {
				 statement=true;

			}


		}
		return statement;

	}
}