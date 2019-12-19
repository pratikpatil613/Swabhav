package com.techlabs.testdrivendevelopment;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private List<Cell> cellList = new ArrayList<Cell>();

	public Board() {
		// cellList = new ArrayList<Cell>();

	}

	public List<Cell> getCellList() {
		return cellList;
	}

	public void setCellList(List<Cell> cellList) {
		this.cellList = cellList;
	}

}
