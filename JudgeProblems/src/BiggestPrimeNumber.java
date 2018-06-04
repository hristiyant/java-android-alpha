import java.util.Scanner;

public class BiggestPrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		findBiggestPrime(n);
	}
	
	public static void findBiggestPrime(int n) {
		long j;
		for (long i = n; i>=2; i--) {
		   for(j=2; j<i; j++){
		      if(i % j == 0)
		         break;        // not prime
		     }
		 if(j == i) {
			 System.out.println(i);
			 break;
		 }
		 
		 }
	}

}