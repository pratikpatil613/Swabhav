package com.techlabs.accountTest;

import com.techlabs.account.Account;
import com.techlabs.account.InsufficientFundException;

public class AccountTest {
	public static void main(String[] args) throws Exception {
		// Account a1 = new Account(101, "abc", 500);
		// a1.withdraw(100);

		// printInfo(a1);

		// case1();
		// case2();
		case3();
	}

	public static void case1() throws Exception {

		Account a1 = new Account(101, "abc", 500);

		a1.withdraw(100);

		printInfo(a1);
	}

	public static void case2() {

		Account a1 = new Account(101, "abc", 1000);
		try {
			a1.withdraw(100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		printInfo(a1);
	}

	public static void case3() throws Exception {
		Account a1 = new Account(102, "pqr", 500);
		try {
			a1.withdraw(200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		printInfo(a1);
	}

	public static void printInfo(Account acc) {
		System.out.println("Accno:" + acc.getAccno());
		System.out.println("Name:" + acc.getName());
		System.out.println("Balance:" + acc.getBalance());

	}

}
