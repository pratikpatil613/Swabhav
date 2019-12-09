package com.techlabs.shoppingcar.test;

import com.techlabs.shoppingcar.Customer;
import com.techlabs.shoppingcar.LineItem;
import com.techlabs.shoppingcar.Order;
import com.techlabs.shoppingcar.Product;

public class CustomerTest {
	public static void main(String[] args) {
		Product p1 = new Product(101, "laptop", 40000, 5000);
		Product p2 = new Product(101, "laptop", 40000, 5000);

		LineItem l1 = new LineItem(501, p1, 2);
		LineItem l2 = new LineItem(501, p2, 3);

		Order o1 = new Order(601, "12-12-12");
		o1.addItem(l1);
		o1.addItem(l2);
		Customer c1 = new Customer(1, "pratik");
		c1.addOrders(o1);

		printInfo(c1);
	}

	private static void printInfo(Customer c1) {
		System.out.println("Customer Id:" + c1.getCustomerId());
		System.out.println("Customer Name:" + c1.getCustomerName());
		System.out.println(c1.gerOreders());

	}
}
