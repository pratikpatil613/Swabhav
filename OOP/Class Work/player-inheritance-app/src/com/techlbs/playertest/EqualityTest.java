package com.techlbs.playertest;

import com.techlabs.player.Player;

public class EqualityTest {
	public static void main(String[] args) {

		Player p1 = new Player(101, "ABC", 20);
		Player p2 = new Player(101, "ABC", 20);
	
		

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		System.out.println(p1 == p2);
		System.out.println(p1 == p1);
		System.out.println(p2 == p2);
		
	
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p1));
		System.out.println(p2.equals(p2));

	}
}
