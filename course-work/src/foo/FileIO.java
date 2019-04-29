package foo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO
{


	public static void main( String[ ] args ) throws FileNotFoundException
	{
		//opening files for read/write
		Scanner readFile = new Scanner(new File("readfile.txt"));
		PrintWriter writeFile = new PrintWriter(new File("writefile.txt"));
		
		int total = 0;

				//reading/printing to console from readfile.txt
				while (readFile.hasNext())
				{
					if(readFile.hasNextInt ( ))
					{
						
						int readNum = readFile.nextInt();
						total += readNum;
						writeFile.println(readNum);
					}
					else
					{
					String token = readFile.next( );
					System.out.println ( token );
					
					//write to file
					writeFile.println(token);
		
					}
				}
				System.out.println (total);
				//closing the files
					writeFile.close ( );
					readFile.close();
	}

}
