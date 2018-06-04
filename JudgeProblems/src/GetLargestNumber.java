import java.util.Scanner;

public class GetLargestNumber {
	public static int GetMax(int a, int b) {
		return Math.max(a, b);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(GetMax(input.nextInt(), GetMax(input.nextInt(), input.nextInt())));

	}

}
