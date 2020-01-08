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
		for (IStorable f : childrens) {

		//	for (int i = 0; i <= 0; i++) {
				for (int j = 0; j <= dept; j++) {
					System.out.print("_ ");
		//		}
				// for (int k = 0; k <= i; k++) {
				// System.out.print("* ");
			//	if (f.getClass().getSimpleName().equals("File")) {
					// System.out.print(" ");
			//		f.display(dept);

			//	}

				// }
			//	if (f.getClass().getSimpleName().equals("Folder")) {

			//		dept++;
					f.display(dept);

				}

		//	}
			// System.out.println("");
		}

	}

	public void addChild(IStorable store) {
		childrens.add(store);
	}

}
