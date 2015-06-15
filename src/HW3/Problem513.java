package HW3;

public class Problem513 {
	public static void main(String[] args){
		int n = 1;
		boolean numFound = false;
		while(!numFound){
			int testNum = n * n * n;
			if(testNum > 12000){
				numFound = true;
				System.out.println("The largest n with n cubed less than 12000 is " + n);
			}
			else{
				n++;
			}
		}
		
	}
}
