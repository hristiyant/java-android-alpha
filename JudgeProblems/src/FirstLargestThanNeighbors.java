import java.util.Scanner;

public class FirstLargestThanNeighbors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		int result = -1;

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = 1; i < n - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				result = i;
				break;
			}
		}
		System.out.println(result);

	}

}
