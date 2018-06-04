import java.util.ArrayList;
import java.util.Scanner;

public class ThreeGroups {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String zero = "";
		String one = "";
		String two = "";

		/*
		 * while (input.hasNext()) { arr.add(input.nextInt()); }
		 */
		while (input.hasNext()) {
			int num = input.nextInt();
			if (num % 3 == 0)
				zero += num + " ";
			if (num % 3 == 1)
				one += num + " ";
			if (num % 3 == 2)
				two += num + " ";
			
		}
		

		System.out.println(zero);
		System.out.println(one);
		System.out.println(two);
	}

}
