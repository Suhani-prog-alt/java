package lec13;

public class max_circular_sub_array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, -2,3,-2};
		Maximum_Circular_Sum(arr);
		
	}
	
	public static int Maximum_Circular_Sum(int [] arr) {
		int Linear_Maximum_Sum = Kadense_algorithm(arr);
		int total_sum = 0;
		for(int i = 0; i< arr.length; i++) {
			total_sum +=arr[i];
			arr[i] = arr[i] * -1;
		}
		int Circular_Sum = total_sum + Kadense_algorithm(arr);
		if(Circular_Sum == 0) {
			return Linear_Maximum_Sum;
		}
		return Math.max(Linear_Maximum_Sum, Circular_Sum);
		
	}
	public static int Kadense_algorithm(int [] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum+= arr[i];
			ans = Math.max(ans, sum);
			
			if(sum<0) {
				sum = 0;
			}
		}
		return ans;
	}
	
//	public static int Kadense_alg_min(int [] arr) {
//		int total_Sum = 0;
//		for(int i = 0; i<arr.length; i++) {
//			total_Sum += arr[i];
//		}
//		int ans = Integer.MIN_VALUE;
//		int sum = 0;
//		for(int i = 0; i<arr.length; i++) {
//			sum+= arr[i];
//			ans = Math.min(ans, sum);
//			
//			if(sum>0) {
//				sum = 0;
//			}
//		}
//		return ans + total_Sum;
//	}
	
	
}
