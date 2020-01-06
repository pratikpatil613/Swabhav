package com.techlabs.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accno;
	private String name;
	private double balance;
	List<IObserver> observers = new ArrayList<IObserver>();

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		notifyall();
	}

	public void withdraw(double amount) {
		double newBalance = balance - amount;
		if (newBalance < 500) {

		} else {
			balance = balance - amount;
		}
		notifyall();
	}

	public void addObserver(IObserver observer) {
		observers.add(observer);
	}

	public void notifyall() {
		for (IObserver obs : observers) {
			obs.update(this);
		}
	}

}
