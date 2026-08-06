package lec8;

public class arr_swap_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []  arr = {10, 20, 30, 40};
		int [] other = {1,2,3,4,5};
		System.out.println(arr[0]+ " " + other[0]);
		Swap(arr, other);
		System.out.println(arr[0] + " "+ other[0]);
	}
	
	public static void Swap(int []arr,int [] other) {
		int[] temp = arr;
		arr = other;
		other = temp;
	}

}
