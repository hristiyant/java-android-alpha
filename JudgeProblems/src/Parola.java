import java.util.Scanner;

public class Parola {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		String str = Integer.toString(n);
		String newStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			newStr += str.charAt(i);
		}
		int newNum = Integer.parseInt(newStr);

		int result = (newNum % k) + (newNum / k);

		System.out.println(result);
	}

}
