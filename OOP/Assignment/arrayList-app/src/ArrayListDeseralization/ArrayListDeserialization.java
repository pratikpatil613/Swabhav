package ArrayListDeseralization;

import java.io.*;
import java.util.*;

import com.techlabs.arraylist.ArrayListSerialization;

public class ArrayListDeserialization {
	public static void main(String[] args) {

		ArrayList<Integer> list = null;

		try {
			File fileName = new File("Example.txt");

			FileInputStream in = new FileInputStream(fileName);
			ObjectInputStream out = new ObjectInputStream(in);
			list = (ArrayList<Integer>) out.readObject();
			in.close();
			out.close();
			System.out.println("deserialization done");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
		printDeserializeArrayLisst(list);
		for (Integer i : list) {
			System.out.println(i);
		}

	}

	private static void printDeserializeArrayLisst(ArrayList<Integer> input) {
		System.out.println("ArrayList:");

	}

}
