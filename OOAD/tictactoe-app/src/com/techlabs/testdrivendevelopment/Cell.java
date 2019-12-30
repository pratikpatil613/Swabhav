package com.techlabs.testdrivendevelopment;

public class Cell {
	int cellcount;
	static int count = 1;
	private MarkType mark;

	public Cell() {
		this.mark = mark.EMPTY;
		cellcount = count++;

	}

	public Cell(MarkType mark) {
		this.mark = mark;

	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark) {
		if (!(getMark() == mark.EMPTY)) {
			throw new RuntimeException("!Already filled");
		}
		this.mark = mark;
	}

	@Override
	public String toString() {
		return Integer.toString(cellcount);
	}

}
