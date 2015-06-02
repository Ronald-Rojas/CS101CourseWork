package HW2;

import javax.swing.JOptionPane;

public class Problem331 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String rateStr = JOptionPane.showInputDialog("What is the current exchange rate from US dollars to Chinese RMB?");
		double rate = Double.parseDouble(rateStr);
		String convert = JOptionPane.showInputDialog("Enter \"0\" to convert from US dollars to Chinese RMB or \"1\" to convert from Chinese RMB to US dollars");
		String amountStr = JOptionPane.showInputDialog("Enter the amount that you are converting ");
		double amount = Double.parseDouble(amountStr);
		double total = 0;
		if(convert.equals("0")) {
			total = amount * rate;
			System.out.print("$" + amount + " is ");
			System.out.printf("%.2f", total);
			System.out.print(" yuan");
		}else{
			total = amount / rate;
			System.out.print( amount + " yuan is $");
			System.out.printf("%.2f", total);
		}
		
	}

}
