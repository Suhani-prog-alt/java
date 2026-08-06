package recursion_42_q;

public class print_Number_N_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q2. Print numbers from N to 1 
//		Example: 
//		Input: N = 5 
//		Output: 5 4 3 2 1 
		
		int n = 5;
		print(n);
	}
	
	public static void print(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		print(n-1);
	}

}
