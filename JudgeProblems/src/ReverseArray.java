
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] array = input.nextLine().split(" ");

		for (int i = array.length - 1; i >= 1; i--) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[0]);

	}

}
