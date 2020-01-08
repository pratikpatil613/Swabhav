ppackage com.techlabs.iterator;

import java.util.*;

public class IteratorTest {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		Iterator pratik = numbers.iterator();
		while (pratik.hasNext()) {
			System.out.println(pratik.next() + " ");
		}

	}

}
