/* Author: Jeremy Kimball
 * Date: 2/19/2019
 * Class: CSC 160
 * Assignment: Guessing Game
 */


package foo;
import java.lang.Math;
import java.util.Scanner;

public class GuessingGame
{

	public static void main( String[ ] args )
	{
		//Setting the range from user input
		int max;
		int min;
		Scanner maxInput = new Scanner(System.in);
		System.out.print("Enter the Maximum Range: ");
		max = maxInput.nextInt();
		Scanner minInput = new Scanner(System.in);
		System.out.print("Enter the Minimum Range: ");
		min = minInput.nextInt();

		//Multiple Games
		int playGame = 1;
		int pointTotal = 0;
		int gameTotal = 0;

		do
		{

		//creating random#
		int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;
		int points = 5;

		// Output number for testing
		System.out.println(rand + " Testing Number");

		//Get user's guess
		int userGuess;
		Scanner input = new Scanner(System.in);
		System.out.format("Enter your guess ( %s - %s ): ", min, max);
		userGuess = input.nextInt();

		// Allow multiple answers, giving hints
		while (userGuess != rand)
		{
			if (userGuess > rand)
			{
				System.out.println("Your guess is too high!");
			}
			else
			{
				System.out.println ("Your guess is too low!");
			}
			if (points > 0)
			{
				points--;
			}
			System.out.format("Try again! Enter another guess (%s-%s): ", min, max);
			userGuess = input.nextInt ();
		}

		//total points, ask for another game
		System.out.println ( "You Guessed correctly!" );
		Scanner playInput = new Scanner(System.in);
		System.out.println ( "Play Another Game?: [1] Yes [2] No" );
		playGame = playInput.nextInt ( );
		pointTotal = pointTotal + points;
		gameTotal++;

		} while (playGame == 1);

		//Output final results
		double pointAvg = pointTotal/gameTotal;
		System.out.println("Total score: " + pointTotal);
		System.out.println ("You're average score over " + gameTotal + " game(s) was " + pointAvg + "!");
	}

}
