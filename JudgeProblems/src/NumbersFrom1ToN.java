import java.util.Scanner;

public class NumbersFrom1ToN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		printNumbersFromOneTo(n);
		
	}
	
	public static void printNumbersFromOneTo(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}
}
