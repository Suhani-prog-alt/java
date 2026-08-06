package recursion_42_q;

public class count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q6. Count digits 
//		Example: 
//		Input: N = 9876 
//		Output: 4
		
		int n = 12345;
		System.out.println(count(n, 0));
	}
	
	public static int count(int n, int ans) {
		if(n == 0) {
			return ans;
		}
		
		return count(n/10, ans+1);
	}

}
