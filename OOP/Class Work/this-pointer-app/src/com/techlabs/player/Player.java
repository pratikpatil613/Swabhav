package com.techlabs.player;

public class Player {
	private int id;
	private String name;
	private int age;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public int getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
