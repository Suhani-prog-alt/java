package lec8;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,7,8,9,34};
		Reverse(arr);
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void Reverse(int [] arr) {
		int len = arr.length - 1;
		for(int i = 0; i<=(arr.length)/2; i++) {
			int temp = arr[i];
			arr[i] = arr[len];
			arr[len] = temp;
			len--;
		}
	}
	
	public static void Reverse1(int [] arr) {
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
