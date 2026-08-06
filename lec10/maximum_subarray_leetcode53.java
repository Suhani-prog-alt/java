package lec10;

public class maximum_subarray_leetcode53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.print(Maximum_Sum(arr));
		
	}
	
	public static int Maximum_Sum(int [] arr) {
		int ans = Integer.MIN_VALUE;
		int p = 0;
		int e = 0;
		for(int i = 0; i<arr.length; i++) {
			int sum = 0;
			for(int j = i; j<arr.length; j++) {
				sum = sum + arr[j];
				
				// it is used to print subarray also
				
//				if(ans < sum) {
//					p = i;
//					e = j;
//					ans = sum;
//					
//				}
				ans = Math.max(ans, sum);
			}
		}
		
//		This is used to print the sub array
//		for(int i = p; i<=e; i++) {
//			System.out.print(arr[i] + " ");
//		}
		System.out.println();
		return ans;
	}

}
