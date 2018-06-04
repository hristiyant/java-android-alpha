import java.util.Scanner;

public class NFactorial {
	public static int calculate(int n) {
		if (n == 0)
			return 1;
		else
			return (n * calculate(n - 1));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(calculate(n));
	}

}
