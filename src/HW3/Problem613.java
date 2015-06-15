package HW3;

public class Problem613 {
	public static void main(String [] args){
		for(int i = 1 ; i <= 20; i++){
			System.out.println(i+ "     " + m(i));
		}
	}

	public static double m( int num){
		double total = 0;
		for(int i = 1 ; i <= 20 ; i++){
			total += (i/(i + 1)); 	
		}
		return total;
	}

}