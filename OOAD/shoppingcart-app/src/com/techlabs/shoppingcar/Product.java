package com.techlabs.shoppingcar;

public class Product {
	private int id;
	private String name;
	private double cost;
	private float discount;

	public Product(int id, String name, double cost, float discount) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getDate() {
		return discount;
	}

	public void setDate(float date) {
		this.discount = date;
	}

	public double calculateFinalCost() {
		double finalCost = cost - discount;
		return finalCost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", "
				+ "discount=" + discount +" Product Final cost="+calculateFinalCost()+ "]";
	}

}
