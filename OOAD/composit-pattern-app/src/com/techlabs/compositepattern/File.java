package com.techlabs.compositepattern;

public class File implements IStorable {

	private String name;
	private String extension;
	private int size;

	public File(String name, String extension, int size) {
		this.name = name;
		this.extension = extension;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	@Override
	public void display(int dept) {
		for(int i=0;i<=dept;i++)
			System.out.print("_");
		System.out.println(name + extension + "." + size);
	}

}
