package HW2;

import javax.swing.JOptionPane;

public class Problem333 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String weight1str = JOptionPane.showInputDialog("what is the weight of the first package?");
		String price1Str = JOptionPane.showInputDialog("What is the price of the first package?");
		String weight2Str = JOptionPane.showInputDialog("What is the weight of the second package?");
		String price2Str = JOptionPane.showInputDialog("What is the price of the second package?");
		double weight1 = Double.parseDouble(weight1str);
		double price1 = Double.parseDouble(price1Str);
		double weight2 = Double.parseDouble(weight2Str);
		double price2 = Double.parseDouble(price2Str);
		double pricePerPound1 = price1/weight1;
		double pricePerPound2 = price2/weight2;
		if(pricePerPound1 < pricePerPound2){
			JOptionPane.showMessageDialog(null, "Package 1 has the better price");
			
		}
		else{
			JOptionPane.showMessageDialog(null, "Package 2 has the better price");
		}
	}

}
