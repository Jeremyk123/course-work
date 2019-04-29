/* Author: Jeremy Kimball
 * Date: 3/26/2019
 * Class: CSC 160 Combo
 * Assignment: Mancala Project / Coding a recreation of the game 'Mancala'
 */

package foo;

import java.util.Scanner;

public class MancalaProject
{

	public static final int PLAYER_ONE = 1;
	public static final int PLAYER_TWO = 2;

	public static void main( String[ ] args )
	{

		int[ ] beadArray = new int[14];
		startingArray ( beadArray );
		do
		{
			showBoard ( beadArray );
			System.out.println ( );
			// printArray(beadArray);

			dropBeads ( beadArray, PLAYER_ONE, getStartingBin ( PLAYER_ONE, beadArray ) );
			showBoard ( beadArray );
			System.out.println ( );

			if ( gameOverCheck ( beadArray ) == 1 )
			{
				break;
			}

			dropBeads ( beadArray, PLAYER_TWO, getStartingBin ( PLAYER_TWO, beadArray ) );

		} while ( gameOverCheck ( beadArray ) == -1 );
		if ( gameOverCheck ( beadArray ) == 1 )
		{
			System.out.println ( "Player one Won!" );
		}
		else if ( gameOverCheck ( beadArray ) == 2 )
		{
			System.out.println ( "Player two Won!" );
		}
	}

	// Output custom line of stars
	public static void makeSolidLine( int numStars )
	{
		for ( int i = 0; i < numStars; i++ )
		{
			System.out.print ( "*" );
		}
	}

	// Output 9 Stars 6 spaces in between each
	public static void makeDottedLine( )
	{
		for ( int y = 0; y < 8; y++ )
		{
			System.out.print ( "*" );
			for ( int x = 0; x < 6; x++ )
			{
				System.out.print ( " " );
			}
		}
		System.out.print ( "*" );
		System.out.println ( );
	}

	// display top row of nums excluding end bins
	public static void showTopRowNumbers( )
	{
		System.out.print ( "*      " );
		for ( int i = 0; i < 6; i++ )
		{
			System.out.printf ( "*  " + i + "   " );
		}
		System.out.print ( "*      *" );
	}

	// displaying the bottom row of numbers excluding end bins
	public static void showBottomRowNumbers( )
	{
		// placing double digit nums
		System.out.print ( "*      " );
		for ( int i = 12; i > 9; i-- )
		{
			System.out.printf ( "*  %s  ", i );
		}
		// placing single digit nums
		for ( int i = 9; i > 6; i-- )
		{
			System.out.printf ( "*  %s   ", i );
		}
		// end bin
		System.out.print ( "*      *" );
	}

	// display board using makeDottedLine/makeSolidLine methods
	public static void showBoard( int[ ] beadArray )
	{
		// top section including nums
		makeSolidLine ( 57 );
		System.out.println ( );
		makeDottedLine ( );
		showTopRowNumbers ( );
		System.out.println ( );
		makeDottedLine ( );
		showTopBins ( beadArray );
		System.out.println ( );
		makeDottedLine ( );

		// middle line & end bin nums
		System.out.print ( "*" + "  13  " );
		makeSolidLine ( 43 );
		System.out.println ( "  6   " + "*" );

		// bottom section including nums
		makeDottedLine ( );
		showBottomRowNumbers ( );
		System.out.println ( );
		makeDottedLine ( );
		showBottomBins ( beadArray );
		System.out.println ( );
		makeDottedLine ( );
		makeSolidLine ( 57 );
	}

	// fill beadArray with 0 at index 6 and 13, 4 in rest
	public static void startingArray( int[ ] beadArray )
	{
		for ( int i = 0; i <= 13; i++ )
		{
			if ( i == 6 || i == 13 )
			{
				continue;
			}
			beadArray[i] = 4;
		}

	}

	// print the contents of beadArray for testing purposes
	public static void printArray( int[ ] beadArray )
	{
		for ( int i = 0; i <= 13; i++ )
		{
			System.out.println ( beadArray[i] );
		}
	}

