import java.util.Scanner;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		int counter = 1;
		int max = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				counter++;
			} else {
				max = Math.max(counter, max);
				counter = 1;
			}
		}
		if (counter > max) {
			max = counter;
		}

		System.out.println(max);

	}

}
