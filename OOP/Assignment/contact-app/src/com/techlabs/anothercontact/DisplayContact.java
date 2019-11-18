package com.techlabs.anothercontact;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;

class DisplayContact {

	// public static void main(String data[]) {
	public void searchContact() {

		try {

			String nameNumberString;
			String name;
			String lastName;
			long number;
			int index, newIndex;

			File file = new File("ContactInfo.txt");

			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			boolean found = false;

			while (raf.getFilePointer() < raf.length()) {

				nameNumberString = raf.readLine();

				index = nameNumberString.indexOf('!');
				newIndex = nameNumberString.indexOf("-");

				name = nameNumberString.substring(0, index);
				lastName = nameNumberString.substring(index + 1, newIndex);

				number = Long.parseLong(nameNumberString.substring(newIndex + 1));

				System.out.println(
						"First Name: " + name + "\nLast Name:" + lastName + "\n" + "Contact Number: " + number + "\n");
			}
		}

		catch (IOException ioe) {

			System.out.println(ioe);
		} catch (NumberFormatException nef) {

			System.out.println(nef);
		}
	}
}
