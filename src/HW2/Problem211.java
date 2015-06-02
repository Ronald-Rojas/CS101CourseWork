package HW2;

import javax.swing.JOptionPane;

public class Problem211 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String yearsStr = JOptionPane.showInputDialog("What is the number of years");
		int years = Integer.parseInt(yearsStr);
		long yearsToSec = 365*24*60*60;
		long births, deaths, immigrants;
		long pop = 0;
		final int birthRate = 7;
		final int deathRate = 13;
		final int immigrantRate = 45;
		final long popInitial = 312032486;
		int numYears;
		for( numYears = 0; numYears <=years; numYears++){
			pop = popInitial;
			births = numYears * yearsToSec/birthRate;
			deaths = numYears * yearsToSec/deathRate;
			immigrants = numYears * yearsToSec/immigrantRate;
			pop += births + immigrants - deaths;
			
		}
		numYears --;
		JOptionPane.showMessageDialog(null, "The population will be " + pop + " people in " + numYears + " years");
	}

}
