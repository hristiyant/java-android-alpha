import java.util.Scanner;

public class NotDivisableNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if(i % 3 != 0 && i % 7 != 0)
				System.out.print(i + " ");
		}

	}

}
