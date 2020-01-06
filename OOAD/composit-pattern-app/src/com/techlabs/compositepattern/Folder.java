package com.techlabs.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorable {
	private String name;
	private List<IStorable> childrens = new ArrayList<IStorable>();

	public Folder(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void display(int dept) {
		System.out.println(name);
		for (IStorable s : childrens) {
			if (dept != 0) {
				System.out.print(" ");
				s.display(dept);

			} else if (dept == 0) {
				s.display(dept);

			}
			dept++;
		}

	}

	public void addChild(IStorable store) {
		childrens.add(store);
	}

}
