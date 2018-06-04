import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double x = input.nextDouble();
		double result = 1 + 1 / x;

		long fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
			result += fact / Math.pow(x, i);
		}

		System.out.printf("%.5f", result);
	}

}
