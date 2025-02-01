package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("if a quiz is quizzical");
		if(input.equals("yes")) {
			JOptionPane.showInputDialog("if a quiz is quizzical");
		} else {
			JOptionPane.showInputDialog("screw you");
		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, tell them to sign up for classes at The League.
		}
	}
}

