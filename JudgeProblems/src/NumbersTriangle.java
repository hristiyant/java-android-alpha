import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class NumbersTriangle {
	private static void fakeInput() {
		String input = "5";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
	}

	public static void main(String[] args) {
		//fakeInput();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printTriangle(n);
		
	}
	
	
		public static void printTriangle(int n) {
			String row = "";
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <=i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			for (int i = n-1; i >0; i--) {
				for (int j = 1; j <=i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
	}
}
