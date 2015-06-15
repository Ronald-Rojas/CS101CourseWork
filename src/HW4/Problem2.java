package HW4;

import java.util.Random;

public class Problem2 {
	public static void main(String [] args){
		int[] array = new int[20];
		Random rand = new Random();
		for( int i = 0; i< 20 ; i++){
			array[i] = rand.nextInt(50) + 1;
		}
		boolean noChange = false;
		while(!noChange){
			int firstNum;
			noChange = true;
			for( int i = 0; i<19; i++){
				if ( array[i]>array[i + 1]){
					firstNum = array[i];
					array[i] = array[i + 1];
					array[i + 1] = firstNum;
					noChange = false;
				}
			}
		}
		for( int i = 0; i < 20 ; i++){
			System.out.print(array[i] + " ");
		}
	}
}
