package com.techlabs.shoppingcar;

public class LineItem {
	private int id;
	private Product product;
	private int quantity;

	public LineItem(int id, Product product, int quantity) {
		this.id = id;
		this.product = product;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getpProduct() {
		return product;
	}

	public double calculateItemCost() {
		double itemCost = quantity * product.calculateFinalCost();
		return itemCost;

	}

	@Override
	public String toString() {
		return "LineItemDetails [id=" + id + "\nproductDetails=" + product + ", quantity=" + quantity
				+ "\nproduc calculateItemCost=" + calculateItemCost() + "]";
	}

}
