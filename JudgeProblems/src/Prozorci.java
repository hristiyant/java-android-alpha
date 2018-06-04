import java.util.Scanner;

public class Prozorci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int c = input.nextInt();
		int total = 0;

		for (int i = 0; i < n; i++) {
			int area = input.nextInt() * input.nextInt();
			if (input.nextInt() == 1)
				total += area * c;

		}
		System.out.println(total);

	}

}
