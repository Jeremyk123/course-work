package foo;
import java.math.*;
public class PrintFCheckSheet
{
	public static void main( String[ ] args )
	{
		// printing math.pow 0-30 as ints
		for (int i = 0; i <= 31; i++)
		{
			int printPow = (int)(Math.pow(2,i));
			System.out.printf("%d is two to the power of %d |", printPow, i);
		}
		System.out.println (  );
		System.out.println ("--------------------------------------------------");
		System.out.println (  );
		// printing same numbers but one number per line
		for (int i = 0; i <= 31; i++)
		{
			int printPow = (int)(Math.pow(2,i));
			System.out.printf("%10s\n", printPow);
		}
		
		System.out.println (  );
		System.out.println ("-------------------------------------------------");
		System.out.println (  );
		
		// printing same numbers but 5 per line
		for (int i = 0; i <= 31; i++)
		{
			int printPow = (int)(Math.pow(2,i));
			System.out.printf("%11s", printPow);
			if (i % 5 == 0)
			{
				System.out.println();
			}
		}
		System.out.println (  );
		System.out.println ("-----------------------------------------------");
		System.out.println (  );
		
		//print 0-360 and radians on one line
		for (int i = 0; i <= 360; i += 30)
		{
			double varToRadians = Math.toRadians ( i );
			System.out.printf("%s %s ", i, varToRadians);
		}
		
		System.out.println (  );
		System.out.println ("----------------------------------------------");
		System.out.println (  );
		
		//print 0-360 and radians two per line
		
		System.out.println ("Degrees | Radians");
		for (int i = 0; i <= 360; i += 30)
		{
			float varToRadians = (float)(Math.toRadians ( i ));
			System.out.printf("%7d %9.4f \n", i, varToRadians);
		}
		
	}
}
