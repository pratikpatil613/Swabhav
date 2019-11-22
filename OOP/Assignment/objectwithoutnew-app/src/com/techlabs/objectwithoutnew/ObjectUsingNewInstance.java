package com.techlabs.objectwithoutnew;

import java.lang.reflect.Constructor;

import com.techlabs.simpleclass.Player;
import com.techlabs.simpleclass.SimpleClass;

public class ObjectUsingNewInstance {

	public static void main(String[] args) throws Exception {

		Constructor<Player> con = Player.class.getConstructor();
		Player s3 = con.newInstance();
		Player s4 = con.newInstance();
		s3.setId(101);
		s3.setName("parth");
		s3.setAge(20);

		printInfo(s3);

	}

	private static void printInfo(Player s) {
		System.out.println("id:" + s.getId());
		System.out.println("Name:" + s.getName());
		System.out.println("Age:" + s.getAge());

	}

}
