package lec13;

public class next_greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  arr = {1,2,3};
		permutation(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void permutation(int [] arr) {
		// step  find p
		int p = -1;
		for(int i = arr.length-2; i>=0; i--) {
			if(arr[i]<arr[i+1]) {
				p = i;
				break;
			}
		}
		if (p == -1) {
			Reverse_Range(arr, 0, arr.length-1);
		}
		// find q
		int q = -1;
		for (int i = arr.length-1; i>p; i--) {
			if(arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		// swap p and q
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		
		// reverse p+1 to n-1 index
		Reverse_Range(arr,p+1,arr.length-1);
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
