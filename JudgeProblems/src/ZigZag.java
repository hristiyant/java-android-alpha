import java.util.Scanner;

public class ZigZag {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int[][] arr = new int[n][m];
		int sum = 0;
		arr[0][0] = 1;
		for (int i = 1; i < m; i++) {

			arr[0][i] = arr[0][i - 1] + 3;

		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = arr[i -1][j] + 3;
			}
			
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(arr[i][j] % 2 != 0 )
					sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}

}
