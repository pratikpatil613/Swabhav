package com.techlabs.lineItem;

public class LineItem {
	private int id;
	private String productName;
	private double cost;
	private int quantity;

	public LineItem(int id, String productName, double cost, int quantity) {
		this.id = id;
		this.productName = productName;
		this.cost = cost;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public double getCost() {
		return cost;

	}

	public int getQuantity() {

		return quantity;
	}

	public double getTotalCost(LineItem item) {
		double totalCost = 0;
		for (int i = 0; i < this.getQuantity(); i++) {
			totalCost = totalCost + item.getCost();
		}

		return totalCost;
	}

}
