package com.techlabs.account;

public class InsufficientFundException extends RuntimeException {

	private int accno;
	private String name;
	private double balance;

	public InsufficientFundException(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;

	}

	@Override
	public String getMessage() {
		String format = "accoun holder name:" + this.name + "of " +
	    this.accno + "doesnt have sufficient blance:"+ this.balance;

		return format;
	}

}