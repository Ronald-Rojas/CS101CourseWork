package HW3;

public class Problem533 {
	public static void main(String[] args){
		for(int num = 1; num < 10000; num ++){
			 int divisorTotal = 0;
			 for( int divisor = 1; divisor <= num / 2 ; divisor ++){
				 if( num % divisor == 0)
					 divisorTotal += divisor;
			 }
			 if(num == divisorTotal){
				 System.out.print(num + " ");
			 }
		}
	}
}
