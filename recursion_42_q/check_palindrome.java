package recursion_42_q;

public class check_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q9. Check palindrome number 
//		Example: 
//		Input: N = 121 
//		Output: True
		
		int n = 2342;
		System.out.println(palindrome( n,n, 0));

	}
	
	public static boolean palindrome(int m,int n, int sum) {
		if(n == 0) {
			if(m == sum) {
				return true;
			}else {
				return false;
			}
		}
		return palindrome(m ,n/10, sum*10 + n%10);
	}

}
