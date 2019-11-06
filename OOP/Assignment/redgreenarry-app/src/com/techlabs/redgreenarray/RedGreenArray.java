package com.techlabs.redgreenarray;

public class RedGreenArray {
	public static void main(String[] args) {
		String[] colors = { "red", "green", "green", "red", "red", "green","green"};

		String[] redColor = filterRed(colors);
		System.out.print("Red Arary:[");

		for (String red : redColor) {
			System.out.print(red+" ");
		}
		System.out.print("]");
		System.out.println();

		String[] greenColor = filterGreen(colors);
		System.out.print("Green Arary:[");
		for (String green : greenColor) {
			System.out.print(green + " ");
		}
		System.out.print("]");
	}

	public static String[] filterRed(String[] inputColors) {
		int redCount = 0;
		for (int i = 0; i < inputColors.length; i++) {
			if (inputColors[i].equals("red")) {
				redCount++;
			}

		}
		String[] redColorArray = new String[redCount];
		int red = 0;
		for (int j = 0; j < inputColors.length; j++) {
			if (inputColors[j].equals("red")) {
				redColorArray[red] = inputColors[j];
				// System.out.println(RedColorArray[red]);
				red++;

			}
		}
		return redColorArray;
	}

	public static String[] filterGreen(String[] inputColors) {
		int greenCount = 0;

		for (int i = 0; i < inputColors.length; i++) {
			if (inputColors[i].equals("green")) {
				greenCount++;
			}
		}

		String[] greenColorArray = new String[greenCount++];
		int green = 0;
		for (int j = 0; j < inputColors.length; j++) {
			if (inputColors[j].equals("green")) {
				greenColorArray[green] = inputColors[j];
				green++;

			}
		}

		return greenColorArray;

	}

}
