package HW2;

import javax.swing.JOptionPane;

public class Problem27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String minstr = JOptionPane.showInputDialog("What is the number of minutes?");
		long min = Long.parseLong(minstr);
		long years = min/60/24/365;
		long days = (min/60/24)%365;
		JOptionPane.showMessageDialog(null, min + " minutes is approximetly " + years + " years and " + days + " days");

	}

}
