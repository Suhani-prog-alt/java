package lec8;

public class Reverse_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,2,2,4,53,34,53,8,6,22,12,13,56};
		Reverse_Range(arr, 3, 11);
		for(int i = 0; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void Reverse_Range(int [] arr, int i, int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
