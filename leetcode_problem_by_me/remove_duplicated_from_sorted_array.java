package leetcode_problem_by_me;

public class remove_duplicated_from_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,0,1,1,1,2,2,3,3,4};
		System.out.print(Remove_duplicate(arr));
	}
	
	public static int Remove_duplicate(int [] arr){
		int len = arr.length;
		int [] a = new int [len];
		int j = 0;
		a[0] = arr[0];
		for(int i = 1; i<len; i++) {
			if(a[j]!=arr[i]) {
				j++;
				a[j] = arr[i];
			}
		}
		System.out.println(j);
		
		
//		for(int k = j+1; k<len;k++ ) {
//			a[k] = -1;
//		}
		return j+1;
		
	}

}
