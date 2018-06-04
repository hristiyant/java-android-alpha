import java.util.Scanner;

public class AppearanceCount {
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
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		int x = input.nextInt();
		System.out.println(CountApp(arr, x));

	}

}
