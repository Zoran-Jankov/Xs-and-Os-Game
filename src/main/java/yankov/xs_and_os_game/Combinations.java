package main.java.yankov.xs_and_os_game;

public class Combinations
{
	public Row firstRow;
	public Row secondRow;
	public Row thirdRow;
	
	public Row firstColumn;
	public Row secondColumn;
	public Row thirdColumn;
	
	public Row backDiagonal;
	public Row forwardDiagonal;
	
	private Row combinations[] = {firstRow, secondRow, thirdRow, 
								 firstColumn, secondColumn, thirdColumn,
								 backDiagonal, forwardDiagonal};
	
	public Combinations(Board board)
	{
		firstRow = new Row(board.A1, board.B1, board.C1);
		secondRow = new Row(board.A2, board.B2, board.C2);
		thirdRow = new Row(board.A3, board.B3, board.C3);
		
		firstColumn = new Row(board.A1, board.A2, board.A3);
		secondColumn = new Row(board.B1, board.B2, board.B3);
		thirdColumn = new Row(board.C1, board.C2, board.C3);
		
		backDiagonal = new Row(board.A1, board.B2, board.C3);
		forwardDiagonal = new Row(board.A3, board.B2, board.C1);
	}
	
	public boolean hasWiningCombination()
	{
		return false;
	}
}