	// Display top bins
	public static void showTopBins( int[ ] beadArray )
	{
		System.out.printf ( "*      *  %2s  *  %2s  *  %2s  *  %2s  *  %2s  *  %2s  *      *", beadArray[0], beadArray[1],
				beadArray[2], beadArray[3], beadArray[4], beadArray[5] );
	}

	// Display bottom bins
	public static void showBottomBins( int[ ] beadArray )
	{
		System.out.printf ( "*  %2s  *  %2s  *  %2s  *  %2s  *  %2s  *  %2s  *  %2s  *  %2s  *", beadArray[13],
				beadArray[12], beadArray[11], beadArray[10], beadArray[9], beadArray[8], beadArray[7], beadArray[6] );
	}

	public static int gameOverCheck( int[ ] beadArray )
	{
		int topBinTotal = 0;
		int bottomBinTotal = 0;

		// add all top bins
		for ( int i = 0; i < 6; i++ )
		{
			topBinTotal += beadArray[i];
		}
		// System.out.println (topBinTotal);

		// add all bottom bins
		for ( int i = 7; i < 13; i++ )
		{
			bottomBinTotal += beadArray[i];
		}
		// System.out.println (bottomBinTotal);

		// check sides for empty bins, adding opposite sides remaining to score
		if ( topBinTotal == 0 )
		{
			beadArray[6] += bottomBinTotal;
		}
		else if ( bottomBinTotal == 0 )
		{
			beadArray[13] += topBinTotal;
		}
		else
		{
			return -1; // return neither player won yet
		}

		// check final scores, returning player with the highest score
		if ( beadArray[6] > beadArray[13] )
		{
			return 1;
		}
		else
		{
			return 2;
		}

	}

	// Get bin choice, not allowing empty bins, or bins outside of play
	public static int getStartingBin( int player, int[ ] beadArray )
	{
		int binChoice;
		if ( player == 1 )
		{

			do
			{
				System.out.print ( "Pick a bin (0-5): " );
				Scanner inputBinChoice = new Scanner ( System.in );
				binChoice = inputBinChoice.nextInt ( );
			} while ( beadArray[binChoice] == 0 || binChoice > 5 || binChoice < 0 );
			return binChoice;
		}
		if ( player == 2 )
		{

			do
			{
				System.out.print ( "Pick a starting bin (7-12): " );
				Scanner inputBinChoice = new Scanner ( System.in );
				binChoice = inputBinChoice.nextInt ( );
			} while ( beadArray[binChoice] == 0 || binChoice > 12 || binChoice < 7 );
			return binChoice;
		}
		return 0;
	}

	// Method to drop beads
	public static void dropBeads( int[ ] beadArray, int player, int binChoice )
	{

		// dropping beads for player one, skipping bin 13
		if ( player == 1 )
		{
			int beadAmount = beadArray[binChoice];
			int beadLocation = binChoice + 1;
			beadArray[binChoice] = 0;
			for ( int i = 0; i < beadAmount; i++ )
			{

				// move bead, if at 13 return to 0 index
				if ( beadLocation == 13 )
				{
					beadLocation = 0;
					beadArray[beadLocation] += 1;
					continue;
				}
				else
					// add bead in location
					beadArray[beadLocation] += 1;
				beadLocation += 1;
			}
		}

		// dropping beads for player two, skipping bin 6
		if ( player == 2 )
		{
			int beadAmount = beadArray[binChoice];
			int beadLocation = binChoice + 1;
			beadArray[binChoice] = 0;
			for ( int i = 0; i < beadAmount; i++ )
			{

				// move bead, if at 13 return to 0 index
				if ( beadLocation == 13 )
				{
					beadArray[beadLocation] += 1;
					beadLocation = 0;
					continue;
				}
				else if ( beadLocation == 6 )
				{
					// skip bin 6
					beadLocation = 7;
					beadArray[beadLocation] += 1;
					continue;
				}
				else
					// add bead in location
					beadArray[beadLocation] += 1;
				beadLocation += 1;

			}
		}
	}
}
