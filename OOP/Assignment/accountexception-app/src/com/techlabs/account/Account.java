package com.techlabs.account;

public class Account {
	private int accno;
	private String name;
	private double balance;

	public Account(int accno, String name, double blance) {
		this.accno = accno;
		this.name = name;
		this.balance = blance;
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public double withdraw(double amount) throws Exception {
		if (balance - amount > 500) {
			return balance = balance - amount;
		}
		throw new InsufficientFundException(this);
	}

}
