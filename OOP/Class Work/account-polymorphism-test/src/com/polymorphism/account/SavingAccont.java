package com.polymorphism.account;

public class SavingAccont extends Account {

	public SavingAccont(int accno, String name, double balance) {
		// TODO Auto-generated constructor stub
		super(accno, name, balance);
	}

	public void withdraw(double amount) {
		double newBalance = balance - amount;
		if (newBalance < 500) {

		} else {
			balance = balance - amount;
		}

	}

}
