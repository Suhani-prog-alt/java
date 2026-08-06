package recursion_42_q;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q5. Sum of digits 
//		Example: 
//		Input: N = 123 
//		Output: 6
		
		int n = 1235;
		System.out.println(sum(n, 0));
	}
	
	public static int sum(int n, int ans) {
		if(n == 0) {
			return ans;
		}
		
		return sum(n/10, ans+(n%10));
	}

}
