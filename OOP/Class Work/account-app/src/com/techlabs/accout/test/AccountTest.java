package com.techlabs.accout.test;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account a1 = new Account(1, "saving", 300);

	//	System.out.println("balance:" + a1.getBalance());

		a1.deposit(300);
		a1.withdraw(100);
		printInfo(a1);


	}

	public static void printInfo(Account a) {

		System.out.println("accno:" + a.getAccNo());
		System.out.println("name:" + a.getName());
		System.out.println("balance:" + a.getBalance());

	}

}
