import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BiggestOfFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		float d = input.nextFloat();
		float e = input.nextFloat();
		
		DecimalFormat df = new DecimalFormat("#.##");

		if (a > b && a > c && a > d && a > e) {
			System.out.println(df.format(a));
		} else if (b > a && b > c && b > d && b > e) {
			System.out.println(df.format(b));
		} else if (c > a && c > b && c > d && c > e) {
			System.out.println(df.format(c));
		} else if (d > a && d > b && d > c && d > e) {
			System.out.println(df.format(d));
		} else {
			System.out.println(df.format(e));
		}

	}

}
