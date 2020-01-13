package com.techlabs.proxypattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProxyAccount extends Account {

	SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
	Date date = new Date();
//	DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" HH:mm:ss");
//	LocalDateTime now = LocalDateTime.now();

	public ProxyAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	@Override
	public void deposit(double amount) {
		System.out.println("before deposite" + date);
		super.deposit(amount);
		System.out.println("after deposit" + date);

	}

	@Override
	public void withdraw(double amount) {
		System.out.println("before withdraw" + date);
		super.withdraw(amount);
		System.out.println("after deposite" + date);
	}

}
