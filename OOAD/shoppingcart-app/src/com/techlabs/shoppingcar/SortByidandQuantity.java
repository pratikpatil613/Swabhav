package com.techlabs.shoppingcar;

import java.util.Comparator;

public class SortByidandQuantity implements Comparator<LineItem> {

	@Override
	public int compare(LineItem o1, LineItem o2) {
		if (o1.getId() == o2.getId()) {
			return o1.getQuantity() + o2.getQuantity();
		}
		return -1;

	}
}
