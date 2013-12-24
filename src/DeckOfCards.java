import java.util.Random;

/**
 * Project Name:	Shuffle_The_Deck
 * Project Purpose:	To shuffle a standard deck of 52 cards
 * Changelog:		J. Salce 12/18/13
 */


public class DeckOfCards {

	
	public static void main(String[] args) {
		
		//Instantiate Deck, Suits, and Ranks Aray
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		//Randomize the Cards
		for( int i = 0; i < deck.length; i++) 
		{
			deck[i] = i;
		}
		
		//Call Method	
		shuffleArray(deck);
	    for (int i = 0; i < deck.length; i++)
	    {
	    	String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card " + deck[i] + ": " + rank + " of " + suit);
	    }
	
	  }
		//Fisher-Yates Algorithim
		  static void shuffleArray(int[] ar)
		  {
		    Random rnd = new Random();
		    for (int i = ar.length - 1; i > 0; i--)
		    {
		      int index = rnd.nextInt(i + 1);
		      
		      // swap
		      int a = ar[index];
		      ar[index] = ar[i];
		      ar[i] = a;
	    }
	}
}