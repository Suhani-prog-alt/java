package recursion_42_q;

public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q21. Check prime 
//		Example: 
//		Input: N = 7 
//		Output: True 
		
		int n = 7;
		System.out.println(prime(n,2, 0));
	}
	
	public static boolean prime(int n,int div, int c ) {
		if(div == 7) {
			if(c == 0) {
				return true;
			}else {
				return false;
			}
		}
		if(n%div == 0) {
			c++;
		}
		
		return prime(n, div+1, c);
	}

}
