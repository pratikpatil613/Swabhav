package com.techlabs.testdrivendevelopment;

public class Player {

	private MarkType markType;
	private String name;

	public Player(String name, MarkType markType) {
		this.markType = markType;
		this.name = name;
	}

	public MarkType getMarkType() {
		return markType;
	}

	public void setMarkType(MarkType markType) {
		this.markType = markType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

}
