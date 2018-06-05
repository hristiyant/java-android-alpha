import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class StringReverse {

	private static void fakeInput() {
		String input = "Telerik";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
	}

	public static void main(String[] args) {
		fakeInput();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		System.out.println(reverseString(str));

	}

	public static String reverseString(String s) {
		if (s.length() == 0) {
			return s;
		}
		return reverseString(s.substring(1)) + s.charAt(0);

	}

}
