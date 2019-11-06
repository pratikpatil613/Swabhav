package com.techlabs.accountserializationtest;

import java.io.*;

import com.techlabs.accountserealization.Account;
import com.techlabs.accountserealization.CurrentAccount;
import com.techlabs.accountserealization.SavingAccount;

public class Deserialization {
	public static void main(String[] args) {
		SavingAccount s1 = null;
		CurrentAccount c1 = null;

		try {
			File fileName = new File("New Serialization.txt");
			FileInputStream in = new FileInputStream(fileName);
			ObjectInputStream out = new ObjectInputStream(in);
			s1 = (SavingAccount) out.readObject();
			c1 = (CurrentAccount) out.readObject();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

		printInfo(s1);
		printInfo(c1);

	}

	public static void printInfo(Account acc) {
		System.out.println("acc no" + acc.getAccNo());
		System.out.println("acc Name;" + acc.getName());
		System.out.println("balance:" + acc.getBalance());
		System.out.println(" ");
	}
}
