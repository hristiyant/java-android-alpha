package intermediate;

import java.util.ArrayList;
import java.util.Scanner;

public class TribonacciTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Long> arr = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			arr.add((long)input.nextInt());
		}
		int lines = input.nextInt();
		int size = 0;
		int printIndex = 0;
		int counter = 1;
		for (int i = 1; i <= lines; i++) {
			size = size + size + 1;
		}

		for (int i = 3; i < size; i++) {
			arr.add(arr.get(i - 1) + arr.get(i - 2) + arr.get(i - 3));
		}

		for (int i = 1; i <= lines; i++) {
			while (counter <= i) {
				System.out.print(arr.get(printIndex) + " ");
				printIndex++;
				counter++;
			}
			counter = 1;
			System.out.println();
		}

	}

}
