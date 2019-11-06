package com.techlabs.accountserealization;

public class CurrentAccount extends Account {

	public CurrentAccount(int accno, String name, double balance) {
		super(accno, name, balance);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amount) {
		if (balance < 500) {

		} else {
			balance = balance - amount;
		}
	}

}
