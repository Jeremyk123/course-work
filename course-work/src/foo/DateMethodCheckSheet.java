/* Author: Jeremy Kimball
 * Date: 3/27/2019
 * Class: CSC 160 Combo
 * Assignment: Working with Dates and Modular Code / Method Checksheet
 */

package foo;

import java.time.LocalDate;
import java.util.Scanner;

public class DateMethodCheckSheet {

	public static void main(String[] args) {

		int[] dateArray = new int[3];
		int[] birthArray = new int[3];
		
		
		currentDate(); //grab current date put into variable

		splitDate(dateArray); //split date into an array

		outputDates(dateArray); //output Current Date Split

		getBirthday(birthArray); //change birthArray to input
		
		compareDates(dateArray, birthArray); // compare dates return true/false 
		
		outputDates(birthArray, dateArray); //overload Output birthday Results

	}

	// method to get current date and store it
	public static LocalDate currentDate() {

		LocalDate today = LocalDate.now();
		return today;

	}

	// method to split current date into array
	public static int[] splitDate(int[] dateArray) {
		LocalDate today = LocalDate.now();
		dateArray[0] = today.getDayOfMonth();
		dateArray[1] = today.getMonthValue();
		dateArray[2] = today.getYear();
		return dateArray;
	}

	// method to get user birthday and split into array
	public static int[] getBirthday(int[] birthArray) {
		System.out.println("Enter your birthday (Day Month Year): ");
		Scanner input = new Scanner(System.in);

		// day
		birthArray[0] = input.nextInt();
		// month
		birthArray[1] = input.nextInt();
		// year
		birthArray[2] = input.nextInt();
		System.out.println(birthArray[0]);
		System.out.println(birthArray[1]);
		System.out.println(birthArray[2]);
		LocalDate inputBirthDate = LocalDate.of(birthArray[2],birthArray[1],birthArray[0]);
		System.out.println ( inputBirthDate );
		return birthArray;
	}
	// method to compare user birthday

	public static boolean compareDates(int[] birthArray, int[] dateArray) {

		if (birthArray[0] == dateArray[0] && birthArray[1] == dateArray[1]) {
			return true;
		} else {
			return false;
		}
	}

	// method to output split current date
	public static void outputDates(int[] dateArray) {
		System.out.printf("Year is %s     Month is %s    Day is %s\n", dateArray[2], dateArray[1], dateArray[0]);
	}

	// overloaded method to output birthday results
	public static void outputDates(int[] birthArray, int[] dateArray) {
		if (compareDates(birthArray, dateArray) == true) {
			System.out.println("Happy Birthday!");
		} else {
			System.out.println("It's not your birthday");
		}
	}
}