package HW4;

import java.util.Random;

public class Problem1 {
	public static void main(String[] args){
		Random rand = new Random();
		int[] array = new int[20];
		for(int i = 0; i <20; i++){
			int randNum = rand.nextInt(20) + 1;
			array[i] = randNum;
		}
		
		boolean repeats = true;
		int count = 0;
		while(repeats){
			reset();
			count++;
			boolean finished = true;
			for(int i = 0; i < 20; i++){
				if(foundNum[array[i] -1] == true ){
					int num = rand.nextInt(20) + 1;
					array[i] = num;
					finished = false;
				}
				foundNum[array[i] -1] = true;
				
			}
			if(finished == true){
				repeats = false;
			}
		}
		System.out.println("The number of repeats is " + count );
		for( int i = 0 ; i< 20 ; i++){
			System.out.print(array[i] + ", ");
		}
	}
	public static boolean[] foundNum = new boolean[20];
	public static void reset(){
		for( int i = 0; i< 20; i++ ){
			foundNum[i] = false;
		}
		
	}
}
