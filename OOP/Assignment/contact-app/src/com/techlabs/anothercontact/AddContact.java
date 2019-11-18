package com.techlabs.anothercontact;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;

class AddContact {

	// public static void main(String data[]) {
	public void addFritnd() {

		Scanner in = new Scanner(System.in);

		try {

			System.out.println("Enter First Name");
			String newFirstName = in.next();

			System.out.println("Enter Last Name");
			String newLastName = in.next();

			System.out.println("enter number:");
			long newNumber = in.nextLong();

			System.out.println();

			String nameNumberString;
			String firstName;
			String lastName;
			long number;
			int index, newIndex;

			File file = new File("ContactInfo.txt");

			if (!file.exists()) {

				file.createNewFile();
			}

			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			boolean found = false;

			while (raf.getFilePointer() < raf.length()) {

				nameNumberString = raf.readLine();

				index = nameNumberString.indexOf('!');
				newIndex = nameNumberString.indexOf("-");

				firstName = nameNumberString.substring(0, index);
				lastName = nameNumberString.substring(index - 1, newIndex);
				number = Long.parseLong(nameNumberString.substring(newIndex + 1));

				if (firstName == newFirstName || lastName == newLastName || number == newNumber) {
					found = true;
					break;
				}
			}

			if (!found) {

				nameNumberString = newFirstName + "!" + newLastName + "-" + String.valueOf(newNumber);

				raf.writeBytes(nameNumberString);

				raf.writeBytes(System.lineSeparator());

				System.out.println(" Contact added. ");

				raf.close();
			} else {

				// Closing the resources.
				raf.close();

				// Print the message
				System.out.println(newFirstName + " does  exists. ");
			}
		}

		catch (IOException ioe) {

			System.out.println(ioe);
		} catch (NumberFormatException nef) {

			System.out.println(nef);
		}

	}
}
