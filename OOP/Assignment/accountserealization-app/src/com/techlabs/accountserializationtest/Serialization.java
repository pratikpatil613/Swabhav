package com.techlabs.accountserializationtest;

import java.io.*;

import com.techlabs.accountserealization.Account;
import com.techlabs.accountserealization.CurrentAccount;
import com.techlabs.accountserealization.SavingAccount;

public class Serialization {
	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount(3, "pratik", 200);
		CurrentAccount c1 = new CurrentAccount(2, "Akash", 500);

		s1.withdraw(200);
		s1.deposit(1000);
		s1.withdraw(200);

		c1.deposit(200);
		c1.withdraw(200);

		printInfo(s1);
		printInfo(c1);

		try {
			File fileName = new File("New Serialization.txt");
			FileOutputStream in = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(in);
			out.writeObject(s1);
			out.writeObject(c1);
			System.out.println("Srialization done");

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void printInfo(Account acc) {
		System.out.println("Acc no:" + acc.getAccNo());
		System.out.println("Acc Nmae:" + acc.getName());
		System.out.println("Balance:" + acc.getBalance());
		System.out.println("");
	}

}
