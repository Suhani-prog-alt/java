package lec8;

public class array_swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []  arr = {10, 20, 30, 40};  // syntax
//		int []  arr1 = new int[] {10, 20, 30, 40};  // syntax
		
		int []  arr = {10, 20, 30, 40};
		System.out.println(arr[0]+ " " + arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " "+ arr[1]);
	}
	
	public static void Swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
