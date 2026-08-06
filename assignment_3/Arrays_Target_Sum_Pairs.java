package assignment_3;
import java.util.*;
public class Arrays_Target_Sum_Pairs {

//	Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.
//
//
//	Input Format
//	The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.
//
//
//	Constraints
//	Length of the arrays should be between 1 and 1000.
//
//
//	Output Format
//	Print all the pairs of numbers which sum to target. Print each pair in increasing order.
//
//
//	Sample Input
//	5
//	1
//	3
//	4
//	2
//	5
//	5
//	Sample Output
//	1 and 4
//	2 and 3
//	Explanation
//	Find any pair of elements in the array which has sum equal to target element and print them.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        Target_sum(arr, sum);

	}
	
	public static void Sort(int [] arr) {
		for (int turn = 1; turn<arr.length; turn++) {
			for(int i = 0; i< arr.length - turn;i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	
	public static void Target_sum(int [] arr, int sum){
        Sort(arr);
        for(int i = 0; i<arr.length -1; i++){
            for(int j = i+1; j<arr.length ; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }
    }

}
