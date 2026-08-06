package assignment_3;

import java.util.*;

public class Inverse_of_an_array {
	
//	Take as input N, a number. Take N more inputs and store that in an array. Write a recursive function which inverses the array. Print the values of inverted array
//
//
//	Input Format
//	Enter a number N and take N more inputs
//
//
//	Constraints
//	None
//
//
//	Output Format
//	Display the values of the inverted array in a space separated manner
//
//
//	Sample Input
//	5
//	0 2 4 1 3
//	Sample Output
//	0 3 1 4 2
//	Explanation
//	Swap element with index
//
//	for eg : element 4 at index 2 becomes element 2 at index 4
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int [] arr2 = Inverse(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr2[i] + " ");
        }
	}
	
	public static int [] Inverse(int [] arr){
        int sum = 0;
        int l = arr.length;
        int [] arr2 = new int [l];
        for (int i = 0; i<arr2.length; i++){
            arr2[arr[i]] = i;
        }
        return arr2;
    }

}
