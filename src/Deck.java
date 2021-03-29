//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
		stackOfCards = new ArrayList<Card>(); //no size, add in loop
		//loop through suits
			//loop through faces
				//add in a new card
		topCardIndex= -1;
			for (int s = 1; s <= SUITS.length; s++) {
				for (int f = 1; f <= NUMFACES; f++) //13 faces in each suit
				{
					Card a = new Card(f+0, SUITS[s-1]);
					stackOfCards.add(a);
					topCardIndex++;
				}
			}
	}

	//accessors
	public int  size ()
	{
		return stackOfCards.size();
	}

	public int numCardsLeft()
	{
		return topCardIndex+1;
	}


	//modifiers
   public void shuffle ()
   {
	   Random r = new Random();
	   ArrayList<Card> shuffled = new ArrayList<Card>();
		//shuffle the deck

	   for(int i = 0; i < size(); i++) //for each card in stackOfCards
	   {
	   	int random = r.nextInt(size()-1); //random index
	   	shuffled.add(stackOfCards.get(random));
	   	stackOfCards.set(i, shuffled.get(i));
	   }
		//reset variables as needed
		topCardIndex = NUMCARDS-1;
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}