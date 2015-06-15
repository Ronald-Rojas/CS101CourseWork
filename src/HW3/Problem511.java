package HW3;

public class Problem511 {

	public static void main(String[] args) {
		int count = 0;
		for( int num = 100; num<=200; num++){
			
			if(num % 5 == 0){
				if(num % 6 != 0){
					System.out.print(num + " ");
					count ++;
				}
			}
			else if( num % 6 == 0){
				System.out.print(num + " ");
				count ++;
			}
			if( count == 10){
				System.out.println();
				count = 0;
			}
		}

	}

}
