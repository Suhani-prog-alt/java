package recursion_42_q;

public class check_array_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q14. Check array sorted 
//		Example: 
//		Input: [1, 2, 3] 
//		Output: True 
		
		int [] arr = {1,2,3};
		System.out.println(sort(arr,0));
	}
	
	public static boolean sort(int [] arr, int i) {
		if(i == arr.length -1) {
			return true;
		}
		if(arr[i]> arr[i+1]) {
			return false;
		}
		return sort(arr, i+1);
	}

}
