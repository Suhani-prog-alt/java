package recursion_42_q;

public class smallest_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q37. Smallest digit 
//		Example: 
//		Input: 492 
//		Output: 2 
		
		int n = 492;
		System.out.println(small(n,Integer.MAX_VALUE));
	}
	
	public static int small(int n, int sam) {
		if(n == 0) {
			return sam;
		}
		
		sam = Math.min(sam,  n%10);
		return small( n/10, sam );
	}

}
