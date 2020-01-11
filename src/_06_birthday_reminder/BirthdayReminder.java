
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "February 27th";
		String dadsBirthday = "June 11th";
		String myBirthday = "January 30th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String want = JOptionPane.showInputDialog("do you want my mom, dad, or my birthday?");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			if(want.equalsIgnoreCase("mom")) {
				System.out.println(momsBirthday);
			}
	
			//print mom's birthday
		// 5. if user asked for "dad"
			else if(want.equalsIgnoreCase("dad")) {
				System.out.println(dadsBirthday);
			}
			// print dad's birthday
		// 6. if user asked for your name
			else if(want.equalsIgnoreCase("yours")) {
				System.out.println(myBirthday);
			}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			else if(want.equalsIgnoreCase("")) {
				System.out.println("Sorry, i don't remember that person's birthday!");
			}
	} 
}
