package com.techlabs.newcontact;

import java.util.*;

import java.math.*;
import java.io.*;

public class ContactApp {
	public static void main(String[] args) throws IOException {
		ArrayList<Contact> contacts = new ArrayList<Contact>();

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
						System.out.println("Enter name");
						String name = in.next();
						System.out.println("Ener contct no:");
						String contactNo = in.next();
						System.out.println("Enter emailId");
						String emailId = in.next();
						try {
							Contact c1 = new Contact(name, contactNo, emailId);

							contacts.add(c1);

							File fileName = new File("Contact.txt");
							FileOutputStream file = new FileOutputStream(fileName.getAbsoluteFile(), true);
							ObjectOutputStream out = new ObjectOutputStream(file);
							// String format = c1.getName() + c1.getContactNO() + c1.emailId;
							out.writeObject(contacts);
							out.close();
							file.close();
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						System.out.println("Serialization done");
						System.out.println(contacts.size() + "added chose menu:");

					} else if (menuChoice == 2) {

						ArrayList<Contact> contacts1 = new ArrayList<Contact>();

						try {

							File fileName = new File("Contact.txt");
							FileInputStream file = new FileInputStream(fileName.getAbsoluteFile());
							ObjectInputStream out = new ObjectInputStream(file);

							contacts1 = (ArrayList<Contact>) out.readObject();

							out.close();
							file.close();

						} catch (Exception e) {
							// System.out.println(e.getMessage());
							e.printStackTrace();
						}

						for (Contact c : contacts1) {
							Contact con = (Contact) c;
							System.out.println(con.getName());
							System.out.println(con.getContactNO());
							System.out.println(con.getEmailId());

						}

						if (contacts.isEmpty()) {
							System.out.println("No contact added");
						}

					} else if (menuChoice == 3) {
						System.out.println("Enter word for search");
						search = in.next();
						for (Contact c : contacts) {
							if (c.name.startsWith(search)) {
								// Contact contacts1 = null;

								// printContactDetails(contacts);

								// System.out.println(c.name + c.contctNo + c.emailId);
							}
						}
					}

				} while (menuChoice != 4);

			} else if (choice == 2) {
				System.out.println("exit");
				break;

			}

		} while (choice != 2);

	}

	private static void printContactDetails(ArrayList<Contact> contacts) {
		for (Contact c : contacts) {
			System.out.println("Name:" + c.getName());
			System.out.println("Contact Number:" + c.getContactNO());
			System.out.println("FEmail Id:" + c.getEmailId());
			System.out.println("***************");

		}

	}

}
