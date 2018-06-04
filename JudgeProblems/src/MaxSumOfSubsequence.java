import java.util.Scanner;

public class MaxSumOfSubsequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		int counter = 1;
		int max = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
			
			if(i > 0) {
				max = Math.max(max, arr[i] + arr[i + 1]);
			}
		}

		System.out.println(max);

	}

}
