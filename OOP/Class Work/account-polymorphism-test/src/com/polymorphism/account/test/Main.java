package com.polymorphism.account.test;

import com.polymorphism.account.Account;
import com.polymorphism.account.CurrentAccount;
import com.polymorphism.account.SavingAccont;

public class Main {
	public static void main(String[] args) {
		SavingAccont s = new SavingAccont(1, "Praitk", 200);
		CurrentAccount c = new CurrentAccount(2, "Akash", 800);
		s.deposit(200);
		s.withdraw(100);

		c.deposit(200);
		c.withdraw(100);

		printInfo(s);
		printInfo(c);
	}

	public static void printInfo(Account acc) {
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());
		System.out.println();

	}

}
