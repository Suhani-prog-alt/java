package recursion_42_q;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q8. Reverse a number 
//		Example: 
//		Input: N = 123 
//		Output: 321 
		
		int n = 12345;
		System.out.println(rev(n, 0));
	}
	
	public static int rev(int n, int sum) {
		if(n==0) {
			return sum;
		}
		
		return rev( n/10, sum* 10 + n%10 );
	}
}
