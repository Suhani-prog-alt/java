package recursion_42_q;

public class sum_of_even_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q24. Sum of even digits 
//		Example: 
//		Input: 1234 
//		Output: 6 
		
		int n = 1234;
		System.out.println(sum(n,0));
	}
	
	public static int sum(int n, int c){
		if(n == 0) {
			return c;
		}
		if((n%10)%2==0) {
			c+=(n%10);
		}
		return sum(n/10, c);
	}

}
