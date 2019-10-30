package com.techlabs.customer;

public class Customer {

	private int id;
	private String name;
	private boolean active;
	private static int count;

	static {
		count = 1000;
		System.out.println("insite static block");
	}

	public Customer(String name, boolean active) {
		this.name = name;
		this.active = active;
		// id=id++;
		id = count++;
		System.out.println("insite constructor");

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean getActive() {
		return active;
	}

}
