package foo;

import java.util.Scanner;

public class CheckList
{

	public static void main( String[ ] args )
	{
		double numberOne;
		double numberTwo;
		double numberThree;

		//get all three inputs

		Scanner inputOne = new Scanner(System.in);
		System.out.println ( "Enter number one: " );
		numberOne = inputOne.nextDouble();
		Scanner inputTwo = new Scanner(System.in);
		System.out.println ( "Enter number two: " );
		numberTwo = inputTwo.nextDouble();
		Scanner inputThree = new Scanner(System.in);
		System.out.println ( "Enter number three: ");
		numberThree = inputThree.nextDouble();

		/* output the higher of two numbers
		if (numberOne < numberTwo)
		{
			System.out.println ( numberTwo + " is the higher number." );
		}
		else
		{
			System.out.println ( numberOne + " is the higher number." );
		}
		 */

		if (numberOne > numberTwo && numberOne > numberThree)
		{
			if (numberTwo > numberThree)
			{
				System.out.println ( numberOne + " " + numberTwo + " " + numberThree );
			}
			else
			{
				System.out.println ( numberOne + " " + numberThree + " " + numberTwo );
			}
		}
		if (numberTwo > numberOne && numberTwo > numberThree)
		{
			if (numberOne > numberThree)
			{
				System.out.println ( numberTwo + " " + numberOne + " " + numberThree);
			}
			else
			{
				System.out.println ( numberTwo + " " + numberThree + " " + numberOne);
			}
		}
		if (numberThree > numberOne && numberThree > numberTwo)
		{
			if (numberOne > numberTwo)
			{
				System.out.println ( numberThree + " " + numberOne + " " + numberTwo );
			}
			else
			{
				System.out.println ( numberThree + " " + numberTwo + " " + numberOne );
			}
		}
	}


}
