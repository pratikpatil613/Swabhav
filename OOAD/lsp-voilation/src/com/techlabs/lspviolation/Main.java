package com.techlabs.lspviolation;

import java.awt.Rectangle;

public class Main {
	public static void main(String[] args) {
		Rectangel r1 = new Rectangel(10, 20);
		Rectangel s = new Square(30);

		shouldNotChange_width_if_Heigh_is_notChannge(r1);
		shouldNotChange_width_if_Heigh_is_notChannge(s);

	}

	public static void shouldNotChange_width_if_Heigh_is_notChannge(Rectangel r) {
		int before = r.getWidth();
		System.out.println(before);
		r.setHeight(100);
		int after = r.getWidth();
		System.out.println(after);
		System.out.println(before == after);
		System.out.println(r.calculateArea());
	}

}
