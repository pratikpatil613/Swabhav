package com.techlabs.testdrivendevelopment;

public class Cell {

	private MarkType mark;

	public Cell() {
		this.mark = mark.EMPTY;
	}

	public Cell(MarkType mark) {
		this.mark = mark;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark) {
		if (!(getMark() == mark.EMPTY)) {
			throw new RuntimeException("Already filled");
		}
		this.mark = mark;
	}

}
