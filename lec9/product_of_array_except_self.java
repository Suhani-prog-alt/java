package lec9;

public class product_of_array_except_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4};
		
		int [] result = Product_of_Array(arr);
		for(int i = 0; i<result.length ; i++) {
			System.out.print(result[i] + " ");
		}
		
		// this will return its address
//		System.out.print(Product_of_Array(arr));
		
	}
	
	public static int []Product_of_Array (int[] arr){
		int n = arr.length;
		
		//preffixing produt
		int [] left = new int [n];
		left[0] = 1;
		for (int i = 1; i<n; i++) {
			left[i] = left[i-1]*arr[i-1];
		}
		
		// suffixing product
		int [] right = new int [n];
		right[n-1] = 1;
		for (int i = n-2; i>=0; i--) {
			right[i] = right[i+1]*arr[i+1];
		}
		
		// product of two array
		for(int i = 0; i<n; i++) {
			arr[i] = left[i]*right[i];
		}
		
		return arr;
		
	}

}
