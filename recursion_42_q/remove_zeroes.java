package recursion_42_q;

public class remove_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q25. Remove zeros from number 
//		Example: 
//		Input: 1020 
//		Output: 12 
		
		int n = 1020;
		System.out.println(rem(n,0,1));
	}
	
	public static int rem(int n, int ans,int mul) {
		if(n == 0) {
			return ans;
		}
		
		if(n%10 == 0) {
			
		}
		else {
			ans = ans + (n%10)*mul;
			mul*=10;
		}
		
		return rem(n/10, ans,mul);
	}

}
