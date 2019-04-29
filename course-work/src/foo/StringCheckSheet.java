package foo;

import java.util.Scanner;

public class StringCheckSheet
{

	public static void main( String[ ] args )
	{
		//grab sentence output length
		System.out.print( "Enter a sentence: " );
		Scanner inputSentence = new Scanner(System.in);
		String sentence = inputSentence.nextLine();
		int sentenceLength = sentence.length();
		System.out.println ("The length of this sentence is: " + sentenceLength );
		
		//input word, concat to sentence
		System.out.print( "Enter a word to add to the sentence: " );
		Scanner inputWord = new Scanner(System.in);
		String word = inputWord.next();
		sentence = sentence.concat (" " + word );
		System.out.println ( sentence );
		
		//concat to sentence using +
		System.out.println ( sentence + " " + word );
		
		//finding first whitespace
		int blank = sentence.indexOf ( ' ' );
		System.out.println ("The first blank is at: " + blank );
		
		//replace blanks with underscore
		sentence = sentence.replace ( ' ', '_' );
		System.out.println ( sentence );
		
		//input second word
		System.out.println ( "Enter a second word: " );
		Scanner inputWordTwo = new Scanner(System.in);
		String wordTwo = inputWordTwo.next ( );
		
		//compare word1 & word2
		 if (word.equals ( wordTwo ))
		 {
			 System.out.println ( "They are equal" );
		 }
		 else
		 {
			 System.out.println ( "They are different" );
		 }

		//compare word to exact string literal
		 String wordString = "Foo";
		 int compareExact = word.compareTo(wordString);
		 System.out.println ( compareExact );
		 
		//Enter two numbers as strings and add/output
		 Scanner inputNum1 = new Scanner(System.in);
		 System.out.println ( "Enter a number >100: " );
		 String num1 = inputNum1.nextLine ( );
		 
		 Scanner inputNum2 = new Scanner(System.in);
		 System.out.println ( "Enter a second number >100: " );
		 String num2 = inputNum2.nextLine ( );
		 
		 System.out.println ( num1 + num2 );
		 
		 int number1 = Integer.parseInt ( num1 );
		 int number2 = Integer.parseInt ( num2 );
		 System.out.println ( number1 + number2 );
		 
		 
		 //conver non number word into an int to break
		 
		 Scanner inputBreaker = new Scanner(System.in);
		 System.out.println ( "Enter a word: " );
		 String breakerWord = inputBreaker.nextLine ( );
		 int breakerInt = Integer.parseInt ( breakerWord );
		
		 
		

	}

}
