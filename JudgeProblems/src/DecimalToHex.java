import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long decimal = input.nextLong();
		String hex = "";
		String digits = "0123456789ABCDEF";

		if (decimal == 0) {
			System.out.println("0");
		} else {
			while (decimal > 0) {
				long remainder = decimal % 16;
				hex = digits.charAt((int) remainder) + hex;
				decimal /= 16;
			}
			System.out.println(hex);
		}

	}

}
