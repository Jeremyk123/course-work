/* Author: Jeremy Kimball
 * Date: 3/4/2019
 * Class: CSC 160
 * Assignment: Ch.5 Loops Cs
 */


package foo;
import java.lang.Math;
import java.util.Scanner;

public class ForLoopCheckSheet
{

	public static void main( String[ ] args )
	{
		
		//initializations, getting user input
		double sum = 0;
		int quantity;
		int count = 0;
		int totalCount = 0;
		double currency;
		System.out.println ( "Enter a quantity: " );
		Scanner input = new Scanner(System.in);
		
		//looping # of times input, adding together users currency input
		for (quantity = input.nextInt (); count < quantity; count++)
		{
			System.out.println ( "Count: " + count );
			Scanner currencyInput = new Scanner(System.in);
			System.out.println ( "Enter a number: " );

			currency = currencyInput.nextDouble();
			sum = sum + currency;

		}
		
		//outputting results
		System.out.println ( "Total Count: " + count );
		System.out.println ( "Sum is: " + sum );
		
	}

}
