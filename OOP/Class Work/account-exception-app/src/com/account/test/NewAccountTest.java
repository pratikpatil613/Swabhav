package com.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.InsufficientFundException;

public class NewAccountTest {
	public static void main(String[] args) {
		Account acc = new Account(101, "abc", 101);
		InsufficientFundException i = new InsufficientFundException(acc);
	}
	
	
}
