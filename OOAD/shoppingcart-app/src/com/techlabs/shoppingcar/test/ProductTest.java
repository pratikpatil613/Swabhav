package com.techlabs.shoppingcar.test;

import com.techlabs.shoppingcar.Product;

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product(101, "abc", 1200, 200f);
		Product p2 = new Product(102, "abc", 1500, 200f);

		printInfo(p1);
		printInfo(p2);

	}

	public static void printInfo(Product p) {
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getDate());
		System.out.println(p.calculateFinalCost());
		System.out.println(" ");
	}

}
