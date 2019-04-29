/* Author: Jeremy Kimball
 * Date: 3/14/2019
 * Class: CSC 160
 * Assignment: Leap Year
 */


package foo;

import java.util.Scanner;

public class LeapYear
{

	public static void main( String[ ] args )
	{
		
		char keepGoing;
		String answer;
		
		do 
		{
		
		
		double yearInput;
		Scanner getYearInput = new Scanner(System.in);
		System.out.println ( "Enter A Year: " );
		yearInput = getYearInput.nextInt();
		
		boolean isLeapYear = determineLeapYear(yearInput);
		output(isLeapYear);
		
		
		//Go Again?
		Scanner inputAnswer = new Scanner(System.in);
		System.out.println ( "Go Again? (Y/N): " );
		answer = inputAnswer.nextLine ();
		keepGoing = answer.toLowerCase().charAt(0);
		} while (keepGoing == 'y');
		
		System.out.println ( "Exited." );
	}
	
	
	//returns true/false leap year, from user input
	public static boolean determineLeapYear(double yearInput) 
	{
		
		
		
		if (yearInput % 4 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Uses boolean value to output results
	
	public static void output(boolean isLeapYear)
	{
		if (isLeapYear == true) 
		{
			System.out.println ("It is a leap year");
		}
		else 
		{
			System.out.println ( "It is not a leap year" );
		}
		
	}
}
