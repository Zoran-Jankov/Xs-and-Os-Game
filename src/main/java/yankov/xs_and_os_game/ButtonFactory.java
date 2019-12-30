package main.java.yankov.xs_and_os_game;
import javax.swing.JButton;

public final class ButtonFactory
{
	/**
	 * @wbp.factory
	 */
	public static JButton createJButton(String text)
	{
		JButton button = new JButton();
		return button;
	}
}