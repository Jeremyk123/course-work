package finalproject;

public class FinalProjectMethods {
	
	
	static char[][] gameBoard = new char[6][7];
	
	public static void main(String[] args)
	{
		gameBoard[1][0] = 'Y';
		gameBoard[2][0] = 'Y';
		gameBoard[3][0] = 'Y';
		gameBoard[4][0] = 'Y';
		
		System.out.println(checkR());
		
		System.out.println(checkY());
		
	}
	
	
	
	//check player 'R' return true/false if winning pattern found
	public static boolean checkR()
	{
		if (checkRHoriz() || checkRVert())
		{
			return true;
		}
		
	return false;
	}
	
	
	public static boolean checkRHoriz()
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
					if(gameBoard[r][c] == 'R')
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
	public static boolean checkRVert()
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
					if(gameBoard[r][c] == 'R')
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
	
	public static void checkRDiagUp()
	{
		
	}
	public static void checkRDiagDown()
	{
		
	}
	
	
	
	
	//Check Player 'Y' return true/false if winning pattern found
	public static boolean checkY()
	{
		if (checkYHoriz() || checkYVert())
		{
			return true;
		}
		
	return false;
	}
	
	
	
	
	public static boolean checkYHoriz()
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
					if(gameBoard[r][c] == 'Y')
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
	
	public static boolean checkYVert()
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
					if(gameBoard[r][c] == 'Y')
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
		
	
	
	public static void checkYDiagUp()
	{
		
	}
	public static void checkYDiagDown()
	{
		
	}
	
	
	
	
}
