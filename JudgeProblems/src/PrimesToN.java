import java.util.Scanner;

public class PrimesToN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printPrimesTo(n);
		

	}
	public static void printPrimesTo(int n){
		for (int i = 1; i <= n; i++) {
			int counter = 0;
			if (i == 1) {
				System.out.print("1 ");
			} else {
				for (int j = i; j >= 1; j--) {
					if (i % j == 0) {
						counter++;
					}
				}
			}
			if (counter == 2) {
				System.out.print(i + " ");
			}
		}
	}

}
