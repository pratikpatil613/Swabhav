package com.techlabs.simpleclass;

import java.io.Serializable;

public class Player implements Cloneable, Serializable{

	private int id;
	private String name;
	private int age;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
