package recursion_42_q;

public class count_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q26. Count zeros in number 
//		Example: 
//		Input: 10020 
//		Output: 3 
		
		int n = 10020;
		System.out.println(count_zero(n,0));
	}
	
	public static int count_zero(int n, int c) {
		if(n==0) {
			return c;
		}
		
		if(n%10 == 0) {
			c++;
		}
		return count_zero(n/10, c);
	}

}
