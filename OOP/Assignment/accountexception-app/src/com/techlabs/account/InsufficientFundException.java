package com.techlabs.account;

public class InsufficientFundException extends RuntimeException {

	Account account;

	public InsufficientFundException(Account acc) {
		this.account = acc;
	}

	@Override
	public String getMessage() {
		String accountMessage = "Account holder" + account.getName() + "of" + account.getAccno()
				+ "Insufficient balance:" + account.getBalance();
		return accountMessage;
	}

}
