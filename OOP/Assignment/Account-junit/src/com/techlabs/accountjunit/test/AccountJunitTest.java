package com.techlabs.accountjunit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.techlabs.accountjunit.Account;

import junit.framework.Assert;

public class AccountJunitTest {

	@Test
	public void testConstructor() {
		Account acc = new Account(101, "abc", 50000);
		int expectedAccno = 101;
		String expectedName = "abc";
		double expectedBalance = 50000;
		int actualAccNo = acc.getAccNo();
		String actualName = acc.getName();
		double actualBalance = acc.getBalance();
		assertEquals(expectedAccno, actualAccNo);
		Assert.assertEquals(expectedName, actualName);
		Assert.assertEquals(expectedBalance, actualBalance);

	}

	@Test
	public void calculateDeposit() {
		Account acc = new Account(101, "pratik", 10000);
		double expectedResult = 15000;
		acc.deposit(5000);
		Assert.assertEquals(expectedResult, acc.getBalance());

	}

	@Test
	public void calculateWithdraw() {
		Account acc = new Account(101, "abc", 5000.0);
		double expectedResult = 4000.0;
		acc.withdraw(1000.0);
		Assert.assertEquals(expectedResult, acc.getBalance());

	}

}
