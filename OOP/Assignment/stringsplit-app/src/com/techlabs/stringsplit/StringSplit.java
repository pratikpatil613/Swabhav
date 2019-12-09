package com.techlabs.stringsplit;

public class StringSplit {
	public static void main(String[] args) {
		String string = "abc,xyz,pqr";

		String[] splitArrray = split(string, ',');
		System.out.println(splitArrray[0]);
		System.out.println(splitArrray[1]);
		System.out.println(splitArrray[2]);

	}

	public static String[] split(String string, char regex) {
		int start = 0, count = 0, end = string.length();
		for (int pointer = 0; pointer < end; pointer++) {
			if (string.charAt(pointer) == (regex)) {
				count++;
			}
		}

		String newArray[] = new String[count + 1];
		int k = 0;
		for (int pointer = 0; pointer < end; pointer++) {
			if (string.charAt(pointer) == regex) {
				newArray[k++] = string.substring(start, pointer);
				start = pointer + 1;
			}

			if (pointer == end - 1) {
				newArray[k] = string.substring(start, pointer + 1);
			}
		}
		return newArray;
	}

}
