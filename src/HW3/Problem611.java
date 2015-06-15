package HW3;

import javax.swing.JOptionPane;

public class Problem611 {
	public static void main(String[] args){
		String numStr =JOptionPane.showInputDialog("How many sales numbers will you input?");
		int num = Integer.parseInt(numStr);
		
		for(int i = 0; i<num ; i++ ){
			String salesAmountStr = JOptionPane.showInputDialog("Input a sales amount: " );
			double salesAmount = Double.parseDouble(salesAmountStr);
			double commission = computerCommission(salesAmount);
			System.out.println(salesAmount + "     " + commission);
		}
				//loop through and add formatting 
	}
	public static double computerCommission(double salesAmount){
		double commission = 0;
		if(salesAmount >10000){
			commission = 5000 * 0.1;
			commission += 5000 * 0.08;
			salesAmount -= 10000;
			commission += salesAmount * 0.12;
			 
		}
		else if(salesAmount > 5000){
			commission = 5000 * 0.08;
			salesAmount -= 5000;
			commission += salesAmount * 0.1;
		}
		else {
			commission = salesAmount * 0.08;
		}
		
		
		
		return commission;
	}
}
