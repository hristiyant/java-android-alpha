import java.math.BigInteger;
import java.util.Scanner;

public class CalculateAgain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		
		BigInteger result = BigInteger.valueOf(1);
		
		for (int i = Math.min(n, m) + 1; i <= Math.max(n, m); i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(result);

	}

}
