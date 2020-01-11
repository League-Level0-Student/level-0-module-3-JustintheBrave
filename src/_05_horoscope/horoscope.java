package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String bday = JOptionPane.showInputDialog("Whats your star sign?");
	if(bday.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null, "You are forward thinking, communicative, people oriented, stubborn, generous, and dedicated");
	}
	else if(bday.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "you are courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
	}
	else if(bday.equalsIgnoreCase("Tauros")) {
		JOptionPane.showMessageDialog(null, "you are pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.\n" + 
				"");
	}
	else if(bday.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "you are cerebral, chatty, loves learning and education, charming, and adventurous.");
	}
		
		
		
		
		
	}

}
