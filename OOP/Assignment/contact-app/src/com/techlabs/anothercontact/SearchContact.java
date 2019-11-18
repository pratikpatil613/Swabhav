package com.techlabs.anothercontact;

import java.util.*;
import java.io.*;

public class SearchContact {
//	public static void main(String data[]) {
	public void searchContact() {
		Scanner in = new Scanner(System.in);

		try {

			String nameNumberString;
			String name;
			String lastName;
			long number;
			int index, newIndex;

			File file = new File("ContactInfo.txt");
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			boolean found = false;

			System.out.println("Enter First letter to search name:");
			String searchContact = in.next();

			String s;
			while ((raf.getFilePointer() < raf.length())) {

				nameNumberString = raf.readLine();

				index = nameNumberString.indexOf('!');
				newIndex = nameNumberString.indexOf("-");

				name = nameNumberString.substring(0, index);
				lastName = nameNumberString.substring(index + 1, newIndex);
				number = Long.parseLong(nameNumberString.substring(newIndex + 1));
				if (nameNumberString.startsWith(searchContact)) {
					found = true;

					System.out.println("First Name: " + name + "\n1Last Name: " + lastName + "\n" + "Contact Number: "
							+ number + "\n");
				}
			}
			if (found == false) {
				System.out.println("contact does not exist");
			}
		}

		catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
	}

}
