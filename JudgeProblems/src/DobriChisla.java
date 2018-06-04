import java.util.Scanner;

public class DobriChisla {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int count = 0;
		boolean isGood = true;

		while (a <= b) {
			int n = a;
			while (n > 0) {
				if (n % 10 > 1) {
					if (a % (n % 10) == 0) {
						n = n / 10;
						continue;
					} else {
						isGood = false;
						break;
					}
				} else {
					n = n / 10;
					continue;
				}
			}
			if (isGood == true) {
				count++;
				a++;
			} else {
				a++;
				isGood = true;

			}
		}
		System.out.println(count);

	}

}
