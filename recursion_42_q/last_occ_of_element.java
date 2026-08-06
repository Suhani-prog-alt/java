package recursion_42_q;

public class last_occ_of_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q17. Last occurrence in array 
//		Example: 
//		Input: [1, 2, 3, 2], key = 2 
//		Output: index 3 

		int [] arr = {1,2,3,4,5,2};
		int key = 0;
		System.out.print(first(arr, 0, key, -1));
	}
	
	public static int first(int [] arr, int i, int key, int ans) {
		if(i == arr.length) {
			return ans;
		}
		if(arr[i] == key) {
			ans = i;
		}
		return first(arr, i+1, key, ans);
	}

}
