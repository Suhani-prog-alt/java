package lec8;
import java.util.*;
public class array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		
		int arr1[] =  new int[5]; // c type declaration
		System.out.println(arr);
		int [] other = arr;  // here only address will store
		System.out.println(arr.length);  // to find length of arr
		
		for (int i = 0; i<= 6; i++) {
			arr[i] = sc.nextInt();  // to take input
		}
	}

}
