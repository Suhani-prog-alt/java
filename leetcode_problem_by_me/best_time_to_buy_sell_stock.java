package leetcode_problem_by_me;

public class best_time_to_buy_sell_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [] arr = {7,1,5,3,6,4};
		int [] arr = {7,6,4,3,1};
		System.out.print(Best_time_for_profit(arr));
		
	}
	
	public static int Best_time_for_profit(int [] arr) {
		int n = arr.length;
		int [] left = new int [n];
		left [0] = arr[0];
		for(int i = 1; i<n; i++) {
			left[i] = Math.min(left[i-1], arr[i]);
		}
		
		int last = left [n-1];
		int index = 0;
		for (int i = 0; i<n; i++) {
			if(left[i] == last) {
				index = i;
				break;
			}
		}
		
		int [] right = new int [n] ;
		right[n-1] = arr[n-1];
		for(int i = n-2; i>=index ; i--) {
			right[i] = Math.max(right[i+1],arr[i]);
		}
		
		int min = Min_num(left);
		int max = Max_num(right);
		
		return max-min;
	}
	
	public static int Min_num(int [] left) {
		int min = left[0];
		for(int i = 1; i<left.length ; i++) {
			min = Math.min(left[i-1], left[i]);
		}
		return min;
	}
	public static int Max_num(int [] right) {
		int max = right[0];
		for(int i = 1; i<right.length ; i++) {
			max = Math.max(right[i-1], right[i]);
		}
		return max;
	}

}
