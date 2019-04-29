package foo;

public class ForWhileLoopPractice
{

	public static void main( String[ ] args )
	{
		int count = 0;
		int sum = 0;
		while (count < 10)
		{
			sum += count;
			count++;
		}
		System.out.println ( sum );
		sum = 0;
		int i;
		for (i = 0; i < 10; i++)
		{
			sum += i;
		}
		System.out.println ( sum );
	}

}
