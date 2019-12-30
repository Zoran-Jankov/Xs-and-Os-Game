package main.java.yankov.xs_and_os_game;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JButton;

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
		frame.setBounds(100, 100, 280, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[80px:n:80px,fill][80px:n:80px,fill][80px:n:80px,fill]", "[80px:n:80px,fill][80px:n:80px,fill][80px:n:80px,fill]"));
		
		JButton btnA1 = ButtonFactory.createJButton("A1");
		frame.getContentPane().add(btnA1, "cell 0 0,grow");
		
		JButton btnB1 = ButtonFactory.createJButton("B1");
		frame.getContentPane().add(btnB1, "cell 1 0,grow");
		
		JButton btnC1 = ButtonFactory.createJButton("C1");
		frame.getContentPane().add(btnC1, "cell 2 0,grow");
		
		JButton btnA2 = ButtonFactory.createJButton("A2");
		frame.getContentPane().add(btnA2, "cell 0 1,grow");
		
		JButton btnB2 = ButtonFactory.createJButton("B2");
		frame.getContentPane().add(btnB2, "cell 1 1,grow");
		
		JButton btnC2 = ButtonFactory.createJButton("C2");
		frame.getContentPane().add(btnC2, "cell 2 1,grow");
		
		JButton btnA3 = ButtonFactory.createJButton("A3");
		frame.getContentPane().add(btnA3, "cell 0 2,grow");
		
		JButton btnB3 = ButtonFactory.createJButton("B3");
		frame.getContentPane().add(btnB3, "cell 1 2,grow");
		
		JButton btnC3 = ButtonFactory.createJButton("C3");
		frame.getContentPane().add(btnC3, "cell 2 2,grow");
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewGame = new JMenu("New Game");
		menuBar.add(mnNewGame);
		
		JMenuItem mntmPlayerVsPlayer = new JMenuItem("Player vs Player");
		mnNewGame.add(mntmPlayerVsPlayer);
		
		JMenuItem mntmPlayerVsAi = new JMenuItem("Player vs AI");
		mnNewGame.add(mntmPlayerVsAi);
		
		JMenuItem mntmAiVsPlayer = new JMenuItem("AI vs Player");
		mnNewGame.add(mntmAiVsPlayer);
	}
}