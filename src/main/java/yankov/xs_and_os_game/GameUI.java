package main.java.yankov.xs_and_os_game;

import javax.swing.JFrame;

public class GameUI
{
	private JFrame frame;

	/**
	 * Create the application.
	 */
	public GameUI()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}