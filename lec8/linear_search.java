package lec8;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,3, 4, 5, 7, 9};
		int item = 6;
		System.out.println(Search(arr,item));
	}
	public static int Search(int[] arr, int item) {
		for (int i = 0; i< arr.length; i++) {
			if (item == arr[i]) {
				return i;
			}
		}
		return -1;	
	}
	
}
