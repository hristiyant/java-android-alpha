import java.util.Scanner;

public class LargestThanNeighbours {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		int counter = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		for (int i = 1; i < n - 1; i++) {
			if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				counter++;
			}
		}
		System.out.println(counter);

	}

}
