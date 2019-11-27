package com.techlabs.shoppingcar;

public class LineItem {
	private int id;
	private Product product;
	private int quantity;

	public LineItem(int id, Product product, int quantity) {
		super();
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

}
