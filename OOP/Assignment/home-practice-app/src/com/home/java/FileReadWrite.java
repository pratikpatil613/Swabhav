package com.home.java;

import java.io.*;

public class FileReadWrite {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\kal\\Downloads\\Swabhav REpository\\Swabhav.txt");

		FileWriter writer = new FileWriter(file);
		writer.write("pratik");
		// writer.write("\n1234");
		BufferedWriter bw = new BufferedWriter(writer);
		bw.close();

		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);

		String name;
		while ((name = br.readLine()) != null) {
			System.out.println(name);

		}
		br.close();

	}

}
