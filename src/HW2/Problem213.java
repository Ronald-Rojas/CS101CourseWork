package HW2;

import javax.swing.JOptionPane;

public class Problem213 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String savingAmountStr = JOptionPane.showInputDialog("How much are you going to save each month?");
		long savingAmount = Long.parseLong(savingAmountStr);
		double total = 0;
		final double monthlyRate = 1 + .05/12;
		for(int i = 0; i<6; i++){
			total += savingAmount;
			total *= monthlyRate;
		}
		System.out.printf("%.2f", total);
	}

}
