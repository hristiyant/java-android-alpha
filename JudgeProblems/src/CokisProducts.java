import java.util.ArrayList;

public class CokisProducts {
	public static ArrayList getList(String s[]) {
		ArrayList<Double> solution = new ArrayList<>();
		
		
		
		
		return solution;
	}

	public static void main(String[] args) {
		String str[] = {
				"5",
		        "milk 1.2",
		        "orange juice 2.9",
		        "icecream 2",
		        "cake 5.1",
		        "beer 1.2",
		        "5",
		        "2 beer, 3 orange juice",
		        "milk, cake",
		        "icecream, 2 cake",
		        "icecream, icecream, 3 icecream",
		        "5 orange juice, 3 orange juice, orange juice, orange juice"	
		};
		
		int numberOfProducts = Integer.valueOf(str[0]);
		String priceList[] = new String[numberOfProducts];
		for (int i = 1; i <= numberOfProducts; i++) {
			int index = 0;
			priceList[index] = str[i];
			index++;
		}

	}

}
