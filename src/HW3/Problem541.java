package HW3;

import javax.swing.JOptionPane;

public class Problem541 {
	public static void main(String[] args){
		String numberList = JOptionPane.showInputDialog("Enter numbers: ");
		int max = 0;
		int count = 0;
		while(numberList.length()>1){
			String numStr = numberList.substring(numberList.length() - 1);
			numberList = numberList.substring(0, numberList.length() - 2);
			int num = Integer.parseInt(numStr);
			if(num > max){
				max = num;
				count = 1;
			}
			else if ( num == max){
				 count ++;
			}
		}
		System.out.println("The max number is " + max + " which occured " + count + " times.");
	}

}
