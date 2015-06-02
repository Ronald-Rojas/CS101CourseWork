package HW2;

import javax.swing.JOptionPane;

public class Problem217 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String tempStr = JOptionPane.showInputDialog("What is the temperature outside?");
		String speedStr = JOptionPane.showInputDialog("What is the wind speed?");
		double temp = Double.parseDouble(tempStr);
		double speed = Double.parseDouble(speedStr);
		final double constant = 35.74, tempMult = 0.6215, speedMult = 35.75, extraMult = 0.4275;
		double chillIndex = constant + (tempMult * temp) - (speedMult * Math.pow(speed, 0.16)) + (extraMult * temp * Math.pow(speed, 0.16));
		JOptionPane.showMessageDialog(null, "The wind chill index is: " + chillIndex);
		System.out.print("The wind chill index is : ");
		System.out.printf("%.5f", chillIndex);
	}

}
