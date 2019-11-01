package com.techlabs.player;

public class Player {
	private int id;
	private String name;
	private int age;
	private static int count;

	static int headCount() {

		return count;
	}

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		count += 1;

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

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		String parent = super.toString();
		String format = "id is:" + this.id + " name is:" + this.name + " age is:" + this.age + " Parent value:"
				+ parent;

		return format;

	}

	@Override
	public boolean equals(Object second) {
		Player secondPlayer = (Player) second;
		if (secondPlayer.id == this.id) {
			return true;
		}
		return false;

	}

}
