package HW2;

import javax.swing.JOptionPane;

public class Problem221{
	public static void main(String[] args){
		String invValStr = JOptionPane.showInputDialog("what is the amount invested?");
		String annualRateStr = JOptionPane.showInputDialog("What is the annual interest rate in percentages?");
		String yearsStr = JOptionPane.showInputDialog("How many years are you investing?");
		double invVal = Double.parseDouble(invValStr);
		double annualRate = Double.parseDouble(annualRateStr);
		double monthlyRate = 1 + annualRate / 12/100;
		double years = Double.parseDouble(yearsStr);
		double endVal = invVal * Math.pow( monthlyRate, (years * 12));
		System.out.print("Accumulated value is $");
		System.out.printf("%.2f",endVal);
	}
}
