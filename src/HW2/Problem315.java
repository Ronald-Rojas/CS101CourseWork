package HW2;

import java.util.Random;

import javax.swing.JOptionPane;

public class Problem315 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String numStr = JOptionPane.showInputDialog("What are the three lottery numbers?");
		String num1Str = numStr.substring(0,1);
		String num2Str = numStr.substring(1,2);
		String num3Str = numStr.substring(2);
		int num = Integer.parseInt(numStr);
		int num1 =Integer.parseInt(num1Str);
		int num2 = Integer.parseInt(num2Str);
		int num3 = Integer.parseInt(num3Str);
		Random rand = new Random();
		int lotNum1 = rand.nextInt(10) ;
		int lotNum2 = rand.nextInt(10) ;
		int lotNum3 = rand.nextInt(10) ;
		int lotNumTotal = lotNum1 * 100 + lotNum2 * 10 + lotNum3;
		int numCorrect = 0;
		if(num1 == lotNum1 || num1 == lotNum2 || num1 == lotNum3) numCorrect ++;
		if(num2 == lotNum1 || num2 == lotNum2 || num2 == lotNum3) numCorrect ++;
		if(num3 == lotNum3 || num3 == lotNum3 || num3 == lotNum3) numCorrect ++;
		if(lotNumTotal == num){
			JOptionPane.showMessageDialog(null, "You won the $10,000 lottery!");
		}
		else if(numCorrect == 3){
			JOptionPane.showMessageDialog(null, "You won the $3,000 lottery");
		}
		else if(numCorrect == 1){
			JOptionPane.showMessageDialog(null, "You won the $1,000 lottery");
		}
		else{
			JOptionPane.showMessageDialog(null, "Too bad, you got all the numbers wrong");
		}
	}

}
