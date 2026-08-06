package recursion_42_q;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q10. Power a^b 
//		Example: 
//		Input: a = 2, b = 4 
//		Output: 16 
		
		int a = 2;
		int pow = 3;
		System.out.println(powe(a, pow));
	}
	
	public static int powe(int n, int pow) {
		if(pow == 0) {
			return 1;
		}
		int f = powe(n, pow -1);
		return f*n;
	}

}
