package leetcode_problem_by_me;

public class monotonic_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,2,3};
//		int [] arr = {3,3,2,1,1};
//		int [] arr = {1,3,2};
		System.out.print(IS_monotoic(arr));
	}
	
	
	public static boolean IS_monotoic(int [] arr) {
		int l = arr.length;
		int asc = 0;
		int des = 0;
		for(int i = 0; i<l-1; i++) {
			if(arr[i]<=arr[i+1] && i<=i+1) {
				asc++;
				
			}
			if (arr[i]>=arr[i+1] && i<=i+1) {
				des++;
			}
		}
		System.out.println(asc);
		System.out.println(des);
		if(asc == l-1 || des == l-1) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
