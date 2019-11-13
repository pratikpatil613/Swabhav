package com.techlabs.simpleclass;

public class SimpleClass implements Cloneable {
	public String name;
	public int age;

	public SimpleClass() {
		System.out.println("constructor call me");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		String format = "name:" + this.name + "age:" + this.age;
		return format;
	}

}
