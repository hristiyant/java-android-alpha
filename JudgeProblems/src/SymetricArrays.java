import java.util.Scanner;

public class SymetricArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		
		boolean isSymetric = true;
		
		for (int i = 0; i < n; i++) {
			String[] array = input.nextLine().split(" ");
			for (int j = 0; j < array.length/2; j++) {
				if(!array[j].equals(array[array.length - 1 - j])){
					isSymetric = false;
					break;
				}
				
			}
			System.out.println(isSymetric? "Yes" : "No");
			isSymetric = true;
		}
		

	}

}
