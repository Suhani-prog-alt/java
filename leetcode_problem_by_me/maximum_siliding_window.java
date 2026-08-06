package leetcode_problem_by_me;

import java.util.*;
public class maximum_siliding_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {9,11};
		int k = 2;
		maxSlidingWindow(nums, k);
	}
	
	public static void maxSlidingWindow(int[] nums, int k) {
        if(nums.length <=k) return nums;
        int n = nums.length-k+1;
        int [] arr = new int [n];
        
        for(int i = 0; i<arr.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j =i; j<i+k; j++){
                max = Math.max(max, nums[j]);
            }
            arr[i] = max;
        }
        for(int i = 0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
    }
}
