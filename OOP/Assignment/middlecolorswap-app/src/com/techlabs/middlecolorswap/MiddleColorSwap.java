package com.techlabs.middlecolorswap;

public class MiddleColorSwap {
	public static void main(String[] args) {

		String[] colors = { "Red", "Green", "Blue", "Green", "Blue", "Red", "Green","Blue" ,"Blue",};

		swap(colors);
		for (String c : colors) {
			System.out.println(c);
		}

	}

	public static void swap(String[] colors) {

		String temp;
		int low = 0;
		int high = colors.length - 1;
		int mid = 0;
		for (mid = 0; mid <= high; mid++) {
			if (colors[mid].equals("Red")) {
				temp = colors[low];
				colors[low] = colors[mid];
				colors[mid] = temp;
				low++;

			}

			// else if (colors[mid].equals("Blue")) {
			// mid++;
			// }
			else if (colors[mid].equals("Green")) {
				temp = colors[mid];
				colors[mid] = colors[high];
				colors[high] = temp;
				high--;
				mid--;
			}

		}
	}
}
