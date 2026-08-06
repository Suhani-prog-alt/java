package lec_19;

public class Subarray_Product_Less_Than_K_713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10, 5, 2, 6};
		int k = 10;
	}
	
	public static int Product_Less_Than_K(int [] arr, int k) {
		int si = 0;
		int ei = 0;
		int p = 1;
		int ans = 0;
		while(ei<arr.length) {
			// window grow
			p*=arr[ei];
			
			// maximum_Sum
			while(p>=k && si<=ei) {
				p = p/arr[si];
				si++;
			}
			
			// answer update
			ans = ans + (ei-si+1);
			ei++;
		}
		return ans;
	}

}
