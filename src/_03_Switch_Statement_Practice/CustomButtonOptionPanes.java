package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "The best and the worse day - right before Monday but the day where you have to do the least.");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "The worse day - consistently");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Better than Monday - usually");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "I'm halfway through the week");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "It's almost Friday");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Thank god school is over.");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "I wish I didn't have anything to do today.");
			break;
		}
	}
}
