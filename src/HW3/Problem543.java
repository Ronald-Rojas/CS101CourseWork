package HW3;

public class Problem543 {
	public static void main(String [] args){
		int count = 0;
		for( int num1 = 1; num1 <= 7; num1++){
			
			for(int num2 = num1 + 1; num2 <= 7; num2 ++){
				System.out.println( num1 + " " + num2);
				count ++;
			}
		}
		System.out.println("The total number of all combinations is : " + count);
	}
	
}
