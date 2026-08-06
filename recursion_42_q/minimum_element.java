package recursion_42_q;

public class minimum_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q12. Minimum element in array 
//		Example: 
//		Input: [1, 5, 3] 
//		Output: 1 
		
		int [] arr = {1,5,3,0};
		System.out.println(min(arr, 0, arr[0]));
	}
	
	public static int min(int [] arr, int i, int item) {
		if(i == arr.length) {
			return item;
		}
		item = Math.min(arr[i], item);
		return min(arr, i+1, item);
	}

}
