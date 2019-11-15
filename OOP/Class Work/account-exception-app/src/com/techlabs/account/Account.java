package com.techlabs.account;

public class Account {

	private int accno;
	private String name;
	private double balance;

	public Account(int accNo, String name, double blance) {
		this.accno = accNo;
		this.name = name;
		this.balance = blance;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) throws Exception {
		double newBalance = balance - amount;
		if (newBalance < 500) {
			throw new InsufficientFundException(accno, name, balance);

		} else {
			balance = balance - amount;
		}
	}

}
