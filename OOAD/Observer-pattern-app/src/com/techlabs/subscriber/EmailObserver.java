package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IObserver;

public class EmailObserver implements IObserver {
	@Override
	public void update(Account acc) {
		System.out.println("Email from account");
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());
	}

}
