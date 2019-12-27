package main.java.yankov.xs_and_os_game;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Combinations
{
	private Map<Field, Mark> firstRow;
	private Map<Field, Mark> secondRow;
	private Map<Field, Mark> thirdRow;
	
	private Map<Field, Mark> firstColumn;
	private Map<Field, Mark> secondColumn;
	private Map<Field, Mark> thirdColumn;
	
	private Map<Field, Mark> backDiagonal;
	private Map<Field, Mark> forwardDiagonal;
	
	private List<Map<Field, Mark>> combinations = Arrays.asList(firstRow, secondRow, thirdRow, 
																firstColumn, secondColumn, thirdColumn,
																backDiagonal, forwardDiagonal);
	
	private Map<Field, Mark> winingCombination = null;
	
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
	
	public boolean hasWiningCombination()
	{
		return winingCombination != null;
	}
	
	public Map<Field, Mark> getWiningCombination()
	{
		for(Map<Field, Mark> combination : combinations)
		{
			if(combination.isWiner())
			{
				winingCombination = combination;
			}
		}
		
		return winingCombination;
	}
}