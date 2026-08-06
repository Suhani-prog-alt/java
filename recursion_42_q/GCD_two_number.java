package recursion_42_q;

public class GCD_two_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q22. GCD of two numbers 
//		Example: 
//		Input: a = 12, b = 18 
//		Output: 6
		
		int a = 20, b = 18;
		if(a>b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println(gcd(a,b));
	}
	
	public static int gcd(int a, int b) {
		if(b%a==0) {
			return a;
		}
		if(b%a!=0) {
			return gcd(b%a, a);
		}
		return 0;
	}

}
