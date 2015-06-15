package HW3;

import java.util.Random;

import javax.swing.JOptionPane;

public class Problem617 {
	public static void printMatrix(int n){
		for(int i = 0; i < n ; i++){
			for(int  j = 0; j < n; j++){
				Random rand = new Random();
				int element = rand.nextInt(2);
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
	public static void main(String [] args ){
		String numStr = JOptionPane.showInputDialog("What is the size of the matrix");
		int num = Integer.parseInt(numStr);
		printMatrix(num);
	}
	
}