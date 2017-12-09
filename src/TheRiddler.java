import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		score++;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
	    String riddle = JOptionPane.showInputDialog("imagine you are in a dark room. How do you get out?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (riddle.equals ("stop imagining")) {
			JOptionPane.showMessageDialog(null, "correct! " + score + " point");
			score++;
		// 5. Otherwise, say "wrong" and tell them the answer
	} else {
		JOptionPane.showInputDialog("wrong, the answer is stop imagining");
	}
		// 6. Add some more riddles
		String walking = JOptionPane.showInputDialog("A girl who was just learning to drive went down a one-way street in the wrong direction, but didn't break the law.How come?");
		if (walking.equals ("she was walking")) {
			JOptionPane.showMessageDialog(null, "correct! " + score + " points");
			score ++;

		} else {
			JOptionPane.showInputDialog("wrong, the answer is she was walking");
		}
		String palm = JOptionPane.showInputDialog("What kind of tree can you carry in your hand?");
		if (palm.equals ("a palm")) {
			JOptionPane.showMessageDialog(null, "correct! " + score + " points");
			score ++;

		} else {
			JOptionPane.showInputDialog("wrong, the answer is a palm");

		}

		
		// 2. Make a pop up to show the score.
		int overall =  score - 1;
		JOptionPane.showMessageDialog(null, "you have " + overall + " points!");
		
	
}
}

