import java.util.Scanner;

public class TainoSyobshtenie {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String message = input.nextLine();
		String reversed = "";

		for (int i = message.length() - 1; i >= 0; i--) {
			if (Character.isLetter(message.charAt(i)))
				reversed += message.charAt(i);
		}
		
		System.out.println(reversed);
	}

}
