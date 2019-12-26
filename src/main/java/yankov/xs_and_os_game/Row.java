package main.java.yankov.xs_and_os_game;

public class Row
{
	Mark field1;
	Mark field2;
	Mark field3;
	
	public Row(Mark field1, Mark field2, Mark field3)
	{
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	
	public boolean isFilled()
	{
		return !(Mark.isEmpty(field1) 
			  || Mark.isEmpty(field2) 
			  || Mark.isEmpty(field3));
	}
	
	public boolean isWiner()
	{
		return (field1 == field2) && (field1 == field3) && !Mark.isEmpty(field1);
	}
}