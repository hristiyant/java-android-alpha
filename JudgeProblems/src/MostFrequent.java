import java.util.Scanner;

public class MostFrequent {

	public static int CountApp(int arr[], int x) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int result = 0;
		int mostFreq = 0;
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (CountApp(arr, arr[i]) > result) {
				result = CountApp(arr, arr[i]);
				mostFreq = arr[i];
			}
		}
		System.out.println(mostFreq + " (" + result + " times)");

	}

}
