package recursion_42_q;

public class print_arr_in_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q36. Print array in reverse 
//		Example: 
//		Input: [1, 2, 3] 
//		Output: 3 2 1
		
		int [] arr = {1,2,3};
		print(arr, arr.length -1);
	}
	
	public static void print(int [] arr, int j) {
		if(j == -1) {
			return;
		}
		System.out.print(arr[j] + " ");
		print(arr, j-1);
	}

}
