package com.techlabs.scanner;

import java.util.*;

public class NameWithYesNo {
	public static void main(String[] args) {

		printName();

	}

	public static void printName() {

		String choice, name;
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("name:");
			name = in.next();
			System.out.println("!Hello!" + name);
			System.out.println("Do Yout Want TO Continue:(Y/N)");
			choice = in.next();
			if (choice.equalsIgnoreCase("n")) {
				System.out.println("stoped");
				break;
			} else if (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
				System.out.println("invalid choice");
				System.out.println("Do Yout Want TO Continue:(Y/N)");
				choice = in.next();
			}
		} while (choice.equalsIgnoreCase("y"));
	}
}
