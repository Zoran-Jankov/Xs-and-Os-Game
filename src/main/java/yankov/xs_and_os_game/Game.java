package main.java.yankov.xs_and_os_game;

public class Game
{
	private short turn = 1;
	private Board board = new Board();
	private Combinations combinations = new Combinations(board);
	
	public boolean isGameOver()
	{
		return combinations.hasWiningCombination() || turn <= 9;
	}
	
	public Score getScore()
	{
		return null;
	}
}