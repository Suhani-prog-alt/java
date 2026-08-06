package leetcode_problem_by_me;

import java.util.Arrays;

public class two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,7,11,15};
		int n = 9;
		int [] result =  two_sum(arr,n);
		for (int i = 0; i< result.length; i++) {
			System.out.print(i +" ");
		}
		
	}
	
	public static int [] two_sum(int [] arr, int n){
		int len = arr.length;
		int [] a = new int [2];
		for (int i = 0; i<len; i++) {
			for (int j = i+1; j<len; j++) {
				if(arr[i]+arr[j]==n) {
					a[0] = i;
					a[1] = j;
					
				}
			}
		}
		return a;
	}

}
