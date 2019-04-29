/* Author: Jeremy Kimball
 * Date: 4/8/2019
 * Class: CSC 160 Combo
 * Assignment: Store Project / Creating a POS system for a butcher shop
 */



package foo;
import java.util.Scanner;

public class StoreProject
{

	public static void main( String[ ] args )
	{
		managerMenu();

	}
	
	
	//pass protected manager menu
	public static void managerMenu()
	{
		System.out.print( "Please enter the password or type exit, to return to the main menu: " );
		Scanner inputPassVar = new Scanner(System.in);
		String passVar = inputPassVar.nextLine ( );
		if (passVar == "password123")
		{
			//run when pass is correct
		} 
		else if (passVar == "exit") 
		{
		return;	
		}
		return;
	}
	
	
	public static void endOfDay()
	{
		
	}
	
	
	public static void newSale()
	{
		
	}
}

