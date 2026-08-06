package recursion_42_q;

public class print_all_indexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q34. Print all indexes 
//		Example: 
//		Input: [1, 2, 2], key = 2 
//		Output: 1 2 
		
		int [] arr = {1,2,2};
		int key = 2;
		print_ind(arr, key,0);
	}
	
	public static void print_ind(int [] arr, int key, int i) {
		if(i == arr.length) {
			return;
		}
		
		if(arr[i] == key) {
			System.out.print(i + " ");
		}
		
		print_ind(arr, key, i+1);
	}

}
