/* Author: Jeremy Kimball
 * Date: 4/8/2019
 * Class: CSC 160 Combo
 * Assignment: Store Project / Creating a POS system for a butcher shop
 */

package store;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StoreProject
{

	public static void main( String[ ] args ) throws FileNotFoundException
	{

		// Create an array of with size of twenty (Inventory)

		Inventory[ ] invArray = new Inventory[20];

		// Reading In File

		Scanner readFile = new Scanner ( new File ( "inventoryFile2.txt" ) );


		int i = 0;
		while ( readFile.hasNextLine ( ) )
		{
			String oneline = readFile.nextLine ( );
			String[ ] attrib = oneline.split ( " " );

			Inventory inv = new Inventory ( );

			inv.setName ( attrib[0] );
			inv.setPrice ( Double.parseDouble ( attrib[1] ) );
			inv.setQuantity ( Integer.parseInt ( attrib[2] ) );
			inv.setWeight ( Double.parseDouble ( attrib[3] ) );
			inv.setPriceWeight ( Double.parseDouble ( attrib[4] ) );
			
			
			// Inventory item = new Inventory ( token, price, quantity, weight );
			invArray[i] = inv;
			i++;

		}
		
		// closing the file
		readFile.close ( );


		// Main
		Inventory.mainMenu ( invArray );
	}

}