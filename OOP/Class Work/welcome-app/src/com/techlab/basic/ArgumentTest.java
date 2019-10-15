package com.techlab.basic;

public class ArgumentTest {
	public static void main(String args[]) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("Hello " + args[i] + "!");
		}
		if (args.length < 1) {
			System.out.println("please pass name as argument");

		}

		System.out.println("Thank You!");

	}

}
