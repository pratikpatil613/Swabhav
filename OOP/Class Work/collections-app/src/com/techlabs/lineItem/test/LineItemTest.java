package com.techlabs.lineItem.test;

import java.util.ArrayList;

import com.techlabs.lineItem.LineItem;

public class LineItemTest {
	public static void main(String[] args) {
		ArrayList order = new ArrayList();
		LineItem item1 = new LineItem(101, "mobile", 1000, 2);
		LineItem item2 = new LineItem(102, "watch", 500, 3);
		LineItem item3 = new LineItem(103, "tv", 5000, 1);

		order.add(item1);
		order.add(item2);
		order.add(item3);
		order.add("pratik");

		printInfo(order);

	}

	public static void printInfo(ArrayList order) {
		for (Object x : order) {
			LineItem item = (LineItem) x;
			System.out.println("Id:" + item.getId());
			System.out.println("ProductName:" + item.getProductName());
			System.out.println("Cost:" + item.getCost());
			System.out.println("Quantity:" + item.getQuantity());
			System.out.println("Total Cost:" + item.getTotalCost(item));
			System.out.println("");

		}

	}

}
