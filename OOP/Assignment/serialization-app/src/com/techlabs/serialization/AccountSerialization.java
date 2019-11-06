package com.techlabs.serialization;

import java.io.*;

import com.techlabs.account.Account;

public class AccountSerialization {
	public static void main(String[] args) {
		Account a1 = new Account(1, "saving", 1000);
		Account a2 = new Account(2, "current", 100);

		a1.deposit(500);
		// a1.withdraw(100);

		a2.deposit(0);
		a2.withdraw(100);

		printInfo(a1);
		printInfo(a2);

		try {

			File fileName = new File("C:\\Users\\kal\\Desktop\\AccountSerialization.txt");
			FileOutputStream in = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(in);
			out.writeObject(a1);
			out.writeObject(a2);
			in.close();
			out.close();
			System.out.println("Serialization done");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void printInfo(Account a) {

		System.out.println("accno:" + a.getAccNo());
		System.out.println("name:" + a.getName());
		System.out.println("balance:" + a.getBalance());
		System.out.println("");
	}

}
