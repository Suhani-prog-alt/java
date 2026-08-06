package recursion_42_q;

public class LCM_two_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q23. LCM of two numbers 
//		Example: 
//		Input: a = 4, b = 6 
//		Output: 12
		
		int a = 4, b = 6;
		if(a>b) {
			int temp = a;
			a = b; 
			b = temp;
		}
		System.out.println(lcm(a,b,b));
	}
	
	public static int lcm(int a, int b,int ans) {
		if(ans%a==0 && ans%b==0) {
			return ans;
		}
		
		return lcm(a,b,ans+1);
	}
}
