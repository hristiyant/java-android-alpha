import java.util.Scanner;

public class PrintDeck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String card = input.nextLine();
		final String[] allCards = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		
		int endIndex = 0;
		for (int i = 0; i < allCards.length; i++) {
			if(allCards[i].equals(card))  endIndex = i;
		}
		
		for (int i = 0; i <= endIndex; i++) {
			System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds", allCards[i], allCards[i], allCards[i], allCards[i]);
			System.out.println();
		}
	}

}
