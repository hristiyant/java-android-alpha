import java.util.Scanner;

public class AboveTheMainDiagonal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long arr[][] = new long [n][n];
		long a = 1;
		
		for (int i = 0; i < n; i++) {
			long b = a;
			for (int j = 0; j < n; j++) {
				arr[i][j] = b;
				b *=2;
			}
			a *=2;
		}
		
		
		
		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				sum += arr[i][j]; 
			}
		}
		System.out.println(sum);
	}

}
