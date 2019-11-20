package com.techlabs.stringinput;

public class ParenthesisChecking {
	public static void main(String[] args) {
		String symolsString = "{[abc()][ }";
		String returnString = printTrueFlase(symolsString);
		while ((returnString.length() != 0)
				&& (returnString.contains("[]") || returnString.contains("()")
						|| returnString.contains("{}"))) {

			returnString = returnString.replace("[]", "");
			returnString = returnString.replace("()", "");
			returnString = returnString.replace("{}", "");
		}

		if (returnString.length() == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	private static String printTrueFlase(String sybolsStringInput) {
		int StringLength = sybolsStringInput.length();
		char[] stringTOChar = sybolsStringInput.toCharArray();
		String newString = "";
		for (int check = 0; check < StringLength; check++) {
			if ((stringTOChar[check] == '{') || (stringTOChar[check] == '}')
					|| (stringTOChar[check] == '[')|| (stringTOChar[check] == ']') || 
					(stringTOChar[check] == '(') || (stringTOChar[check] == ')')) {
				newString = newString + stringTOChar[check];

			}
		}
		return newString;
	}

}
