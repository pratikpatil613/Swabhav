package com.techalbs.lsp;

public class Square implements Ishape {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	@Override
	public int calculateArea() {
		return side * side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

}
