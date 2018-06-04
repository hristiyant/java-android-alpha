import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangeIfGreater {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		DecimalFormat format = new DecimalFormat("0.#");
		
		if(a > b) {
			System.out.println(format.format(b) + " " + format.format(a));
		} else {
			System.out.println(format.format(a) + " " + format.format(b));
		}
		

	}

}
