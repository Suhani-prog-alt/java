package recursion_42_q;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q4. Factorial of N 
//		Example: 
//		Input: N = 5 
//		Output: 120 
		
		int n = 5;
		System.out.println(fib(n,1));
	}
	
	public static int fib(int n, int ans) {
		if(n == 1) {
			return ans;
		}
		
		return fib(n-1, ans*n);
	}

}
