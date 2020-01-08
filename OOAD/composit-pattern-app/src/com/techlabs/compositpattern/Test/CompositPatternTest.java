package com.techlabs.compositpattern.Test;

import com.techlabs.compositepattern.File;
import com.techlabs.compositepattern.Folder;

public class CompositPatternTest {
	public static void main(String[] args) {
		Folder f1 = new Folder("Movie");

		File file1 = new File("abc", ".avi", 10);
		File file2 = new File("efg", ".avi", 5);
		f1.addChild(file1);
		f1.addChild(file2);

		Folder f2 = new Folder("Folder1");
		File file3 = new File("lmn", ".avi", 2);

		f2.addChild(file3);
		f1.addChild(f2);

		Folder f3 = new Folder("Folder 2");
		File file4 = new File("pqr", ".avi", 10);
		f3.addChild(file4);
		f1.addChild(f3);

		Folder f4 = new Folder("folder4");
		f3.addChild(f4);

		File f6 = new File("aaa", ".mp4", 0);
		f4.addChild(f6);

		File f5 = new File("xyz", ".avi", 20);
		f1.addChild(f5);

		f1.display(0);

	}

}
