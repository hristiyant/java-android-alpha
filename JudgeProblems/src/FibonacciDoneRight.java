import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciDoneRight {

	private static void fakeInput() {
		String input = "10";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
	}

	static ArrayList<Integer> fibonacciMem = new ArrayList<>();
	
	
	
	public static void main(String[] args) {
		initializeList();
		
		fakeInput();
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		
		
		System.out.println(fibonacci(n));

	}
	
	
	
	public static int fibonacci(int n) {
		if(n == 0) {
			return fibonacciMem.get(0);
		}else if(n==1 || n==2){
			return fibonacciMem.get(1);
		}else {
			if(fibonacciMem.size() > n) {
				return fibonacciMem.get(n);
			}else{
				fibonacciMem.add(fibonacci(n-1)+ fibonacci(n-2));
				return fibonacciMem.get(n);
			}
		}
		
		//return fibonacciMem.get(n);
	}
	private static void initializeList(){
		fibonacciMem.add(0);
		fibonacciMem.add(1);
		fibonacciMem.add(1);
	}

}
