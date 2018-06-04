import java.util.Arrays;
import java.util.Scanner;

public class MaxSumOfKElements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		
		int sum = 0;
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		
		for (int i = n - 1; i > n - 1 - k; i--) {
			sum += arr[i];
		}

		System.out.println(sum);
	}

}
