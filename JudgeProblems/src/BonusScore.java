import java.util.Scanner;

public class BonusScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		switch (n) {
		case 1:
			System.out.println(n * 10);
			break;
		case 2:
			System.out.println(n * 10);
			break;
		case 3:
			System.out.println(n * 10);
			break;
		case 4:
			System.out.println(n * 100);
			break;
		case 5:
			System.out.println(n * 100);
			break;
		case 6:
			System.out.println(n * 100);
			break;
		case 7:
			System.out.println(n * 1000);
			break;
		case 8:
			System.out.println(n * 1000);
			break;
		case 9:
			System.out.println(n * 1000);
			break;
		case 0:
			System.out.println(n);
			break;

		default:
			System.out.println("invalid score");
			break;
		}

	}

}
