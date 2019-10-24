package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player p1 = new Player(101, "pratik", 21);
		Player p2=new Player(102,"Aniket");
		

		printInfo(p1);
		printInfo(p2);
		
	}

	public static void printInfo(Player p) {
		System.out.println("id: " + p.getid());
		System.out.println("name: " + p.getname());
		System.out.println("age: " + p.getAge());
		System.out.println("");
	}

}
