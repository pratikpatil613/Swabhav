package com.techalbs.lsp;

public class Main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		Square s1 = new Square(30);

		printInfo(r1);
		printInfo(s1);

	}

	public static void printInfo(Ishape s) {
		System.out.println(s.calculateArea());

	}

}
