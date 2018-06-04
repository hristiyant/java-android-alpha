import java.math.BigInteger;
import java.util.Scanner;

public class CatalanNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		BigInteger result = BigInteger.valueOf(1);
		BigInteger nPlusOneFact = BigInteger.valueOf(1);
		for (int i = 1; i <= 2*n; i++) {
			if(i<=n+1) nPlusOneFact = nPlusOneFact.multiply(BigInteger.valueOf(i));
			if(i>=n+1) result = result.multiply(BigInteger.valueOf(i));
		}

		System.out.println(result.divide(nPlusOneFact));
	}

}
