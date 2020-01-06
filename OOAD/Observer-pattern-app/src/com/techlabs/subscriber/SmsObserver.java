package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IObserver;

public class SmsObserver implements IObserver {

	@Override
	public void update(Account acc) {
		System.out.println("msg from account");
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());
	}
}
