package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player p1 = new Player(1, "pratik", 20);
		System.out.println(p1.getCount());
		Player p2 = new Player(2, "aniket", 30);
		System.out.println(p2.getCount());
		Player p3 = new Player(3, "manoj", 40);
		System.out.println(p3.getCount());

	}
}
