package recursion_42_q;

public class print_arr_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q18. Print array elements 
//		Example:
//		Input: [1, 2, 3] 
//		Output: 1 2 3 
		
		int [] arr = {1,2,4};
		print(arr, 0);
	}
	
	public static void print(int [] arr, int i) {
		if(i == arr.length) {
			return ;
		}
		
		System.out.println(arr[i]);
		print(arr, i+1);
	}

}
