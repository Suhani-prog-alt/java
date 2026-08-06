package recursion_42_q;

public class first_occ_in_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q16. First occurrence in array 
//		Example: 
//		Input: [1, 2, 3, 2], key = 2 
//		Output: index 1 
		
		int [] arr = {1,2,3,4,5,2};
		int key = 2;
		System.out.print(first(arr, 0, key));
	}
	
	public static int first(int [] arr, int i, int key) {
		if(i == arr.length) {
			return -1;
		}
		if(arr[i] == key) {
			return i;
		}
		return first(arr, i+1, key);
	}

}
