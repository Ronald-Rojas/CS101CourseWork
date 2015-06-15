package HW4;

import java.util.Random;

public class Problem3 {
	public static void main(String[] args){
		for(int i = 0; i< 52; i++){
			deck[i] = false;
		}
	
	
	}
	public static void nextHand(){
		for(int i = 0; i < 5; i++){
			Random rand = new Random();
			boolean picked = false;
			while(picked){
				int num = rand.nextInt(52) + 1;
				if(deck[i] == false){
					
				}
			}
		}
	}
	public static boolean[] deck = new boolean[52];
	
}
