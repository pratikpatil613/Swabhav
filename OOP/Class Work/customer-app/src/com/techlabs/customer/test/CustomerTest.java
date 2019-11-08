package com.techlabs.customer.test;

import com.techlabs.customer.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer("Pratik", true);
		Customer c2 = new Customer("Akash", true);
		Customer c3 = new Customer("sunny", false);
		c3.

		printInfo(c1);
		printInfo(c2);
		printInfo(c3);
		printInfo(c1);
		printInfo(c2);

	}

	public static void printInfo(Customer c) {
		System.out.println("id:" + c.getId());
		System.out.println("name:" + c.getName());
		System.out.println("active:" + c.getActive());
		System.out.println();
	}

}
