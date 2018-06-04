import java.math.BigInteger;
import java.util.Scanner;

public class Calculate3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();

		BigInteger result = BigInteger.valueOf(1);

		for (int i = k + 1; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}

		for (int i = 1; i <= (n - k); i++) {
			result = result.divide(BigInteger.valueOf(i));
		}

		System.out.println(result);

	}

}
