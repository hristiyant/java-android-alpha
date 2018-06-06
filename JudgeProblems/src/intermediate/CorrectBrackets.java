package intermediate;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CorrectBrackets {
	
	private static void fakeInput() {
		String input = "6";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
	}

	static LinkedHashSet<String> brackets = new LinkedHashSet<>();
	
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
	
	
	
	public static LinkedHashSet<String> generateExpression(String expression,int n){
		
		if(expression.length() >= n) {
			brackets.add(expression);
			
			return brackets;
		} 
			
		LinkedHashSet<String> currentBrackets =  generateExpression("(" + expression + ")", n);
		brackets.addAll(currentBrackets);
		
		currentBrackets =  generateExpression("()" + expression, n);
		brackets.addAll(currentBrackets);
		
		currentBrackets =  generateExpression(expression + "()", n);
		brackets.addAll(currentBrackets);
		
		return brackets;
	}

}
