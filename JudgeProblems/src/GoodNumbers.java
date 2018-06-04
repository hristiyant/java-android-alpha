import java.util.Scanner;

public class GoodNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();

		int result = 0;
		boolean isGood = false;
		for (int i = a; i <= b; i++) {
			
			while (i > 0) {
				if (i / 10 != 0) {
					if (a % (i / 10) == 0)
						isGood = true;
					else
						isGood = false;
					i /= 10;
				}

			}
			a++;
			if (isGood == true)
				result++;
			isGood = false;
		}
		System.out.println(result);
	}

}
