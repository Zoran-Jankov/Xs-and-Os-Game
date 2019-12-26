package main.java.yankov.xs_and_os_game;

public enum Mark
{
	EMPTY,
	X,
	O;
	
	public static boolean isEmpty(Mark mark)
	{
		switch(mark)
		{
			case EMPTY:
				return true;
			
			default:
				return false;
		}
	}
	
	public static Mark oposite(Mark mark)
	{
		switch(mark)
		{
			case X:
				return O;

			case O:
				return X;
				
			default:
				return EMPTY;
		}
	}
}