package com.techlabs.contact;

import java.util.*;
import java.math.*;
import java.io.*;

public class ContactApp {
	public static void main(String[] args) throws IOException {
		ArrayList<Contact> contacts = new ArrayList<Contact>();

		Scanner in = new Scanner(System.in);
		int choice, menuChoice, i;
		String search;
		i = 0;
		do {
			System.out.println("1.start");
			System.out.println("2.exit");
			choice = in.nextInt();
			if (choice == 1) {
				do {

					System.out.println("1.add");
					System.out.println("2.display");
					System.out.println("3.search");
					System.out.println("4back");
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

							File fileName = new File("ContactDetails.txt");

							FileWriter writer = new FileWriter(fileName.getAbsoluteFile(), true);
							BufferedWriter bw = new BufferedWriter(writer);

							for (int j = i; j < contacts.size(); j++) {

								bw.write("\nName:" + contacts.get(j).name + "\nContact Number:"
										+ contacts.get(j).contctNo + "\nEmail Id:" + contacts.get(j).emailId
										+ "\n***********************");
								System.out.println("\n");

								bw.close();
								//
							}

							/*
							 * File fileName = new File("ContactDetails.txt"); FileOutputStream file = new
							 * FileOutputStream(fileName); ObjectOutputStream out = new
							 * ObjectOutputStream(file); out.writeObject(contacts);
							 */

						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						// System.out.println("Serialization done");

						System.out.println(contacts);
						i++;
					} else if (menuChoice == 2) {
						File fileName = new File("ContactDetails.txt");

						FileReader reader = new FileReader(fileName);
						BufferedReader br = new BufferedReader(reader);
						String name;
						while ((name = br.readLine()) != null) {

							System.out.println(name);

						}
						br.close();

						if (contacts.isEmpty()) {
							System.out.println("No contact added");
						}

						// printContactDetails(contacts);

					} else if (menuChoice == 3) {
						System.out.println("Enter word for search");
						search = in.next();
						for (Contact c : contacts) {
							if (c.name.startsWith(search)) {

								File fileName = new File("ContactDetails.txt");

								FileReader reader = new FileReader(fileName);
								BufferedReader br = new BufferedReader(reader);
								String name = br.readLine();
								if (name.startsWith(search)) {
									while ((name = br.readLine()) != null) {

										System.out.println(name);

									}
								}
								br.close();

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
			System.out.print("Name:" + c.getName());
			System.out.print(" Contact Number:" + c.getContactNO());
			System.out.print(" Email Id:" + c.getEmailId());
			System.out.println();

		}

	}

}
