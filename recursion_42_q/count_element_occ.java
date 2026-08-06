package recursion_42_q;

public class count_element_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q15. Count element occurrences 
//		Example: 
//		Input: [1, 2, 2, 3], key = 2 
//		Output: 2 
		
		int [] arr = {1,2,2,2,3};
		int key = 2;
		System.out.println(count(arr, 0, key, 0));
	}
	
	public static int count(int [] arr, int i, int key, int c) {
		if(i == arr.length) {
			return c;
		}
		if(arr[i] == key) {
			c++;
		}
		return count(arr, i+1, key, c);
	}

}
