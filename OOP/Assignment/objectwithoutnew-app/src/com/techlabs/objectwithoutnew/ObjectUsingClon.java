package com.techlabs.objectwithoutnew;

import com.techlabs.simpleclass.Player;

public class ObjectUsingClon {
	public static void main(String[] args) throws CloneNotSupportedException {

		Player p1 = new Player();
		Player p2 = (Player) p1.clone();

		p1.setId(1);
		p1.setAge(23);
		p1.setName("Akash");

		p2.setId(2);
		p2.setName("Sunny");
		p2.setAge(22);

		printInfo(p1);
		printInfo(p2);

	}

	public static void printInfo(Player p) {
		System.out.println("id:" + p.getId());
		System.out.println("Name:" + p.getName());
		System.out.println("Age:" + p.getAge());
		System.out.println("");

	}

}
