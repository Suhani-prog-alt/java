package recursion_42_q;

public class digital_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q27. Digital root 
//		Example:
//		Input: 987 
//		Output: 6 
		 
		int n = 987;
		System.out.println(digitalroot(n, 0));
	}
	
	public static int digitalroot(int n , int c) {
		if(n == 0 && c<10) {
			return c;
		}
		if(n == 0) {
			return digitalroot(c,0);
		}
		
		c = c+(n%10);
		
		return digitalroot(n/10, c);
	}

}
