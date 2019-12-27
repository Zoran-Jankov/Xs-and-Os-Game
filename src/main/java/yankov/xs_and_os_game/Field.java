package main.java.yankov.xs_and_os_game;

public enum Field
{
	A1, A2, A3,
	B1, B2, B3,
	C1, C2, C3;
	
	public boolean isCorner(Field field)
	{
		switch(field)
		{
			case A1:
			case A3:
			case C1:
			case C3:
				return true;
				
			default:
				return false;
		}
	}
	
	
}