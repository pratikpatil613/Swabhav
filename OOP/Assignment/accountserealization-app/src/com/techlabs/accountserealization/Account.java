package com.techlabs.accountserealization;

import java.io.*;

public abstract class Account implements Serializable {

	private int accno;
	private String name;
	protected double balance;

	public Account(int accno, String name, double balance) {
		// TODO Auto-generated constructor stub
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public abstract void withdraw(double amount);

}
