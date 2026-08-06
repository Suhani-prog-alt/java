package lec_22;

public class First_Occr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,3,2,3,2};
		int item = 4;
		int a = 0;
		System.out.println(first(arr, item, a));
	}
	
	public static int first(int [] arr, int i, int a) {
		if(a == arr.length) {
//			negative base case
			return -1;
		}
		
		if(arr[a] == i) {
//			positive base case
			return a;
		}
		
		return first(arr, i, a+1);
	}

}
