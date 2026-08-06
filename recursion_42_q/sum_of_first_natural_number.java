package recursion_42_q;

public class sum_of_first_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q3. Sum of first N natural numbers 
//		Example: 
//		Input: N = 5 
//		Output: 15 
		
		int n = 5;
		System.out.print(sum(n,0));
	}
	
	public static int sum(int n, int ans) {
		if(n == 0) {
			return ans;
		}
		return sum(n-1, ans+n);
	}

}
