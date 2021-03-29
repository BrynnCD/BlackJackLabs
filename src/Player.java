//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.*;

public class Player
{
   private ArrayList<Card> hand;
   private int winCount;

   public Player ()
   {
      hand = new ArrayList<Card> ();
      winCount = 0;
   }

   public Player (int score)
   {
      hand = new ArrayList<Card> ();
      winCount = score;
   }

   public void addCardToHand( Card temp ) //nextCard() from Deck
   {
      if(hit(temp)) //if card can be added without breaking 21
      {
         hand.add(temp);
      }
   }

   public void resetHand( )
   {
      for(Card c : hand)
      {
         hand.remove(c);
      }
   }

   public  void setWinCount( int numwins )
   {
      winCount = numwins;
   }

   public int getWinCount() { return winCount; }

   public int getHandSize() { return hand.size(); }

   public int getHandValue()
   {
      int val = 0;

      for(Card c : hand) //for each card in hand
      {
         val += c.getValue();
      }

      return val;
   }

   public  boolean  hit( Card c )
   {
      if(c.getValue() + getHandValue() < 21)
      {
         return true;
      }
      return false;
   }

   public String toString()
   {
      return "hand = " + hand;
   }
}