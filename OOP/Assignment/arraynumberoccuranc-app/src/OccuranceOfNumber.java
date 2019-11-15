
public class OccuranceOfNumber {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 2, 2, 3, 3, 2, 3,3 };
		numberOfOccurance(numbers);

	}

	public static void numberOfOccurance(int[] inputArray) {
		int[] second = new int[inputArray.length + 1];
		int copy = 0;
		for (int start = 0; start < inputArray.length; start++) {
			second[copy] = inputArray[start];
			copy++;

		}
		for (int start = 0; start < inputArray.length; start++) {
			int count = 0;
			for (int each = 0; each < inputArray.length; each++) {

				if (each < start && inputArray[start] == second[each]) {
					break;
				}

				if ((inputArray[start] == second[each])) {
					count++;
				}

			}

			if (!(count == 0))

				System.out.println(inputArray[start] + "=" + count);

		}

	}

}
