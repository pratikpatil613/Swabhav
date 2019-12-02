package com.polymorphism.account;

public class CurrentAccount extends Account {

	public CurrentAccount(int accno, String name, double balance) {
		super(accno, name, balance);

	}

	@Override
	public void withdraw(double amount) {
		double newBalance = balance - amount;
		if (newBalance < 500) {

		} else {
			balance = balance - amount;
		}

	}

}
