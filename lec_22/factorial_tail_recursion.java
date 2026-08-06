package lec_22;

public class factorial_tail_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int ans = 1;
		System.out.println(fac(n, ans));
	}
	
	public static int fac(int n, int ans) {
//		Base Case
		if(n == 0) {
			return ans;
		}
//		 tail  recursion
		return fac(n-1, ans*n);
	}
	
//	public static int fac(int n) {
////		Base Case
//		if(n == 0) {
//			return 1;
//		}
////		 Head_ recursion
//		return n* fac(n-1);
//	}

}
