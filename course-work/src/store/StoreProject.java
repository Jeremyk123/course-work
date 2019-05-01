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

	public static void main( String[ ] args ) throws Exception
	{

		// Create an array of with size of twenty (Inventory)
		Inventory[ ] invArray = new Inventory[20];

		// Reading In File
		Inventory.readInFile( invArray );

		// Main
		Inventory.mainMenu ( invArray );
		
	}

}