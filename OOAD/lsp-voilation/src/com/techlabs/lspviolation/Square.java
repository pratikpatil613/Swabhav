package com.techlabs.lspviolation;

public class Square extends Rectangel {

	public Square(int side) {
		super(side, side);
	}

	@Override
	public void setWidth(int width) {
		this.width = this.height = this.width;
	}

	@Override
	public void setHeight(int height) {
		this.height = this.height = this.width;

	}

}
