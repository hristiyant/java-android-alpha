package intermediate;

import java.math.BigInteger;
import java.util.Scanner;

public class NFactorial {
	public static BigInteger calculate(BigInteger n) {
		if (n == BigInteger.ZERO)
			return BigInteger.ONE;
		else
			return (n.multiply(calculate(n.subtract(BigInteger.ONE))));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger n = input.nextBigInteger();
		System.out.println(calculate(n));
	}

}
