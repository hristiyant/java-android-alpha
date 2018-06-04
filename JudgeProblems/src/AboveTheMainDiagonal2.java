import java.util.Scanner;

public class AboveTheMainDiagonal2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long arr[][] = new long[n][n];
		
		long a = 1;

		for (int i = 0; i < n; i++) {
			long b = a;
			for (int j = 0; j < n; j++) {
				arr[i][j] = b;
				b *= 2;
			}
			a *= 2;
		}

		long sum = 0;
		
		/*for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i<j) sum+=Math.pow(2, i+j);
			}
		}*/
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= i)
					sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}

}
