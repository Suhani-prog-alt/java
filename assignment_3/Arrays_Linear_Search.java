package assignment_3;
import java.util.*;
public class Arrays_Linear_Search {
	
//	Take as input N, the size of an array. Take N more inputs and store that in an array. Take another number’s input as M. Write a function which returns the index on which M is found in an array, in case M is not found -1 is returned. Print the value returned.
//
//	It reads a number N.
//	2.Take Another N numbers as an input and store them in an Array.
//	Take another number M as an input.
//	If M is found in the Array the index of M is returned else -1 is returned and print the value returned.
//
//	Input Format
//
//	Constraints
//	N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000. M can be between -1000000000 to 1000000000.
//
//
//	Output Format
//
//	Sample Input
//	5
//	2
//	4
//	6
//	9
//	17
//	17
//	Sample Output
//	4
//	Explanation
//	Given array = {2, 4, 6, 9, 17}. Target number = 17. Index = 4.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int find_index_of = sc.nextInt();

        System.out.print(linear_search(arr, find_index_of));

	}

	public static int linear_search(int [] arr,int index_of){
        for (int i = 0; i<arr.length ; i++){
            if(arr[i] == index_of){
                return i;
            }
        }
        return -1;
    }
}
