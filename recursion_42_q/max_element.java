package recursion_42_q;

public class max_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q11. Maximum element in array 
//		Example: 
//		Input: [1, 5, 3] 
//		Output: 5
		
		int [] arr = {1,5,8,3};
		System.out.println(max(arr,0, arr[0]));
	}
	
	public static int max(int [] arr,int i,int item) {
		if(i == arr.length) {
			return item;
		}
		item = Math.max(arr[i], item);
		return max(arr, i+1, item);
	}

}
