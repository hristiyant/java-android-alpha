import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Fibonacci {

	private static void fakeInput() {
		String input = "20";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
	}

	public static void main(String[] args) {
		fakeInput();
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println("The N fibonacci number is: " + fibonacci(n));

	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n <= 2) {
			return 1;
		} else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
