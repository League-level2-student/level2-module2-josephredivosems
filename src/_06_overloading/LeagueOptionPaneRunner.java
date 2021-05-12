package _06_overloading;

import javax.swing.JOptionPane;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
		LeagueOptionPane l = new LeagueOptionPane();
		String message = JOptionPane.showInputDialog("What message do you want for a popup?");
		l.showMessageDialog(message);
		String title = JOptionPane.showInputDialog("What title do you want for display?");
		message = JOptionPane.showInputDialog("What message do you want?");
		l.twoShowMessageDialogue(title, message);
		String fileName = JOptionPane.showInputDialog("Which image would you like to show?");
		title = JOptionPane.showInputDialog("What title do you want");
		message = JOptionPane.showInputDialog("What message do you want?");
		l.threeShowMessageDialogue(fileName, title, message);
	}
}
