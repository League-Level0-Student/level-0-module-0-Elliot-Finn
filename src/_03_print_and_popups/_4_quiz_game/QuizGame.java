package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero.
		int variable = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		if(JOptionPane.showInputDialog("aren't you just my skibidiest sigma?").equals("si")) {
				// 2.  Ask the user a question 
				String one = JOptionPane.showInputDialog("if a quiz");
				// 3.  Use an if statement to check if their answer is correct
				if(one.equals("is quizzical")) {
					String answer = JOptionPane.showInputDialog("I LOVE YOU SO MUCH");
					for(int x=1000;x>0;x++) {
						System.out.print(answer);
					}
					
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}else {
		System.out.print("I just want to be your sigma....");
	}
}
}
