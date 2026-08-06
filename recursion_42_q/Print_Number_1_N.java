package recursion_42_q;

public class Print_Number_1_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q1. Print numbers from 1 to N 
//		Example: 
//		Input: N = 5 
//		Output: 1 2 3 4 5 
		
		int n = 5;
		print(n);
		
	}
	
	public static void print(int n) {
		if(n == 0) {
			return;
		}
		
		print(n-1);
		System.out.println(n);
	}

}
