package com.techlbs.playertest;

import com.techlabs.player.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player p1 = new Player(101, "pratik", 20);
		Player p2= new Player(102, "Akash", 21);
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
