package com.techlabs.accountserealization;

public class SavingAccount extends Account {

	public SavingAccount(int accno, String name, double balance) {
		super(accno, name, balance);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(double amount) {
		if(balance<500) {
			
		}
		else
			balance=balance-amount;
	}
	
	
	

}
