import java.util.Scanner;

public class MatrixOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] arr = new int[n][n];
		int init = 1;

		for (int i = 0; i < n; i++) {
			int start = init;
			for (int j = 0; j < n; j++) {
				arr[i][j] = start++;
			}
			init++;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
