import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long decimal = input.nextLong();
		String binary = "";
		
		if(decimal == 0) {
			System.out.println("0");
		} else {
			while(decimal > 0) {
				if(decimal % 2 != 0){
					binary += "1";
				} else {
					binary += "0";
				}
				decimal /= 2;
			}
		}
		for (int i = binary.length() - 1; i >= 0; i--) {
			System.out.print(binary.charAt(i));
		}

	}

}
