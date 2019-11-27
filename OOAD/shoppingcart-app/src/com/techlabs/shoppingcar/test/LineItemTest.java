package com.techlabs.shoppingcar.test;

import com.techlabs.shoppingcar.LineItem;
import com.techlabs.shoppingcar.Product;

public class LineItemTest {
	public static void main(String[] args) {
		Product p1 = new Product(103, "xyz", 14000, 4000);
		LineItem l1 = new LineItem(1, p1, 3);

		printInfo(l1);
	}

	public static void printInfo(LineItem l) {
		System.out.println("Line Item id:" + l.getId());
		System.out.println("Lline Item quantity" + l.getQuantity());
		System.out.println("product details:" + l.getpProduct());

	}

}
