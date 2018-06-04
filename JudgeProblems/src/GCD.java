import java.util.Scanner;

public class GCD {
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;

		}
		return a;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();

		System.out.println(gcd(a, b));

	}

}
