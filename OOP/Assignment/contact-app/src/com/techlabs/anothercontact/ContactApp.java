package com.techlabs.anothercontact;

import java.util.*;

import java.math.*;
import java.io.*;

public class ContactApp {
	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int choice, menuChoice, i = 0;
		String search;
		do {
			System.out.println("1.start");
			System.out.println("2.exit");
			choice = in.nextInt();
			if (choice == 1) {
				do {
					System.out.println("1.add");
					System.out.println("2.display");
					System.out.println("3.search");
					System.out.println("4.back");
					menuChoice = in.nextInt();
					if (menuChoice == 1) {
						AddContact a = new AddContact();
						a.addFritnd();

					} else if (menuChoice == 2) {
						DisplayContact d = new DisplayContact();
						d.searchContact();

					} else if (menuChoice == 3) {
						SearchContact search1 = new SearchContact();
						search1.searchContact();
					}

				} while (menuChoice != 4);

			} else if (choice == 2)

			{
				System.out.println("exit");
				break;

			}

		} while (choice != 2);

	}

}
