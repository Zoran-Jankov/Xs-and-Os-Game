package main.java.yankov.xs_and_os_game;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Combinations
{
	public static Map<Field, Mark> firstRow;
	public static Map<Field, Mark> secondRow;
	public static Map<Field, Mark> thirdRow;
	
	public static Map<Field, Mark> firstColumn;
	public static Map<Field, Mark> secondColumn;
	public static Map<Field, Mark> thirdColumn;
	
	public static Map<Field, Mark> backDiagonal;
	public static Map<Field, Mark> forwardDiagonal;
	
	private static List<Map<Field, Mark>> combinations = Arrays.asList(firstRow, secondRow, thirdRow, 
																firstColumn, secondColumn, thirdColumn,
																backDiagonal, forwardDiagonal);
	
	private static Map<Field, Mark> winingCombination = null;
	
	public Combinations(Board board)
	{
		firstRow = Map.of(Field.A1, board.A1, 
						  Field.B1, board.B1, 
						  Field.C1, board.C1);
		
		secondRow = Map.of(Field.A2, board.A2, 
						   Field.B2, board.B2, 
						   Field.C2, board.C2);
		
		thirdRow = Map.of(Field.A3, board.A3, 
						  Field.B3, board.B3, 
						  Field.A2, board.C3);
		
		firstColumn = Map.of(Field.A1, board.A1, 
							 Field.A2, board.A2, 
							 Field.A3, board.A3);
		
		secondColumn = Map.of(Field.B1, board.B1, 
							  Field.B2, board.B2, 
							  Field.B3, board.B3);
		
		thirdColumn = Map.of(Field.C1, board.C1, 
							 Field.C2, board.C2, 
							 Field.C3, board.C3);
		
		backDiagonal = Map.of(Field.A1, board.A1, 
							  Field.B2, board.B2, 
							  Field.C3, board.C3);
		
		forwardDiagonal = Map.of(Field.A3, board.A3, 
								 Field.B2, board.B2, 
								 Field.C1, board.C1);
	}
	
	public static boolean isFilled(Map<Field, Mark> combination)
	{
		for(Entry<Field, Mark> field : combination.entrySet())
		{
			if(!Mark.isEmpty(field.getValue()))
				return false;
		}
		
		return true;
	}
	
	public static boolean isWiner(Map<Field, Mark> combination, Mark playerMark)
	{
		for(Entry<Field, Mark> field : combination.entrySet())
		{
			if(field.getValue() != playerMark)
				return false;
		}
		
		return true;
	}
	
	public static boolean hasWiningCombination()
	{
		return winingCombination != null;
	}
	
	public Map<Field, Mark> getWiningCombination(Mark playerMark)
	{
		for(Map<Field, Mark> combination : combinations)
		{
			if(isWiner(combination, playerMark))
			{
				winingCombination = combination;
			}
		}
		
		return winingCombination;
	}
}