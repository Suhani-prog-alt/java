package recursion_42_q;

public class check_inc_strickly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q35. Check strictly increasing 
//		Example: 
//		Input: [1, 2, 3] 
//		Output: True 
		
		int [] arr = {1,7, 2, 3};
		System.out.println(check(arr, 0));
	}
	
	public static String check(int [] arr, int i) {
		if(i == arr.length -1) {
			return "True";
		}
		
		if(arr[i]>arr[i+1]) {
			return "False";
		}
		
		return check(arr, i+1);
	}

}
