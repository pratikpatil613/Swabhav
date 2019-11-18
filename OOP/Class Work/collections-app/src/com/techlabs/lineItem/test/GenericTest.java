package com.techlabs.lineItem.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.techlabs.lineItem.LineItem;

public class GenericTest {
	public static void main(String[] args) {
		List<LineItem> orders = new ArrayList<LineItem>();
		orders.add(new LineItem(101, "mobile", 1000, 2));
		orders.add(new LineItem(102, "watch", 500, 5));
		orders.add(new LineItem(103, "tv", 1000, 1));
		// orders.add("pratik");

		printInfo(orders);

	}

	public static void printInfo(List<LineItem> order) {
		for (LineItem item : order) {
			System.out.println("Id:" + item.getId());
			System.out.println("Product Name:" + item.getProductName());
			System.out.println("product Cost" + item.getCost());
			System.out.println("Product Quantity" + item.getQuantity());
			System.out.println("total cost:" + item.getTotalCost(item));
			System.out.println("");
		}
	}

}
