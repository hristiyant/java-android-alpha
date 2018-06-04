import java.util.Scanner;

public class HexToDecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String hex = input.nextLine();
		long result = 0;
		for (int i = hex.length() - 1, j = 0; i >= 0; i--, j++) {
			int num = 0;
			switch (hex.charAt(i)) {
			case '1':
				num = 1;
				break;
			case '2':
				num = 2;
				break;
			case '3':
				num = 3;
				break;
			case '4':
				num = 4;
				break;
			case '5':
				num = 5;
				break;
			case '6':
				num = 6;
				break;
			case '7':
				num = 7;
				break;
			case '8':
				num = 8;
				break;
			case '9':
				num = 9;
				break;
			case 'A':
				num = 10;
				break;
			case 'B':
				num = 11;
				break;
			case 'C':
				num = 12;
				break;
			case 'D':
				num = 13;
				break;
			case 'E':
				num = 14;
				break;
			case 'F':
				num = 15;
				break;
			default:
				break;
			}
			result += num * Math.pow(16, j);
		}
		System.out.println(result);

	}

}
