package leetcode_problem_by_me;

public class search_insert_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,4,6};
		int n = 0;
		System.out.print(Search_insert_position(arr,n));
		
	}
	
	public static int Search_insert_position(int [] arr, int n) {
		int res = 0;
		for(int i = 0; i<arr.length; i++) {
			if(n<=arr[i]) {
				if(n==arr[i]) {
					res = i;
					break;
				}
				else {
					res = i;
					break;
				}
			}
		}
		
		if(n>arr[arr.length-1]){
            res = arr.length;
        }
        if(n<arr[0]){
            res = 0;
        }
		return res;
		
	}

}
