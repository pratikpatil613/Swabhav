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

	public Player(int id, String name) {
		this(id, name, 18);

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

	public Player whosIsElder(Player p1) {
		if (this.age < p1.age) {
			return p1;
		} else
			return this;

	}

}
