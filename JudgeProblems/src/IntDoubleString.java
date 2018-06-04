import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class IntDoubleString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		String type = input.nextLine();
		switch (type) {
		case "text":
			System.out.println(input.nextLine() + "*");
			break;
		case "integer":
			System.out.println(input.nextInt() + 1);
			break;
		case "real":
			DecimalFormat formatter = new DecimalFormat("#0.00");
		    double d = input.nextDouble();
			System.out.printf(formatter.format(d + 1));
			break;
		}

	}

}
