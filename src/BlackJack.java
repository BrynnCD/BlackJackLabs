//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack extends Card
{
	//add in Player instance variable
	//add in Dealer instance variable

	public BlackJack()
	{
	}

	public int getValue()
	{
		//override the Card getValue to build BlackJack logic
		//enables you to build the value for the game into the card
		//this makes writing the whole program a little easier
		return 0; //change
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		char choice = 0;
	}

	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
	}
}