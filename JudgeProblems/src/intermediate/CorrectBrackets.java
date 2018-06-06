package intermediate;

import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.Scanner;

public class CorrectBrackets {
	
	private static void fakeInput() {
		String input = "8";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
	}

	static HashSet<String> brackets = new HashSet<>();
	
	public static void main(String[] args) {
		fakeInput();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		String str = "";
		
		generateExpression(str, n);
		
		for (String string : brackets) {
			System.out.println(string);
		}

	}
	
	
	
	public static HashSet<String> generateExpression(String expression,int n){
		
		if(expression.length() >= n) {
			brackets.add(expression);
			
			return brackets;
		} 
			
		HashSet<String> currentBrackets =  generateExpression("(" + expression + ")", n);
		brackets.addAll(currentBrackets);
		
		currentBrackets =  generateExpression("()" + expression, n);
		brackets.addAll(currentBrackets);
		
		currentBrackets =  generateExpression(expression + "()", n);
		brackets.addAll(currentBrackets);
		
		return brackets;
	}

}
