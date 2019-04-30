package store;

import java.util.Scanner;
import java.lang.Math;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Inventory
{
	public String name;
	private double price;
	private int quantity;
	private double weight;
	private double priceWeight;
	private static double lostSales;
	private static int lostSalesAmt;

	
	//constructor
public Inventory(String name, double price, int quantity, double weight, double priceWeight)
{
	this.name = name;
	this.price = price;
	this.quantity = quantity;
	this.weight = weight;
	this.priceWeight = priceWeight;

}
public Inventory()
{

}


//public Inventory()
//{
//	
//}



//toString
public String toString(){//overriding the toString() method  
	  return String.format("Name: %s  Price: %s  Quantity: %s  Weight: %s  Price/lb: %.4s ",name,price,quantity,weight,priceWeight);  
	 }  
//toString
public static String toPrint(Inventory[] invArray){//overriding the toString() method  
		int i = 0;
	  return String.format("Name: %s  Price: %s  Quantity: %s  Weight: %s  Price/lb: %.4s ", invArray[i].getName ( ), invArray[i].getPrice ( ), invArray[i].getQuantity ( ),
				invArray[i].getWeight ( ), invArray[i].getPriceWeight ( ) );
	 }  


// main  menu
public static void mainMenu(Inventory[] invArray) throws FileNotFoundException
{
	
	Scanner inputChoice = new Scanner ( System.in );
	int choice;
	boolean exit = false;
	do
	{
		Inventory.displayInv ( invArray );
		System.out.println (  );
		System.out.println ( "============== Choose a menu option ===============");
		System.out.println ( "|1| Buy Item |2| Add Item |3| Manager Menu |4| Exit" );
		System.out.println ( "===================================================" );
		choice = inputChoice.nextInt ( );
		switch ( choice )
		{
			case 1:
				System.out.println ( );
				Inventory.buyItem ( invArray );
				break;
			case 2:
				Inventory.displayInv ( invArray );
				System.out.println ( );
				Inventory.addItem ( invArray );
				break;
			case 3:
				System.out.println ( );
				Inventory.managerMenu(invArray);
				break;
			case 4:
				exit = true;
				break;
		}
	} while ( exit == false );
}


// display inv
public static void displayInv( Inventory[ ] invArray )
{

	System.out.println ("======================== Butcher Shop ========================" );
	System.out.println ( "item# 	name 	    price      quantity      weight      pricelbs" );
	for ( int i = 0; i <= invArray.length; i++ )
	{
		if ( invArray[i] == null )
		{
			break;
		}
		System.out.printf ( "(%s) - %-10s    %-5s      %-3s           %-4s        %-5.4s ", i + 1,
				invArray[i].getName ( ), invArray[i].getPrice ( ), invArray[i].getQuantity ( ),
				invArray[i].getWeight ( ), invArray[i].getPriceWeight ( ) );
		System.out.println ( );
	}
}
//add item from user input
public static void addItem( Inventory[ ] invArray )
{
	for ( int i = 0; i <= invArray.length; i++ )
	{
		if ( invArray[i] == null )
		{

			// Name
			System.out.println ( "Enter the Name" );
			Scanner inputName = new Scanner ( System.in );
			
			// Price
			System.out.println ( "Enter the Price" );
			Scanner inputPrice = new Scanner ( System.in );

			// Quantity
			System.out.println ( "Enter the Quantity" );
			Scanner inputQuantity = new Scanner ( System.in );

			// Weight
			System.out.println ( "Enter the Weight" );
			Scanner inputWeight = new Scanner ( System.in );
			
			// PriceWeight
					System.out.println ( "Enter the Price per lb" );
					Scanner inputPriceWeight = new Scanner ( System.in );

			Inventory item = new Inventory ( inputName.nextLine ( ), inputPrice.nextDouble ( ),
					inputQuantity.nextInt ( ), inputWeight.nextDouble ( ), inputPriceWeight.nextDouble() );
			invArray[i] = item;
			break;
		}
	}
}

//allow user to buy items, keeping track of lost sales
public static double buyItem(Inventory[] invArray)
{
	int inputAns = 1;
	int inputItemNum = 0;
	double userTotal = 0;
	double familyTotal = 0;
	int family = 0;
	
	System.out.println ( "How many people in your group?:\n" );
	Scanner inputFamily = new Scanner(System.in);
	family = inputFamily.nextInt ( );
	//handle multiple customers in a group
	do {
	//handle buying items
	do
	{
		
		//get user item choice
		Inventory.displayInv ( invArray );
		System.out.println ( "\nFamily member |" + family + "| Enter number of item to buy or type 0 to exit:\n" );
		Scanner inputItem = new Scanner(System.in);
		//remove one from itemchoice to match index of array instead of what is displayd to user
		inputItemNum = inputItem.nextInt ( );
		inputItemNum -= 1;
		
		if (inputItemNum == -1){
			break;
		}
		//check if there is stock
		if (invArray[inputItemNum].getQuantity ( ) == 0)
		{
			System.out.println ( invArray[inputItemNum].getName ( ) + " is out of Stock." );
			Inventory.setLostSales(invArray[inputItemNum].getPrice ( ));
			Inventory.setLostSalesAmt ( 1 );
			continue;
		}
		
		//add price to total, remove 1 from the quantity
		userTotal += invArray[inputItemNum].getPrice ( );
		invArray[inputItemNum].setQuantity ( invArray[inputItemNum].getQuantity ( ) - 1 );
		
		//Buy another?
		Inventory.displayInv ( invArray );
		System.out.printf ( "Current total is : %.5s Buy another item?: [1] Yes [2] No", userTotal );
		Scanner input = new Scanner (System.in);
		inputAns = input.nextInt( );
	} while (inputAns == 1);
		familyTotal += userTotal;
		userTotal = 0;
	   family--;
	} while(family != 0);
	return familyTotal;
}


//allows users in manager menu to buy stock for 
public static void addInventory(Inventory[ ] invArray) throws FileNotFoundException
{

	Scanner readFile = new Scanner ( new File ( "inventoryFile2.txt" ) );
	PrintWriter writeFile = new PrintWriter(new File("inventoryFile2.txt"));
	
	//choose item for stock to be added to
	System.out.println("Please enter what the number of the item you would like to add to:\n");
	Scanner inputItem = new Scanner(System.in);
	int c = (inputItem.nextInt()) - 1;
	int i = 0;
	
	//enter amount to buy, calc/output cost
	System.out.println("How many would you like to add?:\n");
	Scanner inputItemAmount = new Scanner(System.in);
	int amount = inputItemAmount.nextInt();
	double cost = invArray[c].getPrice() * amount;
	System.out.printf("You have spent: $%4.4s\n", cost);

	
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
		
		if (i == c)
		{
			inv.setQuantity(inv.getQuantity() + amount);
		}
		
		

		
		// Inventory item = new Inventory ( token, price, quantity, weight );
		invArray[i] = inv;
		
		writeFile.print( attrib[0] );
		writeFile.print(" ");
		writeFile.print( Double.parseDouble ( attrib[1] ) );
		writeFile.print(" ");
		writeFile.print( Integer.parseInt ( attrib[2] ) );
		writeFile.print(" ");
		writeFile.print( Double.parseDouble ( attrib[3] ) );
		writeFile.print(" ");
		writeFile.print( Double.parseDouble ( attrib[4] ) );
		writeFile.print("\n");
		
		i++;

	}
	
	// closing the file
	readFile.close ( );
	writeFile.close();


	

	
}

