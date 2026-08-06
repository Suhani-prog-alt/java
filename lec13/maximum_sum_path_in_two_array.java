package lec13;

import java.util.Scanner;

public class maximum_sum_path_in_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr1 = new int [n];
		int [] arr2 = new int [m];
		for(int i = 0; i<n; i++) {
			arr1[i] = sc.nextInt(i);
		}
		for(int i = 0; i<m; i++) {
			arr2[i] = sc.nextInt(i);
		}
		
	}
	
	public static int Maximum_Sum_path(int [] arr1, int [] arr2) {
		int i = 0, j = 0, p = 0, q =0;
		int ans = 0;
		while(i <arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr1[i] > arr2 [j]) {
				j++;
			}
			else {
				int sum1 = 0;
				for(int k = p; k<=i; k++) {
					sum1+=arr1[k];
				}
				int sum2 = 0;
				for(int k = q; k<=j; k++) {
					sum2 += arr2[k];
				}
				ans += Math.max(sum1, sum2);
				i++;
				j++;
				p = i;
				q = j;
			}
		}
		
		int sum1 = 0;
		while(p<arr1.length) {
			sum1 += arr1[p];
			p++;
		}
		int sum2 = 0;
		while(q<arr2.length) {
			sum2 += arr2[q];
			q++;
		}
		ans+= Math.max(sum1, sum2);
		return ans;
	}

}
