import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String binary = input.nextLine();
		int index = binary.length() - 1;
		long decimal = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			if( binary.charAt(i) != '0') {
				decimal += Math.pow(2, index);
				index--;
			} else {
				index--;
				continue;
			}
		}
		System.out.println(decimal);

	}

}