public static void managerMenu(Inventory[] invArray) throws FileNotFoundException
{

	String passVar;
	do {
		System.out.print( "Please enter the password or type exit, to return to the main menu:\n" );
		Scanner inputPassVar = new Scanner(System.in);
		passVar = inputPassVar.next( );
if (passVar.equals ( "password123" ))
{
	System.out.println ( "Lost sales: " + Inventory.getLostSales() + 
			"\nAmount of lost Sales: " + Inventory.getLostSalesAmt ( ) );
	Inventory.addInventory(invArray);

	break;
}
	System.out.println ( passVar );

	}while ( !passVar.equals ("exit" ));
	
}

//get/set name
public String getName() {
    return this.name;
}

public void setName(String name) {
    this.name = name;
    
}
//get/set price
public double getPrice() {
    return this.price;
}

public void setPrice(double num) {
    this.price = num;
}


//get/set quantity
public int getQuantity() {
    return this.quantity;
}

public void setQuantity(int num) {
    this.quantity = num;
}
//get/set weight
public double getWeight() {
    return this.weight;
}

public void setWeight(double num) {
    this.weight = num;
}
//get/set priceWeight
public double getPriceWeight() {
    return this.priceWeight;
}

public void setPriceWeight(double num) {
    this.priceWeight = num;
}
//get/set lostSales
public static double getLostSales()
{
	return lostSales;
}
public static void setLostSales(double num)
{
	lostSales += num;
}
//get/set lostSalesAmt
public static int getLostSalesAmt()
{
	return lostSalesAmt;
}
public static void setLostSalesAmt(int num)
{
	lostSalesAmt += num;
}


}