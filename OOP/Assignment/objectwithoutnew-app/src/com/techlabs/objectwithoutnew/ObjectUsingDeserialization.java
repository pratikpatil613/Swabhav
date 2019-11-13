package com.techlabs.objectwithoutnew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlabs.simpleclass.Player;

public class ObjectUsingDeserialization {
	public static void main(String[] args) {

		try {
			Player p = new Player();
			p.setId(1);
			p.setName("Akash");
			p.setAge(23);

			File fileName = new File("Serialization.txt");
			FileOutputStream in = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(in);
			out.writeObject(p);
			in.close();
			out.close();
			System.out.println("Serialization done");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Player p = null;

		try {

			File fileName = new File("Serialization.txt");
			FileInputStream in = new FileInputStream(fileName);
			ObjectInputStream out = new ObjectInputStream(in);
			p = (Player) out.readObject();
			System.out.println("deSerialization done");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

		printInfo(p);

	}

	public static void printInfo(Player a) {
		System.out.println("id:" + a.getId());
		System.out.println("name:" + a.getName());
		System.out.println("age:" + a.getAge());
		System.out.println();
	}

}
