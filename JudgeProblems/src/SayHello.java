import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class SayHello {

	private static void fakeInput() {
		String input = "";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		
		
		

		
		System.out.println("Hello, " + name + "!");
		System.out.println(1000101%1000);
	}

}
