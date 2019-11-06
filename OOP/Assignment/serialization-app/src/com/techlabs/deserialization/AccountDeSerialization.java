package com.techlabs.deserialization;

import java.io.*;

import com.techlabs.account.Account;



public class AccountDeSerialization {
	public static void main(String[] args) {
		Account a1 = null;
		Account a2 = null;

		try {

			File fileName = new File("C:\\Users\\kal\\Desktop\\AccountSerialization.txt");
			FileInputStream in = new FileInputStream(fileName);
			ObjectInputStream out = new ObjectInputStream(in);
			a1 = (Account) out.readObject();
			a2 = (Account) out.readObject();
			System.out.println("de done");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

		printInfo(a1);
		printInfo(a2);

	}

	public static void printInfo(Account a) {
		System.out.println("acc no:" + a.getAccNo());
		System.out.println("acc name:" + a.getName());
		System.out.println("balance:" + a.getBalance());
		System.out.println();
	}

}
