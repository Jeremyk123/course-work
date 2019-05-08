package finalproject;

public class FinalProject
{

	public static void main( String[ ] args )
	{
		int[][] connectFour = new int [6][7];
		

		for(int i = 0; i < connectFour.length; i++)
		{
//			System.out.println ( connectFour.length );
			
			for (int j = 0; j < connectFour[i].length; j++)
			{
//				System.out.println ( connectFour[j].length );
				connectFour[i][j] = 5;
			}
		}
	}

}
