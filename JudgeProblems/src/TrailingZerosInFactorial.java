import java.util.Scanner;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int result = 0;
		int remainder = 10;
		int fivePow = 5;
		while (remainder >= 1) {
			remainder = n / fivePow;
			result += remainder;
			fivePow *= 5;
		}

		System.out.println(result);

	}

}
