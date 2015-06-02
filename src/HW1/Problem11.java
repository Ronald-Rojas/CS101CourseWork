package HW1;

import javax.swing.JOptionPane;


public class Problem11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int years = 5;
		long yearsToSec = 365*24*60*60;
		long births, deaths, immigrants;
		long pop;
		final int birthRate = 7;
		final int deathRate = 13;
		final int immigrantRate = 45;
		final long popInitial = 312032486;
		for( int numYears = 0; numYears <=years; numYears++){
			pop = popInitial;
			births = numYears * yearsToSec/birthRate;
			deaths = numYears * yearsToSec/deathRate;
			immigrants = numYears * yearsToSec/immigrantRate;
			pop += births + immigrants - deaths;
			JOptionPane.showMessageDialog(null, "The population will be " + pop + " people in " + numYears + " years");
		}
	}

}
