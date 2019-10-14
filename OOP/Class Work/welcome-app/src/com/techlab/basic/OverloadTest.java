package com.techlab.basic;

public class OverloadTest {
	public static void main(String args[]) {

		System.out.println("welcome");
		System.out.println(2);
		System.out.println(true);
		System.out.println('k');
		System.out.println(3.1f);

		printInfo("pratik");
		printInfo(10);
		printInfo(1 < 2);
		printInfo(30.00);
		printInfo(20.01f);

	}

	static void printInfo(String content) {
		System.out.println("overload String");
		System.out.println(content);

	}

	static void printInfo(int content) {
		System.out.println("overload integer");
		System.out.println(content);
	}

	static void printInfo(boolean val) {
		System.out.println("overload boolean");
		System.out.println(val);

	}

	static void printInfo(char character) {
		System.out.println("overload character");
		System.out.println(character);
	}

	static void printInfo(double num) {
		System.out.println("overload double");
		System.out.println(num);
	}

	static void printInfo(float value1) {
		System.out.println("overload float");
		System.out.println(value1);

	}

}
