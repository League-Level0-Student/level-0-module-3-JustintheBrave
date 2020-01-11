package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String Question = JOptionPane.showInputDialog("Are you happy?") ;
		if(Question.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing!");
		}
		else if (Question.equalsIgnoreCase("no")) {
		String Quest = JOptionPane.showInputDialog("Do you want to be happy?");
		
		if(Quest.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Change something");
			
		}
		else if(Quest.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null,"Keep doing what you're doing");
	}
		
		
		
		
		
		
		
	}

	}
}
