import java.text.DecimalFormat;
import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.###");
		
		System.out.println(format.format(Math.max(input.nextFloat(), Math.max(input.nextFloat(), input.nextFloat()))));

	}

}
