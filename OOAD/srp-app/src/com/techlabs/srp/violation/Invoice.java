package com.techlabs.srp.violation;

public class Invoice {
	private int id;
	private String productName;
	private double cost;
	private float discountPercentage;
	static final float gst = (float) 18.5;

	public Invoice(int id, String productName, double cost, float discountPercentage) {
		super();
		this.id = id;
		this.productName = productName;
		this.cost = cost;
		this.discountPercentage = discountPercentage;
	}

	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public double calculateDiscount() {
		double discount = discountPercentage / gst * 100;
		return discount;

	}

	public double calculateTax() {
		double tax = gst / 100 * cost;
		return tax;

	}

	public double findCost() {
		cost = cost - calculateDiscount() + calculateTax();
		return cost;

	}

	public void print(Invoice i) {
		System.out.println("id:" + i.getId());
		System.out.println("Name:" + i.getProductName());
		System.out.println("discount:" + i.calculateDiscount());
		System.out.println("tax:" + i.calculateTax());
		System.out.println("cost:" + i.findCost());

	}

}
