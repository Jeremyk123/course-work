package finalproject;

public class FinalProjectMethods {
	
	
	static char[][] connect4 = new char[6][7];
	final static int COLUMN = 7;
	
	public static void main(String[] args)
	{
		connect4[1][0] = 'Y';
		connect4[2][0] = 'Y';
		connect4[3][0] = 'Y';
		connect4[4][0] = 'Y';
		System.out.println ( connect4[5][6] );
		System.out.println(checkR());

		System.out.println(checkY());
		
	}
	
	
	

	//check player 'R' return true/false if winning pattern found
	public static boolean checkR() //Jeremy
	{
		if (checkRHoriz() || checkRVert())
		{
			return true;
		}
		
	return false;
	}
	
	
	public static boolean checkRHoriz() //Jeremy
	{
		boolean win = false;
		int count = 0;
		
		// do until win is found
		while(!win)
		{
			//iterate through rows (r)
			for(int r = 0; 6 > r; r++)
			{
				//iterate through columns (c)
				for( int c = 0; 7 > c; c++)
				{
					if(connect4[r][c] == 'R')
					{
						//when a 'R' character is found start counting
						count++;
					}
					else
					{
						//reset count if non x char is found
						count = 0;
					}
					if(count >= 4)
					{
						//if count reaches 4, winner!
						win = true;
					}
				}
			}
			//break if ran through full board without win
			break;
		}
		
		//return true for win, false for no win
		return win;
		
	}
	
	public static boolean checkRVert() //Jeremy
	{
		boolean win = false;
		int count = 0;
		
		// do until win is found
		while(!win)
		{
			//iterate through columns (c)
			for(int c = 0; 7 > c; c++)
			{
				//iterate through rows (r)
				for( int r = 0; 6 > r; r++)
				{
					if(connect4[r][c] == 'R')
					{
						//when a 'R' character is found start counting
						count++;
					}
					else
					{
						//reset count if non x char is found
						count = 0;
					}
					if(count >= 4)
					{
						//if count reaches 4, winner!
						win = true;
					}
				}
			}
			//break if ran through full board without win
			break;
		}
		
		//return true for win, false for no win
		return win;
		
	}
	
	public static void checkRDiagUp() //Jeremy
	{
		
	}
	public static void checkRDiagDown() //Jeremy
	{
		
	}
	
	
	
	
	//Check Player 'Y' return true/false if winning pattern found
	public static boolean checkY() //Jeremy
	{
		if (checkYHoriz() || checkYVert())
		{
			return true;
		}
		
	return false;
	}
	
	
	
	
	public static boolean checkYHoriz() //Jeremy
	{
		boolean win = false;
		int count = 0;
		
		// do until win is found
		while(!win)
		{
			//iterate through rows (r)
			for(int r = 0; 6 > r; r++)
			{
				//iterate through columns (c)
				for( int c = 0; 7 > c; c++)
				{
					if(connect4[r][c] == 'Y')
					{
						//when a 'R' character is found start counting
						count++;
					}
					else
					{
						//reset count if non x char is found
						count = 0;
					}
					if(count >= 4)
					{
						//if count reaches 4, winner!
						win = true;
					}
				}
			}
			//break if ran through full board without win
			break;
		}
		
		//return true for win, false for no win
		return win;
	}
	
	public static boolean checkYVert() //Jeremy
	{
		boolean win = false;
		int count = 0;
		
		// do until win is found
		while(!win)
		{
			//iterate through columns (c)
			for(int c = 0; 7 > c; c++)
			{
				//iterate through rows (r)
				for( int r = 0; 6 > r; r++)
				{
					if(connect4[r][c] == 'Y')
					{
						//when a 'R' character is found start counting
						count++;
					}
					else
					{
						//reset count if non x char is found
						count = 0;
					}
					if(count >= 4)
					{
						//if count reaches 4, winner!
						win = true;
					}
				}
			}
			//break if ran through full board without win
			break;
		}
		
		//return true for win, false for no win
		return win;
		
	}
		
	
	
	public static void checkYDiagUp() //Jeremy
	{
		
	}
	public static void checkYDiagDown() //Jeremy
	{
		
	}
	
	
	
	
}
