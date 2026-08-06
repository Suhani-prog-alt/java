package recursion_42_q;

public class sum_array_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q13. Sum of array elements 
//		Example: 
//		Input: [1, 2, 3] 
//		Output: 6 
		
		int [] arr = {1,2,3};
		System.out.println(sum(arr,0,0));
	}
	public static int sum(int [] arr, int i, int ans) {
		if(i == arr.length) {
			return ans;
		}
		
		return sum(arr, i+1, ans+arr[i]);
	}
}
