package HW1;

import javax.swing.JOptionPane;


public class Problem7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double pi;
		double subpi = 1.0;
		int accuracyNum = 6;
		int sign;
		double fraction;
		for(fraction = 2;fraction<=accuracyNum; fraction++){
			if(fraction % 2 == 1){
				sign = 1;
			}else sign = -1;
			subpi += 1.0 / (fraction*2-1) * sign;
		}
		pi = 4*subpi;
		JOptionPane.showMessageDialog(null, pi);
		accuracyNum = 7;
		subpi = 1.0;
		for(fraction = 2;fraction<=accuracyNum; fraction++){
			if(fraction % 2 == 1){
				sign = 1;
			}else sign = -1;
			subpi += 1.0 / (fraction*2-1) * sign;
		}
		pi = 4 * subpi;
		JOptionPane.showMessageDialog(null, pi);
		
	}

}
