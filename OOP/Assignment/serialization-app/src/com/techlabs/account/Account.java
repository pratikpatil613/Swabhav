package com.techlabs.account;

import java.io.*;

public class Account implements Serializable {

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

		if (balance < 500) {

		} else {
			balance = balance - amount;
		}
	}
}
