/* Author: Jeremy Kimball
 * Date: 3/6/2019
 * Class: CSC 160
 * Assignment: Nested Loops Check Sheet
 * 
 * Generating Two Random numbers until they are equal, outputting averages and highest counts of unequal before a match
 */


package foo;
import java.util.Scanner;
import java.lang.Math;


public class NestedLoopsCheckSheet
{

	public static void main( String[ ] args )
	{

		int answer;
		int num1;
		int num2;
		int countUnequal = 0;
		int highestCountUnequal = 0;
		int count = 0;
		int countAverage = 0;
		int countAvg = 0;
		int max;
		int min;
		int range;
		int rangeDifference = 3;
		int keepGoing;
		int overAllAvg = 0;
		int overAllHighestCount = 0;
		int totalAnswer = 0;

		//user sets range and # of times to be ran

		do // (Loop 1) Continue to run?
		{



			do //prompt until min/max are atleast 2 apart
			{

				if (rangeDifference < 2)
				{
					System.out.println("The numbers need to be atleast 2 apart!");
				}

				Scanner inputRangeMax = new Scanner(System.in);
				System.out.print( "Input a maximum for the range: " );
				max = inputRangeMax.nextInt();

				Scanner inputRangeMin = new Scanner(System.in);
				System.out.print( "Input a minimum for the range: " );
				min = inputRangeMin.nextInt();

				rangeDifference = max - min;

			} while (rangeDifference < 2);


			//setting # of runs
			Scanner input = new Scanner(System.in);
			System.out.print( "How many times would you like to run?: " );
			count = 0;

			for (answer = input.nextInt ( ); count < answer; count++)	// (Loop 2) Do user # amount of times
			{

				do // (Loop 3) Generating Numbers/Counting stopping on equal numbers
				{


					range = max - min + 1; 
					num1 = (int)(Math.random() * range) + min;
					num2 = (int)(Math.random() * range) + min;
					System.out.println ( num1 + " " + num2 );


					//counting number of times unequal
					countUnequal++;

				} while (num1 != num2);

				System.out.println("------------------------------");
				System.out.println ("Current Count Unequal: " + countUnequal );
				System.out.println("------------------------------");

				//keep track of highest # of unequals
				if (highestCountUnequal < countUnequal) 
				{

					highestCountUnequal = 0;
					highestCountUnequal += countUnequal;

					if (highestCountUnequal > overAllHighestCount)
					{
						overAllHighestCount = 0;
						overAllHighestCount += countUnequal;
					}
				}

				//calc average and  reset values
				countAverage += countUnequal;
				countAvg = countAverage / answer;
				countUnequal = 0;
				totalAnswer += answer;
				overAllAvg += countAverage;

			}



			//outputting total results for specified times ran
			System.out.println("------------------------------");
			System.out.println ("Highest Count Unequal: " + highestCountUnequal );
			System.out.println ("Average Number of Unequal: " + countAvg );
			System.out.println("------------------------------");



			//prompt another run
			Scanner inputKeepGoing = new Scanner(System.in);
			System.out.println("Run again? Yes[1] No [2]: ");
			keepGoing = inputKeepGoing.nextInt();		
		} while (keepGoing == 1);



		// exiting outputs, final calculation of total avg of all runs
		overAllAvg = overAllAvg / totalAnswer;
		System.out.println("-----------------------");
		System.out.println("The Program has exited.");
		System.out.println("-----------------------");
		System.out.println("Overall highest count: " + overAllHighestCount);
		System.out.println("Overall Average: " + overAllAvg);


	}

}
