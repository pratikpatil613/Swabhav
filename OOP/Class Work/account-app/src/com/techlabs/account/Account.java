package com.techlabs.account;

public class Account {

	private int accno;
	private String name;
	private double balance;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public Account(int accno, String name) {
		this(accno, name, 500);
	}

	public double getAccNo() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance = balance + amount;
	}

	public void withdraw(double amount) {
		double newbalance = balance - amount;

		if (newbalance < 500) {
		} else
			balance = balance - amount;
	}
}
