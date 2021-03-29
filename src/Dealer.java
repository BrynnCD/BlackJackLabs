//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Dealer extends Player
{
	//define a deck of cards

	public Dealer()
	{
		//
	}

	public void  shuffle()
	{
	   //shuffle the deck
	}

	public Card  deal(){
	   resetHand();
	   return
	}
	
	public int numCardsLeftInDeck()
	{
		return 0;
	}

	public boolean hit( Card c )
	{
		if(c.getValue() + getHandValue() < 21)
		{
			return true;
		}
		return false;
    }
}








