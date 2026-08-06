package lec_22;

public class sum_of_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(sum(n));
	}
	
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		int f = sum(n-1);
		return f+n;
	}
	
//	public static int sum(int n) {
//		if(n==1) {
//			return 1;
//		}
//		int f = sum(n-1);
//		return f+n;
//	}

}
