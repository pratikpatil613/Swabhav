package com.techlabs.shoppingcar.test;

import com.techlabs.shoppingcar.LineItem;
import com.techlabs.shoppingcar.Order;
import com.techlabs.shoppingcar.Product;

public class OrderTest {
	public static void main(String[] args) {
		Product p1 = new Product(101, "abc", 1500, 500);
		LineItem l1 = new LineItem(501, p1, 2);
		Order o1 = new Order(1, "12-12-12");
		o1.addItem(l1);
		prinInfo(o1);
	}

	private static void prinInfo(Order o) {
		System.out.println(o.checkOutPrice());
		System.out.println(o.getList());
		

	}

}
