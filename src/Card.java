//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	//constructors
	public Card()
	{
		face = 0;
		suit = "";
	}

	public Card(int _face, String _suit)
	{
		this.face = _face;
		this.suit = _suit;
	}


	// modifiers


  	//accessors

	public void setValue(int newValue)
	{
		face = newValue;
	}

  	public int getValue()
  	{
  		return face;
  	}

  	public String getSuit()
	{
		return suit;
	}

  	//equals method for values
	public boolean equals(Object obj) //card
	{
		//compare suits
		Card o = (Card) obj;
		if(this.getSuit().equals(o.getSuit()))
		{
			return true;
		}
		return false;
	}

  	//toString

	public String toString()
	{
		return FACES[face] + " of " + getSuit() + " | value = " + getValue();
	}
  	
 }