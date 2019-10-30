package com.home.java;

public class SplitFunction {
	public static void main(String[] args) {
		String name = "abc,xyz, pqr";
		String num = "123-456-789";

		splitFunction(name);
		splitFunction(num);

	}

	public static void splitFunction(String nameInput) {
		char c;
		System.out.print("[");
		for (int i = 0; i < nameInput.length(); i++) {
			c = nameInput.charAt(i);
			if (!Character.isLetter(c) && !Character.isDigit(c)) {
				c = ',';

			}
			System.out.print(c);

		}
		System.out.println("]");


	}

}
