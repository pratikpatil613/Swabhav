package com.techlabs.shoppingcar;

import java.util.LinkedList;
import java.util.List;

public class Customer {
	private int id;
	private String name;
	private List<Order> orders;

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.orders = new LinkedList<Order>();
	}

	public int getCustomerId() {
		return id;
	}

	public String getCustomerName() {
		return name;
	}

	public void addOrders(Order order) {
		orders.add(order);

	}

	public List gerOreders() {
		return orders;
	}

}
