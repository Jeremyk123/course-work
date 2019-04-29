package foo;
import java.util.Scanner;
//includes package/library for Scanner

public class ComputeAreaOfCircle
{
	public static void main(String[] arg)
	{
	double area = 0;
	// Create a Scanner object
	Scanner foo = new Scanner(System.in);
	//Prompt the user to enter a radius
	System.out.print ( "Enter the radius as a number: " );
	double radius = foo.nextDouble();
	area = radius * radius * 3.14159;
	
	
	System.out.println ( "The area of for the circle radius is " + radius + " is " + area);
	
	}
}
