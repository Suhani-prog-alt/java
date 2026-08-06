package recursion_42_q;

public class product_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q7. Product of digits 
//		Example: 
//		Input: N = 234 
//		Output: 24 
		
		int n = 1234;
		System.out.println(product(n, 1));
	}
	
	public static int product(int n, int ans) {
		if(n == 0) {
			return ans;
		}
		return product(n/10, ans*(n%10));
	}

}
