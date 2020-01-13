package com.techlabs.proxypattern.test;

import com.techlabs.proxypattern.ProxyAccount;

public class AccountProxyTest {
	public static void main(String[] args) {
		ProxyAccount acc1 = new ProxyAccount(101, "A", 1000);
		acc1.deposit(500);
		printInfo(acc1);
	}

	private static void printInfo(ProxyAccount acc) {
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());
	}

}
