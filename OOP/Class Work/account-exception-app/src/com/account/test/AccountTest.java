package com.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.InsufficientFundException;

public class AccountTest {
	public static void main(String[] args) throws Exception {

		// case1();
		case2();
	}

	private static void case1() throws Exception {

		Account acc = new Account(101, "abc", 500);

		acc.withdraw(100);
		System.out.println(acc.getBalance());

	}

	public static void case2() {

		Account acc = new Account(101, "abc", 500);
		try {
			acc.withdraw(100);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println(acc.getBalance());
	}

	public static void case3() throws Exception {

		Account acc = new Account(101, "abc", 500);
		InsufficientFundException i = new InsufficientFundException(101, "abc", 500);
		try {
			acc.withdraw(100);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println(acc.getBalance());

	}

}
