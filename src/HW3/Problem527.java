package HW3;

public class Problem527 {
	public static void main(String[] args){
		int leapCount = 0;
		for(int year = 101; year <= 2100; year++){
			if( year % 4 == 0){
				System.out.print(year + " ");
				leapCount ++;
				if(leapCount % 10 == 0){
					System.out.println();
				}
			}
		}
		System.out.println("The number of leap years in this time period is " + leapCount);
	}
}
