import java.util.Locale;
import java.util.Scanner;

public class MultiplicationSign {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		float n = a * b * c;

		if (n == 0) {
			System.out.println("0");
		} else if (n > 0) {
			System.out.println("+");
		} else {
			System.out.println("-");
		}
	}

}
