package com.techlabs.shoppingcar;

import java.util.LinkedList;
import java.util.List;

public class Order {
	private int id;
	private String date;
	private List<LineItem> items;

	public Order(int id, String date) {
		this.id = id;
		this.date = date;
		this.items = new LinkedList<LineItem>();
	}

	public void addItem(LineItem item) {
		items.add(item);

	}

	public double checkOutPrice() {
		for (LineItem i : items) {

			return i.getpProduct().getCost();
		}
		return (Double) null;
	}

	public List getList() {
		return items;
	}

	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", date=" + date + "]" + "\n" + items +
				"\ncheckOutPrice()=" + checkOutPrice()+ "]";
		// + "\ngetList()=" + getList() + "]";
	}

}
