package recursion_42_q;

public class largest_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q38. Largest digit 
//		Example: 
//		Input: 492 
//		Output: 9 
		
		int n = 492;
		System.out.println(small(n,Integer.MIN_VALUE));
	}
	
	public static int small(int n, int sam) {
		if(n == 0) {
			return sam;
		}
		
		sam = Math.max(sam,  n%10);
		return small( n/10, sam );
	}

}
