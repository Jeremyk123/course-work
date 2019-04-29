/* Author: Jeremy Kimball
 * Date: 2/13/2019
 * Class: CSC 160
 * Assignment: in-class input/output
 * 
 * Getting user input and using it to calculate and output result
 */

package foo;
import java.util.Scanner;

public class ComputePoolAreaOfGum
{

	public static void main( String[ ] args )
	{
		//test logic
		double pool = 500000000;
		double gumTest = 25;
		double area = pool / gumTest;
		System.out.println (area);
		//get value and output now that logic verified
		double fillAmount = 0;
		Scanner input = new Scanner(System.in);
		System.out.println ( "Enter the size of gum in millimeters: " );
		double gum = input.nextDouble();
		double gumSq = gum * gum;
		fillAmount = pool / gumSq;
		System.out.println ( "You will need " + fillAmount + " pieces of gum to fill the pool.");		
	}

}
