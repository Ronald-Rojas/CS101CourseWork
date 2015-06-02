package HW1;

import javax.swing.JOptionPane;


public class Problem9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double width = 4.5;
		double height = 7.9;
		double area = width * height;
		double perm = (width + height) * 2;
		String permAnswer = "The perimeter of the rectangle is "+ perm;
		//For some reason the area calculated is correct except it is of by extremely small .000000004
		String areaAnswer = "The area of the rectangle is " + area;
		JOptionPane.showMessageDialog(null, permAnswer);
		JOptionPane.showMessageDialog(null, areaAnswer);

	}

}
