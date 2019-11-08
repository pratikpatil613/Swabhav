package com.techlabs.redgreenarray;

public class RedGreenInSingleArray {
	public static void main(String[] args) {
		String[] colors = { "red", "green", "red", "green", "red", "red", "green"
				, "red", "red", "green" };

		FilterArray(colors);
		for (String c : colors) {
			System.out.println(c);
		}
	}

	private static void FilterArray(String[] colorInput) {
		String temp;
		int j = colorInput.length - 1;
		for (int k = 0; k < j; k++) {
			if (colorInput[k].equals("green")) {
				temp = colorInput[k];

				for (int i = k; i < j; i++) {
					// if (colorInput[i].startsWith("green")) {
					// temp = colorInput[k];

					colorInput[i] = colorInput[i + 1];
				}

				colorInput[j] = temp;

				j--;

			}
		}
	}
}